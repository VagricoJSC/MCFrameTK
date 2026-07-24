package mcframe.clientMABC.MABCP1510;

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
import mcframe.clientMABC.MABCP1510.MABCP_IfCdRuleReg_MC.MA_MABCL1510_Srch01Caller;
import mcframe.clientMABC.MABCP1510.MABCP_IfCdRuleReg_MC.MA_MABCL1510_Upd01Caller;
import mcframe.clientMABC.MABCP1510.MABCP_IfCdRuleReg_MC.MA_MABCL1510_Del01Caller;

/**
 * 画面"MABCP_IfCdRuleReg"パネルクラスです。<p>
 *
 * ＩＦコードルールマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_IfCdRuleReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP1510";

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
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
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
	public MCLabel Cnd_bp_grp_cd1_Label = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm1 = null;
	public MCLabel Cnd_bp_grp_cd2_Label = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm2 = null;
	public MCLabel Cnd_bp_grp_cd3_Label = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm3 = null;
	public MCLabel Cnd_bp_grp_cd4_Label = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm4 = null;
	public MCLabel Cnd_bp_grp_cd5_Label = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm5 = null;
	public MCLabel Cnd_bp_grp_cd6_Label = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm6 = null;
	public MCLabel Cnd_bp_grp_cd7_Label = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm7 = null;
	public MCLabel Cnd_bp_grp_cd8_Label = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm8 = null;
	public MCLabel Cnd_bp_grp_cd9_Label = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm9 = null;
	public MCLabel Cnd_bp_grp_cd10_Label = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm10 = null;
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
	// [DispDtl]ブロック関連のField定義
	public MCPanel DispDtlPanel = null;
	public MCScrollPane DispDtlScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMABC.MABCP1510.DispDtlR> DispDtlTable = null;
	// [DispDtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ext_sys_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bp_nm = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_00 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_01 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_02 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_03 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_04 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_05 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_06 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_07 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_08 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_09 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_10 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_11 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_12 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_13 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_14 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_15 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_16 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_17 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_18 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_19 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_20 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_21 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_22 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_23 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_24 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_25 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_26 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_27 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_28 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_29 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_30 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_31 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_32 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_33 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_34 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_35 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_36 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_37 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_38 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_39 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_40 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_41 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_42 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_43 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_44 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_45 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_46 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_47 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_48 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_49 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_50 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_51 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_52 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_53 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_54 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_55 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_56 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_57 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_58 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_59 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_60 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_61 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_62 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_63 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_64 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_65 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_66 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_67 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_68 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_69 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_70 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_71 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_72 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_73 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_74 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_75 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_76 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_77 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_78 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_79 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_80 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_81 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_82 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_83 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_84 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_85 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_86 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_87 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_88 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_89 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_90 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_91 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_92 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_93 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_94 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_95 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_96 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_97 = null;
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_98 = null;
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_col_conv_typ_99 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_00 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_01 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_02 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_03 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_04 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_05 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_06 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_07 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_08 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_09 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_10 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_11 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_12 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_13 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_14 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_15 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_16 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_17 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_18 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_19 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_20 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_21 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_22 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_23 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_24 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_25 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_26 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_27 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_28 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_29 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_30 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_31 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_32 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_33 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_34 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_35 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_36 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_37 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_38 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_39 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_40 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_41 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_42 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_43 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_44 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_45 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_46 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_47 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_48 = null;
	public MCColumnGroup cgDispDtl_if_col_typ_cg_49 = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1510.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
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
	public MCButton DtlBtn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del = null;
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
	
	/** [MA_MABCL1510_Srch01]のCallerの作成 */
	protected MABCP_IfCdRuleReg_MC.MA_MABCL1510_Srch01Caller createMA_MABCL1510_Srch01() {
		MABCP_IfCdRuleReg_MC.MA_MABCL1510_Srch01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Srch01Bridge>
		caller = ((MABCP_IfCdRuleReg_MC)this).new MA_MABCL1510_Srch01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Srch01Bridge>(
					(MABCP_IfCdRuleReg)this, new MA_MABCL1510_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1510_Srch01]の呼び出し */
	protected void callMA_MABCL1510_Srch01() {
		MCCaller caller = createMA_MABCL1510_Srch01();
		caller.exec();
	}
	/** [MA_MABCL1510_Upd01]のCallerの作成 */
	protected MABCP_IfCdRuleReg_MC.MA_MABCL1510_Upd01Caller createMA_MABCL1510_Upd01() {
		MABCP_IfCdRuleReg_MC.MA_MABCL1510_Upd01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Upd01Bridge>
		caller = ((MABCP_IfCdRuleReg_MC)this).new MA_MABCL1510_Upd01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Upd01Bridge>(
					(MABCP_IfCdRuleReg)this, new MA_MABCL1510_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL1510_Upd01]の呼び出し */
	protected void callMA_MABCL1510_Upd01() {
		MCCaller caller = createMA_MABCL1510_Upd01();
		caller.exec();
	}
	/** [MA_MABCL1510_Del01]のCallerの作成 */
	protected MABCP_IfCdRuleReg_MC.MA_MABCL1510_Del01Caller createMA_MABCL1510_Del01() {
		MABCP_IfCdRuleReg_MC.MA_MABCL1510_Del01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Del01Bridge>
		caller = ((MABCP_IfCdRuleReg_MC)this).new MA_MABCL1510_Del01Caller<MABCP_IfCdRuleReg, MA_MABCL1510_Del01Bridge>(
					(MABCP_IfCdRuleReg)this, new MA_MABCL1510_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL1510_Del01]の呼び出し */
	protected void callMA_MABCL1510_Del01() {
		MCCaller caller = createMA_MABCL1510_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1510.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1510.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1510.DispDtlR> aDispDtlL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1510.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1510.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1510.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1510.MstR createMstR() {
		return mcframe.clientMABC.MABCP1510.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1510.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1510.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1510.CndR createCndR() {
		return mcframe.clientMABC.MABCP1510.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMABC.MABCP1510.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1510.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMABC.MABCP1510.DispDtlR createDispDtlR() {
		return mcframe.clientMABC.MABCP1510.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1510.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1510.DispDtlR.class);
	}

	/**
	 * DispDtlTableを初期化します。
	 */
	protected void createDispDtlTable(){
		if(DispDtlTable == null){
			DispDtlTable = beansFactory.createColumnGroupTable("DispDtl.table");
		}
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP1510.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1510.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP1510.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP1510.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1510.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1510.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDispDtlL())) ret.add(getDispDtlL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDispDtlL()) return "DispDtl";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("DispDtl")) return getDispDtlL();
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
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(DispDtlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfCdRuleReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_IfCdRuleReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		createDispDtlTable();
		DispDtlTable.setRowName(name);
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_IfCdRuleReg_MC.jbCreateScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateMst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateTop((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateFold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateCndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateCnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateTab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateTab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateCtrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateDispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateDtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbCreateEastBtn((MABCP_IfCdRuleReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_IfCdRuleReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_IfCdRuleReg p) {
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

	
	/** [Cnd_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ext_sys_cd_p = null;

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ext_sys_cd_ListPutter() {
		if (Cnd_ext_sys_cd_p == null) {
			Cnd_ext_sys_cd_p = createCnd_ext_sys_cd_ListPutter(Cnd_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Cnd_ext_sys_cd_p;
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
	
	
	/** [Cnd_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd1_p = null;

	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd1_ListPutter() {
		if (Cnd_bp_grp_cd1_p == null) {
			Cnd_bp_grp_cd1_p = createCnd_bp_grp_cd1_ListPutter(Cnd_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Cnd_bp_grp_cd1_p;
	}
	
	
	/** [Cnd_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd2_p = null;

	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd2_ListPutter() {
		if (Cnd_bp_grp_cd2_p == null) {
			Cnd_bp_grp_cd2_p = createCnd_bp_grp_cd2_ListPutter(Cnd_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Cnd_bp_grp_cd2_p;
	}
	
	
	/** [Cnd_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd3_p = null;

	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd3_ListPutter() {
		if (Cnd_bp_grp_cd3_p == null) {
			Cnd_bp_grp_cd3_p = createCnd_bp_grp_cd3_ListPutter(Cnd_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Cnd_bp_grp_cd3_p;
	}
	
	
	/** [Cnd_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd4_p = null;

	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd4_ListPutter() {
		if (Cnd_bp_grp_cd4_p == null) {
			Cnd_bp_grp_cd4_p = createCnd_bp_grp_cd4_ListPutter(Cnd_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Cnd_bp_grp_cd4_p;
	}
	
	
	/** [Cnd_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd5_p = null;

	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd5_ListPutter() {
		if (Cnd_bp_grp_cd5_p == null) {
			Cnd_bp_grp_cd5_p = createCnd_bp_grp_cd5_ListPutter(Cnd_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Cnd_bp_grp_cd5_p;
	}
	
	
	/** [Cnd_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd6_p = null;

	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd6_ListPutter() {
		if (Cnd_bp_grp_cd6_p == null) {
			Cnd_bp_grp_cd6_p = createCnd_bp_grp_cd6_ListPutter(Cnd_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Cnd_bp_grp_cd6_p;
	}
	
	
	/** [Cnd_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd7_p = null;

	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd7_ListPutter() {
		if (Cnd_bp_grp_cd7_p == null) {
			Cnd_bp_grp_cd7_p = createCnd_bp_grp_cd7_ListPutter(Cnd_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Cnd_bp_grp_cd7_p;
	}
	
	
	/** [Cnd_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd8_p = null;

	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd8_ListPutter() {
		if (Cnd_bp_grp_cd8_p == null) {
			Cnd_bp_grp_cd8_p = createCnd_bp_grp_cd8_ListPutter(Cnd_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Cnd_bp_grp_cd8_p;
	}
	
	
	/** [Cnd_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd9_p = null;

	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd9_ListPutter() {
		if (Cnd_bp_grp_cd9_p == null) {
			Cnd_bp_grp_cd9_p = createCnd_bp_grp_cd9_ListPutter(Cnd_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Cnd_bp_grp_cd9_p;
	}
	
	
	/** [Cnd_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd10_p = null;

	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd10_ListPutter() {
		if (Cnd_bp_grp_cd10_p == null) {
			Cnd_bp_grp_cd10_p = createCnd_bp_grp_cd10_ListPutter(Cnd_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Cnd_bp_grp_cd10_p;
	}
	
	
	/** [DispDtl_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter DispDtl_ext_sys_cd_p = null;

	/**
	 * [DispDtl_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_ext_sys_cd_ListPutter() {
		if (DispDtl_ext_sys_cd_p == null) {
			DispDtl_ext_sys_cd_p = createDispDtl_ext_sys_cd_ListPutter(columnDispDtl_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return DispDtl_ext_sys_cd_p;
	}
	
	
	/** [DispDtl_bp_cd_ListPutter]の定義 */
	private MCListPutter DispDtl_bp_cd_p = null;

	/**
	 * [DispDtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_bp_cd_ListPutter() {
		if (DispDtl_bp_cd_p == null) {
			DispDtl_bp_cd_p = createDispDtl_bp_cd_ListPutter(columnDispDtl_bp_cd, "bp_cd", "bp_nm");

		}
		return DispDtl_bp_cd_p;
	}
	
	
	/** [DispDtl_col_conv_typ_00_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_00_p = null;

	/**
	 * [DispDtl_col_conv_typ_00_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_00_ListPutter() {
		if (DispDtl_col_conv_typ_00_p == null) {
			DispDtl_col_conv_typ_00_p = createDispDtl_col_conv_typ_00_ListPutter(columnDispDtl_col_conv_typ_00, "col_conv_typ_00", "col_conv_typ_01");

		}
		return DispDtl_col_conv_typ_00_p;
	}
	
	
	/** [DispDtl_col_conv_typ_02_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_02_p = null;

	/**
	 * [DispDtl_col_conv_typ_02_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_02_ListPutter() {
		if (DispDtl_col_conv_typ_02_p == null) {
			DispDtl_col_conv_typ_02_p = createDispDtl_col_conv_typ_02_ListPutter(columnDispDtl_col_conv_typ_02, "col_conv_typ_02", "col_conv_typ_03");

		}
		return DispDtl_col_conv_typ_02_p;
	}
	
	
	/** [DispDtl_col_conv_typ_04_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_04_p = null;

	/**
	 * [DispDtl_col_conv_typ_04_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_04_ListPutter() {
		if (DispDtl_col_conv_typ_04_p == null) {
			DispDtl_col_conv_typ_04_p = createDispDtl_col_conv_typ_04_ListPutter(columnDispDtl_col_conv_typ_04, "col_conv_typ_04", "col_conv_typ_05");

		}
		return DispDtl_col_conv_typ_04_p;
	}
	
	
	/** [DispDtl_col_conv_typ_06_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_06_p = null;

	/**
	 * [DispDtl_col_conv_typ_06_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_06_ListPutter() {
		if (DispDtl_col_conv_typ_06_p == null) {
			DispDtl_col_conv_typ_06_p = createDispDtl_col_conv_typ_06_ListPutter(columnDispDtl_col_conv_typ_06, "col_conv_typ_06", "col_conv_typ_07");

		}
		return DispDtl_col_conv_typ_06_p;
	}
	
	
	/** [DispDtl_col_conv_typ_08_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_08_p = null;

	/**
	 * [DispDtl_col_conv_typ_08_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_08_ListPutter() {
		if (DispDtl_col_conv_typ_08_p == null) {
			DispDtl_col_conv_typ_08_p = createDispDtl_col_conv_typ_08_ListPutter(columnDispDtl_col_conv_typ_08, "col_conv_typ_08", "col_conv_typ_09");

		}
		return DispDtl_col_conv_typ_08_p;
	}
	
	
	/** [DispDtl_col_conv_typ_10_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_10_p = null;

	/**
	 * [DispDtl_col_conv_typ_10_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_10_ListPutter() {
		if (DispDtl_col_conv_typ_10_p == null) {
			DispDtl_col_conv_typ_10_p = createDispDtl_col_conv_typ_10_ListPutter(columnDispDtl_col_conv_typ_10, "col_conv_typ_10", "col_conv_typ_11");

		}
		return DispDtl_col_conv_typ_10_p;
	}
	
	
	/** [DispDtl_col_conv_typ_12_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_12_p = null;

	/**
	 * [DispDtl_col_conv_typ_12_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_12_ListPutter() {
		if (DispDtl_col_conv_typ_12_p == null) {
			DispDtl_col_conv_typ_12_p = createDispDtl_col_conv_typ_12_ListPutter(columnDispDtl_col_conv_typ_12, "col_conv_typ_12", "col_conv_typ_13");

		}
		return DispDtl_col_conv_typ_12_p;
	}
	
	
	/** [DispDtl_col_conv_typ_14_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_14_p = null;

	/**
	 * [DispDtl_col_conv_typ_14_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_14_ListPutter() {
		if (DispDtl_col_conv_typ_14_p == null) {
			DispDtl_col_conv_typ_14_p = createDispDtl_col_conv_typ_14_ListPutter(columnDispDtl_col_conv_typ_14, "col_conv_typ_14", "col_conv_typ_15");

		}
		return DispDtl_col_conv_typ_14_p;
	}
	
	
	/** [DispDtl_col_conv_typ_16_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_16_p = null;

	/**
	 * [DispDtl_col_conv_typ_16_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_16_ListPutter() {
		if (DispDtl_col_conv_typ_16_p == null) {
			DispDtl_col_conv_typ_16_p = createDispDtl_col_conv_typ_16_ListPutter(columnDispDtl_col_conv_typ_16, "col_conv_typ_16", "col_conv_typ_17");

		}
		return DispDtl_col_conv_typ_16_p;
	}
	
	
	/** [DispDtl_col_conv_typ_18_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_18_p = null;

	/**
	 * [DispDtl_col_conv_typ_18_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_18_ListPutter() {
		if (DispDtl_col_conv_typ_18_p == null) {
			DispDtl_col_conv_typ_18_p = createDispDtl_col_conv_typ_18_ListPutter(columnDispDtl_col_conv_typ_18, "col_conv_typ_18", "col_conv_typ_19");

		}
		return DispDtl_col_conv_typ_18_p;
	}
	
	
	/** [DispDtl_col_conv_typ_20_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_20_p = null;

	/**
	 * [DispDtl_col_conv_typ_20_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_20_ListPutter() {
		if (DispDtl_col_conv_typ_20_p == null) {
			DispDtl_col_conv_typ_20_p = createDispDtl_col_conv_typ_20_ListPutter(columnDispDtl_col_conv_typ_20, "col_conv_typ_20", "col_conv_typ_21");

		}
		return DispDtl_col_conv_typ_20_p;
	}
	
	
	/** [DispDtl_col_conv_typ_22_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_22_p = null;

	/**
	 * [DispDtl_col_conv_typ_22_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_22_ListPutter() {
		if (DispDtl_col_conv_typ_22_p == null) {
			DispDtl_col_conv_typ_22_p = createDispDtl_col_conv_typ_22_ListPutter(columnDispDtl_col_conv_typ_22, "col_conv_typ_22", "col_conv_typ_23");

		}
		return DispDtl_col_conv_typ_22_p;
	}
	
	
	/** [DispDtl_col_conv_typ_24_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_24_p = null;

	/**
	 * [DispDtl_col_conv_typ_24_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_24_ListPutter() {
		if (DispDtl_col_conv_typ_24_p == null) {
			DispDtl_col_conv_typ_24_p = createDispDtl_col_conv_typ_24_ListPutter(columnDispDtl_col_conv_typ_24, "col_conv_typ_24", "col_conv_typ_25");

		}
		return DispDtl_col_conv_typ_24_p;
	}
	
	
	/** [DispDtl_col_conv_typ_26_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_26_p = null;

	/**
	 * [DispDtl_col_conv_typ_26_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_26_ListPutter() {
		if (DispDtl_col_conv_typ_26_p == null) {
			DispDtl_col_conv_typ_26_p = createDispDtl_col_conv_typ_26_ListPutter(columnDispDtl_col_conv_typ_26, "col_conv_typ_26", "col_conv_typ_27");

		}
		return DispDtl_col_conv_typ_26_p;
	}
	
	
	/** [DispDtl_col_conv_typ_28_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_28_p = null;

	/**
	 * [DispDtl_col_conv_typ_28_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_28_ListPutter() {
		if (DispDtl_col_conv_typ_28_p == null) {
			DispDtl_col_conv_typ_28_p = createDispDtl_col_conv_typ_28_ListPutter(columnDispDtl_col_conv_typ_28, "col_conv_typ_28", "col_conv_typ_29");

		}
		return DispDtl_col_conv_typ_28_p;
	}
	
	
	/** [DispDtl_col_conv_typ_30_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_30_p = null;

	/**
	 * [DispDtl_col_conv_typ_30_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_30_ListPutter() {
		if (DispDtl_col_conv_typ_30_p == null) {
			DispDtl_col_conv_typ_30_p = createDispDtl_col_conv_typ_30_ListPutter(columnDispDtl_col_conv_typ_30, "col_conv_typ_30", "col_conv_typ_31");

		}
		return DispDtl_col_conv_typ_30_p;
	}
	
	
	/** [DispDtl_col_conv_typ_32_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_32_p = null;

	/**
	 * [DispDtl_col_conv_typ_32_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_32_ListPutter() {
		if (DispDtl_col_conv_typ_32_p == null) {
			DispDtl_col_conv_typ_32_p = createDispDtl_col_conv_typ_32_ListPutter(columnDispDtl_col_conv_typ_32, "col_conv_typ_32", "col_conv_typ_33");

		}
		return DispDtl_col_conv_typ_32_p;
	}
	
	
	/** [DispDtl_col_conv_typ_34_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_34_p = null;

	/**
	 * [DispDtl_col_conv_typ_34_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_34_ListPutter() {
		if (DispDtl_col_conv_typ_34_p == null) {
			DispDtl_col_conv_typ_34_p = createDispDtl_col_conv_typ_34_ListPutter(columnDispDtl_col_conv_typ_34, "col_conv_typ_34", "col_conv_typ_35");

		}
		return DispDtl_col_conv_typ_34_p;
	}
	
	
	/** [DispDtl_col_conv_typ_36_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_36_p = null;

	/**
	 * [DispDtl_col_conv_typ_36_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_36_ListPutter() {
		if (DispDtl_col_conv_typ_36_p == null) {
			DispDtl_col_conv_typ_36_p = createDispDtl_col_conv_typ_36_ListPutter(columnDispDtl_col_conv_typ_36, "col_conv_typ_36", "col_conv_typ_37");

		}
		return DispDtl_col_conv_typ_36_p;
	}
	
	
	/** [DispDtl_col_conv_typ_38_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_38_p = null;

	/**
	 * [DispDtl_col_conv_typ_38_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_38_ListPutter() {
		if (DispDtl_col_conv_typ_38_p == null) {
			DispDtl_col_conv_typ_38_p = createDispDtl_col_conv_typ_38_ListPutter(columnDispDtl_col_conv_typ_38, "col_conv_typ_38", "col_conv_typ_39");

		}
		return DispDtl_col_conv_typ_38_p;
	}
	
	
	/** [DispDtl_col_conv_typ_40_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_40_p = null;

	/**
	 * [DispDtl_col_conv_typ_40_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_40_ListPutter() {
		if (DispDtl_col_conv_typ_40_p == null) {
			DispDtl_col_conv_typ_40_p = createDispDtl_col_conv_typ_40_ListPutter(columnDispDtl_col_conv_typ_40, "col_conv_typ_40", "col_conv_typ_41");

		}
		return DispDtl_col_conv_typ_40_p;
	}
	
	
	/** [DispDtl_col_conv_typ_42_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_42_p = null;

	/**
	 * [DispDtl_col_conv_typ_42_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_42_ListPutter() {
		if (DispDtl_col_conv_typ_42_p == null) {
			DispDtl_col_conv_typ_42_p = createDispDtl_col_conv_typ_42_ListPutter(columnDispDtl_col_conv_typ_42, "col_conv_typ_42", "col_conv_typ_43");

		}
		return DispDtl_col_conv_typ_42_p;
	}
	
	
	/** [DispDtl_col_conv_typ_44_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_44_p = null;

	/**
	 * [DispDtl_col_conv_typ_44_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_44_ListPutter() {
		if (DispDtl_col_conv_typ_44_p == null) {
			DispDtl_col_conv_typ_44_p = createDispDtl_col_conv_typ_44_ListPutter(columnDispDtl_col_conv_typ_44, "col_conv_typ_44", "col_conv_typ_45");

		}
		return DispDtl_col_conv_typ_44_p;
	}
	
	
	/** [DispDtl_col_conv_typ_46_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_46_p = null;

	/**
	 * [DispDtl_col_conv_typ_46_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_46_ListPutter() {
		if (DispDtl_col_conv_typ_46_p == null) {
			DispDtl_col_conv_typ_46_p = createDispDtl_col_conv_typ_46_ListPutter(columnDispDtl_col_conv_typ_46, "col_conv_typ_46", "col_conv_typ_47");

		}
		return DispDtl_col_conv_typ_46_p;
	}
	
	
	/** [DispDtl_col_conv_typ_48_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_48_p = null;

	/**
	 * [DispDtl_col_conv_typ_48_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_48_ListPutter() {
		if (DispDtl_col_conv_typ_48_p == null) {
			DispDtl_col_conv_typ_48_p = createDispDtl_col_conv_typ_48_ListPutter(columnDispDtl_col_conv_typ_48, "col_conv_typ_48", "col_conv_typ_49");

		}
		return DispDtl_col_conv_typ_48_p;
	}
	
	
	/** [DispDtl_col_conv_typ_50_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_50_p = null;

	/**
	 * [DispDtl_col_conv_typ_50_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_50_ListPutter() {
		if (DispDtl_col_conv_typ_50_p == null) {
			DispDtl_col_conv_typ_50_p = createDispDtl_col_conv_typ_50_ListPutter(columnDispDtl_col_conv_typ_50, "col_conv_typ_50", "col_conv_typ_51");

		}
		return DispDtl_col_conv_typ_50_p;
	}
	
	
	/** [DispDtl_col_conv_typ_52_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_52_p = null;

	/**
	 * [DispDtl_col_conv_typ_52_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_52_ListPutter() {
		if (DispDtl_col_conv_typ_52_p == null) {
			DispDtl_col_conv_typ_52_p = createDispDtl_col_conv_typ_52_ListPutter(columnDispDtl_col_conv_typ_52, "col_conv_typ_52", "col_conv_typ_53");

		}
		return DispDtl_col_conv_typ_52_p;
	}
	
	
	/** [DispDtl_col_conv_typ_54_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_54_p = null;

	/**
	 * [DispDtl_col_conv_typ_54_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_54_ListPutter() {
		if (DispDtl_col_conv_typ_54_p == null) {
			DispDtl_col_conv_typ_54_p = createDispDtl_col_conv_typ_54_ListPutter(columnDispDtl_col_conv_typ_54, "col_conv_typ_54", "col_conv_typ_55");

		}
		return DispDtl_col_conv_typ_54_p;
	}
	
	
	/** [DispDtl_col_conv_typ_56_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_56_p = null;

	/**
	 * [DispDtl_col_conv_typ_56_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_56_ListPutter() {
		if (DispDtl_col_conv_typ_56_p == null) {
			DispDtl_col_conv_typ_56_p = createDispDtl_col_conv_typ_56_ListPutter(columnDispDtl_col_conv_typ_56, "col_conv_typ_56", "col_conv_typ_57");

		}
		return DispDtl_col_conv_typ_56_p;
	}
	
	
	/** [DispDtl_col_conv_typ_58_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_58_p = null;

	/**
	 * [DispDtl_col_conv_typ_58_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_58_ListPutter() {
		if (DispDtl_col_conv_typ_58_p == null) {
			DispDtl_col_conv_typ_58_p = createDispDtl_col_conv_typ_58_ListPutter(columnDispDtl_col_conv_typ_58, "col_conv_typ_58", "col_conv_typ_59");

		}
		return DispDtl_col_conv_typ_58_p;
	}
	
	
	/** [DispDtl_col_conv_typ_60_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_60_p = null;

	/**
	 * [DispDtl_col_conv_typ_60_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_60_ListPutter() {
		if (DispDtl_col_conv_typ_60_p == null) {
			DispDtl_col_conv_typ_60_p = createDispDtl_col_conv_typ_60_ListPutter(columnDispDtl_col_conv_typ_60, "col_conv_typ_60", "col_conv_typ_61");

		}
		return DispDtl_col_conv_typ_60_p;
	}
	
	
	/** [DispDtl_col_conv_typ_62_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_62_p = null;

	/**
	 * [DispDtl_col_conv_typ_62_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_62_ListPutter() {
		if (DispDtl_col_conv_typ_62_p == null) {
			DispDtl_col_conv_typ_62_p = createDispDtl_col_conv_typ_62_ListPutter(columnDispDtl_col_conv_typ_62, "col_conv_typ_62", "col_conv_typ_63");

		}
		return DispDtl_col_conv_typ_62_p;
	}
	
	
	/** [DispDtl_col_conv_typ_64_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_64_p = null;

	/**
	 * [DispDtl_col_conv_typ_64_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_64_ListPutter() {
		if (DispDtl_col_conv_typ_64_p == null) {
			DispDtl_col_conv_typ_64_p = createDispDtl_col_conv_typ_64_ListPutter(columnDispDtl_col_conv_typ_64, "col_conv_typ_64", "col_conv_typ_65");

		}
		return DispDtl_col_conv_typ_64_p;
	}
	
	
	/** [DispDtl_col_conv_typ_66_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_66_p = null;

	/**
	 * [DispDtl_col_conv_typ_66_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_66_ListPutter() {
		if (DispDtl_col_conv_typ_66_p == null) {
			DispDtl_col_conv_typ_66_p = createDispDtl_col_conv_typ_66_ListPutter(columnDispDtl_col_conv_typ_66, "col_conv_typ_66", "col_conv_typ_67");

		}
		return DispDtl_col_conv_typ_66_p;
	}
	
	
	/** [DispDtl_col_conv_typ_68_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_68_p = null;

	/**
	 * [DispDtl_col_conv_typ_68_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_68_ListPutter() {
		if (DispDtl_col_conv_typ_68_p == null) {
			DispDtl_col_conv_typ_68_p = createDispDtl_col_conv_typ_68_ListPutter(columnDispDtl_col_conv_typ_68, "col_conv_typ_68", "col_conv_typ_69");

		}
		return DispDtl_col_conv_typ_68_p;
	}
	
	
	/** [DispDtl_col_conv_typ_70_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_70_p = null;

	/**
	 * [DispDtl_col_conv_typ_70_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_70_ListPutter() {
		if (DispDtl_col_conv_typ_70_p == null) {
			DispDtl_col_conv_typ_70_p = createDispDtl_col_conv_typ_70_ListPutter(columnDispDtl_col_conv_typ_70, "col_conv_typ_70", "col_conv_typ_71");

		}
		return DispDtl_col_conv_typ_70_p;
	}
	
	
	/** [DispDtl_col_conv_typ_72_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_72_p = null;

	/**
	 * [DispDtl_col_conv_typ_72_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_72_ListPutter() {
		if (DispDtl_col_conv_typ_72_p == null) {
			DispDtl_col_conv_typ_72_p = createDispDtl_col_conv_typ_72_ListPutter(columnDispDtl_col_conv_typ_72, "col_conv_typ_72", "col_conv_typ_73");

		}
		return DispDtl_col_conv_typ_72_p;
	}
	
	
	/** [DispDtl_col_conv_typ_74_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_74_p = null;

	/**
	 * [DispDtl_col_conv_typ_74_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_74_ListPutter() {
		if (DispDtl_col_conv_typ_74_p == null) {
			DispDtl_col_conv_typ_74_p = createDispDtl_col_conv_typ_74_ListPutter(columnDispDtl_col_conv_typ_74, "col_conv_typ_74", "col_conv_typ_75");

		}
		return DispDtl_col_conv_typ_74_p;
	}
	
	
	/** [DispDtl_col_conv_typ_76_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_76_p = null;

	/**
	 * [DispDtl_col_conv_typ_76_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_76_ListPutter() {
		if (DispDtl_col_conv_typ_76_p == null) {
			DispDtl_col_conv_typ_76_p = createDispDtl_col_conv_typ_76_ListPutter(columnDispDtl_col_conv_typ_76, "col_conv_typ_76", "col_conv_typ_77");

		}
		return DispDtl_col_conv_typ_76_p;
	}
	
	
	/** [DispDtl_col_conv_typ_78_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_78_p = null;

	/**
	 * [DispDtl_col_conv_typ_78_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_78_ListPutter() {
		if (DispDtl_col_conv_typ_78_p == null) {
			DispDtl_col_conv_typ_78_p = createDispDtl_col_conv_typ_78_ListPutter(columnDispDtl_col_conv_typ_78, "col_conv_typ_78", "col_conv_typ_79");

		}
		return DispDtl_col_conv_typ_78_p;
	}
	
	
	/** [DispDtl_col_conv_typ_80_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_80_p = null;

	/**
	 * [DispDtl_col_conv_typ_80_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_80_ListPutter() {
		if (DispDtl_col_conv_typ_80_p == null) {
			DispDtl_col_conv_typ_80_p = createDispDtl_col_conv_typ_80_ListPutter(columnDispDtl_col_conv_typ_80, "col_conv_typ_80", "col_conv_typ_81");

		}
		return DispDtl_col_conv_typ_80_p;
	}
	
	
	/** [DispDtl_col_conv_typ_82_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_82_p = null;

	/**
	 * [DispDtl_col_conv_typ_82_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_82_ListPutter() {
		if (DispDtl_col_conv_typ_82_p == null) {
			DispDtl_col_conv_typ_82_p = createDispDtl_col_conv_typ_82_ListPutter(columnDispDtl_col_conv_typ_82, "col_conv_typ_82", "col_conv_typ_83");

		}
		return DispDtl_col_conv_typ_82_p;
	}
	
	
	/** [DispDtl_col_conv_typ_84_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_84_p = null;

	/**
	 * [DispDtl_col_conv_typ_84_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_84_ListPutter() {
		if (DispDtl_col_conv_typ_84_p == null) {
			DispDtl_col_conv_typ_84_p = createDispDtl_col_conv_typ_84_ListPutter(columnDispDtl_col_conv_typ_84, "col_conv_typ_84", "col_conv_typ_85");

		}
		return DispDtl_col_conv_typ_84_p;
	}
	
	
	/** [DispDtl_col_conv_typ_86_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_86_p = null;

	/**
	 * [DispDtl_col_conv_typ_86_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_86_ListPutter() {
		if (DispDtl_col_conv_typ_86_p == null) {
			DispDtl_col_conv_typ_86_p = createDispDtl_col_conv_typ_86_ListPutter(columnDispDtl_col_conv_typ_86, "col_conv_typ_86", "col_conv_typ_87");

		}
		return DispDtl_col_conv_typ_86_p;
	}
	
	
	/** [DispDtl_col_conv_typ_88_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_88_p = null;

	/**
	 * [DispDtl_col_conv_typ_88_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_88_ListPutter() {
		if (DispDtl_col_conv_typ_88_p == null) {
			DispDtl_col_conv_typ_88_p = createDispDtl_col_conv_typ_88_ListPutter(columnDispDtl_col_conv_typ_88, "col_conv_typ_88", "col_conv_typ_89");

		}
		return DispDtl_col_conv_typ_88_p;
	}
	
	
	/** [DispDtl_col_conv_typ_90_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_90_p = null;

	/**
	 * [DispDtl_col_conv_typ_90_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_90_ListPutter() {
		if (DispDtl_col_conv_typ_90_p == null) {
			DispDtl_col_conv_typ_90_p = createDispDtl_col_conv_typ_90_ListPutter(columnDispDtl_col_conv_typ_90, "col_conv_typ_90", "col_conv_typ_91");

		}
		return DispDtl_col_conv_typ_90_p;
	}
	
	
	/** [DispDtl_col_conv_typ_92_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_92_p = null;

	/**
	 * [DispDtl_col_conv_typ_92_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_92_ListPutter() {
		if (DispDtl_col_conv_typ_92_p == null) {
			DispDtl_col_conv_typ_92_p = createDispDtl_col_conv_typ_92_ListPutter(columnDispDtl_col_conv_typ_92, "col_conv_typ_92", "col_conv_typ_93");

		}
		return DispDtl_col_conv_typ_92_p;
	}
	
	
	/** [DispDtl_col_conv_typ_94_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_94_p = null;

	/**
	 * [DispDtl_col_conv_typ_94_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_94_ListPutter() {
		if (DispDtl_col_conv_typ_94_p == null) {
			DispDtl_col_conv_typ_94_p = createDispDtl_col_conv_typ_94_ListPutter(columnDispDtl_col_conv_typ_94, "col_conv_typ_94", "col_conv_typ_95");

		}
		return DispDtl_col_conv_typ_94_p;
	}
	
	
	/** [DispDtl_col_conv_typ_96_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_96_p = null;

	/**
	 * [DispDtl_col_conv_typ_96_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_96_ListPutter() {
		if (DispDtl_col_conv_typ_96_p == null) {
			DispDtl_col_conv_typ_96_p = createDispDtl_col_conv_typ_96_ListPutter(columnDispDtl_col_conv_typ_96, "col_conv_typ_96", "col_conv_typ_97");

		}
		return DispDtl_col_conv_typ_96_p;
	}
	
	
	/** [DispDtl_col_conv_typ_98_ListPutter]の定義 */
	private MCListPutter DispDtl_col_conv_typ_98_p = null;

	/**
	 * [DispDtl_col_conv_typ_98_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_col_conv_typ_98_ListPutter() {
		if (DispDtl_col_conv_typ_98_p == null) {
			DispDtl_col_conv_typ_98_p = createDispDtl_col_conv_typ_98_ListPutter(columnDispDtl_col_conv_typ_98, "col_conv_typ_98", "col_conv_typ_99");

		}
		return DispDtl_col_conv_typ_98_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_IfCdRuleReg create(){
		MABCP_IfCdRuleReg p = new MABCP_IfCdRuleReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_IfCdRuleReg create(String name){
		MABCP_IfCdRuleReg p = new MABCP_IfCdRuleReg(name);
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
		MABCP_IfCdRuleReg_MC.jbfInitScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitMst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitTop((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitFold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitCndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitCnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitTab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitTab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitCtrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitDispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitDtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbfInitEastBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitMst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitTop((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitFold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitCndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitCnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitTab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitTab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitCtrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitDispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitDtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.jbInitEastBtn((MABCP_IfCdRuleReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_IfCdRuleReg p) {
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
	protected static void jbfInitTop(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextComboBox("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
		p.Cnd_bp_grp_cd1_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd1_Label");
		p.Cnd_bp_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd1");
		p.Cnd_bp_grp_cd1.setLabel(p.Cnd_bp_grp_cd1_Label);
		p.Cnd_bp_grp_nm1 = p.beansFactory.createTextField("Cnd.bp_grp_nm1");
		p.Cnd_bp_grp_cd2_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd2_Label");
		p.Cnd_bp_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd2");
		p.Cnd_bp_grp_cd2.setLabel(p.Cnd_bp_grp_cd2_Label);
		p.Cnd_bp_grp_nm2 = p.beansFactory.createTextField("Cnd.bp_grp_nm2");
		p.Cnd_bp_grp_cd3_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd3_Label");
		p.Cnd_bp_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd3");
		p.Cnd_bp_grp_cd3.setLabel(p.Cnd_bp_grp_cd3_Label);
		p.Cnd_bp_grp_nm3 = p.beansFactory.createTextField("Cnd.bp_grp_nm3");
		p.Cnd_bp_grp_cd4_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd4_Label");
		p.Cnd_bp_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd4");
		p.Cnd_bp_grp_cd4.setLabel(p.Cnd_bp_grp_cd4_Label);
		p.Cnd_bp_grp_nm4 = p.beansFactory.createTextField("Cnd.bp_grp_nm4");
		p.Cnd_bp_grp_cd5_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd5_Label");
		p.Cnd_bp_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd5");
		p.Cnd_bp_grp_cd5.setLabel(p.Cnd_bp_grp_cd5_Label);
		p.Cnd_bp_grp_nm5 = p.beansFactory.createTextField("Cnd.bp_grp_nm5");
		p.Cnd_bp_grp_cd6_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd6_Label");
		p.Cnd_bp_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd6");
		p.Cnd_bp_grp_cd6.setLabel(p.Cnd_bp_grp_cd6_Label);
		p.Cnd_bp_grp_nm6 = p.beansFactory.createTextField("Cnd.bp_grp_nm6");
		p.Cnd_bp_grp_cd7_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd7_Label");
		p.Cnd_bp_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd7");
		p.Cnd_bp_grp_cd7.setLabel(p.Cnd_bp_grp_cd7_Label);
		p.Cnd_bp_grp_nm7 = p.beansFactory.createTextField("Cnd.bp_grp_nm7");
		p.Cnd_bp_grp_cd8_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd8_Label");
		p.Cnd_bp_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd8");
		p.Cnd_bp_grp_cd8.setLabel(p.Cnd_bp_grp_cd8_Label);
		p.Cnd_bp_grp_nm8 = p.beansFactory.createTextField("Cnd.bp_grp_nm8");
		p.Cnd_bp_grp_cd9_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd9_Label");
		p.Cnd_bp_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd9");
		p.Cnd_bp_grp_cd9.setLabel(p.Cnd_bp_grp_cd9_Label);
		p.Cnd_bp_grp_nm9 = p.beansFactory.createTextField("Cnd.bp_grp_nm9");
		p.Cnd_bp_grp_cd10_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd10_Label");
		p.Cnd_bp_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd10");
		p.Cnd_bp_grp_cd10.setLabel(p.Cnd_bp_grp_cd10_Label);
		p.Cnd_bp_grp_nm10 = p.beansFactory.createTextField("Cnd.bp_grp_nm10");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_check = p.beansFactory.createTableColumn("DispDtl.check", MCColumnType.CHECK);
		p.columnDispDtl_del_flg = p.beansFactory.createTableColumn("DispDtl.del_flg", MCColumnType.CHECK);
		p.columnDispDtl_ext_sys_cd = p.beansFactory.createTableColumn("DispDtl.ext_sys_cd", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_ext_sys_nm = p.beansFactory.createTableColumn("DispDtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDispDtl_bp_cd = p.beansFactory.createTableColumn("DispDtl.bp_cd", MCColumnType.TEXT);
		p.columnDispDtl_bp_nm = p.beansFactory.createTableColumn("DispDtl.bp_nm", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_00 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_00", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_01 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_01", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_02 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_02", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_03 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_03", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_04 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_04", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_05 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_05", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_06 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_06", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_07 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_07", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_08 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_08", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_09 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_09", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_10 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_10", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_11 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_11", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_12 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_12", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_13 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_13", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_14 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_14", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_15 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_15", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_16 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_16", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_17 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_17", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_18 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_18", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_19 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_19", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_20 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_20", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_21 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_21", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_22 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_22", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_23 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_23", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_24 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_24", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_25 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_25", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_26 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_26", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_27 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_27", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_28 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_28", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_29 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_29", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_30 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_30", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_31 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_31", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_32 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_32", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_33 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_33", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_34 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_34", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_35 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_35", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_36 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_36", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_37 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_37", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_38 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_38", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_39 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_39", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_40 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_40", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_41 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_41", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_42 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_42", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_43 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_43", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_44 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_44", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_45 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_45", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_46 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_46", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_47 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_47", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_48 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_48", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_49 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_49", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_50 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_50", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_51 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_51", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_52 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_52", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_53 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_53", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_54 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_54", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_55 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_55", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_56 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_56", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_57 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_57", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_58 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_58", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_59 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_59", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_60 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_60", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_61 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_61", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_62 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_62", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_63 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_63", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_64 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_64", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_65 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_65", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_66 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_66", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_67 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_67", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_68 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_68", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_69 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_69", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_70 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_70", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_71 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_71", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_72 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_72", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_73 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_73", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_74 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_74", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_75 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_75", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_76 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_76", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_77 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_77", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_78 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_78", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_79 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_79", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_80 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_80", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_81 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_81", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_82 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_82", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_83 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_83", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_84 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_84", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_85 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_85", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_86 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_86", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_87 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_87", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_88 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_88", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_89 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_89", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_90 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_90", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_91 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_91", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_92 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_92", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_93 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_93", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_94 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_94", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_95 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_95", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_96 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_96", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_97 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_97", MCColumnType.TEXT);
		p.columnDispDtl_col_conv_typ_98 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_98", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_col_conv_typ_99 = p.beansFactory.createTableColumn("DispDtl.col_conv_typ_99", MCColumnType.TEXT);
		p.cgDispDtl_if_col_typ_cg_00 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_00");
		p.cgDispDtl_if_col_typ_cg_01 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_01");
		p.cgDispDtl_if_col_typ_cg_02 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_02");
		p.cgDispDtl_if_col_typ_cg_03 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_03");
		p.cgDispDtl_if_col_typ_cg_04 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_04");
		p.cgDispDtl_if_col_typ_cg_05 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_05");
		p.cgDispDtl_if_col_typ_cg_06 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_06");
		p.cgDispDtl_if_col_typ_cg_07 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_07");
		p.cgDispDtl_if_col_typ_cg_08 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_08");
		p.cgDispDtl_if_col_typ_cg_09 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_09");
		p.cgDispDtl_if_col_typ_cg_10 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_10");
		p.cgDispDtl_if_col_typ_cg_11 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_11");
		p.cgDispDtl_if_col_typ_cg_12 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_12");
		p.cgDispDtl_if_col_typ_cg_13 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_13");
		p.cgDispDtl_if_col_typ_cg_14 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_14");
		p.cgDispDtl_if_col_typ_cg_15 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_15");
		p.cgDispDtl_if_col_typ_cg_16 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_16");
		p.cgDispDtl_if_col_typ_cg_17 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_17");
		p.cgDispDtl_if_col_typ_cg_18 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_18");
		p.cgDispDtl_if_col_typ_cg_19 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_19");
		p.cgDispDtl_if_col_typ_cg_20 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_20");
		p.cgDispDtl_if_col_typ_cg_21 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_21");
		p.cgDispDtl_if_col_typ_cg_22 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_22");
		p.cgDispDtl_if_col_typ_cg_23 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_23");
		p.cgDispDtl_if_col_typ_cg_24 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_24");
		p.cgDispDtl_if_col_typ_cg_25 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_25");
		p.cgDispDtl_if_col_typ_cg_26 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_26");
		p.cgDispDtl_if_col_typ_cg_27 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_27");
		p.cgDispDtl_if_col_typ_cg_28 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_28");
		p.cgDispDtl_if_col_typ_cg_29 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_29");
		p.cgDispDtl_if_col_typ_cg_30 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_30");
		p.cgDispDtl_if_col_typ_cg_31 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_31");
		p.cgDispDtl_if_col_typ_cg_32 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_32");
		p.cgDispDtl_if_col_typ_cg_33 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_33");
		p.cgDispDtl_if_col_typ_cg_34 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_34");
		p.cgDispDtl_if_col_typ_cg_35 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_35");
		p.cgDispDtl_if_col_typ_cg_36 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_36");
		p.cgDispDtl_if_col_typ_cg_37 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_37");
		p.cgDispDtl_if_col_typ_cg_38 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_38");
		p.cgDispDtl_if_col_typ_cg_39 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_39");
		p.cgDispDtl_if_col_typ_cg_40 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_40");
		p.cgDispDtl_if_col_typ_cg_41 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_41");
		p.cgDispDtl_if_col_typ_cg_42 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_42");
		p.cgDispDtl_if_col_typ_cg_43 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_43");
		p.cgDispDtl_if_col_typ_cg_44 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_44");
		p.cgDispDtl_if_col_typ_cg_45 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_45");
		p.cgDispDtl_if_col_typ_cg_46 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_46");
		p.cgDispDtl_if_col_typ_cg_47 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_47");
		p.cgDispDtl_if_col_typ_cg_48 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_48");
		p.cgDispDtl_if_col_typ_cg_49 = p.beansFactory.createColumnGroup("DispDtl.if_col_typ_cg_49");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_del = p.beansFactory.createButton("DtlBtn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_IfCdRuleReg p) {
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
	protected static void jbInitMst(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1510.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_IfCdRuleReg p) {
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
	protected static void jbInitFold(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABCP_IfCdRuleReg p) {
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
	protected static void jbInitCnd(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.DispDtlPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.ope_META);
		p.Cnd_ext_sys_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.Cnd_ext_sys_cd.setLinkBeans(p.Cnd_ext_sys_nm);
		p.Tab1Panel.add(p.Cnd_ext_sys_cd_Label);
		p.Tab1Panel.add(p.Cnd_ext_sys_cd);
		p.Tab1Panel.setLastBeans(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.ext_sys_cd_META);
		p.Tab1Panel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.ext_sys_nm_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_nm, true);
		p.Tab1Panel.add(p.Cnd_bp_cd_Label);
		p.Tab1Panel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.Tab1Panel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.on_del_flg_META);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm1_META);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm2_META);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm3_META);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm4_META);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm5_META);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm6_META);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm7_META);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm8_META);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm9_META);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP1510.CndR.bp_grp_nm10_META);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispDtl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.add(p.DispDtlPanel);
		p.DispDtlPanel.setNextBeans(p.DtlPanel);
		p.DispDtlPanel.add(p.DispDtlScrollPane);
		p.DispDtlPanel.setLastBeans(p.DispDtlTable);
		p.DispDtlScrollPane.setViewportView(p.DispDtlTable);
		p.DispDtlTable.setList(p.getDispDtlL());
		p.DispDtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_IfCdRuleReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_IfCdRuleReg p) {
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
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_upd);
		p.DtlBtn_upd.setIcon("REGISTER");
		p.DtlBtn_upd.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd);
		p.DtlBtn_del.setIcon("DELETE");
		p.DtlBtn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del);
		p.EastBtnPanel.add(p.DtlBtn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_IfCdRuleReg p) {
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
		MABCP_IfCdRuleReg_MC.mcInitScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitMst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitTop((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitFold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitCndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitCnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitTab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitTab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitCtrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitDispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitDtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.mcInitEastBtn((MABCP_IfCdRuleReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_IfCdRuleReg_MC.statusInitUPD_ScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Mst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Top((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Fold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_CndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Cnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Tab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Tab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Ctrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_DispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_Dtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_DtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitUPD_EastBtn((MABCP_IfCdRuleReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_IfCdRuleReg_MC.statusInitFIX_ScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Mst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Top((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Fold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_CndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Cnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Tab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Tab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Ctrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_DispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_Dtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_DtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitFIX_EastBtn((MABCP_IfCdRuleReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_IfCdRuleReg_MC.statusInitDEL_ScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Mst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Top((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Fold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_CndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Cnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Tab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Tab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Ctrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_DispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_Dtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_DtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitDEL_EastBtn((MABCP_IfCdRuleReg)this);

		// [REF]ステータスのモードの設定
		MABCP_IfCdRuleReg_MC.statusInitREF_ScreenOpe((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Mst((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Top((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Fold((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_CndTab((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Cnd((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Tab1((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Tab2((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Ctrl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_DispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_Dtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_DtlBtn((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.statusInitREF_EastBtn((MABCP_IfCdRuleReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_IfCdRuleReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_IfCdRuleReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_IfCdRuleReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_IfCdRuleReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABCP_IfCdRuleReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_IfCdRuleReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_bp_grp_cd1.setListListener(p);
		p.Cnd_bp_grp_cd1.addAllListener(p);
		p.Cnd_bp_grp_nm1.setListListener(p);
		p.Cnd_bp_grp_nm1.addAllListener(p);
		p.Cnd_bp_grp_cd2.setListListener(p);
		p.Cnd_bp_grp_cd2.addAllListener(p);
		p.Cnd_bp_grp_nm2.setListListener(p);
		p.Cnd_bp_grp_nm2.addAllListener(p);
		p.Cnd_bp_grp_cd3.setListListener(p);
		p.Cnd_bp_grp_cd3.addAllListener(p);
		p.Cnd_bp_grp_nm3.setListListener(p);
		p.Cnd_bp_grp_nm3.addAllListener(p);
		p.Cnd_bp_grp_cd4.setListListener(p);
		p.Cnd_bp_grp_cd4.addAllListener(p);
		p.Cnd_bp_grp_nm4.setListListener(p);
		p.Cnd_bp_grp_nm4.addAllListener(p);
		p.Cnd_bp_grp_cd5.setListListener(p);
		p.Cnd_bp_grp_cd5.addAllListener(p);
		p.Cnd_bp_grp_nm5.setListListener(p);
		p.Cnd_bp_grp_nm5.addAllListener(p);
		p.Cnd_bp_grp_cd6.setListListener(p);
		p.Cnd_bp_grp_cd6.addAllListener(p);
		p.Cnd_bp_grp_nm6.setListListener(p);
		p.Cnd_bp_grp_nm6.addAllListener(p);
		p.Cnd_bp_grp_cd7.setListListener(p);
		p.Cnd_bp_grp_cd7.addAllListener(p);
		p.Cnd_bp_grp_nm7.setListListener(p);
		p.Cnd_bp_grp_nm7.addAllListener(p);
		p.Cnd_bp_grp_cd8.setListListener(p);
		p.Cnd_bp_grp_cd8.addAllListener(p);
		p.Cnd_bp_grp_nm8.setListListener(p);
		p.Cnd_bp_grp_nm8.addAllListener(p);
		p.Cnd_bp_grp_cd9.setListListener(p);
		p.Cnd_bp_grp_cd9.addAllListener(p);
		p.Cnd_bp_grp_nm9.setListListener(p);
		p.Cnd_bp_grp_nm9.addAllListener(p);
		p.Cnd_bp_grp_cd10.setListListener(p);
		p.Cnd_bp_grp_cd10.addAllListener(p);
		p.Cnd_bp_grp_nm10.setListListener(p);
		p.Cnd_bp_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_IfCdRuleReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_IfCdRuleReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_IfCdRuleReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MABCP_IfCdRuleReg p) {
		p.DispDtlTable.addAllListener(p);
		p.columnDispDtl_check.addAllListener(p);
		p.columnDispDtl_del_flg.addAllListener(p);
		p.columnDispDtl_ext_sys_cd.addAllListener(p);
		p.columnDispDtl_ext_sys_cd.setListListener(p);
		p.columnDispDtl_ext_sys_nm.addAllListener(p);
		p.columnDispDtl_ext_sys_nm.setListListener(p);
		p.columnDispDtl_bp_cd.addAllListener(p);
		p.columnDispDtl_bp_cd.setListListener(p);
		p.columnDispDtl_bp_nm.addAllListener(p);
		p.columnDispDtl_bp_nm.setListListener(p);
		p.columnDispDtl_col_conv_typ_00.addAllListener(p);
		p.columnDispDtl_col_conv_typ_00.setListListener(p);
		p.columnDispDtl_col_conv_typ_01.addAllListener(p);
		p.columnDispDtl_col_conv_typ_01.setListListener(p);
		p.columnDispDtl_col_conv_typ_02.addAllListener(p);
		p.columnDispDtl_col_conv_typ_02.setListListener(p);
		p.columnDispDtl_col_conv_typ_03.addAllListener(p);
		p.columnDispDtl_col_conv_typ_03.setListListener(p);
		p.columnDispDtl_col_conv_typ_04.addAllListener(p);
		p.columnDispDtl_col_conv_typ_04.setListListener(p);
		p.columnDispDtl_col_conv_typ_05.addAllListener(p);
		p.columnDispDtl_col_conv_typ_05.setListListener(p);
		p.columnDispDtl_col_conv_typ_06.addAllListener(p);
		p.columnDispDtl_col_conv_typ_06.setListListener(p);
		p.columnDispDtl_col_conv_typ_07.addAllListener(p);
		p.columnDispDtl_col_conv_typ_07.setListListener(p);
		p.columnDispDtl_col_conv_typ_08.addAllListener(p);
		p.columnDispDtl_col_conv_typ_08.setListListener(p);
		p.columnDispDtl_col_conv_typ_09.addAllListener(p);
		p.columnDispDtl_col_conv_typ_09.setListListener(p);
		p.columnDispDtl_col_conv_typ_10.addAllListener(p);
		p.columnDispDtl_col_conv_typ_10.setListListener(p);
		p.columnDispDtl_col_conv_typ_11.addAllListener(p);
		p.columnDispDtl_col_conv_typ_11.setListListener(p);
		p.columnDispDtl_col_conv_typ_12.addAllListener(p);
		p.columnDispDtl_col_conv_typ_12.setListListener(p);
		p.columnDispDtl_col_conv_typ_13.addAllListener(p);
		p.columnDispDtl_col_conv_typ_13.setListListener(p);
		p.columnDispDtl_col_conv_typ_14.addAllListener(p);
		p.columnDispDtl_col_conv_typ_14.setListListener(p);
		p.columnDispDtl_col_conv_typ_15.addAllListener(p);
		p.columnDispDtl_col_conv_typ_15.setListListener(p);
		p.columnDispDtl_col_conv_typ_16.addAllListener(p);
		p.columnDispDtl_col_conv_typ_16.setListListener(p);
		p.columnDispDtl_col_conv_typ_17.addAllListener(p);
		p.columnDispDtl_col_conv_typ_17.setListListener(p);
		p.columnDispDtl_col_conv_typ_18.addAllListener(p);
		p.columnDispDtl_col_conv_typ_18.setListListener(p);
		p.columnDispDtl_col_conv_typ_19.addAllListener(p);
		p.columnDispDtl_col_conv_typ_19.setListListener(p);
		p.columnDispDtl_col_conv_typ_20.addAllListener(p);
		p.columnDispDtl_col_conv_typ_20.setListListener(p);
		p.columnDispDtl_col_conv_typ_21.addAllListener(p);
		p.columnDispDtl_col_conv_typ_21.setListListener(p);
		p.columnDispDtl_col_conv_typ_22.addAllListener(p);
		p.columnDispDtl_col_conv_typ_22.setListListener(p);
		p.columnDispDtl_col_conv_typ_23.addAllListener(p);
		p.columnDispDtl_col_conv_typ_23.setListListener(p);
		p.columnDispDtl_col_conv_typ_24.addAllListener(p);
		p.columnDispDtl_col_conv_typ_24.setListListener(p);
		p.columnDispDtl_col_conv_typ_25.addAllListener(p);
		p.columnDispDtl_col_conv_typ_25.setListListener(p);
		p.columnDispDtl_col_conv_typ_26.addAllListener(p);
		p.columnDispDtl_col_conv_typ_26.setListListener(p);
		p.columnDispDtl_col_conv_typ_27.addAllListener(p);
		p.columnDispDtl_col_conv_typ_27.setListListener(p);
		p.columnDispDtl_col_conv_typ_28.addAllListener(p);
		p.columnDispDtl_col_conv_typ_28.setListListener(p);
		p.columnDispDtl_col_conv_typ_29.addAllListener(p);
		p.columnDispDtl_col_conv_typ_29.setListListener(p);
		p.columnDispDtl_col_conv_typ_30.addAllListener(p);
		p.columnDispDtl_col_conv_typ_30.setListListener(p);
		p.columnDispDtl_col_conv_typ_31.addAllListener(p);
		p.columnDispDtl_col_conv_typ_31.setListListener(p);
		p.columnDispDtl_col_conv_typ_32.addAllListener(p);
		p.columnDispDtl_col_conv_typ_32.setListListener(p);
		p.columnDispDtl_col_conv_typ_33.addAllListener(p);
		p.columnDispDtl_col_conv_typ_33.setListListener(p);
		p.columnDispDtl_col_conv_typ_34.addAllListener(p);
		p.columnDispDtl_col_conv_typ_34.setListListener(p);
		p.columnDispDtl_col_conv_typ_35.addAllListener(p);
		p.columnDispDtl_col_conv_typ_35.setListListener(p);
		p.columnDispDtl_col_conv_typ_36.addAllListener(p);
		p.columnDispDtl_col_conv_typ_36.setListListener(p);
		p.columnDispDtl_col_conv_typ_37.addAllListener(p);
		p.columnDispDtl_col_conv_typ_37.setListListener(p);
		p.columnDispDtl_col_conv_typ_38.addAllListener(p);
		p.columnDispDtl_col_conv_typ_38.setListListener(p);
		p.columnDispDtl_col_conv_typ_39.addAllListener(p);
		p.columnDispDtl_col_conv_typ_39.setListListener(p);
		p.columnDispDtl_col_conv_typ_40.addAllListener(p);
		p.columnDispDtl_col_conv_typ_40.setListListener(p);
		p.columnDispDtl_col_conv_typ_41.addAllListener(p);
		p.columnDispDtl_col_conv_typ_41.setListListener(p);
		p.columnDispDtl_col_conv_typ_42.addAllListener(p);
		p.columnDispDtl_col_conv_typ_42.setListListener(p);
		p.columnDispDtl_col_conv_typ_43.addAllListener(p);
		p.columnDispDtl_col_conv_typ_43.setListListener(p);
		p.columnDispDtl_col_conv_typ_44.addAllListener(p);
		p.columnDispDtl_col_conv_typ_44.setListListener(p);
		p.columnDispDtl_col_conv_typ_45.addAllListener(p);
		p.columnDispDtl_col_conv_typ_45.setListListener(p);
		p.columnDispDtl_col_conv_typ_46.addAllListener(p);
		p.columnDispDtl_col_conv_typ_46.setListListener(p);
		p.columnDispDtl_col_conv_typ_47.addAllListener(p);
		p.columnDispDtl_col_conv_typ_47.setListListener(p);
		p.columnDispDtl_col_conv_typ_48.addAllListener(p);
		p.columnDispDtl_col_conv_typ_48.setListListener(p);
		p.columnDispDtl_col_conv_typ_49.addAllListener(p);
		p.columnDispDtl_col_conv_typ_49.setListListener(p);
		p.columnDispDtl_col_conv_typ_50.addAllListener(p);
		p.columnDispDtl_col_conv_typ_50.setListListener(p);
		p.columnDispDtl_col_conv_typ_51.addAllListener(p);
		p.columnDispDtl_col_conv_typ_51.setListListener(p);
		p.columnDispDtl_col_conv_typ_52.addAllListener(p);
		p.columnDispDtl_col_conv_typ_52.setListListener(p);
		p.columnDispDtl_col_conv_typ_53.addAllListener(p);
		p.columnDispDtl_col_conv_typ_53.setListListener(p);
		p.columnDispDtl_col_conv_typ_54.addAllListener(p);
		p.columnDispDtl_col_conv_typ_54.setListListener(p);
		p.columnDispDtl_col_conv_typ_55.addAllListener(p);
		p.columnDispDtl_col_conv_typ_55.setListListener(p);
		p.columnDispDtl_col_conv_typ_56.addAllListener(p);
		p.columnDispDtl_col_conv_typ_56.setListListener(p);
		p.columnDispDtl_col_conv_typ_57.addAllListener(p);
		p.columnDispDtl_col_conv_typ_57.setListListener(p);
		p.columnDispDtl_col_conv_typ_58.addAllListener(p);
		p.columnDispDtl_col_conv_typ_58.setListListener(p);
		p.columnDispDtl_col_conv_typ_59.addAllListener(p);
		p.columnDispDtl_col_conv_typ_59.setListListener(p);
		p.columnDispDtl_col_conv_typ_60.addAllListener(p);
		p.columnDispDtl_col_conv_typ_60.setListListener(p);
		p.columnDispDtl_col_conv_typ_61.addAllListener(p);
		p.columnDispDtl_col_conv_typ_61.setListListener(p);
		p.columnDispDtl_col_conv_typ_62.addAllListener(p);
		p.columnDispDtl_col_conv_typ_62.setListListener(p);
		p.columnDispDtl_col_conv_typ_63.addAllListener(p);
		p.columnDispDtl_col_conv_typ_63.setListListener(p);
		p.columnDispDtl_col_conv_typ_64.addAllListener(p);
		p.columnDispDtl_col_conv_typ_64.setListListener(p);
		p.columnDispDtl_col_conv_typ_65.addAllListener(p);
		p.columnDispDtl_col_conv_typ_65.setListListener(p);
		p.columnDispDtl_col_conv_typ_66.addAllListener(p);
		p.columnDispDtl_col_conv_typ_66.setListListener(p);
		p.columnDispDtl_col_conv_typ_67.addAllListener(p);
		p.columnDispDtl_col_conv_typ_67.setListListener(p);
		p.columnDispDtl_col_conv_typ_68.addAllListener(p);
		p.columnDispDtl_col_conv_typ_68.setListListener(p);
		p.columnDispDtl_col_conv_typ_69.addAllListener(p);
		p.columnDispDtl_col_conv_typ_69.setListListener(p);
		p.columnDispDtl_col_conv_typ_70.addAllListener(p);
		p.columnDispDtl_col_conv_typ_70.setListListener(p);
		p.columnDispDtl_col_conv_typ_71.addAllListener(p);
		p.columnDispDtl_col_conv_typ_71.setListListener(p);
		p.columnDispDtl_col_conv_typ_72.addAllListener(p);
		p.columnDispDtl_col_conv_typ_72.setListListener(p);
		p.columnDispDtl_col_conv_typ_73.addAllListener(p);
		p.columnDispDtl_col_conv_typ_73.setListListener(p);
		p.columnDispDtl_col_conv_typ_74.addAllListener(p);
		p.columnDispDtl_col_conv_typ_74.setListListener(p);
		p.columnDispDtl_col_conv_typ_75.addAllListener(p);
		p.columnDispDtl_col_conv_typ_75.setListListener(p);
		p.columnDispDtl_col_conv_typ_76.addAllListener(p);
		p.columnDispDtl_col_conv_typ_76.setListListener(p);
		p.columnDispDtl_col_conv_typ_77.addAllListener(p);
		p.columnDispDtl_col_conv_typ_77.setListListener(p);
		p.columnDispDtl_col_conv_typ_78.addAllListener(p);
		p.columnDispDtl_col_conv_typ_78.setListListener(p);
		p.columnDispDtl_col_conv_typ_79.addAllListener(p);
		p.columnDispDtl_col_conv_typ_79.setListListener(p);
		p.columnDispDtl_col_conv_typ_80.addAllListener(p);
		p.columnDispDtl_col_conv_typ_80.setListListener(p);
		p.columnDispDtl_col_conv_typ_81.addAllListener(p);
		p.columnDispDtl_col_conv_typ_81.setListListener(p);
		p.columnDispDtl_col_conv_typ_82.addAllListener(p);
		p.columnDispDtl_col_conv_typ_82.setListListener(p);
		p.columnDispDtl_col_conv_typ_83.addAllListener(p);
		p.columnDispDtl_col_conv_typ_83.setListListener(p);
		p.columnDispDtl_col_conv_typ_84.addAllListener(p);
		p.columnDispDtl_col_conv_typ_84.setListListener(p);
		p.columnDispDtl_col_conv_typ_85.addAllListener(p);
		p.columnDispDtl_col_conv_typ_85.setListListener(p);
		p.columnDispDtl_col_conv_typ_86.addAllListener(p);
		p.columnDispDtl_col_conv_typ_86.setListListener(p);
		p.columnDispDtl_col_conv_typ_87.addAllListener(p);
		p.columnDispDtl_col_conv_typ_87.setListListener(p);
		p.columnDispDtl_col_conv_typ_88.addAllListener(p);
		p.columnDispDtl_col_conv_typ_88.setListListener(p);
		p.columnDispDtl_col_conv_typ_89.addAllListener(p);
		p.columnDispDtl_col_conv_typ_89.setListListener(p);
		p.columnDispDtl_col_conv_typ_90.addAllListener(p);
		p.columnDispDtl_col_conv_typ_90.setListListener(p);
		p.columnDispDtl_col_conv_typ_91.addAllListener(p);
		p.columnDispDtl_col_conv_typ_91.setListListener(p);
		p.columnDispDtl_col_conv_typ_92.addAllListener(p);
		p.columnDispDtl_col_conv_typ_92.setListListener(p);
		p.columnDispDtl_col_conv_typ_93.addAllListener(p);
		p.columnDispDtl_col_conv_typ_93.setListListener(p);
		p.columnDispDtl_col_conv_typ_94.addAllListener(p);
		p.columnDispDtl_col_conv_typ_94.setListListener(p);
		p.columnDispDtl_col_conv_typ_95.addAllListener(p);
		p.columnDispDtl_col_conv_typ_95.setListListener(p);
		p.columnDispDtl_col_conv_typ_96.addAllListener(p);
		p.columnDispDtl_col_conv_typ_96.setListListener(p);
		p.columnDispDtl_col_conv_typ_97.addAllListener(p);
		p.columnDispDtl_col_conv_typ_97.setListListener(p);
		p.columnDispDtl_col_conv_typ_98.addAllListener(p);
		p.columnDispDtl_col_conv_typ_98.setListListener(p);
		p.columnDispDtl_col_conv_typ_99.addAllListener(p);
		p.columnDispDtl_col_conv_typ_99.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_IfCdRuleReg p) {
		p.DtlTable.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_IfCdRuleReg p) {
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
		p.DtlBtn_upd.addAllListener(p);
		p.DtlBtn_upd.setAPMethodName("doDtlBtn_upd");
		p.DtlBtn_del.addAllListener(p);
		p.DtlBtn_del.setAPMethodName("doDtlBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_IfCdRuleReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_IfCdRuleReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_IfCdRuleReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispDtl(MABCP_IfCdRuleReg p){
		p.columnDispDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_ext_sys_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_00.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_01.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_02.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_03.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_04.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_05.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_06.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_07.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_08.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_09.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_11.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_13.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_15.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_17.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_19.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_20.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_21.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_22.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_23.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_24.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_25.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_26.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_27.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_28.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_29.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_30.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_31.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_32.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_33.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_34.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_35.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_36.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_37.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_38.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_39.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_40.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_41.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_42.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_43.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_44.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_45.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_46.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_47.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_48.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_49.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_50.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_51.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_52.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_53.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_54.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_55.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_56.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_57.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_58.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_59.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_60.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_61.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_62.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_63.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_64.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_65.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_66.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_67.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_68.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_69.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_70.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_71.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_72.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_73.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_74.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_75.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_76.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_77.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_78.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_79.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_80.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_81.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_82.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_83.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_84.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_85.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_86.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_87.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_88.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_89.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_90.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_91.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_92.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_93.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_94.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_95.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_96.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_97.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_98.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_col_conv_typ_99.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_IfCdRuleReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_IfCdRuleReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_IfCdRuleReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DispDtl(MABCP_IfCdRuleReg p){
		p.columnDispDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_00.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_01.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_02.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_03.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_04.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_05.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_06.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_07.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_08.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_09.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_21.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_22.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_23.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_24.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_25.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_26.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_27.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_28.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_29.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_30.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_31.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_32.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_33.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_34.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_35.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_36.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_37.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_38.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_39.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_40.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_41.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_42.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_43.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_44.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_45.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_46.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_47.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_48.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_49.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_50.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_51.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_52.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_53.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_54.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_55.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_56.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_57.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_58.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_59.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_60.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_61.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_62.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_63.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_64.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_65.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_66.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_67.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_68.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_69.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_70.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_71.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_72.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_73.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_74.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_75.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_76.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_77.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_78.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_79.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_80.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_81.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_82.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_83.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_84.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_85.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_86.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_87.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_88.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_89.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_90.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_91.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_92.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_93.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_94.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_95.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_96.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_97.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_98.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_99.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_IfCdRuleReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_IfCdRuleReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_IfCdRuleReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DispDtl(MABCP_IfCdRuleReg p){
		p.columnDispDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDispDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_00.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_01.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_02.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_03.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_04.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_05.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_06.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_07.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_08.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_09.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_20.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_21.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_22.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_23.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_24.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_25.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_26.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_27.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_28.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_29.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_30.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_31.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_32.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_33.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_34.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_35.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_36.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_37.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_38.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_39.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_40.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_41.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_42.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_43.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_44.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_45.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_46.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_47.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_48.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_49.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_50.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_51.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_52.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_53.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_54.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_55.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_56.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_57.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_58.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_59.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_60.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_61.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_62.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_63.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_64.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_65.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_66.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_67.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_68.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_69.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_70.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_71.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_72.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_73.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_74.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_75.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_76.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_77.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_78.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_79.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_80.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_81.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_82.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_83.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_84.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_85.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_86.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_87.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_88.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_89.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_90.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_91.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_92.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_93.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_94.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_95.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_96.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_97.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_98.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_99.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_IfCdRuleReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_IfCdRuleReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_IfCdRuleReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MABCP_IfCdRuleReg p){
		p.columnDispDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_31.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_32.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_33.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_34.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_35.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_36.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_37.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_38.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_39.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_40.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_41.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_42.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_43.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_44.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_45.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_46.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_47.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_48.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_49.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_50.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_51.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_52.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_53.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_54.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_55.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_56.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_57.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_58.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_59.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_60.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_61.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_62.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_63.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_64.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_65.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_66.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_67.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_68.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_69.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_70.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_71.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_72.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_73.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_74.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_75.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_76.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_77.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_78.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_79.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_80.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_81.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_82.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_83.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_84.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_85.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_86.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_87.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_88.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_89.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_90.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_91.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_92.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_93.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_94.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_95.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_96.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_97.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_98.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_col_conv_typ_99.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_IfCdRuleReg p){

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_IfCdRuleReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_IfCdRuleReg p){

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
		MABCP_IfCdRuleReg_MC.setTableConfigDispDtl((MABCP_IfCdRuleReg)this);
		MABCP_IfCdRuleReg_MC.setTableConfigDtl((MABCP_IfCdRuleReg)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MABCP_IfCdRuleReg p) {
		p.columnDispDtl_check.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.check_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_check);
		p.columnDispDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.del_flg_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_del_flg);
		p.columnDispDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.ext_sys_cd_META);
		p.columnDispDtl_ext_sys_cd.addLinkBeans(p.columnDispDtl_ext_sys_nm);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ext_sys_cd);
		p.columnDispDtl_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.ext_sys_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ext_sys_nm);
		p.columnDispDtl_bp_cd.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.bp_cd_META);
		p.columnDispDtl_bp_cd.setListType(MCListType.STRICT);
		p.columnDispDtl_bp_cd.addLinkBeans(p.columnDispDtl_bp_nm);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bp_cd);
		p.columnDispDtl_bp_nm.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.bp_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bp_nm);
		p.columnDispDtl_col_conv_typ_00.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_00_META);
		p.columnDispDtl_col_conv_typ_00.addLinkBeans(p.columnDispDtl_col_conv_typ_01);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_00);
		p.columnDispDtl_col_conv_typ_01.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_01_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_01);
		p.columnDispDtl_col_conv_typ_02.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_02_META);
		p.columnDispDtl_col_conv_typ_02.addLinkBeans(p.columnDispDtl_col_conv_typ_03);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_02);
		p.columnDispDtl_col_conv_typ_03.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_03_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_03);
		p.columnDispDtl_col_conv_typ_04.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_04_META);
		p.columnDispDtl_col_conv_typ_04.addLinkBeans(p.columnDispDtl_col_conv_typ_05);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_04);
		p.columnDispDtl_col_conv_typ_05.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_05_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_05);
		p.columnDispDtl_col_conv_typ_06.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_06_META);
		p.columnDispDtl_col_conv_typ_06.addLinkBeans(p.columnDispDtl_col_conv_typ_07);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_06);
		p.columnDispDtl_col_conv_typ_07.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_07_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_07);
		p.columnDispDtl_col_conv_typ_08.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_08_META);
		p.columnDispDtl_col_conv_typ_08.addLinkBeans(p.columnDispDtl_col_conv_typ_09);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_08);
		p.columnDispDtl_col_conv_typ_09.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_09_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_09);
		p.columnDispDtl_col_conv_typ_10.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_10_META);
		p.columnDispDtl_col_conv_typ_10.addLinkBeans(p.columnDispDtl_col_conv_typ_11);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_10);
		p.columnDispDtl_col_conv_typ_11.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_11_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_11);
		p.columnDispDtl_col_conv_typ_12.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_12_META);
		p.columnDispDtl_col_conv_typ_12.addLinkBeans(p.columnDispDtl_col_conv_typ_13);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_12);
		p.columnDispDtl_col_conv_typ_13.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_13_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_13);
		p.columnDispDtl_col_conv_typ_14.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_14_META);
		p.columnDispDtl_col_conv_typ_14.addLinkBeans(p.columnDispDtl_col_conv_typ_15);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_14);
		p.columnDispDtl_col_conv_typ_15.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_15_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_15);
		p.columnDispDtl_col_conv_typ_16.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_16_META);
		p.columnDispDtl_col_conv_typ_16.addLinkBeans(p.columnDispDtl_col_conv_typ_17);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_16);
		p.columnDispDtl_col_conv_typ_17.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_17_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_17);
		p.columnDispDtl_col_conv_typ_18.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_18_META);
		p.columnDispDtl_col_conv_typ_18.addLinkBeans(p.columnDispDtl_col_conv_typ_19);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_18);
		p.columnDispDtl_col_conv_typ_19.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_19_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_19);
		p.columnDispDtl_col_conv_typ_20.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_20_META);
		p.columnDispDtl_col_conv_typ_20.addLinkBeans(p.columnDispDtl_col_conv_typ_21);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_20);
		p.columnDispDtl_col_conv_typ_21.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_21_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_21);
		p.columnDispDtl_col_conv_typ_22.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_22_META);
		p.columnDispDtl_col_conv_typ_22.addLinkBeans(p.columnDispDtl_col_conv_typ_23);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_22);
		p.columnDispDtl_col_conv_typ_23.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_23_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_23);
		p.columnDispDtl_col_conv_typ_24.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_24_META);
		p.columnDispDtl_col_conv_typ_24.addLinkBeans(p.columnDispDtl_col_conv_typ_25);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_24);
		p.columnDispDtl_col_conv_typ_25.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_25_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_25);
		p.columnDispDtl_col_conv_typ_26.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_26_META);
		p.columnDispDtl_col_conv_typ_26.addLinkBeans(p.columnDispDtl_col_conv_typ_27);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_26);
		p.columnDispDtl_col_conv_typ_27.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_27_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_27);
		p.columnDispDtl_col_conv_typ_28.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_28_META);
		p.columnDispDtl_col_conv_typ_28.addLinkBeans(p.columnDispDtl_col_conv_typ_29);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_28);
		p.columnDispDtl_col_conv_typ_29.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_29_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_29);
		p.columnDispDtl_col_conv_typ_30.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_30_META);
		p.columnDispDtl_col_conv_typ_30.addLinkBeans(p.columnDispDtl_col_conv_typ_31);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_30);
		p.columnDispDtl_col_conv_typ_31.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_31_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_31);
		p.columnDispDtl_col_conv_typ_32.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_32_META);
		p.columnDispDtl_col_conv_typ_32.addLinkBeans(p.columnDispDtl_col_conv_typ_33);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_32);
		p.columnDispDtl_col_conv_typ_33.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_33_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_33);
		p.columnDispDtl_col_conv_typ_34.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_34_META);
		p.columnDispDtl_col_conv_typ_34.addLinkBeans(p.columnDispDtl_col_conv_typ_35);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_34);
		p.columnDispDtl_col_conv_typ_35.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_35_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_35);
		p.columnDispDtl_col_conv_typ_36.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_36_META);
		p.columnDispDtl_col_conv_typ_36.addLinkBeans(p.columnDispDtl_col_conv_typ_37);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_36);
		p.columnDispDtl_col_conv_typ_37.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_37_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_37);
		p.columnDispDtl_col_conv_typ_38.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_38_META);
		p.columnDispDtl_col_conv_typ_38.addLinkBeans(p.columnDispDtl_col_conv_typ_39);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_38);
		p.columnDispDtl_col_conv_typ_39.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_39_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_39);
		p.columnDispDtl_col_conv_typ_40.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_40_META);
		p.columnDispDtl_col_conv_typ_40.addLinkBeans(p.columnDispDtl_col_conv_typ_41);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_40);
		p.columnDispDtl_col_conv_typ_41.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_41_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_41);
		p.columnDispDtl_col_conv_typ_42.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_42_META);
		p.columnDispDtl_col_conv_typ_42.addLinkBeans(p.columnDispDtl_col_conv_typ_43);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_42);
		p.columnDispDtl_col_conv_typ_43.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_43_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_43);
		p.columnDispDtl_col_conv_typ_44.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_44_META);
		p.columnDispDtl_col_conv_typ_44.addLinkBeans(p.columnDispDtl_col_conv_typ_45);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_44);
		p.columnDispDtl_col_conv_typ_45.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_45_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_45);
		p.columnDispDtl_col_conv_typ_46.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_46_META);
		p.columnDispDtl_col_conv_typ_46.addLinkBeans(p.columnDispDtl_col_conv_typ_47);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_46);
		p.columnDispDtl_col_conv_typ_47.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_47_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_47);
		p.columnDispDtl_col_conv_typ_48.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_48_META);
		p.columnDispDtl_col_conv_typ_48.addLinkBeans(p.columnDispDtl_col_conv_typ_49);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_48);
		p.columnDispDtl_col_conv_typ_49.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_49_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_49);
		p.columnDispDtl_col_conv_typ_50.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_50_META);
		p.columnDispDtl_col_conv_typ_50.addLinkBeans(p.columnDispDtl_col_conv_typ_51);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_50);
		p.columnDispDtl_col_conv_typ_51.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_51_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_51);
		p.columnDispDtl_col_conv_typ_52.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_52_META);
		p.columnDispDtl_col_conv_typ_52.addLinkBeans(p.columnDispDtl_col_conv_typ_53);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_52);
		p.columnDispDtl_col_conv_typ_53.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_53_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_53);
		p.columnDispDtl_col_conv_typ_54.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_54_META);
		p.columnDispDtl_col_conv_typ_54.addLinkBeans(p.columnDispDtl_col_conv_typ_55);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_54);
		p.columnDispDtl_col_conv_typ_55.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_55_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_55);
		p.columnDispDtl_col_conv_typ_56.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_56_META);
		p.columnDispDtl_col_conv_typ_56.addLinkBeans(p.columnDispDtl_col_conv_typ_57);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_56);
		p.columnDispDtl_col_conv_typ_57.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_57_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_57);
		p.columnDispDtl_col_conv_typ_58.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_58_META);
		p.columnDispDtl_col_conv_typ_58.addLinkBeans(p.columnDispDtl_col_conv_typ_59);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_58);
		p.columnDispDtl_col_conv_typ_59.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_59_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_59);
		p.columnDispDtl_col_conv_typ_60.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_60_META);
		p.columnDispDtl_col_conv_typ_60.addLinkBeans(p.columnDispDtl_col_conv_typ_61);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_60);
		p.columnDispDtl_col_conv_typ_61.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_61_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_61);
		p.columnDispDtl_col_conv_typ_62.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_62_META);
		p.columnDispDtl_col_conv_typ_62.addLinkBeans(p.columnDispDtl_col_conv_typ_63);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_62);
		p.columnDispDtl_col_conv_typ_63.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_63_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_63);
		p.columnDispDtl_col_conv_typ_64.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_64_META);
		p.columnDispDtl_col_conv_typ_64.addLinkBeans(p.columnDispDtl_col_conv_typ_65);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_64);
		p.columnDispDtl_col_conv_typ_65.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_65_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_65);
		p.columnDispDtl_col_conv_typ_66.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_66_META);
		p.columnDispDtl_col_conv_typ_66.addLinkBeans(p.columnDispDtl_col_conv_typ_67);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_66);
		p.columnDispDtl_col_conv_typ_67.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_67_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_67);
		p.columnDispDtl_col_conv_typ_68.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_68_META);
		p.columnDispDtl_col_conv_typ_68.addLinkBeans(p.columnDispDtl_col_conv_typ_69);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_68);
		p.columnDispDtl_col_conv_typ_69.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_69_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_69);
		p.columnDispDtl_col_conv_typ_70.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_70_META);
		p.columnDispDtl_col_conv_typ_70.addLinkBeans(p.columnDispDtl_col_conv_typ_71);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_70);
		p.columnDispDtl_col_conv_typ_71.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_71_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_71);
		p.columnDispDtl_col_conv_typ_72.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_72_META);
		p.columnDispDtl_col_conv_typ_72.addLinkBeans(p.columnDispDtl_col_conv_typ_73);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_72);
		p.columnDispDtl_col_conv_typ_73.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_73_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_73);
		p.columnDispDtl_col_conv_typ_74.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_74_META);
		p.columnDispDtl_col_conv_typ_74.addLinkBeans(p.columnDispDtl_col_conv_typ_75);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_74);
		p.columnDispDtl_col_conv_typ_75.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_75_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_75);
		p.columnDispDtl_col_conv_typ_76.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_76_META);
		p.columnDispDtl_col_conv_typ_76.addLinkBeans(p.columnDispDtl_col_conv_typ_77);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_76);
		p.columnDispDtl_col_conv_typ_77.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_77_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_77);
		p.columnDispDtl_col_conv_typ_78.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_78_META);
		p.columnDispDtl_col_conv_typ_78.addLinkBeans(p.columnDispDtl_col_conv_typ_79);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_78);
		p.columnDispDtl_col_conv_typ_79.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_79_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_79);
		p.columnDispDtl_col_conv_typ_80.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_80_META);
		p.columnDispDtl_col_conv_typ_80.addLinkBeans(p.columnDispDtl_col_conv_typ_81);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_80);
		p.columnDispDtl_col_conv_typ_81.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_81_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_81);
		p.columnDispDtl_col_conv_typ_82.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_82_META);
		p.columnDispDtl_col_conv_typ_82.addLinkBeans(p.columnDispDtl_col_conv_typ_83);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_82);
		p.columnDispDtl_col_conv_typ_83.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_83_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_83);
		p.columnDispDtl_col_conv_typ_84.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_84_META);
		p.columnDispDtl_col_conv_typ_84.addLinkBeans(p.columnDispDtl_col_conv_typ_85);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_84);
		p.columnDispDtl_col_conv_typ_85.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_85_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_85);
		p.columnDispDtl_col_conv_typ_86.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_86_META);
		p.columnDispDtl_col_conv_typ_86.addLinkBeans(p.columnDispDtl_col_conv_typ_87);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_86);
		p.columnDispDtl_col_conv_typ_87.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_87_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_87);
		p.columnDispDtl_col_conv_typ_88.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_88_META);
		p.columnDispDtl_col_conv_typ_88.addLinkBeans(p.columnDispDtl_col_conv_typ_89);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_88);
		p.columnDispDtl_col_conv_typ_89.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_89_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_89);
		p.columnDispDtl_col_conv_typ_90.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_90_META);
		p.columnDispDtl_col_conv_typ_90.addLinkBeans(p.columnDispDtl_col_conv_typ_91);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_90);
		p.columnDispDtl_col_conv_typ_91.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_91_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_91);
		p.columnDispDtl_col_conv_typ_92.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_92_META);
		p.columnDispDtl_col_conv_typ_92.addLinkBeans(p.columnDispDtl_col_conv_typ_93);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_92);
		p.columnDispDtl_col_conv_typ_93.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_93_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_93);
		p.columnDispDtl_col_conv_typ_94.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_94_META);
		p.columnDispDtl_col_conv_typ_94.addLinkBeans(p.columnDispDtl_col_conv_typ_95);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_94);
		p.columnDispDtl_col_conv_typ_95.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_95_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_95);
		p.columnDispDtl_col_conv_typ_96.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_96_META);
		p.columnDispDtl_col_conv_typ_96.addLinkBeans(p.columnDispDtl_col_conv_typ_97);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_96);
		p.columnDispDtl_col_conv_typ_97.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_97_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_97);
		p.columnDispDtl_col_conv_typ_98.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_98_META);
		p.columnDispDtl_col_conv_typ_98.addLinkBeans(p.columnDispDtl_col_conv_typ_99);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_98);
		p.columnDispDtl_col_conv_typ_99.setMeta(mcframe.clientMABC.MABCP1510.DispDtlR.col_conv_typ_99_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_col_conv_typ_99);
		p.cgDispDtl_if_col_typ_cg_00.add(p.columnDispDtl_col_conv_typ_00);
		p.cgDispDtl_if_col_typ_cg_00.add(p.columnDispDtl_col_conv_typ_01);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_00);
		p.cgDispDtl_if_col_typ_cg_01.add(p.columnDispDtl_col_conv_typ_02);
		p.cgDispDtl_if_col_typ_cg_01.add(p.columnDispDtl_col_conv_typ_03);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_01);
		p.cgDispDtl_if_col_typ_cg_02.add(p.columnDispDtl_col_conv_typ_04);
		p.cgDispDtl_if_col_typ_cg_02.add(p.columnDispDtl_col_conv_typ_05);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_02);
		p.cgDispDtl_if_col_typ_cg_03.add(p.columnDispDtl_col_conv_typ_06);
		p.cgDispDtl_if_col_typ_cg_03.add(p.columnDispDtl_col_conv_typ_07);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_03);
		p.cgDispDtl_if_col_typ_cg_04.add(p.columnDispDtl_col_conv_typ_08);
		p.cgDispDtl_if_col_typ_cg_04.add(p.columnDispDtl_col_conv_typ_09);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_04);
		p.cgDispDtl_if_col_typ_cg_05.add(p.columnDispDtl_col_conv_typ_10);
		p.cgDispDtl_if_col_typ_cg_05.add(p.columnDispDtl_col_conv_typ_11);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_05);
		p.cgDispDtl_if_col_typ_cg_06.add(p.columnDispDtl_col_conv_typ_12);
		p.cgDispDtl_if_col_typ_cg_06.add(p.columnDispDtl_col_conv_typ_13);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_06);
		p.cgDispDtl_if_col_typ_cg_07.add(p.columnDispDtl_col_conv_typ_14);
		p.cgDispDtl_if_col_typ_cg_07.add(p.columnDispDtl_col_conv_typ_15);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_07);
		p.cgDispDtl_if_col_typ_cg_08.add(p.columnDispDtl_col_conv_typ_16);
		p.cgDispDtl_if_col_typ_cg_08.add(p.columnDispDtl_col_conv_typ_17);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_08);
		p.cgDispDtl_if_col_typ_cg_09.add(p.columnDispDtl_col_conv_typ_18);
		p.cgDispDtl_if_col_typ_cg_09.add(p.columnDispDtl_col_conv_typ_19);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_09);
		p.cgDispDtl_if_col_typ_cg_10.add(p.columnDispDtl_col_conv_typ_20);
		p.cgDispDtl_if_col_typ_cg_10.add(p.columnDispDtl_col_conv_typ_21);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_10);
		p.cgDispDtl_if_col_typ_cg_11.add(p.columnDispDtl_col_conv_typ_22);
		p.cgDispDtl_if_col_typ_cg_11.add(p.columnDispDtl_col_conv_typ_23);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_11);
		p.cgDispDtl_if_col_typ_cg_12.add(p.columnDispDtl_col_conv_typ_24);
		p.cgDispDtl_if_col_typ_cg_12.add(p.columnDispDtl_col_conv_typ_25);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_12);
		p.cgDispDtl_if_col_typ_cg_13.add(p.columnDispDtl_col_conv_typ_26);
		p.cgDispDtl_if_col_typ_cg_13.add(p.columnDispDtl_col_conv_typ_27);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_13);
		p.cgDispDtl_if_col_typ_cg_14.add(p.columnDispDtl_col_conv_typ_28);
		p.cgDispDtl_if_col_typ_cg_14.add(p.columnDispDtl_col_conv_typ_29);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_14);
		p.cgDispDtl_if_col_typ_cg_15.add(p.columnDispDtl_col_conv_typ_30);
		p.cgDispDtl_if_col_typ_cg_15.add(p.columnDispDtl_col_conv_typ_31);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_15);
		p.cgDispDtl_if_col_typ_cg_16.add(p.columnDispDtl_col_conv_typ_32);
		p.cgDispDtl_if_col_typ_cg_16.add(p.columnDispDtl_col_conv_typ_33);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_16);
		p.cgDispDtl_if_col_typ_cg_17.add(p.columnDispDtl_col_conv_typ_34);
		p.cgDispDtl_if_col_typ_cg_17.add(p.columnDispDtl_col_conv_typ_35);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_17);
		p.cgDispDtl_if_col_typ_cg_18.add(p.columnDispDtl_col_conv_typ_36);
		p.cgDispDtl_if_col_typ_cg_18.add(p.columnDispDtl_col_conv_typ_37);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_18);
		p.cgDispDtl_if_col_typ_cg_19.add(p.columnDispDtl_col_conv_typ_38);
		p.cgDispDtl_if_col_typ_cg_19.add(p.columnDispDtl_col_conv_typ_39);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_19);
		p.cgDispDtl_if_col_typ_cg_20.add(p.columnDispDtl_col_conv_typ_40);
		p.cgDispDtl_if_col_typ_cg_20.add(p.columnDispDtl_col_conv_typ_41);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_20);
		p.cgDispDtl_if_col_typ_cg_21.add(p.columnDispDtl_col_conv_typ_42);
		p.cgDispDtl_if_col_typ_cg_21.add(p.columnDispDtl_col_conv_typ_43);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_21);
		p.cgDispDtl_if_col_typ_cg_22.add(p.columnDispDtl_col_conv_typ_44);
		p.cgDispDtl_if_col_typ_cg_22.add(p.columnDispDtl_col_conv_typ_45);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_22);
		p.cgDispDtl_if_col_typ_cg_23.add(p.columnDispDtl_col_conv_typ_46);
		p.cgDispDtl_if_col_typ_cg_23.add(p.columnDispDtl_col_conv_typ_47);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_23);
		p.cgDispDtl_if_col_typ_cg_24.add(p.columnDispDtl_col_conv_typ_48);
		p.cgDispDtl_if_col_typ_cg_24.add(p.columnDispDtl_col_conv_typ_49);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_24);
		p.cgDispDtl_if_col_typ_cg_25.add(p.columnDispDtl_col_conv_typ_50);
		p.cgDispDtl_if_col_typ_cg_25.add(p.columnDispDtl_col_conv_typ_51);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_25);
		p.cgDispDtl_if_col_typ_cg_26.add(p.columnDispDtl_col_conv_typ_52);
		p.cgDispDtl_if_col_typ_cg_26.add(p.columnDispDtl_col_conv_typ_53);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_26);
		p.cgDispDtl_if_col_typ_cg_27.add(p.columnDispDtl_col_conv_typ_54);
		p.cgDispDtl_if_col_typ_cg_27.add(p.columnDispDtl_col_conv_typ_55);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_27);
		p.cgDispDtl_if_col_typ_cg_28.add(p.columnDispDtl_col_conv_typ_56);
		p.cgDispDtl_if_col_typ_cg_28.add(p.columnDispDtl_col_conv_typ_57);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_28);
		p.cgDispDtl_if_col_typ_cg_29.add(p.columnDispDtl_col_conv_typ_58);
		p.cgDispDtl_if_col_typ_cg_29.add(p.columnDispDtl_col_conv_typ_59);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_29);
		p.cgDispDtl_if_col_typ_cg_30.add(p.columnDispDtl_col_conv_typ_60);
		p.cgDispDtl_if_col_typ_cg_30.add(p.columnDispDtl_col_conv_typ_61);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_30);
		p.cgDispDtl_if_col_typ_cg_31.add(p.columnDispDtl_col_conv_typ_62);
		p.cgDispDtl_if_col_typ_cg_31.add(p.columnDispDtl_col_conv_typ_63);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_31);
		p.cgDispDtl_if_col_typ_cg_32.add(p.columnDispDtl_col_conv_typ_64);
		p.cgDispDtl_if_col_typ_cg_32.add(p.columnDispDtl_col_conv_typ_65);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_32);
		p.cgDispDtl_if_col_typ_cg_33.add(p.columnDispDtl_col_conv_typ_66);
		p.cgDispDtl_if_col_typ_cg_33.add(p.columnDispDtl_col_conv_typ_67);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_33);
		p.cgDispDtl_if_col_typ_cg_34.add(p.columnDispDtl_col_conv_typ_68);
		p.cgDispDtl_if_col_typ_cg_34.add(p.columnDispDtl_col_conv_typ_69);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_34);
		p.cgDispDtl_if_col_typ_cg_35.add(p.columnDispDtl_col_conv_typ_70);
		p.cgDispDtl_if_col_typ_cg_35.add(p.columnDispDtl_col_conv_typ_71);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_35);
		p.cgDispDtl_if_col_typ_cg_36.add(p.columnDispDtl_col_conv_typ_72);
		p.cgDispDtl_if_col_typ_cg_36.add(p.columnDispDtl_col_conv_typ_73);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_36);
		p.cgDispDtl_if_col_typ_cg_37.add(p.columnDispDtl_col_conv_typ_74);
		p.cgDispDtl_if_col_typ_cg_37.add(p.columnDispDtl_col_conv_typ_75);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_37);
		p.cgDispDtl_if_col_typ_cg_38.add(p.columnDispDtl_col_conv_typ_76);
		p.cgDispDtl_if_col_typ_cg_38.add(p.columnDispDtl_col_conv_typ_77);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_38);
		p.cgDispDtl_if_col_typ_cg_39.add(p.columnDispDtl_col_conv_typ_78);
		p.cgDispDtl_if_col_typ_cg_39.add(p.columnDispDtl_col_conv_typ_79);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_39);
		p.cgDispDtl_if_col_typ_cg_40.add(p.columnDispDtl_col_conv_typ_80);
		p.cgDispDtl_if_col_typ_cg_40.add(p.columnDispDtl_col_conv_typ_81);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_40);
		p.cgDispDtl_if_col_typ_cg_41.add(p.columnDispDtl_col_conv_typ_82);
		p.cgDispDtl_if_col_typ_cg_41.add(p.columnDispDtl_col_conv_typ_83);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_41);
		p.cgDispDtl_if_col_typ_cg_42.add(p.columnDispDtl_col_conv_typ_84);
		p.cgDispDtl_if_col_typ_cg_42.add(p.columnDispDtl_col_conv_typ_85);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_42);
		p.cgDispDtl_if_col_typ_cg_43.add(p.columnDispDtl_col_conv_typ_86);
		p.cgDispDtl_if_col_typ_cg_43.add(p.columnDispDtl_col_conv_typ_87);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_43);
		p.cgDispDtl_if_col_typ_cg_44.add(p.columnDispDtl_col_conv_typ_88);
		p.cgDispDtl_if_col_typ_cg_44.add(p.columnDispDtl_col_conv_typ_89);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_44);
		p.cgDispDtl_if_col_typ_cg_45.add(p.columnDispDtl_col_conv_typ_90);
		p.cgDispDtl_if_col_typ_cg_45.add(p.columnDispDtl_col_conv_typ_91);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_45);
		p.cgDispDtl_if_col_typ_cg_46.add(p.columnDispDtl_col_conv_typ_92);
		p.cgDispDtl_if_col_typ_cg_46.add(p.columnDispDtl_col_conv_typ_93);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_46);
		p.cgDispDtl_if_col_typ_cg_47.add(p.columnDispDtl_col_conv_typ_94);
		p.cgDispDtl_if_col_typ_cg_47.add(p.columnDispDtl_col_conv_typ_95);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_47);
		p.cgDispDtl_if_col_typ_cg_48.add(p.columnDispDtl_col_conv_typ_96);
		p.cgDispDtl_if_col_typ_cg_48.add(p.columnDispDtl_col_conv_typ_97);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_48);
		p.cgDispDtl_if_col_typ_cg_49.add(p.columnDispDtl_col_conv_typ_98);
		p.cgDispDtl_if_col_typ_cg_49.add(p.columnDispDtl_col_conv_typ_99);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_if_col_typ_cg_49);
		// スクロール固定カラムの指定
		p.DispDtlTable.setUnscrollColumn(p.columnDispDtl_del_flg);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_IfCdRuleReg p) {
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ext_sys_cd.getListConfig().setPutter(getCnd_ext_sys_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd1.getListConfig().setPutter(getCnd_bp_grp_cd1_ListPutter());
		Cnd_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd2.getListConfig().setPutter(getCnd_bp_grp_cd2_ListPutter());
		Cnd_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd3.getListConfig().setPutter(getCnd_bp_grp_cd3_ListPutter());
		Cnd_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd4.getListConfig().setPutter(getCnd_bp_grp_cd4_ListPutter());
		Cnd_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd5.getListConfig().setPutter(getCnd_bp_grp_cd5_ListPutter());
		Cnd_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd6.getListConfig().setPutter(getCnd_bp_grp_cd6_ListPutter());
		Cnd_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd7.getListConfig().setPutter(getCnd_bp_grp_cd7_ListPutter());
		Cnd_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd8.getListConfig().setPutter(getCnd_bp_grp_cd8_ListPutter());
		Cnd_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd9.getListConfig().setPutter(getCnd_bp_grp_cd9_ListPutter());
		Cnd_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd10.getListConfig().setPutter(getCnd_bp_grp_cd10_ListPutter());
		columnDispDtl_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_ext_sys_cd.getListConfig().setPutter(getDispDtl_ext_sys_cd_ListPutter());
		columnDispDtl_bp_cd.getListConfig().setPutter(getDispDtl_bp_cd_ListPutter());
		columnDispDtl_col_conv_typ_00.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_00.getListConfig().setPutter(getDispDtl_col_conv_typ_00_ListPutter());
		columnDispDtl_col_conv_typ_02.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_02.getListConfig().setPutter(getDispDtl_col_conv_typ_02_ListPutter());
		columnDispDtl_col_conv_typ_04.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_04.getListConfig().setPutter(getDispDtl_col_conv_typ_04_ListPutter());
		columnDispDtl_col_conv_typ_06.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_06.getListConfig().setPutter(getDispDtl_col_conv_typ_06_ListPutter());
		columnDispDtl_col_conv_typ_08.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_08.getListConfig().setPutter(getDispDtl_col_conv_typ_08_ListPutter());
		columnDispDtl_col_conv_typ_10.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_10.getListConfig().setPutter(getDispDtl_col_conv_typ_10_ListPutter());
		columnDispDtl_col_conv_typ_12.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_12.getListConfig().setPutter(getDispDtl_col_conv_typ_12_ListPutter());
		columnDispDtl_col_conv_typ_14.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_14.getListConfig().setPutter(getDispDtl_col_conv_typ_14_ListPutter());
		columnDispDtl_col_conv_typ_16.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_16.getListConfig().setPutter(getDispDtl_col_conv_typ_16_ListPutter());
		columnDispDtl_col_conv_typ_18.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_18.getListConfig().setPutter(getDispDtl_col_conv_typ_18_ListPutter());
		columnDispDtl_col_conv_typ_20.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_20.getListConfig().setPutter(getDispDtl_col_conv_typ_20_ListPutter());
		columnDispDtl_col_conv_typ_22.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_22.getListConfig().setPutter(getDispDtl_col_conv_typ_22_ListPutter());
		columnDispDtl_col_conv_typ_24.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_24.getListConfig().setPutter(getDispDtl_col_conv_typ_24_ListPutter());
		columnDispDtl_col_conv_typ_26.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_26.getListConfig().setPutter(getDispDtl_col_conv_typ_26_ListPutter());
		columnDispDtl_col_conv_typ_28.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_28.getListConfig().setPutter(getDispDtl_col_conv_typ_28_ListPutter());
		columnDispDtl_col_conv_typ_30.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_30.getListConfig().setPutter(getDispDtl_col_conv_typ_30_ListPutter());
		columnDispDtl_col_conv_typ_32.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_32.getListConfig().setPutter(getDispDtl_col_conv_typ_32_ListPutter());
		columnDispDtl_col_conv_typ_34.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_34.getListConfig().setPutter(getDispDtl_col_conv_typ_34_ListPutter());
		columnDispDtl_col_conv_typ_36.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_36.getListConfig().setPutter(getDispDtl_col_conv_typ_36_ListPutter());
		columnDispDtl_col_conv_typ_38.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_38.getListConfig().setPutter(getDispDtl_col_conv_typ_38_ListPutter());
		columnDispDtl_col_conv_typ_40.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_40.getListConfig().setPutter(getDispDtl_col_conv_typ_40_ListPutter());
		columnDispDtl_col_conv_typ_42.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_42.getListConfig().setPutter(getDispDtl_col_conv_typ_42_ListPutter());
		columnDispDtl_col_conv_typ_44.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_44.getListConfig().setPutter(getDispDtl_col_conv_typ_44_ListPutter());
		columnDispDtl_col_conv_typ_46.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_46.getListConfig().setPutter(getDispDtl_col_conv_typ_46_ListPutter());
		columnDispDtl_col_conv_typ_48.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_48.getListConfig().setPutter(getDispDtl_col_conv_typ_48_ListPutter());
		columnDispDtl_col_conv_typ_50.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_50.getListConfig().setPutter(getDispDtl_col_conv_typ_50_ListPutter());
		columnDispDtl_col_conv_typ_52.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_52.getListConfig().setPutter(getDispDtl_col_conv_typ_52_ListPutter());
		columnDispDtl_col_conv_typ_54.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_54.getListConfig().setPutter(getDispDtl_col_conv_typ_54_ListPutter());
		columnDispDtl_col_conv_typ_56.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_56.getListConfig().setPutter(getDispDtl_col_conv_typ_56_ListPutter());
		columnDispDtl_col_conv_typ_58.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_58.getListConfig().setPutter(getDispDtl_col_conv_typ_58_ListPutter());
		columnDispDtl_col_conv_typ_60.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_60.getListConfig().setPutter(getDispDtl_col_conv_typ_60_ListPutter());
		columnDispDtl_col_conv_typ_62.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_62.getListConfig().setPutter(getDispDtl_col_conv_typ_62_ListPutter());
		columnDispDtl_col_conv_typ_64.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_64.getListConfig().setPutter(getDispDtl_col_conv_typ_64_ListPutter());
		columnDispDtl_col_conv_typ_66.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_66.getListConfig().setPutter(getDispDtl_col_conv_typ_66_ListPutter());
		columnDispDtl_col_conv_typ_68.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_68.getListConfig().setPutter(getDispDtl_col_conv_typ_68_ListPutter());
		columnDispDtl_col_conv_typ_70.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_70.getListConfig().setPutter(getDispDtl_col_conv_typ_70_ListPutter());
		columnDispDtl_col_conv_typ_72.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_72.getListConfig().setPutter(getDispDtl_col_conv_typ_72_ListPutter());
		columnDispDtl_col_conv_typ_74.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_74.getListConfig().setPutter(getDispDtl_col_conv_typ_74_ListPutter());
		columnDispDtl_col_conv_typ_76.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_76.getListConfig().setPutter(getDispDtl_col_conv_typ_76_ListPutter());
		columnDispDtl_col_conv_typ_78.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_78.getListConfig().setPutter(getDispDtl_col_conv_typ_78_ListPutter());
		columnDispDtl_col_conv_typ_80.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_80.getListConfig().setPutter(getDispDtl_col_conv_typ_80_ListPutter());
		columnDispDtl_col_conv_typ_82.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_82.getListConfig().setPutter(getDispDtl_col_conv_typ_82_ListPutter());
		columnDispDtl_col_conv_typ_84.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_84.getListConfig().setPutter(getDispDtl_col_conv_typ_84_ListPutter());
		columnDispDtl_col_conv_typ_86.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_86.getListConfig().setPutter(getDispDtl_col_conv_typ_86_ListPutter());
		columnDispDtl_col_conv_typ_88.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_88.getListConfig().setPutter(getDispDtl_col_conv_typ_88_ListPutter());
		columnDispDtl_col_conv_typ_90.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_90.getListConfig().setPutter(getDispDtl_col_conv_typ_90_ListPutter());
		columnDispDtl_col_conv_typ_92.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_92.getListConfig().setPutter(getDispDtl_col_conv_typ_92_ListPutter());
		columnDispDtl_col_conv_typ_94.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_94.getListConfig().setPutter(getDispDtl_col_conv_typ_94_ListPutter());
		columnDispDtl_col_conv_typ_96.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_96.getListConfig().setPutter(getDispDtl_col_conv_typ_96_ListPutter());
		columnDispDtl_col_conv_typ_98.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_col_conv_typ_98.getListConfig().setPutter(getDispDtl_col_conv_typ_98_ListPutter());
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
	 * [Cnd_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
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
	 * [Cnd_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [DispDtl_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
		return lp;
	}
	 
	/**
	 * [DispDtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_00_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_00_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_02_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_02_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_04_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_04_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_06_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_06_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_08_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_08_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_10_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_12_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_12_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_14_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_14_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_16_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_16_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_18_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_18_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_20_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_20_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_22_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_22_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_24_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_24_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_26_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_26_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_28_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_28_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_30_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_30_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_32_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_32_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_34_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_34_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_36_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_36_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_38_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_38_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_40_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_40_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_42_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_42_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_44_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_44_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_46_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_46_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_48_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_48_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_50_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_50_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_52_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_52_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_54_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_54_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_56_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_56_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_58_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_58_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_60_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_60_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_62_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_62_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_64_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_64_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_66_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_66_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_68_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_68_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_70_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_70_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_72_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_72_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_74_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_74_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_76_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_76_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_78_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_78_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_80_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_80_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_82_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_82_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_84_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_84_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_86_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_86_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_88_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_88_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_90_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_90_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_92_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_92_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_94_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_94_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_96_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_96_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 
	/**
	 * [DispDtl_col_conv_typ_98_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_col_conv_typ_98_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ColConvTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ext_sys_cd) return getCnd_ext_sys_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_bp_grp_cd1) return getCnd_bp_grp_cd1(row, info);
		if(combo == Cnd_bp_grp_cd2) return getCnd_bp_grp_cd2(row, info);
		if(combo == Cnd_bp_grp_cd3) return getCnd_bp_grp_cd3(row, info);
		if(combo == Cnd_bp_grp_cd4) return getCnd_bp_grp_cd4(row, info);
		if(combo == Cnd_bp_grp_cd5) return getCnd_bp_grp_cd5(row, info);
		if(combo == Cnd_bp_grp_cd6) return getCnd_bp_grp_cd6(row, info);
		if(combo == Cnd_bp_grp_cd7) return getCnd_bp_grp_cd7(row, info);
		if(combo == Cnd_bp_grp_cd8) return getCnd_bp_grp_cd8(row, info);
		if(combo == Cnd_bp_grp_cd9) return getCnd_bp_grp_cd9(row, info);
		if(combo == Cnd_bp_grp_cd10) return getCnd_bp_grp_cd10(row, info);
		if(combo == columnDispDtl_ext_sys_cd) return getDispDtl_ext_sys_cd(row, info);
		if(combo == columnDispDtl_bp_cd) return getDispDtl_bp_cd(row, info);
		if(combo == columnDispDtl_col_conv_typ_00) return getDispDtl_col_conv_typ_00(row, info);
		if(combo == columnDispDtl_col_conv_typ_02) return getDispDtl_col_conv_typ_02(row, info);
		if(combo == columnDispDtl_col_conv_typ_04) return getDispDtl_col_conv_typ_04(row, info);
		if(combo == columnDispDtl_col_conv_typ_06) return getDispDtl_col_conv_typ_06(row, info);
		if(combo == columnDispDtl_col_conv_typ_08) return getDispDtl_col_conv_typ_08(row, info);
		if(combo == columnDispDtl_col_conv_typ_10) return getDispDtl_col_conv_typ_10(row, info);
		if(combo == columnDispDtl_col_conv_typ_12) return getDispDtl_col_conv_typ_12(row, info);
		if(combo == columnDispDtl_col_conv_typ_14) return getDispDtl_col_conv_typ_14(row, info);
		if(combo == columnDispDtl_col_conv_typ_16) return getDispDtl_col_conv_typ_16(row, info);
		if(combo == columnDispDtl_col_conv_typ_18) return getDispDtl_col_conv_typ_18(row, info);
		if(combo == columnDispDtl_col_conv_typ_20) return getDispDtl_col_conv_typ_20(row, info);
		if(combo == columnDispDtl_col_conv_typ_22) return getDispDtl_col_conv_typ_22(row, info);
		if(combo == columnDispDtl_col_conv_typ_24) return getDispDtl_col_conv_typ_24(row, info);
		if(combo == columnDispDtl_col_conv_typ_26) return getDispDtl_col_conv_typ_26(row, info);
		if(combo == columnDispDtl_col_conv_typ_28) return getDispDtl_col_conv_typ_28(row, info);
		if(combo == columnDispDtl_col_conv_typ_30) return getDispDtl_col_conv_typ_30(row, info);
		if(combo == columnDispDtl_col_conv_typ_32) return getDispDtl_col_conv_typ_32(row, info);
		if(combo == columnDispDtl_col_conv_typ_34) return getDispDtl_col_conv_typ_34(row, info);
		if(combo == columnDispDtl_col_conv_typ_36) return getDispDtl_col_conv_typ_36(row, info);
		if(combo == columnDispDtl_col_conv_typ_38) return getDispDtl_col_conv_typ_38(row, info);
		if(combo == columnDispDtl_col_conv_typ_40) return getDispDtl_col_conv_typ_40(row, info);
		if(combo == columnDispDtl_col_conv_typ_42) return getDispDtl_col_conv_typ_42(row, info);
		if(combo == columnDispDtl_col_conv_typ_44) return getDispDtl_col_conv_typ_44(row, info);
		if(combo == columnDispDtl_col_conv_typ_46) return getDispDtl_col_conv_typ_46(row, info);
		if(combo == columnDispDtl_col_conv_typ_48) return getDispDtl_col_conv_typ_48(row, info);
		if(combo == columnDispDtl_col_conv_typ_50) return getDispDtl_col_conv_typ_50(row, info);
		if(combo == columnDispDtl_col_conv_typ_52) return getDispDtl_col_conv_typ_52(row, info);
		if(combo == columnDispDtl_col_conv_typ_54) return getDispDtl_col_conv_typ_54(row, info);
		if(combo == columnDispDtl_col_conv_typ_56) return getDispDtl_col_conv_typ_56(row, info);
		if(combo == columnDispDtl_col_conv_typ_58) return getDispDtl_col_conv_typ_58(row, info);
		if(combo == columnDispDtl_col_conv_typ_60) return getDispDtl_col_conv_typ_60(row, info);
		if(combo == columnDispDtl_col_conv_typ_62) return getDispDtl_col_conv_typ_62(row, info);
		if(combo == columnDispDtl_col_conv_typ_64) return getDispDtl_col_conv_typ_64(row, info);
		if(combo == columnDispDtl_col_conv_typ_66) return getDispDtl_col_conv_typ_66(row, info);
		if(combo == columnDispDtl_col_conv_typ_68) return getDispDtl_col_conv_typ_68(row, info);
		if(combo == columnDispDtl_col_conv_typ_70) return getDispDtl_col_conv_typ_70(row, info);
		if(combo == columnDispDtl_col_conv_typ_72) return getDispDtl_col_conv_typ_72(row, info);
		if(combo == columnDispDtl_col_conv_typ_74) return getDispDtl_col_conv_typ_74(row, info);
		if(combo == columnDispDtl_col_conv_typ_76) return getDispDtl_col_conv_typ_76(row, info);
		if(combo == columnDispDtl_col_conv_typ_78) return getDispDtl_col_conv_typ_78(row, info);
		if(combo == columnDispDtl_col_conv_typ_80) return getDispDtl_col_conv_typ_80(row, info);
		if(combo == columnDispDtl_col_conv_typ_82) return getDispDtl_col_conv_typ_82(row, info);
		if(combo == columnDispDtl_col_conv_typ_84) return getDispDtl_col_conv_typ_84(row, info);
		if(combo == columnDispDtl_col_conv_typ_86) return getDispDtl_col_conv_typ_86(row, info);
		if(combo == columnDispDtl_col_conv_typ_88) return getDispDtl_col_conv_typ_88(row, info);
		if(combo == columnDispDtl_col_conv_typ_90) return getDispDtl_col_conv_typ_90(row, info);
		if(combo == columnDispDtl_col_conv_typ_92) return getDispDtl_col_conv_typ_92(row, info);
		if(combo == columnDispDtl_col_conv_typ_94) return getDispDtl_col_conv_typ_94(row, info);
		if(combo == columnDispDtl_col_conv_typ_96) return getDispDtl_col_conv_typ_96(row, info);
		if(combo == columnDispDtl_col_conv_typ_98) return getDispDtl_col_conv_typ_98(row, info);
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
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_del) doDtlBtn_del(info);
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
	 * [DtlBtn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del(MCEventInfo info);

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
		if (vc == DispDtlTable) return doDispDtl_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_bp_grp_cd1) return doCnd_bp_grp_cd1_VC(info);
		if (vc == Cnd_bp_grp_nm1) return doCnd_bp_grp_nm1_VC(info);
		if (vc == Cnd_bp_grp_cd2) return doCnd_bp_grp_cd2_VC(info);
		if (vc == Cnd_bp_grp_nm2) return doCnd_bp_grp_nm2_VC(info);
		if (vc == Cnd_bp_grp_cd3) return doCnd_bp_grp_cd3_VC(info);
		if (vc == Cnd_bp_grp_nm3) return doCnd_bp_grp_nm3_VC(info);
		if (vc == Cnd_bp_grp_cd4) return doCnd_bp_grp_cd4_VC(info);
		if (vc == Cnd_bp_grp_nm4) return doCnd_bp_grp_nm4_VC(info);
		if (vc == Cnd_bp_grp_cd5) return doCnd_bp_grp_cd5_VC(info);
		if (vc == Cnd_bp_grp_nm5) return doCnd_bp_grp_nm5_VC(info);
		if (vc == Cnd_bp_grp_cd6) return doCnd_bp_grp_cd6_VC(info);
		if (vc == Cnd_bp_grp_nm6) return doCnd_bp_grp_nm6_VC(info);
		if (vc == Cnd_bp_grp_cd7) return doCnd_bp_grp_cd7_VC(info);
		if (vc == Cnd_bp_grp_nm7) return doCnd_bp_grp_nm7_VC(info);
		if (vc == Cnd_bp_grp_cd8) return doCnd_bp_grp_cd8_VC(info);
		if (vc == Cnd_bp_grp_nm8) return doCnd_bp_grp_nm8_VC(info);
		if (vc == Cnd_bp_grp_cd9) return doCnd_bp_grp_cd9_VC(info);
		if (vc == Cnd_bp_grp_nm9) return doCnd_bp_grp_nm9_VC(info);
		if (vc == Cnd_bp_grp_cd10) return doCnd_bp_grp_cd10_VC(info);
		if (vc == Cnd_bp_grp_nm10) return doCnd_bp_grp_nm10_VC(info);
		if (vc == columnDispDtl_check) return doDispDtl_check_VC(info);
		if (vc == columnDispDtl_del_flg) return doDispDtl_del_flg_VC(info);
		if (vc == columnDispDtl_ext_sys_cd) return doDispDtl_ext_sys_cd_VC(info);
		if (vc == columnDispDtl_ext_sys_nm) return doDispDtl_ext_sys_nm_VC(info);
		if (vc == columnDispDtl_bp_cd) return doDispDtl_bp_cd_VC(info);
		if (vc == columnDispDtl_bp_nm) return doDispDtl_bp_nm_VC(info);
		if (vc == columnDispDtl_col_conv_typ_00) return doDispDtl_col_conv_typ_00_VC(info);
		if (vc == columnDispDtl_col_conv_typ_01) return doDispDtl_col_conv_typ_01_VC(info);
		if (vc == columnDispDtl_col_conv_typ_02) return doDispDtl_col_conv_typ_02_VC(info);
		if (vc == columnDispDtl_col_conv_typ_03) return doDispDtl_col_conv_typ_03_VC(info);
		if (vc == columnDispDtl_col_conv_typ_04) return doDispDtl_col_conv_typ_04_VC(info);
		if (vc == columnDispDtl_col_conv_typ_05) return doDispDtl_col_conv_typ_05_VC(info);
		if (vc == columnDispDtl_col_conv_typ_06) return doDispDtl_col_conv_typ_06_VC(info);
		if (vc == columnDispDtl_col_conv_typ_07) return doDispDtl_col_conv_typ_07_VC(info);
		if (vc == columnDispDtl_col_conv_typ_08) return doDispDtl_col_conv_typ_08_VC(info);
		if (vc == columnDispDtl_col_conv_typ_09) return doDispDtl_col_conv_typ_09_VC(info);
		if (vc == columnDispDtl_col_conv_typ_10) return doDispDtl_col_conv_typ_10_VC(info);
		if (vc == columnDispDtl_col_conv_typ_11) return doDispDtl_col_conv_typ_11_VC(info);
		if (vc == columnDispDtl_col_conv_typ_12) return doDispDtl_col_conv_typ_12_VC(info);
		if (vc == columnDispDtl_col_conv_typ_13) return doDispDtl_col_conv_typ_13_VC(info);
		if (vc == columnDispDtl_col_conv_typ_14) return doDispDtl_col_conv_typ_14_VC(info);
		if (vc == columnDispDtl_col_conv_typ_15) return doDispDtl_col_conv_typ_15_VC(info);
		if (vc == columnDispDtl_col_conv_typ_16) return doDispDtl_col_conv_typ_16_VC(info);
		if (vc == columnDispDtl_col_conv_typ_17) return doDispDtl_col_conv_typ_17_VC(info);
		if (vc == columnDispDtl_col_conv_typ_18) return doDispDtl_col_conv_typ_18_VC(info);
		if (vc == columnDispDtl_col_conv_typ_19) return doDispDtl_col_conv_typ_19_VC(info);
		if (vc == columnDispDtl_col_conv_typ_20) return doDispDtl_col_conv_typ_20_VC(info);
		if (vc == columnDispDtl_col_conv_typ_21) return doDispDtl_col_conv_typ_21_VC(info);
		if (vc == columnDispDtl_col_conv_typ_22) return doDispDtl_col_conv_typ_22_VC(info);
		if (vc == columnDispDtl_col_conv_typ_23) return doDispDtl_col_conv_typ_23_VC(info);
		if (vc == columnDispDtl_col_conv_typ_24) return doDispDtl_col_conv_typ_24_VC(info);
		if (vc == columnDispDtl_col_conv_typ_25) return doDispDtl_col_conv_typ_25_VC(info);
		if (vc == columnDispDtl_col_conv_typ_26) return doDispDtl_col_conv_typ_26_VC(info);
		if (vc == columnDispDtl_col_conv_typ_27) return doDispDtl_col_conv_typ_27_VC(info);
		if (vc == columnDispDtl_col_conv_typ_28) return doDispDtl_col_conv_typ_28_VC(info);
		if (vc == columnDispDtl_col_conv_typ_29) return doDispDtl_col_conv_typ_29_VC(info);
		if (vc == columnDispDtl_col_conv_typ_30) return doDispDtl_col_conv_typ_30_VC(info);
		if (vc == columnDispDtl_col_conv_typ_31) return doDispDtl_col_conv_typ_31_VC(info);
		if (vc == columnDispDtl_col_conv_typ_32) return doDispDtl_col_conv_typ_32_VC(info);
		if (vc == columnDispDtl_col_conv_typ_33) return doDispDtl_col_conv_typ_33_VC(info);
		if (vc == columnDispDtl_col_conv_typ_34) return doDispDtl_col_conv_typ_34_VC(info);
		if (vc == columnDispDtl_col_conv_typ_35) return doDispDtl_col_conv_typ_35_VC(info);
		if (vc == columnDispDtl_col_conv_typ_36) return doDispDtl_col_conv_typ_36_VC(info);
		if (vc == columnDispDtl_col_conv_typ_37) return doDispDtl_col_conv_typ_37_VC(info);
		if (vc == columnDispDtl_col_conv_typ_38) return doDispDtl_col_conv_typ_38_VC(info);
		if (vc == columnDispDtl_col_conv_typ_39) return doDispDtl_col_conv_typ_39_VC(info);
		if (vc == columnDispDtl_col_conv_typ_40) return doDispDtl_col_conv_typ_40_VC(info);
		if (vc == columnDispDtl_col_conv_typ_41) return doDispDtl_col_conv_typ_41_VC(info);
		if (vc == columnDispDtl_col_conv_typ_42) return doDispDtl_col_conv_typ_42_VC(info);
		if (vc == columnDispDtl_col_conv_typ_43) return doDispDtl_col_conv_typ_43_VC(info);
		if (vc == columnDispDtl_col_conv_typ_44) return doDispDtl_col_conv_typ_44_VC(info);
		if (vc == columnDispDtl_col_conv_typ_45) return doDispDtl_col_conv_typ_45_VC(info);
		if (vc == columnDispDtl_col_conv_typ_46) return doDispDtl_col_conv_typ_46_VC(info);
		if (vc == columnDispDtl_col_conv_typ_47) return doDispDtl_col_conv_typ_47_VC(info);
		if (vc == columnDispDtl_col_conv_typ_48) return doDispDtl_col_conv_typ_48_VC(info);
		if (vc == columnDispDtl_col_conv_typ_49) return doDispDtl_col_conv_typ_49_VC(info);
		if (vc == columnDispDtl_col_conv_typ_50) return doDispDtl_col_conv_typ_50_VC(info);
		if (vc == columnDispDtl_col_conv_typ_51) return doDispDtl_col_conv_typ_51_VC(info);
		if (vc == columnDispDtl_col_conv_typ_52) return doDispDtl_col_conv_typ_52_VC(info);
		if (vc == columnDispDtl_col_conv_typ_53) return doDispDtl_col_conv_typ_53_VC(info);
		if (vc == columnDispDtl_col_conv_typ_54) return doDispDtl_col_conv_typ_54_VC(info);
		if (vc == columnDispDtl_col_conv_typ_55) return doDispDtl_col_conv_typ_55_VC(info);
		if (vc == columnDispDtl_col_conv_typ_56) return doDispDtl_col_conv_typ_56_VC(info);
		if (vc == columnDispDtl_col_conv_typ_57) return doDispDtl_col_conv_typ_57_VC(info);
		if (vc == columnDispDtl_col_conv_typ_58) return doDispDtl_col_conv_typ_58_VC(info);
		if (vc == columnDispDtl_col_conv_typ_59) return doDispDtl_col_conv_typ_59_VC(info);
		if (vc == columnDispDtl_col_conv_typ_60) return doDispDtl_col_conv_typ_60_VC(info);
		if (vc == columnDispDtl_col_conv_typ_61) return doDispDtl_col_conv_typ_61_VC(info);
		if (vc == columnDispDtl_col_conv_typ_62) return doDispDtl_col_conv_typ_62_VC(info);
		if (vc == columnDispDtl_col_conv_typ_63) return doDispDtl_col_conv_typ_63_VC(info);
		if (vc == columnDispDtl_col_conv_typ_64) return doDispDtl_col_conv_typ_64_VC(info);
		if (vc == columnDispDtl_col_conv_typ_65) return doDispDtl_col_conv_typ_65_VC(info);
		if (vc == columnDispDtl_col_conv_typ_66) return doDispDtl_col_conv_typ_66_VC(info);
		if (vc == columnDispDtl_col_conv_typ_67) return doDispDtl_col_conv_typ_67_VC(info);
		if (vc == columnDispDtl_col_conv_typ_68) return doDispDtl_col_conv_typ_68_VC(info);
		if (vc == columnDispDtl_col_conv_typ_69) return doDispDtl_col_conv_typ_69_VC(info);
		if (vc == columnDispDtl_col_conv_typ_70) return doDispDtl_col_conv_typ_70_VC(info);
		if (vc == columnDispDtl_col_conv_typ_71) return doDispDtl_col_conv_typ_71_VC(info);
		if (vc == columnDispDtl_col_conv_typ_72) return doDispDtl_col_conv_typ_72_VC(info);
		if (vc == columnDispDtl_col_conv_typ_73) return doDispDtl_col_conv_typ_73_VC(info);
		if (vc == columnDispDtl_col_conv_typ_74) return doDispDtl_col_conv_typ_74_VC(info);
		if (vc == columnDispDtl_col_conv_typ_75) return doDispDtl_col_conv_typ_75_VC(info);
		if (vc == columnDispDtl_col_conv_typ_76) return doDispDtl_col_conv_typ_76_VC(info);
		if (vc == columnDispDtl_col_conv_typ_77) return doDispDtl_col_conv_typ_77_VC(info);
		if (vc == columnDispDtl_col_conv_typ_78) return doDispDtl_col_conv_typ_78_VC(info);
		if (vc == columnDispDtl_col_conv_typ_79) return doDispDtl_col_conv_typ_79_VC(info);
		if (vc == columnDispDtl_col_conv_typ_80) return doDispDtl_col_conv_typ_80_VC(info);
		if (vc == columnDispDtl_col_conv_typ_81) return doDispDtl_col_conv_typ_81_VC(info);
		if (vc == columnDispDtl_col_conv_typ_82) return doDispDtl_col_conv_typ_82_VC(info);
		if (vc == columnDispDtl_col_conv_typ_83) return doDispDtl_col_conv_typ_83_VC(info);
		if (vc == columnDispDtl_col_conv_typ_84) return doDispDtl_col_conv_typ_84_VC(info);
		if (vc == columnDispDtl_col_conv_typ_85) return doDispDtl_col_conv_typ_85_VC(info);
		if (vc == columnDispDtl_col_conv_typ_86) return doDispDtl_col_conv_typ_86_VC(info);
		if (vc == columnDispDtl_col_conv_typ_87) return doDispDtl_col_conv_typ_87_VC(info);
		if (vc == columnDispDtl_col_conv_typ_88) return doDispDtl_col_conv_typ_88_VC(info);
		if (vc == columnDispDtl_col_conv_typ_89) return doDispDtl_col_conv_typ_89_VC(info);
		if (vc == columnDispDtl_col_conv_typ_90) return doDispDtl_col_conv_typ_90_VC(info);
		if (vc == columnDispDtl_col_conv_typ_91) return doDispDtl_col_conv_typ_91_VC(info);
		if (vc == columnDispDtl_col_conv_typ_92) return doDispDtl_col_conv_typ_92_VC(info);
		if (vc == columnDispDtl_col_conv_typ_93) return doDispDtl_col_conv_typ_93_VC(info);
		if (vc == columnDispDtl_col_conv_typ_94) return doDispDtl_col_conv_typ_94_VC(info);
		if (vc == columnDispDtl_col_conv_typ_95) return doDispDtl_col_conv_typ_95_VC(info);
		if (vc == columnDispDtl_col_conv_typ_96) return doDispDtl_col_conv_typ_96_VC(info);
		if (vc == columnDispDtl_col_conv_typ_97) return doDispDtl_col_conv_typ_97_VC(info);
		if (vc == columnDispDtl_col_conv_typ_98) return doDispDtl_col_conv_typ_98_VC(info);
		if (vc == columnDispDtl_col_conv_typ_99) return doDispDtl_col_conv_typ_99_VC(info);
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
	 * [DispDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_32]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_32_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_33]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_33_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_34]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_34_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_35]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_35_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_36]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_36_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_37]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_37_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_38]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_38_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_39]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_39_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_40]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_40_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_41]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_41_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_42]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_42_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_43]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_43_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_44]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_44_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_45]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_45_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_46]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_46_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_47]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_47_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_48]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_48_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_49]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_49_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_50]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_50_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_51]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_51_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_52]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_52_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_53]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_53_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_54]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_54_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_55]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_55_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_56]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_56_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_57]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_57_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_58]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_58_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_59]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_59_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_60]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_60_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_61]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_61_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_62]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_62_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_63]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_63_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_64]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_64_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_65]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_65_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_66]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_66_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_67]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_67_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_68]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_68_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_69]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_69_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_70]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_70_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_71]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_71_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_72]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_72_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_73]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_73_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_74]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_74_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_75]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_75_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_76]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_76_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_77]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_77_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_78]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_78_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_79]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_79_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_80]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_80_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_81]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_81_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_82]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_82_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_83]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_83_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_84]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_84_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_85]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_85_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_86]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_86_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_87]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_87_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_88]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_88_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_89]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_89_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_90]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_90_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_91]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_91_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_92]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_92_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_93]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_93_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_94]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_94_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_95]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_95_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_96]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_96_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_97]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_97_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_98]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_98_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_99]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_col_conv_typ_99_VC(MCEventInfo info){
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
		else if (nc == DispDtlTable) doDispDtl_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NC(info);
		else if (nc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NC(info);
		else if (nc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NC(info);
		else if (nc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NC(info);
		else if (nc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NC(info);
		else if (nc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NC(info);
		else if (nc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NC(info);
		else if (nc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NC(info);
		else if (nc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NC(info);
		else if (nc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NC(info);
		else if (nc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NC(info);
		else if (nc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NC(info);
		else if (nc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NC(info);
		else if (nc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NC(info);
		else if (nc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NC(info);
		else if (nc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NC(info);
		else if (nc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NC(info);
		else if (nc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NC(info);
		else if (nc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NC(info);
		else if (nc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NC(info);
		else if (nc == columnDispDtl_check) doDispDtl_check_NC(info);
		else if (nc == columnDispDtl_del_flg) doDispDtl_del_flg_NC(info);
		else if (nc == columnDispDtl_ext_sys_cd) doDispDtl_ext_sys_cd_NC(info);
		else if (nc == columnDispDtl_ext_sys_nm) doDispDtl_ext_sys_nm_NC(info);
		else if (nc == columnDispDtl_bp_cd) doDispDtl_bp_cd_NC(info);
		else if (nc == columnDispDtl_bp_nm) doDispDtl_bp_nm_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_00) doDispDtl_col_conv_typ_00_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_01) doDispDtl_col_conv_typ_01_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_02) doDispDtl_col_conv_typ_02_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_03) doDispDtl_col_conv_typ_03_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_04) doDispDtl_col_conv_typ_04_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_05) doDispDtl_col_conv_typ_05_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_06) doDispDtl_col_conv_typ_06_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_07) doDispDtl_col_conv_typ_07_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_08) doDispDtl_col_conv_typ_08_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_09) doDispDtl_col_conv_typ_09_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_10) doDispDtl_col_conv_typ_10_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_11) doDispDtl_col_conv_typ_11_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_12) doDispDtl_col_conv_typ_12_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_13) doDispDtl_col_conv_typ_13_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_14) doDispDtl_col_conv_typ_14_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_15) doDispDtl_col_conv_typ_15_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_16) doDispDtl_col_conv_typ_16_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_17) doDispDtl_col_conv_typ_17_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_18) doDispDtl_col_conv_typ_18_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_19) doDispDtl_col_conv_typ_19_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_20) doDispDtl_col_conv_typ_20_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_21) doDispDtl_col_conv_typ_21_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_22) doDispDtl_col_conv_typ_22_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_23) doDispDtl_col_conv_typ_23_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_24) doDispDtl_col_conv_typ_24_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_25) doDispDtl_col_conv_typ_25_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_26) doDispDtl_col_conv_typ_26_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_27) doDispDtl_col_conv_typ_27_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_28) doDispDtl_col_conv_typ_28_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_29) doDispDtl_col_conv_typ_29_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_30) doDispDtl_col_conv_typ_30_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_31) doDispDtl_col_conv_typ_31_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_32) doDispDtl_col_conv_typ_32_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_33) doDispDtl_col_conv_typ_33_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_34) doDispDtl_col_conv_typ_34_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_35) doDispDtl_col_conv_typ_35_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_36) doDispDtl_col_conv_typ_36_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_37) doDispDtl_col_conv_typ_37_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_38) doDispDtl_col_conv_typ_38_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_39) doDispDtl_col_conv_typ_39_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_40) doDispDtl_col_conv_typ_40_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_41) doDispDtl_col_conv_typ_41_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_42) doDispDtl_col_conv_typ_42_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_43) doDispDtl_col_conv_typ_43_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_44) doDispDtl_col_conv_typ_44_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_45) doDispDtl_col_conv_typ_45_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_46) doDispDtl_col_conv_typ_46_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_47) doDispDtl_col_conv_typ_47_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_48) doDispDtl_col_conv_typ_48_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_49) doDispDtl_col_conv_typ_49_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_50) doDispDtl_col_conv_typ_50_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_51) doDispDtl_col_conv_typ_51_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_52) doDispDtl_col_conv_typ_52_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_53) doDispDtl_col_conv_typ_53_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_54) doDispDtl_col_conv_typ_54_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_55) doDispDtl_col_conv_typ_55_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_56) doDispDtl_col_conv_typ_56_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_57) doDispDtl_col_conv_typ_57_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_58) doDispDtl_col_conv_typ_58_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_59) doDispDtl_col_conv_typ_59_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_60) doDispDtl_col_conv_typ_60_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_61) doDispDtl_col_conv_typ_61_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_62) doDispDtl_col_conv_typ_62_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_63) doDispDtl_col_conv_typ_63_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_64) doDispDtl_col_conv_typ_64_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_65) doDispDtl_col_conv_typ_65_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_66) doDispDtl_col_conv_typ_66_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_67) doDispDtl_col_conv_typ_67_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_68) doDispDtl_col_conv_typ_68_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_69) doDispDtl_col_conv_typ_69_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_70) doDispDtl_col_conv_typ_70_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_71) doDispDtl_col_conv_typ_71_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_72) doDispDtl_col_conv_typ_72_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_73) doDispDtl_col_conv_typ_73_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_74) doDispDtl_col_conv_typ_74_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_75) doDispDtl_col_conv_typ_75_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_76) doDispDtl_col_conv_typ_76_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_77) doDispDtl_col_conv_typ_77_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_78) doDispDtl_col_conv_typ_78_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_79) doDispDtl_col_conv_typ_79_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_80) doDispDtl_col_conv_typ_80_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_81) doDispDtl_col_conv_typ_81_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_82) doDispDtl_col_conv_typ_82_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_83) doDispDtl_col_conv_typ_83_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_84) doDispDtl_col_conv_typ_84_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_85) doDispDtl_col_conv_typ_85_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_86) doDispDtl_col_conv_typ_86_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_87) doDispDtl_col_conv_typ_87_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_88) doDispDtl_col_conv_typ_88_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_89) doDispDtl_col_conv_typ_89_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_90) doDispDtl_col_conv_typ_90_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_91) doDispDtl_col_conv_typ_91_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_92) doDispDtl_col_conv_typ_92_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_93) doDispDtl_col_conv_typ_93_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_94) doDispDtl_col_conv_typ_94_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_95) doDispDtl_col_conv_typ_95_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_96) doDispDtl_col_conv_typ_96_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_97) doDispDtl_col_conv_typ_97_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_98) doDispDtl_col_conv_typ_98_NC(info);
		else if (nc == columnDispDtl_col_conv_typ_99) doDispDtl_col_conv_typ_99_NC(info);
	}

	/**
	 * [CndTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_00_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_01_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_02_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_03_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_04_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_05_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_06_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_07_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_08_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_09_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_10_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_11_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_12_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_13_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_14_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_15_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_16_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_17_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_18_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_19_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_20_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_21_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_22_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_23_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_24_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_25_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_26_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_27_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_28_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_29_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_30_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_31_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_32]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_32_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_33]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_33_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_34]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_34_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_35]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_35_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_36]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_36_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_37]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_37_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_38]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_38_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_39]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_39_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_40]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_40_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_41]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_41_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_42]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_42_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_43]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_43_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_44]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_44_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_45]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_45_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_46]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_46_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_47]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_47_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_48]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_48_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_49]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_49_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_50]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_50_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_51]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_51_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_52]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_52_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_53]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_53_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_54]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_54_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_55]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_55_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_56]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_56_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_57]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_57_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_58]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_58_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_59]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_59_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_60]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_60_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_61]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_61_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_62]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_62_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_63]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_63_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_64]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_64_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_65]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_65_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_66]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_66_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_67]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_67_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_68]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_68_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_69]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_69_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_70]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_70_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_71]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_71_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_72]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_72_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_73]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_73_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_74]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_74_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_75]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_75_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_76]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_76_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_77]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_77_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_78]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_78_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_79]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_79_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_80]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_80_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_81]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_81_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_82]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_82_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_83]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_83_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_84]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_84_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_85]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_85_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_86]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_86_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_87]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_87_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_88]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_88_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_89]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_89_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_90]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_90_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_91]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_91_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_92]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_92_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_93]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_93_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_94]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_94_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_95]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_95_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_96]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_96_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_97]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_97_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_98]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_98_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_99]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_99_NC(MCEventInfo info){
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
		else if (ne == DispDtlTable) doDispDtl_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NE(info);
		else if (ne == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NE(info);
		else if (ne == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NE(info);
		else if (ne == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NE(info);
		else if (ne == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NE(info);
		else if (ne == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NE(info);
		else if (ne == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NE(info);
		else if (ne == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NE(info);
		else if (ne == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NE(info);
		else if (ne == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NE(info);
		else if (ne == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NE(info);
		else if (ne == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NE(info);
		else if (ne == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NE(info);
		else if (ne == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NE(info);
		else if (ne == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NE(info);
		else if (ne == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NE(info);
		else if (ne == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NE(info);
		else if (ne == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NE(info);
		else if (ne == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NE(info);
		else if (ne == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NE(info);
		else if (ne == columnDispDtl_check) doDispDtl_check_NE(info);
		else if (ne == columnDispDtl_del_flg) doDispDtl_del_flg_NE(info);
		else if (ne == columnDispDtl_ext_sys_cd) doDispDtl_ext_sys_cd_NE(info);
		else if (ne == columnDispDtl_ext_sys_nm) doDispDtl_ext_sys_nm_NE(info);
		else if (ne == columnDispDtl_bp_cd) doDispDtl_bp_cd_NE(info);
		else if (ne == columnDispDtl_bp_nm) doDispDtl_bp_nm_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_00) doDispDtl_col_conv_typ_00_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_01) doDispDtl_col_conv_typ_01_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_02) doDispDtl_col_conv_typ_02_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_03) doDispDtl_col_conv_typ_03_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_04) doDispDtl_col_conv_typ_04_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_05) doDispDtl_col_conv_typ_05_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_06) doDispDtl_col_conv_typ_06_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_07) doDispDtl_col_conv_typ_07_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_08) doDispDtl_col_conv_typ_08_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_09) doDispDtl_col_conv_typ_09_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_10) doDispDtl_col_conv_typ_10_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_11) doDispDtl_col_conv_typ_11_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_12) doDispDtl_col_conv_typ_12_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_13) doDispDtl_col_conv_typ_13_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_14) doDispDtl_col_conv_typ_14_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_15) doDispDtl_col_conv_typ_15_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_16) doDispDtl_col_conv_typ_16_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_17) doDispDtl_col_conv_typ_17_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_18) doDispDtl_col_conv_typ_18_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_19) doDispDtl_col_conv_typ_19_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_20) doDispDtl_col_conv_typ_20_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_21) doDispDtl_col_conv_typ_21_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_22) doDispDtl_col_conv_typ_22_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_23) doDispDtl_col_conv_typ_23_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_24) doDispDtl_col_conv_typ_24_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_25) doDispDtl_col_conv_typ_25_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_26) doDispDtl_col_conv_typ_26_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_27) doDispDtl_col_conv_typ_27_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_28) doDispDtl_col_conv_typ_28_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_29) doDispDtl_col_conv_typ_29_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_30) doDispDtl_col_conv_typ_30_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_31) doDispDtl_col_conv_typ_31_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_32) doDispDtl_col_conv_typ_32_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_33) doDispDtl_col_conv_typ_33_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_34) doDispDtl_col_conv_typ_34_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_35) doDispDtl_col_conv_typ_35_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_36) doDispDtl_col_conv_typ_36_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_37) doDispDtl_col_conv_typ_37_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_38) doDispDtl_col_conv_typ_38_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_39) doDispDtl_col_conv_typ_39_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_40) doDispDtl_col_conv_typ_40_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_41) doDispDtl_col_conv_typ_41_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_42) doDispDtl_col_conv_typ_42_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_43) doDispDtl_col_conv_typ_43_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_44) doDispDtl_col_conv_typ_44_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_45) doDispDtl_col_conv_typ_45_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_46) doDispDtl_col_conv_typ_46_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_47) doDispDtl_col_conv_typ_47_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_48) doDispDtl_col_conv_typ_48_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_49) doDispDtl_col_conv_typ_49_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_50) doDispDtl_col_conv_typ_50_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_51) doDispDtl_col_conv_typ_51_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_52) doDispDtl_col_conv_typ_52_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_53) doDispDtl_col_conv_typ_53_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_54) doDispDtl_col_conv_typ_54_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_55) doDispDtl_col_conv_typ_55_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_56) doDispDtl_col_conv_typ_56_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_57) doDispDtl_col_conv_typ_57_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_58) doDispDtl_col_conv_typ_58_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_59) doDispDtl_col_conv_typ_59_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_60) doDispDtl_col_conv_typ_60_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_61) doDispDtl_col_conv_typ_61_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_62) doDispDtl_col_conv_typ_62_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_63) doDispDtl_col_conv_typ_63_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_64) doDispDtl_col_conv_typ_64_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_65) doDispDtl_col_conv_typ_65_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_66) doDispDtl_col_conv_typ_66_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_67) doDispDtl_col_conv_typ_67_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_68) doDispDtl_col_conv_typ_68_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_69) doDispDtl_col_conv_typ_69_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_70) doDispDtl_col_conv_typ_70_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_71) doDispDtl_col_conv_typ_71_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_72) doDispDtl_col_conv_typ_72_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_73) doDispDtl_col_conv_typ_73_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_74) doDispDtl_col_conv_typ_74_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_75) doDispDtl_col_conv_typ_75_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_76) doDispDtl_col_conv_typ_76_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_77) doDispDtl_col_conv_typ_77_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_78) doDispDtl_col_conv_typ_78_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_79) doDispDtl_col_conv_typ_79_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_80) doDispDtl_col_conv_typ_80_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_81) doDispDtl_col_conv_typ_81_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_82) doDispDtl_col_conv_typ_82_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_83) doDispDtl_col_conv_typ_83_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_84) doDispDtl_col_conv_typ_84_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_85) doDispDtl_col_conv_typ_85_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_86) doDispDtl_col_conv_typ_86_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_87) doDispDtl_col_conv_typ_87_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_88) doDispDtl_col_conv_typ_88_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_89) doDispDtl_col_conv_typ_89_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_90) doDispDtl_col_conv_typ_90_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_91) doDispDtl_col_conv_typ_91_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_92) doDispDtl_col_conv_typ_92_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_93) doDispDtl_col_conv_typ_93_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_94) doDispDtl_col_conv_typ_94_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_95) doDispDtl_col_conv_typ_95_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_96) doDispDtl_col_conv_typ_96_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_97) doDispDtl_col_conv_typ_97_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_98) doDispDtl_col_conv_typ_98_NE(info);
		else if (ne == columnDispDtl_col_conv_typ_99) doDispDtl_col_conv_typ_99_NE(info);
	}

	/**
	 * [CndTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_00_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_01_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_02_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_03_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_04_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_05_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_06_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_07_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_08_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_09_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_10_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_11_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_12_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_13_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_14_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_15_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_16_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_17_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_18_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_19_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_20_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_21_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_22_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_23_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_24_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_25_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_26_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_27_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_28_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_29_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_30_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_31_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_32]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_32_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_33]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_33_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_34]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_34_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_35]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_35_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_36]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_36_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_37]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_37_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_38]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_38_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_39]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_39_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_40]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_40_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_41]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_41_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_42]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_42_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_43]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_43_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_44]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_44_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_45]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_45_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_46]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_46_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_47]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_47_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_48]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_48_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_49]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_49_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_50]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_50_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_51]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_51_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_52]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_52_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_53]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_53_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_54]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_54_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_55]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_55_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_56]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_56_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_57]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_57_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_58]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_58_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_59]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_59_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_60]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_60_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_61]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_61_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_62]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_62_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_63]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_63_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_64]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_64_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_65]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_65_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_66]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_66_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_67]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_67_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_68]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_68_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_69]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_69_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_70]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_70_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_71]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_71_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_72]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_72_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_73]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_73_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_74]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_74_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_75]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_75_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_76]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_76_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_77]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_77_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_78]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_78_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_79]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_79_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_80]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_80_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_81]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_81_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_82]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_82_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_83]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_83_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_84]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_84_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_85]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_85_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_86]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_86_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_87]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_87_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_88]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_88_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_89]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_89_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_90]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_90_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_91]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_91_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_92]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_92_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_93]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_93_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_94]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_94_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_95]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_95_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_96]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_96_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_97]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_97_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_98]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_98_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_99]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_99_NE(MCEventInfo info){
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
		else if (nx == DispDtlTable) doDispDtl_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NX(info);
		else if (nx == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NX(info);
		else if (nx == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NX(info);
		else if (nx == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NX(info);
		else if (nx == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NX(info);
		else if (nx == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NX(info);
		else if (nx == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NX(info);
		else if (nx == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NX(info);
		else if (nx == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NX(info);
		else if (nx == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NX(info);
		else if (nx == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NX(info);
		else if (nx == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NX(info);
		else if (nx == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NX(info);
		else if (nx == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NX(info);
		else if (nx == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NX(info);
		else if (nx == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NX(info);
		else if (nx == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NX(info);
		else if (nx == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NX(info);
		else if (nx == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NX(info);
		else if (nx == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NX(info);
		else if (nx == columnDispDtl_check) doDispDtl_check_NX(info);
		else if (nx == columnDispDtl_del_flg) doDispDtl_del_flg_NX(info);
		else if (nx == columnDispDtl_ext_sys_cd) doDispDtl_ext_sys_cd_NX(info);
		else if (nx == columnDispDtl_ext_sys_nm) doDispDtl_ext_sys_nm_NX(info);
		else if (nx == columnDispDtl_bp_cd) doDispDtl_bp_cd_NX(info);
		else if (nx == columnDispDtl_bp_nm) doDispDtl_bp_nm_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_00) doDispDtl_col_conv_typ_00_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_01) doDispDtl_col_conv_typ_01_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_02) doDispDtl_col_conv_typ_02_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_03) doDispDtl_col_conv_typ_03_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_04) doDispDtl_col_conv_typ_04_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_05) doDispDtl_col_conv_typ_05_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_06) doDispDtl_col_conv_typ_06_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_07) doDispDtl_col_conv_typ_07_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_08) doDispDtl_col_conv_typ_08_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_09) doDispDtl_col_conv_typ_09_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_10) doDispDtl_col_conv_typ_10_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_11) doDispDtl_col_conv_typ_11_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_12) doDispDtl_col_conv_typ_12_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_13) doDispDtl_col_conv_typ_13_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_14) doDispDtl_col_conv_typ_14_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_15) doDispDtl_col_conv_typ_15_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_16) doDispDtl_col_conv_typ_16_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_17) doDispDtl_col_conv_typ_17_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_18) doDispDtl_col_conv_typ_18_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_19) doDispDtl_col_conv_typ_19_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_20) doDispDtl_col_conv_typ_20_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_21) doDispDtl_col_conv_typ_21_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_22) doDispDtl_col_conv_typ_22_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_23) doDispDtl_col_conv_typ_23_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_24) doDispDtl_col_conv_typ_24_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_25) doDispDtl_col_conv_typ_25_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_26) doDispDtl_col_conv_typ_26_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_27) doDispDtl_col_conv_typ_27_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_28) doDispDtl_col_conv_typ_28_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_29) doDispDtl_col_conv_typ_29_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_30) doDispDtl_col_conv_typ_30_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_31) doDispDtl_col_conv_typ_31_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_32) doDispDtl_col_conv_typ_32_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_33) doDispDtl_col_conv_typ_33_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_34) doDispDtl_col_conv_typ_34_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_35) doDispDtl_col_conv_typ_35_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_36) doDispDtl_col_conv_typ_36_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_37) doDispDtl_col_conv_typ_37_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_38) doDispDtl_col_conv_typ_38_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_39) doDispDtl_col_conv_typ_39_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_40) doDispDtl_col_conv_typ_40_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_41) doDispDtl_col_conv_typ_41_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_42) doDispDtl_col_conv_typ_42_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_43) doDispDtl_col_conv_typ_43_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_44) doDispDtl_col_conv_typ_44_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_45) doDispDtl_col_conv_typ_45_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_46) doDispDtl_col_conv_typ_46_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_47) doDispDtl_col_conv_typ_47_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_48) doDispDtl_col_conv_typ_48_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_49) doDispDtl_col_conv_typ_49_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_50) doDispDtl_col_conv_typ_50_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_51) doDispDtl_col_conv_typ_51_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_52) doDispDtl_col_conv_typ_52_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_53) doDispDtl_col_conv_typ_53_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_54) doDispDtl_col_conv_typ_54_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_55) doDispDtl_col_conv_typ_55_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_56) doDispDtl_col_conv_typ_56_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_57) doDispDtl_col_conv_typ_57_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_58) doDispDtl_col_conv_typ_58_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_59) doDispDtl_col_conv_typ_59_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_60) doDispDtl_col_conv_typ_60_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_61) doDispDtl_col_conv_typ_61_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_62) doDispDtl_col_conv_typ_62_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_63) doDispDtl_col_conv_typ_63_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_64) doDispDtl_col_conv_typ_64_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_65) doDispDtl_col_conv_typ_65_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_66) doDispDtl_col_conv_typ_66_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_67) doDispDtl_col_conv_typ_67_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_68) doDispDtl_col_conv_typ_68_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_69) doDispDtl_col_conv_typ_69_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_70) doDispDtl_col_conv_typ_70_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_71) doDispDtl_col_conv_typ_71_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_72) doDispDtl_col_conv_typ_72_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_73) doDispDtl_col_conv_typ_73_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_74) doDispDtl_col_conv_typ_74_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_75) doDispDtl_col_conv_typ_75_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_76) doDispDtl_col_conv_typ_76_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_77) doDispDtl_col_conv_typ_77_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_78) doDispDtl_col_conv_typ_78_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_79) doDispDtl_col_conv_typ_79_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_80) doDispDtl_col_conv_typ_80_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_81) doDispDtl_col_conv_typ_81_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_82) doDispDtl_col_conv_typ_82_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_83) doDispDtl_col_conv_typ_83_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_84) doDispDtl_col_conv_typ_84_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_85) doDispDtl_col_conv_typ_85_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_86) doDispDtl_col_conv_typ_86_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_87) doDispDtl_col_conv_typ_87_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_88) doDispDtl_col_conv_typ_88_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_89) doDispDtl_col_conv_typ_89_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_90) doDispDtl_col_conv_typ_90_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_91) doDispDtl_col_conv_typ_91_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_92) doDispDtl_col_conv_typ_92_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_93) doDispDtl_col_conv_typ_93_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_94) doDispDtl_col_conv_typ_94_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_95) doDispDtl_col_conv_typ_95_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_96) doDispDtl_col_conv_typ_96_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_97) doDispDtl_col_conv_typ_97_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_98) doDispDtl_col_conv_typ_98_NX(info);
		else if (nx == columnDispDtl_col_conv_typ_99) doDispDtl_col_conv_typ_99_NX(info);
	}

	/**
	 * [CndTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_00_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_01_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_02_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_03_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_04_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_05_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_06_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_07_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_08_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_09_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_10_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_11_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_12_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_13_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_14_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_15_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_16_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_17_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_18_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_19_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_20_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_21_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_22_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_23_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_24_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_25_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_26_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_27_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_28_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_29_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_30_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_31_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_32]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_32_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_33]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_33_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_34]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_34_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_35]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_35_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_36]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_36_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_37]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_37_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_38]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_38_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_39]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_39_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_40]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_40_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_41]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_41_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_42]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_42_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_43]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_43_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_44]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_44_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_45]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_45_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_46]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_46_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_47]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_47_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_48]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_48_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_49]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_49_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_50]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_50_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_51]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_51_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_52]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_52_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_53]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_53_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_54]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_54_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_55]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_55_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_56]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_56_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_57]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_57_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_58]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_58_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_59]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_59_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_60]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_60_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_61]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_61_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_62]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_62_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_63]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_63_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_64]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_64_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_65]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_65_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_66]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_66_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_67]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_67_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_68]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_68_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_69]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_69_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_70]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_70_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_71]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_71_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_72]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_72_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_73]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_73_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_74]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_74_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_75]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_75_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_76]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_76_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_77]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_77_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_78]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_78_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_79]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_79_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_80]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_80_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_81]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_81_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_82]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_82_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_83]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_83_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_84]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_84_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_85]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_85_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_86]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_86_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_87]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_87_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_88]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_88_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_89]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_89_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_90]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_90_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_91]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_91_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_92]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_92_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_93]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_93_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_94]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_94_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_95]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_95_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_96]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_96_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_97]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_97_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_98]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_98_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_99]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_99_NX(MCEventInfo info){
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
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_LC(info);
		else if (lc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_LC(info);
		else if (lc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_LC(info);
		else if (lc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_LC(info);
		else if (lc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_LC(info);
		else if (lc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_LC(info);
		else if (lc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_LC(info);
		else if (lc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_LC(info);
		else if (lc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_LC(info);
		else if (lc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_LC(info);
		else if (lc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_LC(info);
		else if (lc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_LC(info);
		else if (lc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_LC(info);
		else if (lc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_LC(info);
		else if (lc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_LC(info);
		else if (lc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_LC(info);
		else if (lc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_LC(info);
		else if (lc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_LC(info);
		else if (lc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_LC(info);
		else if (lc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_LC(info);
		else if (lc == columnDispDtl_ext_sys_cd) doDispDtl_ext_sys_cd_LC(info);
		else if (lc == columnDispDtl_ext_sys_nm) doDispDtl_ext_sys_nm_LC(info);
		else if (lc == columnDispDtl_bp_cd) doDispDtl_bp_cd_LC(info);
		else if (lc == columnDispDtl_bp_nm) doDispDtl_bp_nm_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_00) doDispDtl_col_conv_typ_00_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_01) doDispDtl_col_conv_typ_01_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_02) doDispDtl_col_conv_typ_02_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_03) doDispDtl_col_conv_typ_03_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_04) doDispDtl_col_conv_typ_04_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_05) doDispDtl_col_conv_typ_05_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_06) doDispDtl_col_conv_typ_06_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_07) doDispDtl_col_conv_typ_07_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_08) doDispDtl_col_conv_typ_08_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_09) doDispDtl_col_conv_typ_09_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_10) doDispDtl_col_conv_typ_10_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_11) doDispDtl_col_conv_typ_11_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_12) doDispDtl_col_conv_typ_12_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_13) doDispDtl_col_conv_typ_13_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_14) doDispDtl_col_conv_typ_14_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_15) doDispDtl_col_conv_typ_15_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_16) doDispDtl_col_conv_typ_16_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_17) doDispDtl_col_conv_typ_17_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_18) doDispDtl_col_conv_typ_18_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_19) doDispDtl_col_conv_typ_19_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_20) doDispDtl_col_conv_typ_20_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_21) doDispDtl_col_conv_typ_21_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_22) doDispDtl_col_conv_typ_22_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_23) doDispDtl_col_conv_typ_23_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_24) doDispDtl_col_conv_typ_24_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_25) doDispDtl_col_conv_typ_25_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_26) doDispDtl_col_conv_typ_26_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_27) doDispDtl_col_conv_typ_27_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_28) doDispDtl_col_conv_typ_28_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_29) doDispDtl_col_conv_typ_29_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_30) doDispDtl_col_conv_typ_30_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_31) doDispDtl_col_conv_typ_31_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_32) doDispDtl_col_conv_typ_32_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_33) doDispDtl_col_conv_typ_33_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_34) doDispDtl_col_conv_typ_34_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_35) doDispDtl_col_conv_typ_35_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_36) doDispDtl_col_conv_typ_36_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_37) doDispDtl_col_conv_typ_37_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_38) doDispDtl_col_conv_typ_38_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_39) doDispDtl_col_conv_typ_39_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_40) doDispDtl_col_conv_typ_40_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_41) doDispDtl_col_conv_typ_41_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_42) doDispDtl_col_conv_typ_42_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_43) doDispDtl_col_conv_typ_43_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_44) doDispDtl_col_conv_typ_44_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_45) doDispDtl_col_conv_typ_45_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_46) doDispDtl_col_conv_typ_46_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_47) doDispDtl_col_conv_typ_47_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_48) doDispDtl_col_conv_typ_48_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_49) doDispDtl_col_conv_typ_49_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_50) doDispDtl_col_conv_typ_50_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_51) doDispDtl_col_conv_typ_51_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_52) doDispDtl_col_conv_typ_52_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_53) doDispDtl_col_conv_typ_53_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_54) doDispDtl_col_conv_typ_54_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_55) doDispDtl_col_conv_typ_55_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_56) doDispDtl_col_conv_typ_56_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_57) doDispDtl_col_conv_typ_57_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_58) doDispDtl_col_conv_typ_58_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_59) doDispDtl_col_conv_typ_59_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_60) doDispDtl_col_conv_typ_60_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_61) doDispDtl_col_conv_typ_61_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_62) doDispDtl_col_conv_typ_62_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_63) doDispDtl_col_conv_typ_63_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_64) doDispDtl_col_conv_typ_64_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_65) doDispDtl_col_conv_typ_65_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_66) doDispDtl_col_conv_typ_66_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_67) doDispDtl_col_conv_typ_67_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_68) doDispDtl_col_conv_typ_68_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_69) doDispDtl_col_conv_typ_69_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_70) doDispDtl_col_conv_typ_70_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_71) doDispDtl_col_conv_typ_71_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_72) doDispDtl_col_conv_typ_72_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_73) doDispDtl_col_conv_typ_73_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_74) doDispDtl_col_conv_typ_74_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_75) doDispDtl_col_conv_typ_75_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_76) doDispDtl_col_conv_typ_76_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_77) doDispDtl_col_conv_typ_77_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_78) doDispDtl_col_conv_typ_78_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_79) doDispDtl_col_conv_typ_79_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_80) doDispDtl_col_conv_typ_80_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_81) doDispDtl_col_conv_typ_81_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_82) doDispDtl_col_conv_typ_82_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_83) doDispDtl_col_conv_typ_83_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_84) doDispDtl_col_conv_typ_84_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_85) doDispDtl_col_conv_typ_85_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_86) doDispDtl_col_conv_typ_86_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_87) doDispDtl_col_conv_typ_87_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_88) doDispDtl_col_conv_typ_88_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_89) doDispDtl_col_conv_typ_89_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_90) doDispDtl_col_conv_typ_90_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_91) doDispDtl_col_conv_typ_91_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_92) doDispDtl_col_conv_typ_92_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_93) doDispDtl_col_conv_typ_93_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_94) doDispDtl_col_conv_typ_94_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_95) doDispDtl_col_conv_typ_95_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_96) doDispDtl_col_conv_typ_96_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_97) doDispDtl_col_conv_typ_97_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_98) doDispDtl_col_conv_typ_98_LC(info);
		else if (lc == columnDispDtl_col_conv_typ_99) doDispDtl_col_conv_typ_99_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_00_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_01_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_02_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_03_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_04_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_05_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_06_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_07_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_08_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_09_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_10_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_11_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_12_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_13_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_14_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_15_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_16_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_17_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_18_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_19_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_20_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_21_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_22_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_23_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_24_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_25_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_26_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_27_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_28_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_29_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_30_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_31_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_32]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_32_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_33]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_33_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_34]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_34_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_35]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_35_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_36]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_36_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_37]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_37_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_38]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_38_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_39]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_39_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_40]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_40_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_41]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_41_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_42]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_42_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_43]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_43_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_44]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_44_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_45]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_45_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_46]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_46_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_47]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_47_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_48]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_48_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_49]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_49_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_50]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_50_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_51]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_51_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_52]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_52_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_53]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_53_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_54]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_54_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_55]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_55_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_56]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_56_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_57]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_57_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_58]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_58_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_59]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_59_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_60]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_60_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_61]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_61_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_62]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_62_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_63]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_63_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_64]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_64_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_65]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_65_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_66]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_66_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_67]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_67_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_68]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_68_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_69]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_69_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_70]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_70_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_71]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_71_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_72]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_72_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_73]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_73_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_74]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_74_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_75]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_75_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_76]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_76_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_77]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_77_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_78]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_78_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_79]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_79_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_80]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_80_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_81]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_81_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_82]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_82_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_83]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_83_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_84]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_84_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_85]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_85_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_86]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_86_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_87]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_87_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_88]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_88_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_89]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_89_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_90]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_90_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_91]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_91_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_92]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_92_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_93]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_93_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_94]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_94_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_95]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_95_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_96]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_96_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_97]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_97_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_98]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_98_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[col_conv_typ_99]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_col_conv_typ_99_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ext_sys_cd]の作成メソッド
	 */
	public MCList getCnd_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_ext_sys_cd]の作成メソッド
	 */
	public MCList getDispDtl_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_bp_cd]の作成メソッド
	 */
	public MCList getDispDtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_00]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_00(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_02]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_02(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_04]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_04(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_06]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_06(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_08]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_08(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_10]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_12]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_12(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_14]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_14(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_16]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_16(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_18]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_18(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_20]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_20(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_22]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_22(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_24]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_24(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_26]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_26(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_28]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_28(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_30]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_30(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_32]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_32(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_34]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_34(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_36]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_36(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_38]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_38(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_40]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_40(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_42]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_42(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_44]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_44(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_46]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_46(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_48]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_48(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_50]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_50(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_52]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_52(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_54]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_54(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_56]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_56(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_58]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_58(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_60]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_60(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_62]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_62(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_64]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_64(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_66]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_66(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_68]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_68(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_70]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_70(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_72]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_72(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_74]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_74(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_76]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_76(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_78]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_78(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_80]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_80(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_82]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_82(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_84]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_84(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_86]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_86(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_88]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_88(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_90]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_90(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_92]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_92(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_94]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_94(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_96]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_96(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_col_conv_typ_98]の作成メソッド
	 */
	public MCList getDispDtl_col_conv_typ_98(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getColConvTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1510.Srch01")) {
			return new MA_MABCL1510_Srch01Bridge();
		}
		if (id.equals("MA.MABCL1510.Upd01")) {
			return new MA_MABCL1510_Upd01Bridge();
		}
		if (id.equals("MA.MABCL1510.Del01")) {
			return new MA_MABCL1510_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1510_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1510_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1510_Srch01Bridge() {
			p_MA_MABCL1510_Srch01 = new MCParam(PDef.MA_MABCL1510_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1510_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1510.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1510.DtlR.class));

			p_MA_MABCL1510_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1510_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1510_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1510_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1510_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1510.CndR up0() {
			return (mcframe.clientMABC.MABCP1510.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1510.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1510.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL1510_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1510.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1510_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP1510.DtlR>)p_MA_MABCL1510_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL1510_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1510_Upd01;

		/** コンストラクタ */
		protected MA_MABCL1510_Upd01Bridge() {
			p_MA_MABCL1510_Upd01 = new MCParam(PDef.MA_MABCL1510_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1510_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1510.DtlR.class));
			// Down

			p_MA_MABCL1510_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1510_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1510_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1510_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1510_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1510.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1510.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1510_Upd01;
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
	 * [MA_MABCL1510_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1510_Del01;

		/** コンストラクタ */
		protected MA_MABCL1510_Del01Bridge() {
			p_MA_MABCL1510_Del01 = new MCParam(PDef.MA_MABCL1510_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1510_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1510.DtlR.class));
			// Down

			p_MA_MABCL1510_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1510_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1510_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1510_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1510_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1510.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1510.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1510_Del01;
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