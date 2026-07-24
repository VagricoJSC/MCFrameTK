package mcframe.clientMABC.MABCP0840;

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
import mcframe.clientMABC.MABCP0840.MABCP_AttachInfoReg_MC.MA_MABCL0840_Srch01Caller;
import mcframe.clientMABC.MABCP0840.MABCP_AttachInfoReg_MC.MA_MABCL0840_Upd01Caller;
import mcframe.clientMABC.MABCP0840.MABCP_AttachInfoReg_MC.MA_MABCL0840_Del01Caller;

/**
 * 画面"MABCP_AttachInfoReg"パネルクラスです。<p>
 *
 * 品目付加情報マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_AttachInfoReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0840";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [CndTab]ブロック関連のField定義
	public MCPanel CndTabPanel = null;
	public MCTabbedPane CndTabTab = null;
	// [CndTab]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCLabel Cnd_attach_info_typ_Label = null;
	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_attach_info_typ = null;
	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public MCTextField Cnd_attach_info_typ_nm = null;
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
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton RPnl_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ＷＧ）.<p>
	 *
	 */
	public MCButton RPnl_srch_wg = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0840.DtlR> DtlTable = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
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
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_typ = null;
	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_typ_nm = null;
	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key1 = null;
	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key2 = null;
	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key3 = null;
	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key4 = null;
	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_key5 = null;
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_no_attach = null;
	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_id = null;
	/**
	 * Heading 見出し.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_rmrks = null;
	/**
	 * Path パス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_path = null;
	/**
	 * Binary data name バイナリデータ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_bin_nm = null;
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
	// [Row]ブロック関連のField定義
	public MCPanel RowPanel = null;
	public MCTitledBorder RowTitledBorder = null;
	// [Row]ブロックの項目のField定義
	public MCLabel Row_attach_info_rmrks_Label = null;
	/**
	 * Heading 見出し.<p>
	 *
	 */
	public MCTextField Row_attach_info_rmrks = null;
	public MCLabel Row_attach_info_path_Label = null;
	/**
	 * Path パス.<p>
	 *
	 */
	public MCTextField Row_attach_info_path = null;
	public MCLabel Row_file_Label = null;
	/**
	 * File ファイル.<p>
	 *
	 */
	public MCTextField Row_file = null;
	/**
	 * Select file ファイル選択.<p>
	 *
	 */
	public MCButton Row_select_file = null;
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton Row_dwnld = null;
	/**
	 * Clear file ファイルをクリアする.<p>
	 *
	 */
	public MCButton Row_clear_file = null;
	public MCLabel Row_attach_info_bin_nm_Label = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCTextField Row_attach_info_bin_nm = null;
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
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_wg = null;
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
	
	/** [MA_MABCL0840_Srch01]のCallerの作成 */
	protected MABCP_AttachInfoReg_MC.MA_MABCL0840_Srch01Caller createMA_MABCL0840_Srch01() {
		MABCP_AttachInfoReg_MC.MA_MABCL0840_Srch01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Srch01Bridge>
		caller = ((MABCP_AttachInfoReg_MC)this).new MA_MABCL0840_Srch01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Srch01Bridge>(
					(MABCP_AttachInfoReg)this, new MA_MABCL0840_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0840_Srch01]の呼び出し */
	protected void callMA_MABCL0840_Srch01() {
		MCCaller caller = createMA_MABCL0840_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0840_Upd01]のCallerの作成 */
	protected MABCP_AttachInfoReg_MC.MA_MABCL0840_Upd01Caller createMA_MABCL0840_Upd01() {
		MABCP_AttachInfoReg_MC.MA_MABCL0840_Upd01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Upd01Bridge>
		caller = ((MABCP_AttachInfoReg_MC)this).new MA_MABCL0840_Upd01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Upd01Bridge>(
					(MABCP_AttachInfoReg)this, new MA_MABCL0840_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0840_Upd01]の呼び出し */
	protected void callMA_MABCL0840_Upd01() {
		MCCaller caller = createMA_MABCL0840_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0840_Del01]のCallerの作成 */
	protected MABCP_AttachInfoReg_MC.MA_MABCL0840_Del01Caller createMA_MABCL0840_Del01() {
		MABCP_AttachInfoReg_MC.MA_MABCL0840_Del01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Del01Bridge>
		caller = ((MABCP_AttachInfoReg_MC)this).new MA_MABCL0840_Del01Caller<MABCP_AttachInfoReg, MA_MABCL0840_Del01Bridge>(
					(MABCP_AttachInfoReg)this, new MA_MABCL0840_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0840_Del01]の呼び出し */
	protected void callMA_MABCL0840_Del01() {
		MCCaller caller = createMA_MABCL0840_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0840.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0840.DtlR> aDtlL;
	/** [Row]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0840.RowR aRowR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0840.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0840.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0840.CndR createCndR() {
		return mcframe.clientMABC.MABCP0840.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0840.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0840.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0840.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0840.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0840.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0840.DtlR.class);
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
	public void setRowR(mcframe.clientMABC.MABCP0840.RowR row) {
		if (row != null) {
			MCRow.copyall(getRowR(), row);
		}
	}

	/**
	 * [Row]ブロックのコンテナaRowRを返します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0840.RowR getRowR() {
		return aRowR;
	}

	/**
	 * aRowRを作成します。
	 *
	 * @return RowR
	 */
	public mcframe.clientMABC.MABCP0840.RowR createRowR() {
		return mcframe.clientMABC.MABCP0840.RowR.create();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(DtlPanel);
		ret.add(RowPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AttachInfoReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aRowR = createRowR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_AttachInfoReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aRowR = createRowR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_AttachInfoReg_MC.jbCreateScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateRegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateTop((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateFold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateCndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateCnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateTab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateTab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateCtrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateRPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateDtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateRow((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateDtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbCreateEastBtn((MABCP_AttachInfoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_AttachInfoReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_AttachInfoReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_AttachInfoReg p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
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
		p.Cnd_sno_p_PPanel = mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.Sno_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.Sno_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.Sno_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.Sno_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_AttachInfoReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MABCP_AttachInfoReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_AttachInfoReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP0840.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABC.MABCP0840.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
	}

	/**
	 * [Row]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRow(MABCP_AttachInfoReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_AttachInfoReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_AttachInfoReg p) {
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
	
	
	/** [Cnd_attach_info_typ_ListPutter]の定義 */
	private MCListPutter Cnd_attach_info_typ_p = null;

	/**
	 * [Cnd_attach_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_attach_info_typ_ListPutter() {
		if (Cnd_attach_info_typ_p == null) {
			Cnd_attach_info_typ_p = createCnd_attach_info_typ_ListPutter(Cnd_attach_info_typ, "attach_info_typ", "attach_info_typ_nm");

		}
		return Cnd_attach_info_typ_p;
	}
	
	
	/** [Cnd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd1_ListPutter() {
		if (Cnd_itm_grp_cd1_p == null) {
			Cnd_itm_grp_cd1_p = createCnd_itm_grp_cd1_ListPutter(Cnd_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Cnd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd2_ListPutter() {
		if (Cnd_itm_grp_cd2_p == null) {
			Cnd_itm_grp_cd2_p = createCnd_itm_grp_cd2_ListPutter(Cnd_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Cnd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd3_ListPutter() {
		if (Cnd_itm_grp_cd3_p == null) {
			Cnd_itm_grp_cd3_p = createCnd_itm_grp_cd3_ListPutter(Cnd_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Cnd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd4_ListPutter() {
		if (Cnd_itm_grp_cd4_p == null) {
			Cnd_itm_grp_cd4_p = createCnd_itm_grp_cd4_ListPutter(Cnd_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Cnd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd5_ListPutter() {
		if (Cnd_itm_grp_cd5_p == null) {
			Cnd_itm_grp_cd5_p = createCnd_itm_grp_cd5_ListPutter(Cnd_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Cnd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd6_ListPutter() {
		if (Cnd_itm_grp_cd6_p == null) {
			Cnd_itm_grp_cd6_p = createCnd_itm_grp_cd6_ListPutter(Cnd_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Cnd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd7_ListPutter() {
		if (Cnd_itm_grp_cd7_p == null) {
			Cnd_itm_grp_cd7_p = createCnd_itm_grp_cd7_ListPutter(Cnd_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Cnd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd8_ListPutter() {
		if (Cnd_itm_grp_cd8_p == null) {
			Cnd_itm_grp_cd8_p = createCnd_itm_grp_cd8_ListPutter(Cnd_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Cnd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd9_ListPutter() {
		if (Cnd_itm_grp_cd9_p == null) {
			Cnd_itm_grp_cd9_p = createCnd_itm_grp_cd9_ListPutter(Cnd_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Cnd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd10_ListPutter() {
		if (Cnd_itm_grp_cd10_p == null) {
			Cnd_itm_grp_cd10_p = createCnd_itm_grp_cd10_ListPutter(Cnd_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Cnd_itm_grp_cd10_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
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
	
	
	/** [Dtl_attach_info_typ_ListPutter]の定義 */
	private MCListPutter Dtl_attach_info_typ_p = null;

	/**
	 * [Dtl_attach_info_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_attach_info_typ_ListPutter() {
		if (Dtl_attach_info_typ_p == null) {
			Dtl_attach_info_typ_p = createDtl_attach_info_typ_ListPutter(columnDtl_attach_info_typ, "attach_info_typ", "attach_info_typ_nm");

		}
		return Dtl_attach_info_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AttachInfoReg create(){
		MABCP_AttachInfoReg p = new MABCP_AttachInfoReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AttachInfoReg create(String name){
		MABCP_AttachInfoReg p = new MABCP_AttachInfoReg(name);
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
		MABCP_AttachInfoReg_MC.jbfInitScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitRegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitTop((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitFold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitCndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitCnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitTab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitTab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitCtrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitRPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitDtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitRow((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitDtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbfInitEastBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitRegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitTop((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitFold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitCndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitCnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitTab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitTab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitCtrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitRPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitDtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitRow((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitDtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.jbInitEastBtn((MABCP_AttachInfoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_attach_info_typ_Label = p.beansFactory.createLabel("Cnd.attach_info_typ_Label");
		p.Cnd_attach_info_typ = p.beansFactory.createTextComboBox("Cnd.attach_info_typ");
		p.Cnd_attach_info_typ.setLabel(p.Cnd_attach_info_typ_Label);
		p.Cnd_attach_info_typ_nm = p.beansFactory.createTextField("Cnd.attach_info_typ_nm");
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
		p.Cnd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd1_Label");
		p.Cnd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd1");
		p.Cnd_itm_grp_cd1.setLabel(p.Cnd_itm_grp_cd1_Label);
		p.Cnd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.itm_grp_nm1");
		p.Cnd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd2_Label");
		p.Cnd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd2");
		p.Cnd_itm_grp_cd2.setLabel(p.Cnd_itm_grp_cd2_Label);
		p.Cnd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.itm_grp_nm2");
		p.Cnd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd3_Label");
		p.Cnd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd3");
		p.Cnd_itm_grp_cd3.setLabel(p.Cnd_itm_grp_cd3_Label);
		p.Cnd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.itm_grp_nm3");
		p.Cnd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd4_Label");
		p.Cnd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd4");
		p.Cnd_itm_grp_cd4.setLabel(p.Cnd_itm_grp_cd4_Label);
		p.Cnd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.itm_grp_nm4");
		p.Cnd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd5_Label");
		p.Cnd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd5");
		p.Cnd_itm_grp_cd5.setLabel(p.Cnd_itm_grp_cd5_Label);
		p.Cnd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.itm_grp_nm5");
		p.Cnd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd6_Label");
		p.Cnd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd6");
		p.Cnd_itm_grp_cd6.setLabel(p.Cnd_itm_grp_cd6_Label);
		p.Cnd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.itm_grp_nm6");
		p.Cnd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd7_Label");
		p.Cnd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd7");
		p.Cnd_itm_grp_cd7.setLabel(p.Cnd_itm_grp_cd7_Label);
		p.Cnd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.itm_grp_nm7");
		p.Cnd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd8_Label");
		p.Cnd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd8");
		p.Cnd_itm_grp_cd8.setLabel(p.Cnd_itm_grp_cd8_Label);
		p.Cnd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.itm_grp_nm8");
		p.Cnd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd9_Label");
		p.Cnd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd9");
		p.Cnd_itm_grp_cd9.setLabel(p.Cnd_itm_grp_cd9_Label);
		p.Cnd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.itm_grp_nm9");
		p.Cnd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd10_Label");
		p.Cnd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd10");
		p.Cnd_itm_grp_cd10.setLabel(p.Cnd_itm_grp_cd10_Label);
		p.Cnd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.itm_grp_nm10");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn = p.beansFactory.createButton("RPnl.srch_cmn");
		p.RPnl_srch_wg = p.beansFactory.createButton("RPnl.srch_wg");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_attach_info_typ = p.beansFactory.createTableColumn("Dtl.attach_info_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_attach_info_typ_nm = p.beansFactory.createTableColumn("Dtl.attach_info_typ_nm", MCColumnType.TEXT);
		p.columnDtl_attach_info_key1 = p.beansFactory.createTableColumn("Dtl.attach_info_key1", MCColumnType.TEXT);
		p.columnDtl_attach_info_key2 = p.beansFactory.createTableColumn("Dtl.attach_info_key2", MCColumnType.TEXT);
		p.columnDtl_attach_info_key3 = p.beansFactory.createTableColumn("Dtl.attach_info_key3", MCColumnType.TEXT);
		p.columnDtl_attach_info_key4 = p.beansFactory.createTableColumn("Dtl.attach_info_key4", MCColumnType.TEXT);
		p.columnDtl_attach_info_key5 = p.beansFactory.createTableColumn("Dtl.attach_info_key5", MCColumnType.TEXT);
		p.columnDtl_ext_sys_no_attach = p.beansFactory.createTableColumn("Dtl.ext_sys_no_attach", MCColumnType.TEXT);
		p.columnDtl_attach_info_id = p.beansFactory.createTableColumn("Dtl.attach_info_id", MCColumnType.TEXT);
		p.columnDtl_attach_info_rmrks = p.beansFactory.createTableColumn("Dtl.attach_info_rmrks", MCColumnType.TEXT);
		p.columnDtl_attach_info_path = p.beansFactory.createTableColumn("Dtl.attach_info_path", MCColumnType.TEXT);
		p.columnDtl_attach_info_bin_nm = p.beansFactory.createTableColumn("Dtl.attach_info_bin_nm", MCColumnType.TEXT);
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
	 * [Row]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRow(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.RowPanel = p.beansFactory.createPanel("Row");
		p.RowTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Row_attach_info_rmrks_Label = p.beansFactory.createLabel("Row.attach_info_rmrks_Label");
		p.Row_attach_info_rmrks = p.beansFactory.createTextField("Row.attach_info_rmrks");
		p.Row_attach_info_rmrks.setLabel(p.Row_attach_info_rmrks_Label);
		p.Row_attach_info_path_Label = p.beansFactory.createLabel("Row.attach_info_path_Label");
		p.Row_attach_info_path = p.beansFactory.createTextField("Row.attach_info_path");
		p.Row_attach_info_path.setLabel(p.Row_attach_info_path_Label);
		p.Row_file_Label = p.beansFactory.createLabel("Row.file_Label");
		p.Row_file = p.beansFactory.createTextField("Row.file");
		p.Row_file.setLabel(p.Row_file_Label);
		p.Row_select_file = p.beansFactory.createButton("Row.select_file", "no_border");
		p.Row_dwnld = p.beansFactory.createButton("Row.dwnld", "dwnld");
		p.Row_clear_file = p.beansFactory.createButton("Row.clear_file");
		p.Row_attach_info_bin_nm_Label = p.beansFactory.createLabel("Row.attach_info_bin_nm_Label");
		p.Row_attach_info_bin_nm = p.beansFactory.createTextField("Row.attach_info_bin_nm");
		p.Row_attach_info_bin_nm.setLabel(p.Row_attach_info_bin_nm_Label);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd_cmn = p.beansFactory.createButton("DtlBtn.upd_cmn", "upd");
		p.DtlBtn_upd_wg = p.beansFactory.createButton("DtlBtn.upd_wg", "upd");
		p.DtlBtn_del_cmn = p.beansFactory.createButton("DtlBtn.del_cmn", "del");
		p.DtlBtn_del_wg = p.beansFactory.createButton("DtlBtn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CndPanel);
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
	protected static void jbInitFold(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.CndTabPanel.add(p.CndTabTab);
		p.CndTabPanel.setLastBeans(p.CndTabTab);
		p.CndTabPanel.setValueCheck(false);
		p.CndTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndTabPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndTabTab.add(p.Tab1Panel, "CndTab.tab1");
		p.CndTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.CndTabTab.add(p.Tab2Panel, "CndTab.tab2");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.RPnlPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.wg_flg_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.Tab1Panel.add(p.Cnd_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_wg_cd);
		p.Tab1Panel.setLastBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.wg_cd_META);
		p.Tab1Panel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.Tab1Panel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_attach_info_typ);
		p.Cnd_attach_info_typ.setListType(MCListType.STRICT);
		p.Cnd_attach_info_typ.setLinkBeans(p.Cnd_attach_info_typ_nm);
		p.Tab1Panel.add(p.Cnd_attach_info_typ_Label);
		p.Tab1Panel.add(p.Cnd_attach_info_typ);
		p.Cnd_attach_info_typ.setNextBeans(p.Cnd_attach_info_typ_nm);
		p.Cnd_attach_info_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.attach_info_typ_META);
		p.Tab1Panel.add(p.Cnd_attach_info_typ_nm);
		p.Cnd_attach_info_typ_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_attach_info_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.attach_info_typ_nm_META);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.on_del_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0840.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.add(p.RPnlPanel);
		p.RPnlPanel.setNextBeans(p.DtlPanel);
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn.setIcon("SEARCH");
		p.RPnl_srch_cmn.setFunctionKey(MCFunctionKey.F1);
		p.RPnlPanel.add(p.RPnl_srch_cmn);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_cmn);
		p.RPnl_srch_cmn.setNextBeans(p.RPnl_srch_wg);
		p.RPnl_srch_wg.setIcon("SEARCH");
		p.RPnl_srch_wg.setFunctionKey(MCFunctionKey.F1);
		p.RPnlPanel.add(p.RPnl_srch_wg);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.RowPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Row]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRow(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.RowPanel.setBorder(p.RowTitledBorder);
		p.add(p.RowPanel);
		p.RowPanel.setNextBeans(p.DtlBtnPanel);
		p.RowPanel.setLayoutPosition("CBS");
		// ブロックの項目の初期化
		p.RowPanel.add(p.Row_attach_info_rmrks_Label);
		p.RowPanel.add(p.Row_attach_info_rmrks);
		p.RowPanel.setLastBeans(p.Row_attach_info_rmrks);
		p.Row_attach_info_rmrks.setNextBeans(p.Row_attach_info_path);
		p.Row_attach_info_rmrks.setRow(p.getRowR(), mcframe.clientMABC.MABCP0840.RowR.attach_info_rmrks_META);
		p.RowPanel.add(p.Row_attach_info_path_Label);
		p.RowPanel.add(p.Row_attach_info_path);
		p.Row_attach_info_path.setNextBeans(p.Row_file);
		p.Row_attach_info_path.setRow(p.getRowR(), mcframe.clientMABC.MABCP0840.RowR.attach_info_path_META);
		p.RowPanel.add(p.Row_file_Label);
		p.RowPanel.add(p.Row_file);
		p.Row_file.setNextBeans(p.Row_select_file);
		p.Row_file.setRow(p.getRowR(), mcframe.clientMABC.MABCP0840.RowR.file_META);
		p.Row_select_file.setIcon("FOLDER");
		p.RowPanel.add(p.Row_select_file);
		p.Row_select_file.setNextBeans(p.Row_dwnld);
		p.Row_dwnld.setIcon("DWNLD");
		p.RowPanel.add(p.Row_dwnld);
		p.Row_dwnld.setNextBeans(p.Row_clear_file);
		p.RowPanel.add(p.Row_clear_file);
		p.Row_clear_file.setNextBeans(p.Row_attach_info_bin_nm);
		p.RowPanel.add(p.Row_attach_info_bin_nm_Label);
		p.RowPanel.add(p.Row_attach_info_bin_nm);
		p.Row_attach_info_bin_nm.setRow(p.getRowR(), mcframe.clientMABC.MABCP0840.RowR.attach_info_bin_nm_META);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_AttachInfoReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
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
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_upd_cmn);
		p.DtlBtn_upd_cmn.setIcon("REGISTER");
		p.DtlBtn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_cmn);
		p.DtlBtn_upd_cmn.setNextBeans(p.DtlBtn_upd_wg);
		p.DtlBtn_upd_wg.setIcon("REGISTER");
		p.DtlBtn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_wg);
		p.DtlBtn_del_cmn.setIcon("DELETE");
		p.DtlBtn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del_cmn);
		p.EastBtnPanel.add(p.DtlBtn_del_cmn);
		p.DtlBtn_del_cmn.setNextBeans(p.DtlBtn_del_wg);
		p.DtlBtn_del_wg.setIcon("DELETE");
		p.DtlBtn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.DtlBtn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_AttachInfoReg p) {
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
		MABCP_AttachInfoReg_MC.mcInitScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitRegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitTop((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitFold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitCndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitCnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitTab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitTab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitCtrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitRPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitDtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitRow((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitDtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.mcInitEastBtn((MABCP_AttachInfoReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_AttachInfoReg_MC.statusInitUPD_ScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_RegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Top((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Fold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_CndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Cnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Tab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Tab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Ctrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_RPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Dtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_Row((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_DtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitUPD_EastBtn((MABCP_AttachInfoReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_AttachInfoReg_MC.statusInitFIX_ScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_RegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Top((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Fold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_CndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Cnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Tab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Tab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Ctrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_RPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Dtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_Row((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_DtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitFIX_EastBtn((MABCP_AttachInfoReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_AttachInfoReg_MC.statusInitDEL_ScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_RegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Top((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Fold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_CndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Cnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Tab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Tab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Ctrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_RPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Dtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_Row((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_DtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitDEL_EastBtn((MABCP_AttachInfoReg)this);

		// [REF]ステータスのモードの設定
		MABCP_AttachInfoReg_MC.statusInitREF_ScreenOpe((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_RegTarget((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Top((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Fold((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_CndTab((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Cnd((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Tab1((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Tab2((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Ctrl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_RPnl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Dtl((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_Row((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_DtlBtn((MABCP_AttachInfoReg)this);
		MABCP_AttachInfoReg_MC.statusInitREF_EastBtn((MABCP_AttachInfoReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABCP_AttachInfoReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_AttachInfoReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_attach_info_typ.setListListener(p);
		p.Cnd_attach_info_typ.addAllListener(p);
		p.Cnd_attach_info_typ_nm.setListListener(p);
		p.Cnd_attach_info_typ_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_itm_grp_cd1.setListListener(p);
		p.Cnd_itm_grp_cd1.addAllListener(p);
		p.Cnd_itm_grp_nm1.setListListener(p);
		p.Cnd_itm_grp_nm1.addAllListener(p);
		p.Cnd_itm_grp_cd2.setListListener(p);
		p.Cnd_itm_grp_cd2.addAllListener(p);
		p.Cnd_itm_grp_nm2.setListListener(p);
		p.Cnd_itm_grp_nm2.addAllListener(p);
		p.Cnd_itm_grp_cd3.setListListener(p);
		p.Cnd_itm_grp_cd3.addAllListener(p);
		p.Cnd_itm_grp_nm3.setListListener(p);
		p.Cnd_itm_grp_nm3.addAllListener(p);
		p.Cnd_itm_grp_cd4.setListListener(p);
		p.Cnd_itm_grp_cd4.addAllListener(p);
		p.Cnd_itm_grp_nm4.setListListener(p);
		p.Cnd_itm_grp_nm4.addAllListener(p);
		p.Cnd_itm_grp_cd5.setListListener(p);
		p.Cnd_itm_grp_cd5.addAllListener(p);
		p.Cnd_itm_grp_nm5.setListListener(p);
		p.Cnd_itm_grp_nm5.addAllListener(p);
		p.Cnd_itm_grp_cd6.setListListener(p);
		p.Cnd_itm_grp_cd6.addAllListener(p);
		p.Cnd_itm_grp_nm6.setListListener(p);
		p.Cnd_itm_grp_nm6.addAllListener(p);
		p.Cnd_itm_grp_cd7.setListListener(p);
		p.Cnd_itm_grp_cd7.addAllListener(p);
		p.Cnd_itm_grp_nm7.setListListener(p);
		p.Cnd_itm_grp_nm7.addAllListener(p);
		p.Cnd_itm_grp_cd8.setListListener(p);
		p.Cnd_itm_grp_cd8.addAllListener(p);
		p.Cnd_itm_grp_nm8.setListListener(p);
		p.Cnd_itm_grp_nm8.addAllListener(p);
		p.Cnd_itm_grp_cd9.setListListener(p);
		p.Cnd_itm_grp_cd9.addAllListener(p);
		p.Cnd_itm_grp_nm9.setListListener(p);
		p.Cnd_itm_grp_nm9.addAllListener(p);
		p.Cnd_itm_grp_cd10.setListListener(p);
		p.Cnd_itm_grp_cd10.addAllListener(p);
		p.Cnd_itm_grp_nm10.setListListener(p);
		p.Cnd_itm_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_AttachInfoReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_AttachInfoReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MABCP_AttachInfoReg p) {
		p.RPnl_srch_cmn.addAllListener(p);
		p.RPnl_srch_cmn.setAPMethodName("doRPnl_srch_cmn");
		p.RPnl_srch_wg.addAllListener(p);
		p.RPnl_srch_wg.setAPMethodName("doRPnl_srch_wg");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_AttachInfoReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_attach_info_typ.addAllListener(p);
		p.columnDtl_attach_info_typ.setListListener(p);
		p.columnDtl_attach_info_typ_nm.addAllListener(p);
		p.columnDtl_attach_info_typ_nm.setListListener(p);
		p.columnDtl_attach_info_key1.addAllListener(p);
		p.columnDtl_attach_info_key1.setListListener(p);
		p.columnDtl_attach_info_key2.addAllListener(p);
		p.columnDtl_attach_info_key2.setListListener(p);
		p.columnDtl_attach_info_key3.addAllListener(p);
		p.columnDtl_attach_info_key3.setListListener(p);
		p.columnDtl_attach_info_key4.addAllListener(p);
		p.columnDtl_attach_info_key4.setListListener(p);
		p.columnDtl_attach_info_key5.addAllListener(p);
		p.columnDtl_attach_info_key5.setListListener(p);
		p.columnDtl_ext_sys_no_attach.addAllListener(p);
		p.columnDtl_ext_sys_no_attach.setListListener(p);
		p.columnDtl_attach_info_id.addAllListener(p);
		p.columnDtl_attach_info_id.setListListener(p);
		p.columnDtl_attach_info_rmrks.addAllListener(p);
		p.columnDtl_attach_info_rmrks.setListListener(p);
		p.columnDtl_attach_info_path.addAllListener(p);
		p.columnDtl_attach_info_path.setListListener(p);
		p.columnDtl_attach_info_bin_nm.addAllListener(p);
		p.columnDtl_attach_info_bin_nm.setListListener(p);
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
	 *  [Row]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRow(MABCP_AttachInfoReg p) {
		p.Row_attach_info_rmrks.setListListener(p);
		p.Row_attach_info_rmrks.addAllListener(p);
		p.Row_attach_info_path.setListListener(p);
		p.Row_attach_info_path.addAllListener(p);
		p.Row_file.setListListener(p);
		p.Row_file.addAllListener(p);
		p.Row_select_file.addAllListener(p);
		p.Row_select_file.setAPMethodName("doRow_select_file");
		p.Row_dwnld.addAllListener(p);
		p.Row_dwnld.setAPMethodName("doRow_dwnld");
		p.Row_clear_file.addAllListener(p);
		p.Row_clear_file.setAPMethodName("doRow_clear_file");
		p.Row_attach_info_bin_nm.setListListener(p);
		p.Row_attach_info_bin_nm.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_AttachInfoReg p) {
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
		p.DtlBtn_upd_cmn.addAllListener(p);
		p.DtlBtn_upd_cmn.setAPMethodName("doDtlBtn_upd_cmn");
		p.DtlBtn_upd_wg.addAllListener(p);
		p.DtlBtn_upd_wg.setAPMethodName("doDtlBtn_upd_wg");
		p.DtlBtn_del_cmn.addAllListener(p);
		p.DtlBtn_del_cmn.setAPMethodName("doDtlBtn_del_cmn");
		p.DtlBtn_del_wg.addAllListener(p);
		p.DtlBtn_del_wg.setAPMethodName("doDtlBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_AttachInfoReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_AttachInfoReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_attach_info_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attach_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_AttachInfoReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MABCP_AttachInfoReg p){
		p.RPnl_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_AttachInfoReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_attach_info_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_attach_info_key2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_attach_info_key3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_attach_info_key4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_attach_info_key5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ext_sys_no_attach.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_attach_info_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attach_info_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_attach_info_path.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_attach_info_bin_nm.putMode(p, UPD, MCMode.INVISIBLE);
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
	 * [UPD]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Row(MABCP_AttachInfoReg p){
		p.Row_attach_info_rmrks.putMode(p, UPD, MCMode.REQUIRED);
		p.Row_attach_info_path.putMode(p, UPD, MCMode.ENABLE);
		p.Row_file.putMode(p, UPD, MCMode.READ_ONLY);
		p.Row_select_file.putMode(p, UPD, MCMode.ENABLE);
		p.Row_dwnld.putMode(p, UPD, MCMode.ENABLE);
		p.Row_clear_file.putMode(p, UPD, MCMode.ENABLE);
		p.Row_attach_info_bin_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_AttachInfoReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_wg.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_AttachInfoReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_attach_info_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attach_info_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_AttachInfoReg p){

	}

	/**
	 * [FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RPnl(MABCP_AttachInfoReg p){
		p.RPnl_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_AttachInfoReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_attach.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attach_info_rmrks.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_attach_info_path.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_attach_info_bin_nm.putMode(p, FIX, MCMode.INVISIBLE);
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
	 * [FIX]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Row(MABCP_AttachInfoReg p){
		p.Row_attach_info_rmrks.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_attach_info_path.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_file.putMode(p, FIX, MCMode.READ_ONLY);
		p.Row_select_file.putMode(p, FIX, MCMode.DISABLE);
		p.Row_dwnld.putMode(p, FIX, MCMode.DISABLE);
		p.Row_clear_file.putMode(p, FIX, MCMode.DISABLE);
		p.Row_attach_info_bin_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_AttachInfoReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_AttachInfoReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_attach_info_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_attach_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_AttachInfoReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MABCP_AttachInfoReg p){
		p.RPnl_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_AttachInfoReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_attach.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_attach_info_path.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_attach_info_bin_nm.putMode(p, DEL, MCMode.INVISIBLE);
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
	 * [DEL]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Row(MABCP_AttachInfoReg p){
		p.Row_attach_info_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_attach_info_path.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_file.putMode(p, DEL, MCMode.READ_ONLY);
		p.Row_select_file.putMode(p, DEL, MCMode.DISABLE);
		p.Row_dwnld.putMode(p, DEL, MCMode.DISABLE);
		p.Row_clear_file.putMode(p, DEL, MCMode.DISABLE);
		p.Row_attach_info_bin_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_AttachInfoReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_del_wg.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_AttachInfoReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_attach_info_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_attach_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_AttachInfoReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MABCP_AttachInfoReg p){
		p.RPnl_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_AttachInfoReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_attach.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_attach_info_path.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_attach_info_bin_nm.putMode(p, REF, MCMode.INVISIBLE);
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
	 * [REF]ステータスの[Row]ブロックのモードの設定
	 */
	protected static void statusInitREF_Row(MABCP_AttachInfoReg p){
		p.Row_attach_info_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_attach_info_path.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_file.putMode(p, REF, MCMode.READ_ONLY);
		p.Row_select_file.putMode(p, REF, MCMode.DISABLE);
		p.Row_dwnld.putMode(p, REF, MCMode.DISABLE);
		p.Row_clear_file.putMode(p, REF, MCMode.DISABLE);
		p.Row_attach_info_bin_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_AttachInfoReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_AttachInfoReg p){

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
		MABCP_AttachInfoReg_MC.setTableConfigDtl((MABCP_AttachInfoReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_AttachInfoReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0840.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0840.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub3, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABC.MABCP0840.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0840.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoTable);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0840.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_attach_info_typ.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_typ_META);
		p.columnDtl_attach_info_typ.addLinkBeans(p.columnDtl_attach_info_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_typ);
		p.columnDtl_attach_info_typ_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_typ_nm);
		p.columnDtl_attach_info_key1.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key1);
		p.columnDtl_attach_info_key2.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key2);
		p.columnDtl_attach_info_key3.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_key3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key3);
		p.columnDtl_attach_info_key4.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_key4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key4);
		p.columnDtl_attach_info_key5.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_key5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_key5);
		p.columnDtl_ext_sys_no_attach.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ext_sys_no_attach_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_attach);
		p.columnDtl_attach_info_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_id);
		p.columnDtl_attach_info_rmrks.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_rmrks);
		p.columnDtl_attach_info_path.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_path_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_path);
		p.columnDtl_attach_info_bin_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.attach_info_bin_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_bin_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0840.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0840.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0840.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0840.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0840.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0840.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0840.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_attach_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_attach_info_typ.getListConfig().setPutter(getCnd_attach_info_typ_ListPutter());
		Cnd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd1.getListConfig().setPutter(getCnd_itm_grp_cd1_ListPutter());
		Cnd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd2.getListConfig().setPutter(getCnd_itm_grp_cd2_ListPutter());
		Cnd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd3.getListConfig().setPutter(getCnd_itm_grp_cd3_ListPutter());
		Cnd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd4.getListConfig().setPutter(getCnd_itm_grp_cd4_ListPutter());
		Cnd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd5.getListConfig().setPutter(getCnd_itm_grp_cd5_ListPutter());
		Cnd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd6.getListConfig().setPutter(getCnd_itm_grp_cd6_ListPutter());
		Cnd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd7.getListConfig().setPutter(getCnd_itm_grp_cd7_ListPutter());
		Cnd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd8.getListConfig().setPutter(getCnd_itm_grp_cd8_ListPutter());
		Cnd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd9.getListConfig().setPutter(getCnd_itm_grp_cd9_ListPutter());
		Cnd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd10.getListConfig().setPutter(getCnd_itm_grp_cd10_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_attach_info_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_attach_info_typ.getListConfig().setPutter(getDtl_attach_info_typ_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
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
	 * [Cnd_attach_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_attach_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AttachInfoTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
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
	 * [Dtl_attach_info_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_attach_info_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AttachInfoTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_attach_info_typ) return getCnd_attach_info_typ(row, info);
		if(combo == Cnd_itm_grp_cd1) return getCnd_itm_grp_cd1(row, info);
		if(combo == Cnd_itm_grp_cd2) return getCnd_itm_grp_cd2(row, info);
		if(combo == Cnd_itm_grp_cd3) return getCnd_itm_grp_cd3(row, info);
		if(combo == Cnd_itm_grp_cd4) return getCnd_itm_grp_cd4(row, info);
		if(combo == Cnd_itm_grp_cd5) return getCnd_itm_grp_cd5(row, info);
		if(combo == Cnd_itm_grp_cd6) return getCnd_itm_grp_cd6(row, info);
		if(combo == Cnd_itm_grp_cd7) return getCnd_itm_grp_cd7(row, info);
		if(combo == Cnd_itm_grp_cd8) return getCnd_itm_grp_cd8(row, info);
		if(combo == Cnd_itm_grp_cd9) return getCnd_itm_grp_cd9(row, info);
		if(combo == Cnd_itm_grp_cd10) return getCnd_itm_grp_cd10(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_attach_info_typ) return getDtl_attach_info_typ(row, info);
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
		else if (ap == RPnl_srch_cmn) doRPnl_srch_cmn(info);
		else if (ap == RPnl_srch_wg) doRPnl_srch_wg(info);
		else if (ap == Row_select_file) doRow_select_file(info);
		else if (ap == Row_dwnld) doRow_dwnld(info);
		else if (ap == Row_clear_file) doRow_clear_file(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_upd_cmn) doDtlBtn_upd_cmn(info);
		else if (ap == DtlBtn_upd_wg) doDtlBtn_upd_wg(info);
		else if (ap == DtlBtn_del_cmn) doDtlBtn_del_cmn(info);
		else if (ap == DtlBtn_del_wg) doDtlBtn_del_wg(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_cmn(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_wg(MCEventInfo info);

	/**
	 * [Row]パネルの[select_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRow_select_file(MCEventInfo info);

	/**
	 * [Row]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRow_dwnld(MCEventInfo info);

	/**
	 * [Row]パネルの[clear_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRow_clear_file(MCEventInfo info);

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
	 * [DtlBtn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_wg(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_wg(MCEventInfo info);

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
		if (vc == CndTabTab) return doCndTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_attach_info_typ) return doCnd_attach_info_typ_VC(info);
		if (vc == Cnd_attach_info_typ_nm) return doCnd_attach_info_typ_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_itm_grp_cd1) return doCnd_itm_grp_cd1_VC(info);
		if (vc == Cnd_itm_grp_nm1) return doCnd_itm_grp_nm1_VC(info);
		if (vc == Cnd_itm_grp_cd2) return doCnd_itm_grp_cd2_VC(info);
		if (vc == Cnd_itm_grp_nm2) return doCnd_itm_grp_nm2_VC(info);
		if (vc == Cnd_itm_grp_cd3) return doCnd_itm_grp_cd3_VC(info);
		if (vc == Cnd_itm_grp_nm3) return doCnd_itm_grp_nm3_VC(info);
		if (vc == Cnd_itm_grp_cd4) return doCnd_itm_grp_cd4_VC(info);
		if (vc == Cnd_itm_grp_nm4) return doCnd_itm_grp_nm4_VC(info);
		if (vc == Cnd_itm_grp_cd5) return doCnd_itm_grp_cd5_VC(info);
		if (vc == Cnd_itm_grp_nm5) return doCnd_itm_grp_nm5_VC(info);
		if (vc == Cnd_itm_grp_cd6) return doCnd_itm_grp_cd6_VC(info);
		if (vc == Cnd_itm_grp_nm6) return doCnd_itm_grp_nm6_VC(info);
		if (vc == Cnd_itm_grp_cd7) return doCnd_itm_grp_cd7_VC(info);
		if (vc == Cnd_itm_grp_nm7) return doCnd_itm_grp_nm7_VC(info);
		if (vc == Cnd_itm_grp_cd8) return doCnd_itm_grp_cd8_VC(info);
		if (vc == Cnd_itm_grp_nm8) return doCnd_itm_grp_nm8_VC(info);
		if (vc == Cnd_itm_grp_cd9) return doCnd_itm_grp_cd9_VC(info);
		if (vc == Cnd_itm_grp_nm9) return doCnd_itm_grp_nm9_VC(info);
		if (vc == Cnd_itm_grp_cd10) return doCnd_itm_grp_cd10_VC(info);
		if (vc == Cnd_itm_grp_nm10) return doCnd_itm_grp_nm10_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_attach_info_typ) return doDtl_attach_info_typ_VC(info);
		if (vc == columnDtl_attach_info_typ_nm) return doDtl_attach_info_typ_nm_VC(info);
		if (vc == columnDtl_attach_info_key1) return doDtl_attach_info_key1_VC(info);
		if (vc == columnDtl_attach_info_key2) return doDtl_attach_info_key2_VC(info);
		if (vc == columnDtl_attach_info_key3) return doDtl_attach_info_key3_VC(info);
		if (vc == columnDtl_attach_info_key4) return doDtl_attach_info_key4_VC(info);
		if (vc == columnDtl_attach_info_key5) return doDtl_attach_info_key5_VC(info);
		if (vc == columnDtl_ext_sys_no_attach) return doDtl_ext_sys_no_attach_VC(info);
		if (vc == columnDtl_attach_info_id) return doDtl_attach_info_id_VC(info);
		if (vc == columnDtl_attach_info_rmrks) return doDtl_attach_info_rmrks_VC(info);
		if (vc == columnDtl_attach_info_path) return doDtl_attach_info_path_VC(info);
		if (vc == columnDtl_attach_info_bin_nm) return doDtl_attach_info_bin_nm_VC(info);
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
		if (vc == Row_attach_info_rmrks) return doRow_attach_info_rmrks_VC(info);
		if (vc == Row_attach_info_path) return doRow_attach_info_path_VC(info);
		if (vc == Row_file) return doRow_file_VC(info);
		if (vc == Row_attach_info_bin_nm) return doRow_attach_info_bin_nm_VC(info);
		return true;
	}

	/**
	 * [CndTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCndTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[attach_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attach_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attach_info_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm10_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[attach_info_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_no_attach_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_bin_nm_VC(MCEventInfo info){
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
	 * [Row]パネルの[attach_info_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_attach_info_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[attach_info_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_attach_info_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[file]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_file_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Row]パネルの[attach_info_bin_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRow_attach_info_bin_nm_VC(MCEventInfo info){
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
		if (nc == CndTabTab) doCndTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_attach_info_typ) doCnd_attach_info_typ_NC(info);
		else if (nc == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_attach_info_typ) doDtl_attach_info_typ_NC(info);
		else if (nc == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NC(info);
		else if (nc == columnDtl_attach_info_key1) doDtl_attach_info_key1_NC(info);
		else if (nc == columnDtl_attach_info_key2) doDtl_attach_info_key2_NC(info);
		else if (nc == columnDtl_attach_info_key3) doDtl_attach_info_key3_NC(info);
		else if (nc == columnDtl_attach_info_key4) doDtl_attach_info_key4_NC(info);
		else if (nc == columnDtl_attach_info_key5) doDtl_attach_info_key5_NC(info);
		else if (nc == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NC(info);
		else if (nc == columnDtl_attach_info_id) doDtl_attach_info_id_NC(info);
		else if (nc == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NC(info);
		else if (nc == columnDtl_attach_info_path) doDtl_attach_info_path_NC(info);
		else if (nc == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NC(info);
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
		else if (nc == Row_attach_info_rmrks) doRow_attach_info_rmrks_NC(info);
		else if (nc == Row_attach_info_path) doRow_attach_info_path_NC(info);
		else if (nc == Row_file) doRow_file_NC(info);
		else if (nc == Row_attach_info_bin_nm) doRow_attach_info_bin_nm_NC(info);
	}

	/**
	 * [CndTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[attach_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[attach_info_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NC(MCEventInfo info){
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
	 * [Row]パネルの[attach_info_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_path_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[file]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_file_NC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_bin_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_bin_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CndTabTab) doCndTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_attach_info_typ) doCnd_attach_info_typ_NE(info);
		else if (ne == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_attach_info_typ) doDtl_attach_info_typ_NE(info);
		else if (ne == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NE(info);
		else if (ne == columnDtl_attach_info_key1) doDtl_attach_info_key1_NE(info);
		else if (ne == columnDtl_attach_info_key2) doDtl_attach_info_key2_NE(info);
		else if (ne == columnDtl_attach_info_key3) doDtl_attach_info_key3_NE(info);
		else if (ne == columnDtl_attach_info_key4) doDtl_attach_info_key4_NE(info);
		else if (ne == columnDtl_attach_info_key5) doDtl_attach_info_key5_NE(info);
		else if (ne == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NE(info);
		else if (ne == columnDtl_attach_info_id) doDtl_attach_info_id_NE(info);
		else if (ne == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NE(info);
		else if (ne == columnDtl_attach_info_path) doDtl_attach_info_path_NE(info);
		else if (ne == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NE(info);
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
		else if (ne == Row_attach_info_rmrks) doRow_attach_info_rmrks_NE(info);
		else if (ne == Row_attach_info_path) doRow_attach_info_path_NE(info);
		else if (ne == Row_file) doRow_file_NE(info);
		else if (ne == Row_attach_info_bin_nm) doRow_attach_info_bin_nm_NE(info);
	}

	/**
	 * [CndTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[attach_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[attach_info_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NE(MCEventInfo info){
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
	 * [Row]パネルの[attach_info_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_path_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[file]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_file_NE(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_bin_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_bin_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CndTabTab) doCndTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_attach_info_typ) doCnd_attach_info_typ_NX(info);
		else if (nx == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_attach_info_typ) doDtl_attach_info_typ_NX(info);
		else if (nx == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_NX(info);
		else if (nx == columnDtl_attach_info_key1) doDtl_attach_info_key1_NX(info);
		else if (nx == columnDtl_attach_info_key2) doDtl_attach_info_key2_NX(info);
		else if (nx == columnDtl_attach_info_key3) doDtl_attach_info_key3_NX(info);
		else if (nx == columnDtl_attach_info_key4) doDtl_attach_info_key4_NX(info);
		else if (nx == columnDtl_attach_info_key5) doDtl_attach_info_key5_NX(info);
		else if (nx == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_NX(info);
		else if (nx == columnDtl_attach_info_id) doDtl_attach_info_id_NX(info);
		else if (nx == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_NX(info);
		else if (nx == columnDtl_attach_info_path) doDtl_attach_info_path_NX(info);
		else if (nx == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_NX(info);
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
		else if (nx == Row_attach_info_rmrks) doRow_attach_info_rmrks_NX(info);
		else if (nx == Row_attach_info_path) doRow_attach_info_path_NX(info);
		else if (nx == Row_file) doRow_file_NX(info);
		else if (nx == Row_attach_info_bin_nm) doRow_attach_info_bin_nm_NX(info);
	}

	/**
	 * [CndTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[attach_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[attach_info_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_NX(MCEventInfo info){
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
	 * [Row]パネルの[attach_info_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_path_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[file]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_file_NX(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_bin_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_bin_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_attach_info_typ) doCnd_attach_info_typ_LC(info);
		else if (lc == Cnd_attach_info_typ_nm) doCnd_attach_info_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_attach_info_typ) doDtl_attach_info_typ_LC(info);
		else if (lc == columnDtl_attach_info_typ_nm) doDtl_attach_info_typ_nm_LC(info);
		else if (lc == columnDtl_attach_info_key1) doDtl_attach_info_key1_LC(info);
		else if (lc == columnDtl_attach_info_key2) doDtl_attach_info_key2_LC(info);
		else if (lc == columnDtl_attach_info_key3) doDtl_attach_info_key3_LC(info);
		else if (lc == columnDtl_attach_info_key4) doDtl_attach_info_key4_LC(info);
		else if (lc == columnDtl_attach_info_key5) doDtl_attach_info_key5_LC(info);
		else if (lc == columnDtl_ext_sys_no_attach) doDtl_ext_sys_no_attach_LC(info);
		else if (lc == columnDtl_attach_info_id) doDtl_attach_info_id_LC(info);
		else if (lc == columnDtl_attach_info_rmrks) doDtl_attach_info_rmrks_LC(info);
		else if (lc == columnDtl_attach_info_path) doDtl_attach_info_path_LC(info);
		else if (lc == columnDtl_attach_info_bin_nm) doDtl_attach_info_bin_nm_LC(info);
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
		else if (lc == Row_attach_info_rmrks) doRow_attach_info_rmrks_LC(info);
		else if (lc == Row_attach_info_path) doRow_attach_info_path_LC(info);
		else if (lc == Row_file) doRow_file_LC(info);
		else if (lc == Row_attach_info_bin_nm) doRow_attach_info_bin_nm_LC(info);
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
	 * [Cnd]パネルの[attach_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attach_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attach_info_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[attach_info_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_key5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_attach]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_attach_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_path_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_bin_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_bin_nm_LC(MCEventInfo info){
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
	 * [Row]パネルの[attach_info_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_path_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[file]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_file_LC(MCEventInfo info){
	}

	/**
	 * [Row]パネルの[attach_info_bin_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRow_attach_info_bin_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_attach_info_typ]の作成メソッド
	 */
	public MCList getCnd_attach_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAttachInfoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_attach_info_typ]の作成メソッド
	 */
	public MCList getDtl_attach_info_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAttachInfoTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0840.Srch01")) {
			return new MA_MABCL0840_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0840.Upd01")) {
			return new MA_MABCL0840_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0840.Del01")) {
			return new MA_MABCL0840_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0840_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0840_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0840_Srch01Bridge() {
			p_MA_MABCL0840_Srch01 = new MCParam(PDef.MA_MABCL0840_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0840_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0840.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0840.DtlR.class));

			p_MA_MABCL0840_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0840_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0840_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0840_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0840_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0840.CndR up0() {
			return (mcframe.clientMABC.MABCP0840.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0840.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0840.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0840_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0840.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0840_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0840.DtlR>)p_MA_MABCL0840_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0840_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0840_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0840_Upd01Bridge() {
			p_MA_MABCL0840_Upd01 = new MCParam(PDef.MA_MABCL0840_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0840_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0840.DtlR.class));
			// Down

			p_MA_MABCL0840_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0840_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0840_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0840_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0840_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0840.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0840.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0840_Upd01;
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
	/**
	 * [MA_MABCL0840_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0840_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0840_Del01;

		/** コンストラクタ */
		protected MA_MABCL0840_Del01Bridge() {
			p_MA_MABCL0840_Del01 = new MCParam(PDef.MA_MABCL0840_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0840_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0840.DtlR.class));
			// Down

			p_MA_MABCL0840_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0840_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0840_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0840_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0840_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0840.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0840.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0840_Del01;
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