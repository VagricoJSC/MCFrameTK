package mcframe.clientMGBE.MGBEP0030;

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
import mcframe.clientMGBE.MGBEP0030.MGBEP_StdBreakdownSrch_MC.MG_MGBEL0030_Srch01Caller;

/**
 * 画面"MGBEP_StdBreakdownSrch"パネルクラスです。<p>
 *
 * 標準単価の内訳を検索します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBEP_StdBreakdownSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBEP0030";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
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
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
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
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns_grp = null;
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns = null;
	/**
	 * | |.<p>
	 *
	 */
	public MCLabel LPnl_sep_1 = null;
	/**
	 * Display ideal 理論表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_the = null;
	/**
	 * | |.<p>
	 *
	 */
	public MCLabel LPnl_sep_2 = null;
	public MCLabel LPnl_add_disp_digit_Label = null;
	/**
	 * Additional display digits 追加表示桁.<p>
	 *
	 */
	public MCNumberField LPnl_add_disp_digit = null;
	/**
	 * Display again 再表示.<p>
	 *
	 */
	public MCButton LPnl_redisplay = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Explode all 全展開する.<p>
	 *
	 */
	public MCButton RPnl_srch_all = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBE.MGBEP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Rslt_hrrchy_p_PPanel;
	public MCColumnConfig columnRslt_ext;// [Rslt]の[hrrchy_p.ext]を[columnRslt_ext]としてエイリアス定義。
	public MCColumnConfig columnRslt_hrrchy_str;// [Rslt]の[hrrchy_p.hrrchy_str]を[columnRslt_hrrchy_str]としてエイリアス定義。
	public MCColumnConfig columnRslt_extno;// [Rslt]の[hrrchy_p.extno]を[columnRslt_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_extno;// [Rslt]の[hrrchy_p.par_extno]を[columnRslt_par_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_loop_flg;// [Rslt]の[hrrchy_p.loop_flg]を[columnRslt_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_leaf_str;// [Rslt]の[hrrchy_p.leaf_str]を[columnRslt_leaf_str]としてエイリアス定義。
	/**
	 * Bottom 最下層.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bottom_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_nm = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std_upri = null;
	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_the_upri = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_std_qty_p_PPanel;
	public MCColumnConfig columnRslt_std_qty;// [Rslt]の[std_qty_p.qty]を[columnRslt_std_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_the_qty_p_PPanel;
	public MCColumnConfig columnRslt_the_qty;// [Rslt]の[the_qty_p.qty]を[columnRslt_the_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Component ratio 構成比.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rate = null;
	/**
	 * Ideal cost 理論原価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_the_cost = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl = null;
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCColumnConfig columnRslt_var_cost = null;
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fxd_cost = null;
	public MCColumnConfig columnRslt_col_000 = null;
	public MCColumnConfig columnRslt_col_001 = null;
	public MCColumnConfig columnRslt_col_002 = null;
	public MCColumnConfig columnRslt_col_003 = null;
	public MCColumnConfig columnRslt_col_004 = null;
	public MCColumnConfig columnRslt_col_005 = null;
	public MCColumnConfig columnRslt_col_006 = null;
	public MCColumnConfig columnRslt_col_007 = null;
	public MCColumnConfig columnRslt_col_008 = null;
	public MCColumnConfig columnRslt_col_009 = null;
	public MCColumnConfig columnRslt_col_010 = null;
	public MCColumnConfig columnRslt_col_011 = null;
	public MCColumnConfig columnRslt_col_012 = null;
	public MCColumnConfig columnRslt_col_013 = null;
	public MCColumnConfig columnRslt_col_014 = null;
	public MCColumnConfig columnRslt_col_015 = null;
	public MCColumnConfig columnRslt_col_016 = null;
	public MCColumnConfig columnRslt_col_017 = null;
	public MCColumnConfig columnRslt_col_018 = null;
	public MCColumnConfig columnRslt_col_019 = null;
	public MCColumnConfig columnRslt_col_020 = null;
	public MCColumnConfig columnRslt_col_021 = null;
	public MCColumnConfig columnRslt_col_022 = null;
	public MCColumnConfig columnRslt_col_023 = null;
	public MCColumnConfig columnRslt_col_024 = null;
	public MCColumnConfig columnRslt_col_025 = null;
	public MCColumnConfig columnRslt_col_026 = null;
	public MCColumnConfig columnRslt_col_027 = null;
	public MCColumnConfig columnRslt_col_028 = null;
	public MCColumnConfig columnRslt_col_029 = null;
	public MCColumnConfig columnRslt_col_030 = null;
	public MCColumnConfig columnRslt_col_031 = null;
	public MCColumnConfig columnRslt_col_032 = null;
	public MCColumnConfig columnRslt_col_033 = null;
	public MCColumnConfig columnRslt_col_034 = null;
	public MCColumnConfig columnRslt_col_035 = null;
	public MCColumnConfig columnRslt_col_036 = null;
	public MCColumnConfig columnRslt_col_037 = null;
	public MCColumnConfig columnRslt_col_038 = null;
	public MCColumnConfig columnRslt_col_039 = null;
	public MCColumnConfig columnRslt_col_040 = null;
	public MCColumnConfig columnRslt_col_041 = null;
	public MCColumnConfig columnRslt_col_042 = null;
	public MCColumnConfig columnRslt_col_043 = null;
	public MCColumnConfig columnRslt_col_044 = null;
	public MCColumnConfig columnRslt_col_045 = null;
	public MCColumnConfig columnRslt_col_046 = null;
	public MCColumnConfig columnRslt_col_047 = null;
	public MCColumnConfig columnRslt_col_048 = null;
	public MCColumnConfig columnRslt_col_049 = null;
	public MCColumnConfig columnRslt_col_050 = null;
	public MCColumnConfig columnRslt_col_051 = null;
	public MCColumnConfig columnRslt_col_052 = null;
	public MCColumnConfig columnRslt_col_053 = null;
	public MCColumnConfig columnRslt_col_054 = null;
	public MCColumnConfig columnRslt_col_055 = null;
	public MCColumnConfig columnRslt_col_056 = null;
	public MCColumnConfig columnRslt_col_057 = null;
	public MCColumnConfig columnRslt_col_058 = null;
	public MCColumnConfig columnRslt_col_059 = null;
	public MCColumnConfig columnRslt_col_060 = null;
	public MCColumnConfig columnRslt_col_061 = null;
	public MCColumnConfig columnRslt_col_062 = null;
	public MCColumnConfig columnRslt_col_063 = null;
	public MCColumnConfig columnRslt_col_064 = null;
	public MCColumnConfig columnRslt_col_065 = null;
	public MCColumnConfig columnRslt_col_066 = null;
	public MCColumnConfig columnRslt_col_067 = null;
	public MCColumnConfig columnRslt_col_068 = null;
	public MCColumnConfig columnRslt_col_069 = null;
	public MCColumnConfig columnRslt_col_070 = null;
	public MCColumnConfig columnRslt_col_071 = null;
	public MCColumnConfig columnRslt_col_072 = null;
	public MCColumnConfig columnRslt_col_073 = null;
	public MCColumnConfig columnRslt_col_074 = null;
	public MCColumnConfig columnRslt_col_075 = null;
	public MCColumnConfig columnRslt_col_076 = null;
	public MCColumnConfig columnRslt_col_077 = null;
	public MCColumnConfig columnRslt_col_078 = null;
	public MCColumnConfig columnRslt_col_079 = null;
	public MCColumnConfig columnRslt_col_080 = null;
	public MCColumnConfig columnRslt_col_081 = null;
	public MCColumnConfig columnRslt_col_082 = null;
	public MCColumnConfig columnRslt_col_083 = null;
	public MCColumnConfig columnRslt_col_084 = null;
	public MCColumnConfig columnRslt_col_085 = null;
	public MCColumnConfig columnRslt_col_086 = null;
	public MCColumnConfig columnRslt_col_087 = null;
	public MCColumnConfig columnRslt_col_088 = null;
	public MCColumnConfig columnRslt_col_089 = null;
	public MCColumnConfig columnRslt_col_090 = null;
	public MCColumnConfig columnRslt_col_091 = null;
	public MCColumnConfig columnRslt_col_092 = null;
	public MCColumnConfig columnRslt_col_093 = null;
	public MCColumnConfig columnRslt_col_094 = null;
	public MCColumnConfig columnRslt_col_095 = null;
	public MCColumnConfig columnRslt_col_096 = null;
	public MCColumnConfig columnRslt_col_097 = null;
	public MCColumnConfig columnRslt_col_098 = null;
	public MCColumnConfig columnRslt_col_099 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Standard item operation cost 標準品目工程原価一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBEP0020 = null;
	/**
	 * Standard unit cost 標準単価一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBEP0010 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MG_MGBEL0030_Srch01]のCallerの作成 */
	protected MGBEP_StdBreakdownSrch_MC.MG_MGBEL0030_Srch01Caller createMG_MGBEL0030_Srch01() {
		MGBEP_StdBreakdownSrch_MC.MG_MGBEL0030_Srch01Caller<MGBEP_StdBreakdownSrch, MG_MGBEL0030_Srch01Bridge>
		caller = ((MGBEP_StdBreakdownSrch_MC)this).new MG_MGBEL0030_Srch01Caller<MGBEP_StdBreakdownSrch, MG_MGBEL0030_Srch01Bridge>(
					(MGBEP_StdBreakdownSrch)this, new MG_MGBEL0030_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBEL0030_Srch01]の呼び出し */
	protected void callMG_MGBEL0030_Srch01() {
		MCCaller caller = createMG_MGBEL0030_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0030.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0030.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBE.MGBEP0030.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBE.MGBEP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0030.CndR createCndR() {
		return mcframe.clientMGBE.MGBEP0030.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBE.MGBEP0030.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBE.MGBEP0030.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBE.MGBEP0030.LPnlR createLPnlR() {
		return mcframe.clientMGBE.MGBEP0030.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBE.MGBEP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBE.MGBEP0030.RsltR createRsltR() {
		return mcframe.clientMGBE.MGBEP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBE.MGBEP0030.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdBreakdownSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBEP_StdBreakdownSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBEP_StdBreakdownSrch_MC.jbCreateTop((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateFold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateCnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateLPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateCtrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateRPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateRslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbCreateBtn((MGBEP_StdBreakdownSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBEP_StdBreakdownSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
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
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBEP_StdBreakdownSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBEP_StdBreakdownSrch p) {
		p.Rslt_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMGBE.MGBEP0030.RsltR.$hrrchy_p);
		p.Rslt_hrrchy_p_PPanel.setName("Rslt.hrrchy_p");
		p.columnRslt_ext = p.Rslt_hrrchy_p_PPanel.columnHrrchy_ext;
		p.columnRslt_ext.addAliasName("Rslt.ext", p);
		p.columnRslt_hrrchy_str = p.Rslt_hrrchy_p_PPanel.columnHrrchy_hrrchy_str;
		p.columnRslt_hrrchy_str.addAliasName("Rslt.hrrchy_str", p);
		p.columnRslt_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnRslt_extno.addAliasName("Rslt.extno", p);
		p.columnRslt_par_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnRslt_par_extno.addAliasName("Rslt.par_extno", p);
		p.columnRslt_loop_flg = p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnRslt_loop_flg.addAliasName("Rslt.loop_flg", p);
		p.columnRslt_leaf_str = p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnRslt_leaf_str.addAliasName("Rslt.leaf_str", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBE.MGBEP0030.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_std_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0030.RsltR.$std_qty_p);
		p.Rslt_std_qty_p_PPanel.setName("Rslt.std_qty_p");
		p.columnRslt_std_qty = p.Rslt_std_qty_p_PPanel.columnQty_qty;
		p.columnRslt_std_qty.addAliasName("Rslt.std_qty", p);
		p.Rslt_the_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0030.RsltR.$the_qty_p);
		p.Rslt_the_qty_p_PPanel.setName("Rslt.the_qty_p");
		p.columnRslt_the_qty = p.Rslt_the_qty_p_PPanel.columnQty_qty;
		p.columnRslt_the_qty.addAliasName("Rslt.the_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBEP_StdBreakdownSrch p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdBreakdownSrch create(){
		MGBEP_StdBreakdownSrch p = new MGBEP_StdBreakdownSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdBreakdownSrch create(String name){
		MGBEP_StdBreakdownSrch p = new MGBEP_StdBreakdownSrch(name);
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
		MGBEP_StdBreakdownSrch_MC.jbfInitTop((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitFold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitCnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitLPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitCtrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitRPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitRslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbfInitBtn((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitTop((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitFold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitCnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitLPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitCtrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitRPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitRslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.jbInitBtn((MGBEP_StdBreakdownSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextComboBox("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_disp_expns_grp = p.beansFactory.createCheckBox("LPnl.disp_expns_grp");
		p.LPnl_disp_expns = p.beansFactory.createCheckBox("LPnl.disp_expns");
		p.LPnl_sep_1 = p.beansFactory.createLabel("LPnl.sep_1");
		p.LPnl_disp_the = p.beansFactory.createCheckBox("LPnl.disp_the");
		p.LPnl_sep_2 = p.beansFactory.createLabel("LPnl.sep_2");
		p.LPnl_add_disp_digit_Label = p.beansFactory.createLabel("LPnl.add_disp_digit_Label");
		p.LPnl_add_disp_digit = p.beansFactory.createNumberField("LPnl.add_disp_digit");
		p.LPnl_add_disp_digit.setLabel(p.LPnl_add_disp_digit_Label);
		p.LPnl_redisplay = p.beansFactory.createButton("LPnl.redisplay");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_all = p.beansFactory.createButton("RPnl.srch_all", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_bottom_flg = p.beansFactory.createTableColumn("Rslt.bottom_flg", MCColumnType.CHECK);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_std_upri = p.beansFactory.createTableColumn("Rslt.std_upri", MCColumnType.NUMBER);
		p.columnRslt_the_upri = p.beansFactory.createTableColumn("Rslt.the_upri", MCColumnType.NUMBER);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_rate = p.beansFactory.createTableColumn("Rslt.rate", MCColumnType.NUMBER);
		p.columnRslt_the_cost = p.beansFactory.createTableColumn("Rslt.the_cost", MCColumnType.NUMBER);
		p.columnRslt_ttl = p.beansFactory.createTableColumn("Rslt.ttl", MCColumnType.NUMBER);
		p.columnRslt_var_cost = p.beansFactory.createTableColumn("Rslt.var_cost", MCColumnType.NUMBER);
		p.columnRslt_fxd_cost = p.beansFactory.createTableColumn("Rslt.fxd_cost", MCColumnType.NUMBER);
		p.columnRslt_col_000 = p.beansFactory.createTableColumn("Rslt.col_000", MCColumnType.NUMBER);
		p.columnRslt_col_001 = p.beansFactory.createTableColumn("Rslt.col_001", MCColumnType.NUMBER);
		p.columnRslt_col_002 = p.beansFactory.createTableColumn("Rslt.col_002", MCColumnType.NUMBER);
		p.columnRslt_col_003 = p.beansFactory.createTableColumn("Rslt.col_003", MCColumnType.NUMBER);
		p.columnRslt_col_004 = p.beansFactory.createTableColumn("Rslt.col_004", MCColumnType.NUMBER);
		p.columnRslt_col_005 = p.beansFactory.createTableColumn("Rslt.col_005", MCColumnType.NUMBER);
		p.columnRslt_col_006 = p.beansFactory.createTableColumn("Rslt.col_006", MCColumnType.NUMBER);
		p.columnRslt_col_007 = p.beansFactory.createTableColumn("Rslt.col_007", MCColumnType.NUMBER);
		p.columnRslt_col_008 = p.beansFactory.createTableColumn("Rslt.col_008", MCColumnType.NUMBER);
		p.columnRslt_col_009 = p.beansFactory.createTableColumn("Rslt.col_009", MCColumnType.NUMBER);
		p.columnRslt_col_010 = p.beansFactory.createTableColumn("Rslt.col_010", MCColumnType.NUMBER);
		p.columnRslt_col_011 = p.beansFactory.createTableColumn("Rslt.col_011", MCColumnType.NUMBER);
		p.columnRslt_col_012 = p.beansFactory.createTableColumn("Rslt.col_012", MCColumnType.NUMBER);
		p.columnRslt_col_013 = p.beansFactory.createTableColumn("Rslt.col_013", MCColumnType.NUMBER);
		p.columnRslt_col_014 = p.beansFactory.createTableColumn("Rslt.col_014", MCColumnType.NUMBER);
		p.columnRslt_col_015 = p.beansFactory.createTableColumn("Rslt.col_015", MCColumnType.NUMBER);
		p.columnRslt_col_016 = p.beansFactory.createTableColumn("Rslt.col_016", MCColumnType.NUMBER);
		p.columnRslt_col_017 = p.beansFactory.createTableColumn("Rslt.col_017", MCColumnType.NUMBER);
		p.columnRslt_col_018 = p.beansFactory.createTableColumn("Rslt.col_018", MCColumnType.NUMBER);
		p.columnRslt_col_019 = p.beansFactory.createTableColumn("Rslt.col_019", MCColumnType.NUMBER);
		p.columnRslt_col_020 = p.beansFactory.createTableColumn("Rslt.col_020", MCColumnType.NUMBER);
		p.columnRslt_col_021 = p.beansFactory.createTableColumn("Rslt.col_021", MCColumnType.NUMBER);
		p.columnRslt_col_022 = p.beansFactory.createTableColumn("Rslt.col_022", MCColumnType.NUMBER);
		p.columnRslt_col_023 = p.beansFactory.createTableColumn("Rslt.col_023", MCColumnType.NUMBER);
		p.columnRslt_col_024 = p.beansFactory.createTableColumn("Rslt.col_024", MCColumnType.NUMBER);
		p.columnRslt_col_025 = p.beansFactory.createTableColumn("Rslt.col_025", MCColumnType.NUMBER);
		p.columnRslt_col_026 = p.beansFactory.createTableColumn("Rslt.col_026", MCColumnType.NUMBER);
		p.columnRslt_col_027 = p.beansFactory.createTableColumn("Rslt.col_027", MCColumnType.NUMBER);
		p.columnRslt_col_028 = p.beansFactory.createTableColumn("Rslt.col_028", MCColumnType.NUMBER);
		p.columnRslt_col_029 = p.beansFactory.createTableColumn("Rslt.col_029", MCColumnType.NUMBER);
		p.columnRslt_col_030 = p.beansFactory.createTableColumn("Rslt.col_030", MCColumnType.NUMBER);
		p.columnRslt_col_031 = p.beansFactory.createTableColumn("Rslt.col_031", MCColumnType.NUMBER);
		p.columnRslt_col_032 = p.beansFactory.createTableColumn("Rslt.col_032", MCColumnType.NUMBER);
		p.columnRslt_col_033 = p.beansFactory.createTableColumn("Rslt.col_033", MCColumnType.NUMBER);
		p.columnRslt_col_034 = p.beansFactory.createTableColumn("Rslt.col_034", MCColumnType.NUMBER);
		p.columnRslt_col_035 = p.beansFactory.createTableColumn("Rslt.col_035", MCColumnType.NUMBER);
		p.columnRslt_col_036 = p.beansFactory.createTableColumn("Rslt.col_036", MCColumnType.NUMBER);
		p.columnRslt_col_037 = p.beansFactory.createTableColumn("Rslt.col_037", MCColumnType.NUMBER);
		p.columnRslt_col_038 = p.beansFactory.createTableColumn("Rslt.col_038", MCColumnType.NUMBER);
		p.columnRslt_col_039 = p.beansFactory.createTableColumn("Rslt.col_039", MCColumnType.NUMBER);
		p.columnRslt_col_040 = p.beansFactory.createTableColumn("Rslt.col_040", MCColumnType.NUMBER);
		p.columnRslt_col_041 = p.beansFactory.createTableColumn("Rslt.col_041", MCColumnType.NUMBER);
		p.columnRslt_col_042 = p.beansFactory.createTableColumn("Rslt.col_042", MCColumnType.NUMBER);
		p.columnRslt_col_043 = p.beansFactory.createTableColumn("Rslt.col_043", MCColumnType.NUMBER);
		p.columnRslt_col_044 = p.beansFactory.createTableColumn("Rslt.col_044", MCColumnType.NUMBER);
		p.columnRslt_col_045 = p.beansFactory.createTableColumn("Rslt.col_045", MCColumnType.NUMBER);
		p.columnRslt_col_046 = p.beansFactory.createTableColumn("Rslt.col_046", MCColumnType.NUMBER);
		p.columnRslt_col_047 = p.beansFactory.createTableColumn("Rslt.col_047", MCColumnType.NUMBER);
		p.columnRslt_col_048 = p.beansFactory.createTableColumn("Rslt.col_048", MCColumnType.NUMBER);
		p.columnRslt_col_049 = p.beansFactory.createTableColumn("Rslt.col_049", MCColumnType.NUMBER);
		p.columnRslt_col_050 = p.beansFactory.createTableColumn("Rslt.col_050", MCColumnType.NUMBER);
		p.columnRslt_col_051 = p.beansFactory.createTableColumn("Rslt.col_051", MCColumnType.NUMBER);
		p.columnRslt_col_052 = p.beansFactory.createTableColumn("Rslt.col_052", MCColumnType.NUMBER);
		p.columnRslt_col_053 = p.beansFactory.createTableColumn("Rslt.col_053", MCColumnType.NUMBER);
		p.columnRslt_col_054 = p.beansFactory.createTableColumn("Rslt.col_054", MCColumnType.NUMBER);
		p.columnRslt_col_055 = p.beansFactory.createTableColumn("Rslt.col_055", MCColumnType.NUMBER);
		p.columnRslt_col_056 = p.beansFactory.createTableColumn("Rslt.col_056", MCColumnType.NUMBER);
		p.columnRslt_col_057 = p.beansFactory.createTableColumn("Rslt.col_057", MCColumnType.NUMBER);
		p.columnRslt_col_058 = p.beansFactory.createTableColumn("Rslt.col_058", MCColumnType.NUMBER);
		p.columnRslt_col_059 = p.beansFactory.createTableColumn("Rslt.col_059", MCColumnType.NUMBER);
		p.columnRslt_col_060 = p.beansFactory.createTableColumn("Rslt.col_060", MCColumnType.NUMBER);
		p.columnRslt_col_061 = p.beansFactory.createTableColumn("Rslt.col_061", MCColumnType.NUMBER);
		p.columnRslt_col_062 = p.beansFactory.createTableColumn("Rslt.col_062", MCColumnType.NUMBER);
		p.columnRslt_col_063 = p.beansFactory.createTableColumn("Rslt.col_063", MCColumnType.NUMBER);
		p.columnRslt_col_064 = p.beansFactory.createTableColumn("Rslt.col_064", MCColumnType.NUMBER);
		p.columnRslt_col_065 = p.beansFactory.createTableColumn("Rslt.col_065", MCColumnType.NUMBER);
		p.columnRslt_col_066 = p.beansFactory.createTableColumn("Rslt.col_066", MCColumnType.NUMBER);
		p.columnRslt_col_067 = p.beansFactory.createTableColumn("Rslt.col_067", MCColumnType.NUMBER);
		p.columnRslt_col_068 = p.beansFactory.createTableColumn("Rslt.col_068", MCColumnType.NUMBER);
		p.columnRslt_col_069 = p.beansFactory.createTableColumn("Rslt.col_069", MCColumnType.NUMBER);
		p.columnRslt_col_070 = p.beansFactory.createTableColumn("Rslt.col_070", MCColumnType.NUMBER);
		p.columnRslt_col_071 = p.beansFactory.createTableColumn("Rslt.col_071", MCColumnType.NUMBER);
		p.columnRslt_col_072 = p.beansFactory.createTableColumn("Rslt.col_072", MCColumnType.NUMBER);
		p.columnRslt_col_073 = p.beansFactory.createTableColumn("Rslt.col_073", MCColumnType.NUMBER);
		p.columnRslt_col_074 = p.beansFactory.createTableColumn("Rslt.col_074", MCColumnType.NUMBER);
		p.columnRslt_col_075 = p.beansFactory.createTableColumn("Rslt.col_075", MCColumnType.NUMBER);
		p.columnRslt_col_076 = p.beansFactory.createTableColumn("Rslt.col_076", MCColumnType.NUMBER);
		p.columnRslt_col_077 = p.beansFactory.createTableColumn("Rslt.col_077", MCColumnType.NUMBER);
		p.columnRslt_col_078 = p.beansFactory.createTableColumn("Rslt.col_078", MCColumnType.NUMBER);
		p.columnRslt_col_079 = p.beansFactory.createTableColumn("Rslt.col_079", MCColumnType.NUMBER);
		p.columnRslt_col_080 = p.beansFactory.createTableColumn("Rslt.col_080", MCColumnType.NUMBER);
		p.columnRslt_col_081 = p.beansFactory.createTableColumn("Rslt.col_081", MCColumnType.NUMBER);
		p.columnRslt_col_082 = p.beansFactory.createTableColumn("Rslt.col_082", MCColumnType.NUMBER);
		p.columnRslt_col_083 = p.beansFactory.createTableColumn("Rslt.col_083", MCColumnType.NUMBER);
		p.columnRslt_col_084 = p.beansFactory.createTableColumn("Rslt.col_084", MCColumnType.NUMBER);
		p.columnRslt_col_085 = p.beansFactory.createTableColumn("Rslt.col_085", MCColumnType.NUMBER);
		p.columnRslt_col_086 = p.beansFactory.createTableColumn("Rslt.col_086", MCColumnType.NUMBER);
		p.columnRslt_col_087 = p.beansFactory.createTableColumn("Rslt.col_087", MCColumnType.NUMBER);
		p.columnRslt_col_088 = p.beansFactory.createTableColumn("Rslt.col_088", MCColumnType.NUMBER);
		p.columnRslt_col_089 = p.beansFactory.createTableColumn("Rslt.col_089", MCColumnType.NUMBER);
		p.columnRslt_col_090 = p.beansFactory.createTableColumn("Rslt.col_090", MCColumnType.NUMBER);
		p.columnRslt_col_091 = p.beansFactory.createTableColumn("Rslt.col_091", MCColumnType.NUMBER);
		p.columnRslt_col_092 = p.beansFactory.createTableColumn("Rslt.col_092", MCColumnType.NUMBER);
		p.columnRslt_col_093 = p.beansFactory.createTableColumn("Rslt.col_093", MCColumnType.NUMBER);
		p.columnRslt_col_094 = p.beansFactory.createTableColumn("Rslt.col_094", MCColumnType.NUMBER);
		p.columnRslt_col_095 = p.beansFactory.createTableColumn("Rslt.col_095", MCColumnType.NUMBER);
		p.columnRslt_col_096 = p.beansFactory.createTableColumn("Rslt.col_096", MCColumnType.NUMBER);
		p.columnRslt_col_097 = p.beansFactory.createTableColumn("Rslt.col_097", MCColumnType.NUMBER);
		p.columnRslt_col_098 = p.beansFactory.createTableColumn("Rslt.col_098", MCColumnType.NUMBER);
		p.columnRslt_col_099 = p.beansFactory.createTableColumn("Rslt.col_099", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBEP0020 = p.beansFactory.createButton("Btn.open_MGBEP0020", "open");
		p.Btn_open_MGBEP0010 = p.beansFactory.createButton("Btn.open_MGBEP0010", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBEP_StdBreakdownSrch p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, false);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.Cnd_loc_cd.setLinkBeans(p.Cnd_loc_nm);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.loc_cd_META);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.loc_nm_META);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0030.CndR.sppl_nm_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_disp_expns_grp);
		p.LPnlPanel.setLastBeans(p.LPnl_disp_expns_grp);
		p.LPnl_disp_expns_grp.setNextBeans(p.LPnl_disp_expns);
		p.LPnl_disp_expns_grp.setRow(p.getLPnlR(), mcframe.clientMGBE.MGBEP0030.LPnlR.disp_expns_grp_META);
		p.LPnlPanel.add(p.LPnl_disp_expns);
		p.LPnl_disp_expns.setNextBeans(p.LPnl_disp_the);
		p.LPnl_disp_expns.setRow(p.getLPnlR(), mcframe.clientMGBE.MGBEP0030.LPnlR.disp_expns_META);
		p.LPnlPanel.add(p.LPnl_sep_1);
		p.LPnlPanel.add(p.LPnl_disp_the);
		p.LPnl_disp_the.setNextBeans(p.LPnl_add_disp_digit);
		p.LPnl_disp_the.setRow(p.getLPnlR(), mcframe.clientMGBE.MGBEP0030.LPnlR.disp_the_META);
		p.LPnlPanel.add(p.LPnl_sep_2);
		p.LPnlPanel.add(p.LPnl_add_disp_digit_Label);
		p.LPnlPanel.add(p.LPnl_add_disp_digit);
		p.LPnl_add_disp_digit.setNextBeans(p.LPnl_redisplay);
		p.LPnl_add_disp_digit.setRow(p.getLPnlR(), mcframe.clientMGBE.MGBEP0030.LPnlR.add_disp_digit_META);
		p.LPnl_redisplay.setFunctionKey(MCFunctionKey.F15);
		p.LPnlPanel.add(p.LPnl_redisplay);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_all.setIcon("SEARCH");
		p.RPnl_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.RPnlPanel.add(p.RPnl_srch_all);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_all);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBEP_StdBreakdownSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBEP0020.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBEP0020);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBEP0020);
		p.Btn_open_MGBEP0020.setNextBeans(p.Btn_open_MGBEP0010);
		p.Btn_open_MGBEP0010.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBEP0010);
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
		MGBEP_StdBreakdownSrch_MC.mcInitTop((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitFold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitCnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitLPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitCtrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitRPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitRslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.mcInitBtn((MGBEP_StdBreakdownSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Top((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Fold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Cnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_LPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Ctrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_RPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Rslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitSRCH_Btn((MGBEP_StdBreakdownSrch)this);

		// [REF]ステータスのモードの設定
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Top((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Fold((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Cnd((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_LPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Ctrl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_RPnl((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Rslt((MGBEP_StdBreakdownSrch)this);
		MGBEP_StdBreakdownSrch_MC.statusInitREF_Btn((MGBEP_StdBreakdownSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBEP_StdBreakdownSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBEP_StdBreakdownSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBEP_StdBreakdownSrch p) {
		p.LPnl_disp_expns_grp.addAllListener(p);
		p.LPnl_disp_expns.addAllListener(p);
		p.LPnl_disp_the.addAllListener(p);
		p.LPnl_add_disp_digit.setListListener(p);
		p.LPnl_add_disp_digit.addAllListener(p);
		p.LPnl_redisplay.addAllListener(p);
		p.LPnl_redisplay.setAPMethodName("doLPnl_redisplay");
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBEP_StdBreakdownSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MGBEP_StdBreakdownSrch p) {
		p.RPnl_srch_all.addAllListener(p);
		p.RPnl_srch_all.setAPMethodName("doRPnl_srch_all");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBEP_StdBreakdownSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_bottom_flg.addAllListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_itm_jnl_cd.addAllListener(p);
		p.columnRslt_itm_jnl_cd.setListListener(p);
		p.columnRslt_itm_jnl_nm.addAllListener(p);
		p.columnRslt_itm_jnl_nm.setListListener(p);
		p.columnRslt_std_upri.addAllListener(p);
		p.columnRslt_std_upri.setListListener(p);
		p.columnRslt_the_upri.addAllListener(p);
		p.columnRslt_the_upri.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_rate.addAllListener(p);
		p.columnRslt_rate.setListListener(p);
		p.columnRslt_the_cost.addAllListener(p);
		p.columnRslt_the_cost.setListListener(p);
		p.columnRslt_ttl.addAllListener(p);
		p.columnRslt_ttl.setListListener(p);
		p.columnRslt_var_cost.addAllListener(p);
		p.columnRslt_var_cost.setListListener(p);
		p.columnRslt_fxd_cost.addAllListener(p);
		p.columnRslt_fxd_cost.setListListener(p);
		p.columnRslt_col_000.addAllListener(p);
		p.columnRslt_col_000.setListListener(p);
		p.columnRslt_col_001.addAllListener(p);
		p.columnRslt_col_001.setListListener(p);
		p.columnRslt_col_002.addAllListener(p);
		p.columnRslt_col_002.setListListener(p);
		p.columnRslt_col_003.addAllListener(p);
		p.columnRslt_col_003.setListListener(p);
		p.columnRslt_col_004.addAllListener(p);
		p.columnRslt_col_004.setListListener(p);
		p.columnRslt_col_005.addAllListener(p);
		p.columnRslt_col_005.setListListener(p);
		p.columnRslt_col_006.addAllListener(p);
		p.columnRslt_col_006.setListListener(p);
		p.columnRslt_col_007.addAllListener(p);
		p.columnRslt_col_007.setListListener(p);
		p.columnRslt_col_008.addAllListener(p);
		p.columnRslt_col_008.setListListener(p);
		p.columnRslt_col_009.addAllListener(p);
		p.columnRslt_col_009.setListListener(p);
		p.columnRslt_col_010.addAllListener(p);
		p.columnRslt_col_010.setListListener(p);
		p.columnRslt_col_011.addAllListener(p);
		p.columnRslt_col_011.setListListener(p);
		p.columnRslt_col_012.addAllListener(p);
		p.columnRslt_col_012.setListListener(p);
		p.columnRslt_col_013.addAllListener(p);
		p.columnRslt_col_013.setListListener(p);
		p.columnRslt_col_014.addAllListener(p);
		p.columnRslt_col_014.setListListener(p);
		p.columnRslt_col_015.addAllListener(p);
		p.columnRslt_col_015.setListListener(p);
		p.columnRslt_col_016.addAllListener(p);
		p.columnRslt_col_016.setListListener(p);
		p.columnRslt_col_017.addAllListener(p);
		p.columnRslt_col_017.setListListener(p);
		p.columnRslt_col_018.addAllListener(p);
		p.columnRslt_col_018.setListListener(p);
		p.columnRslt_col_019.addAllListener(p);
		p.columnRslt_col_019.setListListener(p);
		p.columnRslt_col_020.addAllListener(p);
		p.columnRslt_col_020.setListListener(p);
		p.columnRslt_col_021.addAllListener(p);
		p.columnRslt_col_021.setListListener(p);
		p.columnRslt_col_022.addAllListener(p);
		p.columnRslt_col_022.setListListener(p);
		p.columnRslt_col_023.addAllListener(p);
		p.columnRslt_col_023.setListListener(p);
		p.columnRslt_col_024.addAllListener(p);
		p.columnRslt_col_024.setListListener(p);
		p.columnRslt_col_025.addAllListener(p);
		p.columnRslt_col_025.setListListener(p);
		p.columnRslt_col_026.addAllListener(p);
		p.columnRslt_col_026.setListListener(p);
		p.columnRslt_col_027.addAllListener(p);
		p.columnRslt_col_027.setListListener(p);
		p.columnRslt_col_028.addAllListener(p);
		p.columnRslt_col_028.setListListener(p);
		p.columnRslt_col_029.addAllListener(p);
		p.columnRslt_col_029.setListListener(p);
		p.columnRslt_col_030.addAllListener(p);
		p.columnRslt_col_030.setListListener(p);
		p.columnRslt_col_031.addAllListener(p);
		p.columnRslt_col_031.setListListener(p);
		p.columnRslt_col_032.addAllListener(p);
		p.columnRslt_col_032.setListListener(p);
		p.columnRslt_col_033.addAllListener(p);
		p.columnRslt_col_033.setListListener(p);
		p.columnRslt_col_034.addAllListener(p);
		p.columnRslt_col_034.setListListener(p);
		p.columnRslt_col_035.addAllListener(p);
		p.columnRslt_col_035.setListListener(p);
		p.columnRslt_col_036.addAllListener(p);
		p.columnRslt_col_036.setListListener(p);
		p.columnRslt_col_037.addAllListener(p);
		p.columnRslt_col_037.setListListener(p);
		p.columnRslt_col_038.addAllListener(p);
		p.columnRslt_col_038.setListListener(p);
		p.columnRslt_col_039.addAllListener(p);
		p.columnRslt_col_039.setListListener(p);
		p.columnRslt_col_040.addAllListener(p);
		p.columnRslt_col_040.setListListener(p);
		p.columnRslt_col_041.addAllListener(p);
		p.columnRslt_col_041.setListListener(p);
		p.columnRslt_col_042.addAllListener(p);
		p.columnRslt_col_042.setListListener(p);
		p.columnRslt_col_043.addAllListener(p);
		p.columnRslt_col_043.setListListener(p);
		p.columnRslt_col_044.addAllListener(p);
		p.columnRslt_col_044.setListListener(p);
		p.columnRslt_col_045.addAllListener(p);
		p.columnRslt_col_045.setListListener(p);
		p.columnRslt_col_046.addAllListener(p);
		p.columnRslt_col_046.setListListener(p);
		p.columnRslt_col_047.addAllListener(p);
		p.columnRslt_col_047.setListListener(p);
		p.columnRslt_col_048.addAllListener(p);
		p.columnRslt_col_048.setListListener(p);
		p.columnRslt_col_049.addAllListener(p);
		p.columnRslt_col_049.setListListener(p);
		p.columnRslt_col_050.addAllListener(p);
		p.columnRslt_col_050.setListListener(p);
		p.columnRslt_col_051.addAllListener(p);
		p.columnRslt_col_051.setListListener(p);
		p.columnRslt_col_052.addAllListener(p);
		p.columnRslt_col_052.setListListener(p);
		p.columnRslt_col_053.addAllListener(p);
		p.columnRslt_col_053.setListListener(p);
		p.columnRslt_col_054.addAllListener(p);
		p.columnRslt_col_054.setListListener(p);
		p.columnRslt_col_055.addAllListener(p);
		p.columnRslt_col_055.setListListener(p);
		p.columnRslt_col_056.addAllListener(p);
		p.columnRslt_col_056.setListListener(p);
		p.columnRslt_col_057.addAllListener(p);
		p.columnRslt_col_057.setListListener(p);
		p.columnRslt_col_058.addAllListener(p);
		p.columnRslt_col_058.setListListener(p);
		p.columnRslt_col_059.addAllListener(p);
		p.columnRslt_col_059.setListListener(p);
		p.columnRslt_col_060.addAllListener(p);
		p.columnRslt_col_060.setListListener(p);
		p.columnRslt_col_061.addAllListener(p);
		p.columnRslt_col_061.setListListener(p);
		p.columnRslt_col_062.addAllListener(p);
		p.columnRslt_col_062.setListListener(p);
		p.columnRslt_col_063.addAllListener(p);
		p.columnRslt_col_063.setListListener(p);
		p.columnRslt_col_064.addAllListener(p);
		p.columnRslt_col_064.setListListener(p);
		p.columnRslt_col_065.addAllListener(p);
		p.columnRslt_col_065.setListListener(p);
		p.columnRslt_col_066.addAllListener(p);
		p.columnRslt_col_066.setListListener(p);
		p.columnRslt_col_067.addAllListener(p);
		p.columnRslt_col_067.setListListener(p);
		p.columnRslt_col_068.addAllListener(p);
		p.columnRslt_col_068.setListListener(p);
		p.columnRslt_col_069.addAllListener(p);
		p.columnRslt_col_069.setListListener(p);
		p.columnRslt_col_070.addAllListener(p);
		p.columnRslt_col_070.setListListener(p);
		p.columnRslt_col_071.addAllListener(p);
		p.columnRslt_col_071.setListListener(p);
		p.columnRslt_col_072.addAllListener(p);
		p.columnRslt_col_072.setListListener(p);
		p.columnRslt_col_073.addAllListener(p);
		p.columnRslt_col_073.setListListener(p);
		p.columnRslt_col_074.addAllListener(p);
		p.columnRslt_col_074.setListListener(p);
		p.columnRslt_col_075.addAllListener(p);
		p.columnRslt_col_075.setListListener(p);
		p.columnRslt_col_076.addAllListener(p);
		p.columnRslt_col_076.setListListener(p);
		p.columnRslt_col_077.addAllListener(p);
		p.columnRslt_col_077.setListListener(p);
		p.columnRslt_col_078.addAllListener(p);
		p.columnRslt_col_078.setListListener(p);
		p.columnRslt_col_079.addAllListener(p);
		p.columnRslt_col_079.setListListener(p);
		p.columnRslt_col_080.addAllListener(p);
		p.columnRslt_col_080.setListListener(p);
		p.columnRslt_col_081.addAllListener(p);
		p.columnRslt_col_081.setListListener(p);
		p.columnRslt_col_082.addAllListener(p);
		p.columnRslt_col_082.setListListener(p);
		p.columnRslt_col_083.addAllListener(p);
		p.columnRslt_col_083.setListListener(p);
		p.columnRslt_col_084.addAllListener(p);
		p.columnRslt_col_084.setListListener(p);
		p.columnRslt_col_085.addAllListener(p);
		p.columnRslt_col_085.setListListener(p);
		p.columnRslt_col_086.addAllListener(p);
		p.columnRslt_col_086.setListListener(p);
		p.columnRslt_col_087.addAllListener(p);
		p.columnRslt_col_087.setListListener(p);
		p.columnRslt_col_088.addAllListener(p);
		p.columnRslt_col_088.setListListener(p);
		p.columnRslt_col_089.addAllListener(p);
		p.columnRslt_col_089.setListListener(p);
		p.columnRslt_col_090.addAllListener(p);
		p.columnRslt_col_090.setListListener(p);
		p.columnRslt_col_091.addAllListener(p);
		p.columnRslt_col_091.setListListener(p);
		p.columnRslt_col_092.addAllListener(p);
		p.columnRslt_col_092.setListListener(p);
		p.columnRslt_col_093.addAllListener(p);
		p.columnRslt_col_093.setListListener(p);
		p.columnRslt_col_094.addAllListener(p);
		p.columnRslt_col_094.setListListener(p);
		p.columnRslt_col_095.addAllListener(p);
		p.columnRslt_col_095.setListListener(p);
		p.columnRslt_col_096.addAllListener(p);
		p.columnRslt_col_096.setListListener(p);
		p.columnRslt_col_097.addAllListener(p);
		p.columnRslt_col_097.setListListener(p);
		p.columnRslt_col_098.addAllListener(p);
		p.columnRslt_col_098.setListListener(p);
		p.columnRslt_col_099.addAllListener(p);
		p.columnRslt_col_099.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBEP_StdBreakdownSrch p) {
		p.Btn_open_MGBEP0020.addAllListener(p);
		p.Btn_open_MGBEP0020.setAPMethodName("doBtn_open_MGBEP0020");
		p.Btn_open_MGBEP0010.addAllListener(p);
		p.Btn_open_MGBEP0010.setAPMethodName("doBtn_open_MGBEP0010");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBEP_StdBreakdownSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBEP_StdBreakdownSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBEP_StdBreakdownSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBEP_StdBreakdownSrch p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_disp_the.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_add_disp_digit.putMode(p, SRCH, MCMode.REQUIRED);
		p.LPnl_redisplay.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBEP_StdBreakdownSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MGBEP_StdBreakdownSrch p){
		p.RPnl_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBEP_StdBreakdownSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.READ_ONLY);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bottom_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_std_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_the_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_std_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_the_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_the_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_var_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fxd_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBEP_StdBreakdownSrch p){
		p.Btn_open_MGBEP0020.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBEP0010.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBEP_StdBreakdownSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBEP_StdBreakdownSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBEP_StdBreakdownSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBEP_StdBreakdownSrch p){
		p.LPnl_disp_expns_grp.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_disp_the.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_add_disp_digit.putMode(p, REF, MCMode.REQUIRED);
		p.LPnl_redisplay.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBEP_StdBreakdownSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MGBEP_StdBreakdownSrch p){
		p.RPnl_srch_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBEP_StdBreakdownSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.REQUIRED);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bottom_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_std_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_the_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_std_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_the_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_the_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_var_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fxd_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBEP_StdBreakdownSrch p){
		p.Btn_open_MGBEP0020.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBEP0010.putMode(p, REF, MCMode.ENABLE);

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
		MGBEP_StdBreakdownSrch_MC.setTableConfigRslt((MGBEP_StdBreakdownSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBEP_StdBreakdownSrch p) {
		p.RsltTable.addTable(p.Rslt_hrrchy_p_PPanel.HrrchyTable);
		p.columnRslt_bottom_flg.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.bottom_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bottom_flg);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_std_upri.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.std_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std_upri);
		p.columnRslt_the_upri.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.the_upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_the_upri);
		p.RsltTable.addTable(p.Rslt_std_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_the_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_rate.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rate);
		p.columnRslt_the_cost.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.the_cost_META);
		p.RsltTable.addColumnConfig(p.columnRslt_the_cost);
		p.columnRslt_ttl.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.ttl_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl);
		p.columnRslt_var_cost.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.var_cost_META);
		p.RsltTable.addColumnConfig(p.columnRslt_var_cost);
		p.columnRslt_fxd_cost.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.fxd_cost_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fxd_cost);
		p.columnRslt_col_000.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_000_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_000);
		p.columnRslt_col_001.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_001_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_001);
		p.columnRslt_col_002.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_002_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_002);
		p.columnRslt_col_003.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_003_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_003);
		p.columnRslt_col_004.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_004_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_004);
		p.columnRslt_col_005.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_005_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_005);
		p.columnRslt_col_006.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_006_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_006);
		p.columnRslt_col_007.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_007_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_007);
		p.columnRslt_col_008.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_008_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_008);
		p.columnRslt_col_009.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_009_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_009);
		p.columnRslt_col_010.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_010_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_010);
		p.columnRslt_col_011.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_011_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_011);
		p.columnRslt_col_012.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_012_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_012);
		p.columnRslt_col_013.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_013_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_013);
		p.columnRslt_col_014.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_014_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_014);
		p.columnRslt_col_015.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_015_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_015);
		p.columnRslt_col_016.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_016_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_016);
		p.columnRslt_col_017.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_017_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_017);
		p.columnRslt_col_018.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_018_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_018);
		p.columnRslt_col_019.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_019_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_019);
		p.columnRslt_col_020.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_020_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_020);
		p.columnRslt_col_021.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_021_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_021);
		p.columnRslt_col_022.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_022_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_022);
		p.columnRslt_col_023.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_023_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_023);
		p.columnRslt_col_024.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_024_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_024);
		p.columnRslt_col_025.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_025_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_025);
		p.columnRslt_col_026.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_026_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_026);
		p.columnRslt_col_027.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_027_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_027);
		p.columnRslt_col_028.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_028_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_028);
		p.columnRslt_col_029.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_029_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_029);
		p.columnRslt_col_030.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_030_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_030);
		p.columnRslt_col_031.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_031_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_031);
		p.columnRslt_col_032.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_032_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_032);
		p.columnRslt_col_033.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_033_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_033);
		p.columnRslt_col_034.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_034_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_034);
		p.columnRslt_col_035.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_035_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_035);
		p.columnRslt_col_036.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_036_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_036);
		p.columnRslt_col_037.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_037_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_037);
		p.columnRslt_col_038.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_038_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_038);
		p.columnRslt_col_039.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_039_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_039);
		p.columnRslt_col_040.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_040_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_040);
		p.columnRslt_col_041.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_041_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_041);
		p.columnRslt_col_042.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_042_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_042);
		p.columnRslt_col_043.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_043_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_043);
		p.columnRslt_col_044.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_044_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_044);
		p.columnRslt_col_045.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_045_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_045);
		p.columnRslt_col_046.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_046_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_046);
		p.columnRslt_col_047.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_047_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_047);
		p.columnRslt_col_048.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_048_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_048);
		p.columnRslt_col_049.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_049_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_049);
		p.columnRslt_col_050.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_050_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_050);
		p.columnRslt_col_051.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_051_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_051);
		p.columnRslt_col_052.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_052_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_052);
		p.columnRslt_col_053.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_053_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_053);
		p.columnRslt_col_054.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_054_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_054);
		p.columnRslt_col_055.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_055_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_055);
		p.columnRslt_col_056.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_056_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_056);
		p.columnRslt_col_057.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_057_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_057);
		p.columnRslt_col_058.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_058_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_058);
		p.columnRslt_col_059.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_059_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_059);
		p.columnRslt_col_060.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_060_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_060);
		p.columnRslt_col_061.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_061_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_061);
		p.columnRslt_col_062.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_062_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_062);
		p.columnRslt_col_063.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_063_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_063);
		p.columnRslt_col_064.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_064_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_064);
		p.columnRslt_col_065.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_065_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_065);
		p.columnRslt_col_066.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_066_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_066);
		p.columnRslt_col_067.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_067_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_067);
		p.columnRslt_col_068.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_068_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_068);
		p.columnRslt_col_069.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_069_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_069);
		p.columnRslt_col_070.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_070_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_070);
		p.columnRslt_col_071.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_071_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_071);
		p.columnRslt_col_072.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_072_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_072);
		p.columnRslt_col_073.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_073_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_073);
		p.columnRslt_col_074.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_074_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_074);
		p.columnRslt_col_075.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_075_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_075);
		p.columnRslt_col_076.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_076_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_076);
		p.columnRslt_col_077.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_077_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_077);
		p.columnRslt_col_078.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_078_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_078);
		p.columnRslt_col_079.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_079_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_079);
		p.columnRslt_col_080.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_080_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_080);
		p.columnRslt_col_081.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_081_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_081);
		p.columnRslt_col_082.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_082_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_082);
		p.columnRslt_col_083.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_083_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_083);
		p.columnRslt_col_084.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_084_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_084);
		p.columnRslt_col_085.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_085_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_085);
		p.columnRslt_col_086.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_086_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_086);
		p.columnRslt_col_087.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_087_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_087);
		p.columnRslt_col_088.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_088_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_088);
		p.columnRslt_col_089.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_089_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_089);
		p.columnRslt_col_090.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_090_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_090);
		p.columnRslt_col_091.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_091_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_091);
		p.columnRslt_col_092.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_092_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_092);
		p.columnRslt_col_093.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_093_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_093);
		p.columnRslt_col_094.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_094_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_094);
		p.columnRslt_col_095.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_095_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_095);
		p.columnRslt_col_096.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_096_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_096);
		p.columnRslt_col_097.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_097_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_097);
		p.columnRslt_col_098.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_098_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_098);
		p.columnRslt_col_099.setMeta(mcframe.clientMGBE.MGBEP0030.RsltR.col_099_META);
		p.RsltTable.addColumnConfig(p.columnRslt_col_099);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_bottom_flg);
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
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
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
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == LPnl_redisplay) doLPnl_redisplay(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == RPnl_srch_all) doRPnl_srch_all(info);
		else if (ap == Btn_open_MGBEP0020) doBtn_open_MGBEP0020(info);
		else if (ap == Btn_open_MGBEP0010) doBtn_open_MGBEP0010(info);
	}

	/**
	 * [LPnl]パネルの[redisplay]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_redisplay(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBEP0020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBEP0020(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBEP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBEP0010(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == LPnl_disp_expns_grp) return doLPnl_disp_expns_grp_VC(info);
		if (vc == LPnl_disp_expns) return doLPnl_disp_expns_VC(info);
		if (vc == LPnl_disp_the) return doLPnl_disp_the_VC(info);
		if (vc == LPnl_add_disp_digit) return doLPnl_add_disp_digit_VC(info);
		if (vc == columnRslt_bottom_flg) return doRslt_bottom_flg_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_std_upri) return doRslt_std_upri_VC(info);
		if (vc == columnRslt_the_upri) return doRslt_the_upri_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_rate) return doRslt_rate_VC(info);
		if (vc == columnRslt_the_cost) return doRslt_the_cost_VC(info);
		if (vc == columnRslt_ttl) return doRslt_ttl_VC(info);
		if (vc == columnRslt_var_cost) return doRslt_var_cost_VC(info);
		if (vc == columnRslt_fxd_cost) return doRslt_fxd_cost_VC(info);
		if (vc == columnRslt_col_000) return doRslt_col_000_VC(info);
		if (vc == columnRslt_col_001) return doRslt_col_001_VC(info);
		if (vc == columnRslt_col_002) return doRslt_col_002_VC(info);
		if (vc == columnRslt_col_003) return doRslt_col_003_VC(info);
		if (vc == columnRslt_col_004) return doRslt_col_004_VC(info);
		if (vc == columnRslt_col_005) return doRslt_col_005_VC(info);
		if (vc == columnRslt_col_006) return doRslt_col_006_VC(info);
		if (vc == columnRslt_col_007) return doRslt_col_007_VC(info);
		if (vc == columnRslt_col_008) return doRslt_col_008_VC(info);
		if (vc == columnRslt_col_009) return doRslt_col_009_VC(info);
		if (vc == columnRslt_col_010) return doRslt_col_010_VC(info);
		if (vc == columnRslt_col_011) return doRslt_col_011_VC(info);
		if (vc == columnRslt_col_012) return doRslt_col_012_VC(info);
		if (vc == columnRslt_col_013) return doRslt_col_013_VC(info);
		if (vc == columnRslt_col_014) return doRslt_col_014_VC(info);
		if (vc == columnRslt_col_015) return doRslt_col_015_VC(info);
		if (vc == columnRslt_col_016) return doRslt_col_016_VC(info);
		if (vc == columnRslt_col_017) return doRslt_col_017_VC(info);
		if (vc == columnRslt_col_018) return doRslt_col_018_VC(info);
		if (vc == columnRslt_col_019) return doRslt_col_019_VC(info);
		if (vc == columnRslt_col_020) return doRslt_col_020_VC(info);
		if (vc == columnRslt_col_021) return doRslt_col_021_VC(info);
		if (vc == columnRslt_col_022) return doRslt_col_022_VC(info);
		if (vc == columnRslt_col_023) return doRslt_col_023_VC(info);
		if (vc == columnRslt_col_024) return doRslt_col_024_VC(info);
		if (vc == columnRslt_col_025) return doRslt_col_025_VC(info);
		if (vc == columnRslt_col_026) return doRslt_col_026_VC(info);
		if (vc == columnRslt_col_027) return doRslt_col_027_VC(info);
		if (vc == columnRslt_col_028) return doRslt_col_028_VC(info);
		if (vc == columnRslt_col_029) return doRslt_col_029_VC(info);
		if (vc == columnRslt_col_030) return doRslt_col_030_VC(info);
		if (vc == columnRslt_col_031) return doRslt_col_031_VC(info);
		if (vc == columnRslt_col_032) return doRslt_col_032_VC(info);
		if (vc == columnRslt_col_033) return doRslt_col_033_VC(info);
		if (vc == columnRslt_col_034) return doRslt_col_034_VC(info);
		if (vc == columnRslt_col_035) return doRslt_col_035_VC(info);
		if (vc == columnRslt_col_036) return doRslt_col_036_VC(info);
		if (vc == columnRslt_col_037) return doRslt_col_037_VC(info);
		if (vc == columnRslt_col_038) return doRslt_col_038_VC(info);
		if (vc == columnRslt_col_039) return doRslt_col_039_VC(info);
		if (vc == columnRslt_col_040) return doRslt_col_040_VC(info);
		if (vc == columnRslt_col_041) return doRslt_col_041_VC(info);
		if (vc == columnRslt_col_042) return doRslt_col_042_VC(info);
		if (vc == columnRslt_col_043) return doRslt_col_043_VC(info);
		if (vc == columnRslt_col_044) return doRslt_col_044_VC(info);
		if (vc == columnRslt_col_045) return doRslt_col_045_VC(info);
		if (vc == columnRslt_col_046) return doRslt_col_046_VC(info);
		if (vc == columnRslt_col_047) return doRslt_col_047_VC(info);
		if (vc == columnRslt_col_048) return doRslt_col_048_VC(info);
		if (vc == columnRslt_col_049) return doRslt_col_049_VC(info);
		if (vc == columnRslt_col_050) return doRslt_col_050_VC(info);
		if (vc == columnRslt_col_051) return doRslt_col_051_VC(info);
		if (vc == columnRslt_col_052) return doRslt_col_052_VC(info);
		if (vc == columnRslt_col_053) return doRslt_col_053_VC(info);
		if (vc == columnRslt_col_054) return doRslt_col_054_VC(info);
		if (vc == columnRslt_col_055) return doRslt_col_055_VC(info);
		if (vc == columnRslt_col_056) return doRslt_col_056_VC(info);
		if (vc == columnRslt_col_057) return doRslt_col_057_VC(info);
		if (vc == columnRslt_col_058) return doRslt_col_058_VC(info);
		if (vc == columnRslt_col_059) return doRslt_col_059_VC(info);
		if (vc == columnRslt_col_060) return doRslt_col_060_VC(info);
		if (vc == columnRslt_col_061) return doRslt_col_061_VC(info);
		if (vc == columnRslt_col_062) return doRslt_col_062_VC(info);
		if (vc == columnRslt_col_063) return doRslt_col_063_VC(info);
		if (vc == columnRslt_col_064) return doRslt_col_064_VC(info);
		if (vc == columnRslt_col_065) return doRslt_col_065_VC(info);
		if (vc == columnRslt_col_066) return doRslt_col_066_VC(info);
		if (vc == columnRslt_col_067) return doRslt_col_067_VC(info);
		if (vc == columnRslt_col_068) return doRslt_col_068_VC(info);
		if (vc == columnRslt_col_069) return doRslt_col_069_VC(info);
		if (vc == columnRslt_col_070) return doRslt_col_070_VC(info);
		if (vc == columnRslt_col_071) return doRslt_col_071_VC(info);
		if (vc == columnRslt_col_072) return doRslt_col_072_VC(info);
		if (vc == columnRslt_col_073) return doRslt_col_073_VC(info);
		if (vc == columnRslt_col_074) return doRslt_col_074_VC(info);
		if (vc == columnRslt_col_075) return doRslt_col_075_VC(info);
		if (vc == columnRslt_col_076) return doRslt_col_076_VC(info);
		if (vc == columnRslt_col_077) return doRslt_col_077_VC(info);
		if (vc == columnRslt_col_078) return doRslt_col_078_VC(info);
		if (vc == columnRslt_col_079) return doRslt_col_079_VC(info);
		if (vc == columnRslt_col_080) return doRslt_col_080_VC(info);
		if (vc == columnRslt_col_081) return doRslt_col_081_VC(info);
		if (vc == columnRslt_col_082) return doRslt_col_082_VC(info);
		if (vc == columnRslt_col_083) return doRslt_col_083_VC(info);
		if (vc == columnRslt_col_084) return doRslt_col_084_VC(info);
		if (vc == columnRslt_col_085) return doRslt_col_085_VC(info);
		if (vc == columnRslt_col_086) return doRslt_col_086_VC(info);
		if (vc == columnRslt_col_087) return doRslt_col_087_VC(info);
		if (vc == columnRslt_col_088) return doRslt_col_088_VC(info);
		if (vc == columnRslt_col_089) return doRslt_col_089_VC(info);
		if (vc == columnRslt_col_090) return doRslt_col_090_VC(info);
		if (vc == columnRslt_col_091) return doRslt_col_091_VC(info);
		if (vc == columnRslt_col_092) return doRslt_col_092_VC(info);
		if (vc == columnRslt_col_093) return doRslt_col_093_VC(info);
		if (vc == columnRslt_col_094) return doRslt_col_094_VC(info);
		if (vc == columnRslt_col_095) return doRslt_col_095_VC(info);
		if (vc == columnRslt_col_096) return doRslt_col_096_VC(info);
		if (vc == columnRslt_col_097) return doRslt_col_097_VC(info);
		if (vc == columnRslt_col_098) return doRslt_col_098_VC(info);
		if (vc == columnRslt_col_099) return doRslt_col_099_VC(info);
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
	 * [LPnl]パネルの[disp_expns_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_expns]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_the]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_the_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[add_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_add_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bottom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bottom_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[the_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_the_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[the_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_the_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[var_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_var_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fxd_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fxd_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_099_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NC(info);
		else if (nc == LPnl_disp_expns) doLPnl_disp_expns_NC(info);
		else if (nc == LPnl_disp_the) doLPnl_disp_the_NC(info);
		else if (nc == LPnl_add_disp_digit) doLPnl_add_disp_digit_NC(info);
		else if (nc == columnRslt_bottom_flg) doRslt_bottom_flg_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_std_upri) doRslt_std_upri_NC(info);
		else if (nc == columnRslt_the_upri) doRslt_the_upri_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_rate) doRslt_rate_NC(info);
		else if (nc == columnRslt_the_cost) doRslt_the_cost_NC(info);
		else if (nc == columnRslt_ttl) doRslt_ttl_NC(info);
		else if (nc == columnRslt_var_cost) doRslt_var_cost_NC(info);
		else if (nc == columnRslt_fxd_cost) doRslt_fxd_cost_NC(info);
		else if (nc == columnRslt_col_000) doRslt_col_000_NC(info);
		else if (nc == columnRslt_col_001) doRslt_col_001_NC(info);
		else if (nc == columnRslt_col_002) doRslt_col_002_NC(info);
		else if (nc == columnRslt_col_003) doRslt_col_003_NC(info);
		else if (nc == columnRslt_col_004) doRslt_col_004_NC(info);
		else if (nc == columnRslt_col_005) doRslt_col_005_NC(info);
		else if (nc == columnRslt_col_006) doRslt_col_006_NC(info);
		else if (nc == columnRslt_col_007) doRslt_col_007_NC(info);
		else if (nc == columnRslt_col_008) doRslt_col_008_NC(info);
		else if (nc == columnRslt_col_009) doRslt_col_009_NC(info);
		else if (nc == columnRslt_col_010) doRslt_col_010_NC(info);
		else if (nc == columnRslt_col_011) doRslt_col_011_NC(info);
		else if (nc == columnRslt_col_012) doRslt_col_012_NC(info);
		else if (nc == columnRslt_col_013) doRslt_col_013_NC(info);
		else if (nc == columnRslt_col_014) doRslt_col_014_NC(info);
		else if (nc == columnRslt_col_015) doRslt_col_015_NC(info);
		else if (nc == columnRslt_col_016) doRslt_col_016_NC(info);
		else if (nc == columnRslt_col_017) doRslt_col_017_NC(info);
		else if (nc == columnRslt_col_018) doRslt_col_018_NC(info);
		else if (nc == columnRslt_col_019) doRslt_col_019_NC(info);
		else if (nc == columnRslt_col_020) doRslt_col_020_NC(info);
		else if (nc == columnRslt_col_021) doRslt_col_021_NC(info);
		else if (nc == columnRslt_col_022) doRslt_col_022_NC(info);
		else if (nc == columnRslt_col_023) doRslt_col_023_NC(info);
		else if (nc == columnRslt_col_024) doRslt_col_024_NC(info);
		else if (nc == columnRslt_col_025) doRslt_col_025_NC(info);
		else if (nc == columnRslt_col_026) doRslt_col_026_NC(info);
		else if (nc == columnRslt_col_027) doRslt_col_027_NC(info);
		else if (nc == columnRslt_col_028) doRslt_col_028_NC(info);
		else if (nc == columnRslt_col_029) doRslt_col_029_NC(info);
		else if (nc == columnRslt_col_030) doRslt_col_030_NC(info);
		else if (nc == columnRslt_col_031) doRslt_col_031_NC(info);
		else if (nc == columnRslt_col_032) doRslt_col_032_NC(info);
		else if (nc == columnRslt_col_033) doRslt_col_033_NC(info);
		else if (nc == columnRslt_col_034) doRslt_col_034_NC(info);
		else if (nc == columnRslt_col_035) doRslt_col_035_NC(info);
		else if (nc == columnRslt_col_036) doRslt_col_036_NC(info);
		else if (nc == columnRslt_col_037) doRslt_col_037_NC(info);
		else if (nc == columnRslt_col_038) doRslt_col_038_NC(info);
		else if (nc == columnRslt_col_039) doRslt_col_039_NC(info);
		else if (nc == columnRslt_col_040) doRslt_col_040_NC(info);
		else if (nc == columnRslt_col_041) doRslt_col_041_NC(info);
		else if (nc == columnRslt_col_042) doRslt_col_042_NC(info);
		else if (nc == columnRslt_col_043) doRslt_col_043_NC(info);
		else if (nc == columnRslt_col_044) doRslt_col_044_NC(info);
		else if (nc == columnRslt_col_045) doRslt_col_045_NC(info);
		else if (nc == columnRslt_col_046) doRslt_col_046_NC(info);
		else if (nc == columnRslt_col_047) doRslt_col_047_NC(info);
		else if (nc == columnRslt_col_048) doRslt_col_048_NC(info);
		else if (nc == columnRslt_col_049) doRslt_col_049_NC(info);
		else if (nc == columnRslt_col_050) doRslt_col_050_NC(info);
		else if (nc == columnRslt_col_051) doRslt_col_051_NC(info);
		else if (nc == columnRslt_col_052) doRslt_col_052_NC(info);
		else if (nc == columnRslt_col_053) doRslt_col_053_NC(info);
		else if (nc == columnRslt_col_054) doRslt_col_054_NC(info);
		else if (nc == columnRslt_col_055) doRslt_col_055_NC(info);
		else if (nc == columnRslt_col_056) doRslt_col_056_NC(info);
		else if (nc == columnRslt_col_057) doRslt_col_057_NC(info);
		else if (nc == columnRslt_col_058) doRslt_col_058_NC(info);
		else if (nc == columnRslt_col_059) doRslt_col_059_NC(info);
		else if (nc == columnRslt_col_060) doRslt_col_060_NC(info);
		else if (nc == columnRslt_col_061) doRslt_col_061_NC(info);
		else if (nc == columnRslt_col_062) doRslt_col_062_NC(info);
		else if (nc == columnRslt_col_063) doRslt_col_063_NC(info);
		else if (nc == columnRslt_col_064) doRslt_col_064_NC(info);
		else if (nc == columnRslt_col_065) doRslt_col_065_NC(info);
		else if (nc == columnRslt_col_066) doRslt_col_066_NC(info);
		else if (nc == columnRslt_col_067) doRslt_col_067_NC(info);
		else if (nc == columnRslt_col_068) doRslt_col_068_NC(info);
		else if (nc == columnRslt_col_069) doRslt_col_069_NC(info);
		else if (nc == columnRslt_col_070) doRslt_col_070_NC(info);
		else if (nc == columnRslt_col_071) doRslt_col_071_NC(info);
		else if (nc == columnRslt_col_072) doRslt_col_072_NC(info);
		else if (nc == columnRslt_col_073) doRslt_col_073_NC(info);
		else if (nc == columnRslt_col_074) doRslt_col_074_NC(info);
		else if (nc == columnRslt_col_075) doRslt_col_075_NC(info);
		else if (nc == columnRslt_col_076) doRslt_col_076_NC(info);
		else if (nc == columnRslt_col_077) doRslt_col_077_NC(info);
		else if (nc == columnRslt_col_078) doRslt_col_078_NC(info);
		else if (nc == columnRslt_col_079) doRslt_col_079_NC(info);
		else if (nc == columnRslt_col_080) doRslt_col_080_NC(info);
		else if (nc == columnRslt_col_081) doRslt_col_081_NC(info);
		else if (nc == columnRslt_col_082) doRslt_col_082_NC(info);
		else if (nc == columnRslt_col_083) doRslt_col_083_NC(info);
		else if (nc == columnRslt_col_084) doRslt_col_084_NC(info);
		else if (nc == columnRslt_col_085) doRslt_col_085_NC(info);
		else if (nc == columnRslt_col_086) doRslt_col_086_NC(info);
		else if (nc == columnRslt_col_087) doRslt_col_087_NC(info);
		else if (nc == columnRslt_col_088) doRslt_col_088_NC(info);
		else if (nc == columnRslt_col_089) doRslt_col_089_NC(info);
		else if (nc == columnRslt_col_090) doRslt_col_090_NC(info);
		else if (nc == columnRslt_col_091) doRslt_col_091_NC(info);
		else if (nc == columnRslt_col_092) doRslt_col_092_NC(info);
		else if (nc == columnRslt_col_093) doRslt_col_093_NC(info);
		else if (nc == columnRslt_col_094) doRslt_col_094_NC(info);
		else if (nc == columnRslt_col_095) doRslt_col_095_NC(info);
		else if (nc == columnRslt_col_096) doRslt_col_096_NC(info);
		else if (nc == columnRslt_col_097) doRslt_col_097_NC(info);
		else if (nc == columnRslt_col_098) doRslt_col_098_NC(info);
		else if (nc == columnRslt_col_099) doRslt_col_099_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
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
	 * [LPnl]パネルの[disp_expns_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_the]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_the_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[add_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_add_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bottom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bottom_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_cost_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[var_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_var_cost_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_cost_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NE(info);
		else if (ne == LPnl_disp_expns) doLPnl_disp_expns_NE(info);
		else if (ne == LPnl_disp_the) doLPnl_disp_the_NE(info);
		else if (ne == LPnl_add_disp_digit) doLPnl_add_disp_digit_NE(info);
		else if (ne == columnRslt_bottom_flg) doRslt_bottom_flg_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_std_upri) doRslt_std_upri_NE(info);
		else if (ne == columnRslt_the_upri) doRslt_the_upri_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_rate) doRslt_rate_NE(info);
		else if (ne == columnRslt_the_cost) doRslt_the_cost_NE(info);
		else if (ne == columnRslt_ttl) doRslt_ttl_NE(info);
		else if (ne == columnRslt_var_cost) doRslt_var_cost_NE(info);
		else if (ne == columnRslt_fxd_cost) doRslt_fxd_cost_NE(info);
		else if (ne == columnRslt_col_000) doRslt_col_000_NE(info);
		else if (ne == columnRslt_col_001) doRslt_col_001_NE(info);
		else if (ne == columnRslt_col_002) doRslt_col_002_NE(info);
		else if (ne == columnRslt_col_003) doRslt_col_003_NE(info);
		else if (ne == columnRslt_col_004) doRslt_col_004_NE(info);
		else if (ne == columnRslt_col_005) doRslt_col_005_NE(info);
		else if (ne == columnRslt_col_006) doRslt_col_006_NE(info);
		else if (ne == columnRslt_col_007) doRslt_col_007_NE(info);
		else if (ne == columnRslt_col_008) doRslt_col_008_NE(info);
		else if (ne == columnRslt_col_009) doRslt_col_009_NE(info);
		else if (ne == columnRslt_col_010) doRslt_col_010_NE(info);
		else if (ne == columnRslt_col_011) doRslt_col_011_NE(info);
		else if (ne == columnRslt_col_012) doRslt_col_012_NE(info);
		else if (ne == columnRslt_col_013) doRslt_col_013_NE(info);
		else if (ne == columnRslt_col_014) doRslt_col_014_NE(info);
		else if (ne == columnRslt_col_015) doRslt_col_015_NE(info);
		else if (ne == columnRslt_col_016) doRslt_col_016_NE(info);
		else if (ne == columnRslt_col_017) doRslt_col_017_NE(info);
		else if (ne == columnRslt_col_018) doRslt_col_018_NE(info);
		else if (ne == columnRslt_col_019) doRslt_col_019_NE(info);
		else if (ne == columnRslt_col_020) doRslt_col_020_NE(info);
		else if (ne == columnRslt_col_021) doRslt_col_021_NE(info);
		else if (ne == columnRslt_col_022) doRslt_col_022_NE(info);
		else if (ne == columnRslt_col_023) doRslt_col_023_NE(info);
		else if (ne == columnRslt_col_024) doRslt_col_024_NE(info);
		else if (ne == columnRslt_col_025) doRslt_col_025_NE(info);
		else if (ne == columnRslt_col_026) doRslt_col_026_NE(info);
		else if (ne == columnRslt_col_027) doRslt_col_027_NE(info);
		else if (ne == columnRslt_col_028) doRslt_col_028_NE(info);
		else if (ne == columnRslt_col_029) doRslt_col_029_NE(info);
		else if (ne == columnRslt_col_030) doRslt_col_030_NE(info);
		else if (ne == columnRslt_col_031) doRslt_col_031_NE(info);
		else if (ne == columnRslt_col_032) doRslt_col_032_NE(info);
		else if (ne == columnRslt_col_033) doRslt_col_033_NE(info);
		else if (ne == columnRslt_col_034) doRslt_col_034_NE(info);
		else if (ne == columnRslt_col_035) doRslt_col_035_NE(info);
		else if (ne == columnRslt_col_036) doRslt_col_036_NE(info);
		else if (ne == columnRslt_col_037) doRslt_col_037_NE(info);
		else if (ne == columnRslt_col_038) doRslt_col_038_NE(info);
		else if (ne == columnRslt_col_039) doRslt_col_039_NE(info);
		else if (ne == columnRslt_col_040) doRslt_col_040_NE(info);
		else if (ne == columnRslt_col_041) doRslt_col_041_NE(info);
		else if (ne == columnRslt_col_042) doRslt_col_042_NE(info);
		else if (ne == columnRslt_col_043) doRslt_col_043_NE(info);
		else if (ne == columnRslt_col_044) doRslt_col_044_NE(info);
		else if (ne == columnRslt_col_045) doRslt_col_045_NE(info);
		else if (ne == columnRslt_col_046) doRslt_col_046_NE(info);
		else if (ne == columnRslt_col_047) doRslt_col_047_NE(info);
		else if (ne == columnRslt_col_048) doRslt_col_048_NE(info);
		else if (ne == columnRslt_col_049) doRslt_col_049_NE(info);
		else if (ne == columnRslt_col_050) doRslt_col_050_NE(info);
		else if (ne == columnRslt_col_051) doRslt_col_051_NE(info);
		else if (ne == columnRslt_col_052) doRslt_col_052_NE(info);
		else if (ne == columnRslt_col_053) doRslt_col_053_NE(info);
		else if (ne == columnRslt_col_054) doRslt_col_054_NE(info);
		else if (ne == columnRslt_col_055) doRslt_col_055_NE(info);
		else if (ne == columnRslt_col_056) doRslt_col_056_NE(info);
		else if (ne == columnRslt_col_057) doRslt_col_057_NE(info);
		else if (ne == columnRslt_col_058) doRslt_col_058_NE(info);
		else if (ne == columnRslt_col_059) doRslt_col_059_NE(info);
		else if (ne == columnRslt_col_060) doRslt_col_060_NE(info);
		else if (ne == columnRslt_col_061) doRslt_col_061_NE(info);
		else if (ne == columnRslt_col_062) doRslt_col_062_NE(info);
		else if (ne == columnRslt_col_063) doRslt_col_063_NE(info);
		else if (ne == columnRslt_col_064) doRslt_col_064_NE(info);
		else if (ne == columnRslt_col_065) doRslt_col_065_NE(info);
		else if (ne == columnRslt_col_066) doRslt_col_066_NE(info);
		else if (ne == columnRslt_col_067) doRslt_col_067_NE(info);
		else if (ne == columnRslt_col_068) doRslt_col_068_NE(info);
		else if (ne == columnRslt_col_069) doRslt_col_069_NE(info);
		else if (ne == columnRslt_col_070) doRslt_col_070_NE(info);
		else if (ne == columnRslt_col_071) doRslt_col_071_NE(info);
		else if (ne == columnRslt_col_072) doRslt_col_072_NE(info);
		else if (ne == columnRslt_col_073) doRslt_col_073_NE(info);
		else if (ne == columnRslt_col_074) doRslt_col_074_NE(info);
		else if (ne == columnRslt_col_075) doRslt_col_075_NE(info);
		else if (ne == columnRslt_col_076) doRslt_col_076_NE(info);
		else if (ne == columnRslt_col_077) doRslt_col_077_NE(info);
		else if (ne == columnRslt_col_078) doRslt_col_078_NE(info);
		else if (ne == columnRslt_col_079) doRslt_col_079_NE(info);
		else if (ne == columnRslt_col_080) doRslt_col_080_NE(info);
		else if (ne == columnRslt_col_081) doRslt_col_081_NE(info);
		else if (ne == columnRslt_col_082) doRslt_col_082_NE(info);
		else if (ne == columnRslt_col_083) doRslt_col_083_NE(info);
		else if (ne == columnRslt_col_084) doRslt_col_084_NE(info);
		else if (ne == columnRslt_col_085) doRslt_col_085_NE(info);
		else if (ne == columnRslt_col_086) doRslt_col_086_NE(info);
		else if (ne == columnRslt_col_087) doRslt_col_087_NE(info);
		else if (ne == columnRslt_col_088) doRslt_col_088_NE(info);
		else if (ne == columnRslt_col_089) doRslt_col_089_NE(info);
		else if (ne == columnRslt_col_090) doRslt_col_090_NE(info);
		else if (ne == columnRslt_col_091) doRslt_col_091_NE(info);
		else if (ne == columnRslt_col_092) doRslt_col_092_NE(info);
		else if (ne == columnRslt_col_093) doRslt_col_093_NE(info);
		else if (ne == columnRslt_col_094) doRslt_col_094_NE(info);
		else if (ne == columnRslt_col_095) doRslt_col_095_NE(info);
		else if (ne == columnRslt_col_096) doRslt_col_096_NE(info);
		else if (ne == columnRslt_col_097) doRslt_col_097_NE(info);
		else if (ne == columnRslt_col_098) doRslt_col_098_NE(info);
		else if (ne == columnRslt_col_099) doRslt_col_099_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
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
	 * [LPnl]パネルの[disp_expns_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_the]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_the_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[add_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_add_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bottom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bottom_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_cost_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[var_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_var_cost_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_cost_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NX(info);
		else if (nx == LPnl_disp_expns) doLPnl_disp_expns_NX(info);
		else if (nx == LPnl_disp_the) doLPnl_disp_the_NX(info);
		else if (nx == LPnl_add_disp_digit) doLPnl_add_disp_digit_NX(info);
		else if (nx == columnRslt_bottom_flg) doRslt_bottom_flg_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_std_upri) doRslt_std_upri_NX(info);
		else if (nx == columnRslt_the_upri) doRslt_the_upri_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_rate) doRslt_rate_NX(info);
		else if (nx == columnRslt_the_cost) doRslt_the_cost_NX(info);
		else if (nx == columnRslt_ttl) doRslt_ttl_NX(info);
		else if (nx == columnRslt_var_cost) doRslt_var_cost_NX(info);
		else if (nx == columnRslt_fxd_cost) doRslt_fxd_cost_NX(info);
		else if (nx == columnRslt_col_000) doRslt_col_000_NX(info);
		else if (nx == columnRslt_col_001) doRslt_col_001_NX(info);
		else if (nx == columnRslt_col_002) doRslt_col_002_NX(info);
		else if (nx == columnRslt_col_003) doRslt_col_003_NX(info);
		else if (nx == columnRslt_col_004) doRslt_col_004_NX(info);
		else if (nx == columnRslt_col_005) doRslt_col_005_NX(info);
		else if (nx == columnRslt_col_006) doRslt_col_006_NX(info);
		else if (nx == columnRslt_col_007) doRslt_col_007_NX(info);
		else if (nx == columnRslt_col_008) doRslt_col_008_NX(info);
		else if (nx == columnRslt_col_009) doRslt_col_009_NX(info);
		else if (nx == columnRslt_col_010) doRslt_col_010_NX(info);
		else if (nx == columnRslt_col_011) doRslt_col_011_NX(info);
		else if (nx == columnRslt_col_012) doRslt_col_012_NX(info);
		else if (nx == columnRslt_col_013) doRslt_col_013_NX(info);
		else if (nx == columnRslt_col_014) doRslt_col_014_NX(info);
		else if (nx == columnRslt_col_015) doRslt_col_015_NX(info);
		else if (nx == columnRslt_col_016) doRslt_col_016_NX(info);
		else if (nx == columnRslt_col_017) doRslt_col_017_NX(info);
		else if (nx == columnRslt_col_018) doRslt_col_018_NX(info);
		else if (nx == columnRslt_col_019) doRslt_col_019_NX(info);
		else if (nx == columnRslt_col_020) doRslt_col_020_NX(info);
		else if (nx == columnRslt_col_021) doRslt_col_021_NX(info);
		else if (nx == columnRslt_col_022) doRslt_col_022_NX(info);
		else if (nx == columnRslt_col_023) doRslt_col_023_NX(info);
		else if (nx == columnRslt_col_024) doRslt_col_024_NX(info);
		else if (nx == columnRslt_col_025) doRslt_col_025_NX(info);
		else if (nx == columnRslt_col_026) doRslt_col_026_NX(info);
		else if (nx == columnRslt_col_027) doRslt_col_027_NX(info);
		else if (nx == columnRslt_col_028) doRslt_col_028_NX(info);
		else if (nx == columnRslt_col_029) doRslt_col_029_NX(info);
		else if (nx == columnRslt_col_030) doRslt_col_030_NX(info);
		else if (nx == columnRslt_col_031) doRslt_col_031_NX(info);
		else if (nx == columnRslt_col_032) doRslt_col_032_NX(info);
		else if (nx == columnRslt_col_033) doRslt_col_033_NX(info);
		else if (nx == columnRslt_col_034) doRslt_col_034_NX(info);
		else if (nx == columnRslt_col_035) doRslt_col_035_NX(info);
		else if (nx == columnRslt_col_036) doRslt_col_036_NX(info);
		else if (nx == columnRslt_col_037) doRslt_col_037_NX(info);
		else if (nx == columnRslt_col_038) doRslt_col_038_NX(info);
		else if (nx == columnRslt_col_039) doRslt_col_039_NX(info);
		else if (nx == columnRslt_col_040) doRslt_col_040_NX(info);
		else if (nx == columnRslt_col_041) doRslt_col_041_NX(info);
		else if (nx == columnRslt_col_042) doRslt_col_042_NX(info);
		else if (nx == columnRslt_col_043) doRslt_col_043_NX(info);
		else if (nx == columnRslt_col_044) doRslt_col_044_NX(info);
		else if (nx == columnRslt_col_045) doRslt_col_045_NX(info);
		else if (nx == columnRslt_col_046) doRslt_col_046_NX(info);
		else if (nx == columnRslt_col_047) doRslt_col_047_NX(info);
		else if (nx == columnRslt_col_048) doRslt_col_048_NX(info);
		else if (nx == columnRslt_col_049) doRslt_col_049_NX(info);
		else if (nx == columnRslt_col_050) doRslt_col_050_NX(info);
		else if (nx == columnRslt_col_051) doRslt_col_051_NX(info);
		else if (nx == columnRslt_col_052) doRslt_col_052_NX(info);
		else if (nx == columnRslt_col_053) doRslt_col_053_NX(info);
		else if (nx == columnRslt_col_054) doRslt_col_054_NX(info);
		else if (nx == columnRslt_col_055) doRslt_col_055_NX(info);
		else if (nx == columnRslt_col_056) doRslt_col_056_NX(info);
		else if (nx == columnRslt_col_057) doRslt_col_057_NX(info);
		else if (nx == columnRslt_col_058) doRslt_col_058_NX(info);
		else if (nx == columnRslt_col_059) doRslt_col_059_NX(info);
		else if (nx == columnRslt_col_060) doRslt_col_060_NX(info);
		else if (nx == columnRslt_col_061) doRslt_col_061_NX(info);
		else if (nx == columnRslt_col_062) doRslt_col_062_NX(info);
		else if (nx == columnRslt_col_063) doRslt_col_063_NX(info);
		else if (nx == columnRslt_col_064) doRslt_col_064_NX(info);
		else if (nx == columnRslt_col_065) doRslt_col_065_NX(info);
		else if (nx == columnRslt_col_066) doRslt_col_066_NX(info);
		else if (nx == columnRslt_col_067) doRslt_col_067_NX(info);
		else if (nx == columnRslt_col_068) doRslt_col_068_NX(info);
		else if (nx == columnRslt_col_069) doRslt_col_069_NX(info);
		else if (nx == columnRslt_col_070) doRslt_col_070_NX(info);
		else if (nx == columnRslt_col_071) doRslt_col_071_NX(info);
		else if (nx == columnRslt_col_072) doRslt_col_072_NX(info);
		else if (nx == columnRslt_col_073) doRslt_col_073_NX(info);
		else if (nx == columnRslt_col_074) doRslt_col_074_NX(info);
		else if (nx == columnRslt_col_075) doRslt_col_075_NX(info);
		else if (nx == columnRslt_col_076) doRslt_col_076_NX(info);
		else if (nx == columnRslt_col_077) doRslt_col_077_NX(info);
		else if (nx == columnRslt_col_078) doRslt_col_078_NX(info);
		else if (nx == columnRslt_col_079) doRslt_col_079_NX(info);
		else if (nx == columnRslt_col_080) doRslt_col_080_NX(info);
		else if (nx == columnRslt_col_081) doRslt_col_081_NX(info);
		else if (nx == columnRslt_col_082) doRslt_col_082_NX(info);
		else if (nx == columnRslt_col_083) doRslt_col_083_NX(info);
		else if (nx == columnRslt_col_084) doRslt_col_084_NX(info);
		else if (nx == columnRslt_col_085) doRslt_col_085_NX(info);
		else if (nx == columnRslt_col_086) doRslt_col_086_NX(info);
		else if (nx == columnRslt_col_087) doRslt_col_087_NX(info);
		else if (nx == columnRslt_col_088) doRslt_col_088_NX(info);
		else if (nx == columnRslt_col_089) doRslt_col_089_NX(info);
		else if (nx == columnRslt_col_090) doRslt_col_090_NX(info);
		else if (nx == columnRslt_col_091) doRslt_col_091_NX(info);
		else if (nx == columnRslt_col_092) doRslt_col_092_NX(info);
		else if (nx == columnRslt_col_093) doRslt_col_093_NX(info);
		else if (nx == columnRslt_col_094) doRslt_col_094_NX(info);
		else if (nx == columnRslt_col_095) doRslt_col_095_NX(info);
		else if (nx == columnRslt_col_096) doRslt_col_096_NX(info);
		else if (nx == columnRslt_col_097) doRslt_col_097_NX(info);
		else if (nx == columnRslt_col_098) doRslt_col_098_NX(info);
		else if (nx == columnRslt_col_099) doRslt_col_099_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
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
	 * [LPnl]パネルの[disp_expns_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_the]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_the_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[add_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_add_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bottom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bottom_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_cost_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[var_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_var_cost_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_cost_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NX(MCEventInfo info){
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
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == LPnl_add_disp_digit) doLPnl_add_disp_digit_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_std_upri) doRslt_std_upri_LC(info);
		else if (lc == columnRslt_the_upri) doRslt_the_upri_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_rate) doRslt_rate_LC(info);
		else if (lc == columnRslt_the_cost) doRslt_the_cost_LC(info);
		else if (lc == columnRslt_ttl) doRslt_ttl_LC(info);
		else if (lc == columnRslt_var_cost) doRslt_var_cost_LC(info);
		else if (lc == columnRslt_fxd_cost) doRslt_fxd_cost_LC(info);
		else if (lc == columnRslt_col_000) doRslt_col_000_LC(info);
		else if (lc == columnRslt_col_001) doRslt_col_001_LC(info);
		else if (lc == columnRslt_col_002) doRslt_col_002_LC(info);
		else if (lc == columnRslt_col_003) doRslt_col_003_LC(info);
		else if (lc == columnRslt_col_004) doRslt_col_004_LC(info);
		else if (lc == columnRslt_col_005) doRslt_col_005_LC(info);
		else if (lc == columnRslt_col_006) doRslt_col_006_LC(info);
		else if (lc == columnRslt_col_007) doRslt_col_007_LC(info);
		else if (lc == columnRslt_col_008) doRslt_col_008_LC(info);
		else if (lc == columnRslt_col_009) doRslt_col_009_LC(info);
		else if (lc == columnRslt_col_010) doRslt_col_010_LC(info);
		else if (lc == columnRslt_col_011) doRslt_col_011_LC(info);
		else if (lc == columnRslt_col_012) doRslt_col_012_LC(info);
		else if (lc == columnRslt_col_013) doRslt_col_013_LC(info);
		else if (lc == columnRslt_col_014) doRslt_col_014_LC(info);
		else if (lc == columnRslt_col_015) doRslt_col_015_LC(info);
		else if (lc == columnRslt_col_016) doRslt_col_016_LC(info);
		else if (lc == columnRslt_col_017) doRslt_col_017_LC(info);
		else if (lc == columnRslt_col_018) doRslt_col_018_LC(info);
		else if (lc == columnRslt_col_019) doRslt_col_019_LC(info);
		else if (lc == columnRslt_col_020) doRslt_col_020_LC(info);
		else if (lc == columnRslt_col_021) doRslt_col_021_LC(info);
		else if (lc == columnRslt_col_022) doRslt_col_022_LC(info);
		else if (lc == columnRslt_col_023) doRslt_col_023_LC(info);
		else if (lc == columnRslt_col_024) doRslt_col_024_LC(info);
		else if (lc == columnRslt_col_025) doRslt_col_025_LC(info);
		else if (lc == columnRslt_col_026) doRslt_col_026_LC(info);
		else if (lc == columnRslt_col_027) doRslt_col_027_LC(info);
		else if (lc == columnRslt_col_028) doRslt_col_028_LC(info);
		else if (lc == columnRslt_col_029) doRslt_col_029_LC(info);
		else if (lc == columnRslt_col_030) doRslt_col_030_LC(info);
		else if (lc == columnRslt_col_031) doRslt_col_031_LC(info);
		else if (lc == columnRslt_col_032) doRslt_col_032_LC(info);
		else if (lc == columnRslt_col_033) doRslt_col_033_LC(info);
		else if (lc == columnRslt_col_034) doRslt_col_034_LC(info);
		else if (lc == columnRslt_col_035) doRslt_col_035_LC(info);
		else if (lc == columnRslt_col_036) doRslt_col_036_LC(info);
		else if (lc == columnRslt_col_037) doRslt_col_037_LC(info);
		else if (lc == columnRslt_col_038) doRslt_col_038_LC(info);
		else if (lc == columnRslt_col_039) doRslt_col_039_LC(info);
		else if (lc == columnRslt_col_040) doRslt_col_040_LC(info);
		else if (lc == columnRslt_col_041) doRslt_col_041_LC(info);
		else if (lc == columnRslt_col_042) doRslt_col_042_LC(info);
		else if (lc == columnRslt_col_043) doRslt_col_043_LC(info);
		else if (lc == columnRslt_col_044) doRslt_col_044_LC(info);
		else if (lc == columnRslt_col_045) doRslt_col_045_LC(info);
		else if (lc == columnRslt_col_046) doRslt_col_046_LC(info);
		else if (lc == columnRslt_col_047) doRslt_col_047_LC(info);
		else if (lc == columnRslt_col_048) doRslt_col_048_LC(info);
		else if (lc == columnRslt_col_049) doRslt_col_049_LC(info);
		else if (lc == columnRslt_col_050) doRslt_col_050_LC(info);
		else if (lc == columnRslt_col_051) doRslt_col_051_LC(info);
		else if (lc == columnRslt_col_052) doRslt_col_052_LC(info);
		else if (lc == columnRslt_col_053) doRslt_col_053_LC(info);
		else if (lc == columnRslt_col_054) doRslt_col_054_LC(info);
		else if (lc == columnRslt_col_055) doRslt_col_055_LC(info);
		else if (lc == columnRslt_col_056) doRslt_col_056_LC(info);
		else if (lc == columnRslt_col_057) doRslt_col_057_LC(info);
		else if (lc == columnRslt_col_058) doRslt_col_058_LC(info);
		else if (lc == columnRslt_col_059) doRslt_col_059_LC(info);
		else if (lc == columnRslt_col_060) doRslt_col_060_LC(info);
		else if (lc == columnRslt_col_061) doRslt_col_061_LC(info);
		else if (lc == columnRslt_col_062) doRslt_col_062_LC(info);
		else if (lc == columnRslt_col_063) doRslt_col_063_LC(info);
		else if (lc == columnRslt_col_064) doRslt_col_064_LC(info);
		else if (lc == columnRslt_col_065) doRslt_col_065_LC(info);
		else if (lc == columnRslt_col_066) doRslt_col_066_LC(info);
		else if (lc == columnRslt_col_067) doRslt_col_067_LC(info);
		else if (lc == columnRslt_col_068) doRslt_col_068_LC(info);
		else if (lc == columnRslt_col_069) doRslt_col_069_LC(info);
		else if (lc == columnRslt_col_070) doRslt_col_070_LC(info);
		else if (lc == columnRslt_col_071) doRslt_col_071_LC(info);
		else if (lc == columnRslt_col_072) doRslt_col_072_LC(info);
		else if (lc == columnRslt_col_073) doRslt_col_073_LC(info);
		else if (lc == columnRslt_col_074) doRslt_col_074_LC(info);
		else if (lc == columnRslt_col_075) doRslt_col_075_LC(info);
		else if (lc == columnRslt_col_076) doRslt_col_076_LC(info);
		else if (lc == columnRslt_col_077) doRslt_col_077_LC(info);
		else if (lc == columnRslt_col_078) doRslt_col_078_LC(info);
		else if (lc == columnRslt_col_079) doRslt_col_079_LC(info);
		else if (lc == columnRslt_col_080) doRslt_col_080_LC(info);
		else if (lc == columnRslt_col_081) doRslt_col_081_LC(info);
		else if (lc == columnRslt_col_082) doRslt_col_082_LC(info);
		else if (lc == columnRslt_col_083) doRslt_col_083_LC(info);
		else if (lc == columnRslt_col_084) doRslt_col_084_LC(info);
		else if (lc == columnRslt_col_085) doRslt_col_085_LC(info);
		else if (lc == columnRslt_col_086) doRslt_col_086_LC(info);
		else if (lc == columnRslt_col_087) doRslt_col_087_LC(info);
		else if (lc == columnRslt_col_088) doRslt_col_088_LC(info);
		else if (lc == columnRslt_col_089) doRslt_col_089_LC(info);
		else if (lc == columnRslt_col_090) doRslt_col_090_LC(info);
		else if (lc == columnRslt_col_091) doRslt_col_091_LC(info);
		else if (lc == columnRslt_col_092) doRslt_col_092_LC(info);
		else if (lc == columnRslt_col_093) doRslt_col_093_LC(info);
		else if (lc == columnRslt_col_094) doRslt_col_094_LC(info);
		else if (lc == columnRslt_col_095) doRslt_col_095_LC(info);
		else if (lc == columnRslt_col_096) doRslt_col_096_LC(info);
		else if (lc == columnRslt_col_097) doRslt_col_097_LC(info);
		else if (lc == columnRslt_col_098) doRslt_col_098_LC(info);
		else if (lc == columnRslt_col_099) doRslt_col_099_LC(info);
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
	 * [LPnl]パネルの[add_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_add_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[the_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_the_cost_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[var_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_var_cost_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_cost_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBEL0030.Srch01")) {
			return new MG_MGBEL0030_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBEL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0030_Srch01;

		/** コンストラクタ */
		protected MG_MGBEL0030_Srch01Bridge() {
			p_MG_MGBEL0030_Srch01 = new MCParam(PDef.MG_MGBEL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBE.MGBEP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0030.RsltR.class));

			p_MG_MGBEL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBE.MGBEP0030.CndR up0() {
			return (mcframe.clientMGBE.MGBEP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBE.MGBEP0030.RsltR> down0() {
			return (MCList<mcframe.clientMGBE.MGBEP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBE.MGBEP0030.RsltR>)p_MG_MGBEL0030_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}