package mcframe.clientMABC.MABCP0810;

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
import mcframe.clientMABC.MABCP0810.MABCP_NumPtnReg_MC.MA_MABCL0810_Srch01Caller;
import mcframe.clientMABC.MABCP0810.MABCP_NumPtnReg_MC.MA_MABCL0810_Upd01Caller;
import mcframe.clientMABC.MABCP0810.MABCP_NumPtnReg_MC.MA_MABCL0810_Del01Caller;

/**
 * 画面"MABCP_NumPtnReg"パネルクラスです。<p>
 *
 * 発番パタンマスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_NumPtnReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0810";

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
	public MCLabel Cnd_num_biz_typ_Label = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCTextField Cnd_num_biz_typ_nm = null;
	public MCLabel Cnd_num_ptn_cd_Label = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCTextField Cnd_num_ptn_nm = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0810.DtlR> DtlTable = null;
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
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_biz_typ_nm = null;
	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_max_digit = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_ptn_nm_lcl = null;
	/**
	 * Standard numbering pattern name 標準発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_ptn_nm = null;
	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key_dgt = null;
	/**
	 * Element type 1 要素区分１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ1 = null;
	/**
	 * Element type name 1 要素区分名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm1 = null;
	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt1 = null;
	/**
	 * Fixed value 1 固定値１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix1 = null;
	/**
	 * Hide 1 非表示１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg1 = null;
	/**
	 * Digit fill character 1 桁埋め文字１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str1 = null;
	/**
	 * Element type 2 要素区分２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ2 = null;
	/**
	 * Element type name 2 要素区分名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm2 = null;
	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt2 = null;
	/**
	 * Fixed value 2 固定値２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix2 = null;
	/**
	 * Hide 2 非表示２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg2 = null;
	/**
	 * Digit fill character 2 桁埋め文字２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str2 = null;
	/**
	 * Element type 3 要素区分３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ3 = null;
	/**
	 * Element type name 3 要素区分名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm3 = null;
	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt3 = null;
	/**
	 * Fixed value 3 固定値３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix3 = null;
	/**
	 * Hide 3 非表示３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg3 = null;
	/**
	 * Digit fill character 3 桁埋め文字３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str3 = null;
	/**
	 * Element type 4 要素区分４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ4 = null;
	/**
	 * Element type name 4 要素区分名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm4 = null;
	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt4 = null;
	/**
	 * Fixed value 4 固定値４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix4 = null;
	/**
	 * Hide 4 非表示４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg4 = null;
	/**
	 * Digit fill character 4 桁埋め文字４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str4 = null;
	/**
	 * Element type 5 要素区分５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ5 = null;
	/**
	 * Element type name 5 要素区分名５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm5 = null;
	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt5 = null;
	/**
	 * Fixed value 5 固定値５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix5 = null;
	/**
	 * Hide 5 非表示５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg5 = null;
	/**
	 * Digit fill character 5 桁埋め文字５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str5 = null;
	/**
	 * Element type 6 要素区分６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ6 = null;
	/**
	 * Element type name 6 要素区分名６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm6 = null;
	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt6 = null;
	/**
	 * Fixed value 6 固定値６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix6 = null;
	/**
	 * Hide 6 非表示６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg6 = null;
	/**
	 * Digit fill character 6 桁埋め文字６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str6 = null;
	/**
	 * Element type 7 要素区分７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ7 = null;
	/**
	 * Element type name 7 要素区分名７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm7 = null;
	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt7 = null;
	/**
	 * Fixed value 7 固定値７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix7 = null;
	/**
	 * Hide 7 非表示７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg7 = null;
	/**
	 * Digit fill character 7 桁埋め文字７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str7 = null;
	/**
	 * Element type 8 要素区分８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ8 = null;
	/**
	 * Element type name 8 要素区分名８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm8 = null;
	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt8 = null;
	/**
	 * Fixed value 8 固定値８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix8 = null;
	/**
	 * Hide 8 非表示８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg8 = null;
	/**
	 * Digit fill character 8 桁埋め文字８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str8 = null;
	/**
	 * Element type 9 要素区分９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ9 = null;
	/**
	 * Element type name 9 要素区分名９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm9 = null;
	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt9 = null;
	/**
	 * Fixed value 9 固定値９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix9 = null;
	/**
	 * Hide 9 非表示９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg9 = null;
	/**
	 * Digit fill character 9 桁埋め文字９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str9 = null;
	/**
	 * Element type 10 要素区分１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ10 = null;
	/**
	 * Element type name 10 要素区分名１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_typ_nm10 = null;
	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_elm_dgt10 = null;
	/**
	 * Fixed value 10 固定値１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix10 = null;
	/**
	 * Hide 10 非表示１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_undisp_flg10 = null;
	/**
	 * Digit fill character 10 桁埋め文字１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_pad_str10 = null;
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_seq_typ = null;
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_seq_typ_nm = null;
	/**
	 * Numbering image 発番イメージ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_img = null;
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
	// [LTab]ブロック関連のField定義
	public MCPanel LTabPanel = null;
	// [LTab]ブロックの項目のField定義
	// [LclTab]ブロック関連のField定義
	public MCPanel LclTabPanel = null;
	public MCTabbedPane LclTabTab = null;
	// [LclTab]ブロックの項目のField定義
	// [DtlSub]ブロック関連のField定義
	public MCPanel DtlSubPanel = null;
	// [DtlSub]ブロックの項目のField定義
	// [Row]ブロック関連のField定義
	public MCPanel RowPanel = null;
	// [Row]ブロックの項目のField定義
	public MCLabel Row_num_biz_typ_Label = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCTextComboBox Row_num_biz_typ = null;
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public MCTextField Row_num_biz_typ_nm = null;
	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public MCNumberField Row_max_digit = null;
	public MCLabel Row_num_ptn_cd_Label = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCTextField Row_num_ptn_cd = null;
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCTextField Row_num_ptn_nm_lcl = null;
	/**
	 * Standard numbering pattern name 標準発番パタン名.<p>
	 *
	 */
	public MCTextField Row_num_ptn_nm = null;
	public MCLabel Row_key_dgt_Label = null;
	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public MCNumberField Row_key_dgt = null;
	public MCLabel Row_elm_typ1_Label = null;
	/**
	 * Element type 1 要素区分１.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ1 = null;
	/**
	 * Element type name 1 要素区分名１.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm1 = null;
	public MCLabel Row_elm_dgt1_Label = null;
	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt1 = null;
	public MCLabel Row_fix1_Label = null;
	/**
	 * Fixed value 1 固定値１.<p>
	 *
	 */
	public MCTextField Row_fix1 = null;
	/**
	 * Hide 1 非表示１.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg1 = null;
	public MCLabel Row_num_pad_str1_Label = null;
	/**
	 * Digit fill character 1 桁埋め文字１.<p>
	 *
	 */
	public MCTextField Row_num_pad_str1 = null;
	public MCLabel Row_elm_typ2_Label = null;
	/**
	 * Element type 2 要素区分２.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ2 = null;
	/**
	 * Element type name 2 要素区分名２.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm2 = null;
	public MCLabel Row_elm_dgt2_Label = null;
	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt2 = null;
	public MCLabel Row_fix2_Label = null;
	/**
	 * Fixed value 2 固定値２.<p>
	 *
	 */
	public MCTextField Row_fix2 = null;
	/**
	 * Hide 2 非表示２.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg2 = null;
	public MCLabel Row_num_pad_str2_Label = null;
	/**
	 * Digit fill character 2 桁埋め文字２.<p>
	 *
	 */
	public MCTextField Row_num_pad_str2 = null;
	public MCLabel Row_elm_typ3_Label = null;
	/**
	 * Element type 3 要素区分３.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ3 = null;
	/**
	 * Element type name 3 要素区分名３.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm3 = null;
	public MCLabel Row_elm_dgt3_Label = null;
	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt3 = null;
	public MCLabel Row_fix3_Label = null;
	/**
	 * Fixed value 3 固定値３.<p>
	 *
	 */
	public MCTextField Row_fix3 = null;
	/**
	 * Hide 3 非表示３.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg3 = null;
	public MCLabel Row_num_pad_str3_Label = null;
	/**
	 * Digit fill character 3 桁埋め文字３.<p>
	 *
	 */
	public MCTextField Row_num_pad_str3 = null;
	public MCLabel Row_elm_typ4_Label = null;
	/**
	 * Element type 4 要素区分４.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ4 = null;
	/**
	 * Element type name 4 要素区分名４.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm4 = null;
	public MCLabel Row_elm_dgt4_Label = null;
	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt4 = null;
	public MCLabel Row_fix4_Label = null;
	/**
	 * Fixed value 4 固定値４.<p>
	 *
	 */
	public MCTextField Row_fix4 = null;
	/**
	 * Hide 4 非表示４.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg4 = null;
	public MCLabel Row_num_pad_str4_Label = null;
	/**
	 * Digit fill character 4 桁埋め文字４.<p>
	 *
	 */
	public MCTextField Row_num_pad_str4 = null;
	public MCLabel Row_elm_typ5_Label = null;
	/**
	 * Element type 5 要素区分５.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ5 = null;
	/**
	 * Element type name 5 要素区分名５.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm5 = null;
	public MCLabel Row_elm_dgt5_Label = null;
	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt5 = null;
	public MCLabel Row_fix5_Label = null;
	/**
	 * Fixed value 5 固定値５.<p>
	 *
	 */
	public MCTextField Row_fix5 = null;
	/**
	 * Hide 5 非表示５.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg5 = null;
	public MCLabel Row_num_pad_str5_Label = null;
	/**
	 * Digit fill character 5 桁埋め文字５.<p>
	 *
	 */
	public MCTextField Row_num_pad_str5 = null;
	public MCLabel Row_elm_typ6_Label = null;
	/**
	 * Element type 6 要素区分６.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ6 = null;
	/**
	 * Element type name 6 要素区分名６.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm6 = null;
	public MCLabel Row_elm_dgt6_Label = null;
	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt6 = null;
	public MCLabel Row_fix6_Label = null;
	/**
	 * Fixed value 6 固定値６.<p>
	 *
	 */
	public MCTextField Row_fix6 = null;
	/**
	 * Hide 6 非表示６.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg6 = null;
	public MCLabel Row_num_pad_str6_Label = null;
	/**
	 * Digit fill character 6 桁埋め文字６.<p>
	 *
	 */
	public MCTextField Row_num_pad_str6 = null;
	public MCLabel Row_elm_typ7_Label = null;
	/**
	 * Element type 7 要素区分７.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ7 = null;
	/**
	 * Element type name 7 要素区分名７.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm7 = null;
	public MCLabel Row_elm_dgt7_Label = null;
	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt7 = null;
	public MCLabel Row_fix7_Label = null;
	/**
	 * Fixed value 7 固定値７.<p>
	 *
	 */
	public MCTextField Row_fix7 = null;
	/**
	 * Hide 7 非表示７.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg7 = null;
	public MCLabel Row_num_pad_str7_Label = null;
	/**
	 * Digit fill character 7 桁埋め文字７.<p>
	 *
	 */
	public MCTextField Row_num_pad_str7 = null;
	public MCLabel Row_elm_typ8_Label = null;
	/**
	 * Element type 8 要素区分８.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ8 = null;
	/**
	 * Element type name 8 要素区分名８.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm8 = null;
	public MCLabel Row_elm_dgt8_Label = null;
	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt8 = null;
	public MCLabel Row_fix8_Label = null;
	/**
	 * Fixed value 8 固定値８.<p>
	 *
	 */
	public MCTextField Row_fix8 = null;
	/**
	 * Hide 8 非表示８.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg8 = null;
	public MCLabel Row_num_pad_str8_Label = null;
	/**
	 * Digit fill character 8 桁埋め文字８.<p>
	 *
	 */
	public MCTextField Row_num_pad_str8 = null;
	public MCLabel Row_elm_typ9_Label = null;
	/**
	 * Element type 9 要素区分９.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ9 = null;
	/**
	 * Element type name 9 要素区分名９.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm9 = null;
	public MCLabel Row_elm_dgt9_Label = null;
	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt9 = null;
	public MCLabel Row_fix9_Label = null;
	/**
	 * Fixed value 9 固定値９.<p>
	 *
	 */
	public MCTextField Row_fix9 = null;
	/**
	 * Hide 9 非表示９.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg9 = null;
	public MCLabel Row_num_pad_str9_Label = null;
	/**
	 * Digit fill character 9 桁埋め文字９.<p>
	 *
	 */
	public MCTextField Row_num_pad_str9 = null;
	public MCLabel Row_elm_typ10_Label = null;
	/**
	 * Element type 10 要素区分１０.<p>
	 *
	 */
	public MCTextComboBox Row_elm_typ10 = null;
	/**
	 * Element type name 10 要素区分名１０.<p>
	 *
	 */
	public MCTextField Row_elm_typ_nm10 = null;
	public MCLabel Row_elm_dgt10_Label = null;
	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public MCNumberField Row_elm_dgt10 = null;
	public MCLabel Row_fix10_Label = null;
	/**
	 * Fixed value 10 固定値１０.<p>
	 *
	 */
	public MCTextField Row_fix10 = null;
	/**
	 * Hide 10 非表示１０.<p>
	 *
	 */
	public MCCheckBox Row_undisp_flg10 = null;
	public MCLabel Row_num_pad_str10_Label = null;
	/**
	 * Digit fill character 10 桁埋め文字１０.<p>
	 *
	 */
	public MCTextField Row_num_pad_str10 = null;
	public MCLabel Row_num_img_Label = null;
	/**
	 * Numbering image 発番イメージ.<p>
	 *
	 */
	public MCTextField Row_num_img = null;
	public MCLabel Row_def_seq_typ_Label = null;
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public MCTextComboBox Row_def_seq_typ = null;
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public MCTextField Row_def_seq_typ_nm = null;
	public MCLabel Row_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Row_memo1 = null;
	public MCLabel Row_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Row_memo2 = null;
	public MCLabel Row_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Row_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCCheckBox Row_del_flg = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0810.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public MCColumnConfig columnLcl_num_biz_typ = null;
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_num_ptn_cd = null;
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
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_num_ptn_nm = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Numbering info. entry 発番情報登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0800 = null;
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
	
	/** [MA_MABCL0810_Srch01]のCallerの作成 */
	protected MABCP_NumPtnReg_MC.MA_MABCL0810_Srch01Caller createMA_MABCL0810_Srch01() {
		MABCP_NumPtnReg_MC.MA_MABCL0810_Srch01Caller<MABCP_NumPtnReg, MA_MABCL0810_Srch01Bridge>
		caller = ((MABCP_NumPtnReg_MC)this).new MA_MABCL0810_Srch01Caller<MABCP_NumPtnReg, MA_MABCL0810_Srch01Bridge>(
					(MABCP_NumPtnReg)this, new MA_MABCL0810_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0810_Srch01]の呼び出し */
	protected void callMA_MABCL0810_Srch01() {
		MCCaller caller = createMA_MABCL0810_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0810_Upd01]のCallerの作成 */
	protected MABCP_NumPtnReg_MC.MA_MABCL0810_Upd01Caller createMA_MABCL0810_Upd01() {
		MABCP_NumPtnReg_MC.MA_MABCL0810_Upd01Caller<MABCP_NumPtnReg, MA_MABCL0810_Upd01Bridge>
		caller = ((MABCP_NumPtnReg_MC)this).new MA_MABCL0810_Upd01Caller<MABCP_NumPtnReg, MA_MABCL0810_Upd01Bridge>(
					(MABCP_NumPtnReg)this, new MA_MABCL0810_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0810_Upd01]の呼び出し */
	protected void callMA_MABCL0810_Upd01() {
		MCCaller caller = createMA_MABCL0810_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0810_Del01]のCallerの作成 */
	protected MABCP_NumPtnReg_MC.MA_MABCL0810_Del01Caller createMA_MABCL0810_Del01() {
		MABCP_NumPtnReg_MC.MA_MABCL0810_Del01Caller<MABCP_NumPtnReg, MA_MABCL0810_Del01Bridge>
		caller = ((MABCP_NumPtnReg_MC)this).new MA_MABCL0810_Del01Caller<MABCP_NumPtnReg, MA_MABCL0810_Del01Bridge>(
					(MABCP_NumPtnReg)this, new MA_MABCL0810_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0810_Del01]の呼び出し */
	protected void callMA_MABCL0810_Del01() {
		MCCaller caller = createMA_MABCL0810_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0810.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0810.DtlR> aDtlL;
	/** [Row]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0810.RowR aRowR;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0810.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0810.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0810.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0810.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0810.CndR createCndR() {
		return mcframe.clientMABC.MABCP0810.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0810.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0810.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0810.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0810.DtlR.class);
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
	 * 項目コピーによってaRowRを設定します。
	 *
	 * aRowRのインスタンスは変更されません。
	 *
	 * @param row RowR
	 */
	public void setRowR(mcframe.clientMABC.MABCP0810.RowR row) {
		if (row != null) {
			MCRow.copyall(getRowR(), row);
		}
	}

	/**
	 * [Row]ブロックのコンテナaRowRを返します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0810.RowR getRowR() {
		return aRowR;
	}

	/**
	 * aRowRを作成します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0810.RowR createRowR() {
		return mcframe.clientMABC.MABCP0810.RowR.create();
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0810.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0810.LclR createLclR() {
		return mcframe.clientMABC.MABCP0810.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0810.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0810.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0810.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0810.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0810.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0810.LclR.class);
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
		if(!MCCollectionUtil.contains(ret, getRowR())) ret.add(getRowR());
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
		if(aCnt == getRowR()) return "Row";
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
		if(bId.equals("Row")) return getRowR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LTabPanel);
		ret.add(LclTabPanel);
		ret.add(DtlSubPanel);
		ret.add(RowPanel);
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
	public MABCP_NumPtnReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aRowR = createRowR();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_NumPtnReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aRowR = createRowR();
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
		MABCP_NumPtnReg_MC.jbCreateScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateTop((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateFold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateCnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateCtrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateDtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateDtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateLTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateLclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateDtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateRow((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateLclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateLcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateLclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbCreateEastBtn((MABCP_NumPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_NumPtnReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_NumPtnReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_NumPtnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_NumPtnReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_NumPtnReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_NumPtnReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_NumPtnReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_NumPtnReg p) {
	}

	/**
	 * [LTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLTab(MABCP_NumPtnReg p) {
	}

	/**
	 * [LclTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclTab(MABCP_NumPtnReg p) {
	}

	/**
	 * [DtlSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSub(MABCP_NumPtnReg p) {
	}

	/**
	 * [Row]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRow(MABCP_NumPtnReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_NumPtnReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_NumPtnReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_NumPtnReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_NumPtnReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_NumPtnReg p) {
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

	
	/** [Cnd_num_biz_typ_ListPutter]の定義 */
	private MCListPutter Cnd_num_biz_typ_p = null;

	/**
	 * [Cnd_num_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_num_biz_typ_ListPutter() {
		if (Cnd_num_biz_typ_p == null) {
			Cnd_num_biz_typ_p = createCnd_num_biz_typ_ListPutter(Cnd_num_biz_typ, "num_biz_typ", "num_biz_typ_nm");

		}
		return Cnd_num_biz_typ_p;
	}
	
	
	/** [Cnd_num_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_num_ptn_cd_p = null;

	/**
	 * [Cnd_num_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_num_ptn_cd_ListPutter() {
		if (Cnd_num_ptn_cd_p == null) {
			Cnd_num_ptn_cd_p = createCnd_num_ptn_cd_ListPutter(Cnd_num_ptn_cd, "num_ptn_cd", "num_ptn_nm");

		}
		return Cnd_num_ptn_cd_p;
	}
	
	
	/** [Row_num_biz_typ_ListPutter]の定義 */
	private MCListPutter Row_num_biz_typ_p = null;

	/**
	 * [Row_num_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getRow_num_biz_typ_ListPutter() {
		if (Row_num_biz_typ_p == null) {
			Row_num_biz_typ_p = createRow_num_biz_typ_ListPutter(Row_num_biz_typ, "num_biz_typ", "num_biz_typ_nm");

		}
		return Row_num_biz_typ_p;
	}
	
	
	/** [Row_elm_typ1_ListPutter]の定義 */
	private MCListPutter Row_elm_typ1_p = null;

	/**
	 * [Row_elm_typ1_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ1_ListPutter() {
		if (Row_elm_typ1_p == null) {
			Row_elm_typ1_p = createRow_elm_typ1_ListPutter(Row_elm_typ1, "elm_typ1", "elm_typ_nm1");

		}
		return Row_elm_typ1_p;
	}
	
	
	/** [Row_elm_typ2_ListPutter]の定義 */
	private MCListPutter Row_elm_typ2_p = null;

	/**
	 * [Row_elm_typ2_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ2_ListPutter() {
		if (Row_elm_typ2_p == null) {
			Row_elm_typ2_p = createRow_elm_typ2_ListPutter(Row_elm_typ2, "elm_typ2", "elm_typ_nm2");

		}
		return Row_elm_typ2_p;
	}
	
	
	/** [Row_elm_typ3_ListPutter]の定義 */
	private MCListPutter Row_elm_typ3_p = null;

	/**
	 * [Row_elm_typ3_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ3_ListPutter() {
		if (Row_elm_typ3_p == null) {
			Row_elm_typ3_p = createRow_elm_typ3_ListPutter(Row_elm_typ3, "elm_typ3", "elm_typ_nm3");

		}
		return Row_elm_typ3_p;
	}
	
	
	/** [Row_elm_typ4_ListPutter]の定義 */
	private MCListPutter Row_elm_typ4_p = null;

	/**
	 * [Row_elm_typ4_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ4_ListPutter() {
		if (Row_elm_typ4_p == null) {
			Row_elm_typ4_p = createRow_elm_typ4_ListPutter(Row_elm_typ4, "elm_typ4", "elm_typ_nm4");

		}
		return Row_elm_typ4_p;
	}
	
	
	/** [Row_elm_typ5_ListPutter]の定義 */
	private MCListPutter Row_elm_typ5_p = null;

	/**
	 * [Row_elm_typ5_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ5_ListPutter() {
		if (Row_elm_typ5_p == null) {
			Row_elm_typ5_p = createRow_elm_typ5_ListPutter(Row_elm_typ5, "elm_typ5", "elm_typ_nm5");

		}
		return Row_elm_typ5_p;
	}
	
	
	/** [Row_elm_typ6_ListPutter]の定義 */
	private MCListPutter Row_elm_typ6_p = null;

	/**
	 * [Row_elm_typ6_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ6_ListPutter() {
		if (Row_elm_typ6_p == null) {
			Row_elm_typ6_p = createRow_elm_typ6_ListPutter(Row_elm_typ6, "elm_typ6", "elm_typ_nm6");

		}
		return Row_elm_typ6_p;
	}
	
	
	/** [Row_elm_typ7_ListPutter]の定義 */
	private MCListPutter Row_elm_typ7_p = null;

	/**
	 * [Row_elm_typ7_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ7_ListPutter() {
		if (Row_elm_typ7_p == null) {
			Row_elm_typ7_p = createRow_elm_typ7_ListPutter(Row_elm_typ7, "elm_typ7", "elm_typ_nm7");

		}
		return Row_elm_typ7_p;
	}
	
	
	/** [Row_elm_typ8_ListPutter]の定義 */
	private MCListPutter Row_elm_typ8_p = null;

	/**
	 * [Row_elm_typ8_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ8_ListPutter() {
		if (Row_elm_typ8_p == null) {
			Row_elm_typ8_p = createRow_elm_typ8_ListPutter(Row_elm_typ8, "elm_typ8", "elm_typ_nm8");

		}
		return Row_elm_typ8_p;
	}
	
	
	/** [Row_elm_typ9_ListPutter]の定義 */
	private MCListPutter Row_elm_typ9_p = null;

	/**
	 * [Row_elm_typ9_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ9_ListPutter() {
		if (Row_elm_typ9_p == null) {
			Row_elm_typ9_p = createRow_elm_typ9_ListPutter(Row_elm_typ9, "elm_typ9", "elm_typ_nm9");

		}
		return Row_elm_typ9_p;
	}
	
	
	/** [Row_elm_typ10_ListPutter]の定義 */
	private MCListPutter Row_elm_typ10_p = null;

	/**
	 * [Row_elm_typ10_ListPutter]の取得
	 */
	protected MCListPutter getRow_elm_typ10_ListPutter() {
		if (Row_elm_typ10_p == null) {
			Row_elm_typ10_p = createRow_elm_typ10_ListPutter(Row_elm_typ10, "elm_typ10", "elm_typ_nm10");

		}
		return Row_elm_typ10_p;
	}
	
	
	/** [Row_def_seq_typ_ListPutter]の定義 */
	private MCListPutter Row_def_seq_typ_p = null;

	/**
	 * [Row_def_seq_typ_ListPutter]の取得
	 */
	protected MCListPutter getRow_def_seq_typ_ListPutter() {
		if (Row_def_seq_typ_p == null) {
			Row_def_seq_typ_p = createRow_def_seq_typ_ListPutter(Row_def_seq_typ, "def_seq_typ", "def_seq_typ_nm");

		}
		return Row_def_seq_typ_p;
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
	public static MABCP_NumPtnReg create(){
		MABCP_NumPtnReg p = new MABCP_NumPtnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_NumPtnReg create(String name){
		MABCP_NumPtnReg p = new MABCP_NumPtnReg(name);
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
		MABCP_NumPtnReg_MC.jbfInitScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitTop((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitFold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitCnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitCtrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitDtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitDtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitLTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitLclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitDtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitRow((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitLclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitLcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitLclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbfInitEastBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitTop((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitFold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitCnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitCtrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitDtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitDtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitLTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitLclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitDtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitRow((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitLclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitLcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitLclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.jbInitEastBtn((MABCP_NumPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_num_biz_typ_Label = p.beansFactory.createLabel("Cnd.num_biz_typ_Label");
		p.Cnd_num_biz_typ = p.beansFactory.createTextComboBox("Cnd.num_biz_typ");
		p.Cnd_num_biz_typ.setLabel(p.Cnd_num_biz_typ_Label);
		p.Cnd_num_biz_typ_nm = p.beansFactory.createTextField("Cnd.num_biz_typ_nm");
		p.Cnd_num_ptn_cd_Label = p.beansFactory.createLabel("Cnd.num_ptn_cd_Label");
		p.Cnd_num_ptn_cd = p.beansFactory.createTextComboBox("Cnd.num_ptn_cd");
		p.Cnd_num_ptn_cd.setLabel(p.Cnd_num_ptn_cd_Label);
		p.Cnd_num_ptn_nm = p.beansFactory.createTextField("Cnd.num_ptn_nm");
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
	protected static void jbfInitCtrl(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_num_biz_typ = p.beansFactory.createTableColumn("Dtl.num_biz_typ", MCColumnType.TEXT);
		p.columnDtl_num_biz_typ_nm = p.beansFactory.createTableColumn("Dtl.num_biz_typ_nm", MCColumnType.TEXT);
		p.columnDtl_max_digit = p.beansFactory.createTableColumn("Dtl.max_digit", MCColumnType.NUMBER);
		p.columnDtl_num_ptn_cd = p.beansFactory.createTableColumn("Dtl.num_ptn_cd", MCColumnType.TEXT);
		p.columnDtl_num_ptn_nm_lcl = p.beansFactory.createTableColumn("Dtl.num_ptn_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_num_ptn_nm = p.beansFactory.createTableColumn("Dtl.num_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_key_dgt = p.beansFactory.createTableColumn("Dtl.key_dgt", MCColumnType.NUMBER);
		p.columnDtl_elm_typ1 = p.beansFactory.createTableColumn("Dtl.elm_typ1", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm1 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm1", MCColumnType.TEXT);
		p.columnDtl_elm_dgt1 = p.beansFactory.createTableColumn("Dtl.elm_dgt1", MCColumnType.NUMBER);
		p.columnDtl_fix1 = p.beansFactory.createTableColumn("Dtl.fix1", MCColumnType.TEXT);
		p.columnDtl_undisp_flg1 = p.beansFactory.createTableColumn("Dtl.undisp_flg1", MCColumnType.CHECK);
		p.columnDtl_num_pad_str1 = p.beansFactory.createTableColumn("Dtl.num_pad_str1", MCColumnType.TEXT);
		p.columnDtl_elm_typ2 = p.beansFactory.createTableColumn("Dtl.elm_typ2", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm2 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm2", MCColumnType.TEXT);
		p.columnDtl_elm_dgt2 = p.beansFactory.createTableColumn("Dtl.elm_dgt2", MCColumnType.NUMBER);
		p.columnDtl_fix2 = p.beansFactory.createTableColumn("Dtl.fix2", MCColumnType.TEXT);
		p.columnDtl_undisp_flg2 = p.beansFactory.createTableColumn("Dtl.undisp_flg2", MCColumnType.CHECK);
		p.columnDtl_num_pad_str2 = p.beansFactory.createTableColumn("Dtl.num_pad_str2", MCColumnType.TEXT);
		p.columnDtl_elm_typ3 = p.beansFactory.createTableColumn("Dtl.elm_typ3", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm3 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm3", MCColumnType.TEXT);
		p.columnDtl_elm_dgt3 = p.beansFactory.createTableColumn("Dtl.elm_dgt3", MCColumnType.NUMBER);
		p.columnDtl_fix3 = p.beansFactory.createTableColumn("Dtl.fix3", MCColumnType.TEXT);
		p.columnDtl_undisp_flg3 = p.beansFactory.createTableColumn("Dtl.undisp_flg3", MCColumnType.CHECK);
		p.columnDtl_num_pad_str3 = p.beansFactory.createTableColumn("Dtl.num_pad_str3", MCColumnType.TEXT);
		p.columnDtl_elm_typ4 = p.beansFactory.createTableColumn("Dtl.elm_typ4", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm4 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm4", MCColumnType.TEXT);
		p.columnDtl_elm_dgt4 = p.beansFactory.createTableColumn("Dtl.elm_dgt4", MCColumnType.NUMBER);
		p.columnDtl_fix4 = p.beansFactory.createTableColumn("Dtl.fix4", MCColumnType.TEXT);
		p.columnDtl_undisp_flg4 = p.beansFactory.createTableColumn("Dtl.undisp_flg4", MCColumnType.CHECK);
		p.columnDtl_num_pad_str4 = p.beansFactory.createTableColumn("Dtl.num_pad_str4", MCColumnType.TEXT);
		p.columnDtl_elm_typ5 = p.beansFactory.createTableColumn("Dtl.elm_typ5", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm5 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm5", MCColumnType.TEXT);
		p.columnDtl_elm_dgt5 = p.beansFactory.createTableColumn("Dtl.elm_dgt5", MCColumnType.NUMBER);
		p.columnDtl_fix5 = p.beansFactory.createTableColumn("Dtl.fix5", MCColumnType.TEXT);
		p.columnDtl_undisp_flg5 = p.beansFactory.createTableColumn("Dtl.undisp_flg5", MCColumnType.CHECK);
		p.columnDtl_num_pad_str5 = p.beansFactory.createTableColumn("Dtl.num_pad_str5", MCColumnType.TEXT);
		p.columnDtl_elm_typ6 = p.beansFactory.createTableColumn("Dtl.elm_typ6", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm6 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm6", MCColumnType.TEXT);
		p.columnDtl_elm_dgt6 = p.beansFactory.createTableColumn("Dtl.elm_dgt6", MCColumnType.NUMBER);
		p.columnDtl_fix6 = p.beansFactory.createTableColumn("Dtl.fix6", MCColumnType.TEXT);
		p.columnDtl_undisp_flg6 = p.beansFactory.createTableColumn("Dtl.undisp_flg6", MCColumnType.CHECK);
		p.columnDtl_num_pad_str6 = p.beansFactory.createTableColumn("Dtl.num_pad_str6", MCColumnType.TEXT);
		p.columnDtl_elm_typ7 = p.beansFactory.createTableColumn("Dtl.elm_typ7", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm7 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm7", MCColumnType.TEXT);
		p.columnDtl_elm_dgt7 = p.beansFactory.createTableColumn("Dtl.elm_dgt7", MCColumnType.NUMBER);
		p.columnDtl_fix7 = p.beansFactory.createTableColumn("Dtl.fix7", MCColumnType.TEXT);
		p.columnDtl_undisp_flg7 = p.beansFactory.createTableColumn("Dtl.undisp_flg7", MCColumnType.CHECK);
		p.columnDtl_num_pad_str7 = p.beansFactory.createTableColumn("Dtl.num_pad_str7", MCColumnType.TEXT);
		p.columnDtl_elm_typ8 = p.beansFactory.createTableColumn("Dtl.elm_typ8", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm8 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm8", MCColumnType.TEXT);
		p.columnDtl_elm_dgt8 = p.beansFactory.createTableColumn("Dtl.elm_dgt8", MCColumnType.NUMBER);
		p.columnDtl_fix8 = p.beansFactory.createTableColumn("Dtl.fix8", MCColumnType.TEXT);
		p.columnDtl_undisp_flg8 = p.beansFactory.createTableColumn("Dtl.undisp_flg8", MCColumnType.CHECK);
		p.columnDtl_num_pad_str8 = p.beansFactory.createTableColumn("Dtl.num_pad_str8", MCColumnType.TEXT);
		p.columnDtl_elm_typ9 = p.beansFactory.createTableColumn("Dtl.elm_typ9", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm9 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm9", MCColumnType.TEXT);
		p.columnDtl_elm_dgt9 = p.beansFactory.createTableColumn("Dtl.elm_dgt9", MCColumnType.NUMBER);
		p.columnDtl_fix9 = p.beansFactory.createTableColumn("Dtl.fix9", MCColumnType.TEXT);
		p.columnDtl_undisp_flg9 = p.beansFactory.createTableColumn("Dtl.undisp_flg9", MCColumnType.CHECK);
		p.columnDtl_num_pad_str9 = p.beansFactory.createTableColumn("Dtl.num_pad_str9", MCColumnType.TEXT);
		p.columnDtl_elm_typ10 = p.beansFactory.createTableColumn("Dtl.elm_typ10", MCColumnType.TEXT);
		p.columnDtl_elm_typ_nm10 = p.beansFactory.createTableColumn("Dtl.elm_typ_nm10", MCColumnType.TEXT);
		p.columnDtl_elm_dgt10 = p.beansFactory.createTableColumn("Dtl.elm_dgt10", MCColumnType.NUMBER);
		p.columnDtl_fix10 = p.beansFactory.createTableColumn("Dtl.fix10", MCColumnType.TEXT);
		p.columnDtl_undisp_flg10 = p.beansFactory.createTableColumn("Dtl.undisp_flg10", MCColumnType.CHECK);
		p.columnDtl_num_pad_str10 = p.beansFactory.createTableColumn("Dtl.num_pad_str10", MCColumnType.TEXT);
		p.columnDtl_def_seq_typ = p.beansFactory.createTableColumn("Dtl.def_seq_typ", MCColumnType.TEXT);
		p.columnDtl_def_seq_typ_nm = p.beansFactory.createTableColumn("Dtl.def_seq_typ_nm", MCColumnType.TEXT);
		p.columnDtl_num_img = p.beansFactory.createTableColumn("Dtl.num_img", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABCP_NumPtnReg p) {
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
	 * [LTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLTab(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.LTabPanel = p.beansFactory.createPanel("LTab");
		// ブロックの項目の初期化
	}

	/**
	 * [LclTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclTab(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.LclTabPanel = p.beansFactory.createPanel("LclTab");
		p.LclTabTab = p.beansFactory.createTabbedPane("LclTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSub(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.DtlSubPanel = p.beansFactory.createPanel("DtlSub");
		// ブロックの項目の初期化
	}

	/**
	 * [Row]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRow(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.RowPanel = p.beansFactory.createPanel("Row");
		// ブロックの項目の初期化
		p.Row_num_biz_typ_Label = p.beansFactory.createLabel("Row.num_biz_typ_Label");
		p.Row_num_biz_typ = p.beansFactory.createTextComboBox("Row.num_biz_typ");
		p.Row_num_biz_typ.setLabel(p.Row_num_biz_typ_Label);
		p.Row_num_biz_typ_nm = p.beansFactory.createTextField("Row.num_biz_typ_nm");
		p.Row_max_digit = p.beansFactory.createNumberField("Row.max_digit");
		p.Row_num_ptn_cd_Label = p.beansFactory.createLabel("Row.num_ptn_cd_Label");
		p.Row_num_ptn_cd = p.beansFactory.createTextField("Row.num_ptn_cd");
		p.Row_num_ptn_cd.setLabel(p.Row_num_ptn_cd_Label);
		p.Row_num_ptn_nm_lcl = p.beansFactory.createTextField("Row.num_ptn_nm_lcl");
		p.Row_num_ptn_nm = p.beansFactory.createTextField("Row.num_ptn_nm");
		p.Row_key_dgt_Label = p.beansFactory.createLabel("Row.key_dgt_Label");
		p.Row_key_dgt = p.beansFactory.createNumberField("Row.key_dgt");
		p.Row_key_dgt.setLabel(p.Row_key_dgt_Label);
		p.Row_elm_typ1_Label = p.beansFactory.createLabel("Row.elm_typ1_Label");
		p.Row_elm_typ1 = p.beansFactory.createTextComboBox("Row.elm_typ1");
		p.Row_elm_typ1.setLabel(p.Row_elm_typ1_Label);
		p.Row_elm_typ_nm1 = p.beansFactory.createTextField("Row.elm_typ_nm1");
		p.Row_elm_dgt1_Label = p.beansFactory.createLabel("Row.elm_dgt1_Label");
		p.Row_elm_dgt1 = p.beansFactory.createNumberField("Row.elm_dgt1");
		p.Row_elm_dgt1.setLabel(p.Row_elm_dgt1_Label);
		p.Row_fix1_Label = p.beansFactory.createLabel("Row.fix1_Label");
		p.Row_fix1 = p.beansFactory.createTextField("Row.fix1");
		p.Row_fix1.setLabel(p.Row_fix1_Label);
		p.Row_undisp_flg1 = p.beansFactory.createCheckBox("Row.undisp_flg1");
		p.Row_num_pad_str1_Label = p.beansFactory.createLabel("Row.num_pad_str1_Label");
		p.Row_num_pad_str1 = p.beansFactory.createTextField("Row.num_pad_str1");
		p.Row_num_pad_str1.setLabel(p.Row_num_pad_str1_Label);
		p.Row_elm_typ2_Label = p.beansFactory.createLabel("Row.elm_typ2_Label");
		p.Row_elm_typ2 = p.beansFactory.createTextComboBox("Row.elm_typ2");
		p.Row_elm_typ2.setLabel(p.Row_elm_typ2_Label);
		p.Row_elm_typ_nm2 = p.beansFactory.createTextField("Row.elm_typ_nm2");
		p.Row_elm_dgt2_Label = p.beansFactory.createLabel("Row.elm_dgt2_Label");
		p.Row_elm_dgt2 = p.beansFactory.createNumberField("Row.elm_dgt2");
		p.Row_elm_dgt2.setLabel(p.Row_elm_dgt2_Label);
		p.Row_fix2_Label = p.beansFactory.createLabel("Row.fix2_Label");
		p.Row_fix2 = p.beansFactory.createTextField("Row.fix2");
		p.Row_fix2.setLabel(p.Row_fix2_Label);
		p.Row_undisp_flg2 = p.beansFactory.createCheckBox("Row.undisp_flg2");
		p.Row_num_pad_str2_Label = p.beansFactory.createLabel("Row.num_pad_str2_Label");
		p.Row_num_pad_str2 = p.beansFactory.createTextField("Row.num_pad_str2");
		p.Row_num_pad_str2.setLabel(p.Row_num_pad_str2_Label);
		p.Row_elm_typ3_Label = p.beansFactory.createLabel("Row.elm_typ3_Label");
		p.Row_elm_typ3 = p.beansFactory.createTextComboBox("Row.elm_typ3");
		p.Row_elm_typ3.setLabel(p.Row_elm_typ3_Label);
		p.Row_elm_typ_nm3 = p.beansFactory.createTextField("Row.elm_typ_nm3");
		p.Row_elm_dgt3_Label = p.beansFactory.createLabel("Row.elm_dgt3_Label");
		p.Row_elm_dgt3 = p.beansFactory.createNumberField("Row.elm_dgt3");
		p.Row_elm_dgt3.setLabel(p.Row_elm_dgt3_Label);
		p.Row_fix3_Label = p.beansFactory.createLabel("Row.fix3_Label");
		p.Row_fix3 = p.beansFactory.createTextField("Row.fix3");
		p.Row_fix3.setLabel(p.Row_fix3_Label);
		p.Row_undisp_flg3 = p.beansFactory.createCheckBox("Row.undisp_flg3");
		p.Row_num_pad_str3_Label = p.beansFactory.createLabel("Row.num_pad_str3_Label");
		p.Row_num_pad_str3 = p.beansFactory.createTextField("Row.num_pad_str3");
		p.Row_num_pad_str3.setLabel(p.Row_num_pad_str3_Label);
		p.Row_elm_typ4_Label = p.beansFactory.createLabel("Row.elm_typ4_Label");
		p.Row_elm_typ4 = p.beansFactory.createTextComboBox("Row.elm_typ4");
		p.Row_elm_typ4.setLabel(p.Row_elm_typ4_Label);
		p.Row_elm_typ_nm4 = p.beansFactory.createTextField("Row.elm_typ_nm4");
		p.Row_elm_dgt4_Label = p.beansFactory.createLabel("Row.elm_dgt4_Label");
		p.Row_elm_dgt4 = p.beansFactory.createNumberField("Row.elm_dgt4");
		p.Row_elm_dgt4.setLabel(p.Row_elm_dgt4_Label);
		p.Row_fix4_Label = p.beansFactory.createLabel("Row.fix4_Label");
		p.Row_fix4 = p.beansFactory.createTextField("Row.fix4");
		p.Row_fix4.setLabel(p.Row_fix4_Label);
		p.Row_undisp_flg4 = p.beansFactory.createCheckBox("Row.undisp_flg4");
		p.Row_num_pad_str4_Label = p.beansFactory.createLabel("Row.num_pad_str4_Label");
		p.Row_num_pad_str4 = p.beansFactory.createTextField("Row.num_pad_str4");
		p.Row_num_pad_str4.setLabel(p.Row_num_pad_str4_Label);
		p.Row_elm_typ5_Label = p.beansFactory.createLabel("Row.elm_typ5_Label");
		p.Row_elm_typ5 = p.beansFactory.createTextComboBox("Row.elm_typ5");
		p.Row_elm_typ5.setLabel(p.Row_elm_typ5_Label);
		p.Row_elm_typ_nm5 = p.beansFactory.createTextField("Row.elm_typ_nm5");
		p.Row_elm_dgt5_Label = p.beansFactory.createLabel("Row.elm_dgt5_Label");
		p.Row_elm_dgt5 = p.beansFactory.createNumberField("Row.elm_dgt5");
		p.Row_elm_dgt5.setLabel(p.Row_elm_dgt5_Label);
		p.Row_fix5_Label = p.beansFactory.createLabel("Row.fix5_Label");
		p.Row_fix5 = p.beansFactory.createTextField("Row.fix5");
		p.Row_fix5.setLabel(p.Row_fix5_Label);
		p.Row_undisp_flg5 = p.beansFactory.createCheckBox("Row.undisp_flg5");
		p.Row_num_pad_str5_Label = p.beansFactory.createLabel("Row.num_pad_str5_Label");
		p.Row_num_pad_str5 = p.beansFactory.createTextField("Row.num_pad_str5");
		p.Row_num_pad_str5.setLabel(p.Row_num_pad_str5_Label);
		p.Row_elm_typ6_Label = p.beansFactory.createLabel("Row.elm_typ6_Label");
		p.Row_elm_typ6 = p.beansFactory.createTextComboBox("Row.elm_typ6");
		p.Row_elm_typ6.setLabel(p.Row_elm_typ6_Label);
		p.Row_elm_typ_nm6 = p.beansFactory.createTextField("Row.elm_typ_nm6");
		p.Row_elm_dgt6_Label = p.beansFactory.createLabel("Row.elm_dgt6_Label");
		p.Row_elm_dgt6 = p.beansFactory.createNumberField("Row.elm_dgt6");
		p.Row_elm_dgt6.setLabel(p.Row_elm_dgt6_Label);
		p.Row_fix6_Label = p.beansFactory.createLabel("Row.fix6_Label");
		p.Row_fix6 = p.beansFactory.createTextField("Row.fix6");
		p.Row_fix6.setLabel(p.Row_fix6_Label);
		p.Row_undisp_flg6 = p.beansFactory.createCheckBox("Row.undisp_flg6");
		p.Row_num_pad_str6_Label = p.beansFactory.createLabel("Row.num_pad_str6_Label");
		p.Row_num_pad_str6 = p.beansFactory.createTextField("Row.num_pad_str6");
		p.Row_num_pad_str6.setLabel(p.Row_num_pad_str6_Label);
		p.Row_elm_typ7_Label = p.beansFactory.createLabel("Row.elm_typ7_Label");
		p.Row_elm_typ7 = p.beansFactory.createTextComboBox("Row.elm_typ7");
		p.Row_elm_typ7.setLabel(p.Row_elm_typ7_Label);
		p.Row_elm_typ_nm7 = p.beansFactory.createTextField("Row.elm_typ_nm7");
		p.Row_elm_dgt7_Label = p.beansFactory.createLabel("Row.elm_dgt7_Label");
		p.Row_elm_dgt7 = p.beansFactory.createNumberField("Row.elm_dgt7");
		p.Row_elm_dgt7.setLabel(p.Row_elm_dgt7_Label);
		p.Row_fix7_Label = p.beansFactory.createLabel("Row.fix7_Label");
		p.Row_fix7 = p.beansFactory.createTextField("Row.fix7");
		p.Row_fix7.setLabel(p.Row_fix7_Label);
		p.Row_undisp_flg7 = p.beansFactory.createCheckBox("Row.undisp_flg7");
		p.Row_num_pad_str7_Label = p.beansFactory.createLabel("Row.num_pad_str7_Label");
		p.Row_num_pad_str7 = p.beansFactory.createTextField("Row.num_pad_str7");
		p.Row_num_pad_str7.setLabel(p.Row_num_pad_str7_Label);
		p.Row_elm_typ8_Label = p.beansFactory.createLabel("Row.elm_typ8_Label");
		p.Row_elm_typ8 = p.beansFactory.createTextComboBox("Row.elm_typ8");
		p.Row_elm_typ8.setLabel(p.Row_elm_typ8_Label);
		p.Row_elm_typ_nm8 = p.beansFactory.createTextField("Row.elm_typ_nm8");
		p.Row_elm_dgt8_Label = p.beansFactory.createLabel("Row.elm_dgt8_Label");
		p.Row_elm_dgt8 = p.beansFactory.createNumberField("Row.elm_dgt8");
		p.Row_elm_dgt8.setLabel(p.Row_elm_dgt8_Label);
		p.Row_fix8_Label = p.beansFactory.createLabel("Row.fix8_Label");
		p.Row_fix8 = p.beansFactory.createTextField("Row.fix8");
		p.Row_fix8.setLabel(p.Row_fix8_Label);
		p.Row_undisp_flg8 = p.beansFactory.createCheckBox("Row.undisp_flg8");
		p.Row_num_pad_str8_Label = p.beansFactory.createLabel("Row.num_pad_str8_Label");
		p.Row_num_pad_str8 = p.beansFactory.createTextField("Row.num_pad_str8");
		p.Row_num_pad_str8.setLabel(p.Row_num_pad_str8_Label);
		p.Row_elm_typ9_Label = p.beansFactory.createLabel("Row.elm_typ9_Label");
		p.Row_elm_typ9 = p.beansFactory.createTextComboBox("Row.elm_typ9");
		p.Row_elm_typ9.setLabel(p.Row_elm_typ9_Label);
		p.Row_elm_typ_nm9 = p.beansFactory.createTextField("Row.elm_typ_nm9");
		p.Row_elm_dgt9_Label = p.beansFactory.createLabel("Row.elm_dgt9_Label");
		p.Row_elm_dgt9 = p.beansFactory.createNumberField("Row.elm_dgt9");
		p.Row_elm_dgt9.setLabel(p.Row_elm_dgt9_Label);
		p.Row_fix9_Label = p.beansFactory.createLabel("Row.fix9_Label");
		p.Row_fix9 = p.beansFactory.createTextField("Row.fix9");
		p.Row_fix9.setLabel(p.Row_fix9_Label);
		p.Row_undisp_flg9 = p.beansFactory.createCheckBox("Row.undisp_flg9");
		p.Row_num_pad_str9_Label = p.beansFactory.createLabel("Row.num_pad_str9_Label");
		p.Row_num_pad_str9 = p.beansFactory.createTextField("Row.num_pad_str9");
		p.Row_num_pad_str9.setLabel(p.Row_num_pad_str9_Label);
		p.Row_elm_typ10_Label = p.beansFactory.createLabel("Row.elm_typ10_Label");
		p.Row_elm_typ10 = p.beansFactory.createTextComboBox("Row.elm_typ10");
		p.Row_elm_typ10.setLabel(p.Row_elm_typ10_Label);
		p.Row_elm_typ_nm10 = p.beansFactory.createTextField("Row.elm_typ_nm10");
		p.Row_elm_dgt10_Label = p.beansFactory.createLabel("Row.elm_dgt10_Label");
		p.Row_elm_dgt10 = p.beansFactory.createNumberField("Row.elm_dgt10");
		p.Row_elm_dgt10.setLabel(p.Row_elm_dgt10_Label);
		p.Row_fix10_Label = p.beansFactory.createLabel("Row.fix10_Label");
		p.Row_fix10 = p.beansFactory.createTextField("Row.fix10");
		p.Row_fix10.setLabel(p.Row_fix10_Label);
		p.Row_undisp_flg10 = p.beansFactory.createCheckBox("Row.undisp_flg10");
		p.Row_num_pad_str10_Label = p.beansFactory.createLabel("Row.num_pad_str10_Label");
		p.Row_num_pad_str10 = p.beansFactory.createTextField("Row.num_pad_str10");
		p.Row_num_pad_str10.setLabel(p.Row_num_pad_str10_Label);
		p.Row_num_img_Label = p.beansFactory.createLabel("Row.num_img_Label");
		p.Row_num_img = p.beansFactory.createTextField("Row.num_img");
		p.Row_num_img.setLabel(p.Row_num_img_Label);
		p.Row_def_seq_typ_Label = p.beansFactory.createLabel("Row.def_seq_typ_Label");
		p.Row_def_seq_typ = p.beansFactory.createTextComboBox("Row.def_seq_typ");
		p.Row_def_seq_typ.setLabel(p.Row_def_seq_typ_Label);
		p.Row_def_seq_typ_nm = p.beansFactory.createTextField("Row.def_seq_typ_nm");
		p.Row_memo1_Label = p.beansFactory.createLabel("Row.memo1_Label");
		p.Row_memo1 = p.beansFactory.createTextField("Row.memo1");
		p.Row_memo1.setLabel(p.Row_memo1_Label);
		p.Row_memo2_Label = p.beansFactory.createLabel("Row.memo2_Label");
		p.Row_memo2 = p.beansFactory.createTextField("Row.memo2");
		p.Row_memo2.setLabel(p.Row_memo2_Label);
		p.Row_memo3_Label = p.beansFactory.createLabel("Row.memo3_Label");
		p.Row_memo3 = p.beansFactory.createTextField("Row.memo3");
		p.Row_memo3.setLabel(p.Row_memo3_Label);
		p.Row_del_flg = p.beansFactory.createCheckBox("Row.del_flg");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_num_biz_typ = p.beansFactory.createTableColumn("Lcl.num_biz_typ", MCColumnType.TEXT);
		p.columnLcl_num_ptn_cd = p.beansFactory.createTableColumn("Lcl.num_ptn_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_num_ptn_nm = p.beansFactory.createTableColumn("Lcl.num_ptn_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABCP_NumPtnReg p) {
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
	protected static void jbfInitBtn(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0800 = p.beansFactory.createButton("Btn.open_MABCP0800", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_NumPtnReg p) {
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
	protected static void jbInitFold(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.ope_META);
		p.Cnd_num_biz_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_num_biz_typ, true);
		p.Cnd_num_biz_typ.setLinkBeans(p.Cnd_num_biz_typ_nm);
		p.CndPanel.add(p.Cnd_num_biz_typ_Label);
		p.CndPanel.add(p.Cnd_num_biz_typ);
		p.CndPanel.setLastBeans(p.Cnd_num_biz_typ);
		p.Cnd_num_biz_typ.setNextBeans(p.Cnd_num_biz_typ_nm);
		p.Cnd_num_biz_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.num_biz_typ_META);
		p.CndPanel.add(p.Cnd_num_biz_typ_nm);
		p.Cnd_num_biz_typ_nm.setNextBeans(p.Cnd_num_ptn_cd);
		p.Cnd_num_biz_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.num_biz_typ_nm_META);
		p.Cnd_num_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_num_ptn_cd, true);
		p.Cnd_num_ptn_cd.setLinkBeans(p.Cnd_num_ptn_nm);
		p.CndPanel.add(p.Cnd_num_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_num_ptn_cd);
		p.Cnd_num_ptn_cd.setNextBeans(p.Cnd_num_ptn_nm);
		p.Cnd_num_ptn_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.num_ptn_cd_META);
		p.CndPanel.add(p.Cnd_num_ptn_nm);
		p.Cnd_num_ptn_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_num_ptn_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.num_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_num_ptn_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0810.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_NumPtnReg p) {
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
	protected static void jbInitWrk(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LTabPanel);
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
	protected static void jbInitDtl(MABCP_NumPtnReg p) {
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
	protected static void jbInitDtlBtn(MABCP_NumPtnReg p) {
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
	 * [LTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLTab(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.add(p.LTabPanel);
		p.LTabPanel.setNextBeans(p.BtnPanel);
		p.LTabPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LTabPanel.add(p.LclTabPanel, null);
		p.LTabPanel.setLastBeans(p.LclTabPanel);
	}

	/**
	 * [LclTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclTab(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.LclTabPanel.add(p.LclTabTab);
		p.LclTabPanel.setLastBeans(p.LclTabTab);
		p.LclTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.LclTabTab.add(p.DtlSubPanel, "LclTab.tab1");
		p.LclTabTab.setLastBeans(p.DtlSubPanel);
		p.DtlSubPanel.setNextBeans(p.LclWrkPanel);
		p.LclTabTab.add(p.LclWrkPanel, "LclTab.tab2");
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSub(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.DtlSubPanel.setNextBeans(p.LclWrkPanel);
		p.DtlSubPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.DtlSubPanel.add(p.RowPanel, null);
		p.DtlSubPanel.setLastBeans(p.RowPanel);
	}

	/**
	 * [Row]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRow(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.RowPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Row_num_biz_typ.setListType(MCListType.STRICT);
		p.Row_num_biz_typ.setLinkBeans(p.Row_num_biz_typ_nm);
		p.RowPanel.add(p.Row_num_biz_typ_Label);
		p.RowPanel.add(p.Row_num_biz_typ);
		p.RowPanel.setLastBeans(p.Row_num_biz_typ);
		p.Row_num_biz_typ.setNextBeans(p.Row_num_biz_typ_nm);
		p.Row_num_biz_typ.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_biz_typ_META);
		p.RowPanel.add(p.Row_num_biz_typ_nm);
		p.Row_num_biz_typ_nm.setNextBeans(p.Row_max_digit);
		p.Row_num_biz_typ_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_biz_typ_nm_META);
		p.RowPanel.add(p.Row_max_digit);
		p.Row_max_digit.setNextBeans(p.Row_num_ptn_cd);
		p.Row_max_digit.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.max_digit_META);
		p.RowPanel.add(p.Row_num_ptn_cd_Label);
		p.RowPanel.add(p.Row_num_ptn_cd);
		p.Row_num_ptn_cd.setNextBeans(p.Row_num_ptn_nm_lcl);
		p.Row_num_ptn_cd.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_ptn_cd_META);
		p.RowPanel.add(p.Row_num_ptn_nm_lcl);
		p.Row_num_ptn_nm_lcl.setNextBeans(p.Row_num_ptn_nm);
		p.Row_num_ptn_nm_lcl.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_ptn_nm_lcl_META);
		p.RowPanel.add(p.Row_num_ptn_nm);
		p.Row_num_ptn_nm.setNextBeans(p.Row_key_dgt);
		p.Row_num_ptn_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_ptn_nm_META);
		p.RowPanel.add(p.Row_key_dgt_Label);
		p.RowPanel.add(p.Row_key_dgt);
		p.Row_key_dgt.setNextBeans(p.Row_elm_typ1);
		p.Row_key_dgt.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.key_dgt_META);
		p.Row_elm_typ1.setListType(MCListType.STRICT);
		p.Row_elm_typ1.setLinkBeans(p.Row_elm_typ_nm1);
		p.RowPanel.add(p.Row_elm_typ1_Label);
		p.RowPanel.add(p.Row_elm_typ1);
		p.Row_elm_typ1.setNextBeans(p.Row_elm_typ_nm1);
		p.Row_elm_typ1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ1_META);
		p.RowPanel.add(p.Row_elm_typ_nm1);
		p.Row_elm_typ_nm1.setNextBeans(p.Row_elm_dgt1);
		p.Row_elm_typ_nm1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm1_META);
		p.RowPanel.add(p.Row_elm_dgt1_Label);
		p.RowPanel.add(p.Row_elm_dgt1);
		p.Row_elm_dgt1.setNextBeans(p.Row_fix1);
		p.Row_elm_dgt1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt1_META);
		p.RowPanel.add(p.Row_fix1_Label);
		p.RowPanel.add(p.Row_fix1);
		p.Row_fix1.setNextBeans(p.Row_undisp_flg1);
		p.Row_fix1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix1_META);
		p.RowPanel.add(p.Row_undisp_flg1);
		p.Row_undisp_flg1.setNextBeans(p.Row_num_pad_str1);
		p.Row_undisp_flg1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg1_META);
		p.RowPanel.add(p.Row_num_pad_str1_Label);
		p.RowPanel.add(p.Row_num_pad_str1);
		p.Row_num_pad_str1.setNextBeans(p.Row_elm_typ2);
		p.Row_num_pad_str1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str1_META);
		p.Row_elm_typ2.setListType(MCListType.STRICT);
		p.Row_elm_typ2.setLinkBeans(p.Row_elm_typ_nm2);
		p.RowPanel.add(p.Row_elm_typ2_Label);
		p.RowPanel.add(p.Row_elm_typ2);
		p.Row_elm_typ2.setNextBeans(p.Row_elm_typ_nm2);
		p.Row_elm_typ2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ2_META);
		p.RowPanel.add(p.Row_elm_typ_nm2);
		p.Row_elm_typ_nm2.setNextBeans(p.Row_elm_dgt2);
		p.Row_elm_typ_nm2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm2_META);
		p.RowPanel.add(p.Row_elm_dgt2_Label);
		p.RowPanel.add(p.Row_elm_dgt2);
		p.Row_elm_dgt2.setNextBeans(p.Row_fix2);
		p.Row_elm_dgt2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt2_META);
		p.RowPanel.add(p.Row_fix2_Label);
		p.RowPanel.add(p.Row_fix2);
		p.Row_fix2.setNextBeans(p.Row_undisp_flg2);
		p.Row_fix2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix2_META);
		p.RowPanel.add(p.Row_undisp_flg2);
		p.Row_undisp_flg2.setNextBeans(p.Row_num_pad_str2);
		p.Row_undisp_flg2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg2_META);
		p.RowPanel.add(p.Row_num_pad_str2_Label);
		p.RowPanel.add(p.Row_num_pad_str2);
		p.Row_num_pad_str2.setNextBeans(p.Row_elm_typ3);
		p.Row_num_pad_str2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str2_META);
		p.Row_elm_typ3.setListType(MCListType.STRICT);
		p.Row_elm_typ3.setLinkBeans(p.Row_elm_typ_nm3);
		p.RowPanel.add(p.Row_elm_typ3_Label);
		p.RowPanel.add(p.Row_elm_typ3);
		p.Row_elm_typ3.setNextBeans(p.Row_elm_typ_nm3);
		p.Row_elm_typ3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ3_META);
		p.RowPanel.add(p.Row_elm_typ_nm3);
		p.Row_elm_typ_nm3.setNextBeans(p.Row_elm_dgt3);
		p.Row_elm_typ_nm3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm3_META);
		p.RowPanel.add(p.Row_elm_dgt3_Label);
		p.RowPanel.add(p.Row_elm_dgt3);
		p.Row_elm_dgt3.setNextBeans(p.Row_fix3);
		p.Row_elm_dgt3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt3_META);
		p.RowPanel.add(p.Row_fix3_Label);
		p.RowPanel.add(p.Row_fix3);
		p.Row_fix3.setNextBeans(p.Row_undisp_flg3);
		p.Row_fix3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix3_META);
		p.RowPanel.add(p.Row_undisp_flg3);
		p.Row_undisp_flg3.setNextBeans(p.Row_num_pad_str3);
		p.Row_undisp_flg3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg3_META);
		p.RowPanel.add(p.Row_num_pad_str3_Label);
		p.RowPanel.add(p.Row_num_pad_str3);
		p.Row_num_pad_str3.setNextBeans(p.Row_elm_typ4);
		p.Row_num_pad_str3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str3_META);
		p.Row_elm_typ4.setListType(MCListType.STRICT);
		p.Row_elm_typ4.setLinkBeans(p.Row_elm_typ_nm4);
		p.RowPanel.add(p.Row_elm_typ4_Label);
		p.RowPanel.add(p.Row_elm_typ4);
		p.Row_elm_typ4.setNextBeans(p.Row_elm_typ_nm4);
		p.Row_elm_typ4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ4_META);
		p.RowPanel.add(p.Row_elm_typ_nm4);
		p.Row_elm_typ_nm4.setNextBeans(p.Row_elm_dgt4);
		p.Row_elm_typ_nm4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm4_META);
		p.RowPanel.add(p.Row_elm_dgt4_Label);
		p.RowPanel.add(p.Row_elm_dgt4);
		p.Row_elm_dgt4.setNextBeans(p.Row_fix4);
		p.Row_elm_dgt4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt4_META);
		p.RowPanel.add(p.Row_fix4_Label);
		p.RowPanel.add(p.Row_fix4);
		p.Row_fix4.setNextBeans(p.Row_undisp_flg4);
		p.Row_fix4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix4_META);
		p.RowPanel.add(p.Row_undisp_flg4);
		p.Row_undisp_flg4.setNextBeans(p.Row_num_pad_str4);
		p.Row_undisp_flg4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg4_META);
		p.RowPanel.add(p.Row_num_pad_str4_Label);
		p.RowPanel.add(p.Row_num_pad_str4);
		p.Row_num_pad_str4.setNextBeans(p.Row_elm_typ5);
		p.Row_num_pad_str4.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str4_META);
		p.Row_elm_typ5.setListType(MCListType.STRICT);
		p.Row_elm_typ5.setLinkBeans(p.Row_elm_typ_nm5);
		p.RowPanel.add(p.Row_elm_typ5_Label);
		p.RowPanel.add(p.Row_elm_typ5);
		p.Row_elm_typ5.setNextBeans(p.Row_elm_typ_nm5);
		p.Row_elm_typ5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ5_META);
		p.RowPanel.add(p.Row_elm_typ_nm5);
		p.Row_elm_typ_nm5.setNextBeans(p.Row_elm_dgt5);
		p.Row_elm_typ_nm5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm5_META);
		p.RowPanel.add(p.Row_elm_dgt5_Label);
		p.RowPanel.add(p.Row_elm_dgt5);
		p.Row_elm_dgt5.setNextBeans(p.Row_fix5);
		p.Row_elm_dgt5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt5_META);
		p.RowPanel.add(p.Row_fix5_Label);
		p.RowPanel.add(p.Row_fix5);
		p.Row_fix5.setNextBeans(p.Row_undisp_flg5);
		p.Row_fix5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix5_META);
		p.RowPanel.add(p.Row_undisp_flg5);
		p.Row_undisp_flg5.setNextBeans(p.Row_num_pad_str5);
		p.Row_undisp_flg5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg5_META);
		p.RowPanel.add(p.Row_num_pad_str5_Label);
		p.RowPanel.add(p.Row_num_pad_str5);
		p.Row_num_pad_str5.setNextBeans(p.Row_elm_typ6);
		p.Row_num_pad_str5.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str5_META);
		p.Row_elm_typ6.setListType(MCListType.STRICT);
		p.Row_elm_typ6.setLinkBeans(p.Row_elm_typ_nm6);
		p.RowPanel.add(p.Row_elm_typ6_Label);
		p.RowPanel.add(p.Row_elm_typ6);
		p.Row_elm_typ6.setNextBeans(p.Row_elm_typ_nm6);
		p.Row_elm_typ6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ6_META);
		p.RowPanel.add(p.Row_elm_typ_nm6);
		p.Row_elm_typ_nm6.setNextBeans(p.Row_elm_dgt6);
		p.Row_elm_typ_nm6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm6_META);
		p.RowPanel.add(p.Row_elm_dgt6_Label);
		p.RowPanel.add(p.Row_elm_dgt6);
		p.Row_elm_dgt6.setNextBeans(p.Row_fix6);
		p.Row_elm_dgt6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt6_META);
		p.RowPanel.add(p.Row_fix6_Label);
		p.RowPanel.add(p.Row_fix6);
		p.Row_fix6.setNextBeans(p.Row_undisp_flg6);
		p.Row_fix6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix6_META);
		p.RowPanel.add(p.Row_undisp_flg6);
		p.Row_undisp_flg6.setNextBeans(p.Row_num_pad_str6);
		p.Row_undisp_flg6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg6_META);
		p.RowPanel.add(p.Row_num_pad_str6_Label);
		p.RowPanel.add(p.Row_num_pad_str6);
		p.Row_num_pad_str6.setNextBeans(p.Row_elm_typ7);
		p.Row_num_pad_str6.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str6_META);
		p.Row_elm_typ7.setListType(MCListType.STRICT);
		p.Row_elm_typ7.setLinkBeans(p.Row_elm_typ_nm7);
		p.RowPanel.add(p.Row_elm_typ7_Label);
		p.RowPanel.add(p.Row_elm_typ7);
		p.Row_elm_typ7.setNextBeans(p.Row_elm_typ_nm7);
		p.Row_elm_typ7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ7_META);
		p.RowPanel.add(p.Row_elm_typ_nm7);
		p.Row_elm_typ_nm7.setNextBeans(p.Row_elm_dgt7);
		p.Row_elm_typ_nm7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm7_META);
		p.RowPanel.add(p.Row_elm_dgt7_Label);
		p.RowPanel.add(p.Row_elm_dgt7);
		p.Row_elm_dgt7.setNextBeans(p.Row_fix7);
		p.Row_elm_dgt7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt7_META);
		p.RowPanel.add(p.Row_fix7_Label);
		p.RowPanel.add(p.Row_fix7);
		p.Row_fix7.setNextBeans(p.Row_undisp_flg7);
		p.Row_fix7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix7_META);
		p.RowPanel.add(p.Row_undisp_flg7);
		p.Row_undisp_flg7.setNextBeans(p.Row_num_pad_str7);
		p.Row_undisp_flg7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg7_META);
		p.RowPanel.add(p.Row_num_pad_str7_Label);
		p.RowPanel.add(p.Row_num_pad_str7);
		p.Row_num_pad_str7.setNextBeans(p.Row_elm_typ8);
		p.Row_num_pad_str7.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str7_META);
		p.Row_elm_typ8.setListType(MCListType.STRICT);
		p.Row_elm_typ8.setLinkBeans(p.Row_elm_typ_nm8);
		p.RowPanel.add(p.Row_elm_typ8_Label);
		p.RowPanel.add(p.Row_elm_typ8);
		p.Row_elm_typ8.setNextBeans(p.Row_elm_typ_nm8);
		p.Row_elm_typ8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ8_META);
		p.RowPanel.add(p.Row_elm_typ_nm8);
		p.Row_elm_typ_nm8.setNextBeans(p.Row_elm_dgt8);
		p.Row_elm_typ_nm8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm8_META);
		p.RowPanel.add(p.Row_elm_dgt8_Label);
		p.RowPanel.add(p.Row_elm_dgt8);
		p.Row_elm_dgt8.setNextBeans(p.Row_fix8);
		p.Row_elm_dgt8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt8_META);
		p.RowPanel.add(p.Row_fix8_Label);
		p.RowPanel.add(p.Row_fix8);
		p.Row_fix8.setNextBeans(p.Row_undisp_flg8);
		p.Row_fix8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix8_META);
		p.RowPanel.add(p.Row_undisp_flg8);
		p.Row_undisp_flg8.setNextBeans(p.Row_num_pad_str8);
		p.Row_undisp_flg8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg8_META);
		p.RowPanel.add(p.Row_num_pad_str8_Label);
		p.RowPanel.add(p.Row_num_pad_str8);
		p.Row_num_pad_str8.setNextBeans(p.Row_elm_typ9);
		p.Row_num_pad_str8.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str8_META);
		p.Row_elm_typ9.setListType(MCListType.STRICT);
		p.Row_elm_typ9.setLinkBeans(p.Row_elm_typ_nm9);
		p.RowPanel.add(p.Row_elm_typ9_Label);
		p.RowPanel.add(p.Row_elm_typ9);
		p.Row_elm_typ9.setNextBeans(p.Row_elm_typ_nm9);
		p.Row_elm_typ9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ9_META);
		p.RowPanel.add(p.Row_elm_typ_nm9);
		p.Row_elm_typ_nm9.setNextBeans(p.Row_elm_dgt9);
		p.Row_elm_typ_nm9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm9_META);
		p.RowPanel.add(p.Row_elm_dgt9_Label);
		p.RowPanel.add(p.Row_elm_dgt9);
		p.Row_elm_dgt9.setNextBeans(p.Row_fix9);
		p.Row_elm_dgt9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt9_META);
		p.RowPanel.add(p.Row_fix9_Label);
		p.RowPanel.add(p.Row_fix9);
		p.Row_fix9.setNextBeans(p.Row_undisp_flg9);
		p.Row_fix9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix9_META);
		p.RowPanel.add(p.Row_undisp_flg9);
		p.Row_undisp_flg9.setNextBeans(p.Row_num_pad_str9);
		p.Row_undisp_flg9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg9_META);
		p.RowPanel.add(p.Row_num_pad_str9_Label);
		p.RowPanel.add(p.Row_num_pad_str9);
		p.Row_num_pad_str9.setNextBeans(p.Row_elm_typ10);
		p.Row_num_pad_str9.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str9_META);
		p.Row_elm_typ10.setListType(MCListType.STRICT);
		p.Row_elm_typ10.setLinkBeans(p.Row_elm_typ_nm10);
		p.RowPanel.add(p.Row_elm_typ10_Label);
		p.RowPanel.add(p.Row_elm_typ10);
		p.Row_elm_typ10.setNextBeans(p.Row_elm_typ_nm10);
		p.Row_elm_typ10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ10_META);
		p.RowPanel.add(p.Row_elm_typ_nm10);
		p.Row_elm_typ_nm10.setNextBeans(p.Row_elm_dgt10);
		p.Row_elm_typ_nm10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_typ_nm10_META);
		p.RowPanel.add(p.Row_elm_dgt10_Label);
		p.RowPanel.add(p.Row_elm_dgt10);
		p.Row_elm_dgt10.setNextBeans(p.Row_fix10);
		p.Row_elm_dgt10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.elm_dgt10_META);
		p.RowPanel.add(p.Row_fix10_Label);
		p.RowPanel.add(p.Row_fix10);
		p.Row_fix10.setNextBeans(p.Row_undisp_flg10);
		p.Row_fix10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.fix10_META);
		p.RowPanel.add(p.Row_undisp_flg10);
		p.Row_undisp_flg10.setNextBeans(p.Row_num_pad_str10);
		p.Row_undisp_flg10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.undisp_flg10_META);
		p.RowPanel.add(p.Row_num_pad_str10_Label);
		p.RowPanel.add(p.Row_num_pad_str10);
		p.Row_num_pad_str10.setNextBeans(p.Row_num_img);
		p.Row_num_pad_str10.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_pad_str10_META);
		p.RowPanel.add(p.Row_num_img_Label);
		p.RowPanel.add(p.Row_num_img);
		p.Row_num_img.setNextBeans(p.Row_def_seq_typ);
		p.Row_num_img.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.num_img_META);
		p.Row_def_seq_typ.setListType(MCListType.STRICT);
		p.Row_def_seq_typ.setLinkBeans(p.Row_def_seq_typ_nm);
		p.RowPanel.add(p.Row_def_seq_typ_Label);
		p.RowPanel.add(p.Row_def_seq_typ);
		p.Row_def_seq_typ.setNextBeans(p.Row_def_seq_typ_nm);
		p.Row_def_seq_typ.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.def_seq_typ_META);
		p.RowPanel.add(p.Row_def_seq_typ_nm);
		p.Row_def_seq_typ_nm.setNextBeans(p.Row_memo1);
		p.Row_def_seq_typ_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.def_seq_typ_nm_META);
		p.RowPanel.add(p.Row_memo1_Label);
		p.RowPanel.add(p.Row_memo1);
		p.Row_memo1.setNextBeans(p.Row_memo2);
		p.Row_memo1.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.memo1_META);
		p.RowPanel.add(p.Row_memo2_Label);
		p.RowPanel.add(p.Row_memo2);
		p.Row_memo2.setNextBeans(p.Row_memo3);
		p.Row_memo2.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.memo2_META);
		p.RowPanel.add(p.Row_memo3_Label);
		p.RowPanel.add(p.Row_memo3);
		p.Row_memo3.setNextBeans(p.Row_del_flg);
		p.Row_memo3.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.memo3_META);
		p.RowPanel.add(p.Row_del_flg);
		p.Row_del_flg.setRow(p.getRowR(), mcframe.clientMABC.MABCP0810.RowR.del_flg_META);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
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
	protected static void jbInitLcl(MABCP_NumPtnReg p) {
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
	protected static void jbInitLclBtn(MABCP_NumPtnReg p) {
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
	protected static void jbInitBtn(MABCP_NumPtnReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0800.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP0800);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP0800);
		p.Btn_open_MABCP0800.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_NumPtnReg p) {
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
		MABCP_NumPtnReg_MC.mcInitScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitTop((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitFold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitCnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitCtrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitDtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitDtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitLTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitLclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitDtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitRow((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitLclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitLcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitLclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.mcInitEastBtn((MABCP_NumPtnReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_NumPtnReg_MC.statusInitUPD_ScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Top((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Fold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Cnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Ctrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Wrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Dtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_DtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_LTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_LclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_DtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Row((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_LclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Lcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_LclAll((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_LclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_Btn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitUPD_EastBtn((MABCP_NumPtnReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_NumPtnReg_MC.statusInitFIX_ScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Top((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Fold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Cnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Ctrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Wrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Dtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_DtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_LTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_LclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_DtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Row((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_LclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Lcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_LclAll((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_LclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_Btn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitFIX_EastBtn((MABCP_NumPtnReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_NumPtnReg_MC.statusInitDEL_ScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Top((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Fold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Cnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Ctrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Wrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Dtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_DtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_LTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_LclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_DtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Row((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_LclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Lcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_LclAll((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_LclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_Btn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitDEL_EastBtn((MABCP_NumPtnReg)this);

		// [REF]ステータスのモードの設定
		MABCP_NumPtnReg_MC.statusInitREF_ScreenOpe((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Top((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Fold((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Cnd((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Ctrl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Wrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Dtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_DtlBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_LTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_LclTab((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_DtlSub((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Row((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_LclWrk((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Lcl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_LclAll((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_LclBtn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_Btn((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.statusInitREF_EastBtn((MABCP_NumPtnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_NumPtnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_num_biz_typ.setListListener(p);
		p.Cnd_num_biz_typ.addAllListener(p);
		p.Cnd_num_biz_typ_nm.setListListener(p);
		p.Cnd_num_biz_typ_nm.addAllListener(p);
		p.Cnd_num_ptn_cd.setListListener(p);
		p.Cnd_num_ptn_cd.addAllListener(p);
		p.Cnd_num_ptn_nm.setListListener(p);
		p.Cnd_num_ptn_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABCP_NumPtnReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_NumPtnReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_num_biz_typ.addAllListener(p);
		p.columnDtl_num_biz_typ.setListListener(p);
		p.columnDtl_num_biz_typ_nm.addAllListener(p);
		p.columnDtl_num_biz_typ_nm.setListListener(p);
		p.columnDtl_max_digit.addAllListener(p);
		p.columnDtl_max_digit.setListListener(p);
		p.columnDtl_num_ptn_cd.addAllListener(p);
		p.columnDtl_num_ptn_cd.setListListener(p);
		p.columnDtl_num_ptn_nm_lcl.addAllListener(p);
		p.columnDtl_num_ptn_nm_lcl.setListListener(p);
		p.columnDtl_num_ptn_nm.addAllListener(p);
		p.columnDtl_num_ptn_nm.setListListener(p);
		p.columnDtl_key_dgt.addAllListener(p);
		p.columnDtl_key_dgt.setListListener(p);
		p.columnDtl_elm_typ1.addAllListener(p);
		p.columnDtl_elm_typ1.setListListener(p);
		p.columnDtl_elm_typ_nm1.addAllListener(p);
		p.columnDtl_elm_typ_nm1.setListListener(p);
		p.columnDtl_elm_dgt1.addAllListener(p);
		p.columnDtl_elm_dgt1.setListListener(p);
		p.columnDtl_fix1.addAllListener(p);
		p.columnDtl_fix1.setListListener(p);
		p.columnDtl_undisp_flg1.addAllListener(p);
		p.columnDtl_num_pad_str1.addAllListener(p);
		p.columnDtl_num_pad_str1.setListListener(p);
		p.columnDtl_elm_typ2.addAllListener(p);
		p.columnDtl_elm_typ2.setListListener(p);
		p.columnDtl_elm_typ_nm2.addAllListener(p);
		p.columnDtl_elm_typ_nm2.setListListener(p);
		p.columnDtl_elm_dgt2.addAllListener(p);
		p.columnDtl_elm_dgt2.setListListener(p);
		p.columnDtl_fix2.addAllListener(p);
		p.columnDtl_fix2.setListListener(p);
		p.columnDtl_undisp_flg2.addAllListener(p);
		p.columnDtl_num_pad_str2.addAllListener(p);
		p.columnDtl_num_pad_str2.setListListener(p);
		p.columnDtl_elm_typ3.addAllListener(p);
		p.columnDtl_elm_typ3.setListListener(p);
		p.columnDtl_elm_typ_nm3.addAllListener(p);
		p.columnDtl_elm_typ_nm3.setListListener(p);
		p.columnDtl_elm_dgt3.addAllListener(p);
		p.columnDtl_elm_dgt3.setListListener(p);
		p.columnDtl_fix3.addAllListener(p);
		p.columnDtl_fix3.setListListener(p);
		p.columnDtl_undisp_flg3.addAllListener(p);
		p.columnDtl_num_pad_str3.addAllListener(p);
		p.columnDtl_num_pad_str3.setListListener(p);
		p.columnDtl_elm_typ4.addAllListener(p);
		p.columnDtl_elm_typ4.setListListener(p);
		p.columnDtl_elm_typ_nm4.addAllListener(p);
		p.columnDtl_elm_typ_nm4.setListListener(p);
		p.columnDtl_elm_dgt4.addAllListener(p);
		p.columnDtl_elm_dgt4.setListListener(p);
		p.columnDtl_fix4.addAllListener(p);
		p.columnDtl_fix4.setListListener(p);
		p.columnDtl_undisp_flg4.addAllListener(p);
		p.columnDtl_num_pad_str4.addAllListener(p);
		p.columnDtl_num_pad_str4.setListListener(p);
		p.columnDtl_elm_typ5.addAllListener(p);
		p.columnDtl_elm_typ5.setListListener(p);
		p.columnDtl_elm_typ_nm5.addAllListener(p);
		p.columnDtl_elm_typ_nm5.setListListener(p);
		p.columnDtl_elm_dgt5.addAllListener(p);
		p.columnDtl_elm_dgt5.setListListener(p);
		p.columnDtl_fix5.addAllListener(p);
		p.columnDtl_fix5.setListListener(p);
		p.columnDtl_undisp_flg5.addAllListener(p);
		p.columnDtl_num_pad_str5.addAllListener(p);
		p.columnDtl_num_pad_str5.setListListener(p);
		p.columnDtl_elm_typ6.addAllListener(p);
		p.columnDtl_elm_typ6.setListListener(p);
		p.columnDtl_elm_typ_nm6.addAllListener(p);
		p.columnDtl_elm_typ_nm6.setListListener(p);
		p.columnDtl_elm_dgt6.addAllListener(p);
		p.columnDtl_elm_dgt6.setListListener(p);
		p.columnDtl_fix6.addAllListener(p);
		p.columnDtl_fix6.setListListener(p);
		p.columnDtl_undisp_flg6.addAllListener(p);
		p.columnDtl_num_pad_str6.addAllListener(p);
		p.columnDtl_num_pad_str6.setListListener(p);
		p.columnDtl_elm_typ7.addAllListener(p);
		p.columnDtl_elm_typ7.setListListener(p);
		p.columnDtl_elm_typ_nm7.addAllListener(p);
		p.columnDtl_elm_typ_nm7.setListListener(p);
		p.columnDtl_elm_dgt7.addAllListener(p);
		p.columnDtl_elm_dgt7.setListListener(p);
		p.columnDtl_fix7.addAllListener(p);
		p.columnDtl_fix7.setListListener(p);
		p.columnDtl_undisp_flg7.addAllListener(p);
		p.columnDtl_num_pad_str7.addAllListener(p);
		p.columnDtl_num_pad_str7.setListListener(p);
		p.columnDtl_elm_typ8.addAllListener(p);
		p.columnDtl_elm_typ8.setListListener(p);
		p.columnDtl_elm_typ_nm8.addAllListener(p);
		p.columnDtl_elm_typ_nm8.setListListener(p);
		p.columnDtl_elm_dgt8.addAllListener(p);
		p.columnDtl_elm_dgt8.setListListener(p);
		p.columnDtl_fix8.addAllListener(p);
		p.columnDtl_fix8.setListListener(p);
		p.columnDtl_undisp_flg8.addAllListener(p);
		p.columnDtl_num_pad_str8.addAllListener(p);
		p.columnDtl_num_pad_str8.setListListener(p);
		p.columnDtl_elm_typ9.addAllListener(p);
		p.columnDtl_elm_typ9.setListListener(p);
		p.columnDtl_elm_typ_nm9.addAllListener(p);
		p.columnDtl_elm_typ_nm9.setListListener(p);
		p.columnDtl_elm_dgt9.addAllListener(p);
		p.columnDtl_elm_dgt9.setListListener(p);
		p.columnDtl_fix9.addAllListener(p);
		p.columnDtl_fix9.setListListener(p);
		p.columnDtl_undisp_flg9.addAllListener(p);
		p.columnDtl_num_pad_str9.addAllListener(p);
		p.columnDtl_num_pad_str9.setListListener(p);
		p.columnDtl_elm_typ10.addAllListener(p);
		p.columnDtl_elm_typ10.setListListener(p);
		p.columnDtl_elm_typ_nm10.addAllListener(p);
		p.columnDtl_elm_typ_nm10.setListListener(p);
		p.columnDtl_elm_dgt10.addAllListener(p);
		p.columnDtl_elm_dgt10.setListListener(p);
		p.columnDtl_fix10.addAllListener(p);
		p.columnDtl_fix10.setListListener(p);
		p.columnDtl_undisp_flg10.addAllListener(p);
		p.columnDtl_num_pad_str10.addAllListener(p);
		p.columnDtl_num_pad_str10.setListListener(p);
		p.columnDtl_def_seq_typ.addAllListener(p);
		p.columnDtl_def_seq_typ.setListListener(p);
		p.columnDtl_def_seq_typ_nm.addAllListener(p);
		p.columnDtl_def_seq_typ_nm.setListListener(p);
		p.columnDtl_num_img.addAllListener(p);
		p.columnDtl_num_img.setListListener(p);
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
	protected static void mcInitDtlBtn(MABCP_NumPtnReg p) {
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
	 *  [LTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLTab(MABCP_NumPtnReg p) {
	}

	/**
	 *  [LclTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclTab(MABCP_NumPtnReg p) {
		p.LclTabTab.addAllListener(p);
	}

	/**
	 *  [DtlSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSub(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Row]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRow(MABCP_NumPtnReg p) {
		p.Row_num_biz_typ.setListListener(p);
		p.Row_num_biz_typ.addAllListener(p);
		p.Row_num_biz_typ_nm.setListListener(p);
		p.Row_num_biz_typ_nm.addAllListener(p);
		p.Row_max_digit.setListListener(p);
		p.Row_max_digit.addAllListener(p);
		p.Row_num_ptn_cd.setListListener(p);
		p.Row_num_ptn_cd.addAllListener(p);
		p.Row_num_ptn_nm_lcl.setListListener(p);
		p.Row_num_ptn_nm_lcl.addAllListener(p);
		p.Row_num_ptn_nm.setListListener(p);
		p.Row_num_ptn_nm.addAllListener(p);
		p.Row_key_dgt.setListListener(p);
		p.Row_key_dgt.addAllListener(p);
		p.Row_elm_typ1.setListListener(p);
		p.Row_elm_typ1.addAllListener(p);
		p.Row_elm_typ_nm1.setListListener(p);
		p.Row_elm_typ_nm1.addAllListener(p);
		p.Row_elm_dgt1.setListListener(p);
		p.Row_elm_dgt1.addAllListener(p);
		p.Row_fix1.setListListener(p);
		p.Row_fix1.addAllListener(p);
		p.Row_undisp_flg1.addAllListener(p);
		p.Row_num_pad_str1.setListListener(p);
		p.Row_num_pad_str1.addAllListener(p);
		p.Row_elm_typ2.setListListener(p);
		p.Row_elm_typ2.addAllListener(p);
		p.Row_elm_typ_nm2.setListListener(p);
		p.Row_elm_typ_nm2.addAllListener(p);
		p.Row_elm_dgt2.setListListener(p);
		p.Row_elm_dgt2.addAllListener(p);
		p.Row_fix2.setListListener(p);
		p.Row_fix2.addAllListener(p);
		p.Row_undisp_flg2.addAllListener(p);
		p.Row_num_pad_str2.setListListener(p);
		p.Row_num_pad_str2.addAllListener(p);
		p.Row_elm_typ3.setListListener(p);
		p.Row_elm_typ3.addAllListener(p);
		p.Row_elm_typ_nm3.setListListener(p);
		p.Row_elm_typ_nm3.addAllListener(p);
		p.Row_elm_dgt3.setListListener(p);
		p.Row_elm_dgt3.addAllListener(p);
		p.Row_fix3.setListListener(p);
		p.Row_fix3.addAllListener(p);
		p.Row_undisp_flg3.addAllListener(p);
		p.Row_num_pad_str3.setListListener(p);
		p.Row_num_pad_str3.addAllListener(p);
		p.Row_elm_typ4.setListListener(p);
		p.Row_elm_typ4.addAllListener(p);
		p.Row_elm_typ_nm4.setListListener(p);
		p.Row_elm_typ_nm4.addAllListener(p);
		p.Row_elm_dgt4.setListListener(p);
		p.Row_elm_dgt4.addAllListener(p);
		p.Row_fix4.setListListener(p);
		p.Row_fix4.addAllListener(p);
		p.Row_undisp_flg4.addAllListener(p);
		p.Row_num_pad_str4.setListListener(p);
		p.Row_num_pad_str4.addAllListener(p);
		p.Row_elm_typ5.setListListener(p);
		p.Row_elm_typ5.addAllListener(p);
		p.Row_elm_typ_nm5.setListListener(p);
		p.Row_elm_typ_nm5.addAllListener(p);
		p.Row_elm_dgt5.setListListener(p);
		p.Row_elm_dgt5.addAllListener(p);
		p.Row_fix5.setListListener(p);
		p.Row_fix5.addAllListener(p);
		p.Row_undisp_flg5.addAllListener(p);
		p.Row_num_pad_str5.setListListener(p);
		p.Row_num_pad_str5.addAllListener(p);
		p.Row_elm_typ6.setListListener(p);
		p.Row_elm_typ6.addAllListener(p);
		p.Row_elm_typ_nm6.setListListener(p);
		p.Row_elm_typ_nm6.addAllListener(p);
		p.Row_elm_dgt6.setListListener(p);
		p.Row_elm_dgt6.addAllListener(p);
		p.Row_fix6.setListListener(p);
		p.Row_fix6.addAllListener(p);
		p.Row_undisp_flg6.addAllListener(p);
		p.Row_num_pad_str6.setListListener(p);
		p.Row_num_pad_str6.addAllListener(p);
		p.Row_elm_typ7.setListListener(p);
		p.Row_elm_typ7.addAllListener(p);
		p.Row_elm_typ_nm7.setListListener(p);
		p.Row_elm_typ_nm7.addAllListener(p);
		p.Row_elm_dgt7.setListListener(p);
		p.Row_elm_dgt7.addAllListener(p);
		p.Row_fix7.setListListener(p);
		p.Row_fix7.addAllListener(p);
		p.Row_undisp_flg7.addAllListener(p);
		p.Row_num_pad_str7.setListListener(p);
		p.Row_num_pad_str7.addAllListener(p);
		p.Row_elm_typ8.setListListener(p);
		p.Row_elm_typ8.addAllListener(p);
		p.Row_elm_typ_nm8.setListListener(p);
		p.Row_elm_typ_nm8.addAllListener(p);
		p.Row_elm_dgt8.setListListener(p);
		p.Row_elm_dgt8.addAllListener(p);
		p.Row_fix8.setListListener(p);
		p.Row_fix8.addAllListener(p);
		p.Row_undisp_flg8.addAllListener(p);
		p.Row_num_pad_str8.setListListener(p);
		p.Row_num_pad_str8.addAllListener(p);
		p.Row_elm_typ9.setListListener(p);
		p.Row_elm_typ9.addAllListener(p);
		p.Row_elm_typ_nm9.setListListener(p);
		p.Row_elm_typ_nm9.addAllListener(p);
		p.Row_elm_dgt9.setListListener(p);
		p.Row_elm_dgt9.addAllListener(p);
		p.Row_fix9.setListListener(p);
		p.Row_fix9.addAllListener(p);
		p.Row_undisp_flg9.addAllListener(p);
		p.Row_num_pad_str9.setListListener(p);
		p.Row_num_pad_str9.addAllListener(p);
		p.Row_elm_typ10.setListListener(p);
		p.Row_elm_typ10.addAllListener(p);
		p.Row_elm_typ_nm10.setListListener(p);
		p.Row_elm_typ_nm10.addAllListener(p);
		p.Row_elm_dgt10.setListListener(p);
		p.Row_elm_dgt10.addAllListener(p);
		p.Row_fix10.setListListener(p);
		p.Row_fix10.addAllListener(p);
		p.Row_undisp_flg10.addAllListener(p);
		p.Row_num_pad_str10.setListListener(p);
		p.Row_num_pad_str10.addAllListener(p);
		p.Row_num_img.setListListener(p);
		p.Row_num_img.addAllListener(p);
		p.Row_def_seq_typ.setListListener(p);
		p.Row_def_seq_typ.addAllListener(p);
		p.Row_def_seq_typ_nm.setListListener(p);
		p.Row_def_seq_typ_nm.addAllListener(p);
		p.Row_memo1.setListListener(p);
		p.Row_memo1.addAllListener(p);
		p.Row_memo2.setListListener(p);
		p.Row_memo2.addAllListener(p);
		p.Row_memo3.setListListener(p);
		p.Row_memo3.addAllListener(p);
		p.Row_del_flg.addAllListener(p);
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_NumPtnReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_NumPtnReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_num_biz_typ.addAllListener(p);
		p.columnLcl_num_biz_typ.setListListener(p);
		p.columnLcl_num_ptn_cd.addAllListener(p);
		p.columnLcl_num_ptn_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_num_ptn_nm.addAllListener(p);
		p.columnLcl_num_ptn_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABCP_NumPtnReg p) {
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
	protected static void mcInitBtn(MABCP_NumPtnReg p) {
		p.Btn_open_MABCP0800.addAllListener(p);
		p.Btn_open_MABCP0800.setAPMethodName("doBtn_open_MABCP0800");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_NumPtnReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_NumPtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_NumPtnReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_max_digit.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_key_dgt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_img.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_DtlBtn(MABCP_NumPtnReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LTab(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[LclTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclTab(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSub(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Row(MABCP_NumPtnReg p){
		p.Row_num_biz_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_num_biz_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_max_digit.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_num_ptn_nm_lcl.putMode(p, UPD, MCMode.INVISIBLE);
		p.Row_num_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Row_key_dgt.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ1.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_elm_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt1.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix1.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg1.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_num_pad_str1.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ2.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt2.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix2.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg2.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str2.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ3.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt3.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix3.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg3.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str3.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ4.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt4.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix4.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg4.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str4.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ5.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt5.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix5.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg5.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str5.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ6.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt6.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix6.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg6.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str6.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ7.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt7.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix7.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg7.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str7.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ8.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt8.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix8.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg8.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str8.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ9.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt9.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix9.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg9.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str9.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ10.putMode(p, UPD, MCMode.ENABLE);
		p.Row_elm_typ_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_elm_dgt10.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_fix10.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_undisp_flg10.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_pad_str10.putMode(p, UPD, MCMode.ENABLE);
		p.Row_num_img.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_def_seq_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_def_seq_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Row_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Row_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Row_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_NumPtnReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_num_biz_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_num_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_num_ptn_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_NumPtnReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_NumPtnReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_NumPtnReg p){
		p.Btn_open_MABCP0800.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_NumPtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_NumPtnReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_max_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key_dgt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fix10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_img.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABCP_NumPtnReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LTab(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[LclTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclTab(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlSub(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Row(MABCP_NumPtnReg p){
		p.Row_num_biz_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_max_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_ptn_nm_lcl.putMode(p, FIX, MCMode.INVISIBLE);
		p.Row_num_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_key_dgt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_typ_nm10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_elm_dgt10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_fix10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_undisp_flg10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_pad_str10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_num_img.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_def_seq_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_def_seq_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_del_flg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_NumPtnReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_num_biz_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_num_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_num_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_NumPtnReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_NumPtnReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_NumPtnReg p){
		p.Btn_open_MABCP0800.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_NumPtnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_NumPtnReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_max_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key_dgt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_img.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABCP_NumPtnReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LTab(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[LclTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclTab(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlSub(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Row(MABCP_NumPtnReg p){
		p.Row_num_biz_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_max_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_ptn_nm_lcl.putMode(p, DEL, MCMode.INVISIBLE);
		p.Row_num_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_key_dgt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_typ_nm10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_elm_dgt10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_fix10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_undisp_flg10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_pad_str10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_num_img.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_def_seq_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_def_seq_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_del_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_NumPtnReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_num_biz_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_num_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_num_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_NumPtnReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_NumPtnReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_NumPtnReg p){
		p.Btn_open_MABCP0800.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_NumPtnReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_num_biz_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_num_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_num_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_NumPtnReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_max_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_key_dgt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_typ_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_elm_dgt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_undisp_flg10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_pad_str10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_seq_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_img.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABCP_NumPtnReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_LTab(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[LclTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclTab(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSub(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitREF_Row(MABCP_NumPtnReg p){
		p.Row_num_biz_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_max_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_ptn_nm_lcl.putMode(p, REF, MCMode.INVISIBLE);
		p.Row_num_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_key_dgt.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str4.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str5.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str6.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str7.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str8.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str9.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_typ_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_elm_dgt10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_fix10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_undisp_flg10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_pad_str10.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_num_img.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_def_seq_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_def_seq_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_del_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_NumPtnReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_num_biz_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_num_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_num_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_NumPtnReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_NumPtnReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_NumPtnReg p){
		p.Btn_open_MABCP0800.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_NumPtnReg p){

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
		MABCP_NumPtnReg_MC.setTableConfigDtl((MABCP_NumPtnReg)this);
		MABCP_NumPtnReg_MC.setTableConfigLcl((MABCP_NumPtnReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_NumPtnReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0810.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0810.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_num_biz_typ.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_biz_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_biz_typ);
		p.columnDtl_num_biz_typ_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_biz_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_biz_typ_nm);
		p.columnDtl_max_digit.setMeta(mcframe.clientMABC.MABCP0810.DtlR.max_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_max_digit);
		p.columnDtl_num_ptn_cd.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_ptn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_ptn_cd);
		p.columnDtl_num_ptn_nm_lcl.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_ptn_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_ptn_nm_lcl);
		p.columnDtl_num_ptn_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_ptn_nm);
		p.columnDtl_key_dgt.setMeta(mcframe.clientMABC.MABCP0810.DtlR.key_dgt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key_dgt);
		p.columnDtl_elm_typ1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ1);
		p.columnDtl_elm_typ_nm1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm1);
		p.columnDtl_elm_dgt1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt1);
		p.columnDtl_fix1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix1);
		p.columnDtl_undisp_flg1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg1);
		p.columnDtl_num_pad_str1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str1);
		p.columnDtl_elm_typ2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ2);
		p.columnDtl_elm_typ_nm2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm2);
		p.columnDtl_elm_dgt2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt2);
		p.columnDtl_fix2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix2);
		p.columnDtl_undisp_flg2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg2);
		p.columnDtl_num_pad_str2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str2);
		p.columnDtl_elm_typ3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ3);
		p.columnDtl_elm_typ_nm3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm3);
		p.columnDtl_elm_dgt3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt3);
		p.columnDtl_fix3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix3);
		p.columnDtl_undisp_flg3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg3);
		p.columnDtl_num_pad_str3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str3);
		p.columnDtl_elm_typ4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ4);
		p.columnDtl_elm_typ_nm4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm4);
		p.columnDtl_elm_dgt4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt4);
		p.columnDtl_fix4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix4);
		p.columnDtl_undisp_flg4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg4);
		p.columnDtl_num_pad_str4.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str4);
		p.columnDtl_elm_typ5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ5);
		p.columnDtl_elm_typ_nm5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm5);
		p.columnDtl_elm_dgt5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt5);
		p.columnDtl_fix5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix5);
		p.columnDtl_undisp_flg5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg5);
		p.columnDtl_num_pad_str5.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str5);
		p.columnDtl_elm_typ6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ6);
		p.columnDtl_elm_typ_nm6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm6);
		p.columnDtl_elm_dgt6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt6);
		p.columnDtl_fix6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix6);
		p.columnDtl_undisp_flg6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg6);
		p.columnDtl_num_pad_str6.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str6);
		p.columnDtl_elm_typ7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ7);
		p.columnDtl_elm_typ_nm7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm7);
		p.columnDtl_elm_dgt7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt7);
		p.columnDtl_fix7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix7);
		p.columnDtl_undisp_flg7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg7);
		p.columnDtl_num_pad_str7.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str7);
		p.columnDtl_elm_typ8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ8);
		p.columnDtl_elm_typ_nm8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm8);
		p.columnDtl_elm_dgt8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt8);
		p.columnDtl_fix8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix8);
		p.columnDtl_undisp_flg8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg8);
		p.columnDtl_num_pad_str8.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str8);
		p.columnDtl_elm_typ9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ9);
		p.columnDtl_elm_typ_nm9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm9);
		p.columnDtl_elm_dgt9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt9);
		p.columnDtl_fix9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix9);
		p.columnDtl_undisp_flg9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg9);
		p.columnDtl_num_pad_str9.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str9);
		p.columnDtl_elm_typ10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ10);
		p.columnDtl_elm_typ_nm10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_typ_nm10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_typ_nm10);
		p.columnDtl_elm_dgt10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.elm_dgt10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_elm_dgt10);
		p.columnDtl_fix10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.fix10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix10);
		p.columnDtl_undisp_flg10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.undisp_flg10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_undisp_flg10);
		p.columnDtl_num_pad_str10.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_pad_str10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_pad_str10);
		p.columnDtl_def_seq_typ.setMeta(mcframe.clientMABC.MABCP0810.DtlR.def_seq_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_seq_typ);
		p.columnDtl_def_seq_typ_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.def_seq_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_seq_typ_nm);
		p.columnDtl_num_img.setMeta(mcframe.clientMABC.MABCP0810.DtlR.num_img_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_img);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0810.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0810.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0810.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0810.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0810.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0810.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0810.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0810.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0810.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0810.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_NumPtnReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0810.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_num_biz_typ.setMeta(mcframe.clientMABC.MABCP0810.LclR.num_biz_typ_META);
		p.LclTable.addColumnConfig(p.columnLcl_num_biz_typ);
		p.columnLcl_num_ptn_cd.setMeta(mcframe.clientMABC.MABCP0810.LclR.num_ptn_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_num_ptn_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0810.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_num_ptn_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.num_ptn_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_num_ptn_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0810.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0810.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0810.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0810.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0810.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0810.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0810.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_num_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_num_biz_typ.getListConfig().setPutter(getCnd_num_biz_typ_ListPutter());
		Cnd_num_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_num_ptn_cd.getListConfig().setPutter(getCnd_num_ptn_cd_ListPutter());
		Row_num_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_num_biz_typ.getListConfig().setPutter(getRow_num_biz_typ_ListPutter());
		Row_elm_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ1.getListConfig().setPutter(getRow_elm_typ1_ListPutter());
		Row_elm_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ2.getListConfig().setPutter(getRow_elm_typ2_ListPutter());
		Row_elm_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ3.getListConfig().setPutter(getRow_elm_typ3_ListPutter());
		Row_elm_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ4.getListConfig().setPutter(getRow_elm_typ4_ListPutter());
		Row_elm_typ5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ5.getListConfig().setPutter(getRow_elm_typ5_ListPutter());
		Row_elm_typ6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ6.getListConfig().setPutter(getRow_elm_typ6_ListPutter());
		Row_elm_typ7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ7.getListConfig().setPutter(getRow_elm_typ7_ListPutter());
		Row_elm_typ8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ8.getListConfig().setPutter(getRow_elm_typ8_ListPutter());
		Row_elm_typ9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ9.getListConfig().setPutter(getRow_elm_typ9_ListPutter());
		Row_elm_typ10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_elm_typ10.getListConfig().setPutter(getRow_elm_typ10_ListPutter());
		Row_def_seq_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Row_def_seq_typ.getListConfig().setPutter(getRow_def_seq_typ_ListPutter());
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
	 * [Cnd_num_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_num_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumBizTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_num_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_num_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Row_num_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createRow_num_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumBizTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ1_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ2_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ3_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ4_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ5_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ6_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ7_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ8_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ9_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_elm_typ10_ListPutter]の作成
	 */
	protected MCListPutter createRow_elm_typ10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ElmTyp");
		return lp;
	}
	 
	/**
	 * [Row_def_seq_typ_ListPutter]の作成
	 */
	protected MCListPutter createRow_def_seq_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SeqTyp");
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
		if(combo == Cnd_num_biz_typ) return getCnd_num_biz_typ(row, info);
		if(combo == Cnd_num_ptn_cd) return getCnd_num_ptn_cd(row, info);
		if(combo == Row_num_biz_typ) return getRow_num_biz_typ(row, info);
		if(combo == Row_elm_typ1) return getRow_elm_typ1(row, info);
		if(combo == Row_elm_typ2) return getRow_elm_typ2(row, info);
		if(combo == Row_elm_typ3) return getRow_elm_typ3(row, info);
		if(combo == Row_elm_typ4) return getRow_elm_typ4(row, info);
		if(combo == Row_elm_typ5) return getRow_elm_typ5(row, info);
		if(combo == Row_elm_typ6) return getRow_elm_typ6(row, info);
		if(combo == Row_elm_typ7) return getRow_elm_typ7(row, info);
		if(combo == Row_elm_typ8) return getRow_elm_typ8(row, info);
		if(combo == Row_elm_typ9) return getRow_elm_typ9(row, info);
		if(combo == Row_elm_typ10) return getRow_elm_typ10(row, info);
		if(combo == Row_def_seq_typ) return getRow_def_seq_typ(row, info);
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
		else if (ap == Btn_open_MABCP0800) doBtn_open_MABCP0800(info);
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
	 * [Btn]パネルの[open_MABCP0800]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0800(MCEventInfo info);

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
		if (vc == LclTabTab) return doLclTab_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_num_biz_typ) return doCnd_num_biz_typ_VC(info);
		if (vc == Cnd_num_biz_typ_nm) return doCnd_num_biz_typ_nm_VC(info);
		if (vc == Cnd_num_ptn_cd) return doCnd_num_ptn_cd_VC(info);
		if (vc == Cnd_num_ptn_nm) return doCnd_num_ptn_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_num_biz_typ) return doDtl_num_biz_typ_VC(info);
		if (vc == columnDtl_num_biz_typ_nm) return doDtl_num_biz_typ_nm_VC(info);
		if (vc == columnDtl_max_digit) return doDtl_max_digit_VC(info);
		if (vc == columnDtl_num_ptn_cd) return doDtl_num_ptn_cd_VC(info);
		if (vc == columnDtl_num_ptn_nm_lcl) return doDtl_num_ptn_nm_lcl_VC(info);
		if (vc == columnDtl_num_ptn_nm) return doDtl_num_ptn_nm_VC(info);
		if (vc == columnDtl_key_dgt) return doDtl_key_dgt_VC(info);
		if (vc == columnDtl_elm_typ1) return doDtl_elm_typ1_VC(info);
		if (vc == columnDtl_elm_typ_nm1) return doDtl_elm_typ_nm1_VC(info);
		if (vc == columnDtl_elm_dgt1) return doDtl_elm_dgt1_VC(info);
		if (vc == columnDtl_fix1) return doDtl_fix1_VC(info);
		if (vc == columnDtl_undisp_flg1) return doDtl_undisp_flg1_VC(info);
		if (vc == columnDtl_num_pad_str1) return doDtl_num_pad_str1_VC(info);
		if (vc == columnDtl_elm_typ2) return doDtl_elm_typ2_VC(info);
		if (vc == columnDtl_elm_typ_nm2) return doDtl_elm_typ_nm2_VC(info);
		if (vc == columnDtl_elm_dgt2) return doDtl_elm_dgt2_VC(info);
		if (vc == columnDtl_fix2) return doDtl_fix2_VC(info);
		if (vc == columnDtl_undisp_flg2) return doDtl_undisp_flg2_VC(info);
		if (vc == columnDtl_num_pad_str2) return doDtl_num_pad_str2_VC(info);
		if (vc == columnDtl_elm_typ3) return doDtl_elm_typ3_VC(info);
		if (vc == columnDtl_elm_typ_nm3) return doDtl_elm_typ_nm3_VC(info);
		if (vc == columnDtl_elm_dgt3) return doDtl_elm_dgt3_VC(info);
		if (vc == columnDtl_fix3) return doDtl_fix3_VC(info);
		if (vc == columnDtl_undisp_flg3) return doDtl_undisp_flg3_VC(info);
		if (vc == columnDtl_num_pad_str3) return doDtl_num_pad_str3_VC(info);
		if (vc == columnDtl_elm_typ4) return doDtl_elm_typ4_VC(info);
		if (vc == columnDtl_elm_typ_nm4) return doDtl_elm_typ_nm4_VC(info);
		if (vc == columnDtl_elm_dgt4) return doDtl_elm_dgt4_VC(info);
		if (vc == columnDtl_fix4) return doDtl_fix4_VC(info);
		if (vc == columnDtl_undisp_flg4) return doDtl_undisp_flg4_VC(info);
		if (vc == columnDtl_num_pad_str4) return doDtl_num_pad_str4_VC(info);
		if (vc == columnDtl_elm_typ5) return doDtl_elm_typ5_VC(info);
		if (vc == columnDtl_elm_typ_nm5) return doDtl_elm_typ_nm5_VC(info);
		if (vc == columnDtl_elm_dgt5) return doDtl_elm_dgt5_VC(info);
		if (vc == columnDtl_fix5) return doDtl_fix5_VC(info);
		if (vc == columnDtl_undisp_flg5) return doDtl_undisp_flg5_VC(info);
		if (vc == columnDtl_num_pad_str5) return doDtl_num_pad_str5_VC(info);
		if (vc == columnDtl_elm_typ6) return doDtl_elm_typ6_VC(info);
		if (vc == columnDtl_elm_typ_nm6) return doDtl_elm_typ_nm6_VC(info);
		if (vc == columnDtl_elm_dgt6) return doDtl_elm_dgt6_VC(info);
		if (vc == columnDtl_fix6) return doDtl_fix6_VC(info);
		if (vc == columnDtl_undisp_flg6) return doDtl_undisp_flg6_VC(info);
		if (vc == columnDtl_num_pad_str6) return doDtl_num_pad_str6_VC(info);
		if (vc == columnDtl_elm_typ7) return doDtl_elm_typ7_VC(info);
		if (vc == columnDtl_elm_typ_nm7) return doDtl_elm_typ_nm7_VC(info);
		if (vc == columnDtl_elm_dgt7) return doDtl_elm_dgt7_VC(info);
		if (vc == columnDtl_fix7) return doDtl_fix7_VC(info);
		if (vc == columnDtl_undisp_flg7) return doDtl_undisp_flg7_VC(info);
		if (vc == columnDtl_num_pad_str7) return doDtl_num_pad_str7_VC(info);
		if (vc == columnDtl_elm_typ8) return doDtl_elm_typ8_VC(info);
		if (vc == columnDtl_elm_typ_nm8) return doDtl_elm_typ_nm8_VC(info);
		if (vc == columnDtl_elm_dgt8) return doDtl_elm_dgt8_VC(info);
		if (vc == columnDtl_fix8) return doDtl_fix8_VC(info);
		if (vc == columnDtl_undisp_flg8) return doDtl_undisp_flg8_VC(info);
		if (vc == columnDtl_num_pad_str8) return doDtl_num_pad_str8_VC(info);
		if (vc == columnDtl_elm_typ9) return doDtl_elm_typ9_VC(info);
		if (vc == columnDtl_elm_typ_nm9) return doDtl_elm_typ_nm9_VC(info);
		if (vc == columnDtl_elm_dgt9) return doDtl_elm_dgt9_VC(info);
		if (vc == columnDtl_fix9) return doDtl_fix9_VC(info);
		if (vc == columnDtl_undisp_flg9) return doDtl_undisp_flg9_VC(info);
		if (vc == columnDtl_num_pad_str9) return doDtl_num_pad_str9_VC(info);
		if (vc == columnDtl_elm_typ10) return doDtl_elm_typ10_VC(info);
		if (vc == columnDtl_elm_typ_nm10) return doDtl_elm_typ_nm10_VC(info);
		if (vc == columnDtl_elm_dgt10) return doDtl_elm_dgt10_VC(info);
		if (vc == columnDtl_fix10) return doDtl_fix10_VC(info);
		if (vc == columnDtl_undisp_flg10) return doDtl_undisp_flg10_VC(info);
		if (vc == columnDtl_num_pad_str10) return doDtl_num_pad_str10_VC(info);
		if (vc == columnDtl_def_seq_typ) return doDtl_def_seq_typ_VC(info);
		if (vc == columnDtl_def_seq_typ_nm) return doDtl_def_seq_typ_nm_VC(info);
		if (vc == columnDtl_num_img) return doDtl_num_img_VC(info);
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
		if (vc == Row_num_biz_typ) return doRow_num_biz_typ_VC(info);
		if (vc == Row_num_biz_typ_nm) return doRow_num_biz_typ_nm_VC(info);
		if (vc == Row_max_digit) return doRow_max_digit_VC(info);
		if (vc == Row_num_ptn_cd) return doRow_num_ptn_cd_VC(info);
		if (vc == Row_num_ptn_nm_lcl) return doRow_num_ptn_nm_lcl_VC(info);
		if (vc == Row_num_ptn_nm) return doRow_num_ptn_nm_VC(info);
		if (vc == Row_key_dgt) return doRow_key_dgt_VC(info);
		if (vc == Row_elm_typ1) return doRow_elm_typ1_VC(info);
		if (vc == Row_elm_typ_nm1) return doRow_elm_typ_nm1_VC(info);
		if (vc == Row_elm_dgt1) return doRow_elm_dgt1_VC(info);
		if (vc == Row_fix1) return doRow_fix1_VC(info);
		if (vc == Row_undisp_flg1) return doRow_undisp_flg1_VC(info);
		if (vc == Row_num_pad_str1) return doRow_num_pad_str1_VC(info);
		if (vc == Row_elm_typ2) return doRow_elm_typ2_VC(info);
		if (vc == Row_elm_typ_nm2) return doRow_elm_typ_nm2_VC(info);
		if (vc == Row_elm_dgt2) return doRow_elm_dgt2_VC(info);
		if (vc == Row_fix2) return doRow_fix2_VC(info);
		if (vc == Row_undisp_flg2) return doRow_undisp_flg2_VC(info);
		if (vc == Row_num_pad_str2) return doRow_num_pad_str2_VC(info);
		if (vc == Row_elm_typ3) return doRow_elm_typ3_VC(info);
		if (vc == Row_elm_typ_nm3) return doRow_elm_typ_nm3_VC(info);
		if (vc == Row_elm_dgt3) return doRow_elm_dgt3_VC(info);
		if (vc == Row_fix3) return doRow_fix3_VC(info);
		if (vc == Row_undisp_flg3) return doRow_undisp_flg3_VC(info);
		if (vc == Row_num_pad_str3) return doRow_num_pad_str3_VC(info);
		if (vc == Row_elm_typ4) return doRow_elm_typ4_VC(info);
		if (vc == Row_elm_typ_nm4) return doRow_elm_typ_nm4_VC(info);
		if (vc == Row_elm_dgt4) return doRow_elm_dgt4_VC(info);
		if (vc == Row_fix4) return doRow_fix4_VC(info);
		if (vc == Row_undisp_flg4) return doRow_undisp_flg4_VC(info);
		if (vc == Row_num_pad_str4) return doRow_num_pad_str4_VC(info);
		if (vc == Row_elm_typ5) return doRow_elm_typ5_VC(info);
		if (vc == Row_elm_typ_nm5) return doRow_elm_typ_nm5_VC(info);
		if (vc == Row_elm_dgt5) return doRow_elm_dgt5_VC(info);
		if (vc == Row_fix5) return doRow_fix5_VC(info);
		if (vc == Row_undisp_flg5) return doRow_undisp_flg5_VC(info);
		if (vc == Row_num_pad_str5) return doRow_num_pad_str5_VC(info);
		if (vc == Row_elm_typ6) return doRow_elm_typ6_VC(info);
		if (vc == Row_elm_typ_nm6) return doRow_elm_typ_nm6_VC(info);
		if (vc == Row_elm_dgt6) return doRow_elm_dgt6_VC(info);
		if (vc == Row_fix6) return doRow_fix6_VC(info);
		if (vc == Row_undisp_flg6) return doRow_undisp_flg6_VC(info);
		if (vc == Row_num_pad_str6) return doRow_num_pad_str6_VC(info);
		if (vc == Row_elm_typ7) return doRow_elm_typ7_VC(info);
		if (vc == Row_elm_typ_nm7) return doRow_elm_typ_nm7_VC(info);
		if (vc == Row_elm_dgt7) return doRow_elm_dgt7_VC(info);
		if (vc == Row_fix7) return doRow_fix7_VC(info);
		if (vc == Row_undisp_flg7) return doRow_undisp_flg7_VC(info);
		if (vc == Row_num_pad_str7) return doRow_num_pad_str7_VC(info);
		if (vc == Row_elm_typ8) return doRow_elm_typ8_VC(info);
		if (vc == Row_elm_typ_nm8) return doRow_elm_typ_nm8_VC(info);
		if (vc == Row_elm_dgt8) return doRow_elm_dgt8_VC(info);
		if (vc == Row_fix8) return doRow_fix8_VC(info);
		if (vc == Row_undisp_flg8) return doRow_undisp_flg8_VC(info);
		if (vc == Row_num_pad_str8) return doRow_num_pad_str8_VC(info);
		if (vc == Row_elm_typ9) return doRow_elm_typ9_VC(info);
		if (vc == Row_elm_typ_nm9) return doRow_elm_typ_nm9_VC(info);
		if (vc == Row_elm_dgt9) return doRow_elm_dgt9_VC(info);
		if (vc == Row_fix9) return doRow_fix9_VC(info);
		if (vc == Row_undisp_flg9) return doRow_undisp_flg9_VC(info);
		if (vc == Row_num_pad_str9) return doRow_num_pad_str9_VC(info);
		if (vc == Row_elm_typ10) return doRow_elm_typ10_VC(info);
		if (vc == Row_elm_typ_nm10) return doRow_elm_typ_nm10_VC(info);
		if (vc == Row_elm_dgt10) return doRow_elm_dgt10_VC(info);
		if (vc == Row_fix10) return doRow_fix10_VC(info);
		if (vc == Row_undisp_flg10) return doRow_undisp_flg10_VC(info);
		if (vc == Row_num_pad_str10) return doRow_num_pad_str10_VC(info);
		if (vc == Row_num_img) return doRow_num_img_VC(info);
		if (vc == Row_def_seq_typ) return doRow_def_seq_typ_VC(info);
		if (vc == Row_def_seq_typ_nm) return doRow_def_seq_typ_nm_VC(info);
		if (vc == Row_memo1) return doRow_memo1_VC(info);
		if (vc == Row_memo2) return doRow_memo2_VC(info);
		if (vc == Row_memo3) return doRow_memo3_VC(info);
		if (vc == Row_del_flg) return doRow_del_flg_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_num_biz_typ) return doLcl_num_biz_typ_VC(info);
		if (vc == columnLcl_num_ptn_cd) return doLcl_num_ptn_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_num_ptn_nm) return doLcl_num_ptn_nm_VC(info);
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
	 * [LclTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_num_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[max_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_max_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_ptn_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key_dgt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key_dgt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_typ_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[elm_dgt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_elm_dgt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[undisp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_undisp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_pad_str10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_pad_str10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_seq_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_seq_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_seq_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_seq_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_img]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_img_VC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[max_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_max_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_ptn_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_ptn_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[key_dgt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_key_dgt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_typ_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_typ_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[elm_dgt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_elm_dgt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[fix10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_fix10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[undisp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_undisp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_pad_str10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_pad_str10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[num_img]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_num_img_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[def_seq_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_def_seq_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[def_seq_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_def_seq_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_del_flg_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[num_biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_num_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[num_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_num_ptn_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[num_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_num_ptn_nm_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTabTab) doLclTab_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_num_biz_typ) doCnd_num_biz_typ_NC(info);
		else if (nc == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NC(info);
		else if (nc == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NC(info);
		else if (nc == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_num_biz_typ) doDtl_num_biz_typ_NC(info);
		else if (nc == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NC(info);
		else if (nc == columnDtl_max_digit) doDtl_max_digit_NC(info);
		else if (nc == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NC(info);
		else if (nc == columnDtl_num_ptn_nm_lcl) doDtl_num_ptn_nm_lcl_NC(info);
		else if (nc == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NC(info);
		else if (nc == columnDtl_key_dgt) doDtl_key_dgt_NC(info);
		else if (nc == columnDtl_elm_typ1) doDtl_elm_typ1_NC(info);
		else if (nc == columnDtl_elm_typ_nm1) doDtl_elm_typ_nm1_NC(info);
		else if (nc == columnDtl_elm_dgt1) doDtl_elm_dgt1_NC(info);
		else if (nc == columnDtl_fix1) doDtl_fix1_NC(info);
		else if (nc == columnDtl_undisp_flg1) doDtl_undisp_flg1_NC(info);
		else if (nc == columnDtl_num_pad_str1) doDtl_num_pad_str1_NC(info);
		else if (nc == columnDtl_elm_typ2) doDtl_elm_typ2_NC(info);
		else if (nc == columnDtl_elm_typ_nm2) doDtl_elm_typ_nm2_NC(info);
		else if (nc == columnDtl_elm_dgt2) doDtl_elm_dgt2_NC(info);
		else if (nc == columnDtl_fix2) doDtl_fix2_NC(info);
		else if (nc == columnDtl_undisp_flg2) doDtl_undisp_flg2_NC(info);
		else if (nc == columnDtl_num_pad_str2) doDtl_num_pad_str2_NC(info);
		else if (nc == columnDtl_elm_typ3) doDtl_elm_typ3_NC(info);
		else if (nc == columnDtl_elm_typ_nm3) doDtl_elm_typ_nm3_NC(info);
		else if (nc == columnDtl_elm_dgt3) doDtl_elm_dgt3_NC(info);
		else if (nc == columnDtl_fix3) doDtl_fix3_NC(info);
		else if (nc == columnDtl_undisp_flg3) doDtl_undisp_flg3_NC(info);
		else if (nc == columnDtl_num_pad_str3) doDtl_num_pad_str3_NC(info);
		else if (nc == columnDtl_elm_typ4) doDtl_elm_typ4_NC(info);
		else if (nc == columnDtl_elm_typ_nm4) doDtl_elm_typ_nm4_NC(info);
		else if (nc == columnDtl_elm_dgt4) doDtl_elm_dgt4_NC(info);
		else if (nc == columnDtl_fix4) doDtl_fix4_NC(info);
		else if (nc == columnDtl_undisp_flg4) doDtl_undisp_flg4_NC(info);
		else if (nc == columnDtl_num_pad_str4) doDtl_num_pad_str4_NC(info);
		else if (nc == columnDtl_elm_typ5) doDtl_elm_typ5_NC(info);
		else if (nc == columnDtl_elm_typ_nm5) doDtl_elm_typ_nm5_NC(info);
		else if (nc == columnDtl_elm_dgt5) doDtl_elm_dgt5_NC(info);
		else if (nc == columnDtl_fix5) doDtl_fix5_NC(info);
		else if (nc == columnDtl_undisp_flg5) doDtl_undisp_flg5_NC(info);
		else if (nc == columnDtl_num_pad_str5) doDtl_num_pad_str5_NC(info);
		else if (nc == columnDtl_elm_typ6) doDtl_elm_typ6_NC(info);
		else if (nc == columnDtl_elm_typ_nm6) doDtl_elm_typ_nm6_NC(info);
		else if (nc == columnDtl_elm_dgt6) doDtl_elm_dgt6_NC(info);
		else if (nc == columnDtl_fix6) doDtl_fix6_NC(info);
		else if (nc == columnDtl_undisp_flg6) doDtl_undisp_flg6_NC(info);
		else if (nc == columnDtl_num_pad_str6) doDtl_num_pad_str6_NC(info);
		else if (nc == columnDtl_elm_typ7) doDtl_elm_typ7_NC(info);
		else if (nc == columnDtl_elm_typ_nm7) doDtl_elm_typ_nm7_NC(info);
		else if (nc == columnDtl_elm_dgt7) doDtl_elm_dgt7_NC(info);
		else if (nc == columnDtl_fix7) doDtl_fix7_NC(info);
		else if (nc == columnDtl_undisp_flg7) doDtl_undisp_flg7_NC(info);
		else if (nc == columnDtl_num_pad_str7) doDtl_num_pad_str7_NC(info);
		else if (nc == columnDtl_elm_typ8) doDtl_elm_typ8_NC(info);
		else if (nc == columnDtl_elm_typ_nm8) doDtl_elm_typ_nm8_NC(info);
		else if (nc == columnDtl_elm_dgt8) doDtl_elm_dgt8_NC(info);
		else if (nc == columnDtl_fix8) doDtl_fix8_NC(info);
		else if (nc == columnDtl_undisp_flg8) doDtl_undisp_flg8_NC(info);
		else if (nc == columnDtl_num_pad_str8) doDtl_num_pad_str8_NC(info);
		else if (nc == columnDtl_elm_typ9) doDtl_elm_typ9_NC(info);
		else if (nc == columnDtl_elm_typ_nm9) doDtl_elm_typ_nm9_NC(info);
		else if (nc == columnDtl_elm_dgt9) doDtl_elm_dgt9_NC(info);
		else if (nc == columnDtl_fix9) doDtl_fix9_NC(info);
		else if (nc == columnDtl_undisp_flg9) doDtl_undisp_flg9_NC(info);
		else if (nc == columnDtl_num_pad_str9) doDtl_num_pad_str9_NC(info);
		else if (nc == columnDtl_elm_typ10) doDtl_elm_typ10_NC(info);
		else if (nc == columnDtl_elm_typ_nm10) doDtl_elm_typ_nm10_NC(info);
		else if (nc == columnDtl_elm_dgt10) doDtl_elm_dgt10_NC(info);
		else if (nc == columnDtl_fix10) doDtl_fix10_NC(info);
		else if (nc == columnDtl_undisp_flg10) doDtl_undisp_flg10_NC(info);
		else if (nc == columnDtl_num_pad_str10) doDtl_num_pad_str10_NC(info);
		else if (nc == columnDtl_def_seq_typ) doDtl_def_seq_typ_NC(info);
		else if (nc == columnDtl_def_seq_typ_nm) doDtl_def_seq_typ_nm_NC(info);
		else if (nc == columnDtl_num_img) doDtl_num_img_NC(info);
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
		else if (nc == Row_num_biz_typ) doRow_num_biz_typ_NC(info);
		else if (nc == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NC(info);
		else if (nc == Row_max_digit) doRow_max_digit_NC(info);
		else if (nc == Row_num_ptn_cd) doRow_num_ptn_cd_NC(info);
		else if (nc == Row_num_ptn_nm_lcl) doRow_num_ptn_nm_lcl_NC(info);
		else if (nc == Row_num_ptn_nm) doRow_num_ptn_nm_NC(info);
		else if (nc == Row_key_dgt) doRow_key_dgt_NC(info);
		else if (nc == Row_elm_typ1) doRow_elm_typ1_NC(info);
		else if (nc == Row_elm_typ_nm1) doRow_elm_typ_nm1_NC(info);
		else if (nc == Row_elm_dgt1) doRow_elm_dgt1_NC(info);
		else if (nc == Row_fix1) doRow_fix1_NC(info);
		else if (nc == Row_undisp_flg1) doRow_undisp_flg1_NC(info);
		else if (nc == Row_num_pad_str1) doRow_num_pad_str1_NC(info);
		else if (nc == Row_elm_typ2) doRow_elm_typ2_NC(info);
		else if (nc == Row_elm_typ_nm2) doRow_elm_typ_nm2_NC(info);
		else if (nc == Row_elm_dgt2) doRow_elm_dgt2_NC(info);
		else if (nc == Row_fix2) doRow_fix2_NC(info);
		else if (nc == Row_undisp_flg2) doRow_undisp_flg2_NC(info);
		else if (nc == Row_num_pad_str2) doRow_num_pad_str2_NC(info);
		else if (nc == Row_elm_typ3) doRow_elm_typ3_NC(info);
		else if (nc == Row_elm_typ_nm3) doRow_elm_typ_nm3_NC(info);
		else if (nc == Row_elm_dgt3) doRow_elm_dgt3_NC(info);
		else if (nc == Row_fix3) doRow_fix3_NC(info);
		else if (nc == Row_undisp_flg3) doRow_undisp_flg3_NC(info);
		else if (nc == Row_num_pad_str3) doRow_num_pad_str3_NC(info);
		else if (nc == Row_elm_typ4) doRow_elm_typ4_NC(info);
		else if (nc == Row_elm_typ_nm4) doRow_elm_typ_nm4_NC(info);
		else if (nc == Row_elm_dgt4) doRow_elm_dgt4_NC(info);
		else if (nc == Row_fix4) doRow_fix4_NC(info);
		else if (nc == Row_undisp_flg4) doRow_undisp_flg4_NC(info);
		else if (nc == Row_num_pad_str4) doRow_num_pad_str4_NC(info);
		else if (nc == Row_elm_typ5) doRow_elm_typ5_NC(info);
		else if (nc == Row_elm_typ_nm5) doRow_elm_typ_nm5_NC(info);
		else if (nc == Row_elm_dgt5) doRow_elm_dgt5_NC(info);
		else if (nc == Row_fix5) doRow_fix5_NC(info);
		else if (nc == Row_undisp_flg5) doRow_undisp_flg5_NC(info);
		else if (nc == Row_num_pad_str5) doRow_num_pad_str5_NC(info);
		else if (nc == Row_elm_typ6) doRow_elm_typ6_NC(info);
		else if (nc == Row_elm_typ_nm6) doRow_elm_typ_nm6_NC(info);
		else if (nc == Row_elm_dgt6) doRow_elm_dgt6_NC(info);
		else if (nc == Row_fix6) doRow_fix6_NC(info);
		else if (nc == Row_undisp_flg6) doRow_undisp_flg6_NC(info);
		else if (nc == Row_num_pad_str6) doRow_num_pad_str6_NC(info);
		else if (nc == Row_elm_typ7) doRow_elm_typ7_NC(info);
		else if (nc == Row_elm_typ_nm7) doRow_elm_typ_nm7_NC(info);
		else if (nc == Row_elm_dgt7) doRow_elm_dgt7_NC(info);
		else if (nc == Row_fix7) doRow_fix7_NC(info);
		else if (nc == Row_undisp_flg7) doRow_undisp_flg7_NC(info);
		else if (nc == Row_num_pad_str7) doRow_num_pad_str7_NC(info);
		else if (nc == Row_elm_typ8) doRow_elm_typ8_NC(info);
		else if (nc == Row_elm_typ_nm8) doRow_elm_typ_nm8_NC(info);
		else if (nc == Row_elm_dgt8) doRow_elm_dgt8_NC(info);
		else if (nc == Row_fix8) doRow_fix8_NC(info);
		else if (nc == Row_undisp_flg8) doRow_undisp_flg8_NC(info);
		else if (nc == Row_num_pad_str8) doRow_num_pad_str8_NC(info);
		else if (nc == Row_elm_typ9) doRow_elm_typ9_NC(info);
		else if (nc == Row_elm_typ_nm9) doRow_elm_typ_nm9_NC(info);
		else if (nc == Row_elm_dgt9) doRow_elm_dgt9_NC(info);
		else if (nc == Row_fix9) doRow_fix9_NC(info);
		else if (nc == Row_undisp_flg9) doRow_undisp_flg9_NC(info);
		else if (nc == Row_num_pad_str9) doRow_num_pad_str9_NC(info);
		else if (nc == Row_elm_typ10) doRow_elm_typ10_NC(info);
		else if (nc == Row_elm_typ_nm10) doRow_elm_typ_nm10_NC(info);
		else if (nc == Row_elm_dgt10) doRow_elm_dgt10_NC(info);
		else if (nc == Row_fix10) doRow_fix10_NC(info);
		else if (nc == Row_undisp_flg10) doRow_undisp_flg10_NC(info);
		else if (nc == Row_num_pad_str10) doRow_num_pad_str10_NC(info);
		else if (nc == Row_num_img) doRow_num_img_NC(info);
		else if (nc == Row_def_seq_typ) doRow_def_seq_typ_NC(info);
		else if (nc == Row_def_seq_typ_nm) doRow_def_seq_typ_nm_NC(info);
		else if (nc == Row_memo1) doRow_memo1_NC(info);
		else if (nc == Row_memo2) doRow_memo2_NC(info);
		else if (nc == Row_memo3) doRow_memo3_NC(info);
		else if (nc == Row_del_flg) doRow_del_flg_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_num_biz_typ) doLcl_num_biz_typ_NC(info);
		else if (nc == columnLcl_num_ptn_cd) doLcl_num_ptn_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_num_ptn_nm) doLcl_num_ptn_nm_NC(info);
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
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [LclTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_dgt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_dgt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_img]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_img_NC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_digit_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_dgt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_dgt_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str4_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str5_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str6_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str7_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str8_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str9_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str10_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_img]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_img_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[num_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_nm_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTabTab) doLclTab_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_num_biz_typ) doCnd_num_biz_typ_NE(info);
		else if (ne == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NE(info);
		else if (ne == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NE(info);
		else if (ne == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_num_biz_typ) doDtl_num_biz_typ_NE(info);
		else if (ne == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NE(info);
		else if (ne == columnDtl_max_digit) doDtl_max_digit_NE(info);
		else if (ne == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NE(info);
		else if (ne == columnDtl_num_ptn_nm_lcl) doDtl_num_ptn_nm_lcl_NE(info);
		else if (ne == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NE(info);
		else if (ne == columnDtl_key_dgt) doDtl_key_dgt_NE(info);
		else if (ne == columnDtl_elm_typ1) doDtl_elm_typ1_NE(info);
		else if (ne == columnDtl_elm_typ_nm1) doDtl_elm_typ_nm1_NE(info);
		else if (ne == columnDtl_elm_dgt1) doDtl_elm_dgt1_NE(info);
		else if (ne == columnDtl_fix1) doDtl_fix1_NE(info);
		else if (ne == columnDtl_undisp_flg1) doDtl_undisp_flg1_NE(info);
		else if (ne == columnDtl_num_pad_str1) doDtl_num_pad_str1_NE(info);
		else if (ne == columnDtl_elm_typ2) doDtl_elm_typ2_NE(info);
		else if (ne == columnDtl_elm_typ_nm2) doDtl_elm_typ_nm2_NE(info);
		else if (ne == columnDtl_elm_dgt2) doDtl_elm_dgt2_NE(info);
		else if (ne == columnDtl_fix2) doDtl_fix2_NE(info);
		else if (ne == columnDtl_undisp_flg2) doDtl_undisp_flg2_NE(info);
		else if (ne == columnDtl_num_pad_str2) doDtl_num_pad_str2_NE(info);
		else if (ne == columnDtl_elm_typ3) doDtl_elm_typ3_NE(info);
		else if (ne == columnDtl_elm_typ_nm3) doDtl_elm_typ_nm3_NE(info);
		else if (ne == columnDtl_elm_dgt3) doDtl_elm_dgt3_NE(info);
		else if (ne == columnDtl_fix3) doDtl_fix3_NE(info);
		else if (ne == columnDtl_undisp_flg3) doDtl_undisp_flg3_NE(info);
		else if (ne == columnDtl_num_pad_str3) doDtl_num_pad_str3_NE(info);
		else if (ne == columnDtl_elm_typ4) doDtl_elm_typ4_NE(info);
		else if (ne == columnDtl_elm_typ_nm4) doDtl_elm_typ_nm4_NE(info);
		else if (ne == columnDtl_elm_dgt4) doDtl_elm_dgt4_NE(info);
		else if (ne == columnDtl_fix4) doDtl_fix4_NE(info);
		else if (ne == columnDtl_undisp_flg4) doDtl_undisp_flg4_NE(info);
		else if (ne == columnDtl_num_pad_str4) doDtl_num_pad_str4_NE(info);
		else if (ne == columnDtl_elm_typ5) doDtl_elm_typ5_NE(info);
		else if (ne == columnDtl_elm_typ_nm5) doDtl_elm_typ_nm5_NE(info);
		else if (ne == columnDtl_elm_dgt5) doDtl_elm_dgt5_NE(info);
		else if (ne == columnDtl_fix5) doDtl_fix5_NE(info);
		else if (ne == columnDtl_undisp_flg5) doDtl_undisp_flg5_NE(info);
		else if (ne == columnDtl_num_pad_str5) doDtl_num_pad_str5_NE(info);
		else if (ne == columnDtl_elm_typ6) doDtl_elm_typ6_NE(info);
		else if (ne == columnDtl_elm_typ_nm6) doDtl_elm_typ_nm6_NE(info);
		else if (ne == columnDtl_elm_dgt6) doDtl_elm_dgt6_NE(info);
		else if (ne == columnDtl_fix6) doDtl_fix6_NE(info);
		else if (ne == columnDtl_undisp_flg6) doDtl_undisp_flg6_NE(info);
		else if (ne == columnDtl_num_pad_str6) doDtl_num_pad_str6_NE(info);
		else if (ne == columnDtl_elm_typ7) doDtl_elm_typ7_NE(info);
		else if (ne == columnDtl_elm_typ_nm7) doDtl_elm_typ_nm7_NE(info);
		else if (ne == columnDtl_elm_dgt7) doDtl_elm_dgt7_NE(info);
		else if (ne == columnDtl_fix7) doDtl_fix7_NE(info);
		else if (ne == columnDtl_undisp_flg7) doDtl_undisp_flg7_NE(info);
		else if (ne == columnDtl_num_pad_str7) doDtl_num_pad_str7_NE(info);
		else if (ne == columnDtl_elm_typ8) doDtl_elm_typ8_NE(info);
		else if (ne == columnDtl_elm_typ_nm8) doDtl_elm_typ_nm8_NE(info);
		else if (ne == columnDtl_elm_dgt8) doDtl_elm_dgt8_NE(info);
		else if (ne == columnDtl_fix8) doDtl_fix8_NE(info);
		else if (ne == columnDtl_undisp_flg8) doDtl_undisp_flg8_NE(info);
		else if (ne == columnDtl_num_pad_str8) doDtl_num_pad_str8_NE(info);
		else if (ne == columnDtl_elm_typ9) doDtl_elm_typ9_NE(info);
		else if (ne == columnDtl_elm_typ_nm9) doDtl_elm_typ_nm9_NE(info);
		else if (ne == columnDtl_elm_dgt9) doDtl_elm_dgt9_NE(info);
		else if (ne == columnDtl_fix9) doDtl_fix9_NE(info);
		else if (ne == columnDtl_undisp_flg9) doDtl_undisp_flg9_NE(info);
		else if (ne == columnDtl_num_pad_str9) doDtl_num_pad_str9_NE(info);
		else if (ne == columnDtl_elm_typ10) doDtl_elm_typ10_NE(info);
		else if (ne == columnDtl_elm_typ_nm10) doDtl_elm_typ_nm10_NE(info);
		else if (ne == columnDtl_elm_dgt10) doDtl_elm_dgt10_NE(info);
		else if (ne == columnDtl_fix10) doDtl_fix10_NE(info);
		else if (ne == columnDtl_undisp_flg10) doDtl_undisp_flg10_NE(info);
		else if (ne == columnDtl_num_pad_str10) doDtl_num_pad_str10_NE(info);
		else if (ne == columnDtl_def_seq_typ) doDtl_def_seq_typ_NE(info);
		else if (ne == columnDtl_def_seq_typ_nm) doDtl_def_seq_typ_nm_NE(info);
		else if (ne == columnDtl_num_img) doDtl_num_img_NE(info);
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
		else if (ne == Row_num_biz_typ) doRow_num_biz_typ_NE(info);
		else if (ne == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NE(info);
		else if (ne == Row_max_digit) doRow_max_digit_NE(info);
		else if (ne == Row_num_ptn_cd) doRow_num_ptn_cd_NE(info);
		else if (ne == Row_num_ptn_nm_lcl) doRow_num_ptn_nm_lcl_NE(info);
		else if (ne == Row_num_ptn_nm) doRow_num_ptn_nm_NE(info);
		else if (ne == Row_key_dgt) doRow_key_dgt_NE(info);
		else if (ne == Row_elm_typ1) doRow_elm_typ1_NE(info);
		else if (ne == Row_elm_typ_nm1) doRow_elm_typ_nm1_NE(info);
		else if (ne == Row_elm_dgt1) doRow_elm_dgt1_NE(info);
		else if (ne == Row_fix1) doRow_fix1_NE(info);
		else if (ne == Row_undisp_flg1) doRow_undisp_flg1_NE(info);
		else if (ne == Row_num_pad_str1) doRow_num_pad_str1_NE(info);
		else if (ne == Row_elm_typ2) doRow_elm_typ2_NE(info);
		else if (ne == Row_elm_typ_nm2) doRow_elm_typ_nm2_NE(info);
		else if (ne == Row_elm_dgt2) doRow_elm_dgt2_NE(info);
		else if (ne == Row_fix2) doRow_fix2_NE(info);
		else if (ne == Row_undisp_flg2) doRow_undisp_flg2_NE(info);
		else if (ne == Row_num_pad_str2) doRow_num_pad_str2_NE(info);
		else if (ne == Row_elm_typ3) doRow_elm_typ3_NE(info);
		else if (ne == Row_elm_typ_nm3) doRow_elm_typ_nm3_NE(info);
		else if (ne == Row_elm_dgt3) doRow_elm_dgt3_NE(info);
		else if (ne == Row_fix3) doRow_fix3_NE(info);
		else if (ne == Row_undisp_flg3) doRow_undisp_flg3_NE(info);
		else if (ne == Row_num_pad_str3) doRow_num_pad_str3_NE(info);
		else if (ne == Row_elm_typ4) doRow_elm_typ4_NE(info);
		else if (ne == Row_elm_typ_nm4) doRow_elm_typ_nm4_NE(info);
		else if (ne == Row_elm_dgt4) doRow_elm_dgt4_NE(info);
		else if (ne == Row_fix4) doRow_fix4_NE(info);
		else if (ne == Row_undisp_flg4) doRow_undisp_flg4_NE(info);
		else if (ne == Row_num_pad_str4) doRow_num_pad_str4_NE(info);
		else if (ne == Row_elm_typ5) doRow_elm_typ5_NE(info);
		else if (ne == Row_elm_typ_nm5) doRow_elm_typ_nm5_NE(info);
		else if (ne == Row_elm_dgt5) doRow_elm_dgt5_NE(info);
		else if (ne == Row_fix5) doRow_fix5_NE(info);
		else if (ne == Row_undisp_flg5) doRow_undisp_flg5_NE(info);
		else if (ne == Row_num_pad_str5) doRow_num_pad_str5_NE(info);
		else if (ne == Row_elm_typ6) doRow_elm_typ6_NE(info);
		else if (ne == Row_elm_typ_nm6) doRow_elm_typ_nm6_NE(info);
		else if (ne == Row_elm_dgt6) doRow_elm_dgt6_NE(info);
		else if (ne == Row_fix6) doRow_fix6_NE(info);
		else if (ne == Row_undisp_flg6) doRow_undisp_flg6_NE(info);
		else if (ne == Row_num_pad_str6) doRow_num_pad_str6_NE(info);
		else if (ne == Row_elm_typ7) doRow_elm_typ7_NE(info);
		else if (ne == Row_elm_typ_nm7) doRow_elm_typ_nm7_NE(info);
		else if (ne == Row_elm_dgt7) doRow_elm_dgt7_NE(info);
		else if (ne == Row_fix7) doRow_fix7_NE(info);
		else if (ne == Row_undisp_flg7) doRow_undisp_flg7_NE(info);
		else if (ne == Row_num_pad_str7) doRow_num_pad_str7_NE(info);
		else if (ne == Row_elm_typ8) doRow_elm_typ8_NE(info);
		else if (ne == Row_elm_typ_nm8) doRow_elm_typ_nm8_NE(info);
		else if (ne == Row_elm_dgt8) doRow_elm_dgt8_NE(info);
		else if (ne == Row_fix8) doRow_fix8_NE(info);
		else if (ne == Row_undisp_flg8) doRow_undisp_flg8_NE(info);
		else if (ne == Row_num_pad_str8) doRow_num_pad_str8_NE(info);
		else if (ne == Row_elm_typ9) doRow_elm_typ9_NE(info);
		else if (ne == Row_elm_typ_nm9) doRow_elm_typ_nm9_NE(info);
		else if (ne == Row_elm_dgt9) doRow_elm_dgt9_NE(info);
		else if (ne == Row_fix9) doRow_fix9_NE(info);
		else if (ne == Row_undisp_flg9) doRow_undisp_flg9_NE(info);
		else if (ne == Row_num_pad_str9) doRow_num_pad_str9_NE(info);
		else if (ne == Row_elm_typ10) doRow_elm_typ10_NE(info);
		else if (ne == Row_elm_typ_nm10) doRow_elm_typ_nm10_NE(info);
		else if (ne == Row_elm_dgt10) doRow_elm_dgt10_NE(info);
		else if (ne == Row_fix10) doRow_fix10_NE(info);
		else if (ne == Row_undisp_flg10) doRow_undisp_flg10_NE(info);
		else if (ne == Row_num_pad_str10) doRow_num_pad_str10_NE(info);
		else if (ne == Row_num_img) doRow_num_img_NE(info);
		else if (ne == Row_def_seq_typ) doRow_def_seq_typ_NE(info);
		else if (ne == Row_def_seq_typ_nm) doRow_def_seq_typ_nm_NE(info);
		else if (ne == Row_memo1) doRow_memo1_NE(info);
		else if (ne == Row_memo2) doRow_memo2_NE(info);
		else if (ne == Row_memo3) doRow_memo3_NE(info);
		else if (ne == Row_del_flg) doRow_del_flg_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_num_biz_typ) doLcl_num_biz_typ_NE(info);
		else if (ne == columnLcl_num_ptn_cd) doLcl_num_ptn_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_num_ptn_nm) doLcl_num_ptn_nm_NE(info);
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
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [LclTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_dgt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_dgt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_img]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_img_NE(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_digit_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_dgt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_dgt_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str4_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str5_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str6_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str7_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str8_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str9_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str10_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_img]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_img_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[num_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_nm_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTabTab) doLclTab_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_num_biz_typ) doCnd_num_biz_typ_NX(info);
		else if (nx == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_NX(info);
		else if (nx == Cnd_num_ptn_cd) doCnd_num_ptn_cd_NX(info);
		else if (nx == Cnd_num_ptn_nm) doCnd_num_ptn_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_num_biz_typ) doDtl_num_biz_typ_NX(info);
		else if (nx == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_NX(info);
		else if (nx == columnDtl_max_digit) doDtl_max_digit_NX(info);
		else if (nx == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_NX(info);
		else if (nx == columnDtl_num_ptn_nm_lcl) doDtl_num_ptn_nm_lcl_NX(info);
		else if (nx == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_NX(info);
		else if (nx == columnDtl_key_dgt) doDtl_key_dgt_NX(info);
		else if (nx == columnDtl_elm_typ1) doDtl_elm_typ1_NX(info);
		else if (nx == columnDtl_elm_typ_nm1) doDtl_elm_typ_nm1_NX(info);
		else if (nx == columnDtl_elm_dgt1) doDtl_elm_dgt1_NX(info);
		else if (nx == columnDtl_fix1) doDtl_fix1_NX(info);
		else if (nx == columnDtl_undisp_flg1) doDtl_undisp_flg1_NX(info);
		else if (nx == columnDtl_num_pad_str1) doDtl_num_pad_str1_NX(info);
		else if (nx == columnDtl_elm_typ2) doDtl_elm_typ2_NX(info);
		else if (nx == columnDtl_elm_typ_nm2) doDtl_elm_typ_nm2_NX(info);
		else if (nx == columnDtl_elm_dgt2) doDtl_elm_dgt2_NX(info);
		else if (nx == columnDtl_fix2) doDtl_fix2_NX(info);
		else if (nx == columnDtl_undisp_flg2) doDtl_undisp_flg2_NX(info);
		else if (nx == columnDtl_num_pad_str2) doDtl_num_pad_str2_NX(info);
		else if (nx == columnDtl_elm_typ3) doDtl_elm_typ3_NX(info);
		else if (nx == columnDtl_elm_typ_nm3) doDtl_elm_typ_nm3_NX(info);
		else if (nx == columnDtl_elm_dgt3) doDtl_elm_dgt3_NX(info);
		else if (nx == columnDtl_fix3) doDtl_fix3_NX(info);
		else if (nx == columnDtl_undisp_flg3) doDtl_undisp_flg3_NX(info);
		else if (nx == columnDtl_num_pad_str3) doDtl_num_pad_str3_NX(info);
		else if (nx == columnDtl_elm_typ4) doDtl_elm_typ4_NX(info);
		else if (nx == columnDtl_elm_typ_nm4) doDtl_elm_typ_nm4_NX(info);
		else if (nx == columnDtl_elm_dgt4) doDtl_elm_dgt4_NX(info);
		else if (nx == columnDtl_fix4) doDtl_fix4_NX(info);
		else if (nx == columnDtl_undisp_flg4) doDtl_undisp_flg4_NX(info);
		else if (nx == columnDtl_num_pad_str4) doDtl_num_pad_str4_NX(info);
		else if (nx == columnDtl_elm_typ5) doDtl_elm_typ5_NX(info);
		else if (nx == columnDtl_elm_typ_nm5) doDtl_elm_typ_nm5_NX(info);
		else if (nx == columnDtl_elm_dgt5) doDtl_elm_dgt5_NX(info);
		else if (nx == columnDtl_fix5) doDtl_fix5_NX(info);
		else if (nx == columnDtl_undisp_flg5) doDtl_undisp_flg5_NX(info);
		else if (nx == columnDtl_num_pad_str5) doDtl_num_pad_str5_NX(info);
		else if (nx == columnDtl_elm_typ6) doDtl_elm_typ6_NX(info);
		else if (nx == columnDtl_elm_typ_nm6) doDtl_elm_typ_nm6_NX(info);
		else if (nx == columnDtl_elm_dgt6) doDtl_elm_dgt6_NX(info);
		else if (nx == columnDtl_fix6) doDtl_fix6_NX(info);
		else if (nx == columnDtl_undisp_flg6) doDtl_undisp_flg6_NX(info);
		else if (nx == columnDtl_num_pad_str6) doDtl_num_pad_str6_NX(info);
		else if (nx == columnDtl_elm_typ7) doDtl_elm_typ7_NX(info);
		else if (nx == columnDtl_elm_typ_nm7) doDtl_elm_typ_nm7_NX(info);
		else if (nx == columnDtl_elm_dgt7) doDtl_elm_dgt7_NX(info);
		else if (nx == columnDtl_fix7) doDtl_fix7_NX(info);
		else if (nx == columnDtl_undisp_flg7) doDtl_undisp_flg7_NX(info);
		else if (nx == columnDtl_num_pad_str7) doDtl_num_pad_str7_NX(info);
		else if (nx == columnDtl_elm_typ8) doDtl_elm_typ8_NX(info);
		else if (nx == columnDtl_elm_typ_nm8) doDtl_elm_typ_nm8_NX(info);
		else if (nx == columnDtl_elm_dgt8) doDtl_elm_dgt8_NX(info);
		else if (nx == columnDtl_fix8) doDtl_fix8_NX(info);
		else if (nx == columnDtl_undisp_flg8) doDtl_undisp_flg8_NX(info);
		else if (nx == columnDtl_num_pad_str8) doDtl_num_pad_str8_NX(info);
		else if (nx == columnDtl_elm_typ9) doDtl_elm_typ9_NX(info);
		else if (nx == columnDtl_elm_typ_nm9) doDtl_elm_typ_nm9_NX(info);
		else if (nx == columnDtl_elm_dgt9) doDtl_elm_dgt9_NX(info);
		else if (nx == columnDtl_fix9) doDtl_fix9_NX(info);
		else if (nx == columnDtl_undisp_flg9) doDtl_undisp_flg9_NX(info);
		else if (nx == columnDtl_num_pad_str9) doDtl_num_pad_str9_NX(info);
		else if (nx == columnDtl_elm_typ10) doDtl_elm_typ10_NX(info);
		else if (nx == columnDtl_elm_typ_nm10) doDtl_elm_typ_nm10_NX(info);
		else if (nx == columnDtl_elm_dgt10) doDtl_elm_dgt10_NX(info);
		else if (nx == columnDtl_fix10) doDtl_fix10_NX(info);
		else if (nx == columnDtl_undisp_flg10) doDtl_undisp_flg10_NX(info);
		else if (nx == columnDtl_num_pad_str10) doDtl_num_pad_str10_NX(info);
		else if (nx == columnDtl_def_seq_typ) doDtl_def_seq_typ_NX(info);
		else if (nx == columnDtl_def_seq_typ_nm) doDtl_def_seq_typ_nm_NX(info);
		else if (nx == columnDtl_num_img) doDtl_num_img_NX(info);
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
		else if (nx == Row_num_biz_typ) doRow_num_biz_typ_NX(info);
		else if (nx == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_NX(info);
		else if (nx == Row_max_digit) doRow_max_digit_NX(info);
		else if (nx == Row_num_ptn_cd) doRow_num_ptn_cd_NX(info);
		else if (nx == Row_num_ptn_nm_lcl) doRow_num_ptn_nm_lcl_NX(info);
		else if (nx == Row_num_ptn_nm) doRow_num_ptn_nm_NX(info);
		else if (nx == Row_key_dgt) doRow_key_dgt_NX(info);
		else if (nx == Row_elm_typ1) doRow_elm_typ1_NX(info);
		else if (nx == Row_elm_typ_nm1) doRow_elm_typ_nm1_NX(info);
		else if (nx == Row_elm_dgt1) doRow_elm_dgt1_NX(info);
		else if (nx == Row_fix1) doRow_fix1_NX(info);
		else if (nx == Row_undisp_flg1) doRow_undisp_flg1_NX(info);
		else if (nx == Row_num_pad_str1) doRow_num_pad_str1_NX(info);
		else if (nx == Row_elm_typ2) doRow_elm_typ2_NX(info);
		else if (nx == Row_elm_typ_nm2) doRow_elm_typ_nm2_NX(info);
		else if (nx == Row_elm_dgt2) doRow_elm_dgt2_NX(info);
		else if (nx == Row_fix2) doRow_fix2_NX(info);
		else if (nx == Row_undisp_flg2) doRow_undisp_flg2_NX(info);
		else if (nx == Row_num_pad_str2) doRow_num_pad_str2_NX(info);
		else if (nx == Row_elm_typ3) doRow_elm_typ3_NX(info);
		else if (nx == Row_elm_typ_nm3) doRow_elm_typ_nm3_NX(info);
		else if (nx == Row_elm_dgt3) doRow_elm_dgt3_NX(info);
		else if (nx == Row_fix3) doRow_fix3_NX(info);
		else if (nx == Row_undisp_flg3) doRow_undisp_flg3_NX(info);
		else if (nx == Row_num_pad_str3) doRow_num_pad_str3_NX(info);
		else if (nx == Row_elm_typ4) doRow_elm_typ4_NX(info);
		else if (nx == Row_elm_typ_nm4) doRow_elm_typ_nm4_NX(info);
		else if (nx == Row_elm_dgt4) doRow_elm_dgt4_NX(info);
		else if (nx == Row_fix4) doRow_fix4_NX(info);
		else if (nx == Row_undisp_flg4) doRow_undisp_flg4_NX(info);
		else if (nx == Row_num_pad_str4) doRow_num_pad_str4_NX(info);
		else if (nx == Row_elm_typ5) doRow_elm_typ5_NX(info);
		else if (nx == Row_elm_typ_nm5) doRow_elm_typ_nm5_NX(info);
		else if (nx == Row_elm_dgt5) doRow_elm_dgt5_NX(info);
		else if (nx == Row_fix5) doRow_fix5_NX(info);
		else if (nx == Row_undisp_flg5) doRow_undisp_flg5_NX(info);
		else if (nx == Row_num_pad_str5) doRow_num_pad_str5_NX(info);
		else if (nx == Row_elm_typ6) doRow_elm_typ6_NX(info);
		else if (nx == Row_elm_typ_nm6) doRow_elm_typ_nm6_NX(info);
		else if (nx == Row_elm_dgt6) doRow_elm_dgt6_NX(info);
		else if (nx == Row_fix6) doRow_fix6_NX(info);
		else if (nx == Row_undisp_flg6) doRow_undisp_flg6_NX(info);
		else if (nx == Row_num_pad_str6) doRow_num_pad_str6_NX(info);
		else if (nx == Row_elm_typ7) doRow_elm_typ7_NX(info);
		else if (nx == Row_elm_typ_nm7) doRow_elm_typ_nm7_NX(info);
		else if (nx == Row_elm_dgt7) doRow_elm_dgt7_NX(info);
		else if (nx == Row_fix7) doRow_fix7_NX(info);
		else if (nx == Row_undisp_flg7) doRow_undisp_flg7_NX(info);
		else if (nx == Row_num_pad_str7) doRow_num_pad_str7_NX(info);
		else if (nx == Row_elm_typ8) doRow_elm_typ8_NX(info);
		else if (nx == Row_elm_typ_nm8) doRow_elm_typ_nm8_NX(info);
		else if (nx == Row_elm_dgt8) doRow_elm_dgt8_NX(info);
		else if (nx == Row_fix8) doRow_fix8_NX(info);
		else if (nx == Row_undisp_flg8) doRow_undisp_flg8_NX(info);
		else if (nx == Row_num_pad_str8) doRow_num_pad_str8_NX(info);
		else if (nx == Row_elm_typ9) doRow_elm_typ9_NX(info);
		else if (nx == Row_elm_typ_nm9) doRow_elm_typ_nm9_NX(info);
		else if (nx == Row_elm_dgt9) doRow_elm_dgt9_NX(info);
		else if (nx == Row_fix9) doRow_fix9_NX(info);
		else if (nx == Row_undisp_flg9) doRow_undisp_flg9_NX(info);
		else if (nx == Row_num_pad_str9) doRow_num_pad_str9_NX(info);
		else if (nx == Row_elm_typ10) doRow_elm_typ10_NX(info);
		else if (nx == Row_elm_typ_nm10) doRow_elm_typ_nm10_NX(info);
		else if (nx == Row_elm_dgt10) doRow_elm_dgt10_NX(info);
		else if (nx == Row_fix10) doRow_fix10_NX(info);
		else if (nx == Row_undisp_flg10) doRow_undisp_flg10_NX(info);
		else if (nx == Row_num_pad_str10) doRow_num_pad_str10_NX(info);
		else if (nx == Row_num_img) doRow_num_img_NX(info);
		else if (nx == Row_def_seq_typ) doRow_def_seq_typ_NX(info);
		else if (nx == Row_def_seq_typ_nm) doRow_def_seq_typ_nm_NX(info);
		else if (nx == Row_memo1) doRow_memo1_NX(info);
		else if (nx == Row_memo2) doRow_memo2_NX(info);
		else if (nx == Row_memo3) doRow_memo3_NX(info);
		else if (nx == Row_del_flg) doRow_del_flg_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_num_biz_typ) doLcl_num_biz_typ_NX(info);
		else if (nx == columnLcl_num_ptn_cd) doLcl_num_ptn_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_num_ptn_nm) doLcl_num_ptn_nm_NX(info);
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
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [LclTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_dgt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_dgt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[undisp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_undisp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_img]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_img_NX(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_digit_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_dgt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_dgt_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str4_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str5_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str6_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str7_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str8_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str9_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[undisp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_undisp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str10_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_img]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_img_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[num_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_nm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_num_biz_typ) doCnd_num_biz_typ_LC(info);
		else if (lc == Cnd_num_biz_typ_nm) doCnd_num_biz_typ_nm_LC(info);
		else if (lc == Cnd_num_ptn_cd) doCnd_num_ptn_cd_LC(info);
		else if (lc == Cnd_num_ptn_nm) doCnd_num_ptn_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_num_biz_typ) doDtl_num_biz_typ_LC(info);
		else if (lc == columnDtl_num_biz_typ_nm) doDtl_num_biz_typ_nm_LC(info);
		else if (lc == columnDtl_max_digit) doDtl_max_digit_LC(info);
		else if (lc == columnDtl_num_ptn_cd) doDtl_num_ptn_cd_LC(info);
		else if (lc == columnDtl_num_ptn_nm_lcl) doDtl_num_ptn_nm_lcl_LC(info);
		else if (lc == columnDtl_num_ptn_nm) doDtl_num_ptn_nm_LC(info);
		else if (lc == columnDtl_key_dgt) doDtl_key_dgt_LC(info);
		else if (lc == columnDtl_elm_typ1) doDtl_elm_typ1_LC(info);
		else if (lc == columnDtl_elm_typ_nm1) doDtl_elm_typ_nm1_LC(info);
		else if (lc == columnDtl_elm_dgt1) doDtl_elm_dgt1_LC(info);
		else if (lc == columnDtl_fix1) doDtl_fix1_LC(info);
		else if (lc == columnDtl_num_pad_str1) doDtl_num_pad_str1_LC(info);
		else if (lc == columnDtl_elm_typ2) doDtl_elm_typ2_LC(info);
		else if (lc == columnDtl_elm_typ_nm2) doDtl_elm_typ_nm2_LC(info);
		else if (lc == columnDtl_elm_dgt2) doDtl_elm_dgt2_LC(info);
		else if (lc == columnDtl_fix2) doDtl_fix2_LC(info);
		else if (lc == columnDtl_num_pad_str2) doDtl_num_pad_str2_LC(info);
		else if (lc == columnDtl_elm_typ3) doDtl_elm_typ3_LC(info);
		else if (lc == columnDtl_elm_typ_nm3) doDtl_elm_typ_nm3_LC(info);
		else if (lc == columnDtl_elm_dgt3) doDtl_elm_dgt3_LC(info);
		else if (lc == columnDtl_fix3) doDtl_fix3_LC(info);
		else if (lc == columnDtl_num_pad_str3) doDtl_num_pad_str3_LC(info);
		else if (lc == columnDtl_elm_typ4) doDtl_elm_typ4_LC(info);
		else if (lc == columnDtl_elm_typ_nm4) doDtl_elm_typ_nm4_LC(info);
		else if (lc == columnDtl_elm_dgt4) doDtl_elm_dgt4_LC(info);
		else if (lc == columnDtl_fix4) doDtl_fix4_LC(info);
		else if (lc == columnDtl_num_pad_str4) doDtl_num_pad_str4_LC(info);
		else if (lc == columnDtl_elm_typ5) doDtl_elm_typ5_LC(info);
		else if (lc == columnDtl_elm_typ_nm5) doDtl_elm_typ_nm5_LC(info);
		else if (lc == columnDtl_elm_dgt5) doDtl_elm_dgt5_LC(info);
		else if (lc == columnDtl_fix5) doDtl_fix5_LC(info);
		else if (lc == columnDtl_num_pad_str5) doDtl_num_pad_str5_LC(info);
		else if (lc == columnDtl_elm_typ6) doDtl_elm_typ6_LC(info);
		else if (lc == columnDtl_elm_typ_nm6) doDtl_elm_typ_nm6_LC(info);
		else if (lc == columnDtl_elm_dgt6) doDtl_elm_dgt6_LC(info);
		else if (lc == columnDtl_fix6) doDtl_fix6_LC(info);
		else if (lc == columnDtl_num_pad_str6) doDtl_num_pad_str6_LC(info);
		else if (lc == columnDtl_elm_typ7) doDtl_elm_typ7_LC(info);
		else if (lc == columnDtl_elm_typ_nm7) doDtl_elm_typ_nm7_LC(info);
		else if (lc == columnDtl_elm_dgt7) doDtl_elm_dgt7_LC(info);
		else if (lc == columnDtl_fix7) doDtl_fix7_LC(info);
		else if (lc == columnDtl_num_pad_str7) doDtl_num_pad_str7_LC(info);
		else if (lc == columnDtl_elm_typ8) doDtl_elm_typ8_LC(info);
		else if (lc == columnDtl_elm_typ_nm8) doDtl_elm_typ_nm8_LC(info);
		else if (lc == columnDtl_elm_dgt8) doDtl_elm_dgt8_LC(info);
		else if (lc == columnDtl_fix8) doDtl_fix8_LC(info);
		else if (lc == columnDtl_num_pad_str8) doDtl_num_pad_str8_LC(info);
		else if (lc == columnDtl_elm_typ9) doDtl_elm_typ9_LC(info);
		else if (lc == columnDtl_elm_typ_nm9) doDtl_elm_typ_nm9_LC(info);
		else if (lc == columnDtl_elm_dgt9) doDtl_elm_dgt9_LC(info);
		else if (lc == columnDtl_fix9) doDtl_fix9_LC(info);
		else if (lc == columnDtl_num_pad_str9) doDtl_num_pad_str9_LC(info);
		else if (lc == columnDtl_elm_typ10) doDtl_elm_typ10_LC(info);
		else if (lc == columnDtl_elm_typ_nm10) doDtl_elm_typ_nm10_LC(info);
		else if (lc == columnDtl_elm_dgt10) doDtl_elm_dgt10_LC(info);
		else if (lc == columnDtl_fix10) doDtl_fix10_LC(info);
		else if (lc == columnDtl_num_pad_str10) doDtl_num_pad_str10_LC(info);
		else if (lc == columnDtl_def_seq_typ) doDtl_def_seq_typ_LC(info);
		else if (lc == columnDtl_def_seq_typ_nm) doDtl_def_seq_typ_nm_LC(info);
		else if (lc == columnDtl_num_img) doDtl_num_img_LC(info);
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
		else if (lc == Row_num_biz_typ) doRow_num_biz_typ_LC(info);
		else if (lc == Row_num_biz_typ_nm) doRow_num_biz_typ_nm_LC(info);
		else if (lc == Row_max_digit) doRow_max_digit_LC(info);
		else if (lc == Row_num_ptn_cd) doRow_num_ptn_cd_LC(info);
		else if (lc == Row_num_ptn_nm_lcl) doRow_num_ptn_nm_lcl_LC(info);
		else if (lc == Row_num_ptn_nm) doRow_num_ptn_nm_LC(info);
		else if (lc == Row_key_dgt) doRow_key_dgt_LC(info);
		else if (lc == Row_elm_typ1) doRow_elm_typ1_LC(info);
		else if (lc == Row_elm_typ_nm1) doRow_elm_typ_nm1_LC(info);
		else if (lc == Row_elm_dgt1) doRow_elm_dgt1_LC(info);
		else if (lc == Row_fix1) doRow_fix1_LC(info);
		else if (lc == Row_num_pad_str1) doRow_num_pad_str1_LC(info);
		else if (lc == Row_elm_typ2) doRow_elm_typ2_LC(info);
		else if (lc == Row_elm_typ_nm2) doRow_elm_typ_nm2_LC(info);
		else if (lc == Row_elm_dgt2) doRow_elm_dgt2_LC(info);
		else if (lc == Row_fix2) doRow_fix2_LC(info);
		else if (lc == Row_num_pad_str2) doRow_num_pad_str2_LC(info);
		else if (lc == Row_elm_typ3) doRow_elm_typ3_LC(info);
		else if (lc == Row_elm_typ_nm3) doRow_elm_typ_nm3_LC(info);
		else if (lc == Row_elm_dgt3) doRow_elm_dgt3_LC(info);
		else if (lc == Row_fix3) doRow_fix3_LC(info);
		else if (lc == Row_num_pad_str3) doRow_num_pad_str3_LC(info);
		else if (lc == Row_elm_typ4) doRow_elm_typ4_LC(info);
		else if (lc == Row_elm_typ_nm4) doRow_elm_typ_nm4_LC(info);
		else if (lc == Row_elm_dgt4) doRow_elm_dgt4_LC(info);
		else if (lc == Row_fix4) doRow_fix4_LC(info);
		else if (lc == Row_num_pad_str4) doRow_num_pad_str4_LC(info);
		else if (lc == Row_elm_typ5) doRow_elm_typ5_LC(info);
		else if (lc == Row_elm_typ_nm5) doRow_elm_typ_nm5_LC(info);
		else if (lc == Row_elm_dgt5) doRow_elm_dgt5_LC(info);
		else if (lc == Row_fix5) doRow_fix5_LC(info);
		else if (lc == Row_num_pad_str5) doRow_num_pad_str5_LC(info);
		else if (lc == Row_elm_typ6) doRow_elm_typ6_LC(info);
		else if (lc == Row_elm_typ_nm6) doRow_elm_typ_nm6_LC(info);
		else if (lc == Row_elm_dgt6) doRow_elm_dgt6_LC(info);
		else if (lc == Row_fix6) doRow_fix6_LC(info);
		else if (lc == Row_num_pad_str6) doRow_num_pad_str6_LC(info);
		else if (lc == Row_elm_typ7) doRow_elm_typ7_LC(info);
		else if (lc == Row_elm_typ_nm7) doRow_elm_typ_nm7_LC(info);
		else if (lc == Row_elm_dgt7) doRow_elm_dgt7_LC(info);
		else if (lc == Row_fix7) doRow_fix7_LC(info);
		else if (lc == Row_num_pad_str7) doRow_num_pad_str7_LC(info);
		else if (lc == Row_elm_typ8) doRow_elm_typ8_LC(info);
		else if (lc == Row_elm_typ_nm8) doRow_elm_typ_nm8_LC(info);
		else if (lc == Row_elm_dgt8) doRow_elm_dgt8_LC(info);
		else if (lc == Row_fix8) doRow_fix8_LC(info);
		else if (lc == Row_num_pad_str8) doRow_num_pad_str8_LC(info);
		else if (lc == Row_elm_typ9) doRow_elm_typ9_LC(info);
		else if (lc == Row_elm_typ_nm9) doRow_elm_typ_nm9_LC(info);
		else if (lc == Row_elm_dgt9) doRow_elm_dgt9_LC(info);
		else if (lc == Row_fix9) doRow_fix9_LC(info);
		else if (lc == Row_num_pad_str9) doRow_num_pad_str9_LC(info);
		else if (lc == Row_elm_typ10) doRow_elm_typ10_LC(info);
		else if (lc == Row_elm_typ_nm10) doRow_elm_typ_nm10_LC(info);
		else if (lc == Row_elm_dgt10) doRow_elm_dgt10_LC(info);
		else if (lc == Row_fix10) doRow_fix10_LC(info);
		else if (lc == Row_num_pad_str10) doRow_num_pad_str10_LC(info);
		else if (lc == Row_num_img) doRow_num_img_LC(info);
		else if (lc == Row_def_seq_typ) doRow_def_seq_typ_LC(info);
		else if (lc == Row_def_seq_typ_nm) doRow_def_seq_typ_nm_LC(info);
		else if (lc == Row_memo1) doRow_memo1_LC(info);
		else if (lc == Row_memo2) doRow_memo2_LC(info);
		else if (lc == Row_memo3) doRow_memo3_LC(info);
		else if (lc == columnLcl_num_biz_typ) doLcl_num_biz_typ_LC(info);
		else if (lc == columnLcl_num_ptn_cd) doLcl_num_ptn_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_num_ptn_nm) doLcl_num_ptn_nm_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_num_ptn_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key_dgt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key_dgt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_typ_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_typ_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[elm_dgt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_elm_dgt10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_pad_str10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_pad_str10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_seq_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_seq_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_img]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_img_LC(MCEventInfo info){
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
	 * [Row]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[max_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_max_digit_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[key_dgt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_key_dgt_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt3_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix3_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str3_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt4_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix4_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str4_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ5_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt5_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix5_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str5_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ6_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt6_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix6_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str6_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ7_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt7_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix7_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str7_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ8_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt8_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix8_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str8_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ9_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt9_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix9_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str9_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ10_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_typ_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_typ_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[elm_dgt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_elm_dgt10_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[fix10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_fix10_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_pad_str10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_pad_str10_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[num_img]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_num_img_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[def_seq_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_def_seq_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[num_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[num_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_num_ptn_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_num_biz_typ]の作成メソッド
	 */
	public MCList getCnd_num_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumBizTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_num_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_num_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_num_biz_typ]の作成メソッド
	 */
	public MCList getRow_num_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumBizTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ1]の作成メソッド
	 */
	public MCList getRow_elm_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ2]の作成メソッド
	 */
	public MCList getRow_elm_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ3]の作成メソッド
	 */
	public MCList getRow_elm_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ4]の作成メソッド
	 */
	public MCList getRow_elm_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ5]の作成メソッド
	 */
	public MCList getRow_elm_typ5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ6]の作成メソッド
	 */
	public MCList getRow_elm_typ6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ7]の作成メソッド
	 */
	public MCList getRow_elm_typ7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ8]の作成メソッド
	 */
	public MCList getRow_elm_typ8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ9]の作成メソッド
	 */
	public MCList getRow_elm_typ9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_elm_typ10]の作成メソッド
	 */
	public MCList getRow_elm_typ10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getElmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Row_def_seq_typ]の作成メソッド
	 */
	public MCList getRow_def_seq_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSeqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0810.Srch01")) {
			return new MA_MABCL0810_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0810.Upd01")) {
			return new MA_MABCL0810_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0810.Del01")) {
			return new MA_MABCL0810_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0810_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0810_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0810_Srch01Bridge() {
			p_MA_MABCL0810_Srch01 = new MCParam(PDef.MA_MABCL0810_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0810_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0810.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0810.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0810.LclR.class));

			p_MA_MABCL0810_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0810_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0810_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0810_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0810_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0810.CndR up0() {
			return (mcframe.clientMABC.MABCP0810.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0810.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0810.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0810.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0810.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0810_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0810.DtlR.class));
			p_MA_MABCL0810_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0810.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0810_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0810.DtlR>)p_MA_MABCL0810_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0810.LclR>)p_MA_MABCL0810_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABCL0810_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0810_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0810_Upd01Bridge() {
			p_MA_MABCL0810_Upd01 = new MCParam(PDef.MA_MABCL0810_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0810_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0810.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0810.LclR.class));
			// Down

			p_MA_MABCL0810_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0810_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0810_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0810_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0810_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0810_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0810.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0810.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0810.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0810.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0810_Upd01;
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
	 * [MA_MABCL0810_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0810_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0810_Del01;

		/** コンストラクタ */
		protected MA_MABCL0810_Del01Bridge() {
			p_MA_MABCL0810_Del01 = new MCParam(PDef.MA_MABCL0810_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0810_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0810.DtlR.class));
			// Down

			p_MA_MABCL0810_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0810_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0810_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0810_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0810_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0810.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0810.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0810_Del01;
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