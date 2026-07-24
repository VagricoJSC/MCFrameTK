package mcframe.commonMBUA.MBUAC0010;
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
class MBUAC_List_MC_A extends Object {

	/** 
	  * JnlGrpNo:カラム名クラス
	  */
	protected static class JnlGrpNoCols_MC_A  {
		/** OUT:仕訳グループＮＯ */
		public static final String $o_jnl_grp_no = "jnl_grp_no";
		/** OUT:仕訳備考 */
		public static final String $o_jnl_rmrks = "jnl_rmrks";
		/** VIEW:仕訳グループＮＯ */
		public static final String $v_jnl_grp_no = $o_jnl_grp_no;
		/** VIEW_NO:仕訳グループＮＯ */
		protected static final MCNumber $vn_jnl_grp_no = new MCNumber(10);
		/** SORT:仕訳グループＮＯ */
		public static final String $s_jnl_grp_no = $o_jnl_grp_no;
		/** SORT_NO:仕訳グループＮＯ */
		protected static final MCNumber $sn_jnl_grp_no = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MBUAL0001";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_jnl_grp_no);
					add($o_jnl_rmrks);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_jnl_grp_no, $v_jnl_grp_no);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_jnl_grp_no, $s_jnl_grp_no, DESC);
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
		public static final String[] outAll(){return MBUAC_List.JnlGrpNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MBUAC_List.JnlGrpNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MBUAC_List.JnlGrpNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MBUAC_List.JnlGrpNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class JnlGrpNoCols extends MBUAC_List.JnlGrpNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * BizDatID:カラム名クラス
	  */
	protected static class BizDatIDCols_MC_A  {
		/** IN:業務データ取得区分 */
		public static final String $i_biz_dat_get_typ = "biz_dat_get_typ";
		/** OUT:業務データＩＤ */
		public static final String $o_biz_dat_id = "biz_dat_id";
		/** OUT:業務データ名 */
		public static final String $o_biz_dat_nm = "biz_dat_nm";
		/** OUT:業務データ取得区分 */
		public static final String $o_biz_dat_get_typ = "biz_dat_get_typ";
		/** VIEW:業務データＩＤ */
		public static final String $v_biz_dat_id = $o_biz_dat_id;
		/** VIEW_NO:業務データＩＤ */
		protected static final MCNumber $vn_biz_dat_id = new MCNumber(10);
		/** VIEW:業務データ名 */
		public static final String $v_biz_dat_nm = $o_biz_dat_nm;
		/** VIEW_NO:業務データ名 */
		protected static final MCNumber $vn_biz_dat_nm = new MCNumber(20);
		/** SORT:業務データＩＤ */
		public static final String $s_biz_dat_id = $o_biz_dat_id;
		/** SORT_NO:業務データＩＤ */
		protected static final MCNumber $sn_biz_dat_id = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_biz_dat_id);
					add($o_biz_dat_nm);
					add($o_biz_dat_get_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_biz_dat_id, $v_biz_dat_id);
					put($vn_biz_dat_nm, $v_biz_dat_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_biz_dat_id, $s_biz_dat_id, ASC);
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
		public static final String[] outAll(){return MBUAC_List.BizDatIDCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MBUAC_List.BizDatIDCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MBUAC_List.BizDatIDCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MBUAC_List.BizDatIDCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BizDatIDCols extends MBUAC_List.BizDatIDCols_MC_A {
		//EIクラス
	}


	/** 
	  * BulkImpCtg:カラム名クラス
	  */
	protected static class BulkImpCtgCols_MC_A  {
		/** OUT:テーブルカテゴリ */
		public static final String $o_table_ctg = "table_ctg";
		/** OUT:テーブルカテゴリ名 */
		public static final String $o_table_ctg_nm = "table_ctg_nm";
		/** OUT:テーブルカテゴリ順序 */
		public static final String $o_table_ctg_seq = "table_ctg_seq";
		/** VIEW:テーブルカテゴリ */
		public static final String $v_table_ctg = $o_table_ctg;
		/** VIEW_NO:テーブルカテゴリ */
		protected static final MCNumber $vn_table_ctg = new MCNumber(10);
		/** VIEW:テーブルカテゴリ名 */
		public static final String $v_table_ctg_nm = $o_table_ctg_nm;
		/** VIEW_NO:テーブルカテゴリ名 */
		protected static final MCNumber $vn_table_ctg_nm = new MCNumber(20);
		/** SORT:テーブルカテゴリ */
		public static final String $s_table_ctg = $o_table_ctg;
		/** SORT_NO:テーブルカテゴリ */
		protected static final MCNumber $sn_table_ctg = new MCNumber(20);
		/** SORT:テーブルカテゴリ順序 */
		public static final String $s_table_ctg_seq = $o_table_ctg_seq;
		/** SORT_NO:テーブルカテゴリ順序 */
		protected static final MCNumber $sn_table_ctg_seq = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_table_ctg);
					add($o_table_ctg_nm);
					add($o_table_ctg_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_table_ctg, $v_table_ctg);
					put($vn_table_ctg_nm, $v_table_ctg_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_table_ctg, $s_table_ctg, ASC);
					put($sn_table_ctg_seq, $s_table_ctg_seq, ASC);
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
		public static final String[] outAll(){return MBUAC_List.BulkImpCtgCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MBUAC_List.BulkImpCtgCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MBUAC_List.BulkImpCtgCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MBUAC_List.BulkImpCtgCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BulkImpCtgCols extends MBUAC_List.BulkImpCtgCols_MC_A {
		//EIクラス
	}


	/** 
	  * BulkImpCtl:カラム名クラス
	  */
	protected static class BulkImpCtlCols_MC_A  {
		/** IN:テーブルカテゴリ */
		public static final String $i_table_ctg = "table_ctg";
		/** IN:テーブルカテゴリ名 */
		public static final String $i_table_ctg_nm = "table_ctg_nm";
		/** OUT:テーブルＩＤ */
		public static final String $o_table_id = "table_id";
		/** OUT:テーブル名 */
		public static final String $o_table_nm = "table_nm";
		/** OUT:テーブルカテゴリ */
		public static final String $o_table_ctg = "table_ctg";
		/** OUT:テーブルカテゴリ順序 */
		public static final String $o_table_ctg_seq = "table_ctg_seq";
		/** OUT:テーブル順序 */
		public static final String $o_table_seq = "table_seq";
		/** VIEW:テーブルＩＤ */
		public static final String $v_table_id = $o_table_id;
		/** VIEW_NO:テーブルＩＤ */
		protected static final MCNumber $vn_table_id = new MCNumber(10);
		/** VIEW:テーブル名 */
		public static final String $v_table_nm = $o_table_nm;
		/** VIEW_NO:テーブル名 */
		protected static final MCNumber $vn_table_nm = new MCNumber(20);
		/** SORT:テーブルＩＤ */
		public static final String $s_table_id = $o_table_id;
		/** SORT_NO:テーブルＩＤ */
		protected static final MCNumber $sn_table_id = new MCNumber(40);
		/** SORT:テーブルカテゴリ */
		public static final String $s_table_ctg = $o_table_ctg;
		/** SORT_NO:テーブルカテゴリ */
		protected static final MCNumber $sn_table_ctg = new MCNumber(20);
		/** SORT:テーブルカテゴリ順序 */
		public static final String $s_table_ctg_seq = $o_table_ctg_seq;
		/** SORT_NO:テーブルカテゴリ順序 */
		protected static final MCNumber $sn_table_ctg_seq = new MCNumber(10);
		/** SORT:テーブル順序 */
		public static final String $s_table_seq = $o_table_seq;
		/** SORT_NO:テーブル順序 */
		protected static final MCNumber $sn_table_seq = new MCNumber(30);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_table_id);
					add($o_table_nm);
					add($o_table_ctg);
					add($o_table_ctg_seq);
					add($o_table_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_table_id, $v_table_id);
					put($vn_table_nm, $v_table_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_table_id, $s_table_id, ASC);
					put($sn_table_ctg, $s_table_ctg, ASC);
					put($sn_table_ctg_seq, $s_table_ctg_seq, ASC);
					put($sn_table_seq, $s_table_seq, ASC);
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
		public static final String[] outAll(){return MBUAC_List.BulkImpCtlCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MBUAC_List.BulkImpCtlCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MBUAC_List.BulkImpCtlCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MBUAC_List.BulkImpCtlCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BulkImpCtlCols extends MBUAC_List.BulkImpCtlCols_MC_A {
		//EIクラス
	}

}
