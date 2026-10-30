package mcframe.commonMSUA.MSUAC0030;
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
class MSUAC_List_MC_A extends Object {

	/** 
	  * WrkMng:カラム名クラス
	  */
	protected static class WrkMngCols_MC_A  {
		/** IN:案件管理区分 */
		public static final String $i_wrk_mng_typ = "wrk_mng_typ";
		/** OUT:案件管理ＣＤ */
		public static final String $o_wrk_mng_cd = "wrk_mng_cd";
		/** OUT:案件管理名 */
		public static final String $o_wrk_mng_nm = "wrk_mng_nm";
		/** VIEW:案件管理ＣＤ */
		public static final String $v_wrk_mng_cd = $o_wrk_mng_cd;
		/** VIEW_NO:案件管理ＣＤ */
		protected static final MCNumber $vn_wrk_mng_cd = new MCNumber(10);
		/** VIEW:案件管理名 */
		public static final String $v_wrk_mng_nm = $o_wrk_mng_nm;
		/** VIEW_NO:案件管理名 */
		protected static final MCNumber $vn_wrk_mng_nm = new MCNumber(20);
		/** SORT:案件管理ＣＤ */
		public static final String $s_wrk_mng_cd = $o_wrk_mng_cd;
		/** SORT_NO:案件管理ＣＤ */
		protected static final MCNumber $sn_wrk_mng_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0019";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_mng_cd);
					add($o_wrk_mng_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_mng_cd, $v_wrk_mng_cd);
					put($vn_wrk_mng_nm, $v_wrk_mng_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_mng_cd, $s_wrk_mng_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WrkMngCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WrkMngCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WrkMngCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WrkMngCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WrkMngCols extends MSUAC_List.WrkMngCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloCanRsn:カラム名クラス
	  */
	protected static class SloCanRsnCols_MC_A  {
		/** OUT:見積受注理由ＣＤ */
		public static final String $o_slo_rsn_cd = "slo_rsn_cd";
		/** OUT:見積受注理由名 */
		public static final String $o_slo_rsn_nm = "slo_rsn_nm";
		/** OUT:受注取消ソート順 */
		public static final String $o_slo_can_sort_seq = "slo_can_sort_seq";
		/** VIEW:見積受注理由ＣＤ */
		public static final String $v_slo_rsn_cd = $o_slo_rsn_cd;
		/** VIEW_NO:見積受注理由ＣＤ */
		protected static final MCNumber $vn_slo_rsn_cd = new MCNumber(10);
		/** VIEW:見積受注理由名 */
		public static final String $v_slo_rsn_nm = $o_slo_rsn_nm;
		/** VIEW_NO:見積受注理由名 */
		protected static final MCNumber $vn_slo_rsn_nm = new MCNumber(20);
		/** SORT:見積受注理由ＣＤ */
		public static final String $s_slo_rsn_cd = $o_slo_rsn_cd;
		/** SORT_NO:見積受注理由ＣＤ */
		protected static final MCNumber $sn_slo_rsn_cd = new MCNumber(20);
		/** SORT:受注取消ソート順 */
		public static final String $s_slo_can_sort_seq = $o_slo_can_sort_seq;
		/** SORT_NO:受注取消ソート順 */
		protected static final MCNumber $sn_slo_can_sort_seq = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0041";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_rsn_cd);
					add($o_slo_rsn_nm);
					add($o_slo_can_sort_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_rsn_cd, $v_slo_rsn_cd);
					put($vn_slo_rsn_nm, $v_slo_rsn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_rsn_cd, $s_slo_rsn_cd, ASC);
					put($sn_slo_can_sort_seq, $s_slo_can_sort_seq, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloCanRsnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloCanRsnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloCanRsnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloCanRsnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloCanRsnCols extends MSUAC_List.SloCanRsnCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtnRsltRsn:カラム名クラス
	  */
	protected static class QtnRsltRsnCols_MC_A  {
		/** OUT:見積受注理由ＣＤ */
		public static final String $o_slo_rsn_cd = "slo_rsn_cd";
		/** OUT:見積受注理由名 */
		public static final String $o_slo_rsn_nm = "slo_rsn_nm";
		/** OUT:見積結果ソート順 */
		public static final String $o_qtn_rslt_sort_seq = "qtn_rslt_sort_seq";
		/** VIEW:見積受注理由ＣＤ */
		public static final String $v_slo_rsn_cd = $o_slo_rsn_cd;
		/** VIEW_NO:見積受注理由ＣＤ */
		protected static final MCNumber $vn_slo_rsn_cd = new MCNumber(10);
		/** VIEW:見積受注理由名 */
		public static final String $v_slo_rsn_nm = $o_slo_rsn_nm;
		/** VIEW_NO:見積受注理由名 */
		protected static final MCNumber $vn_slo_rsn_nm = new MCNumber(20);
		/** SORT:見積受注理由ＣＤ */
		public static final String $s_slo_rsn_cd = $o_slo_rsn_cd;
		/** SORT_NO:見積受注理由ＣＤ */
		protected static final MCNumber $sn_slo_rsn_cd = new MCNumber(20);
		/** SORT:見積結果ソート順 */
		public static final String $s_qtn_rslt_sort_seq = $o_qtn_rslt_sort_seq;
		/** SORT_NO:見積結果ソート順 */
		protected static final MCNumber $sn_qtn_rslt_sort_seq = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0042";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_rsn_cd);
					add($o_slo_rsn_nm);
					add($o_qtn_rslt_sort_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_rsn_cd, $v_slo_rsn_cd);
					put($vn_slo_rsn_nm, $v_slo_rsn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_rsn_cd, $s_slo_rsn_cd, ASC);
					put($sn_qtn_rslt_sort_seq, $s_qtn_rslt_sort_seq, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QtnRsltRsnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QtnRsltRsnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QtnRsltRsnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QtnRsltRsnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtnRsltRsnCols extends MSUAC_List.QtnRsltRsnCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtnTerm:カラム名クラス
	  */
	protected static class QtnTermCols_MC_A  {
		/** OUT:見積受注理由ＣＤ */
		public static final String $o_slo_rsn_cd = "slo_rsn_cd";
		/** OUT:見積受注理由名 */
		public static final String $o_slo_rsn_nm = "slo_rsn_nm";
		/** OUT:見積条件ソート順 */
		public static final String $o_qtn_term_sort_seq = "qtn_term_sort_seq";
		/** VIEW:見積受注理由ＣＤ */
		public static final String $v_slo_rsn_cd = $o_slo_rsn_cd;
		/** VIEW_NO:見積受注理由ＣＤ */
		protected static final MCNumber $vn_slo_rsn_cd = new MCNumber(10);
		/** VIEW:見積受注理由名 */
		public static final String $v_slo_rsn_nm = $o_slo_rsn_nm;
		/** VIEW_NO:見積受注理由名 */
		protected static final MCNumber $vn_slo_rsn_nm = new MCNumber(20);
		/** SORT:見積受注理由ＣＤ */
		public static final String $s_slo_rsn_cd = $o_slo_rsn_cd;
		/** SORT_NO:見積受注理由ＣＤ */
		protected static final MCNumber $sn_slo_rsn_cd = new MCNumber(20);
		/** SORT:見積条件ソート順 */
		public static final String $s_qtn_term_sort_seq = $o_qtn_term_sort_seq;
		/** SORT_NO:見積条件ソート順 */
		protected static final MCNumber $sn_qtn_term_sort_seq = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0043";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_rsn_cd);
					add($o_slo_rsn_nm);
					add($o_qtn_term_sort_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_rsn_cd, $v_slo_rsn_cd);
					put($vn_slo_rsn_nm, $v_slo_rsn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_rsn_cd, $s_slo_rsn_cd, ASC);
					put($sn_qtn_term_sort_seq, $s_qtn_term_sort_seq, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QtnTermCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QtnTermCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QtnTermCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QtnTermCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtnTermCols extends MSUAC_List.QtnTermCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtnSloRsn:カラム名クラス
	  */
	protected static class QtnSloRsnCols_MC_A  {
		/** OUT:見積受注理由ＣＤ */
		public static final String $o_slo_rsn_cd = "slo_rsn_cd";
		/** OUT:見積受注理由名 */
		public static final String $o_slo_rsn_nm = "slo_rsn_nm";
		/** VIEW:見積受注理由ＣＤ */
		public static final String $v_slo_rsn_cd = $o_slo_rsn_cd;
		/** VIEW_NO:見積受注理由ＣＤ */
		protected static final MCNumber $vn_slo_rsn_cd = new MCNumber(10);
		/** VIEW:見積受注理由名 */
		public static final String $v_slo_rsn_nm = $o_slo_rsn_nm;
		/** VIEW_NO:見積受注理由名 */
		protected static final MCNumber $vn_slo_rsn_nm = new MCNumber(20);
		/** SORT:見積受注理由ＣＤ */
		public static final String $s_slo_rsn_cd = $o_slo_rsn_cd;
		/** SORT_NO:見積受注理由ＣＤ */
		protected static final MCNumber $sn_slo_rsn_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0020";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_rsn_cd);
					add($o_slo_rsn_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_rsn_cd, $v_slo_rsn_cd);
					put($vn_slo_rsn_nm, $v_slo_rsn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_rsn_cd, $s_slo_rsn_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QtnSloRsnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QtnSloRsnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QtnSloRsnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QtnSloRsnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtnSloRsnCols extends MSUAC_List.QtnSloRsnCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsBdgGrp:カラム名クラス
	  */
	protected static class SlsBdgGrpCols_MC_A  {
		/** IN:検索可能ＦＬＧ */
		public static final String $i_rd_flg = "rd_flg";
		/** IN:部門ＦＬＧ */
		public static final String $i_dpt_flg = "dpt_flg";
		/** IN:品目体系ＦＬＧ */
		public static final String $i_itm_grp_flg = "itm_grp_flg";
		/** OUT:予算分類 */
		public static final String $o_sls_bdg_grp = "sls_bdg_grp";
		/** VIEW:予算分類 */
		public static final String $v_sls_bdg_grp = $o_sls_bdg_grp;
		/** VIEW_NO:予算分類 */
		protected static final MCNumber $vn_sls_bdg_grp = new MCNumber(10);
		/** SORT:予算分類 */
		public static final String $s_sls_bdg_grp = $o_sls_bdg_grp;
		/** SORT_NO:予算分類 */
		protected static final MCNumber $sn_sls_bdg_grp = new MCNumber(10);
		/** OTHER: */
		public static final String $p_chk_msg = "MSBBL0037";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_bdg_grp);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_bdg_grp, $v_sls_bdg_grp);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_bdg_grp, $s_sls_bdg_grp, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsBdgGrpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsBdgGrpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsBdgGrpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsBdgGrpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsBdgGrpCols extends MSUAC_List.SlsBdgGrpCols_MC_A {
		//EIクラス
	}


	/** 
	  * WrkSts:カラム名クラス
	  */
	protected static class WrkStsCols_MC_A  {
		/** OUT:案件管理ＣＤ */
		public static final String $o_wrk_mng_cd = "wrk_mng_cd";
		/** OUT:案件管理名 */
		public static final String $o_wrk_mng_nm = "wrk_mng_nm";
		/** VIEW:案件管理ＣＤ */
		public static final String $v_wrk_mng_cd = $o_wrk_mng_cd;
		/** VIEW_NO:案件管理ＣＤ */
		protected static final MCNumber $vn_wrk_mng_cd = new MCNumber(10);
		/** VIEW:案件管理名 */
		public static final String $v_wrk_mng_nm = $o_wrk_mng_nm;
		/** VIEW_NO:案件管理名 */
		protected static final MCNumber $vn_wrk_mng_nm = new MCNumber(20);
		/** SORT:案件管理ＣＤ */
		public static final String $s_wrk_mng_cd = $o_wrk_mng_cd;
		/** SORT_NO:案件管理ＣＤ */
		protected static final MCNumber $sn_wrk_mng_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0038";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_mng_cd);
					add($o_wrk_mng_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_mng_cd, $v_wrk_mng_cd);
					put($vn_wrk_mng_nm, $v_wrk_mng_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_mng_cd, $s_wrk_mng_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WrkStsCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WrkStsCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WrkStsCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WrkStsCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WrkStsCols extends MSUAC_List.WrkStsCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloAcc:カラム名クラス
	  */
	protected static class SloAccCols_MC_A  {
		/** OUT:案件管理ＣＤ */
		public static final String $o_wrk_mng_cd = "wrk_mng_cd";
		/** OUT:案件管理名 */
		public static final String $o_wrk_mng_nm = "wrk_mng_nm";
		/** VIEW:案件管理ＣＤ */
		public static final String $v_wrk_mng_cd = $o_wrk_mng_cd;
		/** VIEW_NO:案件管理ＣＤ */
		protected static final MCNumber $vn_wrk_mng_cd = new MCNumber(10);
		/** VIEW:案件管理名 */
		public static final String $v_wrk_mng_nm = $o_wrk_mng_nm;
		/** VIEW_NO:案件管理名 */
		protected static final MCNumber $vn_wrk_mng_nm = new MCNumber(20);
		/** SORT:案件管理ＣＤ */
		public static final String $s_wrk_mng_cd = $o_wrk_mng_cd;
		/** SORT_NO:案件管理ＣＤ */
		protected static final MCNumber $sn_wrk_mng_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0039";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_mng_cd);
					add($o_wrk_mng_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_mng_cd, $v_wrk_mng_cd);
					put($vn_wrk_mng_nm, $v_wrk_mng_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_mng_cd, $s_wrk_mng_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloAccCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloAccCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloAccCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloAccCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloAccCols extends MSUAC_List.SloAccCols_MC_A {
		//EIクラス
	}


	/** 
	  * ActSts:カラム名クラス
	  */
	protected static class ActStsCols_MC_A  {
		/** OUT:案件管理ＣＤ */
		public static final String $o_wrk_mng_cd = "wrk_mng_cd";
		/** OUT:案件管理名 */
		public static final String $o_wrk_mng_nm = "wrk_mng_nm";
		/** VIEW:案件管理ＣＤ */
		public static final String $v_wrk_mng_cd = $o_wrk_mng_cd;
		/** VIEW_NO:案件管理ＣＤ */
		protected static final MCNumber $vn_wrk_mng_cd = new MCNumber(10);
		/** VIEW:案件管理名 */
		public static final String $v_wrk_mng_nm = $o_wrk_mng_nm;
		/** VIEW_NO:案件管理名 */
		protected static final MCNumber $vn_wrk_mng_nm = new MCNumber(20);
		/** SORT:案件管理ＣＤ */
		public static final String $s_wrk_mng_cd = $o_wrk_mng_cd;
		/** SORT_NO:案件管理ＣＤ */
		protected static final MCNumber $sn_wrk_mng_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0040";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_mng_cd);
					add($o_wrk_mng_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_mng_cd, $v_wrk_mng_cd);
					put($vn_wrk_mng_nm, $v_wrk_mng_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_mng_cd, $s_wrk_mng_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ActStsCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ActStsCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ActStsCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ActStsCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ActStsCols extends MSUAC_List.ActStsCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloLoc:カラム名クラス
	  */
	protected static class SloLocCols_MC_A  {
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:納品先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:配送先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:売上部門ＣＤ */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** IN:基準日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** OUT:受注場所ＣＤ */
		public static final String $o_loc_cd = "loc_cd";
		/** OUT:受注場所名 */
		public static final String $o_loc_nm = "loc_nm";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:納品先ＣＤ（存在チェック用） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:配送先ＣＤ（存在チェック用） */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:売上部門ＣＤ（存在チェック用） */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:基準日（存在チェック用） */
		public static final String $o_base_dt = "base_dt";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** VIEW:受注場所ＣＤ */
		public static final String $v_loc_cd = $o_loc_cd;
		/** VIEW_NO:受注場所ＣＤ */
		protected static final MCNumber $vn_loc_cd = new MCNumber(10);
		/** VIEW:受注場所名 */
		public static final String $v_loc_nm = $o_loc_nm;
		/** VIEW_NO:受注場所名 */
		protected static final MCNumber $vn_loc_nm = new MCNumber(20);
		/** SORT:受注場所ＣＤ */
		public static final String $s_loc_cd = $o_loc_cd;
		/** SORT_NO:受注場所ＣＤ */
		protected static final MCNumber $sn_loc_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0067";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_loc_cd);
					add($o_loc_nm);
					add($o_str_ln_tgt_flg);
					add($o_wg_cd);
					add($o_dlv_cd);
					add($o_tdlv_cd);
					add($o_sls_dpt_cd);
					add($o_base_dt);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_loc_cd, $v_loc_cd);
					put($vn_loc_nm, $v_loc_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_loc_cd, $s_loc_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloLocCols extends MSUAC_List.SloLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloAllocGrp:カラム名クラス
	  */
	protected static class SloAllocGrpCols_MC_A  {
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:納品先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:配送先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:売上部門ＣＤ */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** IN:基準日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** OUT:受注総量引当場所グループＣＤ */
		public static final String $o_alloc_grp_cd = "alloc_grp_cd";
		/** OUT:受注総量引当場所グループ名 */
		public static final String $o_alloc_grp_nm = "alloc_grp_nm";
		/** OUT:納品先ＣＤ（存在チェック用） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:配送先ＣＤ（存在チェック用） */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:売上部門ＣＤ（存在チェック用） */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:基準日（存在チェック用） */
		public static final String $o_base_dt = "base_dt";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** VIEW:受注総量引当場所グループＣＤ */
		public static final String $v_alloc_grp_cd = $o_alloc_grp_cd;
		/** VIEW_NO:受注総量引当場所グループＣＤ */
		protected static final MCNumber $vn_alloc_grp_cd = new MCNumber(10);
		/** VIEW:受注総量引当場所グループ名 */
		public static final String $v_alloc_grp_nm = $o_alloc_grp_nm;
		/** VIEW_NO:受注総量引当場所グループ名 */
		protected static final MCNumber $vn_alloc_grp_nm = new MCNumber(20);
		/** SORT:受注総量引当場所グループＣＤ */
		public static final String $s_alloc_grp_cd = $o_alloc_grp_cd;
		/** SORT_NO:受注総量引当場所グループＣＤ */
		protected static final MCNumber $sn_alloc_grp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0068";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_dlv_cd);
					add($o_tdlv_cd);
					add($o_sls_dpt_cd);
					add($o_base_dt);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_alloc_grp_cd, $v_alloc_grp_cd);
					put($vn_alloc_grp_nm, $v_alloc_grp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_alloc_grp_cd, $s_alloc_grp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloAllocGrpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloAllocGrpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloAllocGrpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloAllocGrpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloAllocGrpCols extends MSUAC_List.SloAllocGrpCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloLgGrp:カラム名クラス
	  */
	protected static class SloLgGrpCols_MC_A  {
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:納品先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:配送先物流グループＣＤ（サーバ側では使用されない） */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:売上部門ＣＤ */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** IN:基準日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** OUT:受注物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:受注物流グループ名 */
		public static final String $o_lg_grp_nm = "lg_grp_nm";
		/** OUT:納品先ＣＤ（存在チェック用） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:配送先ＣＤ（存在チェック用） */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:売上部門ＣＤ（存在チェック用） */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:基準日（存在チェック用） */
		public static final String $o_base_dt = "base_dt";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** VIEW:受注物流グループＣＤ */
		public static final String $v_lg_grp_cd = $o_lg_grp_cd;
		/** VIEW_NO:受注物流グループＣＤ */
		protected static final MCNumber $vn_lg_grp_cd = new MCNumber(10);
		/** VIEW:受注物流グループ名 */
		public static final String $v_lg_grp_nm = $o_lg_grp_nm;
		/** VIEW_NO:受注物流グループ名 */
		protected static final MCNumber $vn_lg_grp_nm = new MCNumber(20);
		/** SORT:受注物流グループＣＤ */
		public static final String $s_lg_grp_cd = $o_lg_grp_cd;
		/** SORT_NO:受注物流グループＣＤ */
		protected static final MCNumber $sn_lg_grp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0069";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_dlv_cd);
					add($o_tdlv_cd);
					add($o_sls_dpt_cd);
					add($o_base_dt);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_lg_grp_cd, $v_lg_grp_cd);
					put($vn_lg_grp_nm, $v_lg_grp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_lg_grp_cd, $s_lg_grp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloLgGrpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloLgGrpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloLgGrpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloLgGrpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloLgGrpCols extends MSUAC_List.SloLgGrpCols_MC_A {
		//EIクラス
	}


	/** 
	  * CstSloStkGd:カラム名クラス
	  */
	protected static class CstSloStkGdCols_MC_A  {
		/** IN:得意先ＣＤ（必須） */
		public static final String $i_cst_cd = "cst_cd";
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** OUT:格付ＣＤ */
		public static final String $o_gd_cd = "gd_cd";
		/** OUT:格付名 */
		public static final String $o_gd_nm = "gd_nm";
		/** OUT:ソート順 */
		public static final String $o_sort_seq = "sort_seq";
		/** OUT:得意先ＣＤ（存在チェック用） */
		public static final String $o_cst_cd = "cst_cd";
		/** OUT:納品先ＣＤ（存在チェック用） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** VIEW:格付ＣＤ */
		public static final String $v_gd_cd = $o_gd_cd;
		/** VIEW_NO:格付ＣＤ */
		protected static final MCNumber $vn_gd_cd = new MCNumber(10);
		/** VIEW:格付名 */
		public static final String $v_gd_nm = $o_gd_nm;
		/** VIEW_NO:格付名 */
		protected static final MCNumber $vn_gd_nm = new MCNumber(20);
		/** SORT:ソート順 */
		public static final String $s_sort_seq = $o_sort_seq;
		/** SORT_NO:ソート順 */
		protected static final MCNumber $sn_sort_seq = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0086";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "cst_cd";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_gd_cd);
					add($o_gd_nm);
					add($o_sort_seq);
					add($o_cst_cd);
					add($o_dlv_cd);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_gd_cd, $v_gd_cd);
					put($vn_gd_nm, $v_gd_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sort_seq, $s_sort_seq, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CstSloStkGdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CstSloStkGdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CstSloStkGdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CstSloStkGdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CstSloStkGdCols extends MSUAC_List.CstSloStkGdCols_MC_A {
		//EIクラス
	}


	/** 
	  * SplnVers:カラム名クラス
	  */
	protected static class SplnVersCols_MC_A  {
		/** IN:計画年月 */
		public static final String $i_ym = "ym";
		/** IN:部門ＣＤ */
		public static final String $i_dpt_cd = "dpt_cd";
		/** IN:得意先ＣＤ */
		public static final String $i_cst_cd = "cst_cd";
		/** IN:案件ＮＯ */
		public static final String $i_wrk_no = "wrk_no";
		/** IN:除外バージョン */
		public static final String $i_excluded_vers = "excluded_vers";
		/** OUT:バージョン */
		public static final String $o_spln_vers = "spln_vers";
		/** VIEW:バージョン */
		public static final String $v_spln_vers = $o_spln_vers;
		/** VIEW_NO:バージョン */
		protected static final MCNumber $vn_spln_vers = new MCNumber(10);
		/** SORT:バージョン */
		public static final String $s_spln_vers = $o_spln_vers;
		/** SORT_NO:バージョン */
		protected static final MCNumber $sn_spln_vers = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_spln_vers);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_spln_vers, $v_spln_vers);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_spln_vers, $s_spln_vers, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SplnVersCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SplnVersCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SplnVersCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SplnVersCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SplnVersCols extends MSUAC_List.SplnVersCols_MC_A {
		//EIクラス
	}


	/** 
	  * DmndLoc:カラム名クラス
	  */
	protected static class DmndLocCols_MC_A  {
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:売上部門ＣＤ */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** IN:基準日 */
		public static final String $i_dt = "dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** OUT:需要場所ＣＤ */
		public static final String $o_loc_cd = "loc_cd";
		/** OUT:需要場所名 */
		public static final String $o_loc_nm = "loc_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
		/** OUT:ＷＧＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:ＷＧ名 */
		public static final String $o_wg_nm = "wg_nm";
		/** OUT:物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:物流グループ名 */
		public static final String $o_lg_grp_nm = "lg_grp_nm";
		/** OUT:総量引当場所グループＣＤ */
		public static final String $o_alloc_grp_cd = "alloc_grp_cd";
		/** OUT:総量引当場所グループ名 */
		public static final String $o_alloc_grp_nm = "alloc_grp_nm";
		/** OUT:製造場所グループＣＤ */
		public static final String $o_loc_grp_cd = "loc_grp_cd";
		/** OUT:製造場所グループ名 */
		public static final String $o_loc_grp_nm = "loc_grp_nm";
		/** OUT:納品先ＣＤ（存在チェック用） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:配送先ＣＤ（存在チェック用） */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:売上部門ＣＤ（存在チェック用） */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:基準日（存在チェック用） */
		public static final String $o_dt = "dt";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** VIEW:需要場所ＣＤ */
		public static final String $v_loc_cd = $o_loc_cd;
		/** VIEW_NO:需要場所ＣＤ */
		protected static final MCNumber $vn_loc_cd = new MCNumber(10);
		/** VIEW:需要場所名 */
		public static final String $v_loc_nm = $o_loc_nm;
		/** VIEW_NO:需要場所名 */
		protected static final MCNumber $vn_loc_nm = new MCNumber(20);
		/** SORT:需要場所ＣＤ */
		public static final String $s_loc_cd = $o_loc_cd;
		/** SORT_NO:需要場所ＣＤ */
		protected static final MCNumber $sn_loc_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0174";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_loc_cd);
					add($o_loc_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_wg_cd);
					add($o_wg_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
					add($o_dlv_cd);
					add($o_tdlv_cd);
					add($o_sls_dpt_cd);
					add($o_dt);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_loc_cd, $v_loc_cd);
					put($vn_loc_nm, $v_loc_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_loc_cd, $s_loc_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DmndLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DmndLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DmndLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DmndLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DmndLocCols extends MSUAC_List.DmndLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloItmSub1:カラム名クラス
	  */
	protected static class SloItmSub1Cols_MC_A  {
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:リリースＦＬＧ.オン */
		public static final String $i_release_flg_on = "release_flg_on";
		/** IN:リリースＦＬＧ.オフ */
		public static final String $i_release_flg_off = "release_flg_off";
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:適用日 */
		public static final String $i_dt = "dt";
		/** IN:取引パタン区分 */
		public static final String $i_trd_ptn_typ = "trd_ptn_typ";
		/** IN:納品先ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cd = "hdr_dlv_cd";
		/** IN:納品先名（ヘッダ） */
		public static final String $i_hdr_dlv_nm = "hdr_dlv_nm";
		/** IN:納品先諸口（ヘッダ） */
		public static final String $i_hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
		/** IN:価格印字（ヘッダ） */
		public static final String $i_hdr_pri_prnt_flg = "hdr_pri_prnt_flg";
		/** IN:納品先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_cd = "hdr_dlv_lg_grp_cd";
		/** IN:納品先物流グループ名（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_nm = "hdr_dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_cd = "hdr_dlv_cntry_cd";
		/** IN:納品先国名（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_nm = "hdr_dlv_cntry_nm";
		/** IN:納品先郵便番号（ヘッダ） */
		public static final String $i_hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
		/** IN:納品先住所１（ヘッダ） */
		public static final String $i_hdr_dlv_addr1 = "hdr_dlv_addr1";
		/** IN:納品先住所２（ヘッダ） */
		public static final String $i_hdr_dlv_addr2 = "hdr_dlv_addr2";
		/** IN:納品先住所３（ヘッダ） */
		public static final String $i_hdr_dlv_addr3 = "hdr_dlv_addr3";
		/** IN:納品先住所４（ヘッダ） */
		public static final String $i_hdr_dlv_addr4 = "hdr_dlv_addr4";
		/** IN:納品先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_dlv_tel = "hdr_dlv_tel";
		/** IN:納品先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_dlv_fax = "hdr_dlv_fax";
		/** IN:納品先部署（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
		/** IN:納品先担当者（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ（ヘッダ） */
		public static final String $i_hdr_prnt_lcl_cd = "hdr_prnt_lcl_cd";
		/** IN:仕向先ＣＤ１（ヘッダ） */
		public static final String $i_hdr_dest_cd1 = "hdr_dest_cd1";
		/** IN:仕向先１名（ヘッダ） */
		public static final String $i_hdr_dest_nm1 = "hdr_dest_nm1";
		/** IN:仕向先ＣＤ２（ヘッダ） */
		public static final String $i_hdr_dest_cd2 = "hdr_dest_cd2";
		/** IN:仕向先２名（ヘッダ） */
		public static final String $i_hdr_dest_nm2 = "hdr_dest_nm2";
		/** IN:仕向先ＣＤ３（ヘッダ） */
		public static final String $i_hdr_dest_cd3 = "hdr_dest_cd3";
		/** IN:仕向先３名（ヘッダ） */
		public static final String $i_hdr_dest_nm3 = "hdr_dest_nm3";
		/** IN:配送先ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cd = "hdr_tdlv_cd";
		/** IN:配送先名（ヘッダ） */
		public static final String $i_hdr_tdlv_nm = "hdr_tdlv_nm";
		/** IN:配送先諸口（ヘッダ） */
		public static final String $i_hdr_tdlv_sundry_flg = "hdr_tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_cd = "hdr_tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_nm = "hdr_tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_cd = "hdr_tdlv_cntry_cd";
		/** IN:配送先国名（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_nm = "hdr_tdlv_cntry_nm";
		/** IN:配送先郵便番号（ヘッダ） */
		public static final String $i_hdr_tdlv_zip_cd = "hdr_tdlv_zip_cd";
		/** IN:配送先住所１（ヘッダ） */
		public static final String $i_hdr_tdlv_addr1 = "hdr_tdlv_addr1";
		/** IN:配送先住所２（ヘッダ） */
		public static final String $i_hdr_tdlv_addr2 = "hdr_tdlv_addr2";
		/** IN:配送先住所３（ヘッダ） */
		public static final String $i_hdr_tdlv_addr3 = "hdr_tdlv_addr3";
		/** IN:配送先住所４（ヘッダ） */
		public static final String $i_hdr_tdlv_addr4 = "hdr_tdlv_addr4";
		/** IN:配送先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_tdlv_tel = "hdr_tdlv_tel";
		/** IN:配送先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_tdlv_fax = "hdr_tdlv_fax";
		/** IN:配送先部署（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_dpt = "hdr_tdlv_cntct_dpt";
		/** IN:配送先担当者（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_psn = "hdr_tdlv_cntct_psn";
		/** IN:配送先経由区分（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ = "hdr_via_dlv_typ";
		/** IN:配送先経由区分名（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ_nm = "hdr_via_dlv_typ_nm";
		/** IN:配送先必須（ヘッダ） */
		public static final String $i_hdr_tdlv_req_flg = "hdr_tdlv_req_flg";
		/** IN:売上計上区分 */
		public static final String $i_sls_basis_typ = "sls_basis_typ";
		/** IN:ワーキンググループＣＤ（ヘッダ） */
		public static final String $i_hdr_wg_cd = "hdr_wg_cd";
		/** IN:取引通貨ＣＤ */
		public static final String $i_trd_cur_cd = "trd_cur_cd";
		/** IN:基準通貨ＣＤ */
		public static final String $i_base_cur_cd = "base_cur_cd";
		/** IN:納税通貨ＣＤ */
		public static final String $i_ptax_cur_cd = "ptax_cur_cd";
		/** IN:得意先インボイス取引 */
		public static final String $i_cst_iv_flg = "cst_iv_flg";
		/** IN:請求繰越回数 */
		public static final String $i_cst_bill_crryovr_times = "cst_bill_crryovr_times";
		/** IN:販売単価取得区分（ヘッダ） */
		public static final String $i_hdr_sls_upri_req_typ = "hdr_sls_upri_req_typ";
		/** IN:出荷予定分割区分（ヘッダ） */
		public static final String $i_hdr_ship_schd_split_typ = "hdr_ship_schd_split_typ";
		/** IN:品揃区分 */
		public static final String $i_assort_typ = "assort_typ";
		/** IN:インボイスＮＯ */
		public static final String $i_iv_no = "iv_no";
		/** IN:自動 */
		public static final String $i_iv_num_flg = "iv_num_flg";
		/** IN:出荷希望日（ヘッダ） */
		public static final String $i_hdr_ship_rqst_dt = "hdr_ship_rqst_dt";
		/** IN:出荷希望時刻（ヘッダ） */
		public static final String $i_hdr_ship_rqst_hm = "hdr_ship_rqst_hm";
		/** IN:納入希望日（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_dt = "hdr_dlv_rqst_dt";
		/** IN:納入希望時刻（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_hm = "hdr_dlv_rqst_hm";
		/** IN:曜日区分（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ = "hdr_dlv_day_week_typ";
		/** IN:着曜日（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ_nm = "hdr_dlv_day_week_typ_nm";
		/** IN:貸出 */
		public static final String $i_vmi_flg = "vmi_flg";
		/** IN:取引単位数量 */
		public static final String $i_trd_unit_qty = "trd_unit_qty";
		/** IN:取引通貨単価 */
		public static final String $i_trd_cur_upri = "trd_cur_upri";
		/** IN:税ＣＤ */
		public static final String $i_tax_cd = "tax_cd";
		/** IN:税名 */
		public static final String $i_tax_nm = "tax_nm";
		/** IN:税率 */
		public static final String $i_tax_rate = "tax_rate";
		/** IN:税区分 */
		public static final String $i_tax_typ = "tax_typ";
		/** IN:内税 */
		public static final String $i_inc_tax_flg = "inc_tax_flg";
		/** IN:値引理由ＣＤ */
		public static final String $i_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** IN:値引理由名 */
		public static final String $i_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** IN:原価単価 */
		public static final String $i_cost_upri = "cost_upri";
		/** IN:請求繰越回数 */
		public static final String $i_bill_crryovr_times = "bill_crryovr_times";
		/** IN:品揃グループＮＯ */
		public static final String $i_set_itm_grp_no = "set_itm_grp_no";
		/** IN:出荷希望日 */
		public static final String $i_ship_rqst_dt = "ship_rqst_dt";
		/** IN:出荷希望日編集可否 */
		public static final String $i_is_editable_ship_rqst_dt = "is_editable_ship_rqst_dt";
		/** IN:出荷希望時刻 */
		public static final String $i_ship_rqst_hm = "ship_rqst_hm";
		/** IN:出荷希望時刻編集可否 */
		public static final String $i_is_editable_ship_rqst_hm = "is_editable_ship_rqst_hm";
		/** IN:納入希望日 */
		public static final String $i_dlv_rqst_dt = "dlv_rqst_dt";
		/** IN:納入希望日編集可否 */
		public static final String $i_is_editable_dlv_rqst_dt = "is_editable_dlv_rqst_dt";
		/** IN:納入希望時刻 */
		public static final String $i_dlv_rqst_hm = "dlv_rqst_hm";
		/** IN:納入希望時刻編集可否 */
		public static final String $i_is_editable_dlv_rqst_hm = "is_editable_dlv_rqst_hm";
		/** IN:曜日区分 */
		public static final String $i_dlv_day_week_typ = "dlv_day_week_typ";
		/** IN:着曜日 */
		public static final String $i_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** IN:着曜日編集可否 */
		public static final String $i_is_editable_dlv_day_week_typ_nm = "is_editable_dlv_day_week_typ_nm";
		/** IN:売上予定日 */
		public static final String $i_sls_schd_dt = "sls_schd_dt";
		/** IN:納品先ＣＤ編集可否 */
		public static final String $i_is_editable_dlv_cd = "is_editable_dlv_cd";
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:納品先名 */
		public static final String $i_dlv_nm = "dlv_nm";
		/** IN:納品先諸口 */
		public static final String $i_dlv_sundry_flg = "dlv_sundry_flg";
		/** IN:価格印字 */
		public static final String $i_pri_prnt_flg = "pri_prnt_flg";
		/** IN:納品先物流グループＣＤ */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:納品先物流グループ名 */
		public static final String $i_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ */
		public static final String $i_dlv_cntry_cd = "dlv_cntry_cd";
		/** IN:納品先国名 */
		public static final String $i_dlv_cntry_nm = "dlv_cntry_nm";
		/** IN:納品先郵便番号 */
		public static final String $i_dlv_zip_cd = "dlv_zip_cd";
		/** IN:納品先住所１ */
		public static final String $i_dlv_addr1 = "dlv_addr1";
		/** IN:納品先住所２ */
		public static final String $i_dlv_addr2 = "dlv_addr2";
		/** IN:納品先住所３ */
		public static final String $i_dlv_addr3 = "dlv_addr3";
		/** IN:納品先住所４ */
		public static final String $i_dlv_addr4 = "dlv_addr4";
		/** IN:納品先ＴＥＬ */
		public static final String $i_dlv_tel = "dlv_tel";
		/** IN:納品先ＦＡＸ */
		public static final String $i_dlv_fax = "dlv_fax";
		/** IN:納品先部署 */
		public static final String $i_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** IN:納品先担当者 */
		public static final String $i_dlv_cntct_psn = "dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ */
		public static final String $i_prnt_lcl_cd = "prnt_lcl_cd";
		/** IN:配送先必須 */
		public static final String $i_tdlv_req_flg = "tdlv_req_flg";
		/** IN:仕向先ＣＤ１編集可否 */
		public static final String $i_is_editable_dest_cd1 = "is_editable_dest_cd1";
		/** IN:仕向先ＣＤ１ */
		public static final String $i_dest_cd1 = "dest_cd1";
		/** IN:仕向先１名 */
		public static final String $i_dest_nm1 = "dest_nm1";
		/** IN:仕向先ＣＤ２編集可否 */
		public static final String $i_is_editable_dest_cd2 = "is_editable_dest_cd2";
		/** IN:仕向先ＣＤ２ */
		public static final String $i_dest_cd2 = "dest_cd2";
		/** IN:仕向先２名 */
		public static final String $i_dest_nm2 = "dest_nm2";
		/** IN:仕向先ＣＤ３編集可否 */
		public static final String $i_is_editable_dest_cd3 = "is_editable_dest_cd3";
		/** IN:仕向先ＣＤ３ */
		public static final String $i_dest_cd3 = "dest_cd3";
		/** IN:仕向先３名 */
		public static final String $i_dest_nm3 = "dest_nm3";
		/** IN:配送先ＣＤ編集可否 */
		public static final String $i_is_editable_tdlv_cd = "is_editable_tdlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:配送先名 */
		public static final String $i_tdlv_nm = "tdlv_nm";
		/** IN:配送先諸口 */
		public static final String $i_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名 */
		public static final String $i_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ */
		public static final String $i_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** IN:配送先国名 */
		public static final String $i_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** IN:配送先郵便番号 */
		public static final String $i_tdlv_zip_cd = "tdlv_zip_cd";
		/** IN:配送先住所１ */
		public static final String $i_tdlv_addr1 = "tdlv_addr1";
		/** IN:配送先住所２ */
		public static final String $i_tdlv_addr2 = "tdlv_addr2";
		/** IN:配送先住所３ */
		public static final String $i_tdlv_addr3 = "tdlv_addr3";
		/** IN:配送先住所４ */
		public static final String $i_tdlv_addr4 = "tdlv_addr4";
		/** IN:配送先ＴＥＬ */
		public static final String $i_tdlv_tel = "tdlv_tel";
		/** IN:配送先ＦＡＸ */
		public static final String $i_tdlv_fax = "tdlv_fax";
		/** IN:配送先部署 */
		public static final String $i_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** IN:配送先担当者 */
		public static final String $i_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** IN:配送先経由区分 */
		public static final String $i_via_dlv_typ = "via_dlv_typ";
		/** IN:配送先経由区分名 */
		public static final String $i_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** IN:預り売上 */
		public static final String $i_sls_cststk_flg = "sls_cststk_flg";
		/** IN:手配区分 */
		public static final String $i_proc_typ = "proc_typ";
		/** IN:分割区分 */
		public static final String $i_ship_schd_split_typ = "ship_schd_split_typ";
		/** IN:引当範囲区分 */
		public static final String $i_alloc_scope_typ = "alloc_scope_typ";
		/** IN:引当区分 */
		public static final String $i_alloc_typ = "alloc_typ";
		/** IN:販売単価取得区分 */
		public static final String $i_sls_upri_req_typ = "sls_upri_req_typ";
		/** IN:受注登録経由 */
		public static final String $i_from_slo_reg = "from_slo_reg";
		/** IN:品名不要ＦＬＧ */
		public static final String $i_sundry_itm_nm_rem_flg = "sundry_itm_nm_rem_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:品目入力補助検索区分 */
		public static final String $i_itm_is_srch_typ = "itm_is_srch_typ";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:品目別名１ */
		public static final String $o_itm_alt_nm1 = "itm_alt_nm1";
		/** OUT:品目別名２ */
		public static final String $o_itm_alt_nm2 = "itm_alt_nm2";
		/** OUT:品目別名３ */
		public static final String $o_itm_alt_nm3 = "itm_alt_nm3";
		/** OUT:品目別名４ */
		public static final String $o_itm_alt_nm4 = "itm_alt_nm4";
		/** OUT:品目区分 */
		public static final String $o_itm_typ = "itm_typ";
		/** OUT:品目区分名 */
		public static final String $o_itm_typ_nm = "itm_typ_nm";
		/** OUT:品目区分詳細ＣＤ */
		public static final String $o_itm_typ_d_cd = "itm_typ_d_cd";
		/** OUT:品目区分詳細名 */
		public static final String $o_itm_typ_d_nm = "itm_typ_d_nm";
		/** OUT:在庫管理区分 */
		public static final String $o_stk_mng_typ = "stk_mng_typ";
		/** OUT:在庫管理区分名 */
		public static final String $o_stk_mng_typ_nm = "stk_mng_typ_nm";
		/** OUT:資産管理区分 */
		public static final String $o_asset_mng_typ = "asset_mng_typ";
		/** OUT:資産管理区分名 */
		public static final String $o_asset_mng_typ_nm = "asset_mng_typ_nm";
		/** OUT:諸口品ＦＬＧ */
		public static final String $o_sundry_itm_flg = "sundry_itm_flg";
		/** OUT:品目分類ＣＤ１ */
		public static final String $o_itm_grp_cd1 = "itm_grp_cd1";
		/** OUT:品目分類名１ */
		public static final String $o_itm_grp_nm1 = "itm_grp_nm1";
		/** OUT:品目分類ＣＤ２ */
		public static final String $o_itm_grp_cd2 = "itm_grp_cd2";
		/** OUT:品目分類名２ */
		public static final String $o_itm_grp_nm2 = "itm_grp_nm2";
		/** OUT:品目分類ＣＤ３ */
		public static final String $o_itm_grp_cd3 = "itm_grp_cd3";
		/** OUT:品目分類名３ */
		public static final String $o_itm_grp_nm3 = "itm_grp_nm3";
		/** OUT:品目分類ＣＤ４ */
		public static final String $o_itm_grp_cd4 = "itm_grp_cd4";
		/** OUT:品目分類名４ */
		public static final String $o_itm_grp_nm4 = "itm_grp_nm4";
		/** OUT:品目分類ＣＤ５ */
		public static final String $o_itm_grp_cd5 = "itm_grp_cd5";
		/** OUT:品目分類名５ */
		public static final String $o_itm_grp_nm5 = "itm_grp_nm5";
		/** OUT:品目分類ＣＤ６ */
		public static final String $o_itm_grp_cd6 = "itm_grp_cd6";
		/** OUT:品目分類名６ */
		public static final String $o_itm_grp_nm6 = "itm_grp_nm6";
		/** OUT:品目分類ＣＤ７ */
		public static final String $o_itm_grp_cd7 = "itm_grp_cd7";
		/** OUT:品目分類名７ */
		public static final String $o_itm_grp_nm7 = "itm_grp_nm7";
		/** OUT:品目分類ＣＤ８ */
		public static final String $o_itm_grp_cd8 = "itm_grp_cd8";
		/** OUT:品目分類名８ */
		public static final String $o_itm_grp_nm8 = "itm_grp_nm8";
		/** OUT:品目分類ＣＤ９ */
		public static final String $o_itm_grp_cd9 = "itm_grp_cd9";
		/** OUT:品目分類名９ */
		public static final String $o_itm_grp_nm9 = "itm_grp_nm9";
		/** OUT:品目分類ＣＤ１０ */
		public static final String $o_itm_grp_cd10 = "itm_grp_cd10";
		/** OUT:品目分類名１０ */
		public static final String $o_itm_grp_nm10 = "itm_grp_nm10";
		/** OUT:リリースＦＬＧ */
		public static final String $o_release_flg = "release_flg";
		/** OUT:期間管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
		/** OUT:メモ１（共通） */
		public static final String $o_memo1_c = "memo1_c";
		/** OUT:メモ２（共通） */
		public static final String $o_memo2_c = "memo2_c";
		/** OUT:メモ３（共通） */
		public static final String $o_memo3_c = "memo3_c";
		/** OUT:メモ１ */
		public static final String $o_memo1 = "memo1";
		/** OUT:メモ２ */
		public static final String $o_memo2 = "memo2";
		/** OUT:メモ３ */
		public static final String $o_memo3 = "memo3";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:値引品目ＦＬＧ */
		public static final String $o_dscnt_itm_flg = "dscnt_itm_flg";
		/** OUT:単位ＣＤ */
		public static final String $o_unit_cd = "unit_cd";
		/** OUT:単位名 */
		public static final String $o_unit_nm = "unit_nm";
		/** OUT:小数部有効桁数 */
		public static final String $o_dec_place = "dec_place";
		/** OUT:端数処理区分 */
		public static final String $o_rnd_typ = "rnd_typ";
		/** OUT:端数処理区分名 */
		public static final String $o_rnd_typ_nm = "rnd_typ_nm";
		/** OUT:容積単位ＣＤ */
		public static final String $o_dim_unit_cd = "dim_unit_cd";
		/** OUT:容積 */
		public static final String $o_dim = "dim";
		/** OUT:重量単位ＣＤ */
		public static final String $o_wt_unit_cd = "wt_unit_cd";
		/** OUT:重量 */
		public static final String $o_wt = "wt";
		/** OUT:入り目単位ＣＤ */
		public static final String $o_conts_unit_cd = "conts_unit_cd";
		/** OUT:入り目数 */
		public static final String $o_conts_qty = "conts_qty";
		/** OUT:ＨＳ ＣＤ */
		public static final String $o_hs_cd = "hs_cd";
		/** OUT:販売品目体系ＣＤ */
		public static final String $o_sls_itm_grp_cd = "sls_itm_grp_cd";
		/** OUT:品目仕訳ＣＤ */
		public static final String $o_itm_jnl_cd = "itm_jnl_cd";
		/** OUT:会計品目分類ＣＤ */
		public static final String $o_ac_itm_grp_cd = "ac_itm_grp_cd";
		/** OUT:マイナス在庫許可ＦＬＧ */
		public static final String $o_minus_stk_flg = "minus_stk_flg";
		/** OUT:新規ロット入力不可ＦＬＧ */
		public static final String $o_not_new_lot_flg = "not_new_lot_flg";
		/** OUT:出庫引当確認ＦＬＧ */
		public static final String $o_gi_alloc_flg = "gi_alloc_flg";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
		/** OUT:出荷単位名 */
		public static final String $o_ship_unit_nm = "ship_unit_nm";
		/** OUT:出荷単位小数部有効桁数 */
		public static final String $o_ship_unit_dec_place = "ship_unit_dec_place";
		/** OUT:出荷単位分母数量 */
		public static final String $o_ship_unit_conv_base_qty = "ship_unit_conv_base_qty";
		/** OUT:出荷単位換算数量 */
		public static final String $o_ship_unit_conv_qty = "ship_unit_conv_qty";
		/** OUT:出荷単位数量 */
		public static final String $o_ship_unit_qty = "ship_unit_qty";
		/** OUT:製造単位ＣＤ */
		public static final String $o_mfg_unit_cd = "mfg_unit_cd";
		/** OUT:発注単位ＣＤ */
		public static final String $o_purc_unit_cd = "purc_unit_cd";
		/** OUT:梱包単位ＣＤ */
		public static final String $o_pckg_unit_cd = "pckg_unit_cd";
		/** OUT:荷姿引当ＦＬＧ */
		public static final String $o_pack_alloc_flg = "pack_alloc_flg";
		/** OUT:ロット管理区分 */
		public static final String $o_lot_mng_typ = "lot_mng_typ";
		/** OUT:ロット管理区分名 */
		public static final String $o_lot_mng_typ_nm = "lot_mng_typ_nm";
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番区分名 */
		public static final String $o_lot_no_typ_nm = "lot_no_typ_nm";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロット管理区分名 */
		public static final String $o_sublot_mng_typ_nm = "sublot_mng_typ_nm";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番区分名 */
		public static final String $o_sublot_no_typ_nm = "sublot_no_typ_nm";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:検査実施単位区分名 */
		public static final String $o_insp_bind_typ_nm = "insp_bind_typ_nm";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理種別 */
		public static final String $o_lmt_ctl_categ = "lmt_ctl_categ";
		/** OUT:有効成分対象ＦＬＧ */
		public static final String $o_cont_fctr_flg = "cont_fctr_flg";
		/** OUT:標準有効成分係数 */
		public static final String $o_std_cont_fctr = "std_cont_fctr";
		/** OUT:有効成分単位ＣＤ */
		public static final String $o_cont_fctr_unit_cd = "cont_fctr_unit_cd";
		/** OUT:有効成分単位名 */
		public static final String $o_cont_fctr_unit_nm = "cont_fctr_unit_nm";
		/** OUT:有効成分換算端数処理区分 */
		public static final String $o_cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
		/** OUT:有効成分換算端数処理区分名 */
		public static final String $o_cont_fctr_rnd_typ_nm = "cont_fctr_rnd_typ_nm";
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:手配ＮＯ１管理区分名 */
		public static final String $o_sno1_mng_typ_nm = "sno1_mng_typ_nm";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番区分名 */
		public static final String $o_sno1_num_typ_nm = "sno1_num_typ_nm";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:手配ＮＯ２管理区分名 */
		public static final String $o_sno2_mng_typ_nm = "sno2_mng_typ_nm";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番区分名 */
		public static final String $o_sno2_num_typ_nm = "sno2_num_typ_nm";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:手配ＮＯ３管理区分名 */
		public static final String $o_sno3_mng_typ_nm = "sno3_mng_typ_nm";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番区分名 */
		public static final String $o_sno3_num_typ_nm = "sno3_num_typ_nm";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:手配ＮＯ４管理区分名 */
		public static final String $o_sno4_mng_typ_nm = "sno4_mng_typ_nm";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番区分名 */
		public static final String $o_sno4_num_typ_nm = "sno4_num_typ_nm";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:構成パタン */
		public static final String $o_def_bom_ptn = "def_bom_ptn";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:製造指図単位区分名 */
		public static final String $o_mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
		/** OUT:ＭＲＰ処理区分名 */
		public static final String $o_mrp_proc_typ_nm = "mrp_proc_typ_nm";
		/** OUT:引当余裕日数 */
		public static final String $o_alloc_margin_days = "alloc_margin_days";
		/** OUT:ＭＲＰ引当余裕日数 */
		public static final String $o_mrp_alloc_margin_days = "mrp_alloc_margin_days";
		/** OUT:所要抑制量 */
		public static final String $o_rqmt_rstr_qty = "rqmt_rstr_qty";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:スケジューラＦＬＧ */
		public static final String $o_sch_flg = "sch_flg";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:原産地名 */
		public static final String $o_cntry_org_nm = "cntry_org_nm";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:構成・仕様管理区分名 */
		public static final String $o_comp_spec_typ_nm = "comp_spec_typ_nm";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:販売単価分類ＣＤ */
		public static final String $o_sls_upri_grp_cd = "sls_upri_grp_cd";
		/** OUT:請求繰越回数 */
		public static final String $o_itm_bill_crryovr_times = "itm_bill_crryovr_times";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
		/** OUT:受注手配区分名 */
		public static final String $o_slo_proc_typ_nm = "slo_proc_typ_nm";
		/** OUT:手配区分 */
		public static final String $o_proc_typ = "proc_typ";
		/** OUT:出荷指図区分（マスタ） */
		public static final String $o_def_ship_inst_typ = "def_ship_inst_typ";
		/** OUT:出荷指図区分名（マスタ） */
		public static final String $o_def_ship_inst_typ_nm = "def_ship_inst_typ_nm";
		/** OUT:出荷指図区分 */
		public static final String $o_ship_inst_typ = "ship_inst_typ";
		/** OUT:出荷ロット逆転禁止ＦＬＧ */
		public static final String $o_ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
		/** OUT:品目出荷グループＣＤ */
		public static final String $o_itm_ship_grp_cd = "itm_ship_grp_cd";
		/** OUT:出荷有効期限グループＣＤ */
		public static final String $o_ship_valid_grp_cd = "ship_valid_grp_cd";
		/** OUT:入荷不要ＦＬＧ */
		public static final String $o_arr_skip_flg = "arr_skip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:出荷条件名 */
		public static final String $o_ship_term_nm = "ship_term_nm";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:輸出入諸掛区分名 */
		public static final String $o_exim_xpns_typ_nm = "exim_xpns_typ_nm";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:販売単価変更許可ＦＬＧ */
		public static final String $o_sls_upri_cng_flg = "sls_upri_cng_flg";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:参照品目ＣＤ */
		public static final String $o_ref_itm_cd = "ref_itm_cd";
		/** OUT:参照枝番１ */
		public static final String $o_ref_itm_sub1 = "ref_itm_sub1";
		/** OUT:参照枝番２ */
		public static final String $o_ref_itm_sub2 = "ref_itm_sub2";
		/** OUT:参照枝番３ */
		public static final String $o_ref_itm_sub3 = "ref_itm_sub3";
		/** OUT:外部システムＮＯ */
		public static final String $o_ext_sys_no_itm = "ext_sys_no_itm";
		/** OUT:計算パタンＣＤ */
		public static final String $o_calc_ptn_cd = "calc_ptn_cd";
		/** OUT:原価基準数 */
		public static final String $o_cost_std_qty = "cost_std_qty";
		/** OUT:品目配賦グループ */
		public static final String $o_itm_alc_grp = "itm_alc_grp";
		/** OUT:販売ＦＬＧ */
		public static final String $o_sls_flg = "sls_flg";
		/** OUT:製造ＦＬＧ */
		public static final String $o_mfg_flg = "mfg_flg";
		/** OUT:購買ＦＬＧ */
		public static final String $o_purc_flg = "purc_flg";
		/** OUT:検査ＦＬＧ */
		public static final String $o_insp_flg = "insp_flg";
		/** OUT:販売設定済ＦＬＧ */
		public static final String $o_sls_input_flg = "sls_input_flg";
		/** OUT:製造設定済ＦＬＧ */
		public static final String $o_mfg_input_flg = "mfg_input_flg";
		/** OUT:購買設定済ＦＬＧ */
		public static final String $o_purc_input_flg = "purc_input_flg";
		/** OUT:検査設定済ＦＬＧ */
		public static final String $o_insp_input_flg = "insp_input_flg";
		/** OUT:所要区分 */
		public static final String $o_rqmt_typ = "rqmt_typ";
		/** OUT:所要区分名 */
		public static final String $o_rqmt_typ_nm = "rqmt_typ_nm";
		/** OUT:生産計画立案区分 */
		public static final String $o_prod_pln_typ = "prod_pln_typ";
		/** OUT:生産計画立案区分名 */
		public static final String $o_prod_pln_typ_nm = "prod_pln_typ_nm";
		/** OUT:需要日ばらし月数 */
		public static final String $o_dmnd_date_div_mons = "dmnd_date_div_mons";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:取引先品目ＣＤ */
		public static final String $o_bp_itm_cd = "bp_itm_cd";
		/** OUT:取引先品名 */
		public static final String $o_bp_itm_nm = "bp_itm_nm";
		/** OUT:貸出 */
		public static final String $o_vmi_flg = "vmi_flg";
		/** OUT:インボイス表記品名 */
		public static final String $o_iv_itm_nm = "iv_itm_nm";
		/** OUT:取引通貨単価 */
		public static final String $o_trd_cur_upri = "trd_cur_upri";
		/** OUT:税ＣＤ */
		public static final String $o_tax_cd = "tax_cd";
		/** OUT:税名 */
		public static final String $o_tax_nm = "tax_nm";
		/** OUT:税率 */
		public static final String $o_tax_rate = "tax_rate";
		/** OUT:税区分 */
		public static final String $o_tax_typ = "tax_typ";
		/** OUT:内税 */
		public static final String $o_inc_tax_flg = "inc_tax_flg";
		/** OUT:値引理由ＣＤ */
		public static final String $o_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** OUT:値引理由名 */
		public static final String $o_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** OUT:原価単価 */
		public static final String $o_cost_upri = "cost_upri";
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:請求繰越回数 */
		public static final String $o_bill_crryovr_times = "bill_crryovr_times";
		/** OUT:出荷希望日 */
		public static final String $o_ship_rqst_dt = "ship_rqst_dt";
		/** OUT:出荷希望時刻 */
		public static final String $o_ship_rqst_hm = "ship_rqst_hm";
		/** OUT:納入希望日 */
		public static final String $o_dlv_rqst_dt = "dlv_rqst_dt";
		/** OUT:納入希望時刻 */
		public static final String $o_dlv_rqst_hm = "dlv_rqst_hm";
		/** OUT:曜日区分 */
		public static final String $o_dlv_day_week_typ = "dlv_day_week_typ";
		/** OUT:着曜日 */
		public static final String $o_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** OUT:納品先ＣＤ */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:納品先名 */
		public static final String $o_dlv_nm = "dlv_nm";
		/** OUT:納品先諸口 */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:価格印字 */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:納品先物流グループＣＤ */
		public static final String $o_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** OUT:納品先物流グループ名 */
		public static final String $o_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** OUT:納品先国ＣＤ */
		public static final String $o_dlv_cntry_cd = "dlv_cntry_cd";
		/** OUT:納品先国名 */
		public static final String $o_dlv_cntry_nm = "dlv_cntry_nm";
		/** OUT:納品先郵便番号 */
		public static final String $o_dlv_zip_cd = "dlv_zip_cd";
		/** OUT:納品先住所１ */
		public static final String $o_dlv_addr1 = "dlv_addr1";
		/** OUT:納品先住所２ */
		public static final String $o_dlv_addr2 = "dlv_addr2";
		/** OUT:納品先住所３ */
		public static final String $o_dlv_addr3 = "dlv_addr3";
		/** OUT:納品先住所４ */
		public static final String $o_dlv_addr4 = "dlv_addr4";
		/** OUT:納品先ＴＥＬ */
		public static final String $o_dlv_tel = "dlv_tel";
		/** OUT:納品先ＦＡＸ */
		public static final String $o_dlv_fax = "dlv_fax";
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:配送先必須 */
		public static final String $o_tdlv_req_flg = "tdlv_req_flg";
		/** OUT:仕向先ＣＤ１ */
		public static final String $o_dest_cd1 = "dest_cd1";
		/** OUT:仕向先１名 */
		public static final String $o_dest_nm1 = "dest_nm1";
		/** OUT:仕向先ＣＤ２ */
		public static final String $o_dest_cd2 = "dest_cd2";
		/** OUT:仕向先２名 */
		public static final String $o_dest_nm2 = "dest_nm2";
		/** OUT:仕向先ＣＤ３ */
		public static final String $o_dest_cd3 = "dest_cd3";
		/** OUT:仕向先３名 */
		public static final String $o_dest_nm3 = "dest_nm3";
		/** OUT:配送先ＣＤ */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:配送先名 */
		public static final String $o_tdlv_nm = "tdlv_nm";
		/** OUT:配送先諸口 */
		public static final String $o_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** OUT:配送先物流グループＣＤ */
		public static final String $o_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** OUT:配送先物流グループ名 */
		public static final String $o_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** OUT:配送先国ＣＤ */
		public static final String $o_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** OUT:配送先国名 */
		public static final String $o_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** OUT:配送先郵便番号 */
		public static final String $o_tdlv_zip_cd = "tdlv_zip_cd";
		/** OUT:配送先住所１ */
		public static final String $o_tdlv_addr1 = "tdlv_addr1";
		/** OUT:配送先住所２ */
		public static final String $o_tdlv_addr2 = "tdlv_addr2";
		/** OUT:配送先住所３ */
		public static final String $o_tdlv_addr3 = "tdlv_addr3";
		/** OUT:配送先住所４ */
		public static final String $o_tdlv_addr4 = "tdlv_addr4";
		/** OUT:配送先ＴＥＬ */
		public static final String $o_tdlv_tel = "tdlv_tel";
		/** OUT:配送先ＦＡＸ */
		public static final String $o_tdlv_fax = "tdlv_fax";
		/** OUT:配送先部署 */
		public static final String $o_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** OUT:配送先担当者 */
		public static final String $o_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:配送先経由区分名 */
		public static final String $o_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** OUT:預り売上 */
		public static final String $o_sls_cststk_flg = "sls_cststk_flg";
		/** OUT:格付ＣＤ */
		public static final String $o_gd_cd = "gd_cd";
		/** OUT:格付名 */
		public static final String $o_gd_nm = "gd_nm";
		/** OUT:分割区分 */
		public static final String $o_ship_schd_split_typ = "ship_schd_split_typ";
		/** OUT:引当範囲区分 */
		public static final String $o_alloc_scope_typ = "alloc_scope_typ";
		/** OUT:引当区分 */
		public static final String $o_alloc_typ = "alloc_typ";
		/** OUT:販売単価取得区分 */
		public static final String $o_sls_upri_req_typ = "sls_upri_req_typ";
		/** VIEW:枝番１ */
		public static final String $v_itm_sub1 = $o_itm_sub1;
		/** VIEW_NO:枝番１ */
		protected static final MCNumber $vn_itm_sub1 = new MCNumber(10);
		/** SORT:枝番１ */
		public static final String $s_itm_sub1 = $o_itm_sub1;
		/** SORT_NO:枝番１ */
		protected static final MCNumber $sn_itm_sub1 = new MCNumber(10);
		/** OTHER:リリースＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_on = "mode_release_flg_on";
		/** OTHER:リリースＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_off = "mode_release_flg_off";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_sub1);
					add($o_itm_cd);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_itm_nm);
					add($o_itm_alt_nm1);
					add($o_itm_alt_nm2);
					add($o_itm_alt_nm3);
					add($o_itm_alt_nm4);
					add($o_itm_typ);
					add($o_itm_typ_nm);
					add($o_itm_typ_d_cd);
					add($o_itm_typ_d_nm);
					add($o_stk_mng_typ);
					add($o_stk_mng_typ_nm);
					add($o_asset_mng_typ);
					add($o_asset_mng_typ_nm);
					add($o_sundry_itm_flg);
					add($o_itm_grp_cd1);
					add($o_itm_grp_nm1);
					add($o_itm_grp_cd2);
					add($o_itm_grp_nm2);
					add($o_itm_grp_cd3);
					add($o_itm_grp_nm3);
					add($o_itm_grp_cd4);
					add($o_itm_grp_nm4);
					add($o_itm_grp_cd5);
					add($o_itm_grp_nm5);
					add($o_itm_grp_cd6);
					add($o_itm_grp_nm6);
					add($o_itm_grp_cd7);
					add($o_itm_grp_nm7);
					add($o_itm_grp_cd8);
					add($o_itm_grp_nm8);
					add($o_itm_grp_cd9);
					add($o_itm_grp_nm9);
					add($o_itm_grp_cd10);
					add($o_itm_grp_nm10);
					add($o_release_flg);
					add($o_lmt_ctl_flg);
					add($o_memo1_c);
					add($o_memo2_c);
					add($o_memo3_c);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_rnd_typ_nm);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_sls_itm_grp_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_ship_unit_cd);
					add($o_ship_unit_nm);
					add($o_ship_unit_dec_place);
					add($o_ship_unit_conv_base_qty);
					add($o_ship_unit_conv_qty);
					add($o_ship_unit_qty);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_mng_typ_nm);
					add($o_lot_no_typ);
					add($o_lot_no_typ_nm);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_mng_typ_nm);
					add($o_sublot_no_typ);
					add($o_sublot_no_typ_nm);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_insp_bind_typ_nm);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_rnd_typ_nm);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_sno1_mng_typ_nm);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_num_typ_nm);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_sno2_mng_typ_nm);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_num_typ_nm);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_sno3_mng_typ_nm);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_num_typ_nm);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_sno4_mng_typ_nm);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_num_typ_nm);
					add($o_sno4_ptn_cd);
					add($o_def_bom_ptn);
					add($o_mfg_inst_unit_typ);
					add($o_mfg_inst_unit_typ_nm);
					add($o_mrp_proc_typ);
					add($o_mrp_proc_typ_nm);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_cntry_org_cd);
					add($o_cntry_org_nm);
					add($o_comp_spec_typ);
					add($o_comp_spec_typ_nm);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_sls_upri_grp_cd);
					add($o_itm_bill_crryovr_times);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_slo_proc_typ_nm);
					add($o_proc_typ);
					add($o_def_ship_inst_typ);
					add($o_def_ship_inst_typ_nm);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_ship_term_cd);
					add($o_ship_term_nm);
					add($o_exim_xpns_typ);
					add($o_exim_xpns_typ_nm);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_sls_upri_cng_flg);
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_ref_itm_cd);
					add($o_ref_itm_sub1);
					add($o_ref_itm_sub2);
					add($o_ref_itm_sub3);
					add($o_ext_sys_no_itm);
					add($o_calc_ptn_cd);
					add($o_cost_std_qty);
					add($o_itm_alc_grp);
					add($o_sls_flg);
					add($o_mfg_flg);
					add($o_purc_flg);
					add($o_insp_flg);
					add($o_sls_input_flg);
					add($o_mfg_input_flg);
					add($o_purc_input_flg);
					add($o_insp_input_flg);
					add($o_rqmt_typ);
					add($o_rqmt_typ_nm);
					add($o_prod_pln_typ);
					add($o_prod_pln_typ_nm);
					add($o_dmnd_date_div_mons);
					add($o_mrp_opn_xfr_days);
					add($o_bp_itm_cd);
					add($o_bp_itm_nm);
					add($o_vmi_flg);
					add($o_iv_itm_nm);
					add($o_trd_cur_upri);
					add($o_tax_cd);
					add($o_tax_nm);
					add($o_tax_rate);
					add($o_tax_typ);
					add($o_inc_tax_flg);
					add($o_dscnt_rsn_cd);
					add($o_dscnt_rsn_nm);
					add($o_cost_upri);
					add($o_wtax_rate);
					add($o_bill_crryovr_times);
					add($o_ship_rqst_dt);
					add($o_ship_rqst_hm);
					add($o_dlv_rqst_dt);
					add($o_dlv_rqst_hm);
					add($o_dlv_day_week_typ);
					add($o_dlv_day_week_typ_nm);
					add($o_dlv_cd);
					add($o_dlv_nm);
					add($o_dlv_sundry_flg);
					add($o_pri_prnt_flg);
					add($o_dlv_lg_grp_cd);
					add($o_dlv_lg_grp_nm);
					add($o_dlv_cntry_cd);
					add($o_dlv_cntry_nm);
					add($o_dlv_zip_cd);
					add($o_dlv_addr1);
					add($o_dlv_addr2);
					add($o_dlv_addr3);
					add($o_dlv_addr4);
					add($o_dlv_tel);
					add($o_dlv_fax);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_prnt_lcl_cd);
					add($o_tdlv_req_flg);
					add($o_dest_cd1);
					add($o_dest_nm1);
					add($o_dest_cd2);
					add($o_dest_nm2);
					add($o_dest_cd3);
					add($o_dest_nm3);
					add($o_tdlv_cd);
					add($o_tdlv_nm);
					add($o_tdlv_sundry_flg);
					add($o_tdlv_lg_grp_cd);
					add($o_tdlv_lg_grp_nm);
					add($o_tdlv_cntry_cd);
					add($o_tdlv_cntry_nm);
					add($o_tdlv_zip_cd);
					add($o_tdlv_addr1);
					add($o_tdlv_addr2);
					add($o_tdlv_addr3);
					add($o_tdlv_addr4);
					add($o_tdlv_tel);
					add($o_tdlv_fax);
					add($o_tdlv_cntct_dpt);
					add($o_tdlv_cntct_psn);
					add($o_via_dlv_typ);
					add($o_via_dlv_typ_nm);
					add($o_sls_cststk_flg);
					add($o_gd_cd);
					add($o_gd_nm);
					add($o_ship_schd_split_typ);
					add($o_alloc_scope_typ);
					add($o_alloc_typ);
					add($o_sls_upri_req_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_sub1, $v_itm_sub1);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_sub1, $s_itm_sub1, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloItmSub1Cols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloItmSub1Cols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloItmSub1Cols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloItmSub1Cols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloItmSub1Cols extends MSUAC_List.SloItmSub1Cols_MC_A {
		//EIクラス
	}


	/** 
	  * SloItmSub2:カラム名クラス
	  */
	protected static class SloItmSub2Cols_MC_A  {
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:リリースＦＬＧ.オン */
		public static final String $i_release_flg_on = "release_flg_on";
		/** IN:リリースＦＬＧ.オフ */
		public static final String $i_release_flg_off = "release_flg_off";
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:適用日 */
		public static final String $i_dt = "dt";
		/** IN:取引パタン区分 */
		public static final String $i_trd_ptn_typ = "trd_ptn_typ";
		/** IN:納品先ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cd = "hdr_dlv_cd";
		/** IN:納品先名（ヘッダ） */
		public static final String $i_hdr_dlv_nm = "hdr_dlv_nm";
		/** IN:納品先諸口（ヘッダ） */
		public static final String $i_hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
		/** IN:価格印字（ヘッダ） */
		public static final String $i_hdr_pri_prnt_flg = "hdr_pri_prnt_flg";
		/** IN:納品先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_cd = "hdr_dlv_lg_grp_cd";
		/** IN:納品先物流グループ名（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_nm = "hdr_dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_cd = "hdr_dlv_cntry_cd";
		/** IN:納品先国名（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_nm = "hdr_dlv_cntry_nm";
		/** IN:納品先郵便番号（ヘッダ） */
		public static final String $i_hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
		/** IN:納品先住所１（ヘッダ） */
		public static final String $i_hdr_dlv_addr1 = "hdr_dlv_addr1";
		/** IN:納品先住所２（ヘッダ） */
		public static final String $i_hdr_dlv_addr2 = "hdr_dlv_addr2";
		/** IN:納品先住所３（ヘッダ） */
		public static final String $i_hdr_dlv_addr3 = "hdr_dlv_addr3";
		/** IN:納品先住所４（ヘッダ） */
		public static final String $i_hdr_dlv_addr4 = "hdr_dlv_addr4";
		/** IN:納品先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_dlv_tel = "hdr_dlv_tel";
		/** IN:納品先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_dlv_fax = "hdr_dlv_fax";
		/** IN:納品先部署（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
		/** IN:納品先担当者（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ（ヘッダ） */
		public static final String $i_hdr_prnt_lcl_cd = "hdr_prnt_lcl_cd";
		/** IN:仕向先ＣＤ１（ヘッダ） */
		public static final String $i_hdr_dest_cd1 = "hdr_dest_cd1";
		/** IN:仕向先１名（ヘッダ） */
		public static final String $i_hdr_dest_nm1 = "hdr_dest_nm1";
		/** IN:仕向先ＣＤ２（ヘッダ） */
		public static final String $i_hdr_dest_cd2 = "hdr_dest_cd2";
		/** IN:仕向先２名（ヘッダ） */
		public static final String $i_hdr_dest_nm2 = "hdr_dest_nm2";
		/** IN:仕向先ＣＤ３（ヘッダ） */
		public static final String $i_hdr_dest_cd3 = "hdr_dest_cd3";
		/** IN:仕向先３名（ヘッダ） */
		public static final String $i_hdr_dest_nm3 = "hdr_dest_nm3";
		/** IN:配送先ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cd = "hdr_tdlv_cd";
		/** IN:配送先名（ヘッダ） */
		public static final String $i_hdr_tdlv_nm = "hdr_tdlv_nm";
		/** IN:配送先諸口（ヘッダ） */
		public static final String $i_hdr_tdlv_sundry_flg = "hdr_tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_cd = "hdr_tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_nm = "hdr_tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_cd = "hdr_tdlv_cntry_cd";
		/** IN:配送先国名（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_nm = "hdr_tdlv_cntry_nm";
		/** IN:配送先郵便番号（ヘッダ） */
		public static final String $i_hdr_tdlv_zip_cd = "hdr_tdlv_zip_cd";
		/** IN:配送先住所１（ヘッダ） */
		public static final String $i_hdr_tdlv_addr1 = "hdr_tdlv_addr1";
		/** IN:配送先住所２（ヘッダ） */
		public static final String $i_hdr_tdlv_addr2 = "hdr_tdlv_addr2";
		/** IN:配送先住所３（ヘッダ） */
		public static final String $i_hdr_tdlv_addr3 = "hdr_tdlv_addr3";
		/** IN:配送先住所４（ヘッダ） */
		public static final String $i_hdr_tdlv_addr4 = "hdr_tdlv_addr4";
		/** IN:配送先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_tdlv_tel = "hdr_tdlv_tel";
		/** IN:配送先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_tdlv_fax = "hdr_tdlv_fax";
		/** IN:配送先部署（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_dpt = "hdr_tdlv_cntct_dpt";
		/** IN:配送先担当者（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_psn = "hdr_tdlv_cntct_psn";
		/** IN:配送先経由区分（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ = "hdr_via_dlv_typ";
		/** IN:配送先経由区分名（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ_nm = "hdr_via_dlv_typ_nm";
		/** IN:配送先必須（ヘッダ） */
		public static final String $i_hdr_tdlv_req_flg = "hdr_tdlv_req_flg";
		/** IN:売上計上区分 */
		public static final String $i_sls_basis_typ = "sls_basis_typ";
		/** IN:ワーキンググループＣＤ（ヘッダ） */
		public static final String $i_hdr_wg_cd = "hdr_wg_cd";
		/** IN:取引通貨ＣＤ */
		public static final String $i_trd_cur_cd = "trd_cur_cd";
		/** IN:基準通貨ＣＤ */
		public static final String $i_base_cur_cd = "base_cur_cd";
		/** IN:納税通貨ＣＤ */
		public static final String $i_ptax_cur_cd = "ptax_cur_cd";
		/** IN:得意先インボイス取引 */
		public static final String $i_cst_iv_flg = "cst_iv_flg";
		/** IN:請求繰越回数 */
		public static final String $i_cst_bill_crryovr_times = "cst_bill_crryovr_times";
		/** IN:販売単価取得区分（ヘッダ） */
		public static final String $i_hdr_sls_upri_req_typ = "hdr_sls_upri_req_typ";
		/** IN:出荷予定分割区分（ヘッダ） */
		public static final String $i_hdr_ship_schd_split_typ = "hdr_ship_schd_split_typ";
		/** IN:品揃区分 */
		public static final String $i_assort_typ = "assort_typ";
		/** IN:インボイスＮＯ */
		public static final String $i_iv_no = "iv_no";
		/** IN:自動 */
		public static final String $i_iv_num_flg = "iv_num_flg";
		/** IN:出荷希望日（ヘッダ） */
		public static final String $i_hdr_ship_rqst_dt = "hdr_ship_rqst_dt";
		/** IN:出荷希望時刻（ヘッダ） */
		public static final String $i_hdr_ship_rqst_hm = "hdr_ship_rqst_hm";
		/** IN:納入希望日（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_dt = "hdr_dlv_rqst_dt";
		/** IN:納入希望時刻（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_hm = "hdr_dlv_rqst_hm";
		/** IN:曜日区分（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ = "hdr_dlv_day_week_typ";
		/** IN:着曜日（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ_nm = "hdr_dlv_day_week_typ_nm";
		/** IN:貸出 */
		public static final String $i_vmi_flg = "vmi_flg";
		/** IN:取引単位数量 */
		public static final String $i_trd_unit_qty = "trd_unit_qty";
		/** IN:取引通貨単価 */
		public static final String $i_trd_cur_upri = "trd_cur_upri";
		/** IN:税ＣＤ */
		public static final String $i_tax_cd = "tax_cd";
		/** IN:税名 */
		public static final String $i_tax_nm = "tax_nm";
		/** IN:税率 */
		public static final String $i_tax_rate = "tax_rate";
		/** IN:税区分 */
		public static final String $i_tax_typ = "tax_typ";
		/** IN:内税 */
		public static final String $i_inc_tax_flg = "inc_tax_flg";
		/** IN:値引理由ＣＤ */
		public static final String $i_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** IN:値引理由名 */
		public static final String $i_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** IN:原価単価 */
		public static final String $i_cost_upri = "cost_upri";
		/** IN:請求繰越回数 */
		public static final String $i_bill_crryovr_times = "bill_crryovr_times";
		/** IN:品揃グループＮＯ */
		public static final String $i_set_itm_grp_no = "set_itm_grp_no";
		/** IN:出荷希望日 */
		public static final String $i_ship_rqst_dt = "ship_rqst_dt";
		/** IN:出荷希望日編集可否 */
		public static final String $i_is_editable_ship_rqst_dt = "is_editable_ship_rqst_dt";
		/** IN:出荷希望時刻 */
		public static final String $i_ship_rqst_hm = "ship_rqst_hm";
		/** IN:出荷希望時刻編集可否 */
		public static final String $i_is_editable_ship_rqst_hm = "is_editable_ship_rqst_hm";
		/** IN:納入希望日 */
		public static final String $i_dlv_rqst_dt = "dlv_rqst_dt";
		/** IN:納入希望日編集可否 */
		public static final String $i_is_editable_dlv_rqst_dt = "is_editable_dlv_rqst_dt";
		/** IN:納入希望時刻 */
		public static final String $i_dlv_rqst_hm = "dlv_rqst_hm";
		/** IN:納入希望時刻編集可否 */
		public static final String $i_is_editable_dlv_rqst_hm = "is_editable_dlv_rqst_hm";
		/** IN:曜日区分 */
		public static final String $i_dlv_day_week_typ = "dlv_day_week_typ";
		/** IN:着曜日 */
		public static final String $i_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** IN:着曜日編集可否 */
		public static final String $i_is_editable_dlv_day_week_typ_nm = "is_editable_dlv_day_week_typ_nm";
		/** IN:売上予定日 */
		public static final String $i_sls_schd_dt = "sls_schd_dt";
		/** IN:納品先ＣＤ編集可否 */
		public static final String $i_is_editable_dlv_cd = "is_editable_dlv_cd";
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:納品先名 */
		public static final String $i_dlv_nm = "dlv_nm";
		/** IN:納品先諸口 */
		public static final String $i_dlv_sundry_flg = "dlv_sundry_flg";
		/** IN:価格印字 */
		public static final String $i_pri_prnt_flg = "pri_prnt_flg";
		/** IN:納品先物流グループＣＤ */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:納品先物流グループ名 */
		public static final String $i_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ */
		public static final String $i_dlv_cntry_cd = "dlv_cntry_cd";
		/** IN:納品先国名 */
		public static final String $i_dlv_cntry_nm = "dlv_cntry_nm";
		/** IN:納品先郵便番号 */
		public static final String $i_dlv_zip_cd = "dlv_zip_cd";
		/** IN:納品先住所１ */
		public static final String $i_dlv_addr1 = "dlv_addr1";
		/** IN:納品先住所２ */
		public static final String $i_dlv_addr2 = "dlv_addr2";
		/** IN:納品先住所３ */
		public static final String $i_dlv_addr3 = "dlv_addr3";
		/** IN:納品先住所４ */
		public static final String $i_dlv_addr4 = "dlv_addr4";
		/** IN:納品先ＴＥＬ */
		public static final String $i_dlv_tel = "dlv_tel";
		/** IN:納品先ＦＡＸ */
		public static final String $i_dlv_fax = "dlv_fax";
		/** IN:納品先部署 */
		public static final String $i_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** IN:納品先担当者 */
		public static final String $i_dlv_cntct_psn = "dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ */
		public static final String $i_prnt_lcl_cd = "prnt_lcl_cd";
		/** IN:配送先必須 */
		public static final String $i_tdlv_req_flg = "tdlv_req_flg";
		/** IN:仕向先ＣＤ１編集可否 */
		public static final String $i_is_editable_dest_cd1 = "is_editable_dest_cd1";
		/** IN:仕向先ＣＤ１ */
		public static final String $i_dest_cd1 = "dest_cd1";
		/** IN:仕向先１名 */
		public static final String $i_dest_nm1 = "dest_nm1";
		/** IN:仕向先ＣＤ２編集可否 */
		public static final String $i_is_editable_dest_cd2 = "is_editable_dest_cd2";
		/** IN:仕向先ＣＤ２ */
		public static final String $i_dest_cd2 = "dest_cd2";
		/** IN:仕向先２名 */
		public static final String $i_dest_nm2 = "dest_nm2";
		/** IN:仕向先ＣＤ３編集可否 */
		public static final String $i_is_editable_dest_cd3 = "is_editable_dest_cd3";
		/** IN:仕向先ＣＤ３ */
		public static final String $i_dest_cd3 = "dest_cd3";
		/** IN:仕向先３名 */
		public static final String $i_dest_nm3 = "dest_nm3";
		/** IN:配送先ＣＤ編集可否 */
		public static final String $i_is_editable_tdlv_cd = "is_editable_tdlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:配送先名 */
		public static final String $i_tdlv_nm = "tdlv_nm";
		/** IN:配送先諸口 */
		public static final String $i_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名 */
		public static final String $i_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ */
		public static final String $i_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** IN:配送先国名 */
		public static final String $i_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** IN:配送先郵便番号 */
		public static final String $i_tdlv_zip_cd = "tdlv_zip_cd";
		/** IN:配送先住所１ */
		public static final String $i_tdlv_addr1 = "tdlv_addr1";
		/** IN:配送先住所２ */
		public static final String $i_tdlv_addr2 = "tdlv_addr2";
		/** IN:配送先住所３ */
		public static final String $i_tdlv_addr3 = "tdlv_addr3";
		/** IN:配送先住所４ */
		public static final String $i_tdlv_addr4 = "tdlv_addr4";
		/** IN:配送先ＴＥＬ */
		public static final String $i_tdlv_tel = "tdlv_tel";
		/** IN:配送先ＦＡＸ */
		public static final String $i_tdlv_fax = "tdlv_fax";
		/** IN:配送先部署 */
		public static final String $i_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** IN:配送先担当者 */
		public static final String $i_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** IN:配送先経由区分 */
		public static final String $i_via_dlv_typ = "via_dlv_typ";
		/** IN:配送先経由区分名 */
		public static final String $i_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** IN:預り売上 */
		public static final String $i_sls_cststk_flg = "sls_cststk_flg";
		/** IN:手配区分 */
		public static final String $i_proc_typ = "proc_typ";
		/** IN:分割区分 */
		public static final String $i_ship_schd_split_typ = "ship_schd_split_typ";
		/** IN:引当範囲区分 */
		public static final String $i_alloc_scope_typ = "alloc_scope_typ";
		/** IN:引当区分 */
		public static final String $i_alloc_typ = "alloc_typ";
		/** IN:販売単価取得区分 */
		public static final String $i_sls_upri_req_typ = "sls_upri_req_typ";
		/** IN:受注登録経由 */
		public static final String $i_from_slo_reg = "from_slo_reg";
		/** IN:品名不要ＦＬＧ */
		public static final String $i_sundry_itm_nm_rem_flg = "sundry_itm_nm_rem_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:品目入力補助検索区分 */
		public static final String $i_itm_is_srch_typ = "itm_is_srch_typ";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:品目別名１ */
		public static final String $o_itm_alt_nm1 = "itm_alt_nm1";
		/** OUT:品目別名２ */
		public static final String $o_itm_alt_nm2 = "itm_alt_nm2";
		/** OUT:品目別名３ */
		public static final String $o_itm_alt_nm3 = "itm_alt_nm3";
		/** OUT:品目別名４ */
		public static final String $o_itm_alt_nm4 = "itm_alt_nm4";
		/** OUT:品目区分 */
		public static final String $o_itm_typ = "itm_typ";
		/** OUT:品目区分名 */
		public static final String $o_itm_typ_nm = "itm_typ_nm";
		/** OUT:品目区分詳細ＣＤ */
		public static final String $o_itm_typ_d_cd = "itm_typ_d_cd";
		/** OUT:品目区分詳細名 */
		public static final String $o_itm_typ_d_nm = "itm_typ_d_nm";
		/** OUT:在庫管理区分 */
		public static final String $o_stk_mng_typ = "stk_mng_typ";
		/** OUT:在庫管理区分名 */
		public static final String $o_stk_mng_typ_nm = "stk_mng_typ_nm";
		/** OUT:資産管理区分 */
		public static final String $o_asset_mng_typ = "asset_mng_typ";
		/** OUT:資産管理区分名 */
		public static final String $o_asset_mng_typ_nm = "asset_mng_typ_nm";
		/** OUT:諸口品ＦＬＧ */
		public static final String $o_sundry_itm_flg = "sundry_itm_flg";
		/** OUT:品目分類ＣＤ１ */
		public static final String $o_itm_grp_cd1 = "itm_grp_cd1";
		/** OUT:品目分類名１ */
		public static final String $o_itm_grp_nm1 = "itm_grp_nm1";
		/** OUT:品目分類ＣＤ２ */
		public static final String $o_itm_grp_cd2 = "itm_grp_cd2";
		/** OUT:品目分類名２ */
		public static final String $o_itm_grp_nm2 = "itm_grp_nm2";
		/** OUT:品目分類ＣＤ３ */
		public static final String $o_itm_grp_cd3 = "itm_grp_cd3";
		/** OUT:品目分類名３ */
		public static final String $o_itm_grp_nm3 = "itm_grp_nm3";
		/** OUT:品目分類ＣＤ４ */
		public static final String $o_itm_grp_cd4 = "itm_grp_cd4";
		/** OUT:品目分類名４ */
		public static final String $o_itm_grp_nm4 = "itm_grp_nm4";
		/** OUT:品目分類ＣＤ５ */
		public static final String $o_itm_grp_cd5 = "itm_grp_cd5";
		/** OUT:品目分類名５ */
		public static final String $o_itm_grp_nm5 = "itm_grp_nm5";
		/** OUT:品目分類ＣＤ６ */
		public static final String $o_itm_grp_cd6 = "itm_grp_cd6";
		/** OUT:品目分類名６ */
		public static final String $o_itm_grp_nm6 = "itm_grp_nm6";
		/** OUT:品目分類ＣＤ７ */
		public static final String $o_itm_grp_cd7 = "itm_grp_cd7";
		/** OUT:品目分類名７ */
		public static final String $o_itm_grp_nm7 = "itm_grp_nm7";
		/** OUT:品目分類ＣＤ８ */
		public static final String $o_itm_grp_cd8 = "itm_grp_cd8";
		/** OUT:品目分類名８ */
		public static final String $o_itm_grp_nm8 = "itm_grp_nm8";
		/** OUT:品目分類ＣＤ９ */
		public static final String $o_itm_grp_cd9 = "itm_grp_cd9";
		/** OUT:品目分類名９ */
		public static final String $o_itm_grp_nm9 = "itm_grp_nm9";
		/** OUT:品目分類ＣＤ１０ */
		public static final String $o_itm_grp_cd10 = "itm_grp_cd10";
		/** OUT:品目分類名１０ */
		public static final String $o_itm_grp_nm10 = "itm_grp_nm10";
		/** OUT:リリースＦＬＧ */
		public static final String $o_release_flg = "release_flg";
		/** OUT:期間管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
		/** OUT:メモ１（共通） */
		public static final String $o_memo1_c = "memo1_c";
		/** OUT:メモ２（共通） */
		public static final String $o_memo2_c = "memo2_c";
		/** OUT:メモ３（共通） */
		public static final String $o_memo3_c = "memo3_c";
		/** OUT:メモ１ */
		public static final String $o_memo1 = "memo1";
		/** OUT:メモ２ */
		public static final String $o_memo2 = "memo2";
		/** OUT:メモ３ */
		public static final String $o_memo3 = "memo3";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:値引品目ＦＬＧ */
		public static final String $o_dscnt_itm_flg = "dscnt_itm_flg";
		/** OUT:単位ＣＤ */
		public static final String $o_unit_cd = "unit_cd";
		/** OUT:単位名 */
		public static final String $o_unit_nm = "unit_nm";
		/** OUT:小数部有効桁数 */
		public static final String $o_dec_place = "dec_place";
		/** OUT:端数処理区分 */
		public static final String $o_rnd_typ = "rnd_typ";
		/** OUT:端数処理区分名 */
		public static final String $o_rnd_typ_nm = "rnd_typ_nm";
		/** OUT:容積単位ＣＤ */
		public static final String $o_dim_unit_cd = "dim_unit_cd";
		/** OUT:容積 */
		public static final String $o_dim = "dim";
		/** OUT:重量単位ＣＤ */
		public static final String $o_wt_unit_cd = "wt_unit_cd";
		/** OUT:重量 */
		public static final String $o_wt = "wt";
		/** OUT:入り目単位ＣＤ */
		public static final String $o_conts_unit_cd = "conts_unit_cd";
		/** OUT:入り目数 */
		public static final String $o_conts_qty = "conts_qty";
		/** OUT:ＨＳ ＣＤ */
		public static final String $o_hs_cd = "hs_cd";
		/** OUT:販売品目体系ＣＤ */
		public static final String $o_sls_itm_grp_cd = "sls_itm_grp_cd";
		/** OUT:品目仕訳ＣＤ */
		public static final String $o_itm_jnl_cd = "itm_jnl_cd";
		/** OUT:会計品目分類ＣＤ */
		public static final String $o_ac_itm_grp_cd = "ac_itm_grp_cd";
		/** OUT:マイナス在庫許可ＦＬＧ */
		public static final String $o_minus_stk_flg = "minus_stk_flg";
		/** OUT:新規ロット入力不可ＦＬＧ */
		public static final String $o_not_new_lot_flg = "not_new_lot_flg";
		/** OUT:出庫引当確認ＦＬＧ */
		public static final String $o_gi_alloc_flg = "gi_alloc_flg";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
		/** OUT:出荷単位名 */
		public static final String $o_ship_unit_nm = "ship_unit_nm";
		/** OUT:出荷単位小数部有効桁数 */
		public static final String $o_ship_unit_dec_place = "ship_unit_dec_place";
		/** OUT:出荷単位分母数量 */
		public static final String $o_ship_unit_conv_base_qty = "ship_unit_conv_base_qty";
		/** OUT:出荷単位換算数量 */
		public static final String $o_ship_unit_conv_qty = "ship_unit_conv_qty";
		/** OUT:出荷単位数量 */
		public static final String $o_ship_unit_qty = "ship_unit_qty";
		/** OUT:製造単位ＣＤ */
		public static final String $o_mfg_unit_cd = "mfg_unit_cd";
		/** OUT:発注単位ＣＤ */
		public static final String $o_purc_unit_cd = "purc_unit_cd";
		/** OUT:梱包単位ＣＤ */
		public static final String $o_pckg_unit_cd = "pckg_unit_cd";
		/** OUT:荷姿引当ＦＬＧ */
		public static final String $o_pack_alloc_flg = "pack_alloc_flg";
		/** OUT:ロット管理区分 */
		public static final String $o_lot_mng_typ = "lot_mng_typ";
		/** OUT:ロット管理区分名 */
		public static final String $o_lot_mng_typ_nm = "lot_mng_typ_nm";
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番区分名 */
		public static final String $o_lot_no_typ_nm = "lot_no_typ_nm";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロット管理区分名 */
		public static final String $o_sublot_mng_typ_nm = "sublot_mng_typ_nm";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番区分名 */
		public static final String $o_sublot_no_typ_nm = "sublot_no_typ_nm";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:検査実施単位区分名 */
		public static final String $o_insp_bind_typ_nm = "insp_bind_typ_nm";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理種別 */
		public static final String $o_lmt_ctl_categ = "lmt_ctl_categ";
		/** OUT:有効成分対象ＦＬＧ */
		public static final String $o_cont_fctr_flg = "cont_fctr_flg";
		/** OUT:標準有効成分係数 */
		public static final String $o_std_cont_fctr = "std_cont_fctr";
		/** OUT:有効成分単位ＣＤ */
		public static final String $o_cont_fctr_unit_cd = "cont_fctr_unit_cd";
		/** OUT:有効成分単位名 */
		public static final String $o_cont_fctr_unit_nm = "cont_fctr_unit_nm";
		/** OUT:有効成分換算端数処理区分 */
		public static final String $o_cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
		/** OUT:有効成分換算端数処理区分名 */
		public static final String $o_cont_fctr_rnd_typ_nm = "cont_fctr_rnd_typ_nm";
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:手配ＮＯ１管理区分名 */
		public static final String $o_sno1_mng_typ_nm = "sno1_mng_typ_nm";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番区分名 */
		public static final String $o_sno1_num_typ_nm = "sno1_num_typ_nm";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:手配ＮＯ２管理区分名 */
		public static final String $o_sno2_mng_typ_nm = "sno2_mng_typ_nm";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番区分名 */
		public static final String $o_sno2_num_typ_nm = "sno2_num_typ_nm";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:手配ＮＯ３管理区分名 */
		public static final String $o_sno3_mng_typ_nm = "sno3_mng_typ_nm";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番区分名 */
		public static final String $o_sno3_num_typ_nm = "sno3_num_typ_nm";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:手配ＮＯ４管理区分名 */
		public static final String $o_sno4_mng_typ_nm = "sno4_mng_typ_nm";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番区分名 */
		public static final String $o_sno4_num_typ_nm = "sno4_num_typ_nm";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:構成パタン */
		public static final String $o_def_bom_ptn = "def_bom_ptn";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:製造指図単位区分名 */
		public static final String $o_mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
		/** OUT:ＭＲＰ処理区分名 */
		public static final String $o_mrp_proc_typ_nm = "mrp_proc_typ_nm";
		/** OUT:引当余裕日数 */
		public static final String $o_alloc_margin_days = "alloc_margin_days";
		/** OUT:ＭＲＰ引当余裕日数 */
		public static final String $o_mrp_alloc_margin_days = "mrp_alloc_margin_days";
		/** OUT:所要抑制量 */
		public static final String $o_rqmt_rstr_qty = "rqmt_rstr_qty";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:スケジューラＦＬＧ */
		public static final String $o_sch_flg = "sch_flg";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:原産地名 */
		public static final String $o_cntry_org_nm = "cntry_org_nm";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:構成・仕様管理区分名 */
		public static final String $o_comp_spec_typ_nm = "comp_spec_typ_nm";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:販売単価分類ＣＤ */
		public static final String $o_sls_upri_grp_cd = "sls_upri_grp_cd";
		/** OUT:請求繰越回数 */
		public static final String $o_itm_bill_crryovr_times = "itm_bill_crryovr_times";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
		/** OUT:受注手配区分名 */
		public static final String $o_slo_proc_typ_nm = "slo_proc_typ_nm";
		/** OUT:手配区分 */
		public static final String $o_proc_typ = "proc_typ";
		/** OUT:出荷指図区分（マスタ） */
		public static final String $o_def_ship_inst_typ = "def_ship_inst_typ";
		/** OUT:出荷指図区分名（マスタ） */
		public static final String $o_def_ship_inst_typ_nm = "def_ship_inst_typ_nm";
		/** OUT:出荷指図区分 */
		public static final String $o_ship_inst_typ = "ship_inst_typ";
		/** OUT:出荷ロット逆転禁止ＦＬＧ */
		public static final String $o_ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
		/** OUT:品目出荷グループＣＤ */
		public static final String $o_itm_ship_grp_cd = "itm_ship_grp_cd";
		/** OUT:出荷有効期限グループＣＤ */
		public static final String $o_ship_valid_grp_cd = "ship_valid_grp_cd";
		/** OUT:入荷不要ＦＬＧ */
		public static final String $o_arr_skip_flg = "arr_skip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:出荷条件名 */
		public static final String $o_ship_term_nm = "ship_term_nm";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:輸出入諸掛区分名 */
		public static final String $o_exim_xpns_typ_nm = "exim_xpns_typ_nm";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:販売単価変更許可ＦＬＧ */
		public static final String $o_sls_upri_cng_flg = "sls_upri_cng_flg";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:参照品目ＣＤ */
		public static final String $o_ref_itm_cd = "ref_itm_cd";
		/** OUT:参照枝番１ */
		public static final String $o_ref_itm_sub1 = "ref_itm_sub1";
		/** OUT:参照枝番２ */
		public static final String $o_ref_itm_sub2 = "ref_itm_sub2";
		/** OUT:参照枝番３ */
		public static final String $o_ref_itm_sub3 = "ref_itm_sub3";
		/** OUT:外部システムＮＯ */
		public static final String $o_ext_sys_no_itm = "ext_sys_no_itm";
		/** OUT:計算パタンＣＤ */
		public static final String $o_calc_ptn_cd = "calc_ptn_cd";
		/** OUT:原価基準数 */
		public static final String $o_cost_std_qty = "cost_std_qty";
		/** OUT:品目配賦グループ */
		public static final String $o_itm_alc_grp = "itm_alc_grp";
		/** OUT:販売ＦＬＧ */
		public static final String $o_sls_flg = "sls_flg";
		/** OUT:製造ＦＬＧ */
		public static final String $o_mfg_flg = "mfg_flg";
		/** OUT:購買ＦＬＧ */
		public static final String $o_purc_flg = "purc_flg";
		/** OUT:検査ＦＬＧ */
		public static final String $o_insp_flg = "insp_flg";
		/** OUT:販売設定済ＦＬＧ */
		public static final String $o_sls_input_flg = "sls_input_flg";
		/** OUT:製造設定済ＦＬＧ */
		public static final String $o_mfg_input_flg = "mfg_input_flg";
		/** OUT:購買設定済ＦＬＧ */
		public static final String $o_purc_input_flg = "purc_input_flg";
		/** OUT:検査設定済ＦＬＧ */
		public static final String $o_insp_input_flg = "insp_input_flg";
		/** OUT:所要区分 */
		public static final String $o_rqmt_typ = "rqmt_typ";
		/** OUT:所要区分名 */
		public static final String $o_rqmt_typ_nm = "rqmt_typ_nm";
		/** OUT:生産計画立案区分 */
		public static final String $o_prod_pln_typ = "prod_pln_typ";
		/** OUT:生産計画立案区分名 */
		public static final String $o_prod_pln_typ_nm = "prod_pln_typ_nm";
		/** OUT:需要日ばらし月数 */
		public static final String $o_dmnd_date_div_mons = "dmnd_date_div_mons";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:取引先品目ＣＤ */
		public static final String $o_bp_itm_cd = "bp_itm_cd";
		/** OUT:取引先品名 */
		public static final String $o_bp_itm_nm = "bp_itm_nm";
		/** OUT:貸出 */
		public static final String $o_vmi_flg = "vmi_flg";
		/** OUT:インボイス表記品名 */
		public static final String $o_iv_itm_nm = "iv_itm_nm";
		/** OUT:取引通貨単価 */
		public static final String $o_trd_cur_upri = "trd_cur_upri";
		/** OUT:税ＣＤ */
		public static final String $o_tax_cd = "tax_cd";
		/** OUT:税名 */
		public static final String $o_tax_nm = "tax_nm";
		/** OUT:税率 */
		public static final String $o_tax_rate = "tax_rate";
		/** OUT:税区分 */
		public static final String $o_tax_typ = "tax_typ";
		/** OUT:内税 */
		public static final String $o_inc_tax_flg = "inc_tax_flg";
		/** OUT:値引理由ＣＤ */
		public static final String $o_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** OUT:値引理由名 */
		public static final String $o_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** OUT:原価単価 */
		public static final String $o_cost_upri = "cost_upri";
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:請求繰越回数 */
		public static final String $o_bill_crryovr_times = "bill_crryovr_times";
		/** OUT:出荷希望日 */
		public static final String $o_ship_rqst_dt = "ship_rqst_dt";
		/** OUT:出荷希望時刻 */
		public static final String $o_ship_rqst_hm = "ship_rqst_hm";
		/** OUT:納入希望日 */
		public static final String $o_dlv_rqst_dt = "dlv_rqst_dt";
		/** OUT:納入希望時刻 */
		public static final String $o_dlv_rqst_hm = "dlv_rqst_hm";
		/** OUT:曜日区分 */
		public static final String $o_dlv_day_week_typ = "dlv_day_week_typ";
		/** OUT:着曜日 */
		public static final String $o_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** OUT:納品先ＣＤ */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:納品先名 */
		public static final String $o_dlv_nm = "dlv_nm";
		/** OUT:納品先諸口 */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:価格印字 */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:納品先物流グループＣＤ */
		public static final String $o_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** OUT:納品先物流グループ名 */
		public static final String $o_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** OUT:納品先国ＣＤ */
		public static final String $o_dlv_cntry_cd = "dlv_cntry_cd";
		/** OUT:納品先国名 */
		public static final String $o_dlv_cntry_nm = "dlv_cntry_nm";
		/** OUT:納品先郵便番号 */
		public static final String $o_dlv_zip_cd = "dlv_zip_cd";
		/** OUT:納品先住所１ */
		public static final String $o_dlv_addr1 = "dlv_addr1";
		/** OUT:納品先住所２ */
		public static final String $o_dlv_addr2 = "dlv_addr2";
		/** OUT:納品先住所３ */
		public static final String $o_dlv_addr3 = "dlv_addr3";
		/** OUT:納品先住所４ */
		public static final String $o_dlv_addr4 = "dlv_addr4";
		/** OUT:納品先ＴＥＬ */
		public static final String $o_dlv_tel = "dlv_tel";
		/** OUT:納品先ＦＡＸ */
		public static final String $o_dlv_fax = "dlv_fax";
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:配送先必須 */
		public static final String $o_tdlv_req_flg = "tdlv_req_flg";
		/** OUT:仕向先ＣＤ１ */
		public static final String $o_dest_cd1 = "dest_cd1";
		/** OUT:仕向先１名 */
		public static final String $o_dest_nm1 = "dest_nm1";
		/** OUT:仕向先ＣＤ２ */
		public static final String $o_dest_cd2 = "dest_cd2";
		/** OUT:仕向先２名 */
		public static final String $o_dest_nm2 = "dest_nm2";
		/** OUT:仕向先ＣＤ３ */
		public static final String $o_dest_cd3 = "dest_cd3";
		/** OUT:仕向先３名 */
		public static final String $o_dest_nm3 = "dest_nm3";
		/** OUT:配送先ＣＤ */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:配送先名 */
		public static final String $o_tdlv_nm = "tdlv_nm";
		/** OUT:配送先諸口 */
		public static final String $o_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** OUT:配送先物流グループＣＤ */
		public static final String $o_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** OUT:配送先物流グループ名 */
		public static final String $o_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** OUT:配送先国ＣＤ */
		public static final String $o_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** OUT:配送先国名 */
		public static final String $o_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** OUT:配送先郵便番号 */
		public static final String $o_tdlv_zip_cd = "tdlv_zip_cd";
		/** OUT:配送先住所１ */
		public static final String $o_tdlv_addr1 = "tdlv_addr1";
		/** OUT:配送先住所２ */
		public static final String $o_tdlv_addr2 = "tdlv_addr2";
		/** OUT:配送先住所３ */
		public static final String $o_tdlv_addr3 = "tdlv_addr3";
		/** OUT:配送先住所４ */
		public static final String $o_tdlv_addr4 = "tdlv_addr4";
		/** OUT:配送先ＴＥＬ */
		public static final String $o_tdlv_tel = "tdlv_tel";
		/** OUT:配送先ＦＡＸ */
		public static final String $o_tdlv_fax = "tdlv_fax";
		/** OUT:配送先部署 */
		public static final String $o_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** OUT:配送先担当者 */
		public static final String $o_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:配送先経由区分名 */
		public static final String $o_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** OUT:預り売上 */
		public static final String $o_sls_cststk_flg = "sls_cststk_flg";
		/** OUT:格付ＣＤ */
		public static final String $o_gd_cd = "gd_cd";
		/** OUT:格付名 */
		public static final String $o_gd_nm = "gd_nm";
		/** OUT:分割区分 */
		public static final String $o_ship_schd_split_typ = "ship_schd_split_typ";
		/** OUT:引当範囲区分 */
		public static final String $o_alloc_scope_typ = "alloc_scope_typ";
		/** OUT:引当区分 */
		public static final String $o_alloc_typ = "alloc_typ";
		/** OUT:販売単価取得区分 */
		public static final String $o_sls_upri_req_typ = "sls_upri_req_typ";
		/** VIEW:枝番２ */
		public static final String $v_itm_sub2 = $o_itm_sub2;
		/** VIEW_NO:枝番２ */
		protected static final MCNumber $vn_itm_sub2 = new MCNumber(10);
		/** SORT:枝番２ */
		public static final String $s_itm_sub2 = $o_itm_sub2;
		/** SORT_NO:枝番２ */
		protected static final MCNumber $sn_itm_sub2 = new MCNumber(10);
		/** OTHER:リリースＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_on = "mode_release_flg_on";
		/** OTHER:リリースＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_off = "mode_release_flg_off";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_sub2);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub3);
					add($o_itm_nm);
					add($o_itm_alt_nm1);
					add($o_itm_alt_nm2);
					add($o_itm_alt_nm3);
					add($o_itm_alt_nm4);
					add($o_itm_typ);
					add($o_itm_typ_nm);
					add($o_itm_typ_d_cd);
					add($o_itm_typ_d_nm);
					add($o_stk_mng_typ);
					add($o_stk_mng_typ_nm);
					add($o_asset_mng_typ);
					add($o_asset_mng_typ_nm);
					add($o_sundry_itm_flg);
					add($o_itm_grp_cd1);
					add($o_itm_grp_nm1);
					add($o_itm_grp_cd2);
					add($o_itm_grp_nm2);
					add($o_itm_grp_cd3);
					add($o_itm_grp_nm3);
					add($o_itm_grp_cd4);
					add($o_itm_grp_nm4);
					add($o_itm_grp_cd5);
					add($o_itm_grp_nm5);
					add($o_itm_grp_cd6);
					add($o_itm_grp_nm6);
					add($o_itm_grp_cd7);
					add($o_itm_grp_nm7);
					add($o_itm_grp_cd8);
					add($o_itm_grp_nm8);
					add($o_itm_grp_cd9);
					add($o_itm_grp_nm9);
					add($o_itm_grp_cd10);
					add($o_itm_grp_nm10);
					add($o_release_flg);
					add($o_lmt_ctl_flg);
					add($o_memo1_c);
					add($o_memo2_c);
					add($o_memo3_c);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_rnd_typ_nm);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_sls_itm_grp_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_ship_unit_cd);
					add($o_ship_unit_nm);
					add($o_ship_unit_dec_place);
					add($o_ship_unit_conv_base_qty);
					add($o_ship_unit_conv_qty);
					add($o_ship_unit_qty);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_mng_typ_nm);
					add($o_lot_no_typ);
					add($o_lot_no_typ_nm);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_mng_typ_nm);
					add($o_sublot_no_typ);
					add($o_sublot_no_typ_nm);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_insp_bind_typ_nm);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_rnd_typ_nm);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_sno1_mng_typ_nm);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_num_typ_nm);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_sno2_mng_typ_nm);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_num_typ_nm);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_sno3_mng_typ_nm);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_num_typ_nm);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_sno4_mng_typ_nm);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_num_typ_nm);
					add($o_sno4_ptn_cd);
					add($o_def_bom_ptn);
					add($o_mfg_inst_unit_typ);
					add($o_mfg_inst_unit_typ_nm);
					add($o_mrp_proc_typ);
					add($o_mrp_proc_typ_nm);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_cntry_org_cd);
					add($o_cntry_org_nm);
					add($o_comp_spec_typ);
					add($o_comp_spec_typ_nm);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_sls_upri_grp_cd);
					add($o_itm_bill_crryovr_times);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_slo_proc_typ_nm);
					add($o_proc_typ);
					add($o_def_ship_inst_typ);
					add($o_def_ship_inst_typ_nm);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_ship_term_cd);
					add($o_ship_term_nm);
					add($o_exim_xpns_typ);
					add($o_exim_xpns_typ_nm);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_sls_upri_cng_flg);
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_ref_itm_cd);
					add($o_ref_itm_sub1);
					add($o_ref_itm_sub2);
					add($o_ref_itm_sub3);
					add($o_ext_sys_no_itm);
					add($o_calc_ptn_cd);
					add($o_cost_std_qty);
					add($o_itm_alc_grp);
					add($o_sls_flg);
					add($o_mfg_flg);
					add($o_purc_flg);
					add($o_insp_flg);
					add($o_sls_input_flg);
					add($o_mfg_input_flg);
					add($o_purc_input_flg);
					add($o_insp_input_flg);
					add($o_rqmt_typ);
					add($o_rqmt_typ_nm);
					add($o_prod_pln_typ);
					add($o_prod_pln_typ_nm);
					add($o_dmnd_date_div_mons);
					add($o_mrp_opn_xfr_days);
					add($o_bp_itm_cd);
					add($o_bp_itm_nm);
					add($o_vmi_flg);
					add($o_iv_itm_nm);
					add($o_trd_cur_upri);
					add($o_tax_cd);
					add($o_tax_nm);
					add($o_tax_rate);
					add($o_tax_typ);
					add($o_inc_tax_flg);
					add($o_dscnt_rsn_cd);
					add($o_dscnt_rsn_nm);
					add($o_cost_upri);
					add($o_wtax_rate);
					add($o_bill_crryovr_times);
					add($o_ship_rqst_dt);
					add($o_ship_rqst_hm);
					add($o_dlv_rqst_dt);
					add($o_dlv_rqst_hm);
					add($o_dlv_day_week_typ);
					add($o_dlv_day_week_typ_nm);
					add($o_dlv_cd);
					add($o_dlv_nm);
					add($o_dlv_sundry_flg);
					add($o_pri_prnt_flg);
					add($o_dlv_lg_grp_cd);
					add($o_dlv_lg_grp_nm);
					add($o_dlv_cntry_cd);
					add($o_dlv_cntry_nm);
					add($o_dlv_zip_cd);
					add($o_dlv_addr1);
					add($o_dlv_addr2);
					add($o_dlv_addr3);
					add($o_dlv_addr4);
					add($o_dlv_tel);
					add($o_dlv_fax);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_prnt_lcl_cd);
					add($o_tdlv_req_flg);
					add($o_dest_cd1);
					add($o_dest_nm1);
					add($o_dest_cd2);
					add($o_dest_nm2);
					add($o_dest_cd3);
					add($o_dest_nm3);
					add($o_tdlv_cd);
					add($o_tdlv_nm);
					add($o_tdlv_sundry_flg);
					add($o_tdlv_lg_grp_cd);
					add($o_tdlv_lg_grp_nm);
					add($o_tdlv_cntry_cd);
					add($o_tdlv_cntry_nm);
					add($o_tdlv_zip_cd);
					add($o_tdlv_addr1);
					add($o_tdlv_addr2);
					add($o_tdlv_addr3);
					add($o_tdlv_addr4);
					add($o_tdlv_tel);
					add($o_tdlv_fax);
					add($o_tdlv_cntct_dpt);
					add($o_tdlv_cntct_psn);
					add($o_via_dlv_typ);
					add($o_via_dlv_typ_nm);
					add($o_sls_cststk_flg);
					add($o_gd_cd);
					add($o_gd_nm);
					add($o_ship_schd_split_typ);
					add($o_alloc_scope_typ);
					add($o_alloc_typ);
					add($o_sls_upri_req_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_sub2, $v_itm_sub2);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_sub2, $s_itm_sub2, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloItmSub2Cols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloItmSub2Cols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloItmSub2Cols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloItmSub2Cols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloItmSub2Cols extends MSUAC_List.SloItmSub2Cols_MC_A {
		//EIクラス
	}


	/** 
	  * SloItmSub3:カラム名クラス
	  */
	protected static class SloItmSub3Cols_MC_A  {
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:リリースＦＬＧ.オン */
		public static final String $i_release_flg_on = "release_flg_on";
		/** IN:リリースＦＬＧ.オフ */
		public static final String $i_release_flg_off = "release_flg_off";
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:適用日 */
		public static final String $i_dt = "dt";
		/** IN:取引パタン区分 */
		public static final String $i_trd_ptn_typ = "trd_ptn_typ";
		/** IN:納品先ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cd = "hdr_dlv_cd";
		/** IN:納品先名（ヘッダ） */
		public static final String $i_hdr_dlv_nm = "hdr_dlv_nm";
		/** IN:納品先諸口（ヘッダ） */
		public static final String $i_hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
		/** IN:価格印字（ヘッダ） */
		public static final String $i_hdr_pri_prnt_flg = "hdr_pri_prnt_flg";
		/** IN:納品先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_cd = "hdr_dlv_lg_grp_cd";
		/** IN:納品先物流グループ名（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_nm = "hdr_dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_cd = "hdr_dlv_cntry_cd";
		/** IN:納品先国名（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_nm = "hdr_dlv_cntry_nm";
		/** IN:納品先郵便番号（ヘッダ） */
		public static final String $i_hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
		/** IN:納品先住所１（ヘッダ） */
		public static final String $i_hdr_dlv_addr1 = "hdr_dlv_addr1";
		/** IN:納品先住所２（ヘッダ） */
		public static final String $i_hdr_dlv_addr2 = "hdr_dlv_addr2";
		/** IN:納品先住所３（ヘッダ） */
		public static final String $i_hdr_dlv_addr3 = "hdr_dlv_addr3";
		/** IN:納品先住所４（ヘッダ） */
		public static final String $i_hdr_dlv_addr4 = "hdr_dlv_addr4";
		/** IN:納品先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_dlv_tel = "hdr_dlv_tel";
		/** IN:納品先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_dlv_fax = "hdr_dlv_fax";
		/** IN:納品先部署（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
		/** IN:納品先担当者（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ（ヘッダ） */
		public static final String $i_hdr_prnt_lcl_cd = "hdr_prnt_lcl_cd";
		/** IN:仕向先ＣＤ１（ヘッダ） */
		public static final String $i_hdr_dest_cd1 = "hdr_dest_cd1";
		/** IN:仕向先１名（ヘッダ） */
		public static final String $i_hdr_dest_nm1 = "hdr_dest_nm1";
		/** IN:仕向先ＣＤ２（ヘッダ） */
		public static final String $i_hdr_dest_cd2 = "hdr_dest_cd2";
		/** IN:仕向先２名（ヘッダ） */
		public static final String $i_hdr_dest_nm2 = "hdr_dest_nm2";
		/** IN:仕向先ＣＤ３（ヘッダ） */
		public static final String $i_hdr_dest_cd3 = "hdr_dest_cd3";
		/** IN:仕向先３名（ヘッダ） */
		public static final String $i_hdr_dest_nm3 = "hdr_dest_nm3";
		/** IN:配送先ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cd = "hdr_tdlv_cd";
		/** IN:配送先名（ヘッダ） */
		public static final String $i_hdr_tdlv_nm = "hdr_tdlv_nm";
		/** IN:配送先諸口（ヘッダ） */
		public static final String $i_hdr_tdlv_sundry_flg = "hdr_tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_cd = "hdr_tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_nm = "hdr_tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_cd = "hdr_tdlv_cntry_cd";
		/** IN:配送先国名（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_nm = "hdr_tdlv_cntry_nm";
		/** IN:配送先郵便番号（ヘッダ） */
		public static final String $i_hdr_tdlv_zip_cd = "hdr_tdlv_zip_cd";
		/** IN:配送先住所１（ヘッダ） */
		public static final String $i_hdr_tdlv_addr1 = "hdr_tdlv_addr1";
		/** IN:配送先住所２（ヘッダ） */
		public static final String $i_hdr_tdlv_addr2 = "hdr_tdlv_addr2";
		/** IN:配送先住所３（ヘッダ） */
		public static final String $i_hdr_tdlv_addr3 = "hdr_tdlv_addr3";
		/** IN:配送先住所４（ヘッダ） */
		public static final String $i_hdr_tdlv_addr4 = "hdr_tdlv_addr4";
		/** IN:配送先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_tdlv_tel = "hdr_tdlv_tel";
		/** IN:配送先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_tdlv_fax = "hdr_tdlv_fax";
		/** IN:配送先部署（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_dpt = "hdr_tdlv_cntct_dpt";
		/** IN:配送先担当者（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_psn = "hdr_tdlv_cntct_psn";
		/** IN:配送先経由区分（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ = "hdr_via_dlv_typ";
		/** IN:配送先経由区分名（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ_nm = "hdr_via_dlv_typ_nm";
		/** IN:配送先必須（ヘッダ） */
		public static final String $i_hdr_tdlv_req_flg = "hdr_tdlv_req_flg";
		/** IN:売上計上区分 */
		public static final String $i_sls_basis_typ = "sls_basis_typ";
		/** IN:ワーキンググループＣＤ（ヘッダ） */
		public static final String $i_hdr_wg_cd = "hdr_wg_cd";
		/** IN:取引通貨ＣＤ */
		public static final String $i_trd_cur_cd = "trd_cur_cd";
		/** IN:基準通貨ＣＤ */
		public static final String $i_base_cur_cd = "base_cur_cd";
		/** IN:納税通貨ＣＤ */
		public static final String $i_ptax_cur_cd = "ptax_cur_cd";
		/** IN:得意先インボイス取引 */
		public static final String $i_cst_iv_flg = "cst_iv_flg";
		/** IN:請求繰越回数 */
		public static final String $i_cst_bill_crryovr_times = "cst_bill_crryovr_times";
		/** IN:販売単価取得区分（ヘッダ） */
		public static final String $i_hdr_sls_upri_req_typ = "hdr_sls_upri_req_typ";
		/** IN:出荷予定分割区分（ヘッダ） */
		public static final String $i_hdr_ship_schd_split_typ = "hdr_ship_schd_split_typ";
		/** IN:品揃区分 */
		public static final String $i_assort_typ = "assort_typ";
		/** IN:インボイスＮＯ */
		public static final String $i_iv_no = "iv_no";
		/** IN:自動 */
		public static final String $i_iv_num_flg = "iv_num_flg";
		/** IN:出荷希望日（ヘッダ） */
		public static final String $i_hdr_ship_rqst_dt = "hdr_ship_rqst_dt";
		/** IN:出荷希望時刻（ヘッダ） */
		public static final String $i_hdr_ship_rqst_hm = "hdr_ship_rqst_hm";
		/** IN:納入希望日（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_dt = "hdr_dlv_rqst_dt";
		/** IN:納入希望時刻（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_hm = "hdr_dlv_rqst_hm";
		/** IN:曜日区分（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ = "hdr_dlv_day_week_typ";
		/** IN:着曜日（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ_nm = "hdr_dlv_day_week_typ_nm";
		/** IN:貸出 */
		public static final String $i_vmi_flg = "vmi_flg";
		/** IN:取引単位数量 */
		public static final String $i_trd_unit_qty = "trd_unit_qty";
		/** IN:取引通貨単価 */
		public static final String $i_trd_cur_upri = "trd_cur_upri";
		/** IN:税ＣＤ */
		public static final String $i_tax_cd = "tax_cd";
		/** IN:税名 */
		public static final String $i_tax_nm = "tax_nm";
		/** IN:税率 */
		public static final String $i_tax_rate = "tax_rate";
		/** IN:税区分 */
		public static final String $i_tax_typ = "tax_typ";
		/** IN:内税 */
		public static final String $i_inc_tax_flg = "inc_tax_flg";
		/** IN:値引理由ＣＤ */
		public static final String $i_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** IN:値引理由名 */
		public static final String $i_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** IN:原価単価 */
		public static final String $i_cost_upri = "cost_upri";
		/** IN:請求繰越回数 */
		public static final String $i_bill_crryovr_times = "bill_crryovr_times";
		/** IN:品揃グループＮＯ */
		public static final String $i_set_itm_grp_no = "set_itm_grp_no";
		/** IN:出荷希望日 */
		public static final String $i_ship_rqst_dt = "ship_rqst_dt";
		/** IN:出荷希望日編集可否 */
		public static final String $i_is_editable_ship_rqst_dt = "is_editable_ship_rqst_dt";
		/** IN:出荷希望時刻 */
		public static final String $i_ship_rqst_hm = "ship_rqst_hm";
		/** IN:出荷希望時刻編集可否 */
		public static final String $i_is_editable_ship_rqst_hm = "is_editable_ship_rqst_hm";
		/** IN:納入希望日 */
		public static final String $i_dlv_rqst_dt = "dlv_rqst_dt";
		/** IN:納入希望日編集可否 */
		public static final String $i_is_editable_dlv_rqst_dt = "is_editable_dlv_rqst_dt";
		/** IN:納入希望時刻 */
		public static final String $i_dlv_rqst_hm = "dlv_rqst_hm";
		/** IN:納入希望時刻編集可否 */
		public static final String $i_is_editable_dlv_rqst_hm = "is_editable_dlv_rqst_hm";
		/** IN:曜日区分 */
		public static final String $i_dlv_day_week_typ = "dlv_day_week_typ";
		/** IN:着曜日 */
		public static final String $i_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** IN:着曜日編集可否 */
		public static final String $i_is_editable_dlv_day_week_typ_nm = "is_editable_dlv_day_week_typ_nm";
		/** IN:売上予定日 */
		public static final String $i_sls_schd_dt = "sls_schd_dt";
		/** IN:納品先ＣＤ編集可否 */
		public static final String $i_is_editable_dlv_cd = "is_editable_dlv_cd";
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:納品先名 */
		public static final String $i_dlv_nm = "dlv_nm";
		/** IN:納品先諸口 */
		public static final String $i_dlv_sundry_flg = "dlv_sundry_flg";
		/** IN:価格印字 */
		public static final String $i_pri_prnt_flg = "pri_prnt_flg";
		/** IN:納品先物流グループＣＤ */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:納品先物流グループ名 */
		public static final String $i_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ */
		public static final String $i_dlv_cntry_cd = "dlv_cntry_cd";
		/** IN:納品先国名 */
		public static final String $i_dlv_cntry_nm = "dlv_cntry_nm";
		/** IN:納品先郵便番号 */
		public static final String $i_dlv_zip_cd = "dlv_zip_cd";
		/** IN:納品先住所１ */
		public static final String $i_dlv_addr1 = "dlv_addr1";
		/** IN:納品先住所２ */
		public static final String $i_dlv_addr2 = "dlv_addr2";
		/** IN:納品先住所３ */
		public static final String $i_dlv_addr3 = "dlv_addr3";
		/** IN:納品先住所４ */
		public static final String $i_dlv_addr4 = "dlv_addr4";
		/** IN:納品先ＴＥＬ */
		public static final String $i_dlv_tel = "dlv_tel";
		/** IN:納品先ＦＡＸ */
		public static final String $i_dlv_fax = "dlv_fax";
		/** IN:納品先部署 */
		public static final String $i_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** IN:納品先担当者 */
		public static final String $i_dlv_cntct_psn = "dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ */
		public static final String $i_prnt_lcl_cd = "prnt_lcl_cd";
		/** IN:配送先必須 */
		public static final String $i_tdlv_req_flg = "tdlv_req_flg";
		/** IN:仕向先ＣＤ１編集可否 */
		public static final String $i_is_editable_dest_cd1 = "is_editable_dest_cd1";
		/** IN:仕向先ＣＤ１ */
		public static final String $i_dest_cd1 = "dest_cd1";
		/** IN:仕向先１名 */
		public static final String $i_dest_nm1 = "dest_nm1";
		/** IN:仕向先ＣＤ２編集可否 */
		public static final String $i_is_editable_dest_cd2 = "is_editable_dest_cd2";
		/** IN:仕向先ＣＤ２ */
		public static final String $i_dest_cd2 = "dest_cd2";
		/** IN:仕向先２名 */
		public static final String $i_dest_nm2 = "dest_nm2";
		/** IN:仕向先ＣＤ３編集可否 */
		public static final String $i_is_editable_dest_cd3 = "is_editable_dest_cd3";
		/** IN:仕向先ＣＤ３ */
		public static final String $i_dest_cd3 = "dest_cd3";
		/** IN:仕向先３名 */
		public static final String $i_dest_nm3 = "dest_nm3";
		/** IN:配送先ＣＤ編集可否 */
		public static final String $i_is_editable_tdlv_cd = "is_editable_tdlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:配送先名 */
		public static final String $i_tdlv_nm = "tdlv_nm";
		/** IN:配送先諸口 */
		public static final String $i_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名 */
		public static final String $i_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ */
		public static final String $i_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** IN:配送先国名 */
		public static final String $i_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** IN:配送先郵便番号 */
		public static final String $i_tdlv_zip_cd = "tdlv_zip_cd";
		/** IN:配送先住所１ */
		public static final String $i_tdlv_addr1 = "tdlv_addr1";
		/** IN:配送先住所２ */
		public static final String $i_tdlv_addr2 = "tdlv_addr2";
		/** IN:配送先住所３ */
		public static final String $i_tdlv_addr3 = "tdlv_addr3";
		/** IN:配送先住所４ */
		public static final String $i_tdlv_addr4 = "tdlv_addr4";
		/** IN:配送先ＴＥＬ */
		public static final String $i_tdlv_tel = "tdlv_tel";
		/** IN:配送先ＦＡＸ */
		public static final String $i_tdlv_fax = "tdlv_fax";
		/** IN:配送先部署 */
		public static final String $i_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** IN:配送先担当者 */
		public static final String $i_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** IN:配送先経由区分 */
		public static final String $i_via_dlv_typ = "via_dlv_typ";
		/** IN:配送先経由区分名 */
		public static final String $i_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** IN:預り売上 */
		public static final String $i_sls_cststk_flg = "sls_cststk_flg";
		/** IN:手配区分 */
		public static final String $i_proc_typ = "proc_typ";
		/** IN:分割区分 */
		public static final String $i_ship_schd_split_typ = "ship_schd_split_typ";
		/** IN:引当範囲区分 */
		public static final String $i_alloc_scope_typ = "alloc_scope_typ";
		/** IN:引当区分 */
		public static final String $i_alloc_typ = "alloc_typ";
		/** IN:販売単価取得区分 */
		public static final String $i_sls_upri_req_typ = "sls_upri_req_typ";
		/** IN:受注登録経由 */
		public static final String $i_from_slo_reg = "from_slo_reg";
		/** IN:品名不要ＦＬＧ */
		public static final String $i_sundry_itm_nm_rem_flg = "sundry_itm_nm_rem_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:品目入力補助検索区分 */
		public static final String $i_itm_is_srch_typ = "itm_is_srch_typ";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:品目別名１ */
		public static final String $o_itm_alt_nm1 = "itm_alt_nm1";
		/** OUT:品目別名２ */
		public static final String $o_itm_alt_nm2 = "itm_alt_nm2";
		/** OUT:品目別名３ */
		public static final String $o_itm_alt_nm3 = "itm_alt_nm3";
		/** OUT:品目別名４ */
		public static final String $o_itm_alt_nm4 = "itm_alt_nm4";
		/** OUT:品目区分 */
		public static final String $o_itm_typ = "itm_typ";
		/** OUT:品目区分名 */
		public static final String $o_itm_typ_nm = "itm_typ_nm";
		/** OUT:品目区分詳細ＣＤ */
		public static final String $o_itm_typ_d_cd = "itm_typ_d_cd";
		/** OUT:品目区分詳細名 */
		public static final String $o_itm_typ_d_nm = "itm_typ_d_nm";
		/** OUT:在庫管理区分 */
		public static final String $o_stk_mng_typ = "stk_mng_typ";
		/** OUT:在庫管理区分名 */
		public static final String $o_stk_mng_typ_nm = "stk_mng_typ_nm";
		/** OUT:資産管理区分 */
		public static final String $o_asset_mng_typ = "asset_mng_typ";
		/** OUT:資産管理区分名 */
		public static final String $o_asset_mng_typ_nm = "asset_mng_typ_nm";
		/** OUT:諸口品ＦＬＧ */
		public static final String $o_sundry_itm_flg = "sundry_itm_flg";
		/** OUT:品目分類ＣＤ１ */
		public static final String $o_itm_grp_cd1 = "itm_grp_cd1";
		/** OUT:品目分類名１ */
		public static final String $o_itm_grp_nm1 = "itm_grp_nm1";
		/** OUT:品目分類ＣＤ２ */
		public static final String $o_itm_grp_cd2 = "itm_grp_cd2";
		/** OUT:品目分類名２ */
		public static final String $o_itm_grp_nm2 = "itm_grp_nm2";
		/** OUT:品目分類ＣＤ３ */
		public static final String $o_itm_grp_cd3 = "itm_grp_cd3";
		/** OUT:品目分類名３ */
		public static final String $o_itm_grp_nm3 = "itm_grp_nm3";
		/** OUT:品目分類ＣＤ４ */
		public static final String $o_itm_grp_cd4 = "itm_grp_cd4";
		/** OUT:品目分類名４ */
		public static final String $o_itm_grp_nm4 = "itm_grp_nm4";
		/** OUT:品目分類ＣＤ５ */
		public static final String $o_itm_grp_cd5 = "itm_grp_cd5";
		/** OUT:品目分類名５ */
		public static final String $o_itm_grp_nm5 = "itm_grp_nm5";
		/** OUT:品目分類ＣＤ６ */
		public static final String $o_itm_grp_cd6 = "itm_grp_cd6";
		/** OUT:品目分類名６ */
		public static final String $o_itm_grp_nm6 = "itm_grp_nm6";
		/** OUT:品目分類ＣＤ７ */
		public static final String $o_itm_grp_cd7 = "itm_grp_cd7";
		/** OUT:品目分類名７ */
		public static final String $o_itm_grp_nm7 = "itm_grp_nm7";
		/** OUT:品目分類ＣＤ８ */
		public static final String $o_itm_grp_cd8 = "itm_grp_cd8";
		/** OUT:品目分類名８ */
		public static final String $o_itm_grp_nm8 = "itm_grp_nm8";
		/** OUT:品目分類ＣＤ９ */
		public static final String $o_itm_grp_cd9 = "itm_grp_cd9";
		/** OUT:品目分類名９ */
		public static final String $o_itm_grp_nm9 = "itm_grp_nm9";
		/** OUT:品目分類ＣＤ１０ */
		public static final String $o_itm_grp_cd10 = "itm_grp_cd10";
		/** OUT:品目分類名１０ */
		public static final String $o_itm_grp_nm10 = "itm_grp_nm10";
		/** OUT:リリースＦＬＧ */
		public static final String $o_release_flg = "release_flg";
		/** OUT:期間管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
		/** OUT:メモ１（共通） */
		public static final String $o_memo1_c = "memo1_c";
		/** OUT:メモ２（共通） */
		public static final String $o_memo2_c = "memo2_c";
		/** OUT:メモ３（共通） */
		public static final String $o_memo3_c = "memo3_c";
		/** OUT:メモ１ */
		public static final String $o_memo1 = "memo1";
		/** OUT:メモ２ */
		public static final String $o_memo2 = "memo2";
		/** OUT:メモ３ */
		public static final String $o_memo3 = "memo3";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:値引品目ＦＬＧ */
		public static final String $o_dscnt_itm_flg = "dscnt_itm_flg";
		/** OUT:単位ＣＤ */
		public static final String $o_unit_cd = "unit_cd";
		/** OUT:単位名 */
		public static final String $o_unit_nm = "unit_nm";
		/** OUT:小数部有効桁数 */
		public static final String $o_dec_place = "dec_place";
		/** OUT:端数処理区分 */
		public static final String $o_rnd_typ = "rnd_typ";
		/** OUT:端数処理区分名 */
		public static final String $o_rnd_typ_nm = "rnd_typ_nm";
		/** OUT:容積単位ＣＤ */
		public static final String $o_dim_unit_cd = "dim_unit_cd";
		/** OUT:容積 */
		public static final String $o_dim = "dim";
		/** OUT:重量単位ＣＤ */
		public static final String $o_wt_unit_cd = "wt_unit_cd";
		/** OUT:重量 */
		public static final String $o_wt = "wt";
		/** OUT:入り目単位ＣＤ */
		public static final String $o_conts_unit_cd = "conts_unit_cd";
		/** OUT:入り目数 */
		public static final String $o_conts_qty = "conts_qty";
		/** OUT:ＨＳ ＣＤ */
		public static final String $o_hs_cd = "hs_cd";
		/** OUT:販売品目体系ＣＤ */
		public static final String $o_sls_itm_grp_cd = "sls_itm_grp_cd";
		/** OUT:品目仕訳ＣＤ */
		public static final String $o_itm_jnl_cd = "itm_jnl_cd";
		/** OUT:会計品目分類ＣＤ */
		public static final String $o_ac_itm_grp_cd = "ac_itm_grp_cd";
		/** OUT:マイナス在庫許可ＦＬＧ */
		public static final String $o_minus_stk_flg = "minus_stk_flg";
		/** OUT:新規ロット入力不可ＦＬＧ */
		public static final String $o_not_new_lot_flg = "not_new_lot_flg";
		/** OUT:出庫引当確認ＦＬＧ */
		public static final String $o_gi_alloc_flg = "gi_alloc_flg";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
		/** OUT:出荷単位名 */
		public static final String $o_ship_unit_nm = "ship_unit_nm";
		/** OUT:出荷単位小数部有効桁数 */
		public static final String $o_ship_unit_dec_place = "ship_unit_dec_place";
		/** OUT:出荷単位分母数量 */
		public static final String $o_ship_unit_conv_base_qty = "ship_unit_conv_base_qty";
		/** OUT:出荷単位換算数量 */
		public static final String $o_ship_unit_conv_qty = "ship_unit_conv_qty";
		/** OUT:出荷単位数量 */
		public static final String $o_ship_unit_qty = "ship_unit_qty";
		/** OUT:製造単位ＣＤ */
		public static final String $o_mfg_unit_cd = "mfg_unit_cd";
		/** OUT:発注単位ＣＤ */
		public static final String $o_purc_unit_cd = "purc_unit_cd";
		/** OUT:梱包単位ＣＤ */
		public static final String $o_pckg_unit_cd = "pckg_unit_cd";
		/** OUT:荷姿引当ＦＬＧ */
		public static final String $o_pack_alloc_flg = "pack_alloc_flg";
		/** OUT:ロット管理区分 */
		public static final String $o_lot_mng_typ = "lot_mng_typ";
		/** OUT:ロット管理区分名 */
		public static final String $o_lot_mng_typ_nm = "lot_mng_typ_nm";
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番区分名 */
		public static final String $o_lot_no_typ_nm = "lot_no_typ_nm";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロット管理区分名 */
		public static final String $o_sublot_mng_typ_nm = "sublot_mng_typ_nm";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番区分名 */
		public static final String $o_sublot_no_typ_nm = "sublot_no_typ_nm";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:検査実施単位区分名 */
		public static final String $o_insp_bind_typ_nm = "insp_bind_typ_nm";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理種別 */
		public static final String $o_lmt_ctl_categ = "lmt_ctl_categ";
		/** OUT:有効成分対象ＦＬＧ */
		public static final String $o_cont_fctr_flg = "cont_fctr_flg";
		/** OUT:標準有効成分係数 */
		public static final String $o_std_cont_fctr = "std_cont_fctr";
		/** OUT:有効成分単位ＣＤ */
		public static final String $o_cont_fctr_unit_cd = "cont_fctr_unit_cd";
		/** OUT:有効成分単位名 */
		public static final String $o_cont_fctr_unit_nm = "cont_fctr_unit_nm";
		/** OUT:有効成分換算端数処理区分 */
		public static final String $o_cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
		/** OUT:有効成分換算端数処理区分名 */
		public static final String $o_cont_fctr_rnd_typ_nm = "cont_fctr_rnd_typ_nm";
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:手配ＮＯ１管理区分名 */
		public static final String $o_sno1_mng_typ_nm = "sno1_mng_typ_nm";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番区分名 */
		public static final String $o_sno1_num_typ_nm = "sno1_num_typ_nm";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:手配ＮＯ２管理区分名 */
		public static final String $o_sno2_mng_typ_nm = "sno2_mng_typ_nm";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番区分名 */
		public static final String $o_sno2_num_typ_nm = "sno2_num_typ_nm";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:手配ＮＯ３管理区分名 */
		public static final String $o_sno3_mng_typ_nm = "sno3_mng_typ_nm";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番区分名 */
		public static final String $o_sno3_num_typ_nm = "sno3_num_typ_nm";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:手配ＮＯ４管理区分名 */
		public static final String $o_sno4_mng_typ_nm = "sno4_mng_typ_nm";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番区分名 */
		public static final String $o_sno4_num_typ_nm = "sno4_num_typ_nm";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:構成パタン */
		public static final String $o_def_bom_ptn = "def_bom_ptn";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:製造指図単位区分名 */
		public static final String $o_mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
		/** OUT:ＭＲＰ処理区分名 */
		public static final String $o_mrp_proc_typ_nm = "mrp_proc_typ_nm";
		/** OUT:引当余裕日数 */
		public static final String $o_alloc_margin_days = "alloc_margin_days";
		/** OUT:ＭＲＰ引当余裕日数 */
		public static final String $o_mrp_alloc_margin_days = "mrp_alloc_margin_days";
		/** OUT:所要抑制量 */
		public static final String $o_rqmt_rstr_qty = "rqmt_rstr_qty";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:スケジューラＦＬＧ */
		public static final String $o_sch_flg = "sch_flg";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:原産地名 */
		public static final String $o_cntry_org_nm = "cntry_org_nm";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:構成・仕様管理区分名 */
		public static final String $o_comp_spec_typ_nm = "comp_spec_typ_nm";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:販売単価分類ＣＤ */
		public static final String $o_sls_upri_grp_cd = "sls_upri_grp_cd";
		/** OUT:請求繰越回数 */
		public static final String $o_itm_bill_crryovr_times = "itm_bill_crryovr_times";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
		/** OUT:受注手配区分名 */
		public static final String $o_slo_proc_typ_nm = "slo_proc_typ_nm";
		/** OUT:手配区分 */
		public static final String $o_proc_typ = "proc_typ";
		/** OUT:出荷指図区分 */
		public static final String $o_def_ship_inst_typ = "def_ship_inst_typ";
		/** OUT:出荷指図区分名 */
		public static final String $o_def_ship_inst_typ_nm = "def_ship_inst_typ_nm";
		/** OUT:指図区分 */
		public static final String $o_ship_inst_typ = "ship_inst_typ";
		/** OUT:出荷ロット逆転禁止ＦＬＧ */
		public static final String $o_ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
		/** OUT:品目出荷グループＣＤ */
		public static final String $o_itm_ship_grp_cd = "itm_ship_grp_cd";
		/** OUT:出荷有効期限グループＣＤ */
		public static final String $o_ship_valid_grp_cd = "ship_valid_grp_cd";
		/** OUT:入荷不要ＦＬＧ */
		public static final String $o_arr_skip_flg = "arr_skip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:出荷条件名 */
		public static final String $o_ship_term_nm = "ship_term_nm";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:輸出入諸掛区分名 */
		public static final String $o_exim_xpns_typ_nm = "exim_xpns_typ_nm";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:販売単価変更許可ＦＬＧ */
		public static final String $o_sls_upri_cng_flg = "sls_upri_cng_flg";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:参照品目ＣＤ */
		public static final String $o_ref_itm_cd = "ref_itm_cd";
		/** OUT:参照枝番１ */
		public static final String $o_ref_itm_sub1 = "ref_itm_sub1";
		/** OUT:参照枝番２ */
		public static final String $o_ref_itm_sub2 = "ref_itm_sub2";
		/** OUT:参照枝番３ */
		public static final String $o_ref_itm_sub3 = "ref_itm_sub3";
		/** OUT:外部システムＮＯ */
		public static final String $o_ext_sys_no_itm = "ext_sys_no_itm";
		/** OUT:計算パタンＣＤ */
		public static final String $o_calc_ptn_cd = "calc_ptn_cd";
		/** OUT:原価基準数 */
		public static final String $o_cost_std_qty = "cost_std_qty";
		/** OUT:品目配賦グループ */
		public static final String $o_itm_alc_grp = "itm_alc_grp";
		/** OUT:販売ＦＬＧ */
		public static final String $o_sls_flg = "sls_flg";
		/** OUT:製造ＦＬＧ */
		public static final String $o_mfg_flg = "mfg_flg";
		/** OUT:購買ＦＬＧ */
		public static final String $o_purc_flg = "purc_flg";
		/** OUT:検査ＦＬＧ */
		public static final String $o_insp_flg = "insp_flg";
		/** OUT:販売設定済ＦＬＧ */
		public static final String $o_sls_input_flg = "sls_input_flg";
		/** OUT:製造設定済ＦＬＧ */
		public static final String $o_mfg_input_flg = "mfg_input_flg";
		/** OUT:購買設定済ＦＬＧ */
		public static final String $o_purc_input_flg = "purc_input_flg";
		/** OUT:検査設定済ＦＬＧ */
		public static final String $o_insp_input_flg = "insp_input_flg";
		/** OUT:所要区分 */
		public static final String $o_rqmt_typ = "rqmt_typ";
		/** OUT:所要区分名 */
		public static final String $o_rqmt_typ_nm = "rqmt_typ_nm";
		/** OUT:生産計画立案区分 */
		public static final String $o_prod_pln_typ = "prod_pln_typ";
		/** OUT:生産計画立案区分名 */
		public static final String $o_prod_pln_typ_nm = "prod_pln_typ_nm";
		/** OUT:需要日ばらし月数 */
		public static final String $o_dmnd_date_div_mons = "dmnd_date_div_mons";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:取引先品目ＣＤ */
		public static final String $o_bp_itm_cd = "bp_itm_cd";
		/** OUT:取引先品名 */
		public static final String $o_bp_itm_nm = "bp_itm_nm";
		/** OUT:貸出 */
		public static final String $o_vmi_flg = "vmi_flg";
		/** OUT:インボイス表記品名 */
		public static final String $o_iv_itm_nm = "iv_itm_nm";
		/** OUT:取引通貨単価 */
		public static final String $o_trd_cur_upri = "trd_cur_upri";
		/** OUT:税ＣＤ */
		public static final String $o_tax_cd = "tax_cd";
		/** OUT:税名 */
		public static final String $o_tax_nm = "tax_nm";
		/** OUT:税率 */
		public static final String $o_tax_rate = "tax_rate";
		/** OUT:税区分 */
		public static final String $o_tax_typ = "tax_typ";
		/** OUT:内税 */
		public static final String $o_inc_tax_flg = "inc_tax_flg";
		/** OUT:値引理由ＣＤ */
		public static final String $o_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** OUT:値引理由名 */
		public static final String $o_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** OUT:原価単価 */
		public static final String $o_cost_upri = "cost_upri";
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:請求繰越回数 */
		public static final String $o_bill_crryovr_times = "bill_crryovr_times";
		/** OUT:出荷希望日 */
		public static final String $o_ship_rqst_dt = "ship_rqst_dt";
		/** OUT:出荷希望時刻 */
		public static final String $o_ship_rqst_hm = "ship_rqst_hm";
		/** OUT:納入希望日 */
		public static final String $o_dlv_rqst_dt = "dlv_rqst_dt";
		/** OUT:納入希望時刻 */
		public static final String $o_dlv_rqst_hm = "dlv_rqst_hm";
		/** OUT:曜日区分 */
		public static final String $o_dlv_day_week_typ = "dlv_day_week_typ";
		/** OUT:着曜日 */
		public static final String $o_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** OUT:納品先ＣＤ */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:納品先名 */
		public static final String $o_dlv_nm = "dlv_nm";
		/** OUT:納品先諸口 */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:価格印字 */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:納品先物流グループＣＤ */
		public static final String $o_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** OUT:納品先物流グループ名 */
		public static final String $o_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** OUT:納品先国ＣＤ */
		public static final String $o_dlv_cntry_cd = "dlv_cntry_cd";
		/** OUT:納品先国名 */
		public static final String $o_dlv_cntry_nm = "dlv_cntry_nm";
		/** OUT:納品先郵便番号 */
		public static final String $o_dlv_zip_cd = "dlv_zip_cd";
		/** OUT:納品先住所１ */
		public static final String $o_dlv_addr1 = "dlv_addr1";
		/** OUT:納品先住所２ */
		public static final String $o_dlv_addr2 = "dlv_addr2";
		/** OUT:納品先住所３ */
		public static final String $o_dlv_addr3 = "dlv_addr3";
		/** OUT:納品先住所４ */
		public static final String $o_dlv_addr4 = "dlv_addr4";
		/** OUT:納品先ＴＥＬ */
		public static final String $o_dlv_tel = "dlv_tel";
		/** OUT:納品先ＦＡＸ */
		public static final String $o_dlv_fax = "dlv_fax";
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:配送先必須 */
		public static final String $o_tdlv_req_flg = "tdlv_req_flg";
		/** OUT:仕向先ＣＤ１ */
		public static final String $o_dest_cd1 = "dest_cd1";
		/** OUT:仕向先１名 */
		public static final String $o_dest_nm1 = "dest_nm1";
		/** OUT:仕向先ＣＤ２ */
		public static final String $o_dest_cd2 = "dest_cd2";
		/** OUT:仕向先２名 */
		public static final String $o_dest_nm2 = "dest_nm2";
		/** OUT:仕向先ＣＤ３ */
		public static final String $o_dest_cd3 = "dest_cd3";
		/** OUT:仕向先３名 */
		public static final String $o_dest_nm3 = "dest_nm3";
		/** OUT:配送先ＣＤ */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:配送先名 */
		public static final String $o_tdlv_nm = "tdlv_nm";
		/** OUT:配送先諸口 */
		public static final String $o_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** OUT:配送先物流グループＣＤ */
		public static final String $o_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** OUT:配送先物流グループ名 */
		public static final String $o_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** OUT:配送先国ＣＤ */
		public static final String $o_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** OUT:配送先国名 */
		public static final String $o_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** OUT:配送先郵便番号 */
		public static final String $o_tdlv_zip_cd = "tdlv_zip_cd";
		/** OUT:配送先住所１ */
		public static final String $o_tdlv_addr1 = "tdlv_addr1";
		/** OUT:配送先住所２ */
		public static final String $o_tdlv_addr2 = "tdlv_addr2";
		/** OUT:配送先住所３ */
		public static final String $o_tdlv_addr3 = "tdlv_addr3";
		/** OUT:配送先住所４ */
		public static final String $o_tdlv_addr4 = "tdlv_addr4";
		/** OUT:配送先ＴＥＬ */
		public static final String $o_tdlv_tel = "tdlv_tel";
		/** OUT:配送先ＦＡＸ */
		public static final String $o_tdlv_fax = "tdlv_fax";
		/** OUT:配送先部署 */
		public static final String $o_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** OUT:配送先担当者 */
		public static final String $o_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:配送先経由区分名 */
		public static final String $o_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** OUT:預り売上 */
		public static final String $o_sls_cststk_flg = "sls_cststk_flg";
		/** OUT:格付ＣＤ */
		public static final String $o_gd_cd = "gd_cd";
		/** OUT:格付名 */
		public static final String $o_gd_nm = "gd_nm";
		/** OUT:分割区分 */
		public static final String $o_ship_schd_split_typ = "ship_schd_split_typ";
		/** OUT:引当範囲区分 */
		public static final String $o_alloc_scope_typ = "alloc_scope_typ";
		/** OUT:引当区分 */
		public static final String $o_alloc_typ = "alloc_typ";
		/** OUT:販売単価取得区分 */
		public static final String $o_sls_upri_req_typ = "sls_upri_req_typ";
		/** VIEW:枝番３ */
		public static final String $v_itm_sub3 = $o_itm_sub3;
		/** VIEW_NO:枝番３ */
		protected static final MCNumber $vn_itm_sub3 = new MCNumber(10);
		/** SORT:枝番３ */
		public static final String $s_itm_sub3 = $o_itm_sub3;
		/** SORT_NO:枝番３ */
		protected static final MCNumber $sn_itm_sub3 = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MAUAL0205";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "itm_cd,itm_sub1,itm_sub2";
		/** OTHER:リリースＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_on = "mode_release_flg_on";
		/** OTHER:リリースＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_off = "mode_release_flg_off";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_sub3);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_nm);
					add($o_itm_alt_nm1);
					add($o_itm_alt_nm2);
					add($o_itm_alt_nm3);
					add($o_itm_alt_nm4);
					add($o_itm_typ);
					add($o_itm_typ_nm);
					add($o_itm_typ_d_cd);
					add($o_itm_typ_d_nm);
					add($o_stk_mng_typ);
					add($o_stk_mng_typ_nm);
					add($o_asset_mng_typ);
					add($o_asset_mng_typ_nm);
					add($o_sundry_itm_flg);
					add($o_itm_grp_cd1);
					add($o_itm_grp_nm1);
					add($o_itm_grp_cd2);
					add($o_itm_grp_nm2);
					add($o_itm_grp_cd3);
					add($o_itm_grp_nm3);
					add($o_itm_grp_cd4);
					add($o_itm_grp_nm4);
					add($o_itm_grp_cd5);
					add($o_itm_grp_nm5);
					add($o_itm_grp_cd6);
					add($o_itm_grp_nm6);
					add($o_itm_grp_cd7);
					add($o_itm_grp_nm7);
					add($o_itm_grp_cd8);
					add($o_itm_grp_nm8);
					add($o_itm_grp_cd9);
					add($o_itm_grp_nm9);
					add($o_itm_grp_cd10);
					add($o_itm_grp_nm10);
					add($o_release_flg);
					add($o_lmt_ctl_flg);
					add($o_memo1_c);
					add($o_memo2_c);
					add($o_memo3_c);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_rnd_typ_nm);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_sls_itm_grp_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_ship_unit_cd);
					add($o_ship_unit_nm);
					add($o_ship_unit_dec_place);
					add($o_ship_unit_conv_base_qty);
					add($o_ship_unit_conv_qty);
					add($o_ship_unit_qty);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_mng_typ_nm);
					add($o_lot_no_typ);
					add($o_lot_no_typ_nm);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_mng_typ_nm);
					add($o_sublot_no_typ);
					add($o_sublot_no_typ_nm);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_insp_bind_typ_nm);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_rnd_typ_nm);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_sno1_mng_typ_nm);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_num_typ_nm);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_sno2_mng_typ_nm);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_num_typ_nm);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_sno3_mng_typ_nm);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_num_typ_nm);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_sno4_mng_typ_nm);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_num_typ_nm);
					add($o_sno4_ptn_cd);
					add($o_def_bom_ptn);
					add($o_mfg_inst_unit_typ);
					add($o_mfg_inst_unit_typ_nm);
					add($o_mrp_proc_typ);
					add($o_mrp_proc_typ_nm);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_cntry_org_cd);
					add($o_cntry_org_nm);
					add($o_comp_spec_typ);
					add($o_comp_spec_typ_nm);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_sls_upri_grp_cd);
					add($o_itm_bill_crryovr_times);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_slo_proc_typ_nm);
					add($o_proc_typ);
					add($o_def_ship_inst_typ);
					add($o_def_ship_inst_typ_nm);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_ship_term_cd);
					add($o_ship_term_nm);
					add($o_exim_xpns_typ);
					add($o_exim_xpns_typ_nm);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_sls_upri_cng_flg);
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_ref_itm_cd);
					add($o_ref_itm_sub1);
					add($o_ref_itm_sub2);
					add($o_ref_itm_sub3);
					add($o_ext_sys_no_itm);
					add($o_calc_ptn_cd);
					add($o_cost_std_qty);
					add($o_itm_alc_grp);
					add($o_sls_flg);
					add($o_mfg_flg);
					add($o_purc_flg);
					add($o_insp_flg);
					add($o_sls_input_flg);
					add($o_mfg_input_flg);
					add($o_purc_input_flg);
					add($o_insp_input_flg);
					add($o_rqmt_typ);
					add($o_rqmt_typ_nm);
					add($o_prod_pln_typ);
					add($o_prod_pln_typ_nm);
					add($o_dmnd_date_div_mons);
					add($o_mrp_opn_xfr_days);
					add($o_bp_itm_cd);
					add($o_bp_itm_nm);
					add($o_vmi_flg);
					add($o_iv_itm_nm);
					add($o_trd_cur_upri);
					add($o_tax_cd);
					add($o_tax_nm);
					add($o_tax_rate);
					add($o_tax_typ);
					add($o_inc_tax_flg);
					add($o_dscnt_rsn_cd);
					add($o_dscnt_rsn_nm);
					add($o_cost_upri);
					add($o_wtax_rate);
					add($o_bill_crryovr_times);
					add($o_ship_rqst_dt);
					add($o_ship_rqst_hm);
					add($o_dlv_rqst_dt);
					add($o_dlv_rqst_hm);
					add($o_dlv_day_week_typ);
					add($o_dlv_day_week_typ_nm);
					add($o_dlv_cd);
					add($o_dlv_nm);
					add($o_dlv_sundry_flg);
					add($o_pri_prnt_flg);
					add($o_dlv_lg_grp_cd);
					add($o_dlv_lg_grp_nm);
					add($o_dlv_cntry_cd);
					add($o_dlv_cntry_nm);
					add($o_dlv_zip_cd);
					add($o_dlv_addr1);
					add($o_dlv_addr2);
					add($o_dlv_addr3);
					add($o_dlv_addr4);
					add($o_dlv_tel);
					add($o_dlv_fax);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_prnt_lcl_cd);
					add($o_tdlv_req_flg);
					add($o_dest_cd1);
					add($o_dest_nm1);
					add($o_dest_cd2);
					add($o_dest_nm2);
					add($o_dest_cd3);
					add($o_dest_nm3);
					add($o_tdlv_cd);
					add($o_tdlv_nm);
					add($o_tdlv_sundry_flg);
					add($o_tdlv_lg_grp_cd);
					add($o_tdlv_lg_grp_nm);
					add($o_tdlv_cntry_cd);
					add($o_tdlv_cntry_nm);
					add($o_tdlv_zip_cd);
					add($o_tdlv_addr1);
					add($o_tdlv_addr2);
					add($o_tdlv_addr3);
					add($o_tdlv_addr4);
					add($o_tdlv_tel);
					add($o_tdlv_fax);
					add($o_tdlv_cntct_dpt);
					add($o_tdlv_cntct_psn);
					add($o_via_dlv_typ);
					add($o_via_dlv_typ_nm);
					add($o_sls_cststk_flg);
					add($o_gd_cd);
					add($o_gd_nm);
					add($o_ship_schd_split_typ);
					add($o_alloc_scope_typ);
					add($o_alloc_typ);
					add($o_sls_upri_req_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_sub3, $v_itm_sub3);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_sub3, $s_itm_sub3, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloItmSub3Cols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloItmSub3Cols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloItmSub3Cols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloItmSub3Cols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloItmSub3Cols extends MSUAC_List.SloItmSub3Cols_MC_A {
		//EIクラス
	}


	/** 
	  * SloTrd:カラム名クラス
	  */
	protected static class SloTrdCols_MC_A  {
		/** IN:取引パタン区分 */
		public static final String $i_trd_ptn_typ = "trd_ptn_typ";
		/** IN:機能ＩＤ */
		public static final String $i_func_id = "func_id";
		/** IN:売上部門CD */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:取引ＣＤ */
		public static final String $o_trd_cd = "trd_cd";
		/** OUT:取引名 */
		public static final String $o_trd_nm = "trd_nm";
		/** OUT:取引パタン区分 */
		public static final String $o_trd_ptn_typ = "trd_ptn_typ";
		/** VIEW:取引ＣＤ */
		public static final String $v_trd_cd = $o_trd_cd;
		/** VIEW_NO:取引ＣＤ */
		protected static final MCNumber $vn_trd_cd = new MCNumber(10);
		/** VIEW:取引名 */
		public static final String $v_trd_nm = $o_trd_nm;
		/** VIEW_NO:取引名 */
		protected static final MCNumber $vn_trd_nm = new MCNumber(20);
		/** SORT:取引ＣＤ */
		public static final String $s_trd_cd = $o_trd_cd;
		/** SORT_NO:取引ＣＤ */
		protected static final MCNumber $sn_trd_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MAUAL0046";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_trd_cd);
					add($o_trd_nm);
					add($o_trd_ptn_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_trd_cd, $v_trd_cd);
					put($vn_trd_nm, $v_trd_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_trd_cd, $s_trd_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloTrdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloTrdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloTrdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloTrdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloTrdCols extends MSUAC_List.SloTrdCols_MC_A {
		//EIクラス
	}


	/** 
	  * WrkNo:カラム名クラス
	  */
	protected static class WrkNoCols_MC_A  {
		/** IN:案件ＮＯ */
		public static final String $i_wrk_no = "wrk_no";
		/** IN:案件名 */
		public static final String $i_wrk_nm = "wrk_nm";
		/** IN:案件開始日ＦＲＯＭ */
		public static final String $i_st_dt_fr = "st_dt_fr";
		/** IN:案件開始日ＴＯ */
		public static final String $i_st_dt_to = "st_dt_to";
		/** IN:案件終了日ＦＲＯＭ */
		public static final String $i_end_dt_fr = "end_dt_fr";
		/** IN:案件終了日ＴＯ */
		public static final String $i_end_dt_to = "end_dt_to";
		/** IN:NULL文字使用フラグ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:案件ＮＯ */
		public static final String $o_wrk_no = "wrk_no";
		/** OUT:案件名 */
		public static final String $o_wrk_nm = "wrk_nm";
		/** OUT:案件開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:案件終了日 */
		public static final String $o_end_dt = "end_dt";
		/** VIEW:案件ＮＯ */
		public static final String $v_wrk_no = $o_wrk_no;
		/** VIEW_NO:案件ＮＯ */
		protected static final MCNumber $vn_wrk_no = new MCNumber(10);
		/** VIEW:案件名 */
		public static final String $v_wrk_nm = $o_wrk_nm;
		/** VIEW_NO:案件名 */
		protected static final MCNumber $vn_wrk_nm = new MCNumber(20);
		/** SORT:案件ＮＯ */
		public static final String $s_wrk_no = $o_wrk_no;
		/** SORT_NO:案件ＮＯ */
		protected static final MCNumber $sn_wrk_no = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0048";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1030";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_no);
					add($o_wrk_nm);
					add($o_st_dt);
					add($o_end_dt);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_no, $v_wrk_no);
					put($vn_wrk_nm, $v_wrk_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_no, $s_wrk_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WrkNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WrkNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WrkNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WrkNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WrkNoCols extends MSUAC_List.WrkNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * Sno1_WrkNo:カラム名クラス
	  */
	protected static class Sno1_WrkNoCols_MC_A  {
		/** IN:手配ＮＯ１ */
		public static final String $i_sno1 = "sno1";
		/** IN:案件ＮＯ */
		public static final String $i_wrk_no = "wrk_no";
		/** IN:案件名 */
		public static final String $i_wrk_nm = "wrk_nm";
		/** IN:案件開始日ＦＲＯＭ */
		public static final String $i_st_dt_fr = "st_dt_fr";
		/** IN:案件開始日ＴＯ */
		public static final String $i_st_dt_to = "st_dt_to";
		/** IN:案件終了日ＦＲＯＭ */
		public static final String $i_end_dt_fr = "end_dt_fr";
		/** IN:案件終了日ＴＯ */
		public static final String $i_end_dt_to = "end_dt_to";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:手配ＮＯ１ */
		public static final String $o_sno1 = "sno1";
		/** OUT:案件ＮＯ */
		public static final String $o_wrk_no = "wrk_no";
		/** OUT:案件名 */
		public static final String $o_wrk_nm = "wrk_nm";
		/** OUT:案件開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:案件終了日 */
		public static final String $o_end_dt = "end_dt";
		/** VIEW:手配ＮＯ１ */
		public static final String $v_sno1 = $o_sno1;
		/** VIEW_NO:手配ＮＯ１ */
		protected static final MCNumber $vn_sno1 = new MCNumber(10);
		/** VIEW:案件ＮＯ */
		public static final String $v_wrk_no = $o_wrk_no;
		/** VIEW_NO:案件ＮＯ */
		protected static final MCNumber $vn_wrk_no = new MCNumber(20);
		/** VIEW:案件名 */
		public static final String $v_wrk_nm = $o_wrk_nm;
		/** VIEW_NO:案件名 */
		protected static final MCNumber $vn_wrk_nm = new MCNumber(30);
		/** SORT:手配ＮＯ１ */
		public static final String $s_sno1 = $o_sno1;
		/** SORT_NO:手配ＮＯ１ */
		protected static final MCNumber $sn_sno1 = new MCNumber(10);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1040";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sno1);
					add($o_wrk_no);
					add($o_wrk_nm);
					add($o_st_dt);
					add($o_end_dt);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sno1, $v_sno1);
					put($vn_wrk_no, $v_wrk_no);
					put($vn_wrk_nm, $v_wrk_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sno1, $s_sno1, ASC);
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
		public static final String[] outAll(){return MSUAC_List.Sno1_WrkNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.Sno1_WrkNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.Sno1_WrkNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.Sno1_WrkNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class Sno1_WrkNoCols extends MSUAC_List.Sno1_WrkNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloNo:カラム名クラス
	  */
	protected static class SloNoCols_MC_A  {
		/** IN:受注明細検索ＦＬＧ */
		public static final String $i_slo_d_no_srh_flg = "slo_d_no_srh_flg";
		/** IN:参照権限ありのみＦＬＧ */
		public static final String $i_ref_auth_flg = "ref_auth_flg";
		/** IN:前受金入金対象のみＦＬＧ */
		public static final String $i_adv_rcv_flg = "adv_rcv_flg";
		/** IN:貸出ＦＬＧ */
		public static final String $i_vmi_flg = "vmi_flg";
		/** IN:受注ＮＯ */
		public static final String $i_slo_no = "slo_no";
		/** IN:受注明細ＮＯ */
		public static final String $i_in_slo_d_no = "in_slo_d_no";
		/** IN:受注明細ＮＯ */
		public static final String $i_slo_d_no = "slo_d_no";
		/** IN:受注日ＦＲＯＭ */
		public static final String $i_slo_dt_fr = "slo_dt_fr";
		/** IN:受注日ＴＯ */
		public static final String $i_slo_dt_to = "slo_dt_to";
		/** IN:得意先ＣＤ */
		public static final String $i_cst_cd = "cst_cd";
		/** IN:得意先名 */
		public static final String $i_cst_nm = "cst_nm";
		/** IN:売上担当者ＣＤ */
		public static final String $i_sls_usr_cd = "sls_usr_cd";
		/** IN:売上担当者名 */
		public static final String $i_sls_usr_nm = "sls_usr_nm";
		/** IN:売上部門ＣＤ */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** IN:売上部門名 */
		public static final String $i_sls_dpt_nm = "sls_dpt_nm";
		/** IN:案件ＮＯ */
		public static final String $i_wrk_no = "wrk_no";
		/** IN:案件名 */
		public static final String $i_wrk_nm = "wrk_nm";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:品名 */
		public static final String $i_itm_nm = "itm_nm";
		/** IN:得意先品目ＣＤ */
		public static final String $i_cst_itm_cd = "cst_itm_cd";
		/** IN:得意先品名 */
		public static final String $i_cst_itm_nm = "cst_itm_nm";
		/** OUT:受注ＮＯ */
		public static final String $o_slo_no = "slo_no";
		/** OUT:受注明細ＮＯ */
		public static final String $o_slo_d_no = "slo_d_no";
		/** OUT:受注日 */
		public static final String $o_slo_dt = "slo_dt";
		/** OUT:得意先ＣＤ */
		public static final String $o_cst_cd = "cst_cd";
		/** OUT:得意先名 */
		public static final String $o_cst_nm = "cst_nm";
		/** OUT:売上担当者ＣＤ */
		public static final String $o_sls_usr_cd = "sls_usr_cd";
		/** OUT:売上担当者名 */
		public static final String $o_sls_usr_nm = "sls_usr_nm";
		/** OUT:売上部門ＣＤ */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:売上部門名 */
		public static final String $o_sls_dpt_nm = "sls_dpt_nm";
		/** OUT:案件ＮＯ */
		public static final String $o_wrk_no = "wrk_no";
		/** OUT:案件名 */
		public static final String $o_wrk_nm = "wrk_nm";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:得意先品目ＣＤ */
		public static final String $o_cst_itm_cd = "cst_itm_cd";
		/** OUT:得意先品名 */
		public static final String $o_cst_itm_nm = "cst_itm_nm";
		/** OUT:取引パタン区分（存在チェック用） */
		public static final String $o_trd_ptn_typ = "trd_ptn_typ";
		/** OUT:貸出ＦＬＧ（存在チェック用） */
		public static final String $o_vmi_flg = "vmi_flg";
		/** VIEW:受注ＮＯ */
		public static final String $v_slo_no = $o_slo_no;
		/** VIEW_NO:受注ＮＯ */
		protected static final MCNumber $vn_slo_no = new MCNumber(10);
		/** VIEW:受注明細ＮＯ */
		public static final String $v_slo_d_no = $o_slo_d_no;
		/** VIEW_NO:受注明細ＮＯ */
		protected static final MCNumber $vn_slo_d_no = new MCNumber(20);
		/** SORT:受注ＮＯ */
		public static final String $s_slo_no = $o_slo_no;
		/** SORT_NO:受注ＮＯ */
		protected static final MCNumber $sn_slo_no = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0060";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1050";
		/** OTHER:受注明細検索ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_slo_d_no_srh_flg = "mode_slo_d_no_srh_flg";
		/** OTHER:前受金入金対象のみＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_adv_rcv_flg = "mode_adv_rcv_flg";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_no);
					add($o_slo_d_no);
					add($o_slo_dt);
					add($o_cst_cd);
					add($o_cst_nm);
					add($o_sls_usr_cd);
					add($o_sls_usr_nm);
					add($o_sls_dpt_cd);
					add($o_sls_dpt_nm);
					add($o_wrk_no);
					add($o_wrk_nm);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_itm_nm);
					add($o_cst_itm_cd);
					add($o_cst_itm_nm);
					add($o_trd_ptn_typ);
					add($o_vmi_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_no, $v_slo_no);
					put($vn_slo_d_no, $v_slo_d_no);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_no, $s_slo_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloNoCols extends MSUAC_List.SloNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * SetItm:カラム名クラス
	  */
	protected static class SetItmCols_MC_A  {
		/** IN:代表品目ＣＤ */
		public static final String $i_main_itm_cd = "main_itm_cd";
		/** IN:代表枝番１ */
		public static final String $i_main_itm_sub1 = "main_itm_sub1";
		/** IN:代表枝番２ */
		public static final String $i_main_itm_sub2 = "main_itm_sub2";
		/** IN:代表枝番３ */
		public static final String $i_main_itm_sub3 = "main_itm_sub3";
		/** IN:代表品名 */
		public static final String $i_main_itm_nm = "main_itm_nm";
		/** IN:代表品目単位ＣＤ */
		public static final String $i_main_itm_unit_cd = "main_itm_unit_cd";
		/** IN:品揃グループＣＤ */
		public static final String $i_set_grp_cd = "set_grp_cd";
		/** IN:品揃グループ名 */
		public static final String $i_set_grp_nm = "set_grp_nm";
		/** IN:適用日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:代表品目数量 */
		public static final String $i_main_itm_qty = "main_itm_qty";
		/** OUT:品揃グループＣＤ */
		public static final String $o_set_grp_cd = "set_grp_cd";
		/** OUT:品揃グループ名 */
		public static final String $o_set_grp_nm = "set_grp_nm";
		/** OUT:出荷品揃ＦＬＧ */
		public static final String $o_ship_assort_flg = "ship_assort_flg";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:代表品目ＣＤ */
		public static final String $o_main_itm_cd = "main_itm_cd";
		/** OUT:代表枝番１ */
		public static final String $o_main_itm_sub1 = "main_itm_sub1";
		/** OUT:代表枝番２ */
		public static final String $o_main_itm_sub2 = "main_itm_sub2";
		/** OUT:代表枝番３ */
		public static final String $o_main_itm_sub3 = "main_itm_sub3";
		/** OUT:代表品目単位ＣＤ */
		public static final String $o_main_itm_unit_cd = "main_itm_unit_cd";
		/** OUT:品揃品目ＣＤ */
		public static final String $o_set_itm_cd = "set_itm_cd";
		/** OUT:品揃枝番１ */
		public static final String $o_set_itm_sub1 = "set_itm_sub1";
		/** OUT:品揃枝番２ */
		public static final String $o_set_itm_sub2 = "set_itm_sub2";
		/** OUT:品揃枝番３ */
		public static final String $o_set_itm_sub3 = "set_itm_sub3";
		/** OUT:品揃品名 */
		public static final String $o_set_itm_nm = "set_itm_nm";
		/** OUT:小数部有効桁数 */
		public static final String $o_dec_place = "dec_place";
		/** OUT:品揃品目単位ＣＤ */
		public static final String $o_set_itm_unit_cd = "set_itm_unit_cd";
		/** OUT:品揃品目単位名 */
		public static final String $o_set_itm_unit_nm = "set_itm_unit_nm";
		/** OUT:代表品目数量 */
		public static final String $o_main_itm_qty = "main_itm_qty";
		/** OUT:品揃品目数量 */
		public static final String $o_set_itm_qty = "set_itm_qty";
		/** OUT:数量 */
		public static final String $o_qty = "qty";
		/** VIEW:品揃グループＣＤ */
		public static final String $v_set_grp_cd = $o_set_grp_cd;
		/** VIEW_NO:品揃グループＣＤ */
		protected static final MCNumber $vn_set_grp_cd = new MCNumber(10);
		/** VIEW:品揃品目ＣＤ */
		public static final String $v_set_itm_cd = $o_set_itm_cd;
		/** VIEW_NO:品揃品目ＣＤ */
		protected static final MCNumber $vn_set_itm_cd = new MCNumber(20);
		/** VIEW:品揃枝番１ */
		public static final String $v_set_itm_sub1 = $o_set_itm_sub1;
		/** VIEW_NO:品揃枝番１ */
		protected static final MCNumber $vn_set_itm_sub1 = new MCNumber(30);
		/** VIEW:品揃枝番２ */
		public static final String $v_set_itm_sub2 = $o_set_itm_sub2;
		/** VIEW_NO:品揃枝番２ */
		protected static final MCNumber $vn_set_itm_sub2 = new MCNumber(40);
		/** VIEW:品揃枝番３ */
		public static final String $v_set_itm_sub3 = $o_set_itm_sub3;
		/** VIEW_NO:品揃枝番３ */
		protected static final MCNumber $vn_set_itm_sub3 = new MCNumber(50);
		/** SORT:品揃グループＣＤ */
		public static final String $s_set_grp_cd = $o_set_grp_cd;
		/** SORT_NO:品揃グループＣＤ */
		protected static final MCNumber $sn_set_grp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBBL0134";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1090";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_set_grp_cd);
					add($o_set_grp_nm);
					add($o_ship_assort_flg);
					add($o_st_dt);
					add($o_end_dt);
					add($o_main_itm_cd);
					add($o_main_itm_sub1);
					add($o_main_itm_sub2);
					add($o_main_itm_sub3);
					add($o_main_itm_unit_cd);
					add($o_set_itm_cd);
					add($o_set_itm_sub1);
					add($o_set_itm_sub2);
					add($o_set_itm_sub3);
					add($o_set_itm_nm);
					add($o_dec_place);
					add($o_set_itm_unit_cd);
					add($o_set_itm_unit_nm);
					add($o_main_itm_qty);
					add($o_set_itm_qty);
					add($o_qty);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_set_grp_cd, $v_set_grp_cd);
					put($vn_set_itm_cd, $v_set_itm_cd);
					put($vn_set_itm_sub1, $v_set_itm_sub1);
					put($vn_set_itm_sub2, $v_set_itm_sub2);
					put($vn_set_itm_sub3, $v_set_itm_sub3);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_set_grp_cd, $s_set_grp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SetItmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SetItmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SetItmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SetItmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SetItmCols extends MSUAC_List.SetItmCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloItm:カラム名クラス
	  */
	protected static class SloItmCols_MC_A  {
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３ */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:品名 */
		public static final String $i_itm_nm = "itm_nm";
		/** IN:品目別名１ */
		public static final String $i_itm_alt_nm1 = "itm_alt_nm1";
		/** IN:品目別名２ */
		public static final String $i_itm_alt_nm2 = "itm_alt_nm2";
		/** IN:品目別名３ */
		public static final String $i_itm_alt_nm3 = "itm_alt_nm3";
		/** IN:品目別名４ */
		public static final String $i_itm_alt_nm4 = "itm_alt_nm4";
		/** IN:品目区分 */
		public static final String $i_itm_typ = "itm_typ";
		/** IN:品目区分詳細ＣＤ */
		public static final String $i_itm_typ_d_cd = "itm_typ_d_cd";
		/** IN:在庫管理区分 */
		public static final String $i_stk_mng_typ = "stk_mng_typ";
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** IN:諸口品ＦＬＧ.オン */
		public static final String $i_sundry_itm_flg_on = "sundry_itm_flg_on";
		/** IN:諸口品ＦＬＧ.オフ */
		public static final String $i_sundry_itm_flg_off = "sundry_itm_flg_off";
		/** IN:品目分類ＦＬＧ１ */
		public static final String $i_itm_grp_flg1 = "itm_grp_flg1";
		/** IN:品目分類ＣＤ１ */
		public static final String $i_itm_grp_cd1 = "itm_grp_cd1";
		/** IN:品目分類名１ */
		public static final String $i_itm_grp_nm1 = "itm_grp_nm1";
		/** IN:品目分類ＦＬＧ２ */
		public static final String $i_itm_grp_flg2 = "itm_grp_flg2";
		/** IN:品目分類ＣＤ２ */
		public static final String $i_itm_grp_cd2 = "itm_grp_cd2";
		/** IN:品目分類名２ */
		public static final String $i_itm_grp_nm2 = "itm_grp_nm2";
		/** IN:品目分類ＦＬＧ３ */
		public static final String $i_itm_grp_flg3 = "itm_grp_flg3";
		/** IN:品目分類ＣＤ３ */
		public static final String $i_itm_grp_cd3 = "itm_grp_cd3";
		/** IN:品目分類名３ */
		public static final String $i_itm_grp_nm3 = "itm_grp_nm3";
		/** IN:品目分類ＦＬＧ４ */
		public static final String $i_itm_grp_flg4 = "itm_grp_flg4";
		/** IN:品目分類ＣＤ４ */
		public static final String $i_itm_grp_cd4 = "itm_grp_cd4";
		/** IN:品目分類名４ */
		public static final String $i_itm_grp_nm4 = "itm_grp_nm4";
		/** IN:品目分類ＦＬＧ５ */
		public static final String $i_itm_grp_flg5 = "itm_grp_flg5";
		/** IN:品目分類ＣＤ５ */
		public static final String $i_itm_grp_cd5 = "itm_grp_cd5";
		/** IN:品目分類名５ */
		public static final String $i_itm_grp_nm5 = "itm_grp_nm5";
		/** IN:品目分類ＦＬＧ６ */
		public static final String $i_itm_grp_flg6 = "itm_grp_flg6";
		/** IN:品目分類ＣＤ６ */
		public static final String $i_itm_grp_cd6 = "itm_grp_cd6";
		/** IN:品目分類名６ */
		public static final String $i_itm_grp_nm6 = "itm_grp_nm6";
		/** IN:品目分類ＦＬＧ７ */
		public static final String $i_itm_grp_flg7 = "itm_grp_flg7";
		/** IN:品目分類ＣＤ７ */
		public static final String $i_itm_grp_cd7 = "itm_grp_cd7";
		/** IN:品目分類名７ */
		public static final String $i_itm_grp_nm7 = "itm_grp_nm7";
		/** IN:品目分類ＦＬＧ８ */
		public static final String $i_itm_grp_flg8 = "itm_grp_flg8";
		/** IN:品目分類ＣＤ８ */
		public static final String $i_itm_grp_cd8 = "itm_grp_cd8";
		/** IN:品目分類名８ */
		public static final String $i_itm_grp_nm8 = "itm_grp_nm8";
		/** IN:品目分類ＦＬＧ９ */
		public static final String $i_itm_grp_flg9 = "itm_grp_flg9";
		/** IN:品目分類ＣＤ９ */
		public static final String $i_itm_grp_cd9 = "itm_grp_cd9";
		/** IN:品目分類名９ */
		public static final String $i_itm_grp_nm9 = "itm_grp_nm9";
		/** IN:品目分類ＦＬＧ１０ */
		public static final String $i_itm_grp_flg10 = "itm_grp_flg10";
		/** IN:品目分類ＣＤ１０ */
		public static final String $i_itm_grp_cd10 = "itm_grp_cd10";
		/** IN:品目分類名１０ */
		public static final String $i_itm_grp_nm10 = "itm_grp_nm10";
		/** IN:リリースＦＬＧ.オン */
		public static final String $i_release_flg_on = "release_flg_on";
		/** IN:リリースＦＬＧ.オフ */
		public static final String $i_release_flg_off = "release_flg_off";
		/** IN:メモ１（共通） */
		public static final String $i_memo1_c = "memo1_c";
		/** IN:メモ２（共通） */
		public static final String $i_memo2_c = "memo2_c";
		/** IN:メモ３（共通） */
		public static final String $i_memo3_c = "memo3_c";
		/** IN:メモ１ */
		public static final String $i_memo1 = "memo1";
		/** IN:メモ２ */
		public static final String $i_memo2 = "memo2";
		/** IN:メモ３ */
		public static final String $i_memo3 = "memo3";
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:取引先名 */
		public static final String $i_bp_nm = "bp_nm";
		/** IN:適用日 */
		public static final String $i_dt = "dt";
		/** IN:取引パタン区分 */
		public static final String $i_trd_ptn_typ = "trd_ptn_typ";
		/** IN:納品先ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cd = "hdr_dlv_cd";
		/** IN:納品先名（ヘッダ） */
		public static final String $i_hdr_dlv_nm = "hdr_dlv_nm";
		/** IN:納品先諸口（ヘッダ） */
		public static final String $i_hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
		/** IN:価格印字（ヘッダ） */
		public static final String $i_hdr_pri_prnt_flg = "hdr_pri_prnt_flg";
		/** IN:納品先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_cd = "hdr_dlv_lg_grp_cd";
		/** IN:納品先物流グループ名（ヘッダ） */
		public static final String $i_hdr_dlv_lg_grp_nm = "hdr_dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_cd = "hdr_dlv_cntry_cd";
		/** IN:納品先国名（ヘッダ） */
		public static final String $i_hdr_dlv_cntry_nm = "hdr_dlv_cntry_nm";
		/** IN:納品先郵便番号（ヘッダ） */
		public static final String $i_hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
		/** IN:納品先住所１（ヘッダ） */
		public static final String $i_hdr_dlv_addr1 = "hdr_dlv_addr1";
		/** IN:納品先住所２（ヘッダ） */
		public static final String $i_hdr_dlv_addr2 = "hdr_dlv_addr2";
		/** IN:納品先住所３（ヘッダ） */
		public static final String $i_hdr_dlv_addr3 = "hdr_dlv_addr3";
		/** IN:納品先住所４（ヘッダ） */
		public static final String $i_hdr_dlv_addr4 = "hdr_dlv_addr4";
		/** IN:納品先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_dlv_tel = "hdr_dlv_tel";
		/** IN:納品先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_dlv_fax = "hdr_dlv_fax";
		/** IN:納品先部署（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
		/** IN:納品先担当者（ヘッダ） */
		public static final String $i_hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ（ヘッダ） */
		public static final String $i_hdr_prnt_lcl_cd = "hdr_prnt_lcl_cd";
		/** IN:仕向先ＣＤ１（ヘッダ） */
		public static final String $i_hdr_dest_cd1 = "hdr_dest_cd1";
		/** IN:仕向先１名（ヘッダ） */
		public static final String $i_hdr_dest_nm1 = "hdr_dest_nm1";
		/** IN:仕向先ＣＤ２（ヘッダ） */
		public static final String $i_hdr_dest_cd2 = "hdr_dest_cd2";
		/** IN:仕向先２名（ヘッダ） */
		public static final String $i_hdr_dest_nm2 = "hdr_dest_nm2";
		/** IN:仕向先ＣＤ３（ヘッダ） */
		public static final String $i_hdr_dest_cd3 = "hdr_dest_cd3";
		/** IN:仕向先３名（ヘッダ） */
		public static final String $i_hdr_dest_nm3 = "hdr_dest_nm3";
		/** IN:配送先ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cd = "hdr_tdlv_cd";
		/** IN:配送先名（ヘッダ） */
		public static final String $i_hdr_tdlv_nm = "hdr_tdlv_nm";
		/** IN:配送先諸口（ヘッダ） */
		public static final String $i_hdr_tdlv_sundry_flg = "hdr_tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_cd = "hdr_tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名（ヘッダ） */
		public static final String $i_hdr_tdlv_lg_grp_nm = "hdr_tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_cd = "hdr_tdlv_cntry_cd";
		/** IN:配送先国名（ヘッダ） */
		public static final String $i_hdr_tdlv_cntry_nm = "hdr_tdlv_cntry_nm";
		/** IN:配送先郵便番号（ヘッダ） */
		public static final String $i_hdr_tdlv_zip_cd = "hdr_tdlv_zip_cd";
		/** IN:配送先住所１（ヘッダ） */
		public static final String $i_hdr_tdlv_addr1 = "hdr_tdlv_addr1";
		/** IN:配送先住所２（ヘッダ） */
		public static final String $i_hdr_tdlv_addr2 = "hdr_tdlv_addr2";
		/** IN:配送先住所３（ヘッダ） */
		public static final String $i_hdr_tdlv_addr3 = "hdr_tdlv_addr3";
		/** IN:配送先住所４（ヘッダ） */
		public static final String $i_hdr_tdlv_addr4 = "hdr_tdlv_addr4";
		/** IN:配送先ＴＥＬ（ヘッダ） */
		public static final String $i_hdr_tdlv_tel = "hdr_tdlv_tel";
		/** IN:配送先ＦＡＸ（ヘッダ） */
		public static final String $i_hdr_tdlv_fax = "hdr_tdlv_fax";
		/** IN:配送先部署（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_dpt = "hdr_tdlv_cntct_dpt";
		/** IN:配送先担当者（ヘッダ） */
		public static final String $i_hdr_tdlv_cntct_psn = "hdr_tdlv_cntct_psn";
		/** IN:配送先経由区分（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ = "hdr_via_dlv_typ";
		/** IN:配送先経由区分名（ヘッダ） */
		public static final String $i_hdr_via_dlv_typ_nm = "hdr_via_dlv_typ_nm";
		/** IN:配送先必須（ヘッダ） */
		public static final String $i_hdr_tdlv_req_flg = "hdr_tdlv_req_flg";
		/** IN:売上計上区分 */
		public static final String $i_sls_basis_typ = "sls_basis_typ";
		/** IN:ワーキンググループＣＤ（ヘッダ） */
		public static final String $i_hdr_wg_cd = "hdr_wg_cd";
		/** IN:取引通貨ＣＤ */
		public static final String $i_trd_cur_cd = "trd_cur_cd";
		/** IN:基準通貨ＣＤ */
		public static final String $i_base_cur_cd = "base_cur_cd";
		/** IN:納税通貨ＣＤ */
		public static final String $i_ptax_cur_cd = "ptax_cur_cd";
		/** IN:得意先インボイス取引 */
		public static final String $i_cst_iv_flg = "cst_iv_flg";
		/** IN:請求繰越回数 */
		public static final String $i_cst_bill_crryovr_times = "cst_bill_crryovr_times";
		/** IN:販売単価取得区分（ヘッダ） */
		public static final String $i_hdr_sls_upri_req_typ = "hdr_sls_upri_req_typ";
		/** IN:出荷予定分割区分（ヘッダ） */
		public static final String $i_hdr_ship_schd_split_typ = "hdr_ship_schd_split_typ";
		/** IN:品揃区分 */
		public static final String $i_assort_typ = "assort_typ";
		/** IN:インボイスＮＯ */
		public static final String $i_iv_no = "iv_no";
		/** IN:自動 */
		public static final String $i_iv_num_flg = "iv_num_flg";
		/** IN:出荷希望日（ヘッダ） */
		public static final String $i_hdr_ship_rqst_dt = "hdr_ship_rqst_dt";
		/** IN:出荷希望時刻（ヘッダ） */
		public static final String $i_hdr_ship_rqst_hm = "hdr_ship_rqst_hm";
		/** IN:納入希望日（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_dt = "hdr_dlv_rqst_dt";
		/** IN:納入希望時刻（ヘッダ） */
		public static final String $i_hdr_dlv_rqst_hm = "hdr_dlv_rqst_hm";
		/** IN:曜日区分（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ = "hdr_dlv_day_week_typ";
		/** IN:着曜日（ヘッダ） */
		public static final String $i_hdr_dlv_day_week_typ_nm = "hdr_dlv_day_week_typ_nm";
		/** IN:貸出 */
		public static final String $i_vmi_flg = "vmi_flg";
		/** IN:取引単位数量 */
		public static final String $i_trd_unit_qty = "trd_unit_qty";
		/** IN:取引通貨単価 */
		public static final String $i_trd_cur_upri = "trd_cur_upri";
		/** IN:税ＣＤ */
		public static final String $i_tax_cd = "tax_cd";
		/** IN:税名 */
		public static final String $i_tax_nm = "tax_nm";
		/** IN:税率 */
		public static final String $i_tax_rate = "tax_rate";
		/** IN:税区分 */
		public static final String $i_tax_typ = "tax_typ";
		/** IN:内税 */
		public static final String $i_inc_tax_flg = "inc_tax_flg";
		/** IN:値引理由ＣＤ */
		public static final String $i_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** IN:値引理由名 */
		public static final String $i_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** IN:原価単価 */
		public static final String $i_cost_upri = "cost_upri";
		/** IN:請求繰越回数 */
		public static final String $i_bill_crryovr_times = "bill_crryovr_times";
		/** IN:品揃グループＮＯ */
		public static final String $i_set_itm_grp_no = "set_itm_grp_no";
		/** IN:出荷希望日 */
		public static final String $i_ship_rqst_dt = "ship_rqst_dt";
		/** IN:出荷希望日編集可否 */
		public static final String $i_is_editable_ship_rqst_dt = "is_editable_ship_rqst_dt";
		/** IN:出荷希望時刻 */
		public static final String $i_ship_rqst_hm = "ship_rqst_hm";
		/** IN:出荷希望時刻編集可否 */
		public static final String $i_is_editable_ship_rqst_hm = "is_editable_ship_rqst_hm";
		/** IN:納入希望日 */
		public static final String $i_dlv_rqst_dt = "dlv_rqst_dt";
		/** IN:納入希望日編集可否 */
		public static final String $i_is_editable_dlv_rqst_dt = "is_editable_dlv_rqst_dt";
		/** IN:納入希望時刻 */
		public static final String $i_dlv_rqst_hm = "dlv_rqst_hm";
		/** IN:納入希望時刻編集可否 */
		public static final String $i_is_editable_dlv_rqst_hm = "is_editable_dlv_rqst_hm";
		/** IN:曜日区分 */
		public static final String $i_dlv_day_week_typ = "dlv_day_week_typ";
		/** IN:着曜日 */
		public static final String $i_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** IN:着曜日編集可否 */
		public static final String $i_is_editable_dlv_day_week_typ_nm = "is_editable_dlv_day_week_typ_nm";
		/** IN:売上予定日 */
		public static final String $i_sls_schd_dt = "sls_schd_dt";
		/** IN:納品先ＣＤ編集可否 */
		public static final String $i_is_editable_dlv_cd = "is_editable_dlv_cd";
		/** IN:納品先ＣＤ */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:納品先名 */
		public static final String $i_dlv_nm = "dlv_nm";
		/** IN:納品先諸口 */
		public static final String $i_dlv_sundry_flg = "dlv_sundry_flg";
		/** IN:価格印字 */
		public static final String $i_pri_prnt_flg = "pri_prnt_flg";
		/** IN:納品先物流グループＣＤ */
		public static final String $i_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** IN:納品先物流グループ名 */
		public static final String $i_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** IN:納品先国ＣＤ */
		public static final String $i_dlv_cntry_cd = "dlv_cntry_cd";
		/** IN:納品先国名 */
		public static final String $i_dlv_cntry_nm = "dlv_cntry_nm";
		/** IN:納品先郵便番号 */
		public static final String $i_dlv_zip_cd = "dlv_zip_cd";
		/** IN:納品先住所１ */
		public static final String $i_dlv_addr1 = "dlv_addr1";
		/** IN:納品先住所２ */
		public static final String $i_dlv_addr2 = "dlv_addr2";
		/** IN:納品先住所３ */
		public static final String $i_dlv_addr3 = "dlv_addr3";
		/** IN:納品先住所４ */
		public static final String $i_dlv_addr4 = "dlv_addr4";
		/** IN:納品先ＴＥＬ */
		public static final String $i_dlv_tel = "dlv_tel";
		/** IN:納品先ＦＡＸ */
		public static final String $i_dlv_fax = "dlv_fax";
		/** IN:納品先部署 */
		public static final String $i_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** IN:納品先担当者 */
		public static final String $i_dlv_cntct_psn = "dlv_cntct_psn";
		/** IN:帳票出力ロケールＣＤ */
		public static final String $i_prnt_lcl_cd = "prnt_lcl_cd";
		/** IN:配送先必須 */
		public static final String $i_tdlv_req_flg = "tdlv_req_flg";
		/** IN:仕向先ＣＤ１編集可否 */
		public static final String $i_is_editable_dest_cd1 = "is_editable_dest_cd1";
		/** IN:仕向先ＣＤ１ */
		public static final String $i_dest_cd1 = "dest_cd1";
		/** IN:仕向先１名 */
		public static final String $i_dest_nm1 = "dest_nm1";
		/** IN:仕向先ＣＤ２編集可否 */
		public static final String $i_is_editable_dest_cd2 = "is_editable_dest_cd2";
		/** IN:仕向先ＣＤ２ */
		public static final String $i_dest_cd2 = "dest_cd2";
		/** IN:仕向先２名 */
		public static final String $i_dest_nm2 = "dest_nm2";
		/** IN:仕向先ＣＤ３編集可否 */
		public static final String $i_is_editable_dest_cd3 = "is_editable_dest_cd3";
		/** IN:仕向先ＣＤ３ */
		public static final String $i_dest_cd3 = "dest_cd3";
		/** IN:仕向先３名 */
		public static final String $i_dest_nm3 = "dest_nm3";
		/** IN:配送先ＣＤ編集可否 */
		public static final String $i_is_editable_tdlv_cd = "is_editable_tdlv_cd";
		/** IN:配送先ＣＤ */
		public static final String $i_tdlv_cd = "tdlv_cd";
		/** IN:配送先名 */
		public static final String $i_tdlv_nm = "tdlv_nm";
		/** IN:配送先諸口 */
		public static final String $i_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** IN:配送先物流グループＣＤ */
		public static final String $i_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** IN:配送先物流グループ名 */
		public static final String $i_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** IN:配送先国ＣＤ */
		public static final String $i_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** IN:配送先国名 */
		public static final String $i_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** IN:配送先郵便番号 */
		public static final String $i_tdlv_zip_cd = "tdlv_zip_cd";
		/** IN:配送先住所１ */
		public static final String $i_tdlv_addr1 = "tdlv_addr1";
		/** IN:配送先住所２ */
		public static final String $i_tdlv_addr2 = "tdlv_addr2";
		/** IN:配送先住所３ */
		public static final String $i_tdlv_addr3 = "tdlv_addr3";
		/** IN:配送先住所４ */
		public static final String $i_tdlv_addr4 = "tdlv_addr4";
		/** IN:配送先ＴＥＬ */
		public static final String $i_tdlv_tel = "tdlv_tel";
		/** IN:配送先ＦＡＸ */
		public static final String $i_tdlv_fax = "tdlv_fax";
		/** IN:配送先部署 */
		public static final String $i_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** IN:配送先担当者 */
		public static final String $i_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** IN:配送先経由区分 */
		public static final String $i_via_dlv_typ = "via_dlv_typ";
		/** IN:配送先経由区分名 */
		public static final String $i_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** IN:預り売上 */
		public static final String $i_sls_cststk_flg = "sls_cststk_flg";
		/** IN:手配区分 */
		public static final String $i_proc_typ = "proc_typ";
		/** IN:分割区分 */
		public static final String $i_ship_schd_split_typ = "ship_schd_split_typ";
		/** IN:引当範囲区分 */
		public static final String $i_alloc_scope_typ = "alloc_scope_typ";
		/** IN:引当区分 */
		public static final String $i_alloc_typ = "alloc_typ";
		/** IN:販売単価取得区分 */
		public static final String $i_sls_upri_req_typ = "sls_upri_req_typ";
		/** IN:受注登録経由 */
		public static final String $i_from_slo_reg = "from_slo_reg";
		/** IN:取引先品目ＣＤ */
		public static final String $i_bp_itm_cd = "bp_itm_cd";
		/** IN:取引先品名 */
		public static final String $i_bp_itm_nm = "bp_itm_nm";
		/** IN:レポートキーＣＤ */
		public static final String $i_rpt_key_cd = "rpt_key_cd";
		/** IN:レポートキー名 */
		public static final String $i_rpt_key_nm = "rpt_key_nm";
		/** IN:品名不要ＦＬＧ */
		public static final String $i_sundry_itm_nm_rem_flg = "sundry_itm_nm_rem_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:品目入力補助検索区分 */
		public static final String $i_itm_is_srch_typ = "itm_is_srch_typ";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:品目別名１ */
		public static final String $o_itm_alt_nm1 = "itm_alt_nm1";
		/** OUT:品目別名２ */
		public static final String $o_itm_alt_nm2 = "itm_alt_nm2";
		/** OUT:品目別名３ */
		public static final String $o_itm_alt_nm3 = "itm_alt_nm3";
		/** OUT:品目別名４ */
		public static final String $o_itm_alt_nm4 = "itm_alt_nm4";
		/** OUT:品目区分 */
		public static final String $o_itm_typ = "itm_typ";
		/** OUT:品目区分名 */
		public static final String $o_itm_typ_nm = "itm_typ_nm";
		/** OUT:品目区分詳細ＣＤ */
		public static final String $o_itm_typ_d_cd = "itm_typ_d_cd";
		/** OUT:品目区分詳細名 */
		public static final String $o_itm_typ_d_nm = "itm_typ_d_nm";
		/** OUT:在庫管理区分 */
		public static final String $o_stk_mng_typ = "stk_mng_typ";
		/** OUT:在庫管理区分名 */
		public static final String $o_stk_mng_typ_nm = "stk_mng_typ_nm";
		/** OUT:資産管理区分 */
		public static final String $o_asset_mng_typ = "asset_mng_typ";
		/** OUT:資産管理区分名 */
		public static final String $o_asset_mng_typ_nm = "asset_mng_typ_nm";
		/** OUT:諸口品ＦＬＧ */
		public static final String $o_sundry_itm_flg = "sundry_itm_flg";
		/** OUT:品目分類ＣＤ１ */
		public static final String $o_itm_grp_cd1 = "itm_grp_cd1";
		/** OUT:品目分類名１ */
		public static final String $o_itm_grp_nm1 = "itm_grp_nm1";
		/** OUT:品目分類ＣＤ２ */
		public static final String $o_itm_grp_cd2 = "itm_grp_cd2";
		/** OUT:品目分類名２ */
		public static final String $o_itm_grp_nm2 = "itm_grp_nm2";
		/** OUT:品目分類ＣＤ３ */
		public static final String $o_itm_grp_cd3 = "itm_grp_cd3";
		/** OUT:品目分類名３ */
		public static final String $o_itm_grp_nm3 = "itm_grp_nm3";
		/** OUT:品目分類ＣＤ４ */
		public static final String $o_itm_grp_cd4 = "itm_grp_cd4";
		/** OUT:品目分類名４ */
		public static final String $o_itm_grp_nm4 = "itm_grp_nm4";
		/** OUT:品目分類ＣＤ５ */
		public static final String $o_itm_grp_cd5 = "itm_grp_cd5";
		/** OUT:品目分類名５ */
		public static final String $o_itm_grp_nm5 = "itm_grp_nm5";
		/** OUT:品目分類ＣＤ６ */
		public static final String $o_itm_grp_cd6 = "itm_grp_cd6";
		/** OUT:品目分類名６ */
		public static final String $o_itm_grp_nm6 = "itm_grp_nm6";
		/** OUT:品目分類ＣＤ７ */
		public static final String $o_itm_grp_cd7 = "itm_grp_cd7";
		/** OUT:品目分類名７ */
		public static final String $o_itm_grp_nm7 = "itm_grp_nm7";
		/** OUT:品目分類ＣＤ８ */
		public static final String $o_itm_grp_cd8 = "itm_grp_cd8";
		/** OUT:品目分類名８ */
		public static final String $o_itm_grp_nm8 = "itm_grp_nm8";
		/** OUT:品目分類ＣＤ９ */
		public static final String $o_itm_grp_cd9 = "itm_grp_cd9";
		/** OUT:品目分類名９ */
		public static final String $o_itm_grp_nm9 = "itm_grp_nm9";
		/** OUT:品目分類ＣＤ１０ */
		public static final String $o_itm_grp_cd10 = "itm_grp_cd10";
		/** OUT:品目分類名１０ */
		public static final String $o_itm_grp_nm10 = "itm_grp_nm10";
		/** OUT:リリースＦＬＧ */
		public static final String $o_release_flg = "release_flg";
		/** OUT:期間管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
		/** OUT:メモ１（共通） */
		public static final String $o_memo1_c = "memo1_c";
		/** OUT:メモ２（共通） */
		public static final String $o_memo2_c = "memo2_c";
		/** OUT:メモ３（共通） */
		public static final String $o_memo3_c = "memo3_c";
		/** OUT:メモ１ */
		public static final String $o_memo1 = "memo1";
		/** OUT:メモ２ */
		public static final String $o_memo2 = "memo2";
		/** OUT:メモ３ */
		public static final String $o_memo3 = "memo3";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:値引品目ＦＬＧ */
		public static final String $o_dscnt_itm_flg = "dscnt_itm_flg";
		/** OUT:単位ＣＤ */
		public static final String $o_unit_cd = "unit_cd";
		/** OUT:単位名 */
		public static final String $o_unit_nm = "unit_nm";
		/** OUT:小数部有効桁数 */
		public static final String $o_dec_place = "dec_place";
		/** OUT:端数処理区分 */
		public static final String $o_rnd_typ = "rnd_typ";
		/** OUT:端数処理区分名 */
		public static final String $o_rnd_typ_nm = "rnd_typ_nm";
		/** OUT:容積単位ＣＤ */
		public static final String $o_dim_unit_cd = "dim_unit_cd";
		/** OUT:容積 */
		public static final String $o_dim = "dim";
		/** OUT:重量単位ＣＤ */
		public static final String $o_wt_unit_cd = "wt_unit_cd";
		/** OUT:重量 */
		public static final String $o_wt = "wt";
		/** OUT:入り目単位ＣＤ */
		public static final String $o_conts_unit_cd = "conts_unit_cd";
		/** OUT:入り目数 */
		public static final String $o_conts_qty = "conts_qty";
		/** OUT:ＨＳ ＣＤ */
		public static final String $o_hs_cd = "hs_cd";
		/** OUT:販売品目体系ＣＤ */
		public static final String $o_sls_itm_grp_cd = "sls_itm_grp_cd";
		/** OUT:品目仕訳ＣＤ */
		public static final String $o_itm_jnl_cd = "itm_jnl_cd";
		/** OUT:会計品目分類ＣＤ */
		public static final String $o_ac_itm_grp_cd = "ac_itm_grp_cd";
		/** OUT:マイナス在庫許可ＦＬＧ */
		public static final String $o_minus_stk_flg = "minus_stk_flg";
		/** OUT:新規ロット入力不可ＦＬＧ */
		public static final String $o_not_new_lot_flg = "not_new_lot_flg";
		/** OUT:出庫引当確認ＦＬＧ */
		public static final String $o_gi_alloc_flg = "gi_alloc_flg";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
		/** OUT:出荷単位名 */
		public static final String $o_ship_unit_nm = "ship_unit_nm";
		/** OUT:出荷単位小数部有効桁数 */
		public static final String $o_ship_unit_dec_place = "ship_unit_dec_place";
		/** OUT:出荷単位分母数量 */
		public static final String $o_ship_unit_conv_base_qty = "ship_unit_conv_base_qty";
		/** OUT:出荷単位換算数量 */
		public static final String $o_ship_unit_conv_qty = "ship_unit_conv_qty";
		/** OUT:出荷単位数量 */
		public static final String $o_ship_unit_qty = "ship_unit_qty";
		/** OUT:製造単位ＣＤ */
		public static final String $o_mfg_unit_cd = "mfg_unit_cd";
		/** OUT:発注単位ＣＤ */
		public static final String $o_purc_unit_cd = "purc_unit_cd";
		/** OUT:梱包単位ＣＤ */
		public static final String $o_pckg_unit_cd = "pckg_unit_cd";
		/** OUT:荷姿引当ＦＬＧ */
		public static final String $o_pack_alloc_flg = "pack_alloc_flg";
		/** OUT:ロット管理区分 */
		public static final String $o_lot_mng_typ = "lot_mng_typ";
		/** OUT:ロット管理区分名 */
		public static final String $o_lot_mng_typ_nm = "lot_mng_typ_nm";
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番区分名 */
		public static final String $o_lot_no_typ_nm = "lot_no_typ_nm";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロット管理区分名 */
		public static final String $o_sublot_mng_typ_nm = "sublot_mng_typ_nm";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番区分名 */
		public static final String $o_sublot_no_typ_nm = "sublot_no_typ_nm";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:検査実施単位区分名 */
		public static final String $o_insp_bind_typ_nm = "insp_bind_typ_nm";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理種別 */
		public static final String $o_lmt_ctl_categ = "lmt_ctl_categ";
		/** OUT:有効成分対象ＦＬＧ */
		public static final String $o_cont_fctr_flg = "cont_fctr_flg";
		/** OUT:標準有効成分係数 */
		public static final String $o_std_cont_fctr = "std_cont_fctr";
		/** OUT:有効成分単位ＣＤ */
		public static final String $o_cont_fctr_unit_cd = "cont_fctr_unit_cd";
		/** OUT:有効成分単位名 */
		public static final String $o_cont_fctr_unit_nm = "cont_fctr_unit_nm";
		/** OUT:有効成分換算端数処理区分 */
		public static final String $o_cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
		/** OUT:有効成分換算端数処理区分名 */
		public static final String $o_cont_fctr_rnd_typ_nm = "cont_fctr_rnd_typ_nm";
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:手配ＮＯ１管理区分名 */
		public static final String $o_sno1_mng_typ_nm = "sno1_mng_typ_nm";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番区分名 */
		public static final String $o_sno1_num_typ_nm = "sno1_num_typ_nm";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:手配ＮＯ２管理区分名 */
		public static final String $o_sno2_mng_typ_nm = "sno2_mng_typ_nm";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番区分名 */
		public static final String $o_sno2_num_typ_nm = "sno2_num_typ_nm";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:手配ＮＯ３管理区分名 */
		public static final String $o_sno3_mng_typ_nm = "sno3_mng_typ_nm";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番区分名 */
		public static final String $o_sno3_num_typ_nm = "sno3_num_typ_nm";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:手配ＮＯ４管理区分名 */
		public static final String $o_sno4_mng_typ_nm = "sno4_mng_typ_nm";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番区分名 */
		public static final String $o_sno4_num_typ_nm = "sno4_num_typ_nm";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:構成パタン */
		public static final String $o_def_bom_ptn = "def_bom_ptn";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:製造指図単位区分名 */
		public static final String $o_mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
		/** OUT:ＭＲＰ処理区分名 */
		public static final String $o_mrp_proc_typ_nm = "mrp_proc_typ_nm";
		/** OUT:引当余裕日数 */
		public static final String $o_alloc_margin_days = "alloc_margin_days";
		/** OUT:ＭＲＰ引当余裕日数 */
		public static final String $o_mrp_alloc_margin_days = "mrp_alloc_margin_days";
		/** OUT:所要抑制量 */
		public static final String $o_rqmt_rstr_qty = "rqmt_rstr_qty";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:スケジューラＦＬＧ */
		public static final String $o_sch_flg = "sch_flg";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:原産地名 */
		public static final String $o_cntry_org_nm = "cntry_org_nm";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:構成・仕様管理区分名 */
		public static final String $o_comp_spec_typ_nm = "comp_spec_typ_nm";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:販売単価分類ＣＤ */
		public static final String $o_sls_upri_grp_cd = "sls_upri_grp_cd";
		/** OUT:請求繰越回数 */
		public static final String $o_itm_bill_crryovr_times = "itm_bill_crryovr_times";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
		/** OUT:受注手配区分名 */
		public static final String $o_slo_proc_typ_nm = "slo_proc_typ_nm";
		/** OUT:手配区分 */
		public static final String $o_proc_typ = "proc_typ";
		/** OUT:出荷指図区分（マスタ） */
		public static final String $o_def_ship_inst_typ = "def_ship_inst_typ";
		/** OUT:出荷指図区分名（マスタ） */
		public static final String $o_def_ship_inst_typ_nm = "def_ship_inst_typ_nm";
		/** OUT:出荷指図区分 */
		public static final String $o_ship_inst_typ = "ship_inst_typ";
		/** OUT:出荷ロット逆転禁止ＦＬＧ */
		public static final String $o_ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
		/** OUT:品目出荷グループＣＤ */
		public static final String $o_itm_ship_grp_cd = "itm_ship_grp_cd";
		/** OUT:出荷有効期限グループＣＤ */
		public static final String $o_ship_valid_grp_cd = "ship_valid_grp_cd";
		/** OUT:入荷不要ＦＬＧ */
		public static final String $o_arr_skip_flg = "arr_skip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:出荷条件名 */
		public static final String $o_ship_term_nm = "ship_term_nm";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:輸出入諸掛区分名 */
		public static final String $o_exim_xpns_typ_nm = "exim_xpns_typ_nm";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:販売単価変更許可ＦＬＧ */
		public static final String $o_sls_upri_cng_flg = "sls_upri_cng_flg";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:参照品目ＣＤ */
		public static final String $o_ref_itm_cd = "ref_itm_cd";
		/** OUT:参照枝番１ */
		public static final String $o_ref_itm_sub1 = "ref_itm_sub1";
		/** OUT:参照枝番２ */
		public static final String $o_ref_itm_sub2 = "ref_itm_sub2";
		/** OUT:参照枝番３ */
		public static final String $o_ref_itm_sub3 = "ref_itm_sub3";
		/** OUT:外部システムＮＯ */
		public static final String $o_ext_sys_no_itm = "ext_sys_no_itm";
		/** OUT:計算パタンＣＤ */
		public static final String $o_calc_ptn_cd = "calc_ptn_cd";
		/** OUT:原価基準数 */
		public static final String $o_cost_std_qty = "cost_std_qty";
		/** OUT:品目配賦グループ */
		public static final String $o_itm_alc_grp = "itm_alc_grp";
		/** OUT:販売ＦＬＧ */
		public static final String $o_sls_flg = "sls_flg";
		/** OUT:製造ＦＬＧ */
		public static final String $o_mfg_flg = "mfg_flg";
		/** OUT:購買ＦＬＧ */
		public static final String $o_purc_flg = "purc_flg";
		/** OUT:検査ＦＬＧ */
		public static final String $o_insp_flg = "insp_flg";
		/** OUT:販売設定済ＦＬＧ */
		public static final String $o_sls_input_flg = "sls_input_flg";
		/** OUT:製造設定済ＦＬＧ */
		public static final String $o_mfg_input_flg = "mfg_input_flg";
		/** OUT:購買設定済ＦＬＧ */
		public static final String $o_purc_input_flg = "purc_input_flg";
		/** OUT:検査設定済ＦＬＧ */
		public static final String $o_insp_input_flg = "insp_input_flg";
		/** OUT:所要区分 */
		public static final String $o_rqmt_typ = "rqmt_typ";
		/** OUT:所要区分名 */
		public static final String $o_rqmt_typ_nm = "rqmt_typ_nm";
		/** OUT:生産計画立案区分 */
		public static final String $o_prod_pln_typ = "prod_pln_typ";
		/** OUT:生産計画立案区分名 */
		public static final String $o_prod_pln_typ_nm = "prod_pln_typ_nm";
		/** OUT:需要日ばらし月数 */
		public static final String $o_dmnd_date_div_mons = "dmnd_date_div_mons";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:取引先品目ＣＤ */
		public static final String $o_bp_itm_cd = "bp_itm_cd";
		/** OUT:取引先品名 */
		public static final String $o_bp_itm_nm = "bp_itm_nm";
		/** OUT:貸出 */
		public static final String $o_vmi_flg = "vmi_flg";
		/** OUT:インボイス表記品名 */
		public static final String $o_iv_itm_nm = "iv_itm_nm";
		/** OUT:取引通貨単価 */
		public static final String $o_trd_cur_upri = "trd_cur_upri";
		/** OUT:税ＣＤ */
		public static final String $o_tax_cd = "tax_cd";
		/** OUT:税名 */
		public static final String $o_tax_nm = "tax_nm";
		/** OUT:税率 */
		public static final String $o_tax_rate = "tax_rate";
		/** OUT:税区分 */
		public static final String $o_tax_typ = "tax_typ";
		/** OUT:内税 */
		public static final String $o_inc_tax_flg = "inc_tax_flg";
		/** OUT:値引理由ＣＤ */
		public static final String $o_dscnt_rsn_cd = "dscnt_rsn_cd";
		/** OUT:値引理由名 */
		public static final String $o_dscnt_rsn_nm = "dscnt_rsn_nm";
		/** OUT:原価単価 */
		public static final String $o_cost_upri = "cost_upri";
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:請求繰越回数 */
		public static final String $o_bill_crryovr_times = "bill_crryovr_times";
		/** OUT:出荷希望日 */
		public static final String $o_ship_rqst_dt = "ship_rqst_dt";
		/** OUT:出荷希望時刻 */
		public static final String $o_ship_rqst_hm = "ship_rqst_hm";
		/** OUT:納入希望日 */
		public static final String $o_dlv_rqst_dt = "dlv_rqst_dt";
		/** OUT:納入希望時刻 */
		public static final String $o_dlv_rqst_hm = "dlv_rqst_hm";
		/** OUT:曜日区分 */
		public static final String $o_dlv_day_week_typ = "dlv_day_week_typ";
		/** OUT:着曜日 */
		public static final String $o_dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
		/** OUT:納品先ＣＤ */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:納品先名 */
		public static final String $o_dlv_nm = "dlv_nm";
		/** OUT:納品先諸口 */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:価格印字 */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:納品先物流グループＣＤ */
		public static final String $o_dlv_lg_grp_cd = "dlv_lg_grp_cd";
		/** OUT:納品先物流グループ名 */
		public static final String $o_dlv_lg_grp_nm = "dlv_lg_grp_nm";
		/** OUT:納品先国ＣＤ */
		public static final String $o_dlv_cntry_cd = "dlv_cntry_cd";
		/** OUT:納品先国名 */
		public static final String $o_dlv_cntry_nm = "dlv_cntry_nm";
		/** OUT:納品先郵便番号 */
		public static final String $o_dlv_zip_cd = "dlv_zip_cd";
		/** OUT:納品先住所１ */
		public static final String $o_dlv_addr1 = "dlv_addr1";
		/** OUT:納品先住所２ */
		public static final String $o_dlv_addr2 = "dlv_addr2";
		/** OUT:納品先住所３ */
		public static final String $o_dlv_addr3 = "dlv_addr3";
		/** OUT:納品先住所４ */
		public static final String $o_dlv_addr4 = "dlv_addr4";
		/** OUT:納品先ＴＥＬ */
		public static final String $o_dlv_tel = "dlv_tel";
		/** OUT:納品先ＦＡＸ */
		public static final String $o_dlv_fax = "dlv_fax";
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:配送先必須 */
		public static final String $o_tdlv_req_flg = "tdlv_req_flg";
		/** OUT:仕向先ＣＤ１ */
		public static final String $o_dest_cd1 = "dest_cd1";
		/** OUT:仕向先１名 */
		public static final String $o_dest_nm1 = "dest_nm1";
		/** OUT:仕向先ＣＤ２ */
		public static final String $o_dest_cd2 = "dest_cd2";
		/** OUT:仕向先２名 */
		public static final String $o_dest_nm2 = "dest_nm2";
		/** OUT:仕向先ＣＤ３ */
		public static final String $o_dest_cd3 = "dest_cd3";
		/** OUT:仕向先３名 */
		public static final String $o_dest_nm3 = "dest_nm3";
		/** OUT:配送先ＣＤ */
		public static final String $o_tdlv_cd = "tdlv_cd";
		/** OUT:配送先名 */
		public static final String $o_tdlv_nm = "tdlv_nm";
		/** OUT:配送先諸口 */
		public static final String $o_tdlv_sundry_flg = "tdlv_sundry_flg";
		/** OUT:配送先物流グループＣＤ */
		public static final String $o_tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
		/** OUT:配送先物流グループ名 */
		public static final String $o_tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
		/** OUT:配送先国ＣＤ */
		public static final String $o_tdlv_cntry_cd = "tdlv_cntry_cd";
		/** OUT:配送先国名 */
		public static final String $o_tdlv_cntry_nm = "tdlv_cntry_nm";
		/** OUT:配送先郵便番号 */
		public static final String $o_tdlv_zip_cd = "tdlv_zip_cd";
		/** OUT:配送先住所１ */
		public static final String $o_tdlv_addr1 = "tdlv_addr1";
		/** OUT:配送先住所２ */
		public static final String $o_tdlv_addr2 = "tdlv_addr2";
		/** OUT:配送先住所３ */
		public static final String $o_tdlv_addr3 = "tdlv_addr3";
		/** OUT:配送先住所４ */
		public static final String $o_tdlv_addr4 = "tdlv_addr4";
		/** OUT:配送先ＴＥＬ */
		public static final String $o_tdlv_tel = "tdlv_tel";
		/** OUT:配送先ＦＡＸ */
		public static final String $o_tdlv_fax = "tdlv_fax";
		/** OUT:配送先部署 */
		public static final String $o_tdlv_cntct_dpt = "tdlv_cntct_dpt";
		/** OUT:配送先担当者 */
		public static final String $o_tdlv_cntct_psn = "tdlv_cntct_psn";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:配送先経由区分名 */
		public static final String $o_via_dlv_typ_nm = "via_dlv_typ_nm";
		/** OUT:預り売上 */
		public static final String $o_sls_cststk_flg = "sls_cststk_flg";
		/** OUT:格付ＣＤ */
		public static final String $o_gd_cd = "gd_cd";
		/** OUT:格付名 */
		public static final String $o_gd_nm = "gd_nm";
		/** OUT:分割区分 */
		public static final String $o_ship_schd_split_typ = "ship_schd_split_typ";
		/** OUT:引当範囲区分 */
		public static final String $o_alloc_scope_typ = "alloc_scope_typ";
		/** OUT:引当区分 */
		public static final String $o_alloc_typ = "alloc_typ";
		/** OUT:販売単価取得区分 */
		public static final String $o_sls_upri_req_typ = "sls_upri_req_typ";
		/** OUT:定価 */
		public static final String $o_list_pri = "list_pri";
		/** OUT:仕切単価 */
		public static final String $o_wl_sale_upri = "wl_sale_upri";
		/** OUT:単価区分 */
		public static final String $o_upri_typ = "upri_typ";
		/** OUT:単価区分名 */
		public static final String $o_upri_typ_nm = "upri_typ_nm";
		/** OUT:掛率（％） */
		public static final String $o_upri_rate = "upri_rate";
		/** OUT:値引 */
		public static final String $o_trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
		/** OUT:金額（値引き後） */
		public static final String $o_trd_cur_amt = "trd_cur_amt";
		/** VIEW:品目ＣＤ */
		public static final String $v_itm_cd = $o_itm_cd;
		/** VIEW_NO:品目ＣＤ */
		protected static final MCNumber $vn_itm_cd = new MCNumber(10);
		/** SORT:品目ＣＤ */
		public static final String $s_itm_cd = $o_itm_cd;
		/** SORT_NO:品目ＣＤ */
		protected static final MCNumber $sn_itm_cd = new MCNumber(10);
		/** SORT:枝番１ */
		public static final String $s_itm_sub1 = $o_itm_sub1;
		/** SORT_NO:枝番１ */
		protected static final MCNumber $sn_itm_sub1 = new MCNumber(20);
		/** SORT:枝番２ */
		public static final String $s_itm_sub2 = $o_itm_sub2;
		/** SORT_NO:枝番２ */
		protected static final MCNumber $sn_itm_sub2 = new MCNumber(30);
		/** SORT:枝番３ */
		public static final String $s_itm_sub3 = $o_itm_sub3;
		/** SORT_NO:枝番３ */
		protected static final MCNumber $sn_itm_sub3 = new MCNumber(40);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1100";
		/** OTHER:在庫管理区分のモード ※頭は「mode_」で固定 */
		public static final String $m_stk_mng_typ = "mode_stk_mng_typ";
		/** OTHER:資産管理区分のモード ※頭は「mode_」で固定 */
		public static final String $m_asset_mng_typ = "mode_asset_mng_typ";
		/** OTHER:諸口品ＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_sundry_itm_flg_on = "mode_sundry_itm_flg_on";
		/** OTHER:諸口品ＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_sundry_itm_flg_off = "mode_sundry_itm_flg_off";
		/** OTHER:リリースＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_on = "mode_release_flg_on";
		/** OTHER:リリースＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_release_flg_off = "mode_release_flg_off";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_itm_nm);
					add($o_itm_alt_nm1);
					add($o_itm_alt_nm2);
					add($o_itm_alt_nm3);
					add($o_itm_alt_nm4);
					add($o_itm_typ);
					add($o_itm_typ_nm);
					add($o_itm_typ_d_cd);
					add($o_itm_typ_d_nm);
					add($o_stk_mng_typ);
					add($o_stk_mng_typ_nm);
					add($o_asset_mng_typ);
					add($o_asset_mng_typ_nm);
					add($o_sundry_itm_flg);
					add($o_itm_grp_cd1);
					add($o_itm_grp_nm1);
					add($o_itm_grp_cd2);
					add($o_itm_grp_nm2);
					add($o_itm_grp_cd3);
					add($o_itm_grp_nm3);
					add($o_itm_grp_cd4);
					add($o_itm_grp_nm4);
					add($o_itm_grp_cd5);
					add($o_itm_grp_nm5);
					add($o_itm_grp_cd6);
					add($o_itm_grp_nm6);
					add($o_itm_grp_cd7);
					add($o_itm_grp_nm7);
					add($o_itm_grp_cd8);
					add($o_itm_grp_nm8);
					add($o_itm_grp_cd9);
					add($o_itm_grp_nm9);
					add($o_itm_grp_cd10);
					add($o_itm_grp_nm10);
					add($o_release_flg);
					add($o_lmt_ctl_flg);
					add($o_memo1_c);
					add($o_memo2_c);
					add($o_memo3_c);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_rnd_typ_nm);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_sls_itm_grp_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_ship_unit_cd);
					add($o_ship_unit_nm);
					add($o_ship_unit_dec_place);
					add($o_ship_unit_conv_base_qty);
					add($o_ship_unit_conv_qty);
					add($o_ship_unit_qty);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_mng_typ_nm);
					add($o_lot_no_typ);
					add($o_lot_no_typ_nm);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_mng_typ_nm);
					add($o_sublot_no_typ);
					add($o_sublot_no_typ_nm);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_insp_bind_typ_nm);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_rnd_typ_nm);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_sno1_mng_typ_nm);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_num_typ_nm);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_sno2_mng_typ_nm);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_num_typ_nm);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_sno3_mng_typ_nm);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_num_typ_nm);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_sno4_mng_typ_nm);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_num_typ_nm);
					add($o_sno4_ptn_cd);
					add($o_def_bom_ptn);
					add($o_mfg_inst_unit_typ);
					add($o_mfg_inst_unit_typ_nm);
					add($o_mrp_proc_typ);
					add($o_mrp_proc_typ_nm);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_cntry_org_cd);
					add($o_cntry_org_nm);
					add($o_comp_spec_typ);
					add($o_comp_spec_typ_nm);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_sls_upri_grp_cd);
					add($o_itm_bill_crryovr_times);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_slo_proc_typ_nm);
					add($o_proc_typ);
					add($o_def_ship_inst_typ);
					add($o_def_ship_inst_typ_nm);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_ship_term_cd);
					add($o_ship_term_nm);
					add($o_exim_xpns_typ);
					add($o_exim_xpns_typ_nm);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_sls_upri_cng_flg);
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_ref_itm_cd);
					add($o_ref_itm_sub1);
					add($o_ref_itm_sub2);
					add($o_ref_itm_sub3);
					add($o_ext_sys_no_itm);
					add($o_calc_ptn_cd);
					add($o_cost_std_qty);
					add($o_itm_alc_grp);
					add($o_sls_flg);
					add($o_mfg_flg);
					add($o_purc_flg);
					add($o_insp_flg);
					add($o_sls_input_flg);
					add($o_mfg_input_flg);
					add($o_purc_input_flg);
					add($o_insp_input_flg);
					add($o_rqmt_typ);
					add($o_rqmt_typ_nm);
					add($o_prod_pln_typ);
					add($o_prod_pln_typ_nm);
					add($o_dmnd_date_div_mons);
					add($o_mrp_opn_xfr_days);
					add($o_bp_itm_cd);
					add($o_bp_itm_nm);
					add($o_vmi_flg);
					add($o_iv_itm_nm);
					add($o_trd_cur_upri);
					add($o_tax_cd);
					add($o_tax_nm);
					add($o_tax_rate);
					add($o_tax_typ);
					add($o_inc_tax_flg);
					add($o_dscnt_rsn_cd);
					add($o_dscnt_rsn_nm);
					add($o_cost_upri);
					add($o_wtax_rate);
					add($o_bill_crryovr_times);
					add($o_ship_rqst_dt);
					add($o_ship_rqst_hm);
					add($o_dlv_rqst_dt);
					add($o_dlv_rqst_hm);
					add($o_dlv_day_week_typ);
					add($o_dlv_day_week_typ_nm);
					add($o_dlv_cd);
					add($o_dlv_nm);
					add($o_dlv_sundry_flg);
					add($o_pri_prnt_flg);
					add($o_dlv_lg_grp_cd);
					add($o_dlv_lg_grp_nm);
					add($o_dlv_cntry_cd);
					add($o_dlv_cntry_nm);
					add($o_dlv_zip_cd);
					add($o_dlv_addr1);
					add($o_dlv_addr2);
					add($o_dlv_addr3);
					add($o_dlv_addr4);
					add($o_dlv_tel);
					add($o_dlv_fax);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_prnt_lcl_cd);
					add($o_tdlv_req_flg);
					add($o_dest_cd1);
					add($o_dest_nm1);
					add($o_dest_cd2);
					add($o_dest_nm2);
					add($o_dest_cd3);
					add($o_dest_nm3);
					add($o_tdlv_cd);
					add($o_tdlv_nm);
					add($o_tdlv_sundry_flg);
					add($o_tdlv_lg_grp_cd);
					add($o_tdlv_lg_grp_nm);
					add($o_tdlv_cntry_cd);
					add($o_tdlv_cntry_nm);
					add($o_tdlv_zip_cd);
					add($o_tdlv_addr1);
					add($o_tdlv_addr2);
					add($o_tdlv_addr3);
					add($o_tdlv_addr4);
					add($o_tdlv_tel);
					add($o_tdlv_fax);
					add($o_tdlv_cntct_dpt);
					add($o_tdlv_cntct_psn);
					add($o_via_dlv_typ);
					add($o_via_dlv_typ_nm);
					add($o_sls_cststk_flg);
					add($o_gd_cd);
					add($o_gd_nm);
					add($o_ship_schd_split_typ);
					add($o_alloc_scope_typ);
					add($o_alloc_typ);
					add($o_sls_upri_req_typ);
					add($o_list_pri);
					add($o_wl_sale_upri);
					add($o_upri_typ);
					add($o_upri_typ_nm);
					add($o_upri_rate);
					add($o_trd_cur_dscnt_amt);
					add($o_trd_cur_amt);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_cd, $v_itm_cd);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_cd, $s_itm_cd, ASC);
					put($sn_itm_sub1, $s_itm_sub1, ASC);
					put($sn_itm_sub2, $s_itm_sub2, ASC);
					put($sn_itm_sub3, $s_itm_sub3, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloItmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloItmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloItmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloItmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloItmCols extends MSUAC_List.SloItmCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloBp:カラム名クラス
	  */
	protected static class SloBpCols_MC_A  {
		/** IN:売上部門CD */
		public static final String $i_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:取引先ＣＤ */
		public static final String $o_bp_cd = "bp_cd";
		/** OUT:取引先名 */
		public static final String $o_bp_nm = "bp_nm";
		/** OUT:取引先別名１ */
		public static final String $o_bp_alt_nm1 = "bp_alt_nm1";
		/** OUT:取引先別名２ */
		public static final String $o_bp_alt_nm2 = "bp_alt_nm2";
		/** OUT:取引先別名３ */
		public static final String $o_bp_alt_nm3 = "bp_alt_nm3";
		/** OUT:取引先別名４ */
		public static final String $o_bp_alt_nm4 = "bp_alt_nm4";
		/** OUT:売上担当者 */
		public static final String $o_sls_usr_cd = "sls_usr_cd";
		/** OUT:納品先CD */
		public static final String $o_dlv_cd = "dlv_cd";
		/** VIEW:取引先ＣＤ */
		public static final String $v_bp_cd = $o_bp_cd;
		/** VIEW_NO:取引先ＣＤ */
		protected static final MCNumber $vn_bp_cd = new MCNumber(10);
		/** VIEW:取引先名 */
		public static final String $v_bp_nm = $o_bp_nm;
		/** VIEW_NO:取引先名 */
		protected static final MCNumber $vn_bp_nm = new MCNumber(20);
		/** SORT:取引先ＣＤ */
		public static final String $s_bp_cd = $o_bp_cd;
		/** SORT_NO:取引先ＣＤ */
		protected static final MCNumber $sn_bp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MAUAL0117";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MA";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MAUAP1020";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bp_cd);
					add($o_bp_nm);
					add($o_bp_alt_nm1);
					add($o_bp_alt_nm2);
					add($o_bp_alt_nm3);
					add($o_bp_alt_nm4);
					add($o_sls_usr_cd);
					add($o_dlv_cd);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bp_cd, $v_bp_cd);
					put($vn_bp_nm, $v_bp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bp_cd, $s_bp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloBpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloBpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloBpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloBpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloBpCols extends MSUAC_List.SloBpCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloDlv:カラム名クラス
	  */
	protected static class SloDlvCols_MC_A  {
		/** IN:適用日（補助マスタ、検索区分１・５・１０・１４・１７・１８） */
		public static final String $i_dt = "dt";
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:取引先名 */
		public static final String $i_bp_nm = "bp_nm";
		/** IN:法人番号 */
		public static final String $i_ein = "ein";
		/** IN:取引先別名１ */
		public static final String $i_bp_alt_nm1 = "bp_alt_nm1";
		/** IN:取引先別名２ */
		public static final String $i_bp_alt_nm2 = "bp_alt_nm2";
		/** IN:取引先別名３ */
		public static final String $i_bp_alt_nm3 = "bp_alt_nm3";
		/** IN:取引先別名４ */
		public static final String $i_bp_alt_nm4 = "bp_alt_nm4";
		/** IN:国ＣＤ */
		public static final String $i_cntry_cd = "cntry_cd";
		/** IN:国名 */
		public static final String $i_cntry_nm = "cntry_nm";
		/** IN:国外 */
		public static final String $i_foreign_flg = "foreign_flg";
		/** IN:地域ＣＤ */
		public static final String $i_area_cd = "area_cd";
		/** IN:地域名 */
		public static final String $i_area_nm = "area_nm";
		/** IN:得意先ＦＬＧ */
		public static final String $i_cst_flg = "cst_flg";
		/** IN:売掛先ＦＬＧ */
		public static final String $i_acst_flg = "acst_flg";
		/** IN:請求先ＦＬＧ */
		public static final String $i_bcst_flg = "bcst_flg";
		/** IN:入金先ＦＬＧ */
		public static final String $i_rcst_flg = "rcst_flg";
		/** IN:納品先ＦＬＧ */
		public static final String $i_dlv_flg = "dlv_flg";
		/** IN:仕向先ＦＬＧ */
		public static final String $i_dest_flg = "dest_flg";
		/** IN:与信管理先ＦＬＧ */
		public static final String $i_cred_flg = "cred_flg";
		/** IN:発注先ＦＬＧ */
		public static final String $i_sppl_flg = "sppl_flg";
		/** IN:買掛先ＦＬＧ */
		public static final String $i_asppl_flg = "asppl_flg";
		/** IN:支払予定管理先ＦＬＧ */
		public static final String $i_bsppl_flg = "bsppl_flg";
		/** IN:支払先ＦＬＧ */
		public static final String $i_psppl_flg = "psppl_flg";
		/** IN:メーカＦＬＧ */
		public static final String $i_maker_flg = "maker_flg";
		/** IN:配送先ＦＬＧ */
		public static final String $i_tdlv_flg = "tdlv_flg";
		/** IN:メモ１ */
		public static final String $i_memo1 = "memo1";
		/** IN:メモ２ */
		public static final String $i_memo2 = "memo2";
		/** IN:メモ３ */
		public static final String $i_memo3 = "memo3";
		/** IN:メモ４ */
		public static final String $i_memo4 = "memo4";
		/** IN:メモ５ */
		public static final String $i_memo5 = "memo5";
		/** IN:メモ６ */
		public static final String $i_memo6 = "memo6";
		/** IN:メモ７ */
		public static final String $i_memo7 = "memo7";
		/** IN:メモ８ */
		public static final String $i_memo8 = "memo8";
		/** IN:メモ９ */
		public static final String $i_memo9 = "memo9";
		/** IN:メモ１０ */
		public static final String $i_memo10 = "memo10";
		/** IN:メモ１１ */
		public static final String $i_memo11 = "memo11";
		/** IN:メモ１２ */
		public static final String $i_memo12 = "memo12";
		/** IN:メモ１３ */
		public static final String $i_memo13 = "memo13";
		/** IN:メモ１４ */
		public static final String $i_memo14 = "memo14";
		/** IN:メモ１５ */
		public static final String $i_memo15 = "memo15";
		/** IN:メモ１６ */
		public static final String $i_memo16 = "memo16";
		/** IN:メモ１７ */
		public static final String $i_memo17 = "memo17";
		/** IN:メモ１８ */
		public static final String $i_memo18 = "memo18";
		/** IN:メモ１９ */
		public static final String $i_memo19 = "memo19";
		/** IN:メモ２０ */
		public static final String $i_memo20 = "memo20";
		/** IN:取引先分類ＦＬＧ１ */
		public static final String $i_bp_grp_flg1 = "bp_grp_flg1";
		/** IN:取引先分類ＣＤ１ */
		public static final String $i_bp_grp_cd1 = "bp_grp_cd1";
		/** IN:取引先分類名１ */
		public static final String $i_bp_grp_nm1 = "bp_grp_nm1";
		/** IN:取引先分類ＦＬＧ２ */
		public static final String $i_bp_grp_flg2 = "bp_grp_flg2";
		/** IN:取引先分類ＣＤ２ */
		public static final String $i_bp_grp_cd2 = "bp_grp_cd2";
		/** IN:取引先分類名２ */
		public static final String $i_bp_grp_nm2 = "bp_grp_nm2";
		/** IN:取引先分類ＦＬＧ３ */
		public static final String $i_bp_grp_flg3 = "bp_grp_flg3";
		/** IN:取引先分類ＣＤ３ */
		public static final String $i_bp_grp_cd3 = "bp_grp_cd3";
		/** IN:取引先分類名３ */
		public static final String $i_bp_grp_nm3 = "bp_grp_nm3";
		/** IN:取引先分類ＦＬＧ４ */
		public static final String $i_bp_grp_flg4 = "bp_grp_flg4";
		/** IN:取引先分類ＣＤ４ */
		public static final String $i_bp_grp_cd4 = "bp_grp_cd4";
		/** IN:取引先分類名４ */
		public static final String $i_bp_grp_nm4 = "bp_grp_nm4";
		/** IN:取引先分類ＦＬＧ５ */
		public static final String $i_bp_grp_flg5 = "bp_grp_flg5";
		/** IN:取引先分類ＣＤ５ */
		public static final String $i_bp_grp_cd5 = "bp_grp_cd5";
		/** IN:取引先分類名５ */
		public static final String $i_bp_grp_nm5 = "bp_grp_nm5";
		/** IN:取引先分類ＦＬＧ６ */
		public static final String $i_bp_grp_flg6 = "bp_grp_flg6";
		/** IN:取引先分類ＣＤ６ */
		public static final String $i_bp_grp_cd6 = "bp_grp_cd6";
		/** IN:取引先分類名６ */
		public static final String $i_bp_grp_nm6 = "bp_grp_nm6";
		/** IN:取引先分類ＦＬＧ７ */
		public static final String $i_bp_grp_flg7 = "bp_grp_flg7";
		/** IN:取引先分類ＣＤ７ */
		public static final String $i_bp_grp_cd7 = "bp_grp_cd7";
		/** IN:取引先分類名７ */
		public static final String $i_bp_grp_nm7 = "bp_grp_nm7";
		/** IN:取引先分類ＦＬＧ８ */
		public static final String $i_bp_grp_flg8 = "bp_grp_flg8";
		/** IN:取引先分類ＣＤ８ */
		public static final String $i_bp_grp_cd8 = "bp_grp_cd8";
		/** IN:取引先分類名８ */
		public static final String $i_bp_grp_nm8 = "bp_grp_nm8";
		/** IN:取引先分類ＦＬＧ９ */
		public static final String $i_bp_grp_flg9 = "bp_grp_flg9";
		/** IN:取引先分類ＣＤ９ */
		public static final String $i_bp_grp_cd9 = "bp_grp_cd9";
		/** IN:取引先分類名９ */
		public static final String $i_bp_grp_nm9 = "bp_grp_nm9";
		/** IN:取引先分類ＦＬＧ１０ */
		public static final String $i_bp_grp_flg10 = "bp_grp_flg10";
		/** IN:取引先分類１０ */
		public static final String $i_bp_grp_cd10 = "bp_grp_cd10";
		/** IN:取引先分類名１０ */
		public static final String $i_bp_grp_nm10 = "bp_grp_nm10";
		/** IN:納品先ＣＤ（検索区分１７） */
		public static final String $i_dlv_cd = "dlv_cd";
		/** IN:得意先ＣＤ（検索区分１８） */
		public static final String $i_cst_cd = "cst_cd";
		/** IN:入金先ＣＤ（検索区分１９） */
		public static final String $i_in_rcst_cd = "in_rcst_cd";
		/** IN:支払予定管理先CD（検索区分３０） */
		public static final String $i_bsppl_cd = "bsppl_cd";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:名称不要ＦＬＧ */
		public static final String $i_sundry_bp_nm_rem_flg = "sundry_bp_nm_rem_flg";
		/** IN:債権債務先識別区分（検索区分と併用不可） */
		public static final String $i_debt_cred_id_typ = "debt_cred_id_typ";
		/** IN:リストチェック不要ＦＬＧ */
		public static final String $i_check_rem_flg = "check_rem_flg";
		/** IN:参照取引先ＣＤ */
		public static final String $i_ref_bp_cd = "ref_bp_cd";
		/** IN:得意先インボイス取引ＦＬＧ */
		public static final String $i_cst_iv_flg = "cst_iv_flg";
		/** IN:得意先諸口含むＦＬＧ（リスト取得用：検索区分１７） */
		public static final String $i_cst_sundry_cntn_flg = "cst_sundry_cntn_flg";
		/** IN:取引先入力補助検索区分 */
		public static final String $i_bp_is_srch_typ = "bp_is_srch_typ";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:取引先ＣＤ */
		public static final String $o_bp_cd = "bp_cd";
		/** OUT:取引先名 */
		public static final String $o_bp_nm = "bp_nm";
		/** OUT:取引先別名１ */
		public static final String $o_bp_alt_nm1 = "bp_alt_nm1";
		/** OUT:取引先別名２ */
		public static final String $o_bp_alt_nm2 = "bp_alt_nm2";
		/** OUT:取引先別名３ */
		public static final String $o_bp_alt_nm3 = "bp_alt_nm3";
		/** OUT:取引先別名４ */
		public static final String $o_bp_alt_nm4 = "bp_alt_nm4";
		/** OUT:法人番号 */
		public static final String $o_ein = "ein";
		/** OUT:国 */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:出荷ＬＴ（需要情報用） */
		public static final String $o_ship_lt = "ship_lt";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:国外 */
		public static final String $o_foreign_flg = "foreign_flg";
		/** OUT:地域 */
		public static final String $o_area_cd = "area_cd";
		/** OUT:地域名 */
		public static final String $o_area_nm = "area_nm";
		/** OUT:通貨 */
		public static final String $o_cur_cd = "cur_cd";
		/** OUT:通貨名 */
		public static final String $o_cur_nm = "cur_nm";
		/** OUT:金額小数部有効桁数 */
		public static final String $o_amt_dec_place = "amt_dec_place";
		/** OUT:単価小数部有効桁数 */
		public static final String $o_upri_dec_place = "upri_dec_place";
		/** OUT:得意先 */
		public static final String $o_cst_flg = "cst_flg";
		/** OUT:得意先諸口 */
		public static final String $o_cst_sundry_flg = "cst_sundry_flg";
		/** OUT:売掛先 */
		public static final String $o_acst_flg = "acst_flg";
		/** OUT:請求先 */
		public static final String $o_bcst_flg = "bcst_flg";
		/** OUT:入金先 */
		public static final String $o_rcst_flg = "rcst_flg";
		/** OUT:納品先 */
		public static final String $o_dlv_flg = "dlv_flg";
		/** OUT:納品先諸口 */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:配送先 */
		public static final String $o_tdlv_flg = "tdlv_flg";
		/** OUT:仕向先 */
		public static final String $o_dest_flg = "dest_flg";
		/** OUT:与信管理先 */
		public static final String $o_cred_flg = "cred_flg";
		/** OUT:発注先 */
		public static final String $o_sppl_flg = "sppl_flg";
		/** OUT:買掛先 */
		public static final String $o_asppl_flg = "asppl_flg";
		/** OUT:支払予定管理先 */
		public static final String $o_bsppl_flg = "bsppl_flg";
		/** OUT:支払先 */
		public static final String $o_psppl_flg = "psppl_flg";
		/** OUT:メーカ */
		public static final String $o_maker_flg = "maker_flg";
		/** OUT:メモ１ */
		public static final String $o_memo1 = "memo1";
		/** OUT:メモ２ */
		public static final String $o_memo2 = "memo2";
		/** OUT:メモ３ */
		public static final String $o_memo3 = "memo3";
		/** OUT:メモ４ */
		public static final String $o_memo4 = "memo4";
		/** OUT:メモ５ */
		public static final String $o_memo5 = "memo5";
		/** OUT:メモ６ */
		public static final String $o_memo6 = "memo6";
		/** OUT:メモ７ */
		public static final String $o_memo7 = "memo7";
		/** OUT:メモ８ */
		public static final String $o_memo8 = "memo8";
		/** OUT:メモ９ */
		public static final String $o_memo9 = "memo9";
		/** OUT:メモ１０ */
		public static final String $o_memo10 = "memo10";
		/** OUT:メモ１１ */
		public static final String $o_memo11 = "memo11";
		/** OUT:メモ１２ */
		public static final String $o_memo12 = "memo12";
		/** OUT:メモ１３ */
		public static final String $o_memo13 = "memo13";
		/** OUT:メモ１４ */
		public static final String $o_memo14 = "memo14";
		/** OUT:メモ１５ */
		public static final String $o_memo15 = "memo15";
		/** OUT:メモ１６ */
		public static final String $o_memo16 = "memo16";
		/** OUT:メモ１７ */
		public static final String $o_memo17 = "memo17";
		/** OUT:メモ１８ */
		public static final String $o_memo18 = "memo18";
		/** OUT:メモ１９ */
		public static final String $o_memo19 = "memo19";
		/** OUT:メモ２０ */
		public static final String $o_memo20 = "memo20";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:郵便番号 */
		public static final String $o_zip_cd = "zip_cd";
		/** OUT:住所１ */
		public static final String $o_addr1 = "addr1";
		/** OUT:住所２ */
		public static final String $o_addr2 = "addr2";
		/** OUT:住所３ */
		public static final String $o_addr3 = "addr3";
		/** OUT:住所４ */
		public static final String $o_addr4 = "addr4";
		/** OUT:ＴＥＬ */
		public static final String $o_tel = "tel";
		/** OUT:ＦＡＸ */
		public static final String $o_fax = "fax";
		/** OUT:債務部門ＣＤ（検索区分５） */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:債権部門ＣＤ */
		public static final String $o_ar_dpt_cd = "ar_dpt_cd";
		/** OUT:支払予定管理先担当部門ＣＤ */
		public static final String $o_bsppl_dpt_cd = "bsppl_dpt_cd";
		/** OUT:支払部門CD */
		public static final String $o_pay_dpt_cd = "pay_dpt_cd";
		/** OUT:得意先部署 */
		public static final String $o_cst_cntct_dpt = "cst_cntct_dpt";
		/** OUT:得意先担当者 */
		public static final String $o_cst_cntct_psn = "cst_cntct_psn";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:標準企業コード */
		public static final String $o_std_co_cd = "std_co_cd";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:取引先分類ＣＤ１ */
		public static final String $o_bp_grp_cd1 = "bp_grp_cd1";
		/** OUT:取引先分類名１ */
		public static final String $o_bp_grp_nm1 = "bp_grp_nm1";
		/** OUT:取引先分類ＣＤ２ */
		public static final String $o_bp_grp_cd2 = "bp_grp_cd2";
		/** OUT:取引先分類名２ */
		public static final String $o_bp_grp_nm2 = "bp_grp_nm2";
		/** OUT:取引先分類ＣＤ３ */
		public static final String $o_bp_grp_cd3 = "bp_grp_cd3";
		/** OUT:取引先分類名３ */
		public static final String $o_bp_grp_nm3 = "bp_grp_nm3";
		/** OUT:取引先分類ＣＤ４ */
		public static final String $o_bp_grp_cd4 = "bp_grp_cd4";
		/** OUT:取引先分類名４ */
		public static final String $o_bp_grp_nm4 = "bp_grp_nm4";
		/** OUT:取引先分類ＣＤ５ */
		public static final String $o_bp_grp_cd5 = "bp_grp_cd5";
		/** OUT:取引先分類名５ */
		public static final String $o_bp_grp_nm5 = "bp_grp_nm5";
		/** OUT:取引先分類ＣＤ６ */
		public static final String $o_bp_grp_cd6 = "bp_grp_cd6";
		/** OUT:取引先分類名６ */
		public static final String $o_bp_grp_nm6 = "bp_grp_nm6";
		/** OUT:取引先分類ＣＤ７ */
		public static final String $o_bp_grp_cd7 = "bp_grp_cd7";
		/** OUT:取引先分類名７ */
		public static final String $o_bp_grp_nm7 = "bp_grp_nm7";
		/** OUT:取引先分類ＣＤ８ */
		public static final String $o_bp_grp_cd8 = "bp_grp_cd8";
		/** OUT:取引先分類名８ */
		public static final String $o_bp_grp_nm8 = "bp_grp_nm8";
		/** OUT:取引先分類ＣＤ９ */
		public static final String $o_bp_grp_cd9 = "bp_grp_cd9";
		/** OUT:取引先分類名９ */
		public static final String $o_bp_grp_nm9 = "bp_grp_nm9";
		/** OUT:取引先分類ＣＤ１０ */
		public static final String $o_bp_grp_cd10 = "bp_grp_cd10";
		/** OUT:取引先分類名１０ */
		public static final String $o_bp_grp_nm10 = "bp_grp_nm10";
		/** OUT:取引先配賦グループ */
		public static final String $o_bp_alc_grp = "bp_alc_grp";
		/** OUT:債権部門区分 */
		public static final String $o_ar_dpt_typ = "ar_dpt_typ";
		/** OUT:販売単価取得区分 */
		public static final String $o_sls_upri_req_typ = "sls_upri_req_typ";
		/** OUT:販売単価変更許可ＦＬＧ */
		public static final String $o_sls_upri_cng_flg = "sls_upri_cng_flg";
		/** OUT:販売単価端数処理区分 */
		public static final String $o_sls_upri_rnd_typ = "sls_upri_rnd_typ";
		/** OUT:売上金額端数処理区分 */
		public static final String $o_sls_amt_rnd_typ = "sls_amt_rnd_typ";
		/** OUT:売上税計算区分 */
		public static final String $o_sls_tax_calc_typ = "sls_tax_calc_typ";
		/** OUT:売上税額端数処理区分 */
		public static final String $o_sls_tax_rnd_typ = "sls_tax_rnd_typ";
		/** OUT:売上計上区分 */
		public static final String $o_sls_basis_typ = "sls_basis_typ";
		/** OUT:請求起算区分 */
		public static final String $o_bill_basis_typ = "bill_basis_typ";
		/** OUT:出荷予定分割区分 */
		public static final String $o_ship_schd_split_typ = "ship_schd_split_typ";
		/** OUT:請求繰越回数 */
		public static final String $o_bill_crryovr_times = "bill_crryovr_times";
		/** OUT:ロット逆転禁止区分 */
		public static final String $o_lot_back_stop_typ = "lot_back_stop_typ";
		/** OUT:ロット明細分割区分 */
		public static final String $o_slip_each_lot_typ = "slip_each_lot_typ";
		/** OUT:得意先納品書ＣＤ */
		public static final String $o_cst_ship_form_cd = "cst_ship_form_cd";
		/** OUT:現品票発行ＦＬＧ */
		public static final String $o_stk_lst_issue_flg = "stk_lst_issue_flg";
		/** OUT:現品票ＣＤ */
		public static final String $o_stk_lst_form_cd = "stk_lst_form_cd";
		/** OUT:売上税優先ＦＬＧ */
		public static final String $o_sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
		/** OUT:案件別債権管理ＦＬＧ */
		public static final String $o_wrk_ar_flg = "wrk_ar_flg";
		/** OUT:得意先インボイス取引ＦＬＧ */
		public static final String $o_cst_iv_flg = "cst_iv_flg";
		/** OUT:得意先取引条件ＣＤ１ */
		public static final String $o_cst_tterm_cd1 = "cst_tterm_cd1";
		/** OUT:得意先取引条件名１ */
		public static final String $o_cst_tterm_nm1 = "cst_tterm_nm1";
		/** OUT:得意先取引条件ＣＤ２ */
		public static final String $o_cst_tterm_cd2 = "cst_tterm_cd2";
		/** OUT:得意先取引条件名２ */
		public static final String $o_cst_tterm_nm2 = "cst_tterm_nm2";
		/** OUT:得意先取引条件ＣＤ３ */
		public static final String $o_cst_tterm_cd3 = "cst_tterm_cd3";
		/** OUT:得意先取引条件名３ */
		public static final String $o_cst_tterm_nm3 = "cst_tterm_nm3";
		/** OUT:物流グループ混在不可ＦＬＧ */
		public static final String $o_not_lg_mix_flg = "not_lg_mix_flg";
		/** OUT:ロット混在不可ＦＬＧ */
		public static final String $o_not_lot_mix_flg = "not_lot_mix_flg";
		/** OUT:サブロット混在不可ＦＬＧ */
		public static final String $o_not_sublot_mix_flg = "not_sublot_mix_flg";
		/** OUT:売掛先ＣＤ */
		public static final String $o_acst_cd = "acst_cd";
		/** OUT:売掛先名 */
		public static final String $o_acst_nm = "acst_nm";
		/** OUT:請求先ＣＤ */
		public static final String $o_bcst_cd = "bcst_cd";
		/** OUT:請求先名（検索区分２） */
		public static final String $o_bcst_nm = "bcst_nm";
		/** OUT:入金先ＣＤ */
		public static final String $o_rcst_cd = "rcst_cd";
		/** OUT:債権与信管理先ＣＤ */
		public static final String $o_ar_cred_cd = "ar_cred_cd";
		/** OUT:請求部門区分 */
		public static final String $o_bill_dpt_typ = "bill_dpt_typ";
		/** OUT:請求締処理区分 */
		public static final String $o_bill_cl_typ = "bill_cl_typ";
		/** OUT:請求締日１ */
		public static final String $o_bill_cl_day1 = "bill_cl_day1";
		/** OUT:請求締日２ */
		public static final String $o_bill_cl_day2 = "bill_cl_day2";
		/** OUT:請求締日３ */
		public static final String $o_bill_cl_day3 = "bill_cl_day3";
		/** OUT:請求締日４ */
		public static final String $o_bill_cl_day4 = "bill_cl_day4";
		/** OUT:請求締日５ */
		public static final String $o_bill_cl_day5 = "bill_cl_day5";
		/** OUT:請求税計算ＦＬＧ */
		public static final String $o_tax_on_bill_flg = "tax_on_bill_flg";
		/** OUT:請求税額端数処理区分 */
		public static final String $o_bill_tax_rnd_typ = "bill_tax_rnd_typ";
		/** OUT:請求締遅延日数 */
		public static final String $o_bill_cl_delay_days = "bill_cl_delay_days";
		/** OUT:請求締前後区分 */
		public static final String $o_bill_cl_ba_typ = "bill_cl_ba_typ";
		/** OUT:売上仮単価締ＦＬＧ */
		public static final String $o_sls_interim_cl_flg = "sls_interim_cl_flg";
		/** OUT:請求先カレンダＣＤ */
		public static final String $o_bill_cal_cd = "bill_cal_cd";
		/** OUT:入金予定前後区分 */
		public static final String $o_rcv_ba_typ = "rcv_ba_typ";
		/** OUT:請求書前月残高表示ＦＬＧ */
		public static final String $o_bfw_bal_disp_flg = "bfw_bal_disp_flg";
		/** OUT:売上明細書出力区分 */
		public static final String $o_sls_dtl_outp_typ = "sls_dtl_outp_typ";
		/** OUT:請求書発行区分 */
		public static final String $o_bill_prnt_typ = "bill_prnt_typ";
		/** OUT:請求書明細出力ＦＬＧ */
		public static final String $o_bill_dtl_outp_flg = "bill_dtl_outp_flg";
		/** OUT:請求書前受金表示ＦＬＧ */
		public static final String $o_bill_dtl_adv_flg = "bill_dtl_adv_flg";
		/** OUT:請求書入金予定表示ＦＬＧ */
		public static final String $o_bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
		/** OUT:請求書明細小計区分 */
		public static final String $o_bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
		/** OUT:請求書明細改頁区分 */
		public static final String $o_bill_dtl_brk_typ = "bill_dtl_brk_typ";
		/** OUT:請求書明細並順区分 */
		public static final String $o_bill_dtl_sort_typ = "bill_dtl_sort_typ";
		/** OUT:請求書取消伝票表示区分 */
		public static final String $o_bill_can_slip_typ = "bill_can_slip_typ";
		/** OUT:自動明細消込ＦＬＧ */
		public static final String $o_auto_line_appl_flg = "auto_line_appl_flg";
		/** OUT:債権相殺グループＣＤ */
		public static final String $o_ar_setoff_grp_cd = "ar_setoff_grp_cd";
		/** OUT:振込人名 */
		public static final String $o_xfr_psn = "xfr_psn";
		/** OUT:入金自動消込対象ＦＬＧ */
		public static final String $o_rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
		/** OUT:金額考慮ＦＬＧ */
		public static final String $o_rcv_amt_match_flg = "rcv_amt_match_flg";
		/** OUT:金種考慮ＦＬＧ */
		public static final String $o_ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
		/** OUT:手数料計算ＦＬＧ */
		public static final String $o_calc_com_paid_flg = "calc_com_paid_flg";
		/** OUT:自動消込基準日遅延日数 */
		public static final String $o_auto_appl_delay_days = "auto_appl_delay_days";
		/** OUT:買掛先ＣＤ */
		public static final String $o_asppl_cd = "asppl_cd";
		/** OUT:下請対象ＦＬＧ */
		public static final String $o_subcon_flg = "subcon_flg";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:発注時納品書ＦＬＧ */
		public static final String $o_po_dlv_slip_flg = "po_dlv_slip_flg";
		/** OUT:納入指示時納品書ＦＬＧ */
		public static final String $o_dlv_inst_dlv_slip_flg = "dlv_inst_dlv_slip_flg";
		/** OUT:納期回答受領時納品書ＦＬＧ */
		public static final String $o_prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税額端数処理区分 */
		public static final String $o_purc_tax_rnd_typ = "purc_tax_rnd_typ";
		/** OUT:仕入税計算区分 */
		public static final String $o_purc_tax_calc_typ = "purc_tax_calc_typ";
		/** OUT:仕入税優先ＦＬＧ */
		public static final String $o_purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
		/** OUT:案件別注文書ＦＬＧ */
		public static final String $o_wrk_po_flg = "wrk_po_flg";
		/** OUT:案件別債務管理ＦＬＧ */
		public static final String $o_wrk_ap_flg = "wrk_ap_flg";
		/** OUT:支給積送管理区分 */
		public static final String $o_prov_rcv_typ = "prov_rcv_typ";
		/** OUT:有償支給先ＦＬＧ */
		public static final String $o_onr_prsppl_flg = "onr_prsppl_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税額端数処理区分 */
		public static final String $o_prov_tax_rnd_typ = "prov_tax_rnd_typ";
		/** OUT:支給税計算区分 */
		public static final String $o_prov_tax_calc_typ = "prov_tax_calc_typ";
		/** OUT:支給税優先ＦＬＧ */
		public static final String $o_prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
		/** OUT:発注先カレンダＣＤ */
		public static final String $o_sppl_cal_cd = "sppl_cal_cd";
		/** OUT:発注先インボイス取引ＦＬＧ */
		public static final String $o_sppl_iv_flg = "sppl_iv_flg";
		/** OUT:納期回答確認ＦＬＧ */
		public static final String $o_prms_recv_flg = "prms_recv_flg";
		/** OUT:発注先取引条件ＣＤ１ */
		public static final String $o_sppl_tterm_cd1 = "sppl_tterm_cd1";
		/** OUT:発注先取引条件ＣＤ２ */
		public static final String $o_sppl_tterm_cd2 = "sppl_tterm_cd2";
		/** OUT:発注先取引条件ＣＤ３ */
		public static final String $o_sppl_tterm_cd3 = "sppl_tterm_cd3";
		/** OUT:支払予定管理先ＣＤ */
		public static final String $o_bsppl_cd = "bsppl_cd";
		/** OUT:支払先ＣＤ */
		public static final String $o_psppl_cd = "psppl_cd";
		/** OUT:債務与信管理先ＣＤ */
		public static final String $o_ap_cred_cd = "ap_cred_cd";
		/** OUT:都度支払ＦＬＧ */
		public static final String $o_pay_spot_flg = "pay_spot_flg";
		/** OUT:支払締日１ */
		public static final String $o_psppl_cl_day1 = "psppl_cl_day1";
		/** OUT:支払締日２ */
		public static final String $o_psppl_cl_day2 = "psppl_cl_day2";
		/** OUT:支払締日３ */
		public static final String $o_psppl_cl_day3 = "psppl_cl_day3";
		/** OUT:支払締日４ */
		public static final String $o_psppl_cl_day4 = "psppl_cl_day4";
		/** OUT:支払締日５ */
		public static final String $o_psppl_cl_day5 = "psppl_cl_day5";
		/** OUT:仕入仮単価締ＦＬＧ */
		public static final String $o_purc_interim_cl_flg = "purc_interim_cl_flg";
		/** OUT:支払税計算ＦＬＧ */
		public static final String $o_tax_on_pay_flg = "tax_on_pay_flg";
		/** OUT:債務相殺グループＣＤ */
		public static final String $o_ap_setoff_grp_cd = "ap_setoff_grp_cd";
		/** OUT:支払先口座ＣＤ */
		public static final String $o_pay_bank_ac_cd = "pay_bank_ac_cd";
		/** OUT:支払通知書前渡金表示ＦＬＧ */
		public static final String $o_pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
		/** OUT:支払先備考 */
		public static final String $o_psppl_rmrks = "psppl_rmrks";
		/** OUT:手形サイト上限 */
		public static final String $o_note_days = "note_days";
		/** OUT:価格印字ＦＬＧ */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:貸出在庫棚卸対象ＦＬＧ */
		public static final String $o_cnsgn_stktk_flg = "cnsgn_stktk_flg";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:配送先必須ＦＬＧ */
		public static final String $o_tdlv_req_flg = "tdlv_req_flg";
		/** OUT:物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:納品先カレンダＣＤ */
		public static final String $o_dlv_cal_cd = "dlv_cal_cd";
		/** OUT:納品先チャネル１ */
		public static final String $o_dlv_chnnl1 = "dlv_chnnl1";
		/** OUT:納品先チャネル２ */
		public static final String $o_dlv_chnnl2 = "dlv_chnnl2";
		/** OUT:納品先チャネル３ */
		public static final String $o_dlv_chnnl3 = "dlv_chnnl3";
		/** OUT:適用開始日（検索区分１・５・１０・１４・１７・１８） */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日（検索区分１・５・１０・１４・１７・１８） */
		public static final String $o_end_dt = "end_dt";
		/** OUT:購買担当者ＣＤ（検索区分５） */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ（検索区分５） */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:納品先ＣＤ（存在チェック用：検索区分１７） */
		public static final String $o_dlv_cd = "dlv_cd";
		/** OUT:得意先ＣＤ（存在チェック用：検索区分１８） */
		public static final String $o_cst_cd = "cst_cd";
		/** OUT:通常納品先ＣＤ（リスト取得用：検索区分１・１４） */
		public static final String $o_def_dlv_cd = "def_dlv_cd";
		/** OUT:通常得意先ＣＤ（リスト取得用：検索区分１０） */
		public static final String $o_def_cst_cd = "def_cst_cd";
		/** OUT:得意先担当者（検索区分１・１４・１７） */
		public static final String $o_cst_usr_cd = "cst_usr_cd";
		/** OUT:得意先担当部門（検索区分１・１４・１７） */
		public static final String $o_cst_dpt_cd = "cst_dpt_cd";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** OUT:ＥＤＩ検収送信対象 */
		public static final String $o_edi_accpt_send_tgt_flg = "edi_accpt_send_tgt_flg";
		/** VIEW:取引先ＣＤ */
		public static final String $v_bp_cd = $o_bp_cd;
		/** VIEW_NO:取引先ＣＤ */
		protected static final MCNumber $vn_bp_cd = new MCNumber(10);
		/** VIEW:取引先名 */
		public static final String $v_bp_nm = $o_bp_nm;
		/** VIEW_NO:取引先名 */
		protected static final MCNumber $vn_bp_nm = new MCNumber(20);
		/** SORT:取引先ＣＤ */
		public static final String $s_bp_cd = $o_bp_cd;
		/** SORT_NO:取引先ＣＤ */
		protected static final MCNumber $sn_bp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MAUAL0117";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MA";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MAUAP1020";
		/** OTHER:得意先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_cst_flg = "mode_cst_flg";
		/** OTHER:売掛先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_acst_flg = "mode_acst_flg";
		/** OTHER:請求先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_bcst_flg = "mode_bcst_flg";
		/** OTHER:入金先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_rcst_flg = "mode_rcst_flg";
		/** OTHER:納品先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_dlv_flg = "mode_dlv_flg";
		/** OTHER:仕向先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_dest_flg = "mode_dest_flg";
		/** OTHER:与信管理先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_cred_flg = "mode_cred_flg";
		/** OTHER:発注先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_sppl_flg = "mode_sppl_flg";
		/** OTHER:買掛先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_asppl_flg = "mode_asppl_flg";
		/** OTHER:支払予定管理先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_bsppl_flg = "mode_bsppl_flg";
		/** OTHER:支払先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_psppl_flg = "mode_psppl_flg";
		/** OTHER:メーカＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_maker_flg = "mode_maker_flg";
		/** OTHER:配送先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_tdlv_flg = "mode_tdlv_flg";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bp_cd);
					add($o_bp_nm);
					add($o_bp_alt_nm1);
					add($o_bp_alt_nm2);
					add($o_bp_alt_nm3);
					add($o_bp_alt_nm4);
					add($o_ein);
					add($o_cntry_cd);
					add($o_ship_lt);
					add($o_cntry_nm);
					add($o_foreign_flg);
					add($o_area_cd);
					add($o_area_nm);
					add($o_cur_cd);
					add($o_cur_nm);
					add($o_amt_dec_place);
					add($o_upri_dec_place);
					add($o_cst_flg);
					add($o_cst_sundry_flg);
					add($o_acst_flg);
					add($o_bcst_flg);
					add($o_rcst_flg);
					add($o_dlv_flg);
					add($o_dlv_sundry_flg);
					add($o_tdlv_flg);
					add($o_dest_flg);
					add($o_cred_flg);
					add($o_sppl_flg);
					add($o_asppl_flg);
					add($o_bsppl_flg);
					add($o_psppl_flg);
					add($o_maker_flg);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_memo4);
					add($o_memo5);
					add($o_memo6);
					add($o_memo7);
					add($o_memo8);
					add($o_memo9);
					add($o_memo10);
					add($o_memo11);
					add($o_memo12);
					add($o_memo13);
					add($o_memo14);
					add($o_memo15);
					add($o_memo16);
					add($o_memo17);
					add($o_memo18);
					add($o_memo19);
					add($o_memo20);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_ap_dpt_cd);
					add($o_ar_dpt_cd);
					add($o_bsppl_dpt_cd);
					add($o_pay_dpt_cd);
					add($o_cst_cntct_dpt);
					add($o_cst_cntct_psn);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_std_co_cd);
					add($o_prnt_lcl_cd);
					add($o_bp_grp_cd1);
					add($o_bp_grp_nm1);
					add($o_bp_grp_cd2);
					add($o_bp_grp_nm2);
					add($o_bp_grp_cd3);
					add($o_bp_grp_nm3);
					add($o_bp_grp_cd4);
					add($o_bp_grp_nm4);
					add($o_bp_grp_cd5);
					add($o_bp_grp_nm5);
					add($o_bp_grp_cd6);
					add($o_bp_grp_nm6);
					add($o_bp_grp_cd7);
					add($o_bp_grp_nm7);
					add($o_bp_grp_cd8);
					add($o_bp_grp_nm8);
					add($o_bp_grp_cd9);
					add($o_bp_grp_nm9);
					add($o_bp_grp_cd10);
					add($o_bp_grp_nm10);
					add($o_bp_alc_grp);
					add($o_ar_dpt_typ);
					add($o_sls_upri_req_typ);
					add($o_sls_upri_cng_flg);
					add($o_sls_upri_rnd_typ);
					add($o_sls_amt_rnd_typ);
					add($o_sls_tax_calc_typ);
					add($o_sls_tax_rnd_typ);
					add($o_sls_basis_typ);
					add($o_bill_basis_typ);
					add($o_ship_schd_split_typ);
					add($o_bill_crryovr_times);
					add($o_lot_back_stop_typ);
					add($o_slip_each_lot_typ);
					add($o_cst_ship_form_cd);
					add($o_stk_lst_issue_flg);
					add($o_stk_lst_form_cd);
					add($o_sls_tax_cd_prio_flg);
					add($o_wrk_ar_flg);
					add($o_cst_iv_flg);
					add($o_cst_tterm_cd1);
					add($o_cst_tterm_nm1);
					add($o_cst_tterm_cd2);
					add($o_cst_tterm_nm2);
					add($o_cst_tterm_cd3);
					add($o_cst_tterm_nm3);
					add($o_not_lg_mix_flg);
					add($o_not_lot_mix_flg);
					add($o_not_sublot_mix_flg);
					add($o_acst_cd);
					add($o_acst_nm);
					add($o_bcst_cd);
					add($o_bcst_nm);
					add($o_rcst_cd);
					add($o_ar_cred_cd);
					add($o_bill_dpt_typ);
					add($o_bill_cl_typ);
					add($o_bill_cl_day1);
					add($o_bill_cl_day2);
					add($o_bill_cl_day3);
					add($o_bill_cl_day4);
					add($o_bill_cl_day5);
					add($o_tax_on_bill_flg);
					add($o_bill_tax_rnd_typ);
					add($o_bill_cl_delay_days);
					add($o_bill_cl_ba_typ);
					add($o_sls_interim_cl_flg);
					add($o_bill_cal_cd);
					add($o_rcv_ba_typ);
					add($o_bfw_bal_disp_flg);
					add($o_sls_dtl_outp_typ);
					add($o_bill_prnt_typ);
					add($o_bill_dtl_outp_flg);
					add($o_bill_dtl_adv_flg);
					add($o_bill_dtl_rcv_flg);
					add($o_bill_dtl_subttl_typ);
					add($o_bill_dtl_brk_typ);
					add($o_bill_dtl_sort_typ);
					add($o_bill_can_slip_typ);
					add($o_auto_line_appl_flg);
					add($o_ar_setoff_grp_cd);
					add($o_xfr_psn);
					add($o_rcv_auto_appl_tgt_flg);
					add($o_rcv_amt_match_flg);
					add($o_ar_sttl_typ_match_flg);
					add($o_calc_com_paid_flg);
					add($o_auto_appl_delay_days);
					add($o_asppl_cd);
					add($o_subcon_flg);
					add($o_repurc_obli_flg);
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
					add($o_po_dlv_slip_flg);
					add($o_dlv_inst_dlv_slip_flg);
					add($o_prms_rcpt_dlv_slip_flg);
					add($o_pay_crryovr_times);
					add($o_purc_upri_req_typ);
					add($o_purc_upri_cng_flg);
					add($o_purc_amt_rnd_typ);
					add($o_purc_tax_rnd_typ);
					add($o_purc_tax_calc_typ);
					add($o_purc_tax_cd_prio_flg);
					add($o_wrk_po_flg);
					add($o_wrk_ap_flg);
					add($o_prov_rcv_typ);
					add($o_onr_prsppl_flg);
					add($o_outsrc_upri_typ);
					add($o_prov_basis_typ);
					add($o_prov_upri_cng_flg);
					add($o_prov_amt_rnd_typ);
					add($o_prov_tax_rnd_typ);
					add($o_prov_tax_calc_typ);
					add($o_prov_tax_cd_prio_flg);
					add($o_sppl_cal_cd);
					add($o_sppl_iv_flg);
					add($o_prms_recv_flg);
					add($o_sppl_tterm_cd1);
					add($o_sppl_tterm_cd2);
					add($o_sppl_tterm_cd3);
					add($o_bsppl_cd);
					add($o_psppl_cd);
					add($o_ap_cred_cd);
					add($o_pay_spot_flg);
					add($o_psppl_cl_day1);
					add($o_psppl_cl_day2);
					add($o_psppl_cl_day3);
					add($o_psppl_cl_day4);
					add($o_psppl_cl_day5);
					add($o_purc_interim_cl_flg);
					add($o_tax_on_pay_flg);
					add($o_ap_setoff_grp_cd);
					add($o_pay_bank_ac_cd);
					add($o_pay_ntc_adv_pay_flg);
					add($o_psppl_rmrks);
					add($o_note_days);
					add($o_pri_prnt_flg);
					add($o_cnsgn_stktk_flg);
					add($o_via_dlv_typ);
					add($o_tdlv_req_flg);
					add($o_lg_grp_cd);
					add($o_dlv_cal_cd);
					add($o_dlv_chnnl1);
					add($o_dlv_chnnl2);
					add($o_dlv_chnnl3);
					add($o_st_dt);
					add($o_end_dt);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_dlv_cd);
					add($o_cst_cd);
					add($o_def_dlv_cd);
					add($o_def_cst_cd);
					add($o_cst_usr_cd);
					add($o_cst_dpt_cd);
					add($o_edi_po_send_tgt_flg);
					add($o_edi_accpt_send_tgt_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bp_cd, $v_bp_cd);
					put($vn_bp_nm, $v_bp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bp_cd, $s_bp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloDlvCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloDlvCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloDlvCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloDlvCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloDlvCols extends MSUAC_List.SloDlvCols_MC_A {
		//EIクラス
	}

}
