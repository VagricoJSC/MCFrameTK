package mcframe.commonMGUA.MGUAC0010;
import mcframe.commonCore.lang.*;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListSortInfo;
import mcframe.commonCore.container.MCSortPolicy;
import static mcframe.commonCore.container.MCList.SortType.*;
//COMMON_SETTING_IMPORT (START)

//COMMON_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
class MGUAC_List_MC_A extends Object {

	/** 
	  * CalcMenu:カラム名クラス
	  */
	protected static class CalcMenuCols_MC_A  {
		/** IN:計算グループＣＤ */
		public static final String $i_calc_grp_cd = "calc_grp_cd";
		/** OUT:メニューＣＤ */
		public static final String $o_menu_cd = "menu_cd";
		/** OUT:メニュー名 */
		public static final String $o_menu_nm = "menu_nm";
		/** OUT:表示順 */
		public static final String $o_menu_seq = "menu_seq";
		/** VIEW:メニューＣＤ */
		public static final String $v_menu_cd = $o_menu_cd;
		/** VIEW_NO:メニューＣＤ */
		protected static final MCNumber $vn_menu_cd = new MCNumber(10);
		/** VIEW:メニュー名 */
		public static final String $v_menu_nm = $o_menu_nm;
		/** VIEW_NO:メニュー名 */
		protected static final MCNumber $vn_menu_nm = new MCNumber(20);
		/** SORT:表示順 */
		public static final String $s_menu_seq = $o_menu_seq;
		/** SORT_NO:表示順 */
		protected static final MCNumber $sn_menu_seq = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_menu_cd);
					add($o_menu_nm);
					add($o_menu_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_menu_cd, $v_menu_cd);
					put($vn_menu_nm, $v_menu_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_menu_seq, $s_menu_seq, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CalcMenuCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CalcMenuCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CalcMenuCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CalcMenuCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CalcMenuCols extends MGUAC_List.CalcMenuCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmOperPtn:カラム名クラス
	  */
	protected static class ItmOperPtnCols_MC_A  {
		/** IN:期 */
		public static final String $i_term = "term";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:計算カテゴリＣＤ */
		public static final String $i_calc_ctg_cd = "calc_ctg_cd";
		/** IN:ワーキンググループＣＤ */
		public static final String $i_wg_cd = "wg_cd";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** VIEW:工程パタン */
		public static final String $v_oper_ptn = $o_oper_ptn;
		/** VIEW_NO:工程パタン */
		protected static final MCNumber $vn_oper_ptn = new MCNumber(10);
		/** SORT:工程パタン */
		public static final String $s_oper_ptn = $o_oper_ptn;
		/** SORT_NO:工程パタン */
		protected static final MCNumber $sn_oper_ptn = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_oper_ptn);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_oper_ptn, $v_oper_ptn);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_oper_ptn, $s_oper_ptn, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.ItmOperPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.ItmOperPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.ItmOperPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.ItmOperPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmOperPtnCols extends MGUAC_List.ItmOperPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * BomPtn:カラム名クラス
	  */
	protected static class BomPtnCols_MC_A  {
		/** IN:親品目ＦＬＧ */
		public static final String $i_par_itm_flg = "par_itm_flg";
		/** IN:子品目ＦＬＧ */
		public static final String $i_chd_itm_flg = "chd_itm_flg";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:ワーキンググループＣＤ */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:計算カテゴリＣＤ */
		public static final String $i_calc_ctg_cd = "calc_ctg_cd";
		/** IN:期（必須） */
		public static final String $i_term = "term";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** VIEW:構成パタン */
		public static final String $v_bom_ptn = $o_bom_ptn;
		/** VIEW_NO:構成パタン */
		protected static final MCNumber $vn_bom_ptn = new MCNumber(10);
		/** SORT:構成パタン */
		public static final String $s_bom_ptn = $o_bom_ptn;
		/** SORT_NO:構成パタン */
		protected static final MCNumber $sn_bom_ptn = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bom_ptn);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bom_ptn, $v_bom_ptn);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bom_ptn, $s_bom_ptn, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.BomPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.BomPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.BomPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.BomPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BomPtnCols extends MGUAC_List.BomPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * CalcParm:カラム名クラス
	  */
	protected static class CalcParmCols_MC_A  {
		/** OUT:パラメータ */
		public static final String $o_parm_key = "parm_key";
		/** OUT:パラメータ概要 */
		public static final String $o_parm_remark = "parm_remark";
		/** OUT:業務分類 */
		public static final String $o_parm_biz_grp = "parm_biz_grp";
		/** VIEW:パラメータ */
		public static final String $v_parm_key = $o_parm_key;
		/** VIEW_NO:パラメータ */
		protected static final MCNumber $vn_parm_key = new MCNumber(10);
		/** SORT:パラメータ */
		public static final String $s_parm_key = $o_parm_key;
		/** SORT_NO:パラメータ */
		protected static final MCNumber $sn_parm_key = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_parm_key);
					add($o_parm_remark);
					add($o_parm_biz_grp);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_parm_key, $v_parm_key);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_parm_key, $s_parm_key, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CalcParmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CalcParmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CalcParmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CalcParmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CalcParmCols extends MGUAC_List.CalcParmCols_MC_A {
		//EIクラス
	}


	/** 
	  * BizGrp:カラム名クラス
	  */
	protected static class BizGrpCols_MC_A  {
		/** OUT:業務分類 */
		public static final String $o_parm_biz_grp = "parm_biz_grp";
		/** VIEW:業務分類 */
		public static final String $v_parm_biz_grp = $o_parm_biz_grp;
		/** VIEW_NO:業務分類 */
		protected static final MCNumber $vn_parm_biz_grp = new MCNumber(10);
		/** SORT:業務分類 */
		public static final String $s_parm_biz_grp = $o_parm_biz_grp;
		/** SORT_NO:業務分類 */
		protected static final MCNumber $sn_parm_biz_grp = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_parm_biz_grp);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_parm_biz_grp, $v_parm_biz_grp);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_parm_biz_grp, $s_parm_biz_grp, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.BizGrpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.BizGrpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.BizGrpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.BizGrpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BizGrpCols extends MGUAC_List.BizGrpCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkEvalWithUpriSetTypIsNotNull:カラム名クラス
	  */
	protected static class StkEvalWithUpriSetTypIsNotNullCols_MC_A  {
		/** OUT:在庫評価ＣＤ */
		public static final String $o_stk_eval_cd = "stk_eval_cd";
		/** OUT:在庫評価名 */
		public static final String $o_stk_eval_nm = "stk_eval_nm";
		/** OUT:単価設定区分 */
		public static final String $o_upri_set_typ = "upri_set_typ";
		/** VIEW:在庫評価ＣＤ */
		public static final String $v_stk_eval_cd = $o_stk_eval_cd;
		/** VIEW_NO:在庫評価ＣＤ */
		protected static final MCNumber $vn_stk_eval_cd = new MCNumber(10);
		/** VIEW:在庫評価名 */
		public static final String $v_stk_eval_nm = $o_stk_eval_nm;
		/** VIEW_NO:在庫評価名 */
		protected static final MCNumber $vn_stk_eval_nm = new MCNumber(20);
		/** SORT:在庫評価ＣＤ */
		public static final String $s_stk_eval_cd = $o_stk_eval_cd;
		/** SORT_NO:在庫評価ＣＤ */
		protected static final MCNumber $sn_stk_eval_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_eval_cd);
					add($o_stk_eval_nm);
					add($o_upri_set_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_eval_cd, $v_stk_eval_cd);
					put($vn_stk_eval_nm, $v_stk_eval_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_eval_cd, $s_stk_eval_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.StkEvalWithUpriSetTypIsNotNullCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.StkEvalWithUpriSetTypIsNotNullCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.StkEvalWithUpriSetTypIsNotNullCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.StkEvalWithUpriSetTypIsNotNullCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkEvalWithUpriSetTypIsNotNullCols extends MGUAC_List.StkEvalWithUpriSetTypIsNotNullCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkEvalWithLumpRateFlgOff:カラム名クラス
	  */
	protected static class StkEvalWithLumpRateFlgOffCols_MC_A  {
		/** OUT:在庫評価ＣＤ */
		public static final String $o_stk_eval_cd = "stk_eval_cd";
		/** OUT:在庫評価名 */
		public static final String $o_stk_eval_nm = "stk_eval_nm";
		/** OUT:一括評価率指定 */
		public static final String $o_lump_rate_flg = "lump_rate_flg";
		/** VIEW:在庫評価ＣＤ */
		public static final String $v_stk_eval_cd = $o_stk_eval_cd;
		/** VIEW_NO:在庫評価ＣＤ */
		protected static final MCNumber $vn_stk_eval_cd = new MCNumber(10);
		/** VIEW:在庫評価名 */
		public static final String $v_stk_eval_nm = $o_stk_eval_nm;
		/** VIEW_NO:在庫評価名 */
		protected static final MCNumber $vn_stk_eval_nm = new MCNumber(20);
		/** SORT:在庫評価ＣＤ */
		public static final String $s_stk_eval_cd = $o_stk_eval_cd;
		/** SORT_NO:在庫評価ＣＤ */
		protected static final MCNumber $sn_stk_eval_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MGUAL0001";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_eval_cd);
					add($o_stk_eval_nm);
					add($o_lump_rate_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_eval_cd, $v_stk_eval_cd);
					put($vn_stk_eval_nm, $v_stk_eval_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_eval_cd, $s_stk_eval_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.StkEvalWithLumpRateFlgOffCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.StkEvalWithLumpRateFlgOffCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.StkEvalWithLumpRateFlgOffCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.StkEvalWithLumpRateFlgOffCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkEvalWithLumpRateFlgOffCols extends MGUAC_List.StkEvalWithLumpRateFlgOffCols_MC_A {
		//EIクラス
	}


	/** 
	  * PreAlcRateWithPtn:カラム名クラス
	  */
	protected static class PreAlcRateWithPtnCols_MC_A  {
		/** IN:予定月次比率 */
		public static final String $i_pln_mly_flg_str = "pln_mly_flg_str";
		/** IN:実績月次比率 */
		public static final String $i_act_mly_flg_str = "act_mly_flg_str";
		/** IN:期間検索 */
		public static final String $i_term_flg = "term_flg";
		/** OUT:一次配賦基準ＣＤ */
		public static final String $o_pre_alc_rate_cd = "pre_alc_rate_cd";
		/** OUT:一次配賦基準名 */
		public static final String $o_pre_alc_rate_nm = "pre_alc_rate_nm";
		/** OUT:一次配賦パタンＣＤ */
		public static final String $o_pre_alc_ptn_cd = "pre_alc_ptn_cd";
		/** OUT:一次配賦パタン名 */
		public static final String $o_pre_alc_ptn_nm = "pre_alc_ptn_nm";
		/** OUT:部門配賦区分 */
		public static final String $o_dpt_alc_typ = "dpt_alc_typ";
		/** OUT:場所配賦区分 */
		public static final String $o_loc_alc_typ = "loc_alc_typ";
		/** OUT:工程配賦区分 */
		public static final String $o_oper_alc_typ = "oper_alc_typ";
		/** OUT:取引先配賦区分 */
		public static final String $o_bp_alc_typ = "bp_alc_typ";
		/** OUT:品群配賦区分 */
		public static final String $o_ctg_alc_typ = "ctg_alc_typ";
		/** OUT:品目配賦区分 */
		public static final String $o_itm_alc_typ = "itm_alc_typ";
		/** OUT:ロットＮＯ配賦区分 */
		public static final String $o_lot_alc_typ = "lot_alc_typ";
		/** OUT:サブロットＮＯ配賦区分 */
		public static final String $o_sublot_alc_typ = "sublot_alc_typ";
		/** OUT:手配ＮＯ１配賦区分 */
		public static final String $o_sno1_alc_typ = "sno1_alc_typ";
		/** OUT:手配ＮＯ２配賦区分 */
		public static final String $o_sno2_alc_typ = "sno2_alc_typ";
		/** OUT:手配ＮＯ３配賦区分 */
		public static final String $o_sno3_alc_typ = "sno3_alc_typ";
		/** OUT:手配ＮＯ４配賦区分 */
		public static final String $o_sno4_alc_typ = "sno4_alc_typ";
		/** OUT:指図配賦区分 */
		public static final String $o_inst_alc_typ = "inst_alc_typ";
		/** OUT:インボイス配賦区分 */
		public static final String $o_iv_alc_typ = "iv_alc_typ";
		/** OUT:発注配賦区分 */
		public static final String $o_po_alc_typ = "po_alc_typ";
		/** OUT:受注配賦区分 */
		public static final String $o_slo_alc_typ = "slo_alc_typ";
		/** OUT:配賦科目配賦区分 */
		public static final String $o_alc_ac_alc_typ = "alc_ac_alc_typ";
		/** OUT:ワーキンググループ配賦区分 */
		public static final String $o_wg_alc_typ = "wg_alc_typ";
		/** VIEW:一次配賦基準ＣＤ */
		public static final String $v_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** VIEW_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $vn_pre_alc_rate_cd = new MCNumber(10);
		/** VIEW:一次配賦基準名 */
		public static final String $v_pre_alc_rate_nm = $o_pre_alc_rate_nm;
		/** VIEW_NO:一次配賦基準名 */
		protected static final MCNumber $vn_pre_alc_rate_nm = new MCNumber(20);
		/** VIEW:一次配賦パタンＣＤ */
		public static final String $v_pre_alc_ptn_cd = $o_pre_alc_ptn_cd;
		/** VIEW_NO:一次配賦パタンＣＤ */
		protected static final MCNumber $vn_pre_alc_ptn_cd = new MCNumber(30);
		/** VIEW:一次配賦パタン名 */
		public static final String $v_pre_alc_ptn_nm = $o_pre_alc_ptn_nm;
		/** VIEW_NO:一次配賦パタン名 */
		protected static final MCNumber $vn_pre_alc_ptn_nm = new MCNumber(40);
		/** SORT:一次配賦基準ＣＤ */
		public static final String $s_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** SORT_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $sn_pre_alc_rate_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pre_alc_rate_cd);
					add($o_pre_alc_rate_nm);
					add($o_pre_alc_ptn_cd);
					add($o_pre_alc_ptn_nm);
					add($o_dpt_alc_typ);
					add($o_loc_alc_typ);
					add($o_oper_alc_typ);
					add($o_bp_alc_typ);
					add($o_ctg_alc_typ);
					add($o_itm_alc_typ);
					add($o_lot_alc_typ);
					add($o_sublot_alc_typ);
					add($o_sno1_alc_typ);
					add($o_sno2_alc_typ);
					add($o_sno3_alc_typ);
					add($o_sno4_alc_typ);
					add($o_inst_alc_typ);
					add($o_iv_alc_typ);
					add($o_po_alc_typ);
					add($o_slo_alc_typ);
					add($o_alc_ac_alc_typ);
					add($o_wg_alc_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pre_alc_rate_cd, $v_pre_alc_rate_cd);
					put($vn_pre_alc_rate_nm, $v_pre_alc_rate_nm);
					put($vn_pre_alc_ptn_cd, $v_pre_alc_ptn_cd);
					put($vn_pre_alc_ptn_nm, $v_pre_alc_ptn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pre_alc_rate_cd, $s_pre_alc_rate_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.PreAlcRateWithPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.PreAlcRateWithPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.PreAlcRateWithPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.PreAlcRateWithPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PreAlcRateWithPtnCols extends MGUAC_List.PreAlcRateWithPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * CalcArgYm:カラム名クラス
	  */
	protected static class CalcArgYmCols_MC_A  {
		/** IN:原価計算ＮＯ */
		public static final String $i_calc_no = "calc_no";
		/** IN:計算グループＣＤ */
		public static final String $i_calc_grp_cd = "calc_grp_cd";
		/** OUT:年月 */
		public static final String $o_ym = "ym";
		/** VIEW:年月 */
		public static final String $v_ym = $o_ym;
		/** VIEW_NO:年月 */
		protected static final MCNumber $vn_ym = new MCNumber(10);
		/** SORT:年月 */
		public static final String $s_ym = $o_ym;
		/** SORT_NO:年月 */
		protected static final MCNumber $sn_ym = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ym);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ym, $v_ym);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ym, $s_ym, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CalcArgYmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CalcArgYmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CalcArgYmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CalcArgYmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CalcArgYmCols extends MGUAC_List.CalcArgYmCols_MC_A {
		//EIクラス
	}


	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:カラム名クラス
	  */
	protected static class PreAlcRateInPreAlcCtgWithPtnCols_MC_A  {
		/** IN:計算カテゴリＣＤ（必須） */
		public static final String $i_calc_ctg_cd = "calc_ctg_cd";
		/** IN:ワーキンググループＣＤ（必須） */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:期（必須） */
		public static final String $i_term = "term";
		/** IN:期間比率 */
		public static final String $i_term_flg = "term_flg";
		/** IN:予定月次比率 */
		public static final String $i_pln_mly_flg_str = "pln_mly_flg_str";
		/** IN:実績月次比率 */
		public static final String $i_act_mly_flg_str = "act_mly_flg_str";
		/** OUT:一次配賦基準ＣＤ */
		public static final String $o_pre_alc_rate_cd = "pre_alc_rate_cd";
		/** OUT:一次配賦基準名 */
		public static final String $o_pre_alc_rate_nm = "pre_alc_rate_nm";
		/** OUT:一次配賦パタンＣＤ */
		public static final String $o_pre_alc_ptn_cd = "pre_alc_ptn_cd";
		/** OUT:一次配賦パタン名 */
		public static final String $o_pre_alc_ptn_nm = "pre_alc_ptn_nm";
		/** OUT:部門配賦区分 */
		public static final String $o_dpt_alc_typ = "dpt_alc_typ";
		/** OUT:場所配賦区分 */
		public static final String $o_loc_alc_typ = "loc_alc_typ";
		/** OUT:工程配賦区分 */
		public static final String $o_oper_alc_typ = "oper_alc_typ";
		/** OUT:取引先配賦区分 */
		public static final String $o_bp_alc_typ = "bp_alc_typ";
		/** OUT:品群配賦区分 */
		public static final String $o_ctg_alc_typ = "ctg_alc_typ";
		/** OUT:品目配賦区分 */
		public static final String $o_itm_alc_typ = "itm_alc_typ";
		/** OUT:ロットＮＯ配賦区分 */
		public static final String $o_lot_alc_typ = "lot_alc_typ";
		/** OUT:サブロットＮＯ配賦区分 */
		public static final String $o_sublot_alc_typ = "sublot_alc_typ";
		/** OUT:手配ＮＯ１配賦区分 */
		public static final String $o_sno1_alc_typ = "sno1_alc_typ";
		/** OUT:手配ＮＯ２配賦区分 */
		public static final String $o_sno2_alc_typ = "sno2_alc_typ";
		/** OUT:手配ＮＯ３配賦区分 */
		public static final String $o_sno3_alc_typ = "sno3_alc_typ";
		/** OUT:手配ＮＯ４配賦区分 */
		public static final String $o_sno4_alc_typ = "sno4_alc_typ";
		/** OUT:指図配賦区分 */
		public static final String $o_inst_alc_typ = "inst_alc_typ";
		/** OUT:インボイス配賦区分 */
		public static final String $o_iv_alc_typ = "iv_alc_typ";
		/** OUT:発注配賦区分 */
		public static final String $o_po_alc_typ = "po_alc_typ";
		/** OUT:受注配賦区分 */
		public static final String $o_slo_alc_typ = "slo_alc_typ";
		/** OUT:配賦科目配賦区分 */
		public static final String $o_alc_ac_alc_typ = "alc_ac_alc_typ";
		/** OUT:ワーキンググループ配賦区分 */
		public static final String $o_wg_alc_typ = "wg_alc_typ";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk_calc_ctg_cd = "chk_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk_wg_cd = "chk_wg_cd";
		/** OUT:期（存在チェック用） */
		public static final String $o_chk_term = "chk_term";
		/** VIEW:一次配賦基準ＣＤ */
		public static final String $v_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** VIEW_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $vn_pre_alc_rate_cd = new MCNumber(10);
		/** VIEW:一次配賦基準名 */
		public static final String $v_pre_alc_rate_nm = $o_pre_alc_rate_nm;
		/** VIEW_NO:一次配賦基準名 */
		protected static final MCNumber $vn_pre_alc_rate_nm = new MCNumber(20);
		/** SORT:一次配賦基準ＣＤ */
		public static final String $s_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** SORT_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $sn_pre_alc_rate_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MGUAL0002";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pre_alc_rate_cd);
					add($o_pre_alc_rate_nm);
					add($o_pre_alc_ptn_cd);
					add($o_pre_alc_ptn_nm);
					add($o_dpt_alc_typ);
					add($o_loc_alc_typ);
					add($o_oper_alc_typ);
					add($o_bp_alc_typ);
					add($o_ctg_alc_typ);
					add($o_itm_alc_typ);
					add($o_lot_alc_typ);
					add($o_sublot_alc_typ);
					add($o_sno1_alc_typ);
					add($o_sno2_alc_typ);
					add($o_sno3_alc_typ);
					add($o_sno4_alc_typ);
					add($o_inst_alc_typ);
					add($o_iv_alc_typ);
					add($o_po_alc_typ);
					add($o_slo_alc_typ);
					add($o_alc_ac_alc_typ);
					add($o_wg_alc_typ);
					add($o_chk_calc_ctg_cd);
					add($o_chk_wg_cd);
					add($o_chk_term);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pre_alc_rate_cd, $v_pre_alc_rate_cd);
					put($vn_pre_alc_rate_nm, $v_pre_alc_rate_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pre_alc_rate_cd, $s_pre_alc_rate_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.PreAlcRateInPreAlcCtgWithPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.PreAlcRateInPreAlcCtgWithPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.PreAlcRateInPreAlcCtgWithPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.PreAlcRateInPreAlcCtgWithPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PreAlcRateInPreAlcCtgWithPtnCols extends MGUAC_List.PreAlcRateInPreAlcCtgWithPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmJnlInRptKeyConf:カラム名クラス
	  */
	protected static class ItmJnlInRptKeyConfCols_MC_A  {
		/** IN:レポートキーＣＤ */
		public static final String $i_rpt_key_cd = "rpt_key_cd";
		/** OUT:品目仕訳ＣＤ */
		public static final String $o_itm_jnl_cd = "itm_jnl_cd";
		/** OUT:品目仕訳名 */
		public static final String $o_itm_jnl_nm = "itm_jnl_nm";
		/** VIEW:品目仕訳ＣＤ */
		public static final String $v_itm_jnl_cd = $o_itm_jnl_cd;
		/** VIEW_NO:品目仕訳ＣＤ */
		protected static final MCNumber $vn_itm_jnl_cd = new MCNumber(10);
		/** VIEW:品目仕訳名 */
		public static final String $v_itm_jnl_nm = $o_itm_jnl_nm;
		/** VIEW_NO:品目仕訳名 */
		protected static final MCNumber $vn_itm_jnl_nm = new MCNumber(20);
		/** SORT:品目仕訳ＣＤ */
		public static final String $s_itm_jnl_cd = $o_itm_jnl_cd;
		/** SORT_NO:品目仕訳ＣＤ */
		protected static final MCNumber $sn_itm_jnl_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_jnl_cd);
					add($o_itm_jnl_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_jnl_cd, $v_itm_jnl_cd);
					put($vn_itm_jnl_nm, $v_itm_jnl_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_jnl_cd, $s_itm_jnl_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.ItmJnlInRptKeyConfCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.ItmJnlInRptKeyConfCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.ItmJnlInRptKeyConfCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.ItmJnlInRptKeyConfCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmJnlInRptKeyConfCols extends MGUAC_List.ItmJnlInRptKeyConfCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmGrpInRptKeyConf:カラム名クラス
	  */
	protected static class ItmGrpInRptKeyConfCols_MC_A  {
		/** IN:レポートキーＣＤ */
		public static final String $i_rpt_key_cd = "rpt_key_cd";
		/** OUT:品目分類ＣＤ */
		public static final String $o_itm_grp_cd = "itm_grp_cd";
		/** OUT:品目分類名 */
		public static final String $o_itm_grp_nm = "itm_grp_nm";
		/** OUT:品目分類区分 */
		public static final String $o_itm_grp_typ = "itm_grp_typ";
		/** VIEW:品目分類ＣＤ */
		public static final String $v_itm_grp_cd = $o_itm_grp_cd;
		/** VIEW_NO:品目分類ＣＤ */
		protected static final MCNumber $vn_itm_grp_cd = new MCNumber(10);
		/** VIEW:品目分類名 */
		public static final String $v_itm_grp_nm = $o_itm_grp_nm;
		/** VIEW_NO:品目分類名 */
		protected static final MCNumber $vn_itm_grp_nm = new MCNumber(20);
		/** SORT:品目分類ＣＤ */
		public static final String $s_itm_grp_cd = $o_itm_grp_cd;
		/** SORT_NO:品目分類ＣＤ */
		protected static final MCNumber $sn_itm_grp_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_grp_cd);
					add($o_itm_grp_nm);
					add($o_itm_grp_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_grp_cd, $v_itm_grp_cd);
					put($vn_itm_grp_nm, $v_itm_grp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_grp_cd, $s_itm_grp_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.ItmGrpInRptKeyConfCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.ItmGrpInRptKeyConfCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.ItmGrpInRptKeyConfCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.ItmGrpInRptKeyConfCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmGrpInRptKeyConfCols extends MGUAC_List.ItmGrpInRptKeyConfCols_MC_A {
		//EIクラス
	}


	/** 
	  * CostDptInRptKeyConf:カラム名クラス
	  */
	protected static class CostDptInRptKeyConfCols_MC_A  {
		/** IN:レポートキーＣＤ */
		public static final String $i_rpt_key_cd = "rpt_key_cd";
		/** IN:適用年月 */
		public static final String $i_ym = "ym";
		/** IN:運用年月使用ＦＬＧ */
		public static final String $i_mode_this_month_flg = "mode_this_month_flg";
		/** OUT:部門ＣＤ */
		public static final String $o_dpt_cd = "dpt_cd";
		/** OUT:部門名 */
		public static final String $o_dpt_nm = "dpt_nm";
		/** VIEW:部門ＣＤ */
		public static final String $v_dpt_cd = $o_dpt_cd;
		/** VIEW_NO:部門ＣＤ */
		protected static final MCNumber $vn_dpt_cd = new MCNumber(10);
		/** VIEW:部門名 */
		public static final String $v_dpt_nm = $o_dpt_nm;
		/** VIEW_NO:部門名 */
		protected static final MCNumber $vn_dpt_nm = new MCNumber(20);
		/** SORT:部門ＣＤ */
		public static final String $s_dpt_cd = $o_dpt_cd;
		/** SORT_NO:部門ＣＤ */
		protected static final MCNumber $sn_dpt_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dpt_cd);
					add($o_dpt_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dpt_cd, $v_dpt_cd);
					put($vn_dpt_nm, $v_dpt_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dpt_cd, $s_dpt_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CostDptInRptKeyConfCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CostDptInRptKeyConfCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CostDptInRptKeyConfCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CostDptInRptKeyConfCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CostDptInRptKeyConfCols extends MGUAC_List.CostDptInRptKeyConfCols_MC_A {
		//EIクラス
	}


	/** 
	  * CostCmpPtn:カラム名クラス
	  */
	protected static class CostCmpPtnCols_MC_A  {
		/** OUT:比較パタンＣＤ */
		public static final String $o_cmp_ptn_cd = "cmp_ptn_cd";
		/** OUT:比較パタン名 */
		public static final String $o_cmp_ptn_nm = "cmp_ptn_nm";
		/** OUT:レポートパタンＣＤ */
		public static final String $o_rpt_ptn_cd = "rpt_ptn_cd";
		/** OUT:レポートパタン名 */
		public static final String $o_rpt_ptn_nm = "rpt_ptn_nm";
		/** OUT:レポートキーＣＤ */
		public static final String $o_rpt_key_cd = "rpt_key_cd";
		/** OUT:レポートキー名 */
		public static final String $o_rpt_key_nm = "rpt_key_nm";
		/** OUT:レポートキー区分 */
		public static final String $o_rpt_key_typ = "rpt_key_typ";
		/** VIEW:比較パタンＣＤ */
		public static final String $v_cmp_ptn_cd = $o_cmp_ptn_cd;
		/** VIEW_NO:比較パタンＣＤ */
		protected static final MCNumber $vn_cmp_ptn_cd = new MCNumber(10);
		/** VIEW:比較パタン名 */
		public static final String $v_cmp_ptn_nm = $o_cmp_ptn_nm;
		/** VIEW_NO:比較パタン名 */
		protected static final MCNumber $vn_cmp_ptn_nm = new MCNumber(20);
		/** SORT:比較パタンＣＤ */
		public static final String $s_cmp_ptn_cd = $o_cmp_ptn_cd;
		/** SORT_NO:比較パタンＣＤ */
		protected static final MCNumber $sn_cmp_ptn_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cmp_ptn_cd);
					add($o_cmp_ptn_nm);
					add($o_rpt_ptn_cd);
					add($o_rpt_ptn_nm);
					add($o_rpt_key_cd);
					add($o_rpt_key_nm);
					add($o_rpt_key_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cmp_ptn_cd, $v_cmp_ptn_cd);
					put($vn_cmp_ptn_nm, $v_cmp_ptn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cmp_ptn_cd, $s_cmp_ptn_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CostCmpPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CostCmpPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CostCmpPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CostCmpPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CostCmpPtnCols extends MGUAC_List.CostCmpPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:カラム名クラス
	  */
	protected static class PreAlcRateWithPtnNotInPreRateTermCols_MC_A  {
		/** IN:計算カテゴリＣＤ（必須） */
		public static final String $i_calc_ctg_cd = "calc_ctg_cd";
		/** IN:ワーキンググループＣＤ（必須） */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:期（必須） */
		public static final String $i_term = "term";
		/** OUT:一次配賦基準ＣＤ */
		public static final String $o_pre_alc_rate_cd = "pre_alc_rate_cd";
		/** OUT:一次配賦基準名 */
		public static final String $o_pre_alc_rate_nm = "pre_alc_rate_nm";
		/** OUT:一次配賦パタンＣＤ */
		public static final String $o_pre_alc_ptn_cd = "pre_alc_ptn_cd";
		/** OUT:一次配賦パタン名 */
		public static final String $o_pre_alc_ptn_nm = "pre_alc_ptn_nm";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk_calc_ctg_cd = "chk_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk_wg_cd = "chk_wg_cd";
		/** OUT:期（存在チェック用） */
		public static final String $o_chk_term = "chk_term";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk2_calc_ctg_cd = "chk2_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk2_wg_cd = "chk2_wg_cd";
		/** OUT:期（存在チェック用） */
		public static final String $o_chk2_term = "chk2_term";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk3_calc_ctg_cd = "chk3_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk3_wg_cd = "chk3_wg_cd";
		/** OUT:期（存在チェック用） */
		public static final String $o_chk3_term = "chk3_term";
		/** VIEW:一次配賦基準ＣＤ */
		public static final String $v_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** VIEW_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $vn_pre_alc_rate_cd = new MCNumber(10);
		/** VIEW:一次配賦基準名 */
		public static final String $v_pre_alc_rate_nm = $o_pre_alc_rate_nm;
		/** VIEW_NO:一次配賦基準名 */
		protected static final MCNumber $vn_pre_alc_rate_nm = new MCNumber(20);
		/** SORT:一次配賦基準ＣＤ */
		public static final String $s_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** SORT_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $sn_pre_alc_rate_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MGUAL0003";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pre_alc_rate_cd);
					add($o_pre_alc_rate_nm);
					add($o_pre_alc_ptn_cd);
					add($o_pre_alc_ptn_nm);
					add($o_chk_calc_ctg_cd);
					add($o_chk_wg_cd);
					add($o_chk_term);
					add($o_chk2_calc_ctg_cd);
					add($o_chk2_wg_cd);
					add($o_chk2_term);
					add($o_chk3_calc_ctg_cd);
					add($o_chk3_wg_cd);
					add($o_chk3_term);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pre_alc_rate_cd, $v_pre_alc_rate_cd);
					put($vn_pre_alc_rate_nm, $v_pre_alc_rate_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pre_alc_rate_cd, $s_pre_alc_rate_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateTermCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateTermCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateTermCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateTermCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PreAlcRateWithPtnNotInPreRateTermCols extends MGUAC_List.PreAlcRateWithPtnNotInPreRateTermCols_MC_A {
		//EIクラス
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:カラム名クラス
	  */
	protected static class PreAlcRateWithPtnNotInPreRateMlyCols_MC_A  {
		/** IN:計算カテゴリＣＤ（必須） */
		public static final String $i_calc_ctg_cd = "calc_ctg_cd";
		/** IN:ワーキンググループＣＤ（必須） */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:期（必須） */
		public static final String $i_term = "term";
		/** IN:年月（必須） */
		public static final String $i_ym = "ym";
		/** IN:予実区分（必須） */
		public static final String $i_sa_typ = "sa_typ";
		/** OUT:一次配賦基準ＣＤ */
		public static final String $o_pre_alc_rate_cd = "pre_alc_rate_cd";
		/** OUT:一次配賦基準名 */
		public static final String $o_pre_alc_rate_nm = "pre_alc_rate_nm";
		/** OUT:一次配賦パタンＣＤ */
		public static final String $o_pre_alc_ptn_cd = "pre_alc_ptn_cd";
		/** OUT:一次配賦パタン名 */
		public static final String $o_pre_alc_ptn_nm = "pre_alc_ptn_nm";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk_calc_ctg_cd = "chk_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk_wg_cd = "chk_wg_cd";
		/** OUT:期（存在チェック用） */
		public static final String $o_chk_term = "chk_term";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk2_calc_ctg_cd = "chk2_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk2_wg_cd = "chk2_wg_cd";
		/** OUT:年月（存在チェック用） */
		public static final String $o_chk2_ym = "chk2_ym";
		/** OUT:予実区分（存在チェック用） */
		public static final String $o_chk2_sa_typ = "chk2_sa_typ";
		/** OUT:計算カテゴリＣＤ（存在チェック用） */
		public static final String $o_chk3_calc_ctg_cd = "chk3_calc_ctg_cd";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_chk3_wg_cd = "chk3_wg_cd";
		/** OUT:年月（存在チェック用） */
		public static final String $o_chk3_ym = "chk3_ym";
		/** OUT:予実区分（存在チェック用） */
		public static final String $o_chk3_sa_typ = "chk3_sa_typ";
		/** VIEW:一次配賦基準ＣＤ */
		public static final String $v_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** VIEW_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $vn_pre_alc_rate_cd = new MCNumber(10);
		/** VIEW:一次配賦基準名 */
		public static final String $v_pre_alc_rate_nm = $o_pre_alc_rate_nm;
		/** VIEW_NO:一次配賦基準名 */
		protected static final MCNumber $vn_pre_alc_rate_nm = new MCNumber(20);
		/** SORT:一次配賦基準ＣＤ */
		public static final String $s_pre_alc_rate_cd = $o_pre_alc_rate_cd;
		/** SORT_NO:一次配賦基準ＣＤ */
		protected static final MCNumber $sn_pre_alc_rate_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MGUAL0004";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pre_alc_rate_cd);
					add($o_pre_alc_rate_nm);
					add($o_pre_alc_ptn_cd);
					add($o_pre_alc_ptn_nm);
					add($o_chk_calc_ctg_cd);
					add($o_chk_wg_cd);
					add($o_chk_term);
					add($o_chk2_calc_ctg_cd);
					add($o_chk2_wg_cd);
					add($o_chk2_ym);
					add($o_chk2_sa_typ);
					add($o_chk3_calc_ctg_cd);
					add($o_chk3_wg_cd);
					add($o_chk3_ym);
					add($o_chk3_sa_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pre_alc_rate_cd, $v_pre_alc_rate_cd);
					put($vn_pre_alc_rate_nm, $v_pre_alc_rate_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pre_alc_rate_cd, $s_pre_alc_rate_cd, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateMlyCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateMlyCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateMlyCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.PreAlcRateWithPtnNotInPreRateMlyCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PreAlcRateWithPtnNotInPreRateMlyCols extends MGUAC_List.PreAlcRateWithPtnNotInPreRateMlyCols_MC_A {
		//EIクラス
	}


	/** 
	  * RecEvalTyp:カラム名クラス
	  */
	protected static class RecEvalTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_rec_eval_typ = "rec_eval_typ";
		/** OUT:名称 */
		public static final String $o_rec_eval_typ_nm = "rec_eval_typ_nm";
		/** VIEW:値 */
		public static final String $v_rec_eval_typ = $o_rec_eval_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_rec_eval_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_rec_eval_typ_nm = $o_rec_eval_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_rec_eval_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_rec_eval_typ = $o_rec_eval_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_rec_eval_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_rec_eval_typ);
					add($o_rec_eval_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_rec_eval_typ, $v_rec_eval_typ);
					put($vn_rec_eval_typ_nm, $v_rec_eval_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_rec_eval_typ, $s_rec_eval_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.RecEvalTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.RecEvalTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.RecEvalTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.RecEvalTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class RecEvalTypCols extends MGUAC_List.RecEvalTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * Ym:カラム名クラス
	  */
	protected static class YmCols_MC_A  {
		/** IN:開始 */
		public static final String $i_st_ym = "st_ym";
		/** IN:終了 */
		public static final String $i_end_ym = "end_ym";
		/** IN:最大月間隔 */
		public static final String $i_max_interval = "max_interval";
		/** IN:終了を含めるフラグ */
		public static final String $i_inc_end_ym_flg = "inc_end_ym_flg";
		/** OUT:年月 */
		public static final String $o_ym = "ym";
		/** VIEW:年月 */
		public static final String $v_ym = $o_ym;
		/** VIEW_NO:年月 */
		protected static final MCNumber $vn_ym = new MCNumber(10);
		/** SORT:年月 */
		public static final String $s_ym = $o_ym;
		/** SORT_NO:年月 */
		protected static final MCNumber $sn_ym = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ym);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ym, $v_ym);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ym, $s_ym, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.YmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.YmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.YmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.YmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class YmCols extends MGUAC_List.YmCols_MC_A {
		//EIクラス
	}


	/** 
	  * AmtDcsnTyp:カラム名クラス
	  */
	protected static class AmtDcsnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_amt_dcsn_typ = "amt_dcsn_typ";
		/** OUT:名称 */
		public static final String $o_amt_dcsn_typ_nm = "amt_dcsn_typ_nm";
		/** VIEW:値 */
		public static final String $v_amt_dcsn_typ = $o_amt_dcsn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_amt_dcsn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_amt_dcsn_typ_nm = $o_amt_dcsn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_amt_dcsn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_amt_dcsn_typ = $o_amt_dcsn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_amt_dcsn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_amt_dcsn_typ);
					add($o_amt_dcsn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_amt_dcsn_typ, $v_amt_dcsn_typ);
					put($vn_amt_dcsn_typ_nm, $v_amt_dcsn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_amt_dcsn_typ, $s_amt_dcsn_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.AmtDcsnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.AmtDcsnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.AmtDcsnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.AmtDcsnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AmtDcsnTypCols extends MGUAC_List.AmtDcsnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtyDcsnTyp:カラム名クラス
	  */
	protected static class QtyDcsnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_qty_dcsn_typ = "qty_dcsn_typ";
		/** OUT:名称 */
		public static final String $o_qty_dcsn_typ_nm = "qty_dcsn_typ_nm";
		/** VIEW:値 */
		public static final String $v_qty_dcsn_typ = $o_qty_dcsn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_qty_dcsn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_qty_dcsn_typ_nm = $o_qty_dcsn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_qty_dcsn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_qty_dcsn_typ = $o_qty_dcsn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_qty_dcsn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_qty_dcsn_typ);
					add($o_qty_dcsn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_qty_dcsn_typ, $v_qty_dcsn_typ);
					put($vn_qty_dcsn_typ_nm, $v_qty_dcsn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_qty_dcsn_typ, $s_qty_dcsn_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.QtyDcsnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.QtyDcsnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.QtyDcsnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.QtyDcsnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtyDcsnTypCols extends MGUAC_List.QtyDcsnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CtDataTyp:カラム名クラス
	  */
	protected static class CtDataTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ct_data_typ = "ct_data_typ";
		/** OUT:名称 */
		public static final String $o_ct_data_typ_nm = "ct_data_typ_nm";
		/** VIEW:値 */
		public static final String $v_ct_data_typ = $o_ct_data_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ct_data_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ct_data_typ_nm = $o_ct_data_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ct_data_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ct_data_typ = $o_ct_data_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ct_data_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ct_data_typ);
					add($o_ct_data_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ct_data_typ, $v_ct_data_typ);
					put($vn_ct_data_typ_nm, $v_ct_data_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ct_data_typ, $s_ct_data_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CtDataTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CtDataTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CtDataTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CtDataTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CtDataTypCols extends MGUAC_List.CtDataTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IfDtlTyp:カラム名クラス
	  */
	protected static class IfDtlTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_if_dtl_typ = "if_dtl_typ";
		/** OUT:名称 */
		public static final String $o_if_dtl_typ_nm = "if_dtl_typ_nm";
		/** VIEW:値 */
		public static final String $v_if_dtl_typ = $o_if_dtl_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_if_dtl_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_if_dtl_typ_nm = $o_if_dtl_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_if_dtl_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_if_dtl_typ = $o_if_dtl_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_if_dtl_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_if_dtl_typ);
					add($o_if_dtl_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_if_dtl_typ, $v_if_dtl_typ);
					put($vn_if_dtl_typ_nm, $v_if_dtl_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_if_dtl_typ, $s_if_dtl_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.IfDtlTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.IfDtlTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.IfDtlTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.IfDtlTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IfDtlTypCols extends MGUAC_List.IfDtlTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IfDataTyp:カラム名クラス
	  */
	protected static class IfDataTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_if_data_typ = "if_data_typ";
		/** OUT:名称 */
		public static final String $o_if_data_typ_nm = "if_data_typ_nm";
		/** VIEW:値 */
		public static final String $v_if_data_typ = $o_if_data_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_if_data_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_if_data_typ_nm = $o_if_data_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_if_data_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_if_data_typ = $o_if_data_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_if_data_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_if_data_typ);
					add($o_if_data_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_if_data_typ, $v_if_data_typ);
					put($vn_if_data_typ_nm, $v_if_data_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_if_data_typ, $s_if_data_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.IfDataTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.IfDataTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.IfDataTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.IfDataTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IfDataTypCols extends MGUAC_List.IfDataTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CostActTyp:カラム名クラス
	  */
	protected static class CostActTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_cost_act_typ = "cost_act_typ";
		/** OUT:名称 */
		public static final String $o_cost_act_typ_nm = "cost_act_typ_nm";
		/** VIEW:値 */
		public static final String $v_cost_act_typ = $o_cost_act_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_cost_act_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_cost_act_typ_nm = $o_cost_act_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_cost_act_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_cost_act_typ = $o_cost_act_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_cost_act_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cost_act_typ);
					add($o_cost_act_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cost_act_typ, $v_cost_act_typ);
					put($vn_cost_act_typ_nm, $v_cost_act_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cost_act_typ, $s_cost_act_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CostActTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CostActTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CostActTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CostActTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CostActTypCols extends MGUAC_List.CostActTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AlcRecTyp:カラム名クラス
	  */
	protected static class AlcRecTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_alc_rec_typ = "alc_rec_typ";
		/** OUT:名称 */
		public static final String $o_alc_rec_typ_nm = "alc_rec_typ_nm";
		/** VIEW:値 */
		public static final String $v_alc_rec_typ = $o_alc_rec_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_alc_rec_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_alc_rec_typ_nm = $o_alc_rec_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_alc_rec_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_alc_rec_typ = $o_alc_rec_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_alc_rec_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_alc_rec_typ);
					add($o_alc_rec_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_alc_rec_typ, $v_alc_rec_typ);
					put($vn_alc_rec_typ_nm, $v_alc_rec_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_alc_rec_typ, $s_alc_rec_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.AlcRecTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.AlcRecTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.AlcRecTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.AlcRecTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AlcRecTypCols extends MGUAC_List.AlcRecTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InptAlcTyp:カラム名クラス
	  */
	protected static class InptAlcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_inpt_alc_typ = "inpt_alc_typ";
		/** OUT:名称 */
		public static final String $o_inpt_alc_typ_nm = "inpt_alc_typ_nm";
		/** VIEW:値 */
		public static final String $v_inpt_alc_typ = $o_inpt_alc_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_inpt_alc_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_inpt_alc_typ_nm = $o_inpt_alc_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_inpt_alc_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_inpt_alc_typ = $o_inpt_alc_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_inpt_alc_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_inpt_alc_typ);
					add($o_inpt_alc_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_inpt_alc_typ, $v_inpt_alc_typ);
					put($vn_inpt_alc_typ_nm, $v_inpt_alc_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_inpt_alc_typ, $s_inpt_alc_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.InptAlcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.InptAlcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.InptAlcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.InptAlcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InptAlcTypCols extends MGUAC_List.InptAlcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * TabCtgTyp:カラム名クラス
	  */
	protected static class TabCtgTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_tab_ctg_typ = "tab_ctg_typ";
		/** OUT:名称 */
		public static final String $o_tab_ctg_typ_nm = "tab_ctg_typ_nm";
		/** OUT:名称 */
		public static final String $o_list_sort = "list_sort";
		/** VIEW:値 */
		public static final String $v_tab_ctg_typ = $o_tab_ctg_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_tab_ctg_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_tab_ctg_typ_nm = $o_tab_ctg_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_tab_ctg_typ_nm = new MCNumber(20);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_tab_ctg_typ);
					add($o_tab_ctg_typ_nm);
					add($o_list_sort);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_tab_ctg_typ, $v_tab_ctg_typ);
					put($vn_tab_ctg_typ_nm, $v_tab_ctg_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.TabCtgTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.TabCtgTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.TabCtgTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.TabCtgTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class TabCtgTypCols extends MGUAC_List.TabCtgTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CostCopyTyp:カラム名クラス
	  */
	protected static class CostCopyTypCols_MC_A  {
		/** IN:種別 */
		public static final String $i_tgt_typ = "tgt_typ";
		/** IN:テーブルカテゴリ区分 */
		public static final String $i_tab_ctg_typ = "tab_ctg_typ";
		/** OUT:値 */
		public static final String $o_cost_copy_typ = "cost_copy_typ";
		/** OUT:名称 */
		public static final String $o_cost_copy_typ_nm = "cost_copy_typ_nm";
		/** VIEW:値 */
		public static final String $v_cost_copy_typ = $o_cost_copy_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_cost_copy_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_cost_copy_typ_nm = $o_cost_copy_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_cost_copy_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_cost_copy_typ = $o_cost_copy_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_cost_copy_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cost_copy_typ);
					add($o_cost_copy_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cost_copy_typ, $v_cost_copy_typ);
					put($vn_cost_copy_typ_nm, $v_cost_copy_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cost_copy_typ, $s_cost_copy_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CostCopyTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CostCopyTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CostCopyTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CostCopyTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CostCopyTypCols extends MGUAC_List.CostCopyTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CalcRecTyp:カラム名クラス
	  */
	protected static class CalcRecTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_calc_rec_typ = "calc_rec_typ";
		/** OUT:名称 */
		public static final String $o_calc_rec_typ_nm = "calc_rec_typ_nm";
		/** VIEW:値 */
		public static final String $v_calc_rec_typ = $o_calc_rec_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_calc_rec_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_calc_rec_typ_nm = $o_calc_rec_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_calc_rec_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_calc_rec_typ = $o_calc_rec_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_calc_rec_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_calc_rec_typ);
					add($o_calc_rec_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_calc_rec_typ, $v_calc_rec_typ);
					put($vn_calc_rec_typ_nm, $v_calc_rec_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_calc_rec_typ, $s_calc_rec_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CalcRecTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CalcRecTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CalcRecTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CalcRecTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CalcRecTypCols extends MGUAC_List.CalcRecTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoRecTyp:カラム名クラス
	  */
	protected static class IoRecTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_rec_typ = "io_rec_typ";
		/** OUT:名称 */
		public static final String $o_io_rec_typ_nm = "io_rec_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_rec_typ = $o_io_rec_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_rec_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_rec_typ_nm = $o_io_rec_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_rec_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_rec_typ = $o_io_rec_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_rec_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_rec_typ);
					add($o_io_rec_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_rec_typ, $v_io_rec_typ);
					put($vn_io_rec_typ_nm, $v_io_rec_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_rec_typ, $s_io_rec_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.IoRecTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.IoRecTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.IoRecTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.IoRecTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoRecTypCols extends MGUAC_List.IoRecTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PtnSetTyp:カラム名クラス
	  */
	protected static class PtnSetTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ptn_set_typ = "ptn_set_typ";
		/** OUT:名称 */
		public static final String $o_ptn_set_typ_nm = "ptn_set_typ_nm";
		/** VIEW:値 */
		public static final String $v_ptn_set_typ = $o_ptn_set_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ptn_set_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ptn_set_typ_nm = $o_ptn_set_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ptn_set_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ptn_set_typ = $o_ptn_set_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ptn_set_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ptn_set_typ);
					add($o_ptn_set_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ptn_set_typ, $v_ptn_set_typ);
					put($vn_ptn_set_typ_nm, $v_ptn_set_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ptn_set_typ, $s_ptn_set_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.PtnSetTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.PtnSetTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.PtnSetTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.PtnSetTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PtnSetTypCols extends MGUAC_List.PtnSetTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * BatchTyp:カラム名クラス
	  */
	protected static class BatchTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_batch_typ = "batch_typ";
		/** OUT:名称 */
		public static final String $o_batch_typ_nm = "batch_typ_nm";
		/** VIEW:値 */
		public static final String $v_batch_typ = $o_batch_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_batch_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_batch_typ_nm = $o_batch_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_batch_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_batch_typ = $o_batch_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_batch_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_batch_typ);
					add($o_batch_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_batch_typ, $v_batch_typ);
					put($vn_batch_typ_nm, $v_batch_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_batch_typ, $s_batch_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.BatchTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.BatchTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.BatchTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.BatchTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BatchTypCols extends MGUAC_List.BatchTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * RepurcObliTyp:カラム名クラス
	  */
	protected static class RepurcObliTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_repurc_obli_typ = "repurc_obli_typ";
		/** OUT:名称 */
		public static final String $o_repurc_obli_typ_nm = "repurc_obli_typ_nm";
		/** VIEW:値 */
		public static final String $v_repurc_obli_typ = $o_repurc_obli_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_repurc_obli_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_repurc_obli_typ_nm = $o_repurc_obli_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_repurc_obli_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_repurc_obli_typ = $o_repurc_obli_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_repurc_obli_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_repurc_obli_typ);
					add($o_repurc_obli_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_repurc_obli_typ, $v_repurc_obli_typ);
					put($vn_repurc_obli_typ_nm, $v_repurc_obli_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_repurc_obli_typ, $s_repurc_obli_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.RepurcObliTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.RepurcObliTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.RepurcObliTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.RepurcObliTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class RepurcObliTypCols extends MGUAC_List.RepurcObliTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CostIoActTyp:カラム名クラス
	  */
	protected static class CostIoActTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_cost_io_act_typ = "cost_io_act_typ";
		/** OUT:名称 */
		public static final String $o_cost_io_act_typ_nm = "cost_io_act_typ_nm";
		/** VIEW:値 */
		public static final String $v_cost_io_act_typ = $o_cost_io_act_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_cost_io_act_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_cost_io_act_typ_nm = $o_cost_io_act_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_cost_io_act_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_cost_io_act_typ = $o_cost_io_act_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_cost_io_act_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cost_io_act_typ);
					add($o_cost_io_act_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cost_io_act_typ, $v_cost_io_act_typ);
					put($vn_cost_io_act_typ_nm, $v_cost_io_act_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cost_io_act_typ, $s_cost_io_act_typ, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CostIoActTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CostIoActTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CostIoActTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CostIoActTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CostIoActTypCols extends MGUAC_List.CostIoActTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CalcNo:カラム名クラス
	  */
	protected static class CalcNoCols_MC_A  {
		/** IN:原価計算ＮＯ */
		public static final String $i_calc_no = "calc_no";
		/** IN:備考 */
		public static final String $i_rmrks = "rmrks";
		/** IN:計算グループＣＤ（必須） */
		public static final String $i_calc_grp_cd = "calc_grp_cd";
		/** IN:計算グループ名 */
		public static final String $i_calc_grp_nm = "calc_grp_nm";
		/** IN:期 */
		public static final String $i_term = "term";
		/** IN:期FROM */
		public static final String $i_term_fr = "term_fr";
		/** IN:期TO */
		public static final String $i_term_to = "term_to";
		/** IN:年FROM */
		public static final String $i_y_fr = "y_fr";
		/** IN:年TO */
		public static final String $i_y_to = "y_to";
		/** IN:月ＦＲＯＭ */
		public static final String $i_m_fr = "m_fr";
		/** IN:月ＴＯ */
		public static final String $i_m_to = "m_to";
		/** IN:年月ＦＲＯＭ */
		public static final String $i_ym_fr = "ym_fr";
		/** IN:年月ＴＯ */
		public static final String $i_ym_to = "ym_to";
		/** IN:確定ＦＬＧ */
		public static final String $i_fix_flg = "fix_flg";
		/** IN:予備１ */
		public static final String $i_sub_char1 = "sub_char1";
		/** IN:予備２ */
		public static final String $i_sub_char2 = "sub_char2";
		/** IN:予備３ */
		public static final String $i_sub_char3 = "sub_char3";
		/** OUT:原価計算ＮＯ */
		public static final String $o_calc_no = "calc_no";
		/** OUT:計算グループＣＤ */
		public static final String $o_calc_grp_cd = "calc_grp_cd";
		/** OUT:計算グループ名 */
		public static final String $o_calc_grp_nm = "calc_grp_nm";
		/** OUT:期 */
		public static final String $o_term = "term";
		/** OUT:期名称 */
		public static final String $o_term_nm = "term_nm";
		/** OUT:対象期間先頭年月 */
		public static final String $o_st_ym = "st_ym";
		/** OUT:対象期間末尾年月 */
		public static final String $o_end_ym = "end_ym";
		/** OUT:検索対象年 */
		public static final String $o_year_src = "year_src";
		/** OUT:検索対象月 */
		public static final String $o_month_src = "month_src";
		/** OUT:確定ＦＬＧ */
		public static final String $o_fix_flg = "fix_flg";
		/** OUT:備考 */
		public static final String $o_rmrks = "rmrks";
		/** OUT:配賦率計算区分 */
		public static final String $o_alc_calc_typ = "alc_calc_typ";
		/** OUT:予備１ */
		public static final String $o_sub_char1 = "sub_char1";
		/** OUT:予備２ */
		public static final String $o_sub_char2 = "sub_char2";
		/** OUT:予備３ */
		public static final String $o_sub_char3 = "sub_char3";
		/** VIEW:原価計算ＮＯ */
		public static final String $v_calc_no = $o_calc_no;
		/** VIEW_NO:原価計算ＮＯ */
		protected static final MCNumber $vn_calc_no = new MCNumber(10);
		/** VIEW:備考 */
		public static final String $v_rmrks = $o_rmrks;
		/** VIEW_NO:備考 */
		protected static final MCNumber $vn_rmrks = new MCNumber(20);
		/** SORT:原価計算ＮＯ */
		public static final String $s_calc_no = $o_calc_no;
		/** SORT_NO:原価計算ＮＯ */
		protected static final MCNumber $sn_calc_no = new MCNumber(10);
		/** SORT:備考 */
		public static final String $s_rmrks = $o_rmrks;
		/** SORT_NO:備考 */
		protected static final MCNumber $sn_rmrks = new MCNumber(20);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MG";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MGUAP1010";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_calc_no);
					add($o_calc_grp_cd);
					add($o_calc_grp_nm);
					add($o_term);
					add($o_term_nm);
					add($o_st_ym);
					add($o_end_ym);
					add($o_year_src);
					add($o_month_src);
					add($o_fix_flg);
					add($o_rmrks);
					add($o_alc_calc_typ);
					add($o_sub_char1);
					add($o_sub_char2);
					add($o_sub_char3);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_calc_no, $v_calc_no);
					put($vn_rmrks, $v_rmrks);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_calc_no, $s_calc_no, DESC);
					put($sn_rmrks, $s_rmrks, ASC);
				}};;
		protected static List<String> getOutCols(){
			return $out_cols_MC;
		 }
		protected static SortedMap<MCNumber, String> getViewCols(){
			return $view_cols_MC;
		 }
		protected static FXBAC_ListSortInfo getSortInfo(){
			return $sort_cols_MC;
		 }
		public static final String[] outAll(){return MGUAC_List.CalcNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MGUAC_List.CalcNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MGUAC_List.CalcNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MGUAC_List.CalcNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CalcNoCols extends MGUAC_List.CalcNoCols_MC_A {
		//EIクラス
	}

}
