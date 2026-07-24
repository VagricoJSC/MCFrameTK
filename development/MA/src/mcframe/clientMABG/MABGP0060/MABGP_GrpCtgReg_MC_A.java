package mcframe.clientMABG.MABGP0060;

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
import mcframe.clientMABG.MABGP0060.MABGP_GrpCtgReg_MC.MA_MABGL0060_Srch01Caller;
import mcframe.clientMABG.MABGP0060.MABGP_GrpCtgReg_MC.MA_MABGL0060_Upd01Caller;
import mcframe.clientMABG.MABGP0060.MABGP_GrpCtgReg_MC.MA_MABGL0060_Del01Caller;

/**
 * 画面"MABGP_GrpCtgReg"パネルクラスです。<p>
 *
 * 計算グループカテゴリマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_GrpCtgReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0060";

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
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispDtl]ブロック関連のField定義
	public MCPanel DispDtlPanel = null;
	public MCScrollPane DispDtlScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMABG.MABGP0060.DispDtlR> DispDtlTable = null;
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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_grp_nm = null;
	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ctg_prio = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_00 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_01 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_02 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_03 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_04 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_05 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_06 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_07 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_08 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_09 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_10 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_11 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_12 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_13 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_14 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_15 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_16 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_17 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_18 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_19 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_20 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_21 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_22 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_23 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_24 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_25 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_26 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_27 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_28 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_29 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_30 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_31 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_32 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_33 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_34 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_35 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_36 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_37 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_38 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_39 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_40 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_41 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_42 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_43 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_44 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_45 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_46 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_47 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_48 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_49 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_50 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_51 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_52 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_53 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_54 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_55 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_56 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_57 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_58 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_59 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_60 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_61 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_62 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_63 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_64 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_65 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_66 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_67 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_68 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_69 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_70 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_71 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_72 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_73 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_74 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_75 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_76 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_77 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_78 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_79 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_80 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_81 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_82 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_83 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_84 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_85 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_86 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_87 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_88 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_89 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_90 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_91 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_92 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_93 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_94 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_95 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_96 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_97 = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_98 = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_calc_ctg_99 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_00 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_01 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_02 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_03 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_04 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_05 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_06 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_07 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_08 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_09 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_10 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_11 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_12 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_13 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_14 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_15 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_16 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_17 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_18 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_19 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_20 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_21 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_22 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_23 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_24 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_25 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_26 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_27 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_28 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_29 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_30 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_31 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_32 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_33 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_34 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_35 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_36 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_37 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_38 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_39 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_40 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_41 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_42 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_43 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_44 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_45 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_46 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_47 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_48 = null;
	public MCColumnGroup cgDispDtl_calc_ctg_typ_cg_49 = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0060.DtlR> DtlTable = null;
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
	
	/** [MA_MABGL0060_Srch01]のCallerの作成 */
	protected MABGP_GrpCtgReg_MC.MA_MABGL0060_Srch01Caller createMA_MABGL0060_Srch01() {
		MABGP_GrpCtgReg_MC.MA_MABGL0060_Srch01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Srch01Bridge>
		caller = ((MABGP_GrpCtgReg_MC)this).new MA_MABGL0060_Srch01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Srch01Bridge>(
					(MABGP_GrpCtgReg)this, new MA_MABGL0060_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0060_Srch01]の呼び出し */
	protected void callMA_MABGL0060_Srch01() {
		MCCaller caller = createMA_MABGL0060_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0060_Upd01]のCallerの作成 */
	protected MABGP_GrpCtgReg_MC.MA_MABGL0060_Upd01Caller createMA_MABGL0060_Upd01() {
		MABGP_GrpCtgReg_MC.MA_MABGL0060_Upd01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Upd01Bridge>
		caller = ((MABGP_GrpCtgReg_MC)this).new MA_MABGL0060_Upd01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Upd01Bridge>(
					(MABGP_GrpCtgReg)this, new MA_MABGL0060_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0060_Upd01]の呼び出し */
	protected void callMA_MABGL0060_Upd01() {
		MCCaller caller = createMA_MABGL0060_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0060_Del01]のCallerの作成 */
	protected MABGP_GrpCtgReg_MC.MA_MABGL0060_Del01Caller createMA_MABGL0060_Del01() {
		MABGP_GrpCtgReg_MC.MA_MABGL0060_Del01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Del01Bridge>
		caller = ((MABGP_GrpCtgReg_MC)this).new MA_MABGL0060_Del01Caller<MABGP_GrpCtgReg, MA_MABGL0060_Del01Bridge>(
					(MABGP_GrpCtgReg)this, new MA_MABGL0060_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0060_Del01]の呼び出し */
	protected void callMA_MABGL0060_Del01() {
		MCCaller caller = createMA_MABGL0060_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0060.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0060.DispDtlR> aDispDtlL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0060.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0060.CndR createCndR() {
		return mcframe.clientMABG.MABGP0060.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMABG.MABGP0060.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0060.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMABG.MABGP0060.DispDtlR createDispDtlR() {
		return mcframe.clientMABG.MABGP0060.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0060.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0060.DispDtlR.class);
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
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0060.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0060.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0060.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0060.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0060.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0060.DtlR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
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
	public MABGP_GrpCtgReg_MC_A() {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_GrpCtgReg_MC_A(String name) {
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
		MABGP_GrpCtgReg_MC.jbCreateScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateTop((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateFold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateCnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateCtrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateDispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateDtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbCreateEastBtn((MABGP_GrpCtgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_GrpCtgReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABGP_GrpCtgReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABGP_GrpCtgReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_GrpCtgReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABGP_GrpCtgReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MABGP_GrpCtgReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_GrpCtgReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_GrpCtgReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_GrpCtgReg p) {
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
	
	
	/** [DispDtl_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_grp_cd_p = null;

	/**
	 * [DispDtl_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_grp_cd_ListPutter() {
		if (DispDtl_calc_grp_cd_p == null) {
			DispDtl_calc_grp_cd_p = createDispDtl_calc_grp_cd_ListPutter(columnDispDtl_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return DispDtl_calc_grp_cd_p;
	}
	
	
	/** [DispDtl_calc_ctg_00_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_00_p = null;

	/**
	 * [DispDtl_calc_ctg_00_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_00_ListPutter() {
		if (DispDtl_calc_ctg_00_p == null) {
			DispDtl_calc_ctg_00_p = createDispDtl_calc_ctg_00_ListPutter(columnDispDtl_calc_ctg_00, "calc_ctg_00", "calc_ctg_01");

		}
		return DispDtl_calc_ctg_00_p;
	}
	
	
	/** [DispDtl_calc_ctg_02_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_02_p = null;

	/**
	 * [DispDtl_calc_ctg_02_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_02_ListPutter() {
		if (DispDtl_calc_ctg_02_p == null) {
			DispDtl_calc_ctg_02_p = createDispDtl_calc_ctg_02_ListPutter(columnDispDtl_calc_ctg_02, "calc_ctg_02", "calc_ctg_03");

		}
		return DispDtl_calc_ctg_02_p;
	}
	
	
	/** [DispDtl_calc_ctg_04_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_04_p = null;

	/**
	 * [DispDtl_calc_ctg_04_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_04_ListPutter() {
		if (DispDtl_calc_ctg_04_p == null) {
			DispDtl_calc_ctg_04_p = createDispDtl_calc_ctg_04_ListPutter(columnDispDtl_calc_ctg_04, "calc_ctg_04", "calc_ctg_05");

		}
		return DispDtl_calc_ctg_04_p;
	}
	
	
	/** [DispDtl_calc_ctg_06_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_06_p = null;

	/**
	 * [DispDtl_calc_ctg_06_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_06_ListPutter() {
		if (DispDtl_calc_ctg_06_p == null) {
			DispDtl_calc_ctg_06_p = createDispDtl_calc_ctg_06_ListPutter(columnDispDtl_calc_ctg_06, "calc_ctg_06", "calc_ctg_07");

		}
		return DispDtl_calc_ctg_06_p;
	}
	
	
	/** [DispDtl_calc_ctg_08_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_08_p = null;

	/**
	 * [DispDtl_calc_ctg_08_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_08_ListPutter() {
		if (DispDtl_calc_ctg_08_p == null) {
			DispDtl_calc_ctg_08_p = createDispDtl_calc_ctg_08_ListPutter(columnDispDtl_calc_ctg_08, "calc_ctg_08", "calc_ctg_09");

		}
		return DispDtl_calc_ctg_08_p;
	}
	
	
	/** [DispDtl_calc_ctg_10_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_10_p = null;

	/**
	 * [DispDtl_calc_ctg_10_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_10_ListPutter() {
		if (DispDtl_calc_ctg_10_p == null) {
			DispDtl_calc_ctg_10_p = createDispDtl_calc_ctg_10_ListPutter(columnDispDtl_calc_ctg_10, "calc_ctg_10", "calc_ctg_11");

		}
		return DispDtl_calc_ctg_10_p;
	}
	
	
	/** [DispDtl_calc_ctg_12_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_12_p = null;

	/**
	 * [DispDtl_calc_ctg_12_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_12_ListPutter() {
		if (DispDtl_calc_ctg_12_p == null) {
			DispDtl_calc_ctg_12_p = createDispDtl_calc_ctg_12_ListPutter(columnDispDtl_calc_ctg_12, "calc_ctg_12", "calc_ctg_13");

		}
		return DispDtl_calc_ctg_12_p;
	}
	
	
	/** [DispDtl_calc_ctg_14_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_14_p = null;

	/**
	 * [DispDtl_calc_ctg_14_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_14_ListPutter() {
		if (DispDtl_calc_ctg_14_p == null) {
			DispDtl_calc_ctg_14_p = createDispDtl_calc_ctg_14_ListPutter(columnDispDtl_calc_ctg_14, "calc_ctg_14", "calc_ctg_15");

		}
		return DispDtl_calc_ctg_14_p;
	}
	
	
	/** [DispDtl_calc_ctg_16_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_16_p = null;

	/**
	 * [DispDtl_calc_ctg_16_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_16_ListPutter() {
		if (DispDtl_calc_ctg_16_p == null) {
			DispDtl_calc_ctg_16_p = createDispDtl_calc_ctg_16_ListPutter(columnDispDtl_calc_ctg_16, "calc_ctg_16", "calc_ctg_17");

		}
		return DispDtl_calc_ctg_16_p;
	}
	
	
	/** [DispDtl_calc_ctg_18_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_18_p = null;

	/**
	 * [DispDtl_calc_ctg_18_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_18_ListPutter() {
		if (DispDtl_calc_ctg_18_p == null) {
			DispDtl_calc_ctg_18_p = createDispDtl_calc_ctg_18_ListPutter(columnDispDtl_calc_ctg_18, "calc_ctg_18", "calc_ctg_19");

		}
		return DispDtl_calc_ctg_18_p;
	}
	
	
	/** [DispDtl_calc_ctg_20_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_20_p = null;

	/**
	 * [DispDtl_calc_ctg_20_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_20_ListPutter() {
		if (DispDtl_calc_ctg_20_p == null) {
			DispDtl_calc_ctg_20_p = createDispDtl_calc_ctg_20_ListPutter(columnDispDtl_calc_ctg_20, "calc_ctg_20", "calc_ctg_21");

		}
		return DispDtl_calc_ctg_20_p;
	}
	
	
	/** [DispDtl_calc_ctg_22_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_22_p = null;

	/**
	 * [DispDtl_calc_ctg_22_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_22_ListPutter() {
		if (DispDtl_calc_ctg_22_p == null) {
			DispDtl_calc_ctg_22_p = createDispDtl_calc_ctg_22_ListPutter(columnDispDtl_calc_ctg_22, "calc_ctg_22", "calc_ctg_23");

		}
		return DispDtl_calc_ctg_22_p;
	}
	
	
	/** [DispDtl_calc_ctg_24_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_24_p = null;

	/**
	 * [DispDtl_calc_ctg_24_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_24_ListPutter() {
		if (DispDtl_calc_ctg_24_p == null) {
			DispDtl_calc_ctg_24_p = createDispDtl_calc_ctg_24_ListPutter(columnDispDtl_calc_ctg_24, "calc_ctg_24", "calc_ctg_25");

		}
		return DispDtl_calc_ctg_24_p;
	}
	
	
	/** [DispDtl_calc_ctg_26_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_26_p = null;

	/**
	 * [DispDtl_calc_ctg_26_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_26_ListPutter() {
		if (DispDtl_calc_ctg_26_p == null) {
			DispDtl_calc_ctg_26_p = createDispDtl_calc_ctg_26_ListPutter(columnDispDtl_calc_ctg_26, "calc_ctg_26", "calc_ctg_27");

		}
		return DispDtl_calc_ctg_26_p;
	}
	
	
	/** [DispDtl_calc_ctg_28_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_28_p = null;

	/**
	 * [DispDtl_calc_ctg_28_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_28_ListPutter() {
		if (DispDtl_calc_ctg_28_p == null) {
			DispDtl_calc_ctg_28_p = createDispDtl_calc_ctg_28_ListPutter(columnDispDtl_calc_ctg_28, "calc_ctg_28", "calc_ctg_29");

		}
		return DispDtl_calc_ctg_28_p;
	}
	
	
	/** [DispDtl_calc_ctg_30_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_30_p = null;

	/**
	 * [DispDtl_calc_ctg_30_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_30_ListPutter() {
		if (DispDtl_calc_ctg_30_p == null) {
			DispDtl_calc_ctg_30_p = createDispDtl_calc_ctg_30_ListPutter(columnDispDtl_calc_ctg_30, "calc_ctg_30", "calc_ctg_31");

		}
		return DispDtl_calc_ctg_30_p;
	}
	
	
	/** [DispDtl_calc_ctg_32_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_32_p = null;

	/**
	 * [DispDtl_calc_ctg_32_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_32_ListPutter() {
		if (DispDtl_calc_ctg_32_p == null) {
			DispDtl_calc_ctg_32_p = createDispDtl_calc_ctg_32_ListPutter(columnDispDtl_calc_ctg_32, "calc_ctg_32", "calc_ctg_33");

		}
		return DispDtl_calc_ctg_32_p;
	}
	
	
	/** [DispDtl_calc_ctg_34_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_34_p = null;

	/**
	 * [DispDtl_calc_ctg_34_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_34_ListPutter() {
		if (DispDtl_calc_ctg_34_p == null) {
			DispDtl_calc_ctg_34_p = createDispDtl_calc_ctg_34_ListPutter(columnDispDtl_calc_ctg_34, "calc_ctg_34", "calc_ctg_35");

		}
		return DispDtl_calc_ctg_34_p;
	}
	
	
	/** [DispDtl_calc_ctg_36_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_36_p = null;

	/**
	 * [DispDtl_calc_ctg_36_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_36_ListPutter() {
		if (DispDtl_calc_ctg_36_p == null) {
			DispDtl_calc_ctg_36_p = createDispDtl_calc_ctg_36_ListPutter(columnDispDtl_calc_ctg_36, "calc_ctg_36", "calc_ctg_37");

		}
		return DispDtl_calc_ctg_36_p;
	}
	
	
	/** [DispDtl_calc_ctg_38_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_38_p = null;

	/**
	 * [DispDtl_calc_ctg_38_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_38_ListPutter() {
		if (DispDtl_calc_ctg_38_p == null) {
			DispDtl_calc_ctg_38_p = createDispDtl_calc_ctg_38_ListPutter(columnDispDtl_calc_ctg_38, "calc_ctg_38", "calc_ctg_39");

		}
		return DispDtl_calc_ctg_38_p;
	}
	
	
	/** [DispDtl_calc_ctg_40_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_40_p = null;

	/**
	 * [DispDtl_calc_ctg_40_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_40_ListPutter() {
		if (DispDtl_calc_ctg_40_p == null) {
			DispDtl_calc_ctg_40_p = createDispDtl_calc_ctg_40_ListPutter(columnDispDtl_calc_ctg_40, "calc_ctg_40", "calc_ctg_41");

		}
		return DispDtl_calc_ctg_40_p;
	}
	
	
	/** [DispDtl_calc_ctg_42_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_42_p = null;

	/**
	 * [DispDtl_calc_ctg_42_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_42_ListPutter() {
		if (DispDtl_calc_ctg_42_p == null) {
			DispDtl_calc_ctg_42_p = createDispDtl_calc_ctg_42_ListPutter(columnDispDtl_calc_ctg_42, "calc_ctg_42", "calc_ctg_43");

		}
		return DispDtl_calc_ctg_42_p;
	}
	
	
	/** [DispDtl_calc_ctg_44_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_44_p = null;

	/**
	 * [DispDtl_calc_ctg_44_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_44_ListPutter() {
		if (DispDtl_calc_ctg_44_p == null) {
			DispDtl_calc_ctg_44_p = createDispDtl_calc_ctg_44_ListPutter(columnDispDtl_calc_ctg_44, "calc_ctg_44", "calc_ctg_45");

		}
		return DispDtl_calc_ctg_44_p;
	}
	
	
	/** [DispDtl_calc_ctg_46_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_46_p = null;

	/**
	 * [DispDtl_calc_ctg_46_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_46_ListPutter() {
		if (DispDtl_calc_ctg_46_p == null) {
			DispDtl_calc_ctg_46_p = createDispDtl_calc_ctg_46_ListPutter(columnDispDtl_calc_ctg_46, "calc_ctg_46", "calc_ctg_47");

		}
		return DispDtl_calc_ctg_46_p;
	}
	
	
	/** [DispDtl_calc_ctg_48_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_48_p = null;

	/**
	 * [DispDtl_calc_ctg_48_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_48_ListPutter() {
		if (DispDtl_calc_ctg_48_p == null) {
			DispDtl_calc_ctg_48_p = createDispDtl_calc_ctg_48_ListPutter(columnDispDtl_calc_ctg_48, "calc_ctg_48", "calc_ctg_49");

		}
		return DispDtl_calc_ctg_48_p;
	}
	
	
	/** [DispDtl_calc_ctg_50_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_50_p = null;

	/**
	 * [DispDtl_calc_ctg_50_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_50_ListPutter() {
		if (DispDtl_calc_ctg_50_p == null) {
			DispDtl_calc_ctg_50_p = createDispDtl_calc_ctg_50_ListPutter(columnDispDtl_calc_ctg_50, "calc_ctg_50", "calc_ctg_51");

		}
		return DispDtl_calc_ctg_50_p;
	}
	
	
	/** [DispDtl_calc_ctg_52_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_52_p = null;

	/**
	 * [DispDtl_calc_ctg_52_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_52_ListPutter() {
		if (DispDtl_calc_ctg_52_p == null) {
			DispDtl_calc_ctg_52_p = createDispDtl_calc_ctg_52_ListPutter(columnDispDtl_calc_ctg_52, "calc_ctg_52", "calc_ctg_53");

		}
		return DispDtl_calc_ctg_52_p;
	}
	
	
	/** [DispDtl_calc_ctg_54_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_54_p = null;

	/**
	 * [DispDtl_calc_ctg_54_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_54_ListPutter() {
		if (DispDtl_calc_ctg_54_p == null) {
			DispDtl_calc_ctg_54_p = createDispDtl_calc_ctg_54_ListPutter(columnDispDtl_calc_ctg_54, "calc_ctg_54", "calc_ctg_55");

		}
		return DispDtl_calc_ctg_54_p;
	}
	
	
	/** [DispDtl_calc_ctg_56_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_56_p = null;

	/**
	 * [DispDtl_calc_ctg_56_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_56_ListPutter() {
		if (DispDtl_calc_ctg_56_p == null) {
			DispDtl_calc_ctg_56_p = createDispDtl_calc_ctg_56_ListPutter(columnDispDtl_calc_ctg_56, "calc_ctg_56", "calc_ctg_57");

		}
		return DispDtl_calc_ctg_56_p;
	}
	
	
	/** [DispDtl_calc_ctg_58_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_58_p = null;

	/**
	 * [DispDtl_calc_ctg_58_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_58_ListPutter() {
		if (DispDtl_calc_ctg_58_p == null) {
			DispDtl_calc_ctg_58_p = createDispDtl_calc_ctg_58_ListPutter(columnDispDtl_calc_ctg_58, "calc_ctg_58", "calc_ctg_59");

		}
		return DispDtl_calc_ctg_58_p;
	}
	
	
	/** [DispDtl_calc_ctg_60_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_60_p = null;

	/**
	 * [DispDtl_calc_ctg_60_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_60_ListPutter() {
		if (DispDtl_calc_ctg_60_p == null) {
			DispDtl_calc_ctg_60_p = createDispDtl_calc_ctg_60_ListPutter(columnDispDtl_calc_ctg_60, "calc_ctg_60", "calc_ctg_61");

		}
		return DispDtl_calc_ctg_60_p;
	}
	
	
	/** [DispDtl_calc_ctg_62_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_62_p = null;

	/**
	 * [DispDtl_calc_ctg_62_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_62_ListPutter() {
		if (DispDtl_calc_ctg_62_p == null) {
			DispDtl_calc_ctg_62_p = createDispDtl_calc_ctg_62_ListPutter(columnDispDtl_calc_ctg_62, "calc_ctg_62", "calc_ctg_63");

		}
		return DispDtl_calc_ctg_62_p;
	}
	
	
	/** [DispDtl_calc_ctg_64_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_64_p = null;

	/**
	 * [DispDtl_calc_ctg_64_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_64_ListPutter() {
		if (DispDtl_calc_ctg_64_p == null) {
			DispDtl_calc_ctg_64_p = createDispDtl_calc_ctg_64_ListPutter(columnDispDtl_calc_ctg_64, "calc_ctg_64", "calc_ctg_65");

		}
		return DispDtl_calc_ctg_64_p;
	}
	
	
	/** [DispDtl_calc_ctg_66_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_66_p = null;

	/**
	 * [DispDtl_calc_ctg_66_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_66_ListPutter() {
		if (DispDtl_calc_ctg_66_p == null) {
			DispDtl_calc_ctg_66_p = createDispDtl_calc_ctg_66_ListPutter(columnDispDtl_calc_ctg_66, "calc_ctg_66", "calc_ctg_67");

		}
		return DispDtl_calc_ctg_66_p;
	}
	
	
	/** [DispDtl_calc_ctg_68_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_68_p = null;

	/**
	 * [DispDtl_calc_ctg_68_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_68_ListPutter() {
		if (DispDtl_calc_ctg_68_p == null) {
			DispDtl_calc_ctg_68_p = createDispDtl_calc_ctg_68_ListPutter(columnDispDtl_calc_ctg_68, "calc_ctg_68", "calc_ctg_69");

		}
		return DispDtl_calc_ctg_68_p;
	}
	
	
	/** [DispDtl_calc_ctg_70_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_70_p = null;

	/**
	 * [DispDtl_calc_ctg_70_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_70_ListPutter() {
		if (DispDtl_calc_ctg_70_p == null) {
			DispDtl_calc_ctg_70_p = createDispDtl_calc_ctg_70_ListPutter(columnDispDtl_calc_ctg_70, "calc_ctg_70", "calc_ctg_71");

		}
		return DispDtl_calc_ctg_70_p;
	}
	
	
	/** [DispDtl_calc_ctg_72_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_72_p = null;

	/**
	 * [DispDtl_calc_ctg_72_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_72_ListPutter() {
		if (DispDtl_calc_ctg_72_p == null) {
			DispDtl_calc_ctg_72_p = createDispDtl_calc_ctg_72_ListPutter(columnDispDtl_calc_ctg_72, "calc_ctg_72", "calc_ctg_73");

		}
		return DispDtl_calc_ctg_72_p;
	}
	
	
	/** [DispDtl_calc_ctg_74_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_74_p = null;

	/**
	 * [DispDtl_calc_ctg_74_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_74_ListPutter() {
		if (DispDtl_calc_ctg_74_p == null) {
			DispDtl_calc_ctg_74_p = createDispDtl_calc_ctg_74_ListPutter(columnDispDtl_calc_ctg_74, "calc_ctg_74", "calc_ctg_75");

		}
		return DispDtl_calc_ctg_74_p;
	}
	
	
	/** [DispDtl_calc_ctg_76_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_76_p = null;

	/**
	 * [DispDtl_calc_ctg_76_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_76_ListPutter() {
		if (DispDtl_calc_ctg_76_p == null) {
			DispDtl_calc_ctg_76_p = createDispDtl_calc_ctg_76_ListPutter(columnDispDtl_calc_ctg_76, "calc_ctg_76", "calc_ctg_77");

		}
		return DispDtl_calc_ctg_76_p;
	}
	
	
	/** [DispDtl_calc_ctg_78_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_78_p = null;

	/**
	 * [DispDtl_calc_ctg_78_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_78_ListPutter() {
		if (DispDtl_calc_ctg_78_p == null) {
			DispDtl_calc_ctg_78_p = createDispDtl_calc_ctg_78_ListPutter(columnDispDtl_calc_ctg_78, "calc_ctg_78", "calc_ctg_79");

		}
		return DispDtl_calc_ctg_78_p;
	}
	
	
	/** [DispDtl_calc_ctg_80_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_80_p = null;

	/**
	 * [DispDtl_calc_ctg_80_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_80_ListPutter() {
		if (DispDtl_calc_ctg_80_p == null) {
			DispDtl_calc_ctg_80_p = createDispDtl_calc_ctg_80_ListPutter(columnDispDtl_calc_ctg_80, "calc_ctg_80", "calc_ctg_81");

		}
		return DispDtl_calc_ctg_80_p;
	}
	
	
	/** [DispDtl_calc_ctg_82_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_82_p = null;

	/**
	 * [DispDtl_calc_ctg_82_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_82_ListPutter() {
		if (DispDtl_calc_ctg_82_p == null) {
			DispDtl_calc_ctg_82_p = createDispDtl_calc_ctg_82_ListPutter(columnDispDtl_calc_ctg_82, "calc_ctg_82", "calc_ctg_83");

		}
		return DispDtl_calc_ctg_82_p;
	}
	
	
	/** [DispDtl_calc_ctg_84_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_84_p = null;

	/**
	 * [DispDtl_calc_ctg_84_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_84_ListPutter() {
		if (DispDtl_calc_ctg_84_p == null) {
			DispDtl_calc_ctg_84_p = createDispDtl_calc_ctg_84_ListPutter(columnDispDtl_calc_ctg_84, "calc_ctg_84", "calc_ctg_85");

		}
		return DispDtl_calc_ctg_84_p;
	}
	
	
	/** [DispDtl_calc_ctg_86_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_86_p = null;

	/**
	 * [DispDtl_calc_ctg_86_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_86_ListPutter() {
		if (DispDtl_calc_ctg_86_p == null) {
			DispDtl_calc_ctg_86_p = createDispDtl_calc_ctg_86_ListPutter(columnDispDtl_calc_ctg_86, "calc_ctg_86", "calc_ctg_87");

		}
		return DispDtl_calc_ctg_86_p;
	}
	
	
	/** [DispDtl_calc_ctg_88_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_88_p = null;

	/**
	 * [DispDtl_calc_ctg_88_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_88_ListPutter() {
		if (DispDtl_calc_ctg_88_p == null) {
			DispDtl_calc_ctg_88_p = createDispDtl_calc_ctg_88_ListPutter(columnDispDtl_calc_ctg_88, "calc_ctg_88", "calc_ctg_89");

		}
		return DispDtl_calc_ctg_88_p;
	}
	
	
	/** [DispDtl_calc_ctg_90_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_90_p = null;

	/**
	 * [DispDtl_calc_ctg_90_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_90_ListPutter() {
		if (DispDtl_calc_ctg_90_p == null) {
			DispDtl_calc_ctg_90_p = createDispDtl_calc_ctg_90_ListPutter(columnDispDtl_calc_ctg_90, "calc_ctg_90", "calc_ctg_91");

		}
		return DispDtl_calc_ctg_90_p;
	}
	
	
	/** [DispDtl_calc_ctg_92_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_92_p = null;

	/**
	 * [DispDtl_calc_ctg_92_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_92_ListPutter() {
		if (DispDtl_calc_ctg_92_p == null) {
			DispDtl_calc_ctg_92_p = createDispDtl_calc_ctg_92_ListPutter(columnDispDtl_calc_ctg_92, "calc_ctg_92", "calc_ctg_93");

		}
		return DispDtl_calc_ctg_92_p;
	}
	
	
	/** [DispDtl_calc_ctg_94_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_94_p = null;

	/**
	 * [DispDtl_calc_ctg_94_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_94_ListPutter() {
		if (DispDtl_calc_ctg_94_p == null) {
			DispDtl_calc_ctg_94_p = createDispDtl_calc_ctg_94_ListPutter(columnDispDtl_calc_ctg_94, "calc_ctg_94", "calc_ctg_95");

		}
		return DispDtl_calc_ctg_94_p;
	}
	
	
	/** [DispDtl_calc_ctg_96_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_96_p = null;

	/**
	 * [DispDtl_calc_ctg_96_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_96_ListPutter() {
		if (DispDtl_calc_ctg_96_p == null) {
			DispDtl_calc_ctg_96_p = createDispDtl_calc_ctg_96_ListPutter(columnDispDtl_calc_ctg_96, "calc_ctg_96", "calc_ctg_97");

		}
		return DispDtl_calc_ctg_96_p;
	}
	
	
	/** [DispDtl_calc_ctg_98_ListPutter]の定義 */
	private MCListPutter DispDtl_calc_ctg_98_p = null;

	/**
	 * [DispDtl_calc_ctg_98_ListPutter]の取得
	 */
	protected MCListPutter getDispDtl_calc_ctg_98_ListPutter() {
		if (DispDtl_calc_ctg_98_p == null) {
			DispDtl_calc_ctg_98_p = createDispDtl_calc_ctg_98_ListPutter(columnDispDtl_calc_ctg_98, "calc_ctg_98", "calc_ctg_99");

		}
		return DispDtl_calc_ctg_98_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_GrpCtgReg create(){
		MABGP_GrpCtgReg p = new MABGP_GrpCtgReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_GrpCtgReg create(String name){
		MABGP_GrpCtgReg p = new MABGP_GrpCtgReg(name);
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
		MABGP_GrpCtgReg_MC.jbfInitScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitTop((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitFold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitCnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitCtrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitDispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitDtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbfInitEastBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitTop((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitFold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitCnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitCtrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitDispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitDtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.jbInitEastBtn((MABGP_GrpCtgReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_check = p.beansFactory.createTableColumn("DispDtl.check", MCColumnType.CHECK);
		p.columnDispDtl_del_flg = p.beansFactory.createTableColumn("DispDtl.del_flg", MCColumnType.CHECK);
		p.columnDispDtl_calc_grp_cd = p.beansFactory.createTableColumn("DispDtl.calc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_grp_nm = p.beansFactory.createTableColumn("DispDtl.calc_grp_nm", MCColumnType.TEXT);
		p.columnDispDtl_ctg_prio = p.beansFactory.createTableColumn("DispDtl.ctg_prio", MCColumnType.NUMBER);
		p.columnDispDtl_calc_ctg_00 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_00", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_01 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_01", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_02 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_02", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_03 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_03", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_04 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_04", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_05 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_05", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_06 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_06", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_07 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_07", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_08 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_08", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_09 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_09", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_10 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_10", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_11 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_11", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_12 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_12", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_13 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_13", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_14 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_14", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_15 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_15", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_16 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_16", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_17 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_17", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_18 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_18", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_19 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_19", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_20 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_20", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_21 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_21", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_22 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_22", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_23 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_23", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_24 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_24", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_25 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_25", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_26 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_26", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_27 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_27", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_28 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_28", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_29 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_29", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_30 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_30", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_31 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_31", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_32 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_32", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_33 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_33", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_34 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_34", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_35 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_35", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_36 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_36", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_37 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_37", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_38 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_38", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_39 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_39", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_40 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_40", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_41 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_41", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_42 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_42", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_43 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_43", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_44 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_44", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_45 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_45", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_46 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_46", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_47 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_47", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_48 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_48", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_49 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_49", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_50 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_50", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_51 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_51", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_52 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_52", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_53 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_53", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_54 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_54", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_55 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_55", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_56 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_56", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_57 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_57", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_58 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_58", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_59 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_59", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_60 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_60", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_61 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_61", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_62 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_62", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_63 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_63", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_64 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_64", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_65 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_65", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_66 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_66", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_67 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_67", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_68 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_68", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_69 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_69", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_70 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_70", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_71 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_71", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_72 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_72", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_73 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_73", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_74 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_74", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_75 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_75", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_76 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_76", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_77 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_77", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_78 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_78", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_79 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_79", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_80 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_80", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_81 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_81", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_82 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_82", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_83 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_83", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_84 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_84", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_85 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_85", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_86 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_86", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_87 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_87", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_88 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_88", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_89 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_89", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_90 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_90", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_91 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_91", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_92 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_92", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_93 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_93", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_94 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_94", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_95 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_95", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_96 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_96", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_97 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_97", MCColumnType.TEXT);
		p.columnDispDtl_calc_ctg_98 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_98", MCColumnType.TEXT_COMBO);
		p.columnDispDtl_calc_ctg_99 = p.beansFactory.createTableColumn("DispDtl.calc_ctg_99", MCColumnType.TEXT);
		p.cgDispDtl_calc_ctg_typ_cg_00 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_00");
		p.cgDispDtl_calc_ctg_typ_cg_01 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_01");
		p.cgDispDtl_calc_ctg_typ_cg_02 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_02");
		p.cgDispDtl_calc_ctg_typ_cg_03 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_03");
		p.cgDispDtl_calc_ctg_typ_cg_04 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_04");
		p.cgDispDtl_calc_ctg_typ_cg_05 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_05");
		p.cgDispDtl_calc_ctg_typ_cg_06 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_06");
		p.cgDispDtl_calc_ctg_typ_cg_07 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_07");
		p.cgDispDtl_calc_ctg_typ_cg_08 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_08");
		p.cgDispDtl_calc_ctg_typ_cg_09 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_09");
		p.cgDispDtl_calc_ctg_typ_cg_10 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_10");
		p.cgDispDtl_calc_ctg_typ_cg_11 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_11");
		p.cgDispDtl_calc_ctg_typ_cg_12 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_12");
		p.cgDispDtl_calc_ctg_typ_cg_13 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_13");
		p.cgDispDtl_calc_ctg_typ_cg_14 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_14");
		p.cgDispDtl_calc_ctg_typ_cg_15 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_15");
		p.cgDispDtl_calc_ctg_typ_cg_16 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_16");
		p.cgDispDtl_calc_ctg_typ_cg_17 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_17");
		p.cgDispDtl_calc_ctg_typ_cg_18 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_18");
		p.cgDispDtl_calc_ctg_typ_cg_19 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_19");
		p.cgDispDtl_calc_ctg_typ_cg_20 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_20");
		p.cgDispDtl_calc_ctg_typ_cg_21 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_21");
		p.cgDispDtl_calc_ctg_typ_cg_22 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_22");
		p.cgDispDtl_calc_ctg_typ_cg_23 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_23");
		p.cgDispDtl_calc_ctg_typ_cg_24 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_24");
		p.cgDispDtl_calc_ctg_typ_cg_25 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_25");
		p.cgDispDtl_calc_ctg_typ_cg_26 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_26");
		p.cgDispDtl_calc_ctg_typ_cg_27 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_27");
		p.cgDispDtl_calc_ctg_typ_cg_28 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_28");
		p.cgDispDtl_calc_ctg_typ_cg_29 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_29");
		p.cgDispDtl_calc_ctg_typ_cg_30 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_30");
		p.cgDispDtl_calc_ctg_typ_cg_31 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_31");
		p.cgDispDtl_calc_ctg_typ_cg_32 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_32");
		p.cgDispDtl_calc_ctg_typ_cg_33 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_33");
		p.cgDispDtl_calc_ctg_typ_cg_34 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_34");
		p.cgDispDtl_calc_ctg_typ_cg_35 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_35");
		p.cgDispDtl_calc_ctg_typ_cg_36 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_36");
		p.cgDispDtl_calc_ctg_typ_cg_37 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_37");
		p.cgDispDtl_calc_ctg_typ_cg_38 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_38");
		p.cgDispDtl_calc_ctg_typ_cg_39 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_39");
		p.cgDispDtl_calc_ctg_typ_cg_40 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_40");
		p.cgDispDtl_calc_ctg_typ_cg_41 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_41");
		p.cgDispDtl_calc_ctg_typ_cg_42 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_42");
		p.cgDispDtl_calc_ctg_typ_cg_43 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_43");
		p.cgDispDtl_calc_ctg_typ_cg_44 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_44");
		p.cgDispDtl_calc_ctg_typ_cg_45 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_45");
		p.cgDispDtl_calc_ctg_typ_cg_46 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_46");
		p.cgDispDtl_calc_ctg_typ_cg_47 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_47");
		p.cgDispDtl_calc_ctg_typ_cg_48 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_48");
		p.cgDispDtl_calc_ctg_typ_cg_49 = p.beansFactory.createColumnGroup("DispDtl.calc_ctg_typ_cg_49");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABGP_GrpCtgReg p) {
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
	protected static void jbfInitEastBtn(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_GrpCtgReg p) {
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
	protected static void jbInitTop(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispDtlPanel);
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
	protected static void jbInitFold(MABGP_GrpCtgReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_GrpCtgReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0060.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0060.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0060.CndR.calc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_grp_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABGP_GrpCtgReg p) {
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
	protected static void jbInitDispDtl(MABGP_GrpCtgReg p) {
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
	protected static void jbInitDtl(MABGP_GrpCtgReg p) {
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
	protected static void jbInitDtlBtn(MABGP_GrpCtgReg p) {
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
	protected static void jbInitEastBtn(MABGP_GrpCtgReg p) {
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
		MABGP_GrpCtgReg_MC.mcInitScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitTop((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitFold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitCnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitCtrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitDispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitDtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.mcInitEastBtn((MABGP_GrpCtgReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_GrpCtgReg_MC.statusInitUPD_ScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_Top((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_Fold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_Cnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_Ctrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_DispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_Dtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_DtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitUPD_EastBtn((MABGP_GrpCtgReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_GrpCtgReg_MC.statusInitFIX_ScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_Top((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_Fold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_Cnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_Ctrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_DispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_Dtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_DtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitFIX_EastBtn((MABGP_GrpCtgReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_GrpCtgReg_MC.statusInitDEL_ScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_Top((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_Fold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_Cnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_Ctrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_DispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_Dtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_DtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitDEL_EastBtn((MABGP_GrpCtgReg)this);

		// [REF]ステータスのモードの設定
		MABGP_GrpCtgReg_MC.statusInitREF_ScreenOpe((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_Top((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_Fold((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_Cnd((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_Ctrl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_DispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_Dtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_DtlBtn((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.statusInitREF_EastBtn((MABGP_GrpCtgReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_GrpCtgReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABGP_GrpCtgReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABGP_GrpCtgReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_GrpCtgReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABGP_GrpCtgReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MABGP_GrpCtgReg p) {
		p.DispDtlTable.addAllListener(p);
		p.columnDispDtl_check.addAllListener(p);
		p.columnDispDtl_del_flg.addAllListener(p);
		p.columnDispDtl_calc_grp_cd.addAllListener(p);
		p.columnDispDtl_calc_grp_cd.setListListener(p);
		p.columnDispDtl_calc_grp_nm.addAllListener(p);
		p.columnDispDtl_calc_grp_nm.setListListener(p);
		p.columnDispDtl_ctg_prio.addAllListener(p);
		p.columnDispDtl_ctg_prio.setListListener(p);
		p.columnDispDtl_calc_ctg_00.addAllListener(p);
		p.columnDispDtl_calc_ctg_00.setListListener(p);
		p.columnDispDtl_calc_ctg_01.addAllListener(p);
		p.columnDispDtl_calc_ctg_01.setListListener(p);
		p.columnDispDtl_calc_ctg_02.addAllListener(p);
		p.columnDispDtl_calc_ctg_02.setListListener(p);
		p.columnDispDtl_calc_ctg_03.addAllListener(p);
		p.columnDispDtl_calc_ctg_03.setListListener(p);
		p.columnDispDtl_calc_ctg_04.addAllListener(p);
		p.columnDispDtl_calc_ctg_04.setListListener(p);
		p.columnDispDtl_calc_ctg_05.addAllListener(p);
		p.columnDispDtl_calc_ctg_05.setListListener(p);
		p.columnDispDtl_calc_ctg_06.addAllListener(p);
		p.columnDispDtl_calc_ctg_06.setListListener(p);
		p.columnDispDtl_calc_ctg_07.addAllListener(p);
		p.columnDispDtl_calc_ctg_07.setListListener(p);
		p.columnDispDtl_calc_ctg_08.addAllListener(p);
		p.columnDispDtl_calc_ctg_08.setListListener(p);
		p.columnDispDtl_calc_ctg_09.addAllListener(p);
		p.columnDispDtl_calc_ctg_09.setListListener(p);
		p.columnDispDtl_calc_ctg_10.addAllListener(p);
		p.columnDispDtl_calc_ctg_10.setListListener(p);
		p.columnDispDtl_calc_ctg_11.addAllListener(p);
		p.columnDispDtl_calc_ctg_11.setListListener(p);
		p.columnDispDtl_calc_ctg_12.addAllListener(p);
		p.columnDispDtl_calc_ctg_12.setListListener(p);
		p.columnDispDtl_calc_ctg_13.addAllListener(p);
		p.columnDispDtl_calc_ctg_13.setListListener(p);
		p.columnDispDtl_calc_ctg_14.addAllListener(p);
		p.columnDispDtl_calc_ctg_14.setListListener(p);
		p.columnDispDtl_calc_ctg_15.addAllListener(p);
		p.columnDispDtl_calc_ctg_15.setListListener(p);
		p.columnDispDtl_calc_ctg_16.addAllListener(p);
		p.columnDispDtl_calc_ctg_16.setListListener(p);
		p.columnDispDtl_calc_ctg_17.addAllListener(p);
		p.columnDispDtl_calc_ctg_17.setListListener(p);
		p.columnDispDtl_calc_ctg_18.addAllListener(p);
		p.columnDispDtl_calc_ctg_18.setListListener(p);
		p.columnDispDtl_calc_ctg_19.addAllListener(p);
		p.columnDispDtl_calc_ctg_19.setListListener(p);
		p.columnDispDtl_calc_ctg_20.addAllListener(p);
		p.columnDispDtl_calc_ctg_20.setListListener(p);
		p.columnDispDtl_calc_ctg_21.addAllListener(p);
		p.columnDispDtl_calc_ctg_21.setListListener(p);
		p.columnDispDtl_calc_ctg_22.addAllListener(p);
		p.columnDispDtl_calc_ctg_22.setListListener(p);
		p.columnDispDtl_calc_ctg_23.addAllListener(p);
		p.columnDispDtl_calc_ctg_23.setListListener(p);
		p.columnDispDtl_calc_ctg_24.addAllListener(p);
		p.columnDispDtl_calc_ctg_24.setListListener(p);
		p.columnDispDtl_calc_ctg_25.addAllListener(p);
		p.columnDispDtl_calc_ctg_25.setListListener(p);
		p.columnDispDtl_calc_ctg_26.addAllListener(p);
		p.columnDispDtl_calc_ctg_26.setListListener(p);
		p.columnDispDtl_calc_ctg_27.addAllListener(p);
		p.columnDispDtl_calc_ctg_27.setListListener(p);
		p.columnDispDtl_calc_ctg_28.addAllListener(p);
		p.columnDispDtl_calc_ctg_28.setListListener(p);
		p.columnDispDtl_calc_ctg_29.addAllListener(p);
		p.columnDispDtl_calc_ctg_29.setListListener(p);
		p.columnDispDtl_calc_ctg_30.addAllListener(p);
		p.columnDispDtl_calc_ctg_30.setListListener(p);
		p.columnDispDtl_calc_ctg_31.addAllListener(p);
		p.columnDispDtl_calc_ctg_31.setListListener(p);
		p.columnDispDtl_calc_ctg_32.addAllListener(p);
		p.columnDispDtl_calc_ctg_32.setListListener(p);
		p.columnDispDtl_calc_ctg_33.addAllListener(p);
		p.columnDispDtl_calc_ctg_33.setListListener(p);
		p.columnDispDtl_calc_ctg_34.addAllListener(p);
		p.columnDispDtl_calc_ctg_34.setListListener(p);
		p.columnDispDtl_calc_ctg_35.addAllListener(p);
		p.columnDispDtl_calc_ctg_35.setListListener(p);
		p.columnDispDtl_calc_ctg_36.addAllListener(p);
		p.columnDispDtl_calc_ctg_36.setListListener(p);
		p.columnDispDtl_calc_ctg_37.addAllListener(p);
		p.columnDispDtl_calc_ctg_37.setListListener(p);
		p.columnDispDtl_calc_ctg_38.addAllListener(p);
		p.columnDispDtl_calc_ctg_38.setListListener(p);
		p.columnDispDtl_calc_ctg_39.addAllListener(p);
		p.columnDispDtl_calc_ctg_39.setListListener(p);
		p.columnDispDtl_calc_ctg_40.addAllListener(p);
		p.columnDispDtl_calc_ctg_40.setListListener(p);
		p.columnDispDtl_calc_ctg_41.addAllListener(p);
		p.columnDispDtl_calc_ctg_41.setListListener(p);
		p.columnDispDtl_calc_ctg_42.addAllListener(p);
		p.columnDispDtl_calc_ctg_42.setListListener(p);
		p.columnDispDtl_calc_ctg_43.addAllListener(p);
		p.columnDispDtl_calc_ctg_43.setListListener(p);
		p.columnDispDtl_calc_ctg_44.addAllListener(p);
		p.columnDispDtl_calc_ctg_44.setListListener(p);
		p.columnDispDtl_calc_ctg_45.addAllListener(p);
		p.columnDispDtl_calc_ctg_45.setListListener(p);
		p.columnDispDtl_calc_ctg_46.addAllListener(p);
		p.columnDispDtl_calc_ctg_46.setListListener(p);
		p.columnDispDtl_calc_ctg_47.addAllListener(p);
		p.columnDispDtl_calc_ctg_47.setListListener(p);
		p.columnDispDtl_calc_ctg_48.addAllListener(p);
		p.columnDispDtl_calc_ctg_48.setListListener(p);
		p.columnDispDtl_calc_ctg_49.addAllListener(p);
		p.columnDispDtl_calc_ctg_49.setListListener(p);
		p.columnDispDtl_calc_ctg_50.addAllListener(p);
		p.columnDispDtl_calc_ctg_50.setListListener(p);
		p.columnDispDtl_calc_ctg_51.addAllListener(p);
		p.columnDispDtl_calc_ctg_51.setListListener(p);
		p.columnDispDtl_calc_ctg_52.addAllListener(p);
		p.columnDispDtl_calc_ctg_52.setListListener(p);
		p.columnDispDtl_calc_ctg_53.addAllListener(p);
		p.columnDispDtl_calc_ctg_53.setListListener(p);
		p.columnDispDtl_calc_ctg_54.addAllListener(p);
		p.columnDispDtl_calc_ctg_54.setListListener(p);
		p.columnDispDtl_calc_ctg_55.addAllListener(p);
		p.columnDispDtl_calc_ctg_55.setListListener(p);
		p.columnDispDtl_calc_ctg_56.addAllListener(p);
		p.columnDispDtl_calc_ctg_56.setListListener(p);
		p.columnDispDtl_calc_ctg_57.addAllListener(p);
		p.columnDispDtl_calc_ctg_57.setListListener(p);
		p.columnDispDtl_calc_ctg_58.addAllListener(p);
		p.columnDispDtl_calc_ctg_58.setListListener(p);
		p.columnDispDtl_calc_ctg_59.addAllListener(p);
		p.columnDispDtl_calc_ctg_59.setListListener(p);
		p.columnDispDtl_calc_ctg_60.addAllListener(p);
		p.columnDispDtl_calc_ctg_60.setListListener(p);
		p.columnDispDtl_calc_ctg_61.addAllListener(p);
		p.columnDispDtl_calc_ctg_61.setListListener(p);
		p.columnDispDtl_calc_ctg_62.addAllListener(p);
		p.columnDispDtl_calc_ctg_62.setListListener(p);
		p.columnDispDtl_calc_ctg_63.addAllListener(p);
		p.columnDispDtl_calc_ctg_63.setListListener(p);
		p.columnDispDtl_calc_ctg_64.addAllListener(p);
		p.columnDispDtl_calc_ctg_64.setListListener(p);
		p.columnDispDtl_calc_ctg_65.addAllListener(p);
		p.columnDispDtl_calc_ctg_65.setListListener(p);
		p.columnDispDtl_calc_ctg_66.addAllListener(p);
		p.columnDispDtl_calc_ctg_66.setListListener(p);
		p.columnDispDtl_calc_ctg_67.addAllListener(p);
		p.columnDispDtl_calc_ctg_67.setListListener(p);
		p.columnDispDtl_calc_ctg_68.addAllListener(p);
		p.columnDispDtl_calc_ctg_68.setListListener(p);
		p.columnDispDtl_calc_ctg_69.addAllListener(p);
		p.columnDispDtl_calc_ctg_69.setListListener(p);
		p.columnDispDtl_calc_ctg_70.addAllListener(p);
		p.columnDispDtl_calc_ctg_70.setListListener(p);
		p.columnDispDtl_calc_ctg_71.addAllListener(p);
		p.columnDispDtl_calc_ctg_71.setListListener(p);
		p.columnDispDtl_calc_ctg_72.addAllListener(p);
		p.columnDispDtl_calc_ctg_72.setListListener(p);
		p.columnDispDtl_calc_ctg_73.addAllListener(p);
		p.columnDispDtl_calc_ctg_73.setListListener(p);
		p.columnDispDtl_calc_ctg_74.addAllListener(p);
		p.columnDispDtl_calc_ctg_74.setListListener(p);
		p.columnDispDtl_calc_ctg_75.addAllListener(p);
		p.columnDispDtl_calc_ctg_75.setListListener(p);
		p.columnDispDtl_calc_ctg_76.addAllListener(p);
		p.columnDispDtl_calc_ctg_76.setListListener(p);
		p.columnDispDtl_calc_ctg_77.addAllListener(p);
		p.columnDispDtl_calc_ctg_77.setListListener(p);
		p.columnDispDtl_calc_ctg_78.addAllListener(p);
		p.columnDispDtl_calc_ctg_78.setListListener(p);
		p.columnDispDtl_calc_ctg_79.addAllListener(p);
		p.columnDispDtl_calc_ctg_79.setListListener(p);
		p.columnDispDtl_calc_ctg_80.addAllListener(p);
		p.columnDispDtl_calc_ctg_80.setListListener(p);
		p.columnDispDtl_calc_ctg_81.addAllListener(p);
		p.columnDispDtl_calc_ctg_81.setListListener(p);
		p.columnDispDtl_calc_ctg_82.addAllListener(p);
		p.columnDispDtl_calc_ctg_82.setListListener(p);
		p.columnDispDtl_calc_ctg_83.addAllListener(p);
		p.columnDispDtl_calc_ctg_83.setListListener(p);
		p.columnDispDtl_calc_ctg_84.addAllListener(p);
		p.columnDispDtl_calc_ctg_84.setListListener(p);
		p.columnDispDtl_calc_ctg_85.addAllListener(p);
		p.columnDispDtl_calc_ctg_85.setListListener(p);
		p.columnDispDtl_calc_ctg_86.addAllListener(p);
		p.columnDispDtl_calc_ctg_86.setListListener(p);
		p.columnDispDtl_calc_ctg_87.addAllListener(p);
		p.columnDispDtl_calc_ctg_87.setListListener(p);
		p.columnDispDtl_calc_ctg_88.addAllListener(p);
		p.columnDispDtl_calc_ctg_88.setListListener(p);
		p.columnDispDtl_calc_ctg_89.addAllListener(p);
		p.columnDispDtl_calc_ctg_89.setListListener(p);
		p.columnDispDtl_calc_ctg_90.addAllListener(p);
		p.columnDispDtl_calc_ctg_90.setListListener(p);
		p.columnDispDtl_calc_ctg_91.addAllListener(p);
		p.columnDispDtl_calc_ctg_91.setListListener(p);
		p.columnDispDtl_calc_ctg_92.addAllListener(p);
		p.columnDispDtl_calc_ctg_92.setListListener(p);
		p.columnDispDtl_calc_ctg_93.addAllListener(p);
		p.columnDispDtl_calc_ctg_93.setListListener(p);
		p.columnDispDtl_calc_ctg_94.addAllListener(p);
		p.columnDispDtl_calc_ctg_94.setListListener(p);
		p.columnDispDtl_calc_ctg_95.addAllListener(p);
		p.columnDispDtl_calc_ctg_95.setListListener(p);
		p.columnDispDtl_calc_ctg_96.addAllListener(p);
		p.columnDispDtl_calc_ctg_96.setListListener(p);
		p.columnDispDtl_calc_ctg_97.addAllListener(p);
		p.columnDispDtl_calc_ctg_97.setListListener(p);
		p.columnDispDtl_calc_ctg_98.addAllListener(p);
		p.columnDispDtl_calc_ctg_98.setListListener(p);
		p.columnDispDtl_calc_ctg_99.addAllListener(p);
		p.columnDispDtl_calc_ctg_99.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_GrpCtgReg p) {
		p.DtlTable.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABGP_GrpCtgReg p) {
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
	protected static void mcInitEastBtn(MABGP_GrpCtgReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_GrpCtgReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABGP_GrpCtgReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABGP_GrpCtgReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_GrpCtgReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABGP_GrpCtgReg p){

	}

	/**
	 * [UPD]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispDtl(MABGP_GrpCtgReg p){
		p.columnDispDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDispDtl_calc_ctg_00.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_01.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_02.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_03.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_04.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_05.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_06.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_07.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_08.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_09.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_11.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_13.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_15.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_17.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_19.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_20.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_21.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_22.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_23.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_24.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_25.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_26.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_27.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_28.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_29.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_30.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_31.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_32.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_33.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_34.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_35.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_36.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_37.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_38.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_39.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_40.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_41.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_42.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_43.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_44.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_45.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_46.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_47.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_48.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_49.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_50.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_51.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_52.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_53.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_54.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_55.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_56.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_57.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_58.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_59.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_60.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_61.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_62.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_63.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_64.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_65.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_66.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_67.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_68.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_69.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_70.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_71.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_72.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_73.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_74.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_75.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_76.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_77.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_78.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_79.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_80.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_81.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_82.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_83.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_84.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_85.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_86.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_87.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_88.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_89.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_90.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_91.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_92.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_93.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_94.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_95.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_96.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_97.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_98.putMode(p, UPD, MCMode.ENABLE);
		p.columnDispDtl_calc_ctg_99.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_GrpCtgReg p){

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABGP_GrpCtgReg p){
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
	protected static void statusInitUPD_EastBtn(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_GrpCtgReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DispDtl(MABGP_GrpCtgReg p){
		p.columnDispDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_00.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_01.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_02.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_03.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_04.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_05.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_06.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_07.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_08.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_09.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_21.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_22.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_23.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_24.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_25.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_26.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_27.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_28.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_29.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_30.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_31.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_32.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_33.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_34.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_35.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_36.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_37.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_38.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_39.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_40.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_41.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_42.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_43.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_44.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_45.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_46.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_47.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_48.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_49.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_50.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_51.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_52.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_53.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_54.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_55.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_56.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_57.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_58.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_59.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_60.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_61.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_62.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_63.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_64.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_65.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_66.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_67.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_68.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_69.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_70.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_71.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_72.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_73.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_74.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_75.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_76.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_77.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_78.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_79.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_80.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_81.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_82.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_83.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_84.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_85.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_86.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_87.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_88.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_89.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_90.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_91.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_92.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_93.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_94.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_95.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_96.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_97.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_98.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_99.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_GrpCtgReg p){

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABGP_GrpCtgReg p){
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
	protected static void statusInitFIX_EastBtn(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_GrpCtgReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DispDtl(MABGP_GrpCtgReg p){
		p.columnDispDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDispDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_00.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_01.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_02.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_03.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_04.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_05.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_06.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_07.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_08.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_09.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_20.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_21.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_22.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_23.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_24.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_25.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_26.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_27.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_28.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_29.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_30.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_31.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_32.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_33.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_34.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_35.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_36.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_37.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_38.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_39.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_40.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_41.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_42.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_43.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_44.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_45.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_46.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_47.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_48.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_49.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_50.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_51.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_52.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_53.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_54.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_55.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_56.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_57.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_58.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_59.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_60.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_61.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_62.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_63.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_64.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_65.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_66.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_67.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_68.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_69.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_70.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_71.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_72.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_73.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_74.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_75.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_76.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_77.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_78.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_79.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_80.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_81.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_82.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_83.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_84.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_85.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_86.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_87.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_88.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_89.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_90.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_91.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_92.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_93.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_94.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_95.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_96.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_97.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_98.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_99.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_GrpCtgReg p){

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABGP_GrpCtgReg p){
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
	protected static void statusInitDEL_EastBtn(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_GrpCtgReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MABGP_GrpCtgReg p){
		p.columnDispDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_31.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_32.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_33.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_34.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_35.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_36.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_37.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_38.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_39.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_40.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_41.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_42.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_43.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_44.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_45.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_46.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_47.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_48.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_49.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_50.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_51.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_52.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_53.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_54.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_55.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_56.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_57.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_58.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_59.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_60.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_61.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_62.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_63.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_64.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_65.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_66.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_67.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_68.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_69.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_70.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_71.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_72.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_73.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_74.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_75.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_76.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_77.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_78.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_79.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_80.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_81.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_82.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_83.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_84.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_85.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_86.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_87.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_88.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_89.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_90.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_91.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_92.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_93.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_94.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_95.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_96.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_97.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_98.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_calc_ctg_99.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_GrpCtgReg p){

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABGP_GrpCtgReg p){
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
	protected static void statusInitREF_EastBtn(MABGP_GrpCtgReg p){

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
		MABGP_GrpCtgReg_MC.setTableConfigDispDtl((MABGP_GrpCtgReg)this);
		MABGP_GrpCtgReg_MC.setTableConfigDtl((MABGP_GrpCtgReg)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MABGP_GrpCtgReg p) {
		p.columnDispDtl_check.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.check_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_check);
		p.columnDispDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.del_flg_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_del_flg);
		p.columnDispDtl_calc_grp_cd.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_grp_cd_META);
		p.columnDispDtl_calc_grp_cd.addLinkBeans(p.columnDispDtl_calc_grp_nm);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_grp_cd);
		p.columnDispDtl_calc_grp_nm.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_grp_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_grp_nm);
		p.columnDispDtl_ctg_prio.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.ctg_prio_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ctg_prio);
		p.columnDispDtl_calc_ctg_00.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_00_META);
		p.columnDispDtl_calc_ctg_00.addLinkBeans(p.columnDispDtl_calc_ctg_01);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_00);
		p.columnDispDtl_calc_ctg_01.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_01_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_01);
		p.columnDispDtl_calc_ctg_02.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_02_META);
		p.columnDispDtl_calc_ctg_02.addLinkBeans(p.columnDispDtl_calc_ctg_03);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_02);
		p.columnDispDtl_calc_ctg_03.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_03_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_03);
		p.columnDispDtl_calc_ctg_04.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_04_META);
		p.columnDispDtl_calc_ctg_04.addLinkBeans(p.columnDispDtl_calc_ctg_05);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_04);
		p.columnDispDtl_calc_ctg_05.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_05_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_05);
		p.columnDispDtl_calc_ctg_06.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_06_META);
		p.columnDispDtl_calc_ctg_06.addLinkBeans(p.columnDispDtl_calc_ctg_07);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_06);
		p.columnDispDtl_calc_ctg_07.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_07_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_07);
		p.columnDispDtl_calc_ctg_08.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_08_META);
		p.columnDispDtl_calc_ctg_08.addLinkBeans(p.columnDispDtl_calc_ctg_09);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_08);
		p.columnDispDtl_calc_ctg_09.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_09_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_09);
		p.columnDispDtl_calc_ctg_10.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_10_META);
		p.columnDispDtl_calc_ctg_10.addLinkBeans(p.columnDispDtl_calc_ctg_11);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_10);
		p.columnDispDtl_calc_ctg_11.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_11_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_11);
		p.columnDispDtl_calc_ctg_12.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_12_META);
		p.columnDispDtl_calc_ctg_12.addLinkBeans(p.columnDispDtl_calc_ctg_13);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_12);
		p.columnDispDtl_calc_ctg_13.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_13_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_13);
		p.columnDispDtl_calc_ctg_14.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_14_META);
		p.columnDispDtl_calc_ctg_14.addLinkBeans(p.columnDispDtl_calc_ctg_15);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_14);
		p.columnDispDtl_calc_ctg_15.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_15_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_15);
		p.columnDispDtl_calc_ctg_16.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_16_META);
		p.columnDispDtl_calc_ctg_16.addLinkBeans(p.columnDispDtl_calc_ctg_17);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_16);
		p.columnDispDtl_calc_ctg_17.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_17_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_17);
		p.columnDispDtl_calc_ctg_18.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_18_META);
		p.columnDispDtl_calc_ctg_18.addLinkBeans(p.columnDispDtl_calc_ctg_19);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_18);
		p.columnDispDtl_calc_ctg_19.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_19_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_19);
		p.columnDispDtl_calc_ctg_20.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_20_META);
		p.columnDispDtl_calc_ctg_20.addLinkBeans(p.columnDispDtl_calc_ctg_21);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_20);
		p.columnDispDtl_calc_ctg_21.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_21_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_21);
		p.columnDispDtl_calc_ctg_22.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_22_META);
		p.columnDispDtl_calc_ctg_22.addLinkBeans(p.columnDispDtl_calc_ctg_23);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_22);
		p.columnDispDtl_calc_ctg_23.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_23_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_23);
		p.columnDispDtl_calc_ctg_24.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_24_META);
		p.columnDispDtl_calc_ctg_24.addLinkBeans(p.columnDispDtl_calc_ctg_25);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_24);
		p.columnDispDtl_calc_ctg_25.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_25_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_25);
		p.columnDispDtl_calc_ctg_26.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_26_META);
		p.columnDispDtl_calc_ctg_26.addLinkBeans(p.columnDispDtl_calc_ctg_27);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_26);
		p.columnDispDtl_calc_ctg_27.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_27_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_27);
		p.columnDispDtl_calc_ctg_28.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_28_META);
		p.columnDispDtl_calc_ctg_28.addLinkBeans(p.columnDispDtl_calc_ctg_29);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_28);
		p.columnDispDtl_calc_ctg_29.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_29_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_29);
		p.columnDispDtl_calc_ctg_30.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_30_META);
		p.columnDispDtl_calc_ctg_30.addLinkBeans(p.columnDispDtl_calc_ctg_31);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_30);
		p.columnDispDtl_calc_ctg_31.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_31_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_31);
		p.columnDispDtl_calc_ctg_32.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_32_META);
		p.columnDispDtl_calc_ctg_32.addLinkBeans(p.columnDispDtl_calc_ctg_33);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_32);
		p.columnDispDtl_calc_ctg_33.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_33_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_33);
		p.columnDispDtl_calc_ctg_34.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_34_META);
		p.columnDispDtl_calc_ctg_34.addLinkBeans(p.columnDispDtl_calc_ctg_35);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_34);
		p.columnDispDtl_calc_ctg_35.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_35_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_35);
		p.columnDispDtl_calc_ctg_36.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_36_META);
		p.columnDispDtl_calc_ctg_36.addLinkBeans(p.columnDispDtl_calc_ctg_37);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_36);
		p.columnDispDtl_calc_ctg_37.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_37_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_37);
		p.columnDispDtl_calc_ctg_38.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_38_META);
		p.columnDispDtl_calc_ctg_38.addLinkBeans(p.columnDispDtl_calc_ctg_39);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_38);
		p.columnDispDtl_calc_ctg_39.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_39_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_39);
		p.columnDispDtl_calc_ctg_40.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_40_META);
		p.columnDispDtl_calc_ctg_40.addLinkBeans(p.columnDispDtl_calc_ctg_41);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_40);
		p.columnDispDtl_calc_ctg_41.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_41_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_41);
		p.columnDispDtl_calc_ctg_42.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_42_META);
		p.columnDispDtl_calc_ctg_42.addLinkBeans(p.columnDispDtl_calc_ctg_43);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_42);
		p.columnDispDtl_calc_ctg_43.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_43_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_43);
		p.columnDispDtl_calc_ctg_44.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_44_META);
		p.columnDispDtl_calc_ctg_44.addLinkBeans(p.columnDispDtl_calc_ctg_45);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_44);
		p.columnDispDtl_calc_ctg_45.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_45_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_45);
		p.columnDispDtl_calc_ctg_46.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_46_META);
		p.columnDispDtl_calc_ctg_46.addLinkBeans(p.columnDispDtl_calc_ctg_47);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_46);
		p.columnDispDtl_calc_ctg_47.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_47_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_47);
		p.columnDispDtl_calc_ctg_48.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_48_META);
		p.columnDispDtl_calc_ctg_48.addLinkBeans(p.columnDispDtl_calc_ctg_49);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_48);
		p.columnDispDtl_calc_ctg_49.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_49_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_49);
		p.columnDispDtl_calc_ctg_50.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_50_META);
		p.columnDispDtl_calc_ctg_50.addLinkBeans(p.columnDispDtl_calc_ctg_51);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_50);
		p.columnDispDtl_calc_ctg_51.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_51_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_51);
		p.columnDispDtl_calc_ctg_52.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_52_META);
		p.columnDispDtl_calc_ctg_52.addLinkBeans(p.columnDispDtl_calc_ctg_53);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_52);
		p.columnDispDtl_calc_ctg_53.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_53_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_53);
		p.columnDispDtl_calc_ctg_54.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_54_META);
		p.columnDispDtl_calc_ctg_54.addLinkBeans(p.columnDispDtl_calc_ctg_55);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_54);
		p.columnDispDtl_calc_ctg_55.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_55_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_55);
		p.columnDispDtl_calc_ctg_56.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_56_META);
		p.columnDispDtl_calc_ctg_56.addLinkBeans(p.columnDispDtl_calc_ctg_57);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_56);
		p.columnDispDtl_calc_ctg_57.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_57_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_57);
		p.columnDispDtl_calc_ctg_58.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_58_META);
		p.columnDispDtl_calc_ctg_58.addLinkBeans(p.columnDispDtl_calc_ctg_59);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_58);
		p.columnDispDtl_calc_ctg_59.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_59_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_59);
		p.columnDispDtl_calc_ctg_60.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_60_META);
		p.columnDispDtl_calc_ctg_60.addLinkBeans(p.columnDispDtl_calc_ctg_61);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_60);
		p.columnDispDtl_calc_ctg_61.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_61_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_61);
		p.columnDispDtl_calc_ctg_62.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_62_META);
		p.columnDispDtl_calc_ctg_62.addLinkBeans(p.columnDispDtl_calc_ctg_63);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_62);
		p.columnDispDtl_calc_ctg_63.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_63_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_63);
		p.columnDispDtl_calc_ctg_64.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_64_META);
		p.columnDispDtl_calc_ctg_64.addLinkBeans(p.columnDispDtl_calc_ctg_65);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_64);
		p.columnDispDtl_calc_ctg_65.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_65_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_65);
		p.columnDispDtl_calc_ctg_66.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_66_META);
		p.columnDispDtl_calc_ctg_66.addLinkBeans(p.columnDispDtl_calc_ctg_67);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_66);
		p.columnDispDtl_calc_ctg_67.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_67_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_67);
		p.columnDispDtl_calc_ctg_68.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_68_META);
		p.columnDispDtl_calc_ctg_68.addLinkBeans(p.columnDispDtl_calc_ctg_69);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_68);
		p.columnDispDtl_calc_ctg_69.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_69_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_69);
		p.columnDispDtl_calc_ctg_70.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_70_META);
		p.columnDispDtl_calc_ctg_70.addLinkBeans(p.columnDispDtl_calc_ctg_71);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_70);
		p.columnDispDtl_calc_ctg_71.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_71_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_71);
		p.columnDispDtl_calc_ctg_72.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_72_META);
		p.columnDispDtl_calc_ctg_72.addLinkBeans(p.columnDispDtl_calc_ctg_73);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_72);
		p.columnDispDtl_calc_ctg_73.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_73_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_73);
		p.columnDispDtl_calc_ctg_74.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_74_META);
		p.columnDispDtl_calc_ctg_74.addLinkBeans(p.columnDispDtl_calc_ctg_75);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_74);
		p.columnDispDtl_calc_ctg_75.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_75_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_75);
		p.columnDispDtl_calc_ctg_76.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_76_META);
		p.columnDispDtl_calc_ctg_76.addLinkBeans(p.columnDispDtl_calc_ctg_77);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_76);
		p.columnDispDtl_calc_ctg_77.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_77_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_77);
		p.columnDispDtl_calc_ctg_78.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_78_META);
		p.columnDispDtl_calc_ctg_78.addLinkBeans(p.columnDispDtl_calc_ctg_79);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_78);
		p.columnDispDtl_calc_ctg_79.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_79_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_79);
		p.columnDispDtl_calc_ctg_80.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_80_META);
		p.columnDispDtl_calc_ctg_80.addLinkBeans(p.columnDispDtl_calc_ctg_81);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_80);
		p.columnDispDtl_calc_ctg_81.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_81_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_81);
		p.columnDispDtl_calc_ctg_82.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_82_META);
		p.columnDispDtl_calc_ctg_82.addLinkBeans(p.columnDispDtl_calc_ctg_83);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_82);
		p.columnDispDtl_calc_ctg_83.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_83_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_83);
		p.columnDispDtl_calc_ctg_84.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_84_META);
		p.columnDispDtl_calc_ctg_84.addLinkBeans(p.columnDispDtl_calc_ctg_85);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_84);
		p.columnDispDtl_calc_ctg_85.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_85_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_85);
		p.columnDispDtl_calc_ctg_86.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_86_META);
		p.columnDispDtl_calc_ctg_86.addLinkBeans(p.columnDispDtl_calc_ctg_87);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_86);
		p.columnDispDtl_calc_ctg_87.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_87_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_87);
		p.columnDispDtl_calc_ctg_88.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_88_META);
		p.columnDispDtl_calc_ctg_88.addLinkBeans(p.columnDispDtl_calc_ctg_89);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_88);
		p.columnDispDtl_calc_ctg_89.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_89_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_89);
		p.columnDispDtl_calc_ctg_90.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_90_META);
		p.columnDispDtl_calc_ctg_90.addLinkBeans(p.columnDispDtl_calc_ctg_91);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_90);
		p.columnDispDtl_calc_ctg_91.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_91_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_91);
		p.columnDispDtl_calc_ctg_92.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_92_META);
		p.columnDispDtl_calc_ctg_92.addLinkBeans(p.columnDispDtl_calc_ctg_93);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_92);
		p.columnDispDtl_calc_ctg_93.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_93_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_93);
		p.columnDispDtl_calc_ctg_94.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_94_META);
		p.columnDispDtl_calc_ctg_94.addLinkBeans(p.columnDispDtl_calc_ctg_95);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_94);
		p.columnDispDtl_calc_ctg_95.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_95_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_95);
		p.columnDispDtl_calc_ctg_96.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_96_META);
		p.columnDispDtl_calc_ctg_96.addLinkBeans(p.columnDispDtl_calc_ctg_97);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_96);
		p.columnDispDtl_calc_ctg_97.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_97_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_97);
		p.columnDispDtl_calc_ctg_98.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_98_META);
		p.columnDispDtl_calc_ctg_98.addLinkBeans(p.columnDispDtl_calc_ctg_99);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_98);
		p.columnDispDtl_calc_ctg_99.setMeta(mcframe.clientMABG.MABGP0060.DispDtlR.calc_ctg_99_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_calc_ctg_99);
		p.cgDispDtl_calc_ctg_typ_cg_00.add(p.columnDispDtl_calc_ctg_00);
		p.cgDispDtl_calc_ctg_typ_cg_00.add(p.columnDispDtl_calc_ctg_01);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_00);
		p.cgDispDtl_calc_ctg_typ_cg_01.add(p.columnDispDtl_calc_ctg_02);
		p.cgDispDtl_calc_ctg_typ_cg_01.add(p.columnDispDtl_calc_ctg_03);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_01);
		p.cgDispDtl_calc_ctg_typ_cg_02.add(p.columnDispDtl_calc_ctg_04);
		p.cgDispDtl_calc_ctg_typ_cg_02.add(p.columnDispDtl_calc_ctg_05);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_02);
		p.cgDispDtl_calc_ctg_typ_cg_03.add(p.columnDispDtl_calc_ctg_06);
		p.cgDispDtl_calc_ctg_typ_cg_03.add(p.columnDispDtl_calc_ctg_07);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_03);
		p.cgDispDtl_calc_ctg_typ_cg_04.add(p.columnDispDtl_calc_ctg_08);
		p.cgDispDtl_calc_ctg_typ_cg_04.add(p.columnDispDtl_calc_ctg_09);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_04);
		p.cgDispDtl_calc_ctg_typ_cg_05.add(p.columnDispDtl_calc_ctg_10);
		p.cgDispDtl_calc_ctg_typ_cg_05.add(p.columnDispDtl_calc_ctg_11);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_05);
		p.cgDispDtl_calc_ctg_typ_cg_06.add(p.columnDispDtl_calc_ctg_12);
		p.cgDispDtl_calc_ctg_typ_cg_06.add(p.columnDispDtl_calc_ctg_13);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_06);
		p.cgDispDtl_calc_ctg_typ_cg_07.add(p.columnDispDtl_calc_ctg_14);
		p.cgDispDtl_calc_ctg_typ_cg_07.add(p.columnDispDtl_calc_ctg_15);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_07);
		p.cgDispDtl_calc_ctg_typ_cg_08.add(p.columnDispDtl_calc_ctg_16);
		p.cgDispDtl_calc_ctg_typ_cg_08.add(p.columnDispDtl_calc_ctg_17);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_08);
		p.cgDispDtl_calc_ctg_typ_cg_09.add(p.columnDispDtl_calc_ctg_18);
		p.cgDispDtl_calc_ctg_typ_cg_09.add(p.columnDispDtl_calc_ctg_19);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_09);
		p.cgDispDtl_calc_ctg_typ_cg_10.add(p.columnDispDtl_calc_ctg_20);
		p.cgDispDtl_calc_ctg_typ_cg_10.add(p.columnDispDtl_calc_ctg_21);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_10);
		p.cgDispDtl_calc_ctg_typ_cg_11.add(p.columnDispDtl_calc_ctg_22);
		p.cgDispDtl_calc_ctg_typ_cg_11.add(p.columnDispDtl_calc_ctg_23);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_11);
		p.cgDispDtl_calc_ctg_typ_cg_12.add(p.columnDispDtl_calc_ctg_24);
		p.cgDispDtl_calc_ctg_typ_cg_12.add(p.columnDispDtl_calc_ctg_25);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_12);
		p.cgDispDtl_calc_ctg_typ_cg_13.add(p.columnDispDtl_calc_ctg_26);
		p.cgDispDtl_calc_ctg_typ_cg_13.add(p.columnDispDtl_calc_ctg_27);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_13);
		p.cgDispDtl_calc_ctg_typ_cg_14.add(p.columnDispDtl_calc_ctg_28);
		p.cgDispDtl_calc_ctg_typ_cg_14.add(p.columnDispDtl_calc_ctg_29);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_14);
		p.cgDispDtl_calc_ctg_typ_cg_15.add(p.columnDispDtl_calc_ctg_30);
		p.cgDispDtl_calc_ctg_typ_cg_15.add(p.columnDispDtl_calc_ctg_31);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_15);
		p.cgDispDtl_calc_ctg_typ_cg_16.add(p.columnDispDtl_calc_ctg_32);
		p.cgDispDtl_calc_ctg_typ_cg_16.add(p.columnDispDtl_calc_ctg_33);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_16);
		p.cgDispDtl_calc_ctg_typ_cg_17.add(p.columnDispDtl_calc_ctg_34);
		p.cgDispDtl_calc_ctg_typ_cg_17.add(p.columnDispDtl_calc_ctg_35);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_17);
		p.cgDispDtl_calc_ctg_typ_cg_18.add(p.columnDispDtl_calc_ctg_36);
		p.cgDispDtl_calc_ctg_typ_cg_18.add(p.columnDispDtl_calc_ctg_37);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_18);
		p.cgDispDtl_calc_ctg_typ_cg_19.add(p.columnDispDtl_calc_ctg_38);
		p.cgDispDtl_calc_ctg_typ_cg_19.add(p.columnDispDtl_calc_ctg_39);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_19);
		p.cgDispDtl_calc_ctg_typ_cg_20.add(p.columnDispDtl_calc_ctg_40);
		p.cgDispDtl_calc_ctg_typ_cg_20.add(p.columnDispDtl_calc_ctg_41);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_20);
		p.cgDispDtl_calc_ctg_typ_cg_21.add(p.columnDispDtl_calc_ctg_42);
		p.cgDispDtl_calc_ctg_typ_cg_21.add(p.columnDispDtl_calc_ctg_43);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_21);
		p.cgDispDtl_calc_ctg_typ_cg_22.add(p.columnDispDtl_calc_ctg_44);
		p.cgDispDtl_calc_ctg_typ_cg_22.add(p.columnDispDtl_calc_ctg_45);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_22);
		p.cgDispDtl_calc_ctg_typ_cg_23.add(p.columnDispDtl_calc_ctg_46);
		p.cgDispDtl_calc_ctg_typ_cg_23.add(p.columnDispDtl_calc_ctg_47);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_23);
		p.cgDispDtl_calc_ctg_typ_cg_24.add(p.columnDispDtl_calc_ctg_48);
		p.cgDispDtl_calc_ctg_typ_cg_24.add(p.columnDispDtl_calc_ctg_49);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_24);
		p.cgDispDtl_calc_ctg_typ_cg_25.add(p.columnDispDtl_calc_ctg_50);
		p.cgDispDtl_calc_ctg_typ_cg_25.add(p.columnDispDtl_calc_ctg_51);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_25);
		p.cgDispDtl_calc_ctg_typ_cg_26.add(p.columnDispDtl_calc_ctg_52);
		p.cgDispDtl_calc_ctg_typ_cg_26.add(p.columnDispDtl_calc_ctg_53);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_26);
		p.cgDispDtl_calc_ctg_typ_cg_27.add(p.columnDispDtl_calc_ctg_54);
		p.cgDispDtl_calc_ctg_typ_cg_27.add(p.columnDispDtl_calc_ctg_55);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_27);
		p.cgDispDtl_calc_ctg_typ_cg_28.add(p.columnDispDtl_calc_ctg_56);
		p.cgDispDtl_calc_ctg_typ_cg_28.add(p.columnDispDtl_calc_ctg_57);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_28);
		p.cgDispDtl_calc_ctg_typ_cg_29.add(p.columnDispDtl_calc_ctg_58);
		p.cgDispDtl_calc_ctg_typ_cg_29.add(p.columnDispDtl_calc_ctg_59);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_29);
		p.cgDispDtl_calc_ctg_typ_cg_30.add(p.columnDispDtl_calc_ctg_60);
		p.cgDispDtl_calc_ctg_typ_cg_30.add(p.columnDispDtl_calc_ctg_61);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_30);
		p.cgDispDtl_calc_ctg_typ_cg_31.add(p.columnDispDtl_calc_ctg_62);
		p.cgDispDtl_calc_ctg_typ_cg_31.add(p.columnDispDtl_calc_ctg_63);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_31);
		p.cgDispDtl_calc_ctg_typ_cg_32.add(p.columnDispDtl_calc_ctg_64);
		p.cgDispDtl_calc_ctg_typ_cg_32.add(p.columnDispDtl_calc_ctg_65);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_32);
		p.cgDispDtl_calc_ctg_typ_cg_33.add(p.columnDispDtl_calc_ctg_66);
		p.cgDispDtl_calc_ctg_typ_cg_33.add(p.columnDispDtl_calc_ctg_67);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_33);
		p.cgDispDtl_calc_ctg_typ_cg_34.add(p.columnDispDtl_calc_ctg_68);
		p.cgDispDtl_calc_ctg_typ_cg_34.add(p.columnDispDtl_calc_ctg_69);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_34);
		p.cgDispDtl_calc_ctg_typ_cg_35.add(p.columnDispDtl_calc_ctg_70);
		p.cgDispDtl_calc_ctg_typ_cg_35.add(p.columnDispDtl_calc_ctg_71);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_35);
		p.cgDispDtl_calc_ctg_typ_cg_36.add(p.columnDispDtl_calc_ctg_72);
		p.cgDispDtl_calc_ctg_typ_cg_36.add(p.columnDispDtl_calc_ctg_73);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_36);
		p.cgDispDtl_calc_ctg_typ_cg_37.add(p.columnDispDtl_calc_ctg_74);
		p.cgDispDtl_calc_ctg_typ_cg_37.add(p.columnDispDtl_calc_ctg_75);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_37);
		p.cgDispDtl_calc_ctg_typ_cg_38.add(p.columnDispDtl_calc_ctg_76);
		p.cgDispDtl_calc_ctg_typ_cg_38.add(p.columnDispDtl_calc_ctg_77);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_38);
		p.cgDispDtl_calc_ctg_typ_cg_39.add(p.columnDispDtl_calc_ctg_78);
		p.cgDispDtl_calc_ctg_typ_cg_39.add(p.columnDispDtl_calc_ctg_79);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_39);
		p.cgDispDtl_calc_ctg_typ_cg_40.add(p.columnDispDtl_calc_ctg_80);
		p.cgDispDtl_calc_ctg_typ_cg_40.add(p.columnDispDtl_calc_ctg_81);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_40);
		p.cgDispDtl_calc_ctg_typ_cg_41.add(p.columnDispDtl_calc_ctg_82);
		p.cgDispDtl_calc_ctg_typ_cg_41.add(p.columnDispDtl_calc_ctg_83);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_41);
		p.cgDispDtl_calc_ctg_typ_cg_42.add(p.columnDispDtl_calc_ctg_84);
		p.cgDispDtl_calc_ctg_typ_cg_42.add(p.columnDispDtl_calc_ctg_85);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_42);
		p.cgDispDtl_calc_ctg_typ_cg_43.add(p.columnDispDtl_calc_ctg_86);
		p.cgDispDtl_calc_ctg_typ_cg_43.add(p.columnDispDtl_calc_ctg_87);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_43);
		p.cgDispDtl_calc_ctg_typ_cg_44.add(p.columnDispDtl_calc_ctg_88);
		p.cgDispDtl_calc_ctg_typ_cg_44.add(p.columnDispDtl_calc_ctg_89);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_44);
		p.cgDispDtl_calc_ctg_typ_cg_45.add(p.columnDispDtl_calc_ctg_90);
		p.cgDispDtl_calc_ctg_typ_cg_45.add(p.columnDispDtl_calc_ctg_91);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_45);
		p.cgDispDtl_calc_ctg_typ_cg_46.add(p.columnDispDtl_calc_ctg_92);
		p.cgDispDtl_calc_ctg_typ_cg_46.add(p.columnDispDtl_calc_ctg_93);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_46);
		p.cgDispDtl_calc_ctg_typ_cg_47.add(p.columnDispDtl_calc_ctg_94);
		p.cgDispDtl_calc_ctg_typ_cg_47.add(p.columnDispDtl_calc_ctg_95);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_47);
		p.cgDispDtl_calc_ctg_typ_cg_48.add(p.columnDispDtl_calc_ctg_96);
		p.cgDispDtl_calc_ctg_typ_cg_48.add(p.columnDispDtl_calc_ctg_97);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_48);
		p.cgDispDtl_calc_ctg_typ_cg_49.add(p.columnDispDtl_calc_ctg_98);
		p.cgDispDtl_calc_ctg_typ_cg_49.add(p.columnDispDtl_calc_ctg_99);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_calc_ctg_typ_cg_49);
		// スクロール固定カラムの指定
		p.DispDtlTable.setUnscrollColumn(p.columnDispDtl_del_flg);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_GrpCtgReg p) {
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		columnDispDtl_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_grp_cd.getListConfig().setPutter(getDispDtl_calc_grp_cd_ListPutter());
		columnDispDtl_calc_ctg_00.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_00.getListConfig().setPutter(getDispDtl_calc_ctg_00_ListPutter());
		columnDispDtl_calc_ctg_02.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_02.getListConfig().setPutter(getDispDtl_calc_ctg_02_ListPutter());
		columnDispDtl_calc_ctg_04.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_04.getListConfig().setPutter(getDispDtl_calc_ctg_04_ListPutter());
		columnDispDtl_calc_ctg_06.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_06.getListConfig().setPutter(getDispDtl_calc_ctg_06_ListPutter());
		columnDispDtl_calc_ctg_08.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_08.getListConfig().setPutter(getDispDtl_calc_ctg_08_ListPutter());
		columnDispDtl_calc_ctg_10.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_10.getListConfig().setPutter(getDispDtl_calc_ctg_10_ListPutter());
		columnDispDtl_calc_ctg_12.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_12.getListConfig().setPutter(getDispDtl_calc_ctg_12_ListPutter());
		columnDispDtl_calc_ctg_14.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_14.getListConfig().setPutter(getDispDtl_calc_ctg_14_ListPutter());
		columnDispDtl_calc_ctg_16.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_16.getListConfig().setPutter(getDispDtl_calc_ctg_16_ListPutter());
		columnDispDtl_calc_ctg_18.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_18.getListConfig().setPutter(getDispDtl_calc_ctg_18_ListPutter());
		columnDispDtl_calc_ctg_20.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_20.getListConfig().setPutter(getDispDtl_calc_ctg_20_ListPutter());
		columnDispDtl_calc_ctg_22.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_22.getListConfig().setPutter(getDispDtl_calc_ctg_22_ListPutter());
		columnDispDtl_calc_ctg_24.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_24.getListConfig().setPutter(getDispDtl_calc_ctg_24_ListPutter());
		columnDispDtl_calc_ctg_26.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_26.getListConfig().setPutter(getDispDtl_calc_ctg_26_ListPutter());
		columnDispDtl_calc_ctg_28.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_28.getListConfig().setPutter(getDispDtl_calc_ctg_28_ListPutter());
		columnDispDtl_calc_ctg_30.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_30.getListConfig().setPutter(getDispDtl_calc_ctg_30_ListPutter());
		columnDispDtl_calc_ctg_32.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_32.getListConfig().setPutter(getDispDtl_calc_ctg_32_ListPutter());
		columnDispDtl_calc_ctg_34.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_34.getListConfig().setPutter(getDispDtl_calc_ctg_34_ListPutter());
		columnDispDtl_calc_ctg_36.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_36.getListConfig().setPutter(getDispDtl_calc_ctg_36_ListPutter());
		columnDispDtl_calc_ctg_38.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_38.getListConfig().setPutter(getDispDtl_calc_ctg_38_ListPutter());
		columnDispDtl_calc_ctg_40.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_40.getListConfig().setPutter(getDispDtl_calc_ctg_40_ListPutter());
		columnDispDtl_calc_ctg_42.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_42.getListConfig().setPutter(getDispDtl_calc_ctg_42_ListPutter());
		columnDispDtl_calc_ctg_44.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_44.getListConfig().setPutter(getDispDtl_calc_ctg_44_ListPutter());
		columnDispDtl_calc_ctg_46.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_46.getListConfig().setPutter(getDispDtl_calc_ctg_46_ListPutter());
		columnDispDtl_calc_ctg_48.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_48.getListConfig().setPutter(getDispDtl_calc_ctg_48_ListPutter());
		columnDispDtl_calc_ctg_50.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_50.getListConfig().setPutter(getDispDtl_calc_ctg_50_ListPutter());
		columnDispDtl_calc_ctg_52.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_52.getListConfig().setPutter(getDispDtl_calc_ctg_52_ListPutter());
		columnDispDtl_calc_ctg_54.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_54.getListConfig().setPutter(getDispDtl_calc_ctg_54_ListPutter());
		columnDispDtl_calc_ctg_56.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_56.getListConfig().setPutter(getDispDtl_calc_ctg_56_ListPutter());
		columnDispDtl_calc_ctg_58.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_58.getListConfig().setPutter(getDispDtl_calc_ctg_58_ListPutter());
		columnDispDtl_calc_ctg_60.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_60.getListConfig().setPutter(getDispDtl_calc_ctg_60_ListPutter());
		columnDispDtl_calc_ctg_62.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_62.getListConfig().setPutter(getDispDtl_calc_ctg_62_ListPutter());
		columnDispDtl_calc_ctg_64.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_64.getListConfig().setPutter(getDispDtl_calc_ctg_64_ListPutter());
		columnDispDtl_calc_ctg_66.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_66.getListConfig().setPutter(getDispDtl_calc_ctg_66_ListPutter());
		columnDispDtl_calc_ctg_68.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_68.getListConfig().setPutter(getDispDtl_calc_ctg_68_ListPutter());
		columnDispDtl_calc_ctg_70.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_70.getListConfig().setPutter(getDispDtl_calc_ctg_70_ListPutter());
		columnDispDtl_calc_ctg_72.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_72.getListConfig().setPutter(getDispDtl_calc_ctg_72_ListPutter());
		columnDispDtl_calc_ctg_74.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_74.getListConfig().setPutter(getDispDtl_calc_ctg_74_ListPutter());
		columnDispDtl_calc_ctg_76.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_76.getListConfig().setPutter(getDispDtl_calc_ctg_76_ListPutter());
		columnDispDtl_calc_ctg_78.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_78.getListConfig().setPutter(getDispDtl_calc_ctg_78_ListPutter());
		columnDispDtl_calc_ctg_80.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_80.getListConfig().setPutter(getDispDtl_calc_ctg_80_ListPutter());
		columnDispDtl_calc_ctg_82.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_82.getListConfig().setPutter(getDispDtl_calc_ctg_82_ListPutter());
		columnDispDtl_calc_ctg_84.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_84.getListConfig().setPutter(getDispDtl_calc_ctg_84_ListPutter());
		columnDispDtl_calc_ctg_86.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_86.getListConfig().setPutter(getDispDtl_calc_ctg_86_ListPutter());
		columnDispDtl_calc_ctg_88.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_88.getListConfig().setPutter(getDispDtl_calc_ctg_88_ListPutter());
		columnDispDtl_calc_ctg_90.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_90.getListConfig().setPutter(getDispDtl_calc_ctg_90_ListPutter());
		columnDispDtl_calc_ctg_92.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_92.getListConfig().setPutter(getDispDtl_calc_ctg_92_ListPutter());
		columnDispDtl_calc_ctg_94.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_94.getListConfig().setPutter(getDispDtl_calc_ctg_94_ListPutter());
		columnDispDtl_calc_ctg_96.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_96.getListConfig().setPutter(getDispDtl_calc_ctg_96_ListPutter());
		columnDispDtl_calc_ctg_98.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDispDtl_calc_ctg_98.getListConfig().setPutter(getDispDtl_calc_ctg_98_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_00_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_00_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_02_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_02_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_04_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_04_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_06_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_06_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_08_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_08_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_10_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_12_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_12_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_14_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_14_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_16_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_16_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_18_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_18_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_20_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_20_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_22_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_22_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_24_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_24_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_26_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_26_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_28_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_28_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_30_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_30_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_32_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_32_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_34_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_34_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_36_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_36_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_38_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_38_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_40_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_40_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_42_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_42_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_44_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_44_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_46_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_46_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_48_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_48_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_50_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_50_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_52_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_52_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_54_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_54_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_56_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_56_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_58_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_58_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_60_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_60_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_62_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_62_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_64_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_64_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_66_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_66_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_68_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_68_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_70_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_70_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_72_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_72_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_74_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_74_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_76_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_76_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_78_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_78_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_80_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_80_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_82_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_82_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_84_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_84_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_86_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_86_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_88_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_88_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_90_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_90_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_92_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_92_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_94_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_94_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_96_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_96_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DispDtl_calc_ctg_98_ListPutter]の作成
	 */
	protected MCListPutter createDispDtl_calc_ctg_98_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == columnDispDtl_calc_grp_cd) return getDispDtl_calc_grp_cd(row, info);
		if(combo == columnDispDtl_calc_ctg_00) return getDispDtl_calc_ctg_00(row, info);
		if(combo == columnDispDtl_calc_ctg_02) return getDispDtl_calc_ctg_02(row, info);
		if(combo == columnDispDtl_calc_ctg_04) return getDispDtl_calc_ctg_04(row, info);
		if(combo == columnDispDtl_calc_ctg_06) return getDispDtl_calc_ctg_06(row, info);
		if(combo == columnDispDtl_calc_ctg_08) return getDispDtl_calc_ctg_08(row, info);
		if(combo == columnDispDtl_calc_ctg_10) return getDispDtl_calc_ctg_10(row, info);
		if(combo == columnDispDtl_calc_ctg_12) return getDispDtl_calc_ctg_12(row, info);
		if(combo == columnDispDtl_calc_ctg_14) return getDispDtl_calc_ctg_14(row, info);
		if(combo == columnDispDtl_calc_ctg_16) return getDispDtl_calc_ctg_16(row, info);
		if(combo == columnDispDtl_calc_ctg_18) return getDispDtl_calc_ctg_18(row, info);
		if(combo == columnDispDtl_calc_ctg_20) return getDispDtl_calc_ctg_20(row, info);
		if(combo == columnDispDtl_calc_ctg_22) return getDispDtl_calc_ctg_22(row, info);
		if(combo == columnDispDtl_calc_ctg_24) return getDispDtl_calc_ctg_24(row, info);
		if(combo == columnDispDtl_calc_ctg_26) return getDispDtl_calc_ctg_26(row, info);
		if(combo == columnDispDtl_calc_ctg_28) return getDispDtl_calc_ctg_28(row, info);
		if(combo == columnDispDtl_calc_ctg_30) return getDispDtl_calc_ctg_30(row, info);
		if(combo == columnDispDtl_calc_ctg_32) return getDispDtl_calc_ctg_32(row, info);
		if(combo == columnDispDtl_calc_ctg_34) return getDispDtl_calc_ctg_34(row, info);
		if(combo == columnDispDtl_calc_ctg_36) return getDispDtl_calc_ctg_36(row, info);
		if(combo == columnDispDtl_calc_ctg_38) return getDispDtl_calc_ctg_38(row, info);
		if(combo == columnDispDtl_calc_ctg_40) return getDispDtl_calc_ctg_40(row, info);
		if(combo == columnDispDtl_calc_ctg_42) return getDispDtl_calc_ctg_42(row, info);
		if(combo == columnDispDtl_calc_ctg_44) return getDispDtl_calc_ctg_44(row, info);
		if(combo == columnDispDtl_calc_ctg_46) return getDispDtl_calc_ctg_46(row, info);
		if(combo == columnDispDtl_calc_ctg_48) return getDispDtl_calc_ctg_48(row, info);
		if(combo == columnDispDtl_calc_ctg_50) return getDispDtl_calc_ctg_50(row, info);
		if(combo == columnDispDtl_calc_ctg_52) return getDispDtl_calc_ctg_52(row, info);
		if(combo == columnDispDtl_calc_ctg_54) return getDispDtl_calc_ctg_54(row, info);
		if(combo == columnDispDtl_calc_ctg_56) return getDispDtl_calc_ctg_56(row, info);
		if(combo == columnDispDtl_calc_ctg_58) return getDispDtl_calc_ctg_58(row, info);
		if(combo == columnDispDtl_calc_ctg_60) return getDispDtl_calc_ctg_60(row, info);
		if(combo == columnDispDtl_calc_ctg_62) return getDispDtl_calc_ctg_62(row, info);
		if(combo == columnDispDtl_calc_ctg_64) return getDispDtl_calc_ctg_64(row, info);
		if(combo == columnDispDtl_calc_ctg_66) return getDispDtl_calc_ctg_66(row, info);
		if(combo == columnDispDtl_calc_ctg_68) return getDispDtl_calc_ctg_68(row, info);
		if(combo == columnDispDtl_calc_ctg_70) return getDispDtl_calc_ctg_70(row, info);
		if(combo == columnDispDtl_calc_ctg_72) return getDispDtl_calc_ctg_72(row, info);
		if(combo == columnDispDtl_calc_ctg_74) return getDispDtl_calc_ctg_74(row, info);
		if(combo == columnDispDtl_calc_ctg_76) return getDispDtl_calc_ctg_76(row, info);
		if(combo == columnDispDtl_calc_ctg_78) return getDispDtl_calc_ctg_78(row, info);
		if(combo == columnDispDtl_calc_ctg_80) return getDispDtl_calc_ctg_80(row, info);
		if(combo == columnDispDtl_calc_ctg_82) return getDispDtl_calc_ctg_82(row, info);
		if(combo == columnDispDtl_calc_ctg_84) return getDispDtl_calc_ctg_84(row, info);
		if(combo == columnDispDtl_calc_ctg_86) return getDispDtl_calc_ctg_86(row, info);
		if(combo == columnDispDtl_calc_ctg_88) return getDispDtl_calc_ctg_88(row, info);
		if(combo == columnDispDtl_calc_ctg_90) return getDispDtl_calc_ctg_90(row, info);
		if(combo == columnDispDtl_calc_ctg_92) return getDispDtl_calc_ctg_92(row, info);
		if(combo == columnDispDtl_calc_ctg_94) return getDispDtl_calc_ctg_94(row, info);
		if(combo == columnDispDtl_calc_ctg_96) return getDispDtl_calc_ctg_96(row, info);
		if(combo == columnDispDtl_calc_ctg_98) return getDispDtl_calc_ctg_98(row, info);
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
		if (vc == DispDtlTable) return doDispDtl_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == columnDispDtl_check) return doDispDtl_check_VC(info);
		if (vc == columnDispDtl_del_flg) return doDispDtl_del_flg_VC(info);
		if (vc == columnDispDtl_calc_grp_cd) return doDispDtl_calc_grp_cd_VC(info);
		if (vc == columnDispDtl_calc_grp_nm) return doDispDtl_calc_grp_nm_VC(info);
		if (vc == columnDispDtl_ctg_prio) return doDispDtl_ctg_prio_VC(info);
		if (vc == columnDispDtl_calc_ctg_00) return doDispDtl_calc_ctg_00_VC(info);
		if (vc == columnDispDtl_calc_ctg_01) return doDispDtl_calc_ctg_01_VC(info);
		if (vc == columnDispDtl_calc_ctg_02) return doDispDtl_calc_ctg_02_VC(info);
		if (vc == columnDispDtl_calc_ctg_03) return doDispDtl_calc_ctg_03_VC(info);
		if (vc == columnDispDtl_calc_ctg_04) return doDispDtl_calc_ctg_04_VC(info);
		if (vc == columnDispDtl_calc_ctg_05) return doDispDtl_calc_ctg_05_VC(info);
		if (vc == columnDispDtl_calc_ctg_06) return doDispDtl_calc_ctg_06_VC(info);
		if (vc == columnDispDtl_calc_ctg_07) return doDispDtl_calc_ctg_07_VC(info);
		if (vc == columnDispDtl_calc_ctg_08) return doDispDtl_calc_ctg_08_VC(info);
		if (vc == columnDispDtl_calc_ctg_09) return doDispDtl_calc_ctg_09_VC(info);
		if (vc == columnDispDtl_calc_ctg_10) return doDispDtl_calc_ctg_10_VC(info);
		if (vc == columnDispDtl_calc_ctg_11) return doDispDtl_calc_ctg_11_VC(info);
		if (vc == columnDispDtl_calc_ctg_12) return doDispDtl_calc_ctg_12_VC(info);
		if (vc == columnDispDtl_calc_ctg_13) return doDispDtl_calc_ctg_13_VC(info);
		if (vc == columnDispDtl_calc_ctg_14) return doDispDtl_calc_ctg_14_VC(info);
		if (vc == columnDispDtl_calc_ctg_15) return doDispDtl_calc_ctg_15_VC(info);
		if (vc == columnDispDtl_calc_ctg_16) return doDispDtl_calc_ctg_16_VC(info);
		if (vc == columnDispDtl_calc_ctg_17) return doDispDtl_calc_ctg_17_VC(info);
		if (vc == columnDispDtl_calc_ctg_18) return doDispDtl_calc_ctg_18_VC(info);
		if (vc == columnDispDtl_calc_ctg_19) return doDispDtl_calc_ctg_19_VC(info);
		if (vc == columnDispDtl_calc_ctg_20) return doDispDtl_calc_ctg_20_VC(info);
		if (vc == columnDispDtl_calc_ctg_21) return doDispDtl_calc_ctg_21_VC(info);
		if (vc == columnDispDtl_calc_ctg_22) return doDispDtl_calc_ctg_22_VC(info);
		if (vc == columnDispDtl_calc_ctg_23) return doDispDtl_calc_ctg_23_VC(info);
		if (vc == columnDispDtl_calc_ctg_24) return doDispDtl_calc_ctg_24_VC(info);
		if (vc == columnDispDtl_calc_ctg_25) return doDispDtl_calc_ctg_25_VC(info);
		if (vc == columnDispDtl_calc_ctg_26) return doDispDtl_calc_ctg_26_VC(info);
		if (vc == columnDispDtl_calc_ctg_27) return doDispDtl_calc_ctg_27_VC(info);
		if (vc == columnDispDtl_calc_ctg_28) return doDispDtl_calc_ctg_28_VC(info);
		if (vc == columnDispDtl_calc_ctg_29) return doDispDtl_calc_ctg_29_VC(info);
		if (vc == columnDispDtl_calc_ctg_30) return doDispDtl_calc_ctg_30_VC(info);
		if (vc == columnDispDtl_calc_ctg_31) return doDispDtl_calc_ctg_31_VC(info);
		if (vc == columnDispDtl_calc_ctg_32) return doDispDtl_calc_ctg_32_VC(info);
		if (vc == columnDispDtl_calc_ctg_33) return doDispDtl_calc_ctg_33_VC(info);
		if (vc == columnDispDtl_calc_ctg_34) return doDispDtl_calc_ctg_34_VC(info);
		if (vc == columnDispDtl_calc_ctg_35) return doDispDtl_calc_ctg_35_VC(info);
		if (vc == columnDispDtl_calc_ctg_36) return doDispDtl_calc_ctg_36_VC(info);
		if (vc == columnDispDtl_calc_ctg_37) return doDispDtl_calc_ctg_37_VC(info);
		if (vc == columnDispDtl_calc_ctg_38) return doDispDtl_calc_ctg_38_VC(info);
		if (vc == columnDispDtl_calc_ctg_39) return doDispDtl_calc_ctg_39_VC(info);
		if (vc == columnDispDtl_calc_ctg_40) return doDispDtl_calc_ctg_40_VC(info);
		if (vc == columnDispDtl_calc_ctg_41) return doDispDtl_calc_ctg_41_VC(info);
		if (vc == columnDispDtl_calc_ctg_42) return doDispDtl_calc_ctg_42_VC(info);
		if (vc == columnDispDtl_calc_ctg_43) return doDispDtl_calc_ctg_43_VC(info);
		if (vc == columnDispDtl_calc_ctg_44) return doDispDtl_calc_ctg_44_VC(info);
		if (vc == columnDispDtl_calc_ctg_45) return doDispDtl_calc_ctg_45_VC(info);
		if (vc == columnDispDtl_calc_ctg_46) return doDispDtl_calc_ctg_46_VC(info);
		if (vc == columnDispDtl_calc_ctg_47) return doDispDtl_calc_ctg_47_VC(info);
		if (vc == columnDispDtl_calc_ctg_48) return doDispDtl_calc_ctg_48_VC(info);
		if (vc == columnDispDtl_calc_ctg_49) return doDispDtl_calc_ctg_49_VC(info);
		if (vc == columnDispDtl_calc_ctg_50) return doDispDtl_calc_ctg_50_VC(info);
		if (vc == columnDispDtl_calc_ctg_51) return doDispDtl_calc_ctg_51_VC(info);
		if (vc == columnDispDtl_calc_ctg_52) return doDispDtl_calc_ctg_52_VC(info);
		if (vc == columnDispDtl_calc_ctg_53) return doDispDtl_calc_ctg_53_VC(info);
		if (vc == columnDispDtl_calc_ctg_54) return doDispDtl_calc_ctg_54_VC(info);
		if (vc == columnDispDtl_calc_ctg_55) return doDispDtl_calc_ctg_55_VC(info);
		if (vc == columnDispDtl_calc_ctg_56) return doDispDtl_calc_ctg_56_VC(info);
		if (vc == columnDispDtl_calc_ctg_57) return doDispDtl_calc_ctg_57_VC(info);
		if (vc == columnDispDtl_calc_ctg_58) return doDispDtl_calc_ctg_58_VC(info);
		if (vc == columnDispDtl_calc_ctg_59) return doDispDtl_calc_ctg_59_VC(info);
		if (vc == columnDispDtl_calc_ctg_60) return doDispDtl_calc_ctg_60_VC(info);
		if (vc == columnDispDtl_calc_ctg_61) return doDispDtl_calc_ctg_61_VC(info);
		if (vc == columnDispDtl_calc_ctg_62) return doDispDtl_calc_ctg_62_VC(info);
		if (vc == columnDispDtl_calc_ctg_63) return doDispDtl_calc_ctg_63_VC(info);
		if (vc == columnDispDtl_calc_ctg_64) return doDispDtl_calc_ctg_64_VC(info);
		if (vc == columnDispDtl_calc_ctg_65) return doDispDtl_calc_ctg_65_VC(info);
		if (vc == columnDispDtl_calc_ctg_66) return doDispDtl_calc_ctg_66_VC(info);
		if (vc == columnDispDtl_calc_ctg_67) return doDispDtl_calc_ctg_67_VC(info);
		if (vc == columnDispDtl_calc_ctg_68) return doDispDtl_calc_ctg_68_VC(info);
		if (vc == columnDispDtl_calc_ctg_69) return doDispDtl_calc_ctg_69_VC(info);
		if (vc == columnDispDtl_calc_ctg_70) return doDispDtl_calc_ctg_70_VC(info);
		if (vc == columnDispDtl_calc_ctg_71) return doDispDtl_calc_ctg_71_VC(info);
		if (vc == columnDispDtl_calc_ctg_72) return doDispDtl_calc_ctg_72_VC(info);
		if (vc == columnDispDtl_calc_ctg_73) return doDispDtl_calc_ctg_73_VC(info);
		if (vc == columnDispDtl_calc_ctg_74) return doDispDtl_calc_ctg_74_VC(info);
		if (vc == columnDispDtl_calc_ctg_75) return doDispDtl_calc_ctg_75_VC(info);
		if (vc == columnDispDtl_calc_ctg_76) return doDispDtl_calc_ctg_76_VC(info);
		if (vc == columnDispDtl_calc_ctg_77) return doDispDtl_calc_ctg_77_VC(info);
		if (vc == columnDispDtl_calc_ctg_78) return doDispDtl_calc_ctg_78_VC(info);
		if (vc == columnDispDtl_calc_ctg_79) return doDispDtl_calc_ctg_79_VC(info);
		if (vc == columnDispDtl_calc_ctg_80) return doDispDtl_calc_ctg_80_VC(info);
		if (vc == columnDispDtl_calc_ctg_81) return doDispDtl_calc_ctg_81_VC(info);
		if (vc == columnDispDtl_calc_ctg_82) return doDispDtl_calc_ctg_82_VC(info);
		if (vc == columnDispDtl_calc_ctg_83) return doDispDtl_calc_ctg_83_VC(info);
		if (vc == columnDispDtl_calc_ctg_84) return doDispDtl_calc_ctg_84_VC(info);
		if (vc == columnDispDtl_calc_ctg_85) return doDispDtl_calc_ctg_85_VC(info);
		if (vc == columnDispDtl_calc_ctg_86) return doDispDtl_calc_ctg_86_VC(info);
		if (vc == columnDispDtl_calc_ctg_87) return doDispDtl_calc_ctg_87_VC(info);
		if (vc == columnDispDtl_calc_ctg_88) return doDispDtl_calc_ctg_88_VC(info);
		if (vc == columnDispDtl_calc_ctg_89) return doDispDtl_calc_ctg_89_VC(info);
		if (vc == columnDispDtl_calc_ctg_90) return doDispDtl_calc_ctg_90_VC(info);
		if (vc == columnDispDtl_calc_ctg_91) return doDispDtl_calc_ctg_91_VC(info);
		if (vc == columnDispDtl_calc_ctg_92) return doDispDtl_calc_ctg_92_VC(info);
		if (vc == columnDispDtl_calc_ctg_93) return doDispDtl_calc_ctg_93_VC(info);
		if (vc == columnDispDtl_calc_ctg_94) return doDispDtl_calc_ctg_94_VC(info);
		if (vc == columnDispDtl_calc_ctg_95) return doDispDtl_calc_ctg_95_VC(info);
		if (vc == columnDispDtl_calc_ctg_96) return doDispDtl_calc_ctg_96_VC(info);
		if (vc == columnDispDtl_calc_ctg_97) return doDispDtl_calc_ctg_97_VC(info);
		if (vc == columnDispDtl_calc_ctg_98) return doDispDtl_calc_ctg_98_VC(info);
		if (vc == columnDispDtl_calc_ctg_99) return doDispDtl_calc_ctg_99_VC(info);
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
	 * [DispDtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ctg_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ctg_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_32]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_32_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_33]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_33_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_34]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_34_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_35]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_35_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_36]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_36_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_37]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_37_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_38]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_38_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_39]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_39_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_40]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_40_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_41]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_41_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_42]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_42_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_43]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_43_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_44]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_44_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_45]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_45_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_46]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_46_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_47]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_47_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_48]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_48_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_49]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_49_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_50]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_50_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_51]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_51_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_52]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_52_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_53]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_53_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_54]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_54_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_55]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_55_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_56]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_56_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_57]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_57_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_58]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_58_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_59]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_59_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_60]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_60_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_61]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_61_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_62]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_62_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_63]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_63_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_64]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_64_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_65]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_65_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_66]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_66_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_67]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_67_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_68]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_68_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_69]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_69_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_70]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_70_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_71]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_71_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_72]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_72_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_73]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_73_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_74]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_74_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_75]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_75_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_76]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_76_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_77]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_77_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_78]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_78_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_79]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_79_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_80]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_80_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_81]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_81_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_82]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_82_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_83]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_83_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_84]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_84_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_85]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_85_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_86]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_86_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_87]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_87_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_88]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_88_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_89]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_89_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_90]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_90_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_91]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_91_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_92]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_92_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_93]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_93_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_94]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_94_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_95]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_95_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_96]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_96_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_97]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_97_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_98]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_98_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_99]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_calc_ctg_99_VC(MCEventInfo info){
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
		if (nc == DispDtlTable) doDispDtl_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == columnDispDtl_check) doDispDtl_check_NC(info);
		else if (nc == columnDispDtl_del_flg) doDispDtl_del_flg_NC(info);
		else if (nc == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NC(info);
		else if (nc == columnDispDtl_calc_grp_nm) doDispDtl_calc_grp_nm_NC(info);
		else if (nc == columnDispDtl_ctg_prio) doDispDtl_ctg_prio_NC(info);
		else if (nc == columnDispDtl_calc_ctg_00) doDispDtl_calc_ctg_00_NC(info);
		else if (nc == columnDispDtl_calc_ctg_01) doDispDtl_calc_ctg_01_NC(info);
		else if (nc == columnDispDtl_calc_ctg_02) doDispDtl_calc_ctg_02_NC(info);
		else if (nc == columnDispDtl_calc_ctg_03) doDispDtl_calc_ctg_03_NC(info);
		else if (nc == columnDispDtl_calc_ctg_04) doDispDtl_calc_ctg_04_NC(info);
		else if (nc == columnDispDtl_calc_ctg_05) doDispDtl_calc_ctg_05_NC(info);
		else if (nc == columnDispDtl_calc_ctg_06) doDispDtl_calc_ctg_06_NC(info);
		else if (nc == columnDispDtl_calc_ctg_07) doDispDtl_calc_ctg_07_NC(info);
		else if (nc == columnDispDtl_calc_ctg_08) doDispDtl_calc_ctg_08_NC(info);
		else if (nc == columnDispDtl_calc_ctg_09) doDispDtl_calc_ctg_09_NC(info);
		else if (nc == columnDispDtl_calc_ctg_10) doDispDtl_calc_ctg_10_NC(info);
		else if (nc == columnDispDtl_calc_ctg_11) doDispDtl_calc_ctg_11_NC(info);
		else if (nc == columnDispDtl_calc_ctg_12) doDispDtl_calc_ctg_12_NC(info);
		else if (nc == columnDispDtl_calc_ctg_13) doDispDtl_calc_ctg_13_NC(info);
		else if (nc == columnDispDtl_calc_ctg_14) doDispDtl_calc_ctg_14_NC(info);
		else if (nc == columnDispDtl_calc_ctg_15) doDispDtl_calc_ctg_15_NC(info);
		else if (nc == columnDispDtl_calc_ctg_16) doDispDtl_calc_ctg_16_NC(info);
		else if (nc == columnDispDtl_calc_ctg_17) doDispDtl_calc_ctg_17_NC(info);
		else if (nc == columnDispDtl_calc_ctg_18) doDispDtl_calc_ctg_18_NC(info);
		else if (nc == columnDispDtl_calc_ctg_19) doDispDtl_calc_ctg_19_NC(info);
		else if (nc == columnDispDtl_calc_ctg_20) doDispDtl_calc_ctg_20_NC(info);
		else if (nc == columnDispDtl_calc_ctg_21) doDispDtl_calc_ctg_21_NC(info);
		else if (nc == columnDispDtl_calc_ctg_22) doDispDtl_calc_ctg_22_NC(info);
		else if (nc == columnDispDtl_calc_ctg_23) doDispDtl_calc_ctg_23_NC(info);
		else if (nc == columnDispDtl_calc_ctg_24) doDispDtl_calc_ctg_24_NC(info);
		else if (nc == columnDispDtl_calc_ctg_25) doDispDtl_calc_ctg_25_NC(info);
		else if (nc == columnDispDtl_calc_ctg_26) doDispDtl_calc_ctg_26_NC(info);
		else if (nc == columnDispDtl_calc_ctg_27) doDispDtl_calc_ctg_27_NC(info);
		else if (nc == columnDispDtl_calc_ctg_28) doDispDtl_calc_ctg_28_NC(info);
		else if (nc == columnDispDtl_calc_ctg_29) doDispDtl_calc_ctg_29_NC(info);
		else if (nc == columnDispDtl_calc_ctg_30) doDispDtl_calc_ctg_30_NC(info);
		else if (nc == columnDispDtl_calc_ctg_31) doDispDtl_calc_ctg_31_NC(info);
		else if (nc == columnDispDtl_calc_ctg_32) doDispDtl_calc_ctg_32_NC(info);
		else if (nc == columnDispDtl_calc_ctg_33) doDispDtl_calc_ctg_33_NC(info);
		else if (nc == columnDispDtl_calc_ctg_34) doDispDtl_calc_ctg_34_NC(info);
		else if (nc == columnDispDtl_calc_ctg_35) doDispDtl_calc_ctg_35_NC(info);
		else if (nc == columnDispDtl_calc_ctg_36) doDispDtl_calc_ctg_36_NC(info);
		else if (nc == columnDispDtl_calc_ctg_37) doDispDtl_calc_ctg_37_NC(info);
		else if (nc == columnDispDtl_calc_ctg_38) doDispDtl_calc_ctg_38_NC(info);
		else if (nc == columnDispDtl_calc_ctg_39) doDispDtl_calc_ctg_39_NC(info);
		else if (nc == columnDispDtl_calc_ctg_40) doDispDtl_calc_ctg_40_NC(info);
		else if (nc == columnDispDtl_calc_ctg_41) doDispDtl_calc_ctg_41_NC(info);
		else if (nc == columnDispDtl_calc_ctg_42) doDispDtl_calc_ctg_42_NC(info);
		else if (nc == columnDispDtl_calc_ctg_43) doDispDtl_calc_ctg_43_NC(info);
		else if (nc == columnDispDtl_calc_ctg_44) doDispDtl_calc_ctg_44_NC(info);
		else if (nc == columnDispDtl_calc_ctg_45) doDispDtl_calc_ctg_45_NC(info);
		else if (nc == columnDispDtl_calc_ctg_46) doDispDtl_calc_ctg_46_NC(info);
		else if (nc == columnDispDtl_calc_ctg_47) doDispDtl_calc_ctg_47_NC(info);
		else if (nc == columnDispDtl_calc_ctg_48) doDispDtl_calc_ctg_48_NC(info);
		else if (nc == columnDispDtl_calc_ctg_49) doDispDtl_calc_ctg_49_NC(info);
		else if (nc == columnDispDtl_calc_ctg_50) doDispDtl_calc_ctg_50_NC(info);
		else if (nc == columnDispDtl_calc_ctg_51) doDispDtl_calc_ctg_51_NC(info);
		else if (nc == columnDispDtl_calc_ctg_52) doDispDtl_calc_ctg_52_NC(info);
		else if (nc == columnDispDtl_calc_ctg_53) doDispDtl_calc_ctg_53_NC(info);
		else if (nc == columnDispDtl_calc_ctg_54) doDispDtl_calc_ctg_54_NC(info);
		else if (nc == columnDispDtl_calc_ctg_55) doDispDtl_calc_ctg_55_NC(info);
		else if (nc == columnDispDtl_calc_ctg_56) doDispDtl_calc_ctg_56_NC(info);
		else if (nc == columnDispDtl_calc_ctg_57) doDispDtl_calc_ctg_57_NC(info);
		else if (nc == columnDispDtl_calc_ctg_58) doDispDtl_calc_ctg_58_NC(info);
		else if (nc == columnDispDtl_calc_ctg_59) doDispDtl_calc_ctg_59_NC(info);
		else if (nc == columnDispDtl_calc_ctg_60) doDispDtl_calc_ctg_60_NC(info);
		else if (nc == columnDispDtl_calc_ctg_61) doDispDtl_calc_ctg_61_NC(info);
		else if (nc == columnDispDtl_calc_ctg_62) doDispDtl_calc_ctg_62_NC(info);
		else if (nc == columnDispDtl_calc_ctg_63) doDispDtl_calc_ctg_63_NC(info);
		else if (nc == columnDispDtl_calc_ctg_64) doDispDtl_calc_ctg_64_NC(info);
		else if (nc == columnDispDtl_calc_ctg_65) doDispDtl_calc_ctg_65_NC(info);
		else if (nc == columnDispDtl_calc_ctg_66) doDispDtl_calc_ctg_66_NC(info);
		else if (nc == columnDispDtl_calc_ctg_67) doDispDtl_calc_ctg_67_NC(info);
		else if (nc == columnDispDtl_calc_ctg_68) doDispDtl_calc_ctg_68_NC(info);
		else if (nc == columnDispDtl_calc_ctg_69) doDispDtl_calc_ctg_69_NC(info);
		else if (nc == columnDispDtl_calc_ctg_70) doDispDtl_calc_ctg_70_NC(info);
		else if (nc == columnDispDtl_calc_ctg_71) doDispDtl_calc_ctg_71_NC(info);
		else if (nc == columnDispDtl_calc_ctg_72) doDispDtl_calc_ctg_72_NC(info);
		else if (nc == columnDispDtl_calc_ctg_73) doDispDtl_calc_ctg_73_NC(info);
		else if (nc == columnDispDtl_calc_ctg_74) doDispDtl_calc_ctg_74_NC(info);
		else if (nc == columnDispDtl_calc_ctg_75) doDispDtl_calc_ctg_75_NC(info);
		else if (nc == columnDispDtl_calc_ctg_76) doDispDtl_calc_ctg_76_NC(info);
		else if (nc == columnDispDtl_calc_ctg_77) doDispDtl_calc_ctg_77_NC(info);
		else if (nc == columnDispDtl_calc_ctg_78) doDispDtl_calc_ctg_78_NC(info);
		else if (nc == columnDispDtl_calc_ctg_79) doDispDtl_calc_ctg_79_NC(info);
		else if (nc == columnDispDtl_calc_ctg_80) doDispDtl_calc_ctg_80_NC(info);
		else if (nc == columnDispDtl_calc_ctg_81) doDispDtl_calc_ctg_81_NC(info);
		else if (nc == columnDispDtl_calc_ctg_82) doDispDtl_calc_ctg_82_NC(info);
		else if (nc == columnDispDtl_calc_ctg_83) doDispDtl_calc_ctg_83_NC(info);
		else if (nc == columnDispDtl_calc_ctg_84) doDispDtl_calc_ctg_84_NC(info);
		else if (nc == columnDispDtl_calc_ctg_85) doDispDtl_calc_ctg_85_NC(info);
		else if (nc == columnDispDtl_calc_ctg_86) doDispDtl_calc_ctg_86_NC(info);
		else if (nc == columnDispDtl_calc_ctg_87) doDispDtl_calc_ctg_87_NC(info);
		else if (nc == columnDispDtl_calc_ctg_88) doDispDtl_calc_ctg_88_NC(info);
		else if (nc == columnDispDtl_calc_ctg_89) doDispDtl_calc_ctg_89_NC(info);
		else if (nc == columnDispDtl_calc_ctg_90) doDispDtl_calc_ctg_90_NC(info);
		else if (nc == columnDispDtl_calc_ctg_91) doDispDtl_calc_ctg_91_NC(info);
		else if (nc == columnDispDtl_calc_ctg_92) doDispDtl_calc_ctg_92_NC(info);
		else if (nc == columnDispDtl_calc_ctg_93) doDispDtl_calc_ctg_93_NC(info);
		else if (nc == columnDispDtl_calc_ctg_94) doDispDtl_calc_ctg_94_NC(info);
		else if (nc == columnDispDtl_calc_ctg_95) doDispDtl_calc_ctg_95_NC(info);
		else if (nc == columnDispDtl_calc_ctg_96) doDispDtl_calc_ctg_96_NC(info);
		else if (nc == columnDispDtl_calc_ctg_97) doDispDtl_calc_ctg_97_NC(info);
		else if (nc == columnDispDtl_calc_ctg_98) doDispDtl_calc_ctg_98_NC(info);
		else if (nc == columnDispDtl_calc_ctg_99) doDispDtl_calc_ctg_99_NC(info);
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
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_prio_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_00_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_01_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_02_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_03_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_04_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_05_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_06_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_07_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_08_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_09_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_10_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_11_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_12_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_13_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_14_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_15_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_16_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_17_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_18_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_19_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_20_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_21_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_22_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_23_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_24_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_25_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_26_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_27_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_28_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_29_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_30_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_31_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_32]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_32_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_33]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_33_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_34]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_34_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_35]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_35_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_36]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_36_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_37]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_37_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_38]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_38_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_39]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_39_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_40]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_40_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_41]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_41_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_42]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_42_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_43]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_43_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_44]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_44_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_45]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_45_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_46]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_46_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_47]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_47_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_48]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_48_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_49]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_49_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_50]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_50_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_51]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_51_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_52]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_52_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_53]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_53_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_54]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_54_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_55]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_55_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_56]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_56_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_57]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_57_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_58]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_58_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_59]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_59_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_60]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_60_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_61]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_61_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_62]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_62_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_63]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_63_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_64]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_64_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_65]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_65_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_66]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_66_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_67]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_67_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_68]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_68_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_69]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_69_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_70]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_70_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_71]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_71_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_72]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_72_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_73]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_73_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_74]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_74_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_75]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_75_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_76]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_76_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_77]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_77_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_78]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_78_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_79]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_79_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_80]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_80_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_81]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_81_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_82]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_82_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_83]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_83_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_84]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_84_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_85]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_85_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_86]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_86_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_87]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_87_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_88]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_88_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_89]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_89_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_90]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_90_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_91]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_91_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_92]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_92_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_93]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_93_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_94]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_94_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_95]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_95_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_96]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_96_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_97]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_97_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_98]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_98_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_99]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_99_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DispDtlTable) doDispDtl_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == columnDispDtl_check) doDispDtl_check_NE(info);
		else if (ne == columnDispDtl_del_flg) doDispDtl_del_flg_NE(info);
		else if (ne == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NE(info);
		else if (ne == columnDispDtl_calc_grp_nm) doDispDtl_calc_grp_nm_NE(info);
		else if (ne == columnDispDtl_ctg_prio) doDispDtl_ctg_prio_NE(info);
		else if (ne == columnDispDtl_calc_ctg_00) doDispDtl_calc_ctg_00_NE(info);
		else if (ne == columnDispDtl_calc_ctg_01) doDispDtl_calc_ctg_01_NE(info);
		else if (ne == columnDispDtl_calc_ctg_02) doDispDtl_calc_ctg_02_NE(info);
		else if (ne == columnDispDtl_calc_ctg_03) doDispDtl_calc_ctg_03_NE(info);
		else if (ne == columnDispDtl_calc_ctg_04) doDispDtl_calc_ctg_04_NE(info);
		else if (ne == columnDispDtl_calc_ctg_05) doDispDtl_calc_ctg_05_NE(info);
		else if (ne == columnDispDtl_calc_ctg_06) doDispDtl_calc_ctg_06_NE(info);
		else if (ne == columnDispDtl_calc_ctg_07) doDispDtl_calc_ctg_07_NE(info);
		else if (ne == columnDispDtl_calc_ctg_08) doDispDtl_calc_ctg_08_NE(info);
		else if (ne == columnDispDtl_calc_ctg_09) doDispDtl_calc_ctg_09_NE(info);
		else if (ne == columnDispDtl_calc_ctg_10) doDispDtl_calc_ctg_10_NE(info);
		else if (ne == columnDispDtl_calc_ctg_11) doDispDtl_calc_ctg_11_NE(info);
		else if (ne == columnDispDtl_calc_ctg_12) doDispDtl_calc_ctg_12_NE(info);
		else if (ne == columnDispDtl_calc_ctg_13) doDispDtl_calc_ctg_13_NE(info);
		else if (ne == columnDispDtl_calc_ctg_14) doDispDtl_calc_ctg_14_NE(info);
		else if (ne == columnDispDtl_calc_ctg_15) doDispDtl_calc_ctg_15_NE(info);
		else if (ne == columnDispDtl_calc_ctg_16) doDispDtl_calc_ctg_16_NE(info);
		else if (ne == columnDispDtl_calc_ctg_17) doDispDtl_calc_ctg_17_NE(info);
		else if (ne == columnDispDtl_calc_ctg_18) doDispDtl_calc_ctg_18_NE(info);
		else if (ne == columnDispDtl_calc_ctg_19) doDispDtl_calc_ctg_19_NE(info);
		else if (ne == columnDispDtl_calc_ctg_20) doDispDtl_calc_ctg_20_NE(info);
		else if (ne == columnDispDtl_calc_ctg_21) doDispDtl_calc_ctg_21_NE(info);
		else if (ne == columnDispDtl_calc_ctg_22) doDispDtl_calc_ctg_22_NE(info);
		else if (ne == columnDispDtl_calc_ctg_23) doDispDtl_calc_ctg_23_NE(info);
		else if (ne == columnDispDtl_calc_ctg_24) doDispDtl_calc_ctg_24_NE(info);
		else if (ne == columnDispDtl_calc_ctg_25) doDispDtl_calc_ctg_25_NE(info);
		else if (ne == columnDispDtl_calc_ctg_26) doDispDtl_calc_ctg_26_NE(info);
		else if (ne == columnDispDtl_calc_ctg_27) doDispDtl_calc_ctg_27_NE(info);
		else if (ne == columnDispDtl_calc_ctg_28) doDispDtl_calc_ctg_28_NE(info);
		else if (ne == columnDispDtl_calc_ctg_29) doDispDtl_calc_ctg_29_NE(info);
		else if (ne == columnDispDtl_calc_ctg_30) doDispDtl_calc_ctg_30_NE(info);
		else if (ne == columnDispDtl_calc_ctg_31) doDispDtl_calc_ctg_31_NE(info);
		else if (ne == columnDispDtl_calc_ctg_32) doDispDtl_calc_ctg_32_NE(info);
		else if (ne == columnDispDtl_calc_ctg_33) doDispDtl_calc_ctg_33_NE(info);
		else if (ne == columnDispDtl_calc_ctg_34) doDispDtl_calc_ctg_34_NE(info);
		else if (ne == columnDispDtl_calc_ctg_35) doDispDtl_calc_ctg_35_NE(info);
		else if (ne == columnDispDtl_calc_ctg_36) doDispDtl_calc_ctg_36_NE(info);
		else if (ne == columnDispDtl_calc_ctg_37) doDispDtl_calc_ctg_37_NE(info);
		else if (ne == columnDispDtl_calc_ctg_38) doDispDtl_calc_ctg_38_NE(info);
		else if (ne == columnDispDtl_calc_ctg_39) doDispDtl_calc_ctg_39_NE(info);
		else if (ne == columnDispDtl_calc_ctg_40) doDispDtl_calc_ctg_40_NE(info);
		else if (ne == columnDispDtl_calc_ctg_41) doDispDtl_calc_ctg_41_NE(info);
		else if (ne == columnDispDtl_calc_ctg_42) doDispDtl_calc_ctg_42_NE(info);
		else if (ne == columnDispDtl_calc_ctg_43) doDispDtl_calc_ctg_43_NE(info);
		else if (ne == columnDispDtl_calc_ctg_44) doDispDtl_calc_ctg_44_NE(info);
		else if (ne == columnDispDtl_calc_ctg_45) doDispDtl_calc_ctg_45_NE(info);
		else if (ne == columnDispDtl_calc_ctg_46) doDispDtl_calc_ctg_46_NE(info);
		else if (ne == columnDispDtl_calc_ctg_47) doDispDtl_calc_ctg_47_NE(info);
		else if (ne == columnDispDtl_calc_ctg_48) doDispDtl_calc_ctg_48_NE(info);
		else if (ne == columnDispDtl_calc_ctg_49) doDispDtl_calc_ctg_49_NE(info);
		else if (ne == columnDispDtl_calc_ctg_50) doDispDtl_calc_ctg_50_NE(info);
		else if (ne == columnDispDtl_calc_ctg_51) doDispDtl_calc_ctg_51_NE(info);
		else if (ne == columnDispDtl_calc_ctg_52) doDispDtl_calc_ctg_52_NE(info);
		else if (ne == columnDispDtl_calc_ctg_53) doDispDtl_calc_ctg_53_NE(info);
		else if (ne == columnDispDtl_calc_ctg_54) doDispDtl_calc_ctg_54_NE(info);
		else if (ne == columnDispDtl_calc_ctg_55) doDispDtl_calc_ctg_55_NE(info);
		else if (ne == columnDispDtl_calc_ctg_56) doDispDtl_calc_ctg_56_NE(info);
		else if (ne == columnDispDtl_calc_ctg_57) doDispDtl_calc_ctg_57_NE(info);
		else if (ne == columnDispDtl_calc_ctg_58) doDispDtl_calc_ctg_58_NE(info);
		else if (ne == columnDispDtl_calc_ctg_59) doDispDtl_calc_ctg_59_NE(info);
		else if (ne == columnDispDtl_calc_ctg_60) doDispDtl_calc_ctg_60_NE(info);
		else if (ne == columnDispDtl_calc_ctg_61) doDispDtl_calc_ctg_61_NE(info);
		else if (ne == columnDispDtl_calc_ctg_62) doDispDtl_calc_ctg_62_NE(info);
		else if (ne == columnDispDtl_calc_ctg_63) doDispDtl_calc_ctg_63_NE(info);
		else if (ne == columnDispDtl_calc_ctg_64) doDispDtl_calc_ctg_64_NE(info);
		else if (ne == columnDispDtl_calc_ctg_65) doDispDtl_calc_ctg_65_NE(info);
		else if (ne == columnDispDtl_calc_ctg_66) doDispDtl_calc_ctg_66_NE(info);
		else if (ne == columnDispDtl_calc_ctg_67) doDispDtl_calc_ctg_67_NE(info);
		else if (ne == columnDispDtl_calc_ctg_68) doDispDtl_calc_ctg_68_NE(info);
		else if (ne == columnDispDtl_calc_ctg_69) doDispDtl_calc_ctg_69_NE(info);
		else if (ne == columnDispDtl_calc_ctg_70) doDispDtl_calc_ctg_70_NE(info);
		else if (ne == columnDispDtl_calc_ctg_71) doDispDtl_calc_ctg_71_NE(info);
		else if (ne == columnDispDtl_calc_ctg_72) doDispDtl_calc_ctg_72_NE(info);
		else if (ne == columnDispDtl_calc_ctg_73) doDispDtl_calc_ctg_73_NE(info);
		else if (ne == columnDispDtl_calc_ctg_74) doDispDtl_calc_ctg_74_NE(info);
		else if (ne == columnDispDtl_calc_ctg_75) doDispDtl_calc_ctg_75_NE(info);
		else if (ne == columnDispDtl_calc_ctg_76) doDispDtl_calc_ctg_76_NE(info);
		else if (ne == columnDispDtl_calc_ctg_77) doDispDtl_calc_ctg_77_NE(info);
		else if (ne == columnDispDtl_calc_ctg_78) doDispDtl_calc_ctg_78_NE(info);
		else if (ne == columnDispDtl_calc_ctg_79) doDispDtl_calc_ctg_79_NE(info);
		else if (ne == columnDispDtl_calc_ctg_80) doDispDtl_calc_ctg_80_NE(info);
		else if (ne == columnDispDtl_calc_ctg_81) doDispDtl_calc_ctg_81_NE(info);
		else if (ne == columnDispDtl_calc_ctg_82) doDispDtl_calc_ctg_82_NE(info);
		else if (ne == columnDispDtl_calc_ctg_83) doDispDtl_calc_ctg_83_NE(info);
		else if (ne == columnDispDtl_calc_ctg_84) doDispDtl_calc_ctg_84_NE(info);
		else if (ne == columnDispDtl_calc_ctg_85) doDispDtl_calc_ctg_85_NE(info);
		else if (ne == columnDispDtl_calc_ctg_86) doDispDtl_calc_ctg_86_NE(info);
		else if (ne == columnDispDtl_calc_ctg_87) doDispDtl_calc_ctg_87_NE(info);
		else if (ne == columnDispDtl_calc_ctg_88) doDispDtl_calc_ctg_88_NE(info);
		else if (ne == columnDispDtl_calc_ctg_89) doDispDtl_calc_ctg_89_NE(info);
		else if (ne == columnDispDtl_calc_ctg_90) doDispDtl_calc_ctg_90_NE(info);
		else if (ne == columnDispDtl_calc_ctg_91) doDispDtl_calc_ctg_91_NE(info);
		else if (ne == columnDispDtl_calc_ctg_92) doDispDtl_calc_ctg_92_NE(info);
		else if (ne == columnDispDtl_calc_ctg_93) doDispDtl_calc_ctg_93_NE(info);
		else if (ne == columnDispDtl_calc_ctg_94) doDispDtl_calc_ctg_94_NE(info);
		else if (ne == columnDispDtl_calc_ctg_95) doDispDtl_calc_ctg_95_NE(info);
		else if (ne == columnDispDtl_calc_ctg_96) doDispDtl_calc_ctg_96_NE(info);
		else if (ne == columnDispDtl_calc_ctg_97) doDispDtl_calc_ctg_97_NE(info);
		else if (ne == columnDispDtl_calc_ctg_98) doDispDtl_calc_ctg_98_NE(info);
		else if (ne == columnDispDtl_calc_ctg_99) doDispDtl_calc_ctg_99_NE(info);
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
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_prio_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_00_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_01_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_02_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_03_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_04_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_05_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_06_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_07_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_08_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_09_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_10_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_11_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_12_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_13_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_14_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_15_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_16_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_17_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_18_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_19_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_20_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_21_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_22_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_23_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_24_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_25_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_26_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_27_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_28_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_29_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_30_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_31_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_32]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_32_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_33]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_33_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_34]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_34_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_35]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_35_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_36]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_36_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_37]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_37_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_38]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_38_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_39]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_39_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_40]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_40_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_41]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_41_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_42]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_42_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_43]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_43_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_44]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_44_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_45]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_45_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_46]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_46_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_47]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_47_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_48]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_48_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_49]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_49_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_50]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_50_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_51]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_51_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_52]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_52_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_53]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_53_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_54]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_54_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_55]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_55_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_56]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_56_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_57]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_57_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_58]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_58_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_59]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_59_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_60]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_60_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_61]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_61_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_62]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_62_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_63]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_63_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_64]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_64_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_65]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_65_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_66]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_66_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_67]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_67_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_68]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_68_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_69]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_69_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_70]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_70_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_71]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_71_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_72]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_72_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_73]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_73_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_74]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_74_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_75]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_75_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_76]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_76_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_77]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_77_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_78]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_78_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_79]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_79_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_80]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_80_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_81]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_81_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_82]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_82_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_83]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_83_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_84]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_84_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_85]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_85_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_86]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_86_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_87]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_87_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_88]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_88_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_89]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_89_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_90]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_90_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_91]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_91_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_92]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_92_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_93]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_93_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_94]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_94_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_95]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_95_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_96]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_96_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_97]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_97_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_98]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_98_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_99]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_99_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DispDtlTable) doDispDtl_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == columnDispDtl_check) doDispDtl_check_NX(info);
		else if (nx == columnDispDtl_del_flg) doDispDtl_del_flg_NX(info);
		else if (nx == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_NX(info);
		else if (nx == columnDispDtl_calc_grp_nm) doDispDtl_calc_grp_nm_NX(info);
		else if (nx == columnDispDtl_ctg_prio) doDispDtl_ctg_prio_NX(info);
		else if (nx == columnDispDtl_calc_ctg_00) doDispDtl_calc_ctg_00_NX(info);
		else if (nx == columnDispDtl_calc_ctg_01) doDispDtl_calc_ctg_01_NX(info);
		else if (nx == columnDispDtl_calc_ctg_02) doDispDtl_calc_ctg_02_NX(info);
		else if (nx == columnDispDtl_calc_ctg_03) doDispDtl_calc_ctg_03_NX(info);
		else if (nx == columnDispDtl_calc_ctg_04) doDispDtl_calc_ctg_04_NX(info);
		else if (nx == columnDispDtl_calc_ctg_05) doDispDtl_calc_ctg_05_NX(info);
		else if (nx == columnDispDtl_calc_ctg_06) doDispDtl_calc_ctg_06_NX(info);
		else if (nx == columnDispDtl_calc_ctg_07) doDispDtl_calc_ctg_07_NX(info);
		else if (nx == columnDispDtl_calc_ctg_08) doDispDtl_calc_ctg_08_NX(info);
		else if (nx == columnDispDtl_calc_ctg_09) doDispDtl_calc_ctg_09_NX(info);
		else if (nx == columnDispDtl_calc_ctg_10) doDispDtl_calc_ctg_10_NX(info);
		else if (nx == columnDispDtl_calc_ctg_11) doDispDtl_calc_ctg_11_NX(info);
		else if (nx == columnDispDtl_calc_ctg_12) doDispDtl_calc_ctg_12_NX(info);
		else if (nx == columnDispDtl_calc_ctg_13) doDispDtl_calc_ctg_13_NX(info);
		else if (nx == columnDispDtl_calc_ctg_14) doDispDtl_calc_ctg_14_NX(info);
		else if (nx == columnDispDtl_calc_ctg_15) doDispDtl_calc_ctg_15_NX(info);
		else if (nx == columnDispDtl_calc_ctg_16) doDispDtl_calc_ctg_16_NX(info);
		else if (nx == columnDispDtl_calc_ctg_17) doDispDtl_calc_ctg_17_NX(info);
		else if (nx == columnDispDtl_calc_ctg_18) doDispDtl_calc_ctg_18_NX(info);
		else if (nx == columnDispDtl_calc_ctg_19) doDispDtl_calc_ctg_19_NX(info);
		else if (nx == columnDispDtl_calc_ctg_20) doDispDtl_calc_ctg_20_NX(info);
		else if (nx == columnDispDtl_calc_ctg_21) doDispDtl_calc_ctg_21_NX(info);
		else if (nx == columnDispDtl_calc_ctg_22) doDispDtl_calc_ctg_22_NX(info);
		else if (nx == columnDispDtl_calc_ctg_23) doDispDtl_calc_ctg_23_NX(info);
		else if (nx == columnDispDtl_calc_ctg_24) doDispDtl_calc_ctg_24_NX(info);
		else if (nx == columnDispDtl_calc_ctg_25) doDispDtl_calc_ctg_25_NX(info);
		else if (nx == columnDispDtl_calc_ctg_26) doDispDtl_calc_ctg_26_NX(info);
		else if (nx == columnDispDtl_calc_ctg_27) doDispDtl_calc_ctg_27_NX(info);
		else if (nx == columnDispDtl_calc_ctg_28) doDispDtl_calc_ctg_28_NX(info);
		else if (nx == columnDispDtl_calc_ctg_29) doDispDtl_calc_ctg_29_NX(info);
		else if (nx == columnDispDtl_calc_ctg_30) doDispDtl_calc_ctg_30_NX(info);
		else if (nx == columnDispDtl_calc_ctg_31) doDispDtl_calc_ctg_31_NX(info);
		else if (nx == columnDispDtl_calc_ctg_32) doDispDtl_calc_ctg_32_NX(info);
		else if (nx == columnDispDtl_calc_ctg_33) doDispDtl_calc_ctg_33_NX(info);
		else if (nx == columnDispDtl_calc_ctg_34) doDispDtl_calc_ctg_34_NX(info);
		else if (nx == columnDispDtl_calc_ctg_35) doDispDtl_calc_ctg_35_NX(info);
		else if (nx == columnDispDtl_calc_ctg_36) doDispDtl_calc_ctg_36_NX(info);
		else if (nx == columnDispDtl_calc_ctg_37) doDispDtl_calc_ctg_37_NX(info);
		else if (nx == columnDispDtl_calc_ctg_38) doDispDtl_calc_ctg_38_NX(info);
		else if (nx == columnDispDtl_calc_ctg_39) doDispDtl_calc_ctg_39_NX(info);
		else if (nx == columnDispDtl_calc_ctg_40) doDispDtl_calc_ctg_40_NX(info);
		else if (nx == columnDispDtl_calc_ctg_41) doDispDtl_calc_ctg_41_NX(info);
		else if (nx == columnDispDtl_calc_ctg_42) doDispDtl_calc_ctg_42_NX(info);
		else if (nx == columnDispDtl_calc_ctg_43) doDispDtl_calc_ctg_43_NX(info);
		else if (nx == columnDispDtl_calc_ctg_44) doDispDtl_calc_ctg_44_NX(info);
		else if (nx == columnDispDtl_calc_ctg_45) doDispDtl_calc_ctg_45_NX(info);
		else if (nx == columnDispDtl_calc_ctg_46) doDispDtl_calc_ctg_46_NX(info);
		else if (nx == columnDispDtl_calc_ctg_47) doDispDtl_calc_ctg_47_NX(info);
		else if (nx == columnDispDtl_calc_ctg_48) doDispDtl_calc_ctg_48_NX(info);
		else if (nx == columnDispDtl_calc_ctg_49) doDispDtl_calc_ctg_49_NX(info);
		else if (nx == columnDispDtl_calc_ctg_50) doDispDtl_calc_ctg_50_NX(info);
		else if (nx == columnDispDtl_calc_ctg_51) doDispDtl_calc_ctg_51_NX(info);
		else if (nx == columnDispDtl_calc_ctg_52) doDispDtl_calc_ctg_52_NX(info);
		else if (nx == columnDispDtl_calc_ctg_53) doDispDtl_calc_ctg_53_NX(info);
		else if (nx == columnDispDtl_calc_ctg_54) doDispDtl_calc_ctg_54_NX(info);
		else if (nx == columnDispDtl_calc_ctg_55) doDispDtl_calc_ctg_55_NX(info);
		else if (nx == columnDispDtl_calc_ctg_56) doDispDtl_calc_ctg_56_NX(info);
		else if (nx == columnDispDtl_calc_ctg_57) doDispDtl_calc_ctg_57_NX(info);
		else if (nx == columnDispDtl_calc_ctg_58) doDispDtl_calc_ctg_58_NX(info);
		else if (nx == columnDispDtl_calc_ctg_59) doDispDtl_calc_ctg_59_NX(info);
		else if (nx == columnDispDtl_calc_ctg_60) doDispDtl_calc_ctg_60_NX(info);
		else if (nx == columnDispDtl_calc_ctg_61) doDispDtl_calc_ctg_61_NX(info);
		else if (nx == columnDispDtl_calc_ctg_62) doDispDtl_calc_ctg_62_NX(info);
		else if (nx == columnDispDtl_calc_ctg_63) doDispDtl_calc_ctg_63_NX(info);
		else if (nx == columnDispDtl_calc_ctg_64) doDispDtl_calc_ctg_64_NX(info);
		else if (nx == columnDispDtl_calc_ctg_65) doDispDtl_calc_ctg_65_NX(info);
		else if (nx == columnDispDtl_calc_ctg_66) doDispDtl_calc_ctg_66_NX(info);
		else if (nx == columnDispDtl_calc_ctg_67) doDispDtl_calc_ctg_67_NX(info);
		else if (nx == columnDispDtl_calc_ctg_68) doDispDtl_calc_ctg_68_NX(info);
		else if (nx == columnDispDtl_calc_ctg_69) doDispDtl_calc_ctg_69_NX(info);
		else if (nx == columnDispDtl_calc_ctg_70) doDispDtl_calc_ctg_70_NX(info);
		else if (nx == columnDispDtl_calc_ctg_71) doDispDtl_calc_ctg_71_NX(info);
		else if (nx == columnDispDtl_calc_ctg_72) doDispDtl_calc_ctg_72_NX(info);
		else if (nx == columnDispDtl_calc_ctg_73) doDispDtl_calc_ctg_73_NX(info);
		else if (nx == columnDispDtl_calc_ctg_74) doDispDtl_calc_ctg_74_NX(info);
		else if (nx == columnDispDtl_calc_ctg_75) doDispDtl_calc_ctg_75_NX(info);
		else if (nx == columnDispDtl_calc_ctg_76) doDispDtl_calc_ctg_76_NX(info);
		else if (nx == columnDispDtl_calc_ctg_77) doDispDtl_calc_ctg_77_NX(info);
		else if (nx == columnDispDtl_calc_ctg_78) doDispDtl_calc_ctg_78_NX(info);
		else if (nx == columnDispDtl_calc_ctg_79) doDispDtl_calc_ctg_79_NX(info);
		else if (nx == columnDispDtl_calc_ctg_80) doDispDtl_calc_ctg_80_NX(info);
		else if (nx == columnDispDtl_calc_ctg_81) doDispDtl_calc_ctg_81_NX(info);
		else if (nx == columnDispDtl_calc_ctg_82) doDispDtl_calc_ctg_82_NX(info);
		else if (nx == columnDispDtl_calc_ctg_83) doDispDtl_calc_ctg_83_NX(info);
		else if (nx == columnDispDtl_calc_ctg_84) doDispDtl_calc_ctg_84_NX(info);
		else if (nx == columnDispDtl_calc_ctg_85) doDispDtl_calc_ctg_85_NX(info);
		else if (nx == columnDispDtl_calc_ctg_86) doDispDtl_calc_ctg_86_NX(info);
		else if (nx == columnDispDtl_calc_ctg_87) doDispDtl_calc_ctg_87_NX(info);
		else if (nx == columnDispDtl_calc_ctg_88) doDispDtl_calc_ctg_88_NX(info);
		else if (nx == columnDispDtl_calc_ctg_89) doDispDtl_calc_ctg_89_NX(info);
		else if (nx == columnDispDtl_calc_ctg_90) doDispDtl_calc_ctg_90_NX(info);
		else if (nx == columnDispDtl_calc_ctg_91) doDispDtl_calc_ctg_91_NX(info);
		else if (nx == columnDispDtl_calc_ctg_92) doDispDtl_calc_ctg_92_NX(info);
		else if (nx == columnDispDtl_calc_ctg_93) doDispDtl_calc_ctg_93_NX(info);
		else if (nx == columnDispDtl_calc_ctg_94) doDispDtl_calc_ctg_94_NX(info);
		else if (nx == columnDispDtl_calc_ctg_95) doDispDtl_calc_ctg_95_NX(info);
		else if (nx == columnDispDtl_calc_ctg_96) doDispDtl_calc_ctg_96_NX(info);
		else if (nx == columnDispDtl_calc_ctg_97) doDispDtl_calc_ctg_97_NX(info);
		else if (nx == columnDispDtl_calc_ctg_98) doDispDtl_calc_ctg_98_NX(info);
		else if (nx == columnDispDtl_calc_ctg_99) doDispDtl_calc_ctg_99_NX(info);
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
	 * [DispDtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_prio_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_00_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_01_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_02_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_03_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_04_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_05_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_06_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_07_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_08_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_09_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_10_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_11_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_12_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_13_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_14_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_15_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_16_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_17_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_18_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_19_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_20_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_21_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_22_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_23_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_24_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_25_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_26_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_27_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_28_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_29_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_30_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_31_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_32]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_32_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_33]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_33_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_34]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_34_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_35]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_35_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_36]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_36_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_37]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_37_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_38]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_38_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_39]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_39_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_40]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_40_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_41]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_41_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_42]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_42_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_43]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_43_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_44]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_44_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_45]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_45_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_46]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_46_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_47]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_47_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_48]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_48_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_49]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_49_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_50]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_50_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_51]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_51_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_52]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_52_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_53]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_53_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_54]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_54_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_55]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_55_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_56]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_56_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_57]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_57_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_58]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_58_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_59]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_59_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_60]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_60_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_61]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_61_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_62]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_62_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_63]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_63_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_64]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_64_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_65]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_65_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_66]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_66_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_67]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_67_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_68]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_68_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_69]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_69_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_70]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_70_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_71]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_71_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_72]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_72_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_73]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_73_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_74]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_74_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_75]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_75_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_76]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_76_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_77]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_77_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_78]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_78_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_79]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_79_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_80]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_80_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_81]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_81_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_82]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_82_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_83]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_83_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_84]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_84_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_85]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_85_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_86]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_86_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_87]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_87_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_88]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_88_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_89]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_89_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_90]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_90_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_91]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_91_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_92]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_92_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_93]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_93_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_94]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_94_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_95]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_95_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_96]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_96_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_97]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_97_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_98]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_98_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_99]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_99_NX(MCEventInfo info){
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
		else if (lc == columnDispDtl_calc_grp_cd) doDispDtl_calc_grp_cd_LC(info);
		else if (lc == columnDispDtl_calc_grp_nm) doDispDtl_calc_grp_nm_LC(info);
		else if (lc == columnDispDtl_ctg_prio) doDispDtl_ctg_prio_LC(info);
		else if (lc == columnDispDtl_calc_ctg_00) doDispDtl_calc_ctg_00_LC(info);
		else if (lc == columnDispDtl_calc_ctg_01) doDispDtl_calc_ctg_01_LC(info);
		else if (lc == columnDispDtl_calc_ctg_02) doDispDtl_calc_ctg_02_LC(info);
		else if (lc == columnDispDtl_calc_ctg_03) doDispDtl_calc_ctg_03_LC(info);
		else if (lc == columnDispDtl_calc_ctg_04) doDispDtl_calc_ctg_04_LC(info);
		else if (lc == columnDispDtl_calc_ctg_05) doDispDtl_calc_ctg_05_LC(info);
		else if (lc == columnDispDtl_calc_ctg_06) doDispDtl_calc_ctg_06_LC(info);
		else if (lc == columnDispDtl_calc_ctg_07) doDispDtl_calc_ctg_07_LC(info);
		else if (lc == columnDispDtl_calc_ctg_08) doDispDtl_calc_ctg_08_LC(info);
		else if (lc == columnDispDtl_calc_ctg_09) doDispDtl_calc_ctg_09_LC(info);
		else if (lc == columnDispDtl_calc_ctg_10) doDispDtl_calc_ctg_10_LC(info);
		else if (lc == columnDispDtl_calc_ctg_11) doDispDtl_calc_ctg_11_LC(info);
		else if (lc == columnDispDtl_calc_ctg_12) doDispDtl_calc_ctg_12_LC(info);
		else if (lc == columnDispDtl_calc_ctg_13) doDispDtl_calc_ctg_13_LC(info);
		else if (lc == columnDispDtl_calc_ctg_14) doDispDtl_calc_ctg_14_LC(info);
		else if (lc == columnDispDtl_calc_ctg_15) doDispDtl_calc_ctg_15_LC(info);
		else if (lc == columnDispDtl_calc_ctg_16) doDispDtl_calc_ctg_16_LC(info);
		else if (lc == columnDispDtl_calc_ctg_17) doDispDtl_calc_ctg_17_LC(info);
		else if (lc == columnDispDtl_calc_ctg_18) doDispDtl_calc_ctg_18_LC(info);
		else if (lc == columnDispDtl_calc_ctg_19) doDispDtl_calc_ctg_19_LC(info);
		else if (lc == columnDispDtl_calc_ctg_20) doDispDtl_calc_ctg_20_LC(info);
		else if (lc == columnDispDtl_calc_ctg_21) doDispDtl_calc_ctg_21_LC(info);
		else if (lc == columnDispDtl_calc_ctg_22) doDispDtl_calc_ctg_22_LC(info);
		else if (lc == columnDispDtl_calc_ctg_23) doDispDtl_calc_ctg_23_LC(info);
		else if (lc == columnDispDtl_calc_ctg_24) doDispDtl_calc_ctg_24_LC(info);
		else if (lc == columnDispDtl_calc_ctg_25) doDispDtl_calc_ctg_25_LC(info);
		else if (lc == columnDispDtl_calc_ctg_26) doDispDtl_calc_ctg_26_LC(info);
		else if (lc == columnDispDtl_calc_ctg_27) doDispDtl_calc_ctg_27_LC(info);
		else if (lc == columnDispDtl_calc_ctg_28) doDispDtl_calc_ctg_28_LC(info);
		else if (lc == columnDispDtl_calc_ctg_29) doDispDtl_calc_ctg_29_LC(info);
		else if (lc == columnDispDtl_calc_ctg_30) doDispDtl_calc_ctg_30_LC(info);
		else if (lc == columnDispDtl_calc_ctg_31) doDispDtl_calc_ctg_31_LC(info);
		else if (lc == columnDispDtl_calc_ctg_32) doDispDtl_calc_ctg_32_LC(info);
		else if (lc == columnDispDtl_calc_ctg_33) doDispDtl_calc_ctg_33_LC(info);
		else if (lc == columnDispDtl_calc_ctg_34) doDispDtl_calc_ctg_34_LC(info);
		else if (lc == columnDispDtl_calc_ctg_35) doDispDtl_calc_ctg_35_LC(info);
		else if (lc == columnDispDtl_calc_ctg_36) doDispDtl_calc_ctg_36_LC(info);
		else if (lc == columnDispDtl_calc_ctg_37) doDispDtl_calc_ctg_37_LC(info);
		else if (lc == columnDispDtl_calc_ctg_38) doDispDtl_calc_ctg_38_LC(info);
		else if (lc == columnDispDtl_calc_ctg_39) doDispDtl_calc_ctg_39_LC(info);
		else if (lc == columnDispDtl_calc_ctg_40) doDispDtl_calc_ctg_40_LC(info);
		else if (lc == columnDispDtl_calc_ctg_41) doDispDtl_calc_ctg_41_LC(info);
		else if (lc == columnDispDtl_calc_ctg_42) doDispDtl_calc_ctg_42_LC(info);
		else if (lc == columnDispDtl_calc_ctg_43) doDispDtl_calc_ctg_43_LC(info);
		else if (lc == columnDispDtl_calc_ctg_44) doDispDtl_calc_ctg_44_LC(info);
		else if (lc == columnDispDtl_calc_ctg_45) doDispDtl_calc_ctg_45_LC(info);
		else if (lc == columnDispDtl_calc_ctg_46) doDispDtl_calc_ctg_46_LC(info);
		else if (lc == columnDispDtl_calc_ctg_47) doDispDtl_calc_ctg_47_LC(info);
		else if (lc == columnDispDtl_calc_ctg_48) doDispDtl_calc_ctg_48_LC(info);
		else if (lc == columnDispDtl_calc_ctg_49) doDispDtl_calc_ctg_49_LC(info);
		else if (lc == columnDispDtl_calc_ctg_50) doDispDtl_calc_ctg_50_LC(info);
		else if (lc == columnDispDtl_calc_ctg_51) doDispDtl_calc_ctg_51_LC(info);
		else if (lc == columnDispDtl_calc_ctg_52) doDispDtl_calc_ctg_52_LC(info);
		else if (lc == columnDispDtl_calc_ctg_53) doDispDtl_calc_ctg_53_LC(info);
		else if (lc == columnDispDtl_calc_ctg_54) doDispDtl_calc_ctg_54_LC(info);
		else if (lc == columnDispDtl_calc_ctg_55) doDispDtl_calc_ctg_55_LC(info);
		else if (lc == columnDispDtl_calc_ctg_56) doDispDtl_calc_ctg_56_LC(info);
		else if (lc == columnDispDtl_calc_ctg_57) doDispDtl_calc_ctg_57_LC(info);
		else if (lc == columnDispDtl_calc_ctg_58) doDispDtl_calc_ctg_58_LC(info);
		else if (lc == columnDispDtl_calc_ctg_59) doDispDtl_calc_ctg_59_LC(info);
		else if (lc == columnDispDtl_calc_ctg_60) doDispDtl_calc_ctg_60_LC(info);
		else if (lc == columnDispDtl_calc_ctg_61) doDispDtl_calc_ctg_61_LC(info);
		else if (lc == columnDispDtl_calc_ctg_62) doDispDtl_calc_ctg_62_LC(info);
		else if (lc == columnDispDtl_calc_ctg_63) doDispDtl_calc_ctg_63_LC(info);
		else if (lc == columnDispDtl_calc_ctg_64) doDispDtl_calc_ctg_64_LC(info);
		else if (lc == columnDispDtl_calc_ctg_65) doDispDtl_calc_ctg_65_LC(info);
		else if (lc == columnDispDtl_calc_ctg_66) doDispDtl_calc_ctg_66_LC(info);
		else if (lc == columnDispDtl_calc_ctg_67) doDispDtl_calc_ctg_67_LC(info);
		else if (lc == columnDispDtl_calc_ctg_68) doDispDtl_calc_ctg_68_LC(info);
		else if (lc == columnDispDtl_calc_ctg_69) doDispDtl_calc_ctg_69_LC(info);
		else if (lc == columnDispDtl_calc_ctg_70) doDispDtl_calc_ctg_70_LC(info);
		else if (lc == columnDispDtl_calc_ctg_71) doDispDtl_calc_ctg_71_LC(info);
		else if (lc == columnDispDtl_calc_ctg_72) doDispDtl_calc_ctg_72_LC(info);
		else if (lc == columnDispDtl_calc_ctg_73) doDispDtl_calc_ctg_73_LC(info);
		else if (lc == columnDispDtl_calc_ctg_74) doDispDtl_calc_ctg_74_LC(info);
		else if (lc == columnDispDtl_calc_ctg_75) doDispDtl_calc_ctg_75_LC(info);
		else if (lc == columnDispDtl_calc_ctg_76) doDispDtl_calc_ctg_76_LC(info);
		else if (lc == columnDispDtl_calc_ctg_77) doDispDtl_calc_ctg_77_LC(info);
		else if (lc == columnDispDtl_calc_ctg_78) doDispDtl_calc_ctg_78_LC(info);
		else if (lc == columnDispDtl_calc_ctg_79) doDispDtl_calc_ctg_79_LC(info);
		else if (lc == columnDispDtl_calc_ctg_80) doDispDtl_calc_ctg_80_LC(info);
		else if (lc == columnDispDtl_calc_ctg_81) doDispDtl_calc_ctg_81_LC(info);
		else if (lc == columnDispDtl_calc_ctg_82) doDispDtl_calc_ctg_82_LC(info);
		else if (lc == columnDispDtl_calc_ctg_83) doDispDtl_calc_ctg_83_LC(info);
		else if (lc == columnDispDtl_calc_ctg_84) doDispDtl_calc_ctg_84_LC(info);
		else if (lc == columnDispDtl_calc_ctg_85) doDispDtl_calc_ctg_85_LC(info);
		else if (lc == columnDispDtl_calc_ctg_86) doDispDtl_calc_ctg_86_LC(info);
		else if (lc == columnDispDtl_calc_ctg_87) doDispDtl_calc_ctg_87_LC(info);
		else if (lc == columnDispDtl_calc_ctg_88) doDispDtl_calc_ctg_88_LC(info);
		else if (lc == columnDispDtl_calc_ctg_89) doDispDtl_calc_ctg_89_LC(info);
		else if (lc == columnDispDtl_calc_ctg_90) doDispDtl_calc_ctg_90_LC(info);
		else if (lc == columnDispDtl_calc_ctg_91) doDispDtl_calc_ctg_91_LC(info);
		else if (lc == columnDispDtl_calc_ctg_92) doDispDtl_calc_ctg_92_LC(info);
		else if (lc == columnDispDtl_calc_ctg_93) doDispDtl_calc_ctg_93_LC(info);
		else if (lc == columnDispDtl_calc_ctg_94) doDispDtl_calc_ctg_94_LC(info);
		else if (lc == columnDispDtl_calc_ctg_95) doDispDtl_calc_ctg_95_LC(info);
		else if (lc == columnDispDtl_calc_ctg_96) doDispDtl_calc_ctg_96_LC(info);
		else if (lc == columnDispDtl_calc_ctg_97) doDispDtl_calc_ctg_97_LC(info);
		else if (lc == columnDispDtl_calc_ctg_98) doDispDtl_calc_ctg_98_LC(info);
		else if (lc == columnDispDtl_calc_ctg_99) doDispDtl_calc_ctg_99_LC(info);
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
	 * [DispDtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_prio_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_00_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_01_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_02_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_03_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_04_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_05_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_06_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_07_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_08_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_09_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_10_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_11_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_12_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_13_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_14_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_15_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_16_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_17_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_18_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_19_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_20_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_21_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_22_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_23_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_24_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_25_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_26_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_27_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_28_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_29_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_30_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_31_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_32]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_32_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_33]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_33_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_34]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_34_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_35]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_35_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_36]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_36_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_37]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_37_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_38]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_38_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_39]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_39_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_40]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_40_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_41]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_41_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_42]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_42_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_43]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_43_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_44]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_44_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_45]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_45_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_46]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_46_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_47]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_47_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_48]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_48_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_49]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_49_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_50]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_50_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_51]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_51_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_52]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_52_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_53]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_53_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_54]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_54_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_55]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_55_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_56]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_56_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_57]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_57_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_58]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_58_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_59]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_59_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_60]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_60_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_61]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_61_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_62]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_62_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_63]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_63_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_64]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_64_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_65]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_65_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_66]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_66_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_67]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_67_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_68]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_68_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_69]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_69_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_70]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_70_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_71]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_71_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_72]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_72_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_73]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_73_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_74]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_74_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_75]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_75_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_76]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_76_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_77]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_77_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_78]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_78_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_79]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_79_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_80]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_80_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_81]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_81_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_82]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_82_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_83]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_83_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_84]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_84_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_85]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_85_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_86]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_86_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_87]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_87_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_88]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_88_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_89]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_89_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_90]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_90_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_91]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_91_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_92]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_92_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_93]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_93_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_94]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_94_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_95]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_95_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_96]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_96_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_97]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_97_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_98]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_98_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[calc_ctg_99]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_calc_ctg_99_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_grp_cd]の作成メソッド
	 */
	public MCList getDispDtl_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_00]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_00(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_02]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_02(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_04]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_04(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_06]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_06(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_08]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_08(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_10]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_12]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_12(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_14]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_14(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_16]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_16(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_18]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_18(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_20]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_20(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_22]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_22(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_24]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_24(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_26]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_26(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_28]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_28(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_30]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_30(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_32]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_32(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_34]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_34(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_36]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_36(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_38]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_38(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_40]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_40(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_42]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_42(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_44]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_44(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_46]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_46(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_48]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_48(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_50]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_50(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_52]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_52(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_54]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_54(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_56]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_56(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_58]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_58(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_60]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_60(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_62]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_62(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_64]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_64(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_66]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_66(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_68]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_68(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_70]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_70(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_72]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_72(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_74]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_74(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_76]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_76(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_78]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_78(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_80]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_80(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_82]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_82(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_84]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_84(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_86]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_86(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_88]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_88(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_90]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_90(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_92]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_92(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_94]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_94(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_96]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_96(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDispDtl_calc_ctg_98]の作成メソッド
	 */
	public MCList getDispDtl_calc_ctg_98(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0060.Srch01")) {
			return new MA_MABGL0060_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0060.Upd01")) {
			return new MA_MABGL0060_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0060.Del01")) {
			return new MA_MABGL0060_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0060_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0060_Srch01Bridge() {
			p_MA_MABGL0060_Srch01 = new MCParam(PDef.MA_MABGL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0060.DtlR.class));

			p_MA_MABGL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0060.CndR up0() {
			return (mcframe.clientMABG.MABGP0060.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0060.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0060.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0060.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0060_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0060.DtlR>)p_MA_MABGL0060_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABGL0060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0060_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0060_Upd01Bridge() {
			p_MA_MABGL0060_Upd01 = new MCParam(PDef.MA_MABGL0060_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0060_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0060.DtlR.class));
			// Down

			p_MA_MABGL0060_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0060_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0060_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0060_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0060_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0060.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0060.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0060_Upd01;
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
	 * [MA_MABGL0060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0060_Del01;

		/** コンストラクタ */
		protected MA_MABGL0060_Del01Bridge() {
			p_MA_MABGL0060_Del01 = new MCParam(PDef.MA_MABGL0060_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0060_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0060.DtlR.class));
			// Down

			p_MA_MABGL0060_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0060_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0060_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0060_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0060_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0060.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0060.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0060_Del01;
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