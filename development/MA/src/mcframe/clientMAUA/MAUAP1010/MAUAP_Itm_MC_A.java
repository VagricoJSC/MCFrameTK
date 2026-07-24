package mcframe.clientMAUA.MAUAP1010;

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

/**
 * 画面"MAUAP_Itm"パネルクラスです。<p>
 *
 * 品目の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUAP_Itm_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MAUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUAP1010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_itm_cd_Label = null;
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCTextField Cnd_itm_sub3 = null;
	/**
	 * Item name 品名.<p>
	 *
	 */
	public MCTextField Cnd_itm_nm = null;
	public MCLabel Cnd_bp_itm_cd_Label = null;
	/**
	 * BP item cd. 取引先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_itm_cd = null;
	/**
	 * BP item name 取引先品目名.<p>
	 *
	 */
	public MCTextField Cnd_bp_itm_nm = null;
	public MCLabel Cnd_itm_alt_nm1_Label = null;
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_alt_nm1 = null;
	public MCLabel Cnd_itm_alt_nm2_Label = null;
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_alt_nm2 = null;
	public MCLabel Cnd_itm_alt_nm3_Label = null;
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_alt_nm3 = null;
	public MCLabel Cnd_itm_alt_nm4_Label = null;
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_alt_nm4 = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCLabel Cnd_sundry_itm_flg_lab = null;
	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_on = null;
	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_off = null;
	public MCLabel Cnd_stk_mng_typ_Label = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_mng_typ_nm = null;
	public MCLabel Cnd_asset_mng_typ_Label = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_asset_mng_typ_nm = null;
	public MCLabel Cnd_memo1_c_Label = null;
	/**
	 * Memo 1 (Common) メモ１(共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo1_c = null;
	public MCLabel Cnd_memo2_c_Label = null;
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo2_c = null;
	public MCLabel Cnd_memo3_c_Label = null;
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo3_c = null;
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
	 * Release リリース.<p>
	 *
	 */
	public MCLabel Cnd_release_flg_lab = null;
	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_on = null;
	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_off = null;
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
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	public MCLabel Cnd_rpt_key_cd_Label = null;
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_cd = null;
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_key_nm = null;
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	public MCLabel Cnd_itm_is_srch_typ_nm_Label = null;
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public MCTextField Cnd_itm_is_srch_typ_nm = null;
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [SrchBtn1]ブロック関連のField定義
	public MCPanel SrchBtn1Panel = null;
	// [SrchBtn1]ブロックの項目のField定義
	// [SrchBtn2]ブロック関連のField定義
	public MCPanel SrchBtn2Panel = null;
	// [SrchBtn2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMAUA.MAUAP1010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_cd_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_cd_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_cd_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_cd_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_cd_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_cd_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_alt_nm1 = null;
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_alt_nm2 = null;
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_alt_nm3 = null;
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_alt_nm4 = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ_nm = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
	/**
	 * Release リリース.<p>
	 *
	 */
	public MCColumnConfig columnRslt_release_flg = null;
	/**
	 * BP item cd. 取引先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_itm_cd = null;
	/**
	 * BP item name 取引先品目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_itm_nm = null;
	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1_c = null;
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2_c = null;
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3_c = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3 = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMAUA.MAUAP1010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUA.MAUAP1010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMAUA.MAUAP1010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1010.CndR createCndR() {
		return mcframe.clientMAUA.MAUAP1010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMAUA.MAUAP1010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMAUA.MAUAP1010.RsltR createRsltR() {
		return mcframe.clientMAUA.MAUAP1010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMAUA.MAUAP1010.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(SrchBtn1Panel);
		ret.add(SrchBtn2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Itm_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Itm_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUAP_Itm_MC.jbCreateTop((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateFold((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateTab1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateTab2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateCnd((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateCnd2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateSrchBtn1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateSrchBtn2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateCtrl((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateRslt((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbCreateBtn((MAUAP_Itm)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MAUAP_Itm p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MAUAP_Itm p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MAUAP_Itm p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MAUAP_Itm p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MAUAP_Itm p) {
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
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MAUAP_Itm p) {
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MAUAP_Itm p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MAUAP_Itm p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MAUAP_Itm p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MAUAP_Itm p) {
		p.Rslt_itm_cd_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMAUA.MAUAP1010.RsltR.$itm_cd_p);
		p.Rslt_itm_cd_p_PPanel.setName("Rslt.itm_cd_p");
		p.columnRslt_itm_cd = p.Rslt_itm_cd_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_cd_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_cd_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMAUA.MAUAP1010.RsltR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUAP_Itm p) {
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

	
	/** [Cnd_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_mng_typ_p = null;

	/**
	 * [Cnd_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_mng_typ_ListPutter() {
		if (Cnd_stk_mng_typ_p == null) {
			Cnd_stk_mng_typ_p = createCnd_stk_mng_typ_ListPutter(Cnd_stk_mng_typ, "stk_mng_typ", "stk_mng_typ_nm");

		}
		return Cnd_stk_mng_typ_p;
	}
	
	
	/** [Cnd_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asset_mng_typ_p = null;

	/**
	 * [Cnd_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asset_mng_typ_ListPutter() {
		if (Cnd_asset_mng_typ_p == null) {
			Cnd_asset_mng_typ_p = createCnd_asset_mng_typ_ListPutter(Cnd_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Cnd_asset_mng_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Itm create(){
		MAUAP_Itm p = new MAUAP_Itm();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Itm create(String name){
		MAUAP_Itm p = new MAUAP_Itm(name);
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
		MAUAP_Itm_MC.jbfInitTop((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitFold((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitTab1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitTab2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitCnd((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitCnd2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitSrchBtn1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitSrchBtn2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitCtrl((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitRslt((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbfInitBtn((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitTop((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitFold((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitTab1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitTab2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitCnd((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitCnd2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitSrchBtn1((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitSrchBtn2((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitCtrl((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitRslt((MAUAP_Itm)this);
		MAUAP_Itm_MC.jbInitBtn((MAUAP_Itm)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_itm_cd_Label = p.beansFactory.createLabel("Cnd.itm_cd_Label");
		p.Cnd_itm_cd = p.beansFactory.createTextField("Cnd.itm_cd");
		p.Cnd_itm_cd.setLabel(p.Cnd_itm_cd_Label);
		p.Cnd_itm_sub1 = p.beansFactory.createTextField("Cnd.itm_sub1");
		p.Cnd_itm_sub2 = p.beansFactory.createTextField("Cnd.itm_sub2");
		p.Cnd_itm_sub3 = p.beansFactory.createTextField("Cnd.itm_sub3");
		p.Cnd_itm_nm = p.beansFactory.createTextField("Cnd.itm_nm");
		p.Cnd_bp_itm_cd_Label = p.beansFactory.createLabel("Cnd.bp_itm_cd_Label");
		p.Cnd_bp_itm_cd = p.beansFactory.createTextField("Cnd.bp_itm_cd");
		p.Cnd_bp_itm_cd.setLabel(p.Cnd_bp_itm_cd_Label);
		p.Cnd_bp_itm_nm = p.beansFactory.createTextField("Cnd.bp_itm_nm");
		p.Cnd_itm_alt_nm1_Label = p.beansFactory.createLabel("Cnd.itm_alt_nm1_Label");
		p.Cnd_itm_alt_nm1 = p.beansFactory.createTextField("Cnd.itm_alt_nm1");
		p.Cnd_itm_alt_nm1.setLabel(p.Cnd_itm_alt_nm1_Label);
		p.Cnd_itm_alt_nm2_Label = p.beansFactory.createLabel("Cnd.itm_alt_nm2_Label");
		p.Cnd_itm_alt_nm2 = p.beansFactory.createTextField("Cnd.itm_alt_nm2");
		p.Cnd_itm_alt_nm2.setLabel(p.Cnd_itm_alt_nm2_Label);
		p.Cnd_itm_alt_nm3_Label = p.beansFactory.createLabel("Cnd.itm_alt_nm3_Label");
		p.Cnd_itm_alt_nm3 = p.beansFactory.createTextField("Cnd.itm_alt_nm3");
		p.Cnd_itm_alt_nm3.setLabel(p.Cnd_itm_alt_nm3_Label);
		p.Cnd_itm_alt_nm4_Label = p.beansFactory.createLabel("Cnd.itm_alt_nm4_Label");
		p.Cnd_itm_alt_nm4 = p.beansFactory.createTextField("Cnd.itm_alt_nm4");
		p.Cnd_itm_alt_nm4.setLabel(p.Cnd_itm_alt_nm4_Label);
		p.Cnd_sundry_itm_flg_lab = p.beansFactory.createLabel("Cnd.sundry_itm_flg_lab");
		p.Cnd_sundry_itm_flg_on = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_on");
		p.Cnd_sundry_itm_flg_off = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_off");
		p.Cnd_stk_mng_typ_Label = p.beansFactory.createLabel("Cnd.stk_mng_typ_Label");
		p.Cnd_stk_mng_typ = p.beansFactory.createTextComboBox("Cnd.stk_mng_typ");
		p.Cnd_stk_mng_typ.setLabel(p.Cnd_stk_mng_typ_Label);
		p.Cnd_stk_mng_typ_nm = p.beansFactory.createTextField("Cnd.stk_mng_typ_nm");
		p.Cnd_asset_mng_typ_Label = p.beansFactory.createLabel("Cnd.asset_mng_typ_Label");
		p.Cnd_asset_mng_typ = p.beansFactory.createTextComboBox("Cnd.asset_mng_typ");
		p.Cnd_asset_mng_typ.setLabel(p.Cnd_asset_mng_typ_Label);
		p.Cnd_asset_mng_typ_nm = p.beansFactory.createTextField("Cnd.asset_mng_typ_nm");
		p.Cnd_memo1_c_Label = p.beansFactory.createLabel("Cnd.memo1_c_Label");
		p.Cnd_memo1_c = p.beansFactory.createTextField("Cnd.memo1_c");
		p.Cnd_memo1_c.setLabel(p.Cnd_memo1_c_Label);
		p.Cnd_memo2_c_Label = p.beansFactory.createLabel("Cnd.memo2_c_Label");
		p.Cnd_memo2_c = p.beansFactory.createTextField("Cnd.memo2_c");
		p.Cnd_memo2_c.setLabel(p.Cnd_memo2_c_Label);
		p.Cnd_memo3_c_Label = p.beansFactory.createLabel("Cnd.memo3_c_Label");
		p.Cnd_memo3_c = p.beansFactory.createTextField("Cnd.memo3_c");
		p.Cnd_memo3_c.setLabel(p.Cnd_memo3_c_Label);
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_release_flg_lab = p.beansFactory.createLabel("Cnd.release_flg_lab");
		p.Cnd_release_flg_on = p.beansFactory.createCheckBox("Cnd.release_flg_on");
		p.Cnd_release_flg_off = p.beansFactory.createCheckBox("Cnd.release_flg_off");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_rpt_key_cd_Label = p.beansFactory.createLabel("Cnd.rpt_key_cd_Label");
		p.Cnd_rpt_key_cd = p.beansFactory.createTextField("Cnd.rpt_key_cd");
		p.Cnd_rpt_key_cd.setLabel(p.Cnd_rpt_key_cd_Label);
		p.Cnd_rpt_key_nm = p.beansFactory.createTextField("Cnd.rpt_key_nm");
		p.Cnd_itm_is_srch_typ_nm_Label = p.beansFactory.createLabel("Cnd.itm_is_srch_typ_nm_Label");
		p.Cnd_itm_is_srch_typ_nm = p.beansFactory.createTextField("Cnd.itm_is_srch_typ_nm");
		p.Cnd_itm_is_srch_typ_nm.setLabel(p.Cnd_itm_is_srch_typ_nm_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_itm_alt_nm1 = p.beansFactory.createTableColumn("Rslt.itm_alt_nm1", MCColumnType.TEXT);
		p.columnRslt_itm_alt_nm2 = p.beansFactory.createTableColumn("Rslt.itm_alt_nm2", MCColumnType.TEXT);
		p.columnRslt_itm_alt_nm3 = p.beansFactory.createTableColumn("Rslt.itm_alt_nm3", MCColumnType.TEXT);
		p.columnRslt_itm_alt_nm4 = p.beansFactory.createTableColumn("Rslt.itm_alt_nm4", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_release_flg = p.beansFactory.createTableColumn("Rslt.release_flg", MCColumnType.CHECK);
		p.columnRslt_bp_itm_cd = p.beansFactory.createTableColumn("Rslt.bp_itm_cd", MCColumnType.TEXT);
		p.columnRslt_bp_itm_nm = p.beansFactory.createTableColumn("Rslt.bp_itm_nm", MCColumnType.TEXT);
		p.columnRslt_memo1_c = p.beansFactory.createTableColumn("Rslt.memo1_c", MCColumnType.TEXT);
		p.columnRslt_memo2_c = p.beansFactory.createTableColumn("Rslt.memo2_c", MCColumnType.TEXT);
		p.columnRslt_memo3_c = p.beansFactory.createTableColumn("Rslt.memo3_c", MCColumnType.TEXT);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.SrchBtn1Panel);
		p.TopPanel.add(p.SrchBtn1Panel, null);
		p.SrchBtn1Panel.setNextBeans(p.SrchBtn2Panel);
		p.TopPanel.add(p.SrchBtn2Panel, null);
		p.SrchBtn2Panel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_itm_cd_Label);
		p.CndPanel.add(p.Cnd_itm_cd);
		p.CndPanel.setLastBeans(p.Cnd_itm_cd);
		p.Cnd_itm_cd.setNextBeans(p.Cnd_itm_sub1);
		p.Cnd_itm_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_cd_META);
		p.setPluralValueEnable(p.Cnd_itm_cd, true);
		p.CndPanel.add(p.Cnd_itm_sub1);
		p.Cnd_itm_sub1.setNextBeans(p.Cnd_itm_sub2);
		p.Cnd_itm_sub1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_sub1_META);
		p.setPluralValueEnable(p.Cnd_itm_sub1, true);
		p.CndPanel.add(p.Cnd_itm_sub2);
		p.Cnd_itm_sub2.setNextBeans(p.Cnd_itm_sub3);
		p.Cnd_itm_sub2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_sub2_META);
		p.setPluralValueEnable(p.Cnd_itm_sub2, true);
		p.CndPanel.add(p.Cnd_itm_sub3);
		p.Cnd_itm_sub3.setNextBeans(p.Cnd_itm_nm);
		p.Cnd_itm_sub3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_sub3_META);
		p.setPluralValueEnable(p.Cnd_itm_sub3, true);
		p.CndPanel.add(p.Cnd_itm_nm);
		p.Cnd_itm_nm.setNextBeans(p.Cnd_bp_itm_cd);
		p.Cnd_itm_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_nm, true);
		p.CndPanel.add(p.Cnd_bp_itm_cd_Label);
		p.CndPanel.add(p.Cnd_bp_itm_cd);
		p.Cnd_bp_itm_cd.setNextBeans(p.Cnd_bp_itm_nm);
		p.Cnd_bp_itm_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.bp_itm_cd_META);
		p.setPluralValueEnable(p.Cnd_bp_itm_cd, true);
		p.CndPanel.add(p.Cnd_bp_itm_nm);
		p.Cnd_bp_itm_nm.setNextBeans(p.Cnd_itm_alt_nm1);
		p.Cnd_bp_itm_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.bp_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_alt_nm1_Label);
		p.CndPanel.add(p.Cnd_itm_alt_nm1);
		p.Cnd_itm_alt_nm1.setNextBeans(p.Cnd_itm_alt_nm2);
		p.Cnd_itm_alt_nm1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_alt_nm1, true);
		p.CndPanel.add(p.Cnd_itm_alt_nm2_Label);
		p.CndPanel.add(p.Cnd_itm_alt_nm2);
		p.Cnd_itm_alt_nm2.setNextBeans(p.Cnd_itm_alt_nm3);
		p.Cnd_itm_alt_nm2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_alt_nm2, true);
		p.CndPanel.add(p.Cnd_itm_alt_nm3_Label);
		p.CndPanel.add(p.Cnd_itm_alt_nm3);
		p.Cnd_itm_alt_nm3.setNextBeans(p.Cnd_itm_alt_nm4);
		p.Cnd_itm_alt_nm3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_alt_nm3, true);
		p.CndPanel.add(p.Cnd_itm_alt_nm4_Label);
		p.CndPanel.add(p.Cnd_itm_alt_nm4);
		p.Cnd_itm_alt_nm4.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_alt_nm4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_alt_nm4, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_sundry_itm_flg_on);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_lab);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_on);
		p.Cnd_sundry_itm_flg_on.setNextBeans(p.Cnd_sundry_itm_flg_off);
		p.Cnd_sundry_itm_flg_on.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.sundry_itm_flg_on_META);
		p.CndPanel.add(p.Cnd_sundry_itm_flg_off);
		p.Cnd_sundry_itm_flg_off.setNextBeans(p.Cnd_stk_mng_typ);
		p.Cnd_sundry_itm_flg_off.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.sundry_itm_flg_off_META);
		p.Cnd_stk_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_mng_typ, true);
		p.Cnd_stk_mng_typ.setLinkBeans(p.Cnd_stk_mng_typ_nm);
		p.CndPanel.add(p.Cnd_stk_mng_typ_Label);
		p.CndPanel.add(p.Cnd_stk_mng_typ);
		p.Cnd_stk_mng_typ.setNextBeans(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.stk_mng_typ_META);
		p.CndPanel.add(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ_nm.setNextBeans(p.Cnd_asset_mng_typ);
		p.Cnd_stk_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.stk_mng_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_mng_typ_nm, true);
		p.Cnd_asset_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asset_mng_typ, true);
		p.Cnd_asset_mng_typ.setLinkBeans(p.Cnd_asset_mng_typ_nm);
		p.CndPanel.add(p.Cnd_asset_mng_typ_Label);
		p.CndPanel.add(p.Cnd_asset_mng_typ);
		p.Cnd_asset_mng_typ.setNextBeans(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.asset_mng_typ_META);
		p.CndPanel.add(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ_nm.setNextBeans(p.Cnd_memo1_c);
		p.Cnd_asset_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.asset_mng_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asset_mng_typ_nm, true);
		p.CndPanel.add(p.Cnd_memo1_c_Label);
		p.CndPanel.add(p.Cnd_memo1_c);
		p.Cnd_memo1_c.setNextBeans(p.Cnd_memo2_c);
		p.Cnd_memo1_c.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo1_c_META);
		p.setPluralValueEnable(p.Cnd_memo1_c, true);
		p.CndPanel.add(p.Cnd_memo2_c_Label);
		p.CndPanel.add(p.Cnd_memo2_c);
		p.Cnd_memo2_c.setNextBeans(p.Cnd_memo3_c);
		p.Cnd_memo2_c.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo2_c_META);
		p.setPluralValueEnable(p.Cnd_memo2_c, true);
		p.CndPanel.add(p.Cnd_memo3_c_Label);
		p.CndPanel.add(p.Cnd_memo3_c);
		p.Cnd_memo3_c.setNextBeans(p.Cnd_memo1);
		p.Cnd_memo3_c.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo3_c_META);
		p.setPluralValueEnable(p.Cnd_memo3_c, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_release_flg_on);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_release_flg_lab);
		p.CndPanel.add(p.Cnd_release_flg_on);
		p.Cnd_release_flg_on.setNextBeans(p.Cnd_release_flg_off);
		p.Cnd_release_flg_on.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.release_flg_on_META);
		p.CndPanel.add(p.Cnd_release_flg_off);
		p.Cnd_release_flg_off.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_release_flg_off.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.release_flg_off_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.bp_cd_META);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_dt);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.bp_nm_META);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setNextBeans(p.Cnd_rpt_key_cd);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rpt_key_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_key_cd);
		p.Cnd_rpt_key_cd.setNextBeans(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.rpt_key_cd_META);
		p.CndPanel.add(p.Cnd_rpt_key_nm);
		p.Cnd_rpt_key_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.rpt_key_nm_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.SrchBtn1Panel.add(p.Cnd_itm_is_srch_typ_nm_Label);
		p.SrchBtn1Panel.add(p.Cnd_itm_is_srch_typ_nm);
		p.SrchBtn1Panel.setLastBeans(p.Cnd_itm_is_srch_typ_nm);
		p.Cnd_itm_is_srch_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.itm_is_srch_typ_nm_META);
		p.SrchBtn2Panel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1010.CndR.match_typ_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MAUAP_Itm p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
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
		MAUAP_Itm_MC.mcInitTop((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitFold((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitTab1((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitTab2((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitCnd((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitCnd2((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitSrchBtn1((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitSrchBtn2((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitCtrl((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitRslt((MAUAP_Itm)this);
		MAUAP_Itm_MC.mcInitBtn((MAUAP_Itm)this);

		// [SRCH]ステータスのモードの設定
		MAUAP_Itm_MC.statusInitSRCH_Top((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Fold((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Tab1((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Tab2((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Cnd((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Cnd2((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_SrchBtn1((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_SrchBtn2((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Ctrl((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Rslt((MAUAP_Itm)this);
		MAUAP_Itm_MC.statusInitSRCH_Btn((MAUAP_Itm)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MAUAP_Itm p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MAUAP_Itm p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MAUAP_Itm p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MAUAP_Itm p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MAUAP_Itm p) {
		p.Cnd_itm_cd.setListListener(p);
		p.Cnd_itm_cd.addAllListener(p);
		p.Cnd_itm_sub1.setListListener(p);
		p.Cnd_itm_sub1.addAllListener(p);
		p.Cnd_itm_sub2.setListListener(p);
		p.Cnd_itm_sub2.addAllListener(p);
		p.Cnd_itm_sub3.setListListener(p);
		p.Cnd_itm_sub3.addAllListener(p);
		p.Cnd_itm_nm.setListListener(p);
		p.Cnd_itm_nm.addAllListener(p);
		p.Cnd_bp_itm_cd.setListListener(p);
		p.Cnd_bp_itm_cd.addAllListener(p);
		p.Cnd_bp_itm_nm.setListListener(p);
		p.Cnd_bp_itm_nm.addAllListener(p);
		p.Cnd_itm_alt_nm1.setListListener(p);
		p.Cnd_itm_alt_nm1.addAllListener(p);
		p.Cnd_itm_alt_nm2.setListListener(p);
		p.Cnd_itm_alt_nm2.addAllListener(p);
		p.Cnd_itm_alt_nm3.setListListener(p);
		p.Cnd_itm_alt_nm3.addAllListener(p);
		p.Cnd_itm_alt_nm4.setListListener(p);
		p.Cnd_itm_alt_nm4.addAllListener(p);
		p.Cnd_sundry_itm_flg_on.addAllListener(p);
		p.Cnd_sundry_itm_flg_off.addAllListener(p);
		p.Cnd_stk_mng_typ.setListListener(p);
		p.Cnd_stk_mng_typ.addAllListener(p);
		p.Cnd_stk_mng_typ_nm.setListListener(p);
		p.Cnd_stk_mng_typ_nm.addAllListener(p);
		p.Cnd_asset_mng_typ.setListListener(p);
		p.Cnd_asset_mng_typ.addAllListener(p);
		p.Cnd_asset_mng_typ_nm.setListListener(p);
		p.Cnd_asset_mng_typ_nm.addAllListener(p);
		p.Cnd_memo1_c.setListListener(p);
		p.Cnd_memo1_c.addAllListener(p);
		p.Cnd_memo2_c.setListListener(p);
		p.Cnd_memo2_c.addAllListener(p);
		p.Cnd_memo3_c.setListListener(p);
		p.Cnd_memo3_c.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_release_flg_on.addAllListener(p);
		p.Cnd_release_flg_off.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_rpt_key_cd.setListListener(p);
		p.Cnd_rpt_key_cd.addAllListener(p);
		p.Cnd_rpt_key_nm.setListListener(p);
		p.Cnd_rpt_key_nm.addAllListener(p);
		p.Cnd_itm_is_srch_typ_nm.setListListener(p);
		p.Cnd_itm_is_srch_typ_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MAUAP_Itm p) {
	}

	/**
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MAUAP_Itm p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MAUAP_Itm p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MAUAP_Itm p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MAUAP_Itm p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_itm_alt_nm1.addAllListener(p);
		p.columnRslt_itm_alt_nm1.setListListener(p);
		p.columnRslt_itm_alt_nm2.addAllListener(p);
		p.columnRslt_itm_alt_nm2.setListListener(p);
		p.columnRslt_itm_alt_nm3.addAllListener(p);
		p.columnRslt_itm_alt_nm3.setListListener(p);
		p.columnRslt_itm_alt_nm4.addAllListener(p);
		p.columnRslt_itm_alt_nm4.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_stk_mng_typ_nm.addAllListener(p);
		p.columnRslt_stk_mng_typ_nm.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt_asset_mng_typ_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_release_flg.addAllListener(p);
		p.columnRslt_bp_itm_cd.addAllListener(p);
		p.columnRslt_bp_itm_cd.setListListener(p);
		p.columnRslt_bp_itm_nm.addAllListener(p);
		p.columnRslt_bp_itm_nm.setListListener(p);
		p.columnRslt_memo1_c.addAllListener(p);
		p.columnRslt_memo1_c.setListListener(p);
		p.columnRslt_memo2_c.addAllListener(p);
		p.columnRslt_memo2_c.setListListener(p);
		p.columnRslt_memo3_c.addAllListener(p);
		p.columnRslt_memo3_c.setListListener(p);
		p.columnRslt_memo1.addAllListener(p);
		p.columnRslt_memo1.setListListener(p);
		p.columnRslt_memo2.addAllListener(p);
		p.columnRslt_memo2.setListListener(p);
		p.columnRslt_memo3.addAllListener(p);
		p.columnRslt_memo3.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUAP_Itm p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MAUAP_Itm p){
		p.Cnd_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_sub3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_alt_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_alt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_alt_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_alt_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sundry_itm_flg_off.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_memo1_c.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_release_flg_on.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_release_flg_off.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rpt_key_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_itm_is_srch_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn1(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn2(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MAUAP_Itm p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MAUAP_Itm p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.Rslt_itm_cd_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_alt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_alt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_alt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_alt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_release_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1_c.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2_c.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3_c.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MAUAP_Itm p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

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
		MAUAP_Itm_MC.setTableConfigRslt((MAUAP_Itm)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MAUAP_Itm p) {
		p.columnRslt_check.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addTable(p.Rslt_itm_cd_p_PPanel.ItmTable);
		p.columnRslt_itm_alt_nm1.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_alt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_alt_nm1);
		p.columnRslt_itm_alt_nm2.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_alt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_alt_nm2);
		p.columnRslt_itm_alt_nm3.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_alt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_alt_nm3);
		p.columnRslt_itm_alt_nm4.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_alt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_alt_nm4);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_stk_mng_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.stk_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ_nm);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_asset_mng_typ_nm.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.asset_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_release_flg.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.release_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_release_flg);
		p.columnRslt_bp_itm_cd.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.bp_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_itm_cd);
		p.columnRslt_bp_itm_nm.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.bp_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_itm_nm);
		p.columnRslt_memo1_c.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo1_c_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1_c);
		p.columnRslt_memo2_c.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo2_c_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2_c);
		p.columnRslt_memo3_c.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo3_c_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3_c);
		p.columnRslt_memo1.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_mng_typ.getListConfig().setPutter(getCnd_stk_mng_typ_ListPutter());
		Cnd_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asset_mng_typ.getListConfig().setPutter(getCnd_asset_mng_typ_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [Cnd_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_stk_mng_typ) return getCnd_stk_mng_typ(row, info);
		if(combo == Cnd_asset_mng_typ) return getCnd_asset_mng_typ(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept) doBtn_accept(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_itm_cd) return doCnd_itm_cd_VC(info);
		if (vc == Cnd_itm_sub1) return doCnd_itm_sub1_VC(info);
		if (vc == Cnd_itm_sub2) return doCnd_itm_sub2_VC(info);
		if (vc == Cnd_itm_sub3) return doCnd_itm_sub3_VC(info);
		if (vc == Cnd_itm_nm) return doCnd_itm_nm_VC(info);
		if (vc == Cnd_bp_itm_cd) return doCnd_bp_itm_cd_VC(info);
		if (vc == Cnd_bp_itm_nm) return doCnd_bp_itm_nm_VC(info);
		if (vc == Cnd_itm_alt_nm1) return doCnd_itm_alt_nm1_VC(info);
		if (vc == Cnd_itm_alt_nm2) return doCnd_itm_alt_nm2_VC(info);
		if (vc == Cnd_itm_alt_nm3) return doCnd_itm_alt_nm3_VC(info);
		if (vc == Cnd_itm_alt_nm4) return doCnd_itm_alt_nm4_VC(info);
		if (vc == Cnd_sundry_itm_flg_on) return doCnd_sundry_itm_flg_on_VC(info);
		if (vc == Cnd_sundry_itm_flg_off) return doCnd_sundry_itm_flg_off_VC(info);
		if (vc == Cnd_stk_mng_typ) return doCnd_stk_mng_typ_VC(info);
		if (vc == Cnd_stk_mng_typ_nm) return doCnd_stk_mng_typ_nm_VC(info);
		if (vc == Cnd_asset_mng_typ) return doCnd_asset_mng_typ_VC(info);
		if (vc == Cnd_asset_mng_typ_nm) return doCnd_asset_mng_typ_nm_VC(info);
		if (vc == Cnd_memo1_c) return doCnd_memo1_c_VC(info);
		if (vc == Cnd_memo2_c) return doCnd_memo2_c_VC(info);
		if (vc == Cnd_memo3_c) return doCnd_memo3_c_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_release_flg_on) return doCnd_release_flg_on_VC(info);
		if (vc == Cnd_release_flg_off) return doCnd_release_flg_off_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
		if (vc == Cnd_rpt_key_cd) return doCnd_rpt_key_cd_VC(info);
		if (vc == Cnd_rpt_key_nm) return doCnd_rpt_key_nm_VC(info);
		if (vc == Cnd_itm_is_srch_typ_nm) return doCnd_itm_is_srch_typ_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_itm_alt_nm1) return doRslt_itm_alt_nm1_VC(info);
		if (vc == columnRslt_itm_alt_nm2) return doRslt_itm_alt_nm2_VC(info);
		if (vc == columnRslt_itm_alt_nm3) return doRslt_itm_alt_nm3_VC(info);
		if (vc == columnRslt_itm_alt_nm4) return doRslt_itm_alt_nm4_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_stk_mng_typ_nm) return doRslt_stk_mng_typ_nm_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ_nm) return doRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_release_flg) return doRslt_release_flg_VC(info);
		if (vc == columnRslt_bp_itm_cd) return doRslt_bp_itm_cd_VC(info);
		if (vc == columnRslt_bp_itm_nm) return doRslt_bp_itm_nm_VC(info);
		if (vc == columnRslt_memo1_c) return doRslt_memo1_c_VC(info);
		if (vc == columnRslt_memo2_c) return doRslt_memo2_c_VC(info);
		if (vc == columnRslt_memo3_c) return doRslt_memo3_c_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_c_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[release_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_off_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_is_srch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_is_srch_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[match_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_match_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[release_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_release_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_itm_cd) doCnd_itm_cd_NC(info);
		else if (nc == Cnd_itm_sub1) doCnd_itm_sub1_NC(info);
		else if (nc == Cnd_itm_sub2) doCnd_itm_sub2_NC(info);
		else if (nc == Cnd_itm_sub3) doCnd_itm_sub3_NC(info);
		else if (nc == Cnd_itm_nm) doCnd_itm_nm_NC(info);
		else if (nc == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NC(info);
		else if (nc == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NC(info);
		else if (nc == Cnd_itm_alt_nm1) doCnd_itm_alt_nm1_NC(info);
		else if (nc == Cnd_itm_alt_nm2) doCnd_itm_alt_nm2_NC(info);
		else if (nc == Cnd_itm_alt_nm3) doCnd_itm_alt_nm3_NC(info);
		else if (nc == Cnd_itm_alt_nm4) doCnd_itm_alt_nm4_NC(info);
		else if (nc == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NC(info);
		else if (nc == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NC(info);
		else if (nc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NC(info);
		else if (nc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NC(info);
		else if (nc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NC(info);
		else if (nc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NC(info);
		else if (nc == Cnd_memo1_c) doCnd_memo1_c_NC(info);
		else if (nc == Cnd_memo2_c) doCnd_memo2_c_NC(info);
		else if (nc == Cnd_memo3_c) doCnd_memo3_c_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_release_flg_on) doCnd_release_flg_on_NC(info);
		else if (nc == Cnd_release_flg_off) doCnd_release_flg_off_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
		else if (nc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NC(info);
		else if (nc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NC(info);
		else if (nc == Cnd_itm_is_srch_typ_nm) doCnd_itm_is_srch_typ_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_itm_alt_nm1) doRslt_itm_alt_nm1_NC(info);
		else if (nc == columnRslt_itm_alt_nm2) doRslt_itm_alt_nm2_NC(info);
		else if (nc == columnRslt_itm_alt_nm3) doRslt_itm_alt_nm3_NC(info);
		else if (nc == columnRslt_itm_alt_nm4) doRslt_itm_alt_nm4_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_release_flg) doRslt_release_flg_NC(info);
		else if (nc == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NC(info);
		else if (nc == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NC(info);
		else if (nc == columnRslt_memo1_c) doRslt_memo1_c_NC(info);
		else if (nc == columnRslt_memo2_c) doRslt_memo2_c_NC(info);
		else if (nc == columnRslt_memo3_c) doRslt_memo3_c_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[release_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_is_srch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[release_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_release_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_c_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_c_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_c_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_itm_cd) doCnd_itm_cd_NE(info);
		else if (ne == Cnd_itm_sub1) doCnd_itm_sub1_NE(info);
		else if (ne == Cnd_itm_sub2) doCnd_itm_sub2_NE(info);
		else if (ne == Cnd_itm_sub3) doCnd_itm_sub3_NE(info);
		else if (ne == Cnd_itm_nm) doCnd_itm_nm_NE(info);
		else if (ne == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NE(info);
		else if (ne == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NE(info);
		else if (ne == Cnd_itm_alt_nm1) doCnd_itm_alt_nm1_NE(info);
		else if (ne == Cnd_itm_alt_nm2) doCnd_itm_alt_nm2_NE(info);
		else if (ne == Cnd_itm_alt_nm3) doCnd_itm_alt_nm3_NE(info);
		else if (ne == Cnd_itm_alt_nm4) doCnd_itm_alt_nm4_NE(info);
		else if (ne == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NE(info);
		else if (ne == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NE(info);
		else if (ne == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NE(info);
		else if (ne == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NE(info);
		else if (ne == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NE(info);
		else if (ne == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NE(info);
		else if (ne == Cnd_memo1_c) doCnd_memo1_c_NE(info);
		else if (ne == Cnd_memo2_c) doCnd_memo2_c_NE(info);
		else if (ne == Cnd_memo3_c) doCnd_memo3_c_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_release_flg_on) doCnd_release_flg_on_NE(info);
		else if (ne == Cnd_release_flg_off) doCnd_release_flg_off_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
		else if (ne == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NE(info);
		else if (ne == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NE(info);
		else if (ne == Cnd_itm_is_srch_typ_nm) doCnd_itm_is_srch_typ_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_itm_alt_nm1) doRslt_itm_alt_nm1_NE(info);
		else if (ne == columnRslt_itm_alt_nm2) doRslt_itm_alt_nm2_NE(info);
		else if (ne == columnRslt_itm_alt_nm3) doRslt_itm_alt_nm3_NE(info);
		else if (ne == columnRslt_itm_alt_nm4) doRslt_itm_alt_nm4_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_release_flg) doRslt_release_flg_NE(info);
		else if (ne == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NE(info);
		else if (ne == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NE(info);
		else if (ne == columnRslt_memo1_c) doRslt_memo1_c_NE(info);
		else if (ne == columnRslt_memo2_c) doRslt_memo2_c_NE(info);
		else if (ne == columnRslt_memo3_c) doRslt_memo3_c_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[release_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_is_srch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[release_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_release_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_c_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_c_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_c_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_itm_cd) doCnd_itm_cd_NX(info);
		else if (nx == Cnd_itm_sub1) doCnd_itm_sub1_NX(info);
		else if (nx == Cnd_itm_sub2) doCnd_itm_sub2_NX(info);
		else if (nx == Cnd_itm_sub3) doCnd_itm_sub3_NX(info);
		else if (nx == Cnd_itm_nm) doCnd_itm_nm_NX(info);
		else if (nx == Cnd_bp_itm_cd) doCnd_bp_itm_cd_NX(info);
		else if (nx == Cnd_bp_itm_nm) doCnd_bp_itm_nm_NX(info);
		else if (nx == Cnd_itm_alt_nm1) doCnd_itm_alt_nm1_NX(info);
		else if (nx == Cnd_itm_alt_nm2) doCnd_itm_alt_nm2_NX(info);
		else if (nx == Cnd_itm_alt_nm3) doCnd_itm_alt_nm3_NX(info);
		else if (nx == Cnd_itm_alt_nm4) doCnd_itm_alt_nm4_NX(info);
		else if (nx == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NX(info);
		else if (nx == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NX(info);
		else if (nx == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NX(info);
		else if (nx == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NX(info);
		else if (nx == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NX(info);
		else if (nx == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NX(info);
		else if (nx == Cnd_memo1_c) doCnd_memo1_c_NX(info);
		else if (nx == Cnd_memo2_c) doCnd_memo2_c_NX(info);
		else if (nx == Cnd_memo3_c) doCnd_memo3_c_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_release_flg_on) doCnd_release_flg_on_NX(info);
		else if (nx == Cnd_release_flg_off) doCnd_release_flg_off_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
		else if (nx == Cnd_rpt_key_cd) doCnd_rpt_key_cd_NX(info);
		else if (nx == Cnd_rpt_key_nm) doCnd_rpt_key_nm_NX(info);
		else if (nx == Cnd_itm_is_srch_typ_nm) doCnd_itm_is_srch_typ_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_itm_alt_nm1) doRslt_itm_alt_nm1_NX(info);
		else if (nx == columnRslt_itm_alt_nm2) doRslt_itm_alt_nm2_NX(info);
		else if (nx == columnRslt_itm_alt_nm3) doRslt_itm_alt_nm3_NX(info);
		else if (nx == columnRslt_itm_alt_nm4) doRslt_itm_alt_nm4_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_release_flg) doRslt_release_flg_NX(info);
		else if (nx == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_NX(info);
		else if (nx == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_NX(info);
		else if (nx == columnRslt_memo1_c) doRslt_memo1_c_NX(info);
		else if (nx == columnRslt_memo2_c) doRslt_memo2_c_NX(info);
		else if (nx == columnRslt_memo3_c) doRslt_memo3_c_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[release_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_is_srch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[release_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_release_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_c_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_c_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_c_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_itm_cd) doCnd_itm_cd_LC(info);
		else if (lc == Cnd_itm_sub1) doCnd_itm_sub1_LC(info);
		else if (lc == Cnd_itm_sub2) doCnd_itm_sub2_LC(info);
		else if (lc == Cnd_itm_sub3) doCnd_itm_sub3_LC(info);
		else if (lc == Cnd_itm_nm) doCnd_itm_nm_LC(info);
		else if (lc == Cnd_bp_itm_cd) doCnd_bp_itm_cd_LC(info);
		else if (lc == Cnd_bp_itm_nm) doCnd_bp_itm_nm_LC(info);
		else if (lc == Cnd_itm_alt_nm1) doCnd_itm_alt_nm1_LC(info);
		else if (lc == Cnd_itm_alt_nm2) doCnd_itm_alt_nm2_LC(info);
		else if (lc == Cnd_itm_alt_nm3) doCnd_itm_alt_nm3_LC(info);
		else if (lc == Cnd_itm_alt_nm4) doCnd_itm_alt_nm4_LC(info);
		else if (lc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_LC(info);
		else if (lc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_LC(info);
		else if (lc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_LC(info);
		else if (lc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_LC(info);
		else if (lc == Cnd_memo1_c) doCnd_memo1_c_LC(info);
		else if (lc == Cnd_memo2_c) doCnd_memo2_c_LC(info);
		else if (lc == Cnd_memo3_c) doCnd_memo3_c_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
		else if (lc == Cnd_rpt_key_cd) doCnd_rpt_key_cd_LC(info);
		else if (lc == Cnd_rpt_key_nm) doCnd_rpt_key_nm_LC(info);
		else if (lc == Cnd_itm_is_srch_typ_nm) doCnd_itm_is_srch_typ_nm_LC(info);
		else if (lc == columnRslt_itm_alt_nm1) doRslt_itm_alt_nm1_LC(info);
		else if (lc == columnRslt_itm_alt_nm2) doRslt_itm_alt_nm2_LC(info);
		else if (lc == columnRslt_itm_alt_nm3) doRslt_itm_alt_nm3_LC(info);
		else if (lc == columnRslt_itm_alt_nm4) doRslt_itm_alt_nm4_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt_bp_itm_cd) doRslt_bp_itm_cd_LC(info);
		else if (lc == columnRslt_bp_itm_nm) doRslt_bp_itm_nm_LC(info);
		else if (lc == columnRslt_memo1_c) doRslt_memo1_c_LC(info);
		else if (lc == columnRslt_memo2_c) doRslt_memo2_c_LC(info);
		else if (lc == columnRslt_memo3_c) doRslt_memo3_c_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_is_srch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_c_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_c_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_c_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_mng_typ]の作成メソッド
	 */
	public MCList getCnd_stk_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asset_mng_typ]の作成メソッド
	 */
	public MCList getCnd_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}