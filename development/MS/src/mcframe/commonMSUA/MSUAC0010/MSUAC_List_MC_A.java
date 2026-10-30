package mcframe.commonMSUA.MSUAC0010;
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
	  * SpplByLoc:カラム名クラス
	  */
	protected static class SpplByLocCols_MC_A  {
		/** IN:場所ＣＤ（必須） */
		public static final String $i_loc_cd = "loc_cd";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:場所ＣＤ（存在チェック用） */
		public static final String $o_loc_cd = "loc_cd";
		/** VIEW:発注先ＣＤ */
		public static final String $v_sppl_cd = $o_sppl_cd;
		/** VIEW_NO:発注先ＣＤ */
		protected static final MCNumber $vn_sppl_cd = new MCNumber(10);
		/** SORT:発注先ＣＤ */
		public static final String $s_sppl_cd = $o_sppl_cd;
		/** SORT_NO:発注先ＣＤ */
		protected static final MCNumber $sn_sppl_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSUAL0007";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "loc_cd";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_loc_cd);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sppl_cd, $v_sppl_cd);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sppl_cd, $s_sppl_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SpplByLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SpplByLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SpplByLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SpplByLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SpplByLocCols extends MSUAC_List.SpplByLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * InXfrTyp:カラム名クラス
	  */
	protected static class InXfrTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_in_xfr_typ = "in_xfr_typ";
		/** OUT:名称 */
		public static final String $o_in_xfr_typ_nm = "in_xfr_typ_nm";
		/** VIEW:値 */
		public static final String $v_in_xfr_typ = $o_in_xfr_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_in_xfr_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_in_xfr_typ_nm = $o_in_xfr_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_in_xfr_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_in_xfr_typ = $o_in_xfr_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_in_xfr_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_in_xfr_typ);
					add($o_in_xfr_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_in_xfr_typ, $v_in_xfr_typ);
					put($vn_in_xfr_typ_nm, $v_in_xfr_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_in_xfr_typ, $s_in_xfr_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InXfrTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InXfrTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InXfrTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InXfrTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InXfrTypCols extends MSUAC_List.InXfrTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkIdTyp:カラム名クラス
	  */
	protected static class StkIdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_stk_id_typ = "stk_id_typ";
		/** OUT:名称 */
		public static final String $o_stk_id_typ_nm = "stk_id_typ_nm";
		/** VIEW:値 */
		public static final String $v_stk_id_typ = $o_stk_id_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_stk_id_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_stk_id_typ_nm = $o_stk_id_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stk_id_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_stk_id_typ = $o_stk_id_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stk_id_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_id_typ);
					add($o_stk_id_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_id_typ, $v_stk_id_typ);
					put($vn_stk_id_typ_nm, $v_stk_id_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_id_typ, $s_stk_id_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StkIdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StkIdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StkIdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StkIdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkIdTypCols extends MSUAC_List.StkIdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmOrdLdStsTyp:カラム名クラス
	  */
	protected static class ItmOrdLdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_itm_ord_ld_sts_typ = "itm_ord_ld_sts_typ";
		/** OUT:名称 */
		public static final String $o_itm_ord_ld_sts_typ_nm = "itm_ord_ld_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_itm_ord_ld_sts_typ = $o_itm_ord_ld_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_itm_ord_ld_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_itm_ord_ld_sts_typ_nm = $o_itm_ord_ld_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_itm_ord_ld_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_itm_ord_ld_sts_typ = $o_itm_ord_ld_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_itm_ord_ld_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_ord_ld_sts_typ);
					add($o_itm_ord_ld_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_ord_ld_sts_typ, $v_itm_ord_ld_sts_typ);
					put($vn_itm_ord_ld_sts_typ_nm, $v_itm_ord_ld_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_ord_ld_sts_typ, $s_itm_ord_ld_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmOrdLdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmOrdLdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmOrdLdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmOrdLdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmOrdLdStsTypCols extends MSUAC_List.ItmOrdLdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * LdDtlTyp:カラム名クラス
	  */
	protected static class LdDtlTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ld_dtl_typ = "ld_dtl_typ";
		/** OUT:名称 */
		public static final String $o_ld_dtl_typ_nm = "ld_dtl_typ_nm";
		/** VIEW:値 */
		public static final String $v_ld_dtl_typ = $o_ld_dtl_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ld_dtl_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ld_dtl_typ_nm = $o_ld_dtl_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ld_dtl_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ld_dtl_typ = $o_ld_dtl_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ld_dtl_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ld_dtl_typ);
					add($o_ld_dtl_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ld_dtl_typ, $v_ld_dtl_typ);
					put($vn_ld_dtl_typ_nm, $v_ld_dtl_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ld_dtl_typ, $s_ld_dtl_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.LdDtlTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.LdDtlTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.LdDtlTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.LdDtlTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class LdDtlTypCols extends MSUAC_List.LdDtlTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * LdSubCalcTyp:カラム名クラス
	  */
	protected static class LdSubCalcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ld_sub_calc_typ = "ld_sub_calc_typ";
		/** OUT:名称 */
		public static final String $o_ld_sub_calc_typ_nm = "ld_sub_calc_typ_nm";
		/** VIEW:値 */
		public static final String $v_ld_sub_calc_typ = $o_ld_sub_calc_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ld_sub_calc_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ld_sub_calc_typ_nm = $o_ld_sub_calc_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ld_sub_calc_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ld_sub_calc_typ = $o_ld_sub_calc_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ld_sub_calc_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ld_sub_calc_typ);
					add($o_ld_sub_calc_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ld_sub_calc_typ, $v_ld_sub_calc_typ);
					put($vn_ld_sub_calc_typ_nm, $v_ld_sub_calc_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ld_sub_calc_typ, $s_ld_sub_calc_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.LdSubCalcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.LdSubCalcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.LdSubCalcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.LdSubCalcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class LdSubCalcTypCols extends MSUAC_List.LdSubCalcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * DmndTyp:カラム名クラス
	  */
	protected static class DmndTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_dmnd_typ = "dmnd_typ";
		/** OUT:名称 */
		public static final String $o_dmnd_typ_nm = "dmnd_typ_nm";
		/** VIEW:値 */
		public static final String $v_dmnd_typ = $o_dmnd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_dmnd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_dmnd_typ_nm = $o_dmnd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_dmnd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_dmnd_typ = $o_dmnd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_dmnd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dmnd_typ);
					add($o_dmnd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dmnd_typ, $v_dmnd_typ);
					put($vn_dmnd_typ_nm, $v_dmnd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dmnd_typ, $s_dmnd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DmndTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DmndTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DmndTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DmndTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DmndTypCols extends MSUAC_List.DmndTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoTyp:カラム名クラス
	  */
	protected static class IoTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_typ = "io_typ";
		/** OUT:名称 */
		public static final String $o_io_typ_nm = "io_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_typ = $o_io_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_typ_nm = $o_io_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_typ = $o_io_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_typ);
					add($o_io_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_typ, $v_io_typ);
					put($vn_io_typ_nm, $v_io_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_typ, $s_io_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IoTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IoTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IoTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IoTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoTypCols extends MSUAC_List.IoTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * TrnTyp:カラム名クラス
	  */
	protected static class TrnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_trn_typ = "trn_typ";
		/** OUT:名称 */
		public static final String $o_trn_typ_nm = "trn_typ_nm";
		/** VIEW:値 */
		public static final String $v_trn_typ = $o_trn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_trn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_trn_typ_nm = $o_trn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_trn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_trn_typ = $o_trn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_trn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_trn_typ);
					add($o_trn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_trn_typ, $v_trn_typ);
					put($vn_trn_typ_nm, $v_trn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_trn_typ, $s_trn_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.TrnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.TrnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.TrnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.TrnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class TrnTypCols extends MSUAC_List.TrnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoActTyp:カラム名クラス
	  */
	protected static class IoActTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_act_typ = "io_act_typ";
		/** OUT:名称 */
		public static final String $o_io_act_typ_nm = "io_act_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_act_typ = $o_io_act_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_act_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_act_typ_nm = $o_io_act_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_act_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_act_typ = $o_io_act_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_act_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_act_typ);
					add($o_io_act_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_act_typ, $v_io_act_typ);
					put($vn_io_act_typ_nm, $v_io_act_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_act_typ, $s_io_act_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IoActTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IoActTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IoActTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IoActTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoActTypCols extends MSUAC_List.IoActTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * FixNoTyp:カラム名クラス
	  */
	protected static class FixNoTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_fix_no_typ = "fix_no_typ";
		/** OUT:名称 */
		public static final String $o_fix_no_typ_nm = "fix_no_typ_nm";
		/** VIEW:値 */
		public static final String $v_fix_no_typ = $o_fix_no_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_fix_no_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_fix_no_typ_nm = $o_fix_no_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_fix_no_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_fix_no_typ = $o_fix_no_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_fix_no_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_fix_no_typ);
					add($o_fix_no_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_fix_no_typ, $v_fix_no_typ);
					put($vn_fix_no_typ_nm, $v_fix_no_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_fix_no_typ, $s_fix_no_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.FixNoTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.FixNoTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.FixNoTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.FixNoTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class FixNoTypCols extends MSUAC_List.FixNoTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkInspTyp:カラム名クラス
	  */
	protected static class StkInspTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_stk_insp_typ = "stk_insp_typ";
		/** OUT:名称 */
		public static final String $o_stk_insp_typ_nm = "stk_insp_typ_nm";
		/** VIEW:値 */
		public static final String $v_stk_insp_typ = $o_stk_insp_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_stk_insp_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_stk_insp_typ_nm = $o_stk_insp_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stk_insp_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_stk_insp_typ = $o_stk_insp_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stk_insp_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_insp_typ);
					add($o_stk_insp_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_insp_typ, $v_stk_insp_typ);
					put($vn_stk_insp_typ_nm, $v_stk_insp_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_insp_typ, $s_stk_insp_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StkInspTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StkInspTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StkInspTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StkInspTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkInspTypCols extends MSUAC_List.StkInspTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InToIdTyp:カラム名クラス
	  */
	protected static class InToIdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_in_to_id_typ = "in_to_id_typ";
		/** OUT:名称 */
		public static final String $o_in_to_id_typ_nm = "in_to_id_typ_nm";
		/** VIEW:値 */
		public static final String $v_in_to_id_typ = $o_in_to_id_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_in_to_id_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_in_to_id_typ_nm = $o_in_to_id_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_in_to_id_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_in_to_id_typ = $o_in_to_id_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_in_to_id_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_in_to_id_typ);
					add($o_in_to_id_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_in_to_id_typ, $v_in_to_id_typ);
					put($vn_in_to_id_typ_nm, $v_in_to_id_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_in_to_id_typ, $s_in_to_id_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InToIdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InToIdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InToIdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InToIdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InToIdTypCols extends MSUAC_List.InToIdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * DlvIdTyp:カラム名クラス
	  */
	protected static class DlvIdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_dlv_id_typ = "dlv_id_typ";
		/** OUT:名称 */
		public static final String $o_dlv_id_typ_nm = "dlv_id_typ_nm";
		/** VIEW:値 */
		public static final String $v_dlv_id_typ = $o_dlv_id_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_dlv_id_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_dlv_id_typ_nm = $o_dlv_id_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_dlv_id_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_dlv_id_typ = $o_dlv_id_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_dlv_id_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dlv_id_typ);
					add($o_dlv_id_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dlv_id_typ, $v_dlv_id_typ);
					put($vn_dlv_id_typ_nm, $v_dlv_id_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dlv_id_typ, $s_dlv_id_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DlvIdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DlvIdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DlvIdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DlvIdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DlvIdTypCols extends MSUAC_List.DlvIdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipToIdTyp:カラム名クラス
	  */
	protected static class ShipToIdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ship_to_id_typ = "ship_to_id_typ";
		/** OUT:名称 */
		public static final String $o_ship_to_id_typ_nm = "ship_to_id_typ_nm";
		/** VIEW:値 */
		public static final String $v_ship_to_id_typ = $o_ship_to_id_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ship_to_id_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ship_to_id_typ_nm = $o_ship_to_id_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ship_to_id_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ship_to_id_typ = $o_ship_to_id_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ship_to_id_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_to_id_typ);
					add($o_ship_to_id_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_to_id_typ, $v_ship_to_id_typ);
					put($vn_ship_to_id_typ_nm, $v_ship_to_id_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_to_id_typ, $s_ship_to_id_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipToIdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipToIdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipToIdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipToIdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipToIdTypCols extends MSUAC_List.ShipToIdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipRqstIdTyp:カラム名クラス
	  */
	protected static class ShipRqstIdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ship_rqst_id_typ = "ship_rqst_id_typ";
		/** OUT:名称 */
		public static final String $o_ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
		/** VIEW:値 */
		public static final String $v_ship_rqst_id_typ = $o_ship_rqst_id_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ship_rqst_id_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ship_rqst_id_typ_nm = $o_ship_rqst_id_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ship_rqst_id_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ship_rqst_id_typ = $o_ship_rqst_id_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ship_rqst_id_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_rqst_id_typ);
					add($o_ship_rqst_id_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_rqst_id_typ, $v_ship_rqst_id_typ);
					put($vn_ship_rqst_id_typ_nm, $v_ship_rqst_id_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_rqst_id_typ, $s_ship_rqst_id_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipRqstIdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipRqstIdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipRqstIdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipRqstIdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipRqstIdTypCols extends MSUAC_List.ShipRqstIdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipAssortTyp:カラム名クラス
	  */
	protected static class ShipAssortTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ship_assort_typ = "ship_assort_typ";
		/** OUT:名称 */
		public static final String $o_ship_assort_typ_nm = "ship_assort_typ_nm";
		/** VIEW:値 */
		public static final String $v_ship_assort_typ = $o_ship_assort_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ship_assort_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ship_assort_typ_nm = $o_ship_assort_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ship_assort_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ship_assort_typ = $o_ship_assort_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ship_assort_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_assort_typ);
					add($o_ship_assort_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_assort_typ, $v_ship_assort_typ);
					put($vn_ship_assort_typ_nm, $v_ship_assort_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_assort_typ, $s_ship_assort_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipAssortTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipAssortTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipAssortTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipAssortTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipAssortTypCols extends MSUAC_List.ShipAssortTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AdvShipCtrlTyp:カラム名クラス
	  */
	protected static class AdvShipCtrlTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_adv_ship_ctrl_typ = "adv_ship_ctrl_typ";
		/** OUT:名称 */
		public static final String $o_adv_ship_ctrl_typ_nm = "adv_ship_ctrl_typ_nm";
		/** VIEW:値 */
		public static final String $v_adv_ship_ctrl_typ = $o_adv_ship_ctrl_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_adv_ship_ctrl_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_adv_ship_ctrl_typ_nm = $o_adv_ship_ctrl_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_adv_ship_ctrl_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_adv_ship_ctrl_typ = $o_adv_ship_ctrl_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_adv_ship_ctrl_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_adv_ship_ctrl_typ);
					add($o_adv_ship_ctrl_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_adv_ship_ctrl_typ, $v_adv_ship_ctrl_typ);
					put($vn_adv_ship_ctrl_typ_nm, $v_adv_ship_ctrl_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_adv_ship_ctrl_typ, $s_adv_ship_ctrl_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AdvShipCtrlTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AdvShipCtrlTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AdvShipCtrlTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AdvShipCtrlTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AdvShipCtrlTypCols extends MSUAC_List.AdvShipCtrlTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsSchdSrcTyp:カラム名クラス
	  */
	protected static class SlsSchdSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sls_schd_src_typ = "sls_schd_src_typ";
		/** OUT:名称 */
		public static final String $o_sls_schd_src_typ_nm = "sls_schd_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_sls_schd_src_typ = $o_sls_schd_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sls_schd_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sls_schd_src_typ_nm = $o_sls_schd_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_schd_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sls_schd_src_typ = $o_sls_schd_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_schd_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_schd_src_typ);
					add($o_sls_schd_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_schd_src_typ, $v_sls_schd_src_typ);
					put($vn_sls_schd_src_typ_nm, $v_sls_schd_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_schd_src_typ, $s_sls_schd_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsSchdSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsSchdSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsSchdSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsSchdSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsSchdSrcTypCols extends MSUAC_List.SlsSchdSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SretSchdStsTyp:カラム名クラス
	  */
	protected static class SretSchdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sret_schd_sts_typ = "sret_schd_sts_typ";
		/** OUT:名称 */
		public static final String $o_sret_schd_sts_typ_nm = "sret_schd_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_sret_schd_sts_typ = $o_sret_schd_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sret_schd_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sret_schd_sts_typ_nm = $o_sret_schd_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sret_schd_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sret_schd_sts_typ = $o_sret_schd_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sret_schd_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sret_schd_sts_typ);
					add($o_sret_schd_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sret_schd_sts_typ, $v_sret_schd_sts_typ);
					put($vn_sret_schd_sts_typ_nm, $v_sret_schd_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sret_schd_sts_typ, $s_sret_schd_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SretSchdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SretSchdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SretSchdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SretSchdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SretSchdStsTypCols extends MSUAC_List.SretSchdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AccptStsTyp:カラム名クラス
	  */
	protected static class AccptStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_accpt_sts_typ = "accpt_sts_typ";
		/** OUT:名称 */
		public static final String $o_accpt_sts_typ_nm = "accpt_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_accpt_sts_typ = $o_accpt_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_accpt_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_accpt_sts_typ_nm = $o_accpt_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_accpt_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_accpt_sts_typ = $o_accpt_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_accpt_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_accpt_sts_typ);
					add($o_accpt_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_accpt_sts_typ, $v_accpt_sts_typ);
					put($vn_accpt_sts_typ_nm, $v_accpt_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_accpt_sts_typ, $s_accpt_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AccptStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AccptStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AccptStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AccptStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AccptStsTypCols extends MSUAC_List.AccptStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsTgtTyp:カラム名クラス
	  */
	protected static class SlsTgtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sls_tgt_typ = "sls_tgt_typ";
		/** OUT:名称 */
		public static final String $o_sls_tgt_typ_nm = "sls_tgt_typ_nm";
		/** VIEW:値 */
		public static final String $v_sls_tgt_typ = $o_sls_tgt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sls_tgt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sls_tgt_typ_nm = $o_sls_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_tgt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sls_tgt_typ = $o_sls_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_tgt_typ);
					add($o_sls_tgt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_tgt_typ, $v_sls_tgt_typ);
					put($vn_sls_tgt_typ_nm, $v_sls_tgt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_tgt_typ, $s_sls_tgt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsTgtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsTgtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsTgtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsTgtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsTgtTypCols extends MSUAC_List.SlsTgtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AllocStsTyp:カラム名クラス
	  */
	protected static class AllocStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_alloc_sts_typ = "alloc_sts_typ";
		/** OUT:名称 */
		public static final String $o_alloc_sts_typ_nm = "alloc_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_alloc_sts_typ = $o_alloc_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_alloc_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_alloc_sts_typ_nm = $o_alloc_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_alloc_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_alloc_sts_typ = $o_alloc_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_alloc_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_alloc_sts_typ);
					add($o_alloc_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_alloc_sts_typ, $v_alloc_sts_typ);
					put($vn_alloc_sts_typ_nm, $v_alloc_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_alloc_sts_typ, $s_alloc_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AllocStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AllocStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AllocStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AllocStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AllocStsTypCols extends MSUAC_List.AllocStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PrStsTyp:カラム名クラス
	  */
	protected static class PrStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pr_sts_typ = "pr_sts_typ";
		/** OUT:名称 */
		public static final String $o_pr_sts_typ_nm = "pr_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_pr_sts_typ = $o_pr_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pr_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pr_sts_typ_nm = $o_pr_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pr_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pr_sts_typ = $o_pr_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pr_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pr_sts_typ);
					add($o_pr_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pr_sts_typ, $v_pr_sts_typ);
					put($vn_pr_sts_typ_nm, $v_pr_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pr_sts_typ, $s_pr_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PrStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PrStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PrStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PrStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PrStsTypCols extends MSUAC_List.PrStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsStsTyp:カラム名クラス
	  */
	protected static class SlsStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sls_sts_typ = "sls_sts_typ";
		/** OUT:名称 */
		public static final String $o_sls_sts_typ_nm = "sls_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_sls_sts_typ = $o_sls_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sls_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sls_sts_typ_nm = $o_sls_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sls_sts_typ = $o_sls_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_sts_typ);
					add($o_sls_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_sts_typ, $v_sls_sts_typ);
					put($vn_sls_sts_typ_nm, $v_sls_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_sts_typ, $s_sls_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsStsTypCols extends MSUAC_List.SlsStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsSrchTgtTyp:カラム名クラス
	  */
	protected static class SlsSrchTgtTypCols_MC_A  {
		/** OUT:名称 */
		public static final String $o_sls_srch_tgt_typ_nm = "sls_srch_tgt_typ_nm";
		/** OUT:値 */
		public static final String $o_sls_srch_tgt_typ = "sls_srch_tgt_typ";
		/** VIEW:名称 */
		public static final String $v_sls_srch_tgt_typ_nm = $o_sls_srch_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_srch_tgt_typ_nm = new MCNumber(10);
		/** SORT:値 */
		public static final String $s_sls_srch_tgt_typ = $o_sls_srch_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_srch_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_srch_tgt_typ_nm);
					add($o_sls_srch_tgt_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_srch_tgt_typ_nm, $v_sls_srch_tgt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_srch_tgt_typ, $s_sls_srch_tgt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsSrchTgtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsSrchTgtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsSrchTgtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsSrchTgtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsSrchTgtTypCols extends MSUAC_List.SlsSrchTgtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcSrchTgtTyp:カラム名クラス
	  */
	protected static class PurcSrchTgtTypCols_MC_A  {
		/** OUT:名称 */
		public static final String $o_purc_srch_tgt_typ_nm = "purc_srch_tgt_typ_nm";
		/** OUT:値 */
		public static final String $o_purc_srch_tgt_typ = "purc_srch_tgt_typ";
		/** VIEW:名称 */
		public static final String $v_purc_srch_tgt_typ_nm = $o_purc_srch_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_srch_tgt_typ_nm = new MCNumber(10);
		/** SORT:値 */
		public static final String $s_purc_srch_tgt_typ = $o_purc_srch_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_srch_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_srch_tgt_typ_nm);
					add($o_purc_srch_tgt_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_srch_tgt_typ_nm, $v_purc_srch_tgt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_srch_tgt_typ, $s_purc_srch_tgt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcSrchTgtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcSrchTgtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcSrchTgtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcSrchTgtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcSrchTgtTypCols extends MSUAC_List.PurcSrchTgtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ProdSrchTgtTyp:カラム名クラス
	  */
	protected static class ProdSrchTgtTypCols_MC_A  {
		/** OUT:名称 */
		public static final String $o_prod_srch_tgt_typ_nm = "prod_srch_tgt_typ_nm";
		/** OUT:値 */
		public static final String $o_prod_srch_tgt_typ = "prod_srch_tgt_typ";
		/** VIEW:名称 */
		public static final String $v_prod_srch_tgt_typ_nm = $o_prod_srch_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prod_srch_tgt_typ_nm = new MCNumber(10);
		/** SORT:値 */
		public static final String $s_prod_srch_tgt_typ = $o_prod_srch_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prod_srch_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prod_srch_tgt_typ_nm);
					add($o_prod_srch_tgt_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prod_srch_tgt_typ_nm, $v_prod_srch_tgt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prod_srch_tgt_typ, $s_prod_srch_tgt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ProdSrchTgtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ProdSrchTgtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ProdSrchTgtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ProdSrchTgtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ProdSrchTgtTypCols extends MSUAC_List.ProdSrchTgtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkSrchTgtTyp:カラム名クラス
	  */
	protected static class StkSrchTgtTypCols_MC_A  {
		/** OUT:名称 */
		public static final String $o_stk_srch_tgt_typ_nm = "stk_srch_tgt_typ_nm";
		/** OUT:値 */
		public static final String $o_stk_srch_tgt_typ = "stk_srch_tgt_typ";
		/** VIEW:名称 */
		public static final String $v_stk_srch_tgt_typ_nm = $o_stk_srch_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stk_srch_tgt_typ_nm = new MCNumber(10);
		/** SORT:値 */
		public static final String $s_stk_srch_tgt_typ = $o_stk_srch_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stk_srch_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_srch_tgt_typ_nm);
					add($o_stk_srch_tgt_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_srch_tgt_typ_nm, $v_stk_srch_tgt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_srch_tgt_typ, $s_stk_srch_tgt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StkSrchTgtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StkSrchTgtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StkSrchTgtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StkSrchTgtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkSrchTgtTypCols extends MSUAC_List.StkSrchTgtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PoSchdSrcTyp:カラム名クラス
	  */
	protected static class PoSchdSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_po_schd_src_typ = "po_schd_src_typ";
		/** OUT:名称 */
		public static final String $o_po_schd_src_typ_nm = "po_schd_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_po_schd_src_typ = $o_po_schd_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_po_schd_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_po_schd_src_typ_nm = $o_po_schd_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_po_schd_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_po_schd_src_typ = $o_po_schd_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_po_schd_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_po_schd_src_typ);
					add($o_po_schd_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_po_schd_src_typ, $v_po_schd_src_typ);
					put($vn_po_schd_src_typ_nm, $v_po_schd_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_po_schd_src_typ, $s_po_schd_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PoSchdSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PoSchdSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PoSchdSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PoSchdSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PoSchdSrcTypCols extends MSUAC_List.PoSchdSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcSrcTyp:カラム名クラス
	  */
	protected static class PurcSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_src_typ = "purc_src_typ";
		/** OUT:名称 */
		public static final String $o_purc_src_typ_nm = "purc_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_src_typ = $o_purc_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_src_typ_nm = $o_purc_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_src_typ = $o_purc_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_src_typ);
					add($o_purc_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_src_typ, $v_purc_src_typ);
					put($vn_purc_src_typ_nm, $v_purc_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_src_typ, $s_purc_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcSrcTypCols extends MSUAC_List.PurcSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PoSchdChgTyp:カラム名クラス
	  */
	protected static class PoSchdChgTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_po_schd_chg_typ = "po_schd_chg_typ";
		/** OUT:名称 */
		public static final String $o_po_schd_chg_typ_nm = "po_schd_chg_typ_nm";
		/** VIEW:値 */
		public static final String $v_po_schd_chg_typ = $o_po_schd_chg_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_po_schd_chg_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_po_schd_chg_typ_nm = $o_po_schd_chg_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_po_schd_chg_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_po_schd_chg_typ = $o_po_schd_chg_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_po_schd_chg_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_po_schd_chg_typ);
					add($o_po_schd_chg_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_po_schd_chg_typ, $v_po_schd_chg_typ);
					put($vn_po_schd_chg_typ_nm, $v_po_schd_chg_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_po_schd_chg_typ, $s_po_schd_chg_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PoSchdChgTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PoSchdChgTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PoSchdChgTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PoSchdChgTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PoSchdChgTypCols extends MSUAC_List.PoSchdChgTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * UpriModTyp:カラム名クラス
	  */
	protected static class UpriModTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_upri_mod_typ = "upri_mod_typ";
		/** OUT:名称 */
		public static final String $o_upri_mod_typ_nm = "upri_mod_typ_nm";
		/** VIEW:値 */
		public static final String $v_upri_mod_typ = $o_upri_mod_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_upri_mod_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_upri_mod_typ_nm = $o_upri_mod_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_upri_mod_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_upri_mod_typ = $o_upri_mod_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_upri_mod_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_upri_mod_typ);
					add($o_upri_mod_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_upri_mod_typ, $v_upri_mod_typ);
					put($vn_upri_mod_typ_nm, $v_upri_mod_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_upri_mod_typ, $s_upri_mod_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.UpriModTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.UpriModTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.UpriModTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.UpriModTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class UpriModTypCols extends MSUAC_List.UpriModTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PoSchdStsTyp:カラム名クラス
	  */
	protected static class PoSchdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_po_schd_sts_typ = "po_schd_sts_typ";
		/** OUT:名称 */
		public static final String $o_po_schd_sts_typ_nm = "po_schd_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_po_schd_sts_typ = $o_po_schd_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_po_schd_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_po_schd_sts_typ_nm = $o_po_schd_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_po_schd_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_po_schd_sts_typ = $o_po_schd_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_po_schd_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_po_schd_sts_typ);
					add($o_po_schd_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_po_schd_sts_typ, $v_po_schd_sts_typ);
					put($vn_po_schd_sts_typ_nm, $v_po_schd_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_po_schd_sts_typ, $s_po_schd_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PoSchdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PoSchdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PoSchdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PoSchdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PoSchdStsTypCols extends MSUAC_List.PoSchdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcStsTyp:カラム名クラス
	  */
	protected static class PurcStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_sts_typ = "purc_sts_typ";
		/** OUT:名称 */
		public static final String $o_purc_sts_typ_nm = "purc_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_sts_typ = $o_purc_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_sts_typ_nm = $o_purc_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_sts_typ = $o_purc_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_sts_typ);
					add($o_purc_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_sts_typ, $v_purc_sts_typ);
					put($vn_purc_sts_typ_nm, $v_purc_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_sts_typ, $s_purc_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcStsTypCols extends MSUAC_List.PurcStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * DrctDlvTyp:カラム名クラス
	  */
	protected static class DrctDlvTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_drct_dlv_typ = "drct_dlv_typ";
		/** OUT:名称 */
		public static final String $o_drct_dlv_typ_nm = "drct_dlv_typ_nm";
		/** VIEW:値 */
		public static final String $v_drct_dlv_typ = $o_drct_dlv_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_drct_dlv_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_drct_dlv_typ_nm = $o_drct_dlv_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_drct_dlv_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_drct_dlv_typ = $o_drct_dlv_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_drct_dlv_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_drct_dlv_typ);
					add($o_drct_dlv_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_drct_dlv_typ, $v_drct_dlv_typ);
					put($vn_drct_dlv_typ_nm, $v_drct_dlv_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_drct_dlv_typ, $s_drct_dlv_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DrctDlvTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DrctDlvTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DrctDlvTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DrctDlvTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DrctDlvTypCols extends MSUAC_List.DrctDlvTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcUnfixStr:カラム名クラス
	  */
	protected static class PurcUnfixStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_unfix_str = "purc_unfix_str";
		/** OUT:名称 */
		public static final String $o_purc_unfix_str_nm = "purc_unfix_str_nm";
		/** VIEW:値 */
		public static final String $v_purc_unfix_str = $o_purc_unfix_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_unfix_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_unfix_str_nm = $o_purc_unfix_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_unfix_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_unfix_str = $o_purc_unfix_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_unfix_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_unfix_str);
					add($o_purc_unfix_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_unfix_str, $v_purc_unfix_str);
					put($vn_purc_unfix_str_nm, $v_purc_unfix_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_unfix_str, $s_purc_unfix_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcUnfixStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcUnfixStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcUnfixStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcUnfixStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcUnfixStrCols extends MSUAC_List.PurcUnfixStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * OpRplMtdTyp:カラム名クラス
	  */
	protected static class OpRplMtdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_op_rpl_mtd_typ = "op_rpl_mtd_typ";
		/** OUT:名称 */
		public static final String $o_op_rpl_mtd_typ_nm = "op_rpl_mtd_typ_nm";
		/** VIEW:値 */
		public static final String $v_op_rpl_mtd_typ = $o_op_rpl_mtd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_op_rpl_mtd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_op_rpl_mtd_typ_nm = $o_op_rpl_mtd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_op_rpl_mtd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_op_rpl_mtd_typ = $o_op_rpl_mtd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_op_rpl_mtd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_op_rpl_mtd_typ);
					add($o_op_rpl_mtd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_op_rpl_mtd_typ, $v_op_rpl_mtd_typ);
					put($vn_op_rpl_mtd_typ_nm, $v_op_rpl_mtd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_op_rpl_mtd_typ, $s_op_rpl_mtd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.OpRplMtdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.OpRplMtdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.OpRplMtdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.OpRplMtdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class OpRplMtdTypCols extends MSUAC_List.OpRplMtdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WrkMngTyp:カラム名クラス
	  */
	protected static class WrkMngTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wrk_mng_typ = "wrk_mng_typ";
		/** OUT:名称 */
		public static final String $o_wrk_mng_typ_nm = "wrk_mng_typ_nm";
		/** VIEW:値 */
		public static final String $v_wrk_mng_typ = $o_wrk_mng_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wrk_mng_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wrk_mng_typ_nm = $o_wrk_mng_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wrk_mng_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wrk_mng_typ = $o_wrk_mng_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wrk_mng_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_mng_typ);
					add($o_wrk_mng_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_mng_typ, $v_wrk_mng_typ);
					put($vn_wrk_mng_typ_nm, $v_wrk_mng_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_mng_typ, $s_wrk_mng_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WrkMngTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WrkMngTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WrkMngTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WrkMngTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WrkMngTypCols extends MSUAC_List.WrkMngTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtnTyp:カラム名クラス
	  */
	protected static class QtnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_qtn_typ = "qtn_typ";
		/** OUT:名称 */
		public static final String $o_qtn_typ_nm = "qtn_typ_nm";
		/** VIEW:値 */
		public static final String $v_qtn_typ = $o_qtn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_qtn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_qtn_typ_nm = $o_qtn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_qtn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_qtn_typ = $o_qtn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_qtn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_qtn_typ);
					add($o_qtn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_qtn_typ, $v_qtn_typ);
					put($vn_qtn_typ_nm, $v_qtn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_qtn_typ, $s_qtn_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QtnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QtnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QtnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QtnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtnTypCols extends MSUAC_List.QtnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoSchdTyp:カラム名クラス
	  */
	protected static class IoSchdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_schd_typ = "io_schd_typ";
		/** OUT:名称 */
		public static final String $o_io_schd_typ_nm = "io_schd_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_schd_typ = $o_io_schd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_schd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_schd_typ_nm = $o_io_schd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_schd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_schd_typ = $o_io_schd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_schd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_schd_typ);
					add($o_io_schd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_schd_typ, $v_io_schd_typ);
					put($vn_io_schd_typ_nm, $v_io_schd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_schd_typ, $s_io_schd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IoSchdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IoSchdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IoSchdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IoSchdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoSchdTypCols extends MSUAC_List.IoSchdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoSchdStsTyp:カラム名クラス
	  */
	protected static class IoSchdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_schd_sts_typ = "io_schd_sts_typ";
		/** OUT:名称 */
		public static final String $o_io_schd_sts_typ_nm = "io_schd_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_schd_sts_typ = $o_io_schd_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_schd_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_schd_sts_typ_nm = $o_io_schd_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_schd_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_schd_sts_typ = $o_io_schd_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_schd_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_schd_sts_typ);
					add($o_io_schd_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_schd_sts_typ, $v_io_schd_sts_typ);
					put($vn_io_schd_sts_typ_nm, $v_io_schd_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_schd_sts_typ, $s_io_schd_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IoSchdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IoSchdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IoSchdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IoSchdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoSchdStsTypCols extends MSUAC_List.IoSchdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * IoSchdSubTyp:カラム名クラス
	  */
	protected static class IoSchdSubTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_io_schd_sub_typ = "io_schd_sub_typ";
		/** OUT:名称 */
		public static final String $o_io_schd_sub_typ_nm = "io_schd_sub_typ_nm";
		/** VIEW:値 */
		public static final String $v_io_schd_sub_typ = $o_io_schd_sub_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_io_schd_sub_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_io_schd_sub_typ_nm = $o_io_schd_sub_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_io_schd_sub_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_io_schd_sub_typ = $o_io_schd_sub_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_io_schd_sub_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_io_schd_sub_typ);
					add($o_io_schd_sub_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_io_schd_sub_typ, $v_io_schd_sub_typ);
					put($vn_io_schd_sub_typ_nm, $v_io_schd_sub_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_io_schd_sub_typ, $s_io_schd_sub_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IoSchdSubTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IoSchdSubTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IoSchdSubTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IoSchdSubTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IoSchdSubTypCols extends MSUAC_List.IoSchdSubTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShortOpeTyp:カラム名クラス
	  */
	protected static class ShortOpeTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_short_ope_typ = "short_ope_typ";
		/** OUT:名称 */
		public static final String $o_short_ope_typ_nm = "short_ope_typ_nm";
		/** VIEW:値 */
		public static final String $v_short_ope_typ = $o_short_ope_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_short_ope_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_short_ope_typ_nm = $o_short_ope_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_short_ope_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_short_ope_typ = $o_short_ope_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_short_ope_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_short_ope_typ);
					add($o_short_ope_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_short_ope_typ, $v_short_ope_typ);
					put($vn_short_ope_typ_nm, $v_short_ope_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_short_ope_typ, $s_short_ope_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShortOpeTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShortOpeTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShortOpeTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShortOpeTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShortOpeTypCols extends MSUAC_List.ShortOpeTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SchdStkTyp:カラム名クラス
	  */
	protected static class SchdStkTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_schd_stk_typ = "schd_stk_typ";
		/** OUT:名称 */
		public static final String $o_schd_stk_typ_nm = "schd_stk_typ_nm";
		/** VIEW:値 */
		public static final String $v_schd_stk_typ = $o_schd_stk_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_schd_stk_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_schd_stk_typ_nm = $o_schd_stk_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_schd_stk_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_schd_stk_typ = $o_schd_stk_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_schd_stk_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_schd_stk_typ);
					add($o_schd_stk_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_schd_stk_typ, $v_schd_stk_typ);
					put($vn_schd_stk_typ_nm, $v_schd_stk_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_schd_stk_typ, $s_schd_stk_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SchdStkTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SchdStkTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SchdStkTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SchdStkTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SchdStkTypCols extends MSUAC_List.SchdStkTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * OrdGnrtTyp:カラム名クラス
	  */
	protected static class OrdGnrtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ord_gnrt_typ = "ord_gnrt_typ";
		/** OUT:名称 */
		public static final String $o_ord_gnrt_typ_nm = "ord_gnrt_typ_nm";
		/** VIEW:値 */
		public static final String $v_ord_gnrt_typ = $o_ord_gnrt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ord_gnrt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ord_gnrt_typ_nm = $o_ord_gnrt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ord_gnrt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ord_gnrt_typ = $o_ord_gnrt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ord_gnrt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ord_gnrt_typ);
					add($o_ord_gnrt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ord_gnrt_typ, $v_ord_gnrt_typ);
					put($vn_ord_gnrt_typ_nm, $v_ord_gnrt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ord_gnrt_typ, $s_ord_gnrt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.OrdGnrtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.OrdGnrtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.OrdGnrtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.OrdGnrtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class OrdGnrtTypCols extends MSUAC_List.OrdGnrtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * RqmtGnrtTyp:カラム名クラス
	  */
	protected static class RqmtGnrtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_rqmt_gnrt_typ = "rqmt_gnrt_typ";
		/** OUT:名称 */
		public static final String $o_rqmt_gnrt_typ_nm = "rqmt_gnrt_typ_nm";
		/** VIEW:値 */
		public static final String $v_rqmt_gnrt_typ = $o_rqmt_gnrt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_rqmt_gnrt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_rqmt_gnrt_typ_nm = $o_rqmt_gnrt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_rqmt_gnrt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_rqmt_gnrt_typ = $o_rqmt_gnrt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_rqmt_gnrt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_rqmt_gnrt_typ);
					add($o_rqmt_gnrt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_rqmt_gnrt_typ, $v_rqmt_gnrt_typ);
					put($vn_rqmt_gnrt_typ_nm, $v_rqmt_gnrt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_rqmt_gnrt_typ, $s_rqmt_gnrt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.RqmtGnrtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.RqmtGnrtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.RqmtGnrtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.RqmtGnrtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class RqmtGnrtTypCols extends MSUAC_List.RqmtGnrtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmOrdTyp:カラム名クラス
	  */
	protected static class ItmOrdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_itm_ord_typ = "itm_ord_typ";
		/** OUT:名称 */
		public static final String $o_itm_ord_typ_nm = "itm_ord_typ_nm";
		/** VIEW:値 */
		public static final String $v_itm_ord_typ = $o_itm_ord_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_itm_ord_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_itm_ord_typ_nm = $o_itm_ord_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_itm_ord_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_itm_ord_typ = $o_itm_ord_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_itm_ord_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_ord_typ);
					add($o_itm_ord_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_ord_typ, $v_itm_ord_typ);
					put($vn_itm_ord_typ_nm, $v_itm_ord_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_ord_typ, $s_itm_ord_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmOrdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmOrdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmOrdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmOrdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmOrdTypCols extends MSUAC_List.ItmOrdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmOrdStsTyp:カラム名クラス
	  */
	protected static class ItmOrdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_itm_ord_sts_typ = "itm_ord_sts_typ";
		/** OUT:名称 */
		public static final String $o_itm_ord_sts_typ_nm = "itm_ord_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_itm_ord_sts_typ = $o_itm_ord_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_itm_ord_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_itm_ord_sts_typ_nm = $o_itm_ord_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_itm_ord_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_itm_ord_sts_typ = $o_itm_ord_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_itm_ord_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_itm_ord_sts_typ);
					add($o_itm_ord_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_itm_ord_sts_typ, $v_itm_ord_sts_typ);
					put($vn_itm_ord_sts_typ_nm, $v_itm_ord_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_ord_sts_typ, $s_itm_ord_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmOrdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmOrdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmOrdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmOrdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmOrdStsTypCols extends MSUAC_List.ItmOrdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrpRqmtTyp:カラム名クラス
	  */
	protected static class MrpRqmtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrp_rqmt_typ = "mrp_rqmt_typ";
		/** OUT:名称 */
		public static final String $o_mrp_rqmt_typ_nm = "mrp_rqmt_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrp_rqmt_typ = $o_mrp_rqmt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrp_rqmt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrp_rqmt_typ_nm = $o_mrp_rqmt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrp_rqmt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrp_rqmt_typ = $o_mrp_rqmt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrp_rqmt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrp_rqmt_typ);
					add($o_mrp_rqmt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrp_rqmt_typ, $v_mrp_rqmt_typ);
					put($vn_mrp_rqmt_typ_nm, $v_mrp_rqmt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrp_rqmt_typ, $s_mrp_rqmt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrpRqmtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrpRqmtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrpRqmtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrpRqmtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrpRqmtTypCols extends MSUAC_List.MrpRqmtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * OperOrdStsTyp:カラム名クラス
	  */
	protected static class OperOrdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_oper_ord_sts_typ = "oper_ord_sts_typ";
		/** OUT:名称 */
		public static final String $o_oper_ord_sts_typ_nm = "oper_ord_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_oper_ord_sts_typ = $o_oper_ord_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_oper_ord_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_oper_ord_sts_typ_nm = $o_oper_ord_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_oper_ord_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_oper_ord_sts_typ = $o_oper_ord_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_oper_ord_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_oper_ord_sts_typ);
					add($o_oper_ord_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_oper_ord_sts_typ, $v_oper_ord_sts_typ);
					put($vn_oper_ord_sts_typ_nm, $v_oper_ord_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_oper_ord_sts_typ, $s_oper_ord_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.OperOrdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.OperOrdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.OperOrdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.OperOrdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class OperOrdStsTypCols extends MSUAC_List.OperOrdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrpCntrTyp:カラム名クラス
	  */
	protected static class MrpCntrTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrp_cntr_typ = "mrp_cntr_typ";
		/** OUT:名称 */
		public static final String $o_mrp_cntr_typ_nm = "mrp_cntr_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrp_cntr_typ = $o_mrp_cntr_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrp_cntr_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrp_cntr_typ_nm = $o_mrp_cntr_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrp_cntr_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrp_cntr_typ = $o_mrp_cntr_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrp_cntr_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrp_cntr_typ);
					add($o_mrp_cntr_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrp_cntr_typ, $v_mrp_cntr_typ);
					put($vn_mrp_cntr_typ_nm, $v_mrp_cntr_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrp_cntr_typ, $s_mrp_cntr_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrpCntrTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrpCntrTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrpCntrTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrpCntrTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrpCntrTypCols extends MSUAC_List.MrpCntrTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SimMrpTyp:カラム名クラス
	  */
	protected static class SimMrpTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sim_mrp_typ = "sim_mrp_typ";
		/** OUT:名称 */
		public static final String $o_sim_mrp_typ_nm = "sim_mrp_typ_nm";
		/** VIEW:値 */
		public static final String $v_sim_mrp_typ = $o_sim_mrp_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sim_mrp_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sim_mrp_typ_nm = $o_sim_mrp_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sim_mrp_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sim_mrp_typ = $o_sim_mrp_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sim_mrp_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sim_mrp_typ);
					add($o_sim_mrp_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sim_mrp_typ, $v_sim_mrp_typ);
					put($vn_sim_mrp_typ_nm, $v_sim_mrp_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sim_mrp_typ, $s_sim_mrp_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SimMrpTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SimMrpTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SimMrpTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SimMrpTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SimMrpTypCols extends MSUAC_List.SimMrpTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrpTyp:カラム名クラス
	  */
	protected static class MrpTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrp_typ = "mrp_typ";
		/** OUT:名称 */
		public static final String $o_mrp_typ_nm = "mrp_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrp_typ = $o_mrp_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrp_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrp_typ_nm = $o_mrp_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrp_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrp_typ = $o_mrp_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrp_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrp_typ);
					add($o_mrp_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrp_typ, $v_mrp_typ);
					put($vn_mrp_typ_nm, $v_mrp_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrp_typ, $s_mrp_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrpTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrpTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrpTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrpTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrpTypCols extends MSUAC_List.MrpTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrpDataTyp:カラム名クラス
	  */
	protected static class MrpDataTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrp_data_typ = "mrp_data_typ";
		/** OUT:名称 */
		public static final String $o_mrp_data_typ_nm = "mrp_data_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrp_data_typ = $o_mrp_data_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrp_data_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrp_data_typ_nm = $o_mrp_data_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrp_data_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrp_data_typ = $o_mrp_data_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrp_data_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrp_data_typ);
					add($o_mrp_data_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrp_data_typ, $v_mrp_data_typ);
					put($vn_mrp_data_typ_nm, $v_mrp_data_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrp_data_typ, $s_mrp_data_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrpDataTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrpDataTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrpDataTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrpDataTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrpDataTypCols extends MSUAC_List.MrpDataTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgSoAprvTyp:カラム名クラス
	  */
	protected static class MfgSoAprvTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mfg_so_aprv_typ = "mfg_so_aprv_typ";
		/** OUT:名称 */
		public static final String $o_mfg_so_aprv_typ_nm = "mfg_so_aprv_typ_nm";
		/** VIEW:値 */
		public static final String $v_mfg_so_aprv_typ = $o_mfg_so_aprv_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mfg_so_aprv_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mfg_so_aprv_typ_nm = $o_mfg_so_aprv_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mfg_so_aprv_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mfg_so_aprv_typ = $o_mfg_so_aprv_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mfg_so_aprv_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_so_aprv_typ);
					add($o_mfg_so_aprv_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_so_aprv_typ, $v_mfg_so_aprv_typ);
					put($vn_mfg_so_aprv_typ_nm, $v_mfg_so_aprv_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_so_aprv_typ, $s_mfg_so_aprv_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgSoAprvTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgSoAprvTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgSoAprvTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgSoAprvTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgSoAprvTypCols extends MSUAC_List.MfgSoAprvTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * QualityMngTyp:カラム名クラス
	  */
	protected static class QualityMngTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_quality_mng_typ = "quality_mng_typ";
		/** OUT:名称 */
		public static final String $o_quality_mng_typ_nm = "quality_mng_typ_nm";
		/** VIEW:値 */
		public static final String $v_quality_mng_typ = $o_quality_mng_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_quality_mng_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_quality_mng_typ_nm = $o_quality_mng_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_quality_mng_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_quality_mng_typ = $o_quality_mng_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_quality_mng_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_quality_mng_typ);
					add($o_quality_mng_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_quality_mng_typ, $v_quality_mng_typ);
					put($vn_quality_mng_typ_nm, $v_quality_mng_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_quality_mng_typ, $s_quality_mng_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QualityMngTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QualityMngTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QualityMngTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QualityMngTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QualityMngTypCols extends MSUAC_List.QualityMngTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgMngTyp:カラム名クラス
	  */
	protected static class MfgMngTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mfg_mng_typ = "mfg_mng_typ";
		/** OUT:名称 */
		public static final String $o_mfg_mng_typ_nm = "mfg_mng_typ_nm";
		/** VIEW:値 */
		public static final String $v_mfg_mng_typ = $o_mfg_mng_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mfg_mng_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mfg_mng_typ_nm = $o_mfg_mng_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mfg_mng_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mfg_mng_typ = $o_mfg_mng_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mfg_mng_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_mng_typ);
					add($o_mfg_mng_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_mng_typ, $v_mfg_mng_typ);
					put($vn_mfg_mng_typ_nm, $v_mfg_mng_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_mng_typ, $s_mfg_mng_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgMngTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgMngTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgMngTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgMngTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgMngTypCols extends MSUAC_List.MfgMngTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * DeviantTyp:カラム名クラス
	  */
	protected static class DeviantTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_deviant_typ = "deviant_typ";
		/** OUT:名称 */
		public static final String $o_deviant_typ_nm = "deviant_typ_nm";
		/** VIEW:値 */
		public static final String $v_deviant_typ = $o_deviant_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_deviant_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_deviant_typ_nm = $o_deviant_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_deviant_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_deviant_typ = $o_deviant_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_deviant_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_deviant_typ);
					add($o_deviant_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_deviant_typ, $v_deviant_typ);
					put($vn_deviant_typ_nm, $v_deviant_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_deviant_typ, $s_deviant_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DeviantTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DeviantTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DeviantTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DeviantTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DeviantTypCols extends MSUAC_List.DeviantTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * DeviantMsrTyp:カラム名クラス
	  */
	protected static class DeviantMsrTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_deviant_msr_typ = "deviant_msr_typ";
		/** OUT:名称 */
		public static final String $o_deviant_msr_typ_nm = "deviant_msr_typ_nm";
		/** VIEW:値 */
		public static final String $v_deviant_msr_typ = $o_deviant_msr_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_deviant_msr_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_deviant_msr_typ_nm = $o_deviant_msr_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_deviant_msr_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_deviant_msr_typ = $o_deviant_msr_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_deviant_msr_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_deviant_msr_typ);
					add($o_deviant_msr_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_deviant_msr_typ, $v_deviant_msr_typ);
					put($vn_deviant_msr_typ_nm, $v_deviant_msr_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_deviant_msr_typ, $s_deviant_msr_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DeviantMsrTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DeviantMsrTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DeviantMsrTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DeviantMsrTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DeviantMsrTypCols extends MSUAC_List.DeviantMsrTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ProdItmInfoTyp:カラム名クラス
	  */
	protected static class ProdItmInfoTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_prod_itm_info_typ = "prod_itm_info_typ";
		/** OUT:名称 */
		public static final String $o_prod_itm_info_typ_nm = "prod_itm_info_typ_nm";
		/** VIEW:値 */
		public static final String $v_prod_itm_info_typ = $o_prod_itm_info_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_prod_itm_info_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_prod_itm_info_typ_nm = $o_prod_itm_info_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prod_itm_info_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_prod_itm_info_typ = $o_prod_itm_info_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prod_itm_info_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prod_itm_info_typ);
					add($o_prod_itm_info_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prod_itm_info_typ, $v_prod_itm_info_typ);
					put($vn_prod_itm_info_typ_nm, $v_prod_itm_info_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prod_itm_info_typ, $s_prod_itm_info_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ProdItmInfoTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ProdItmInfoTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ProdItmInfoTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ProdItmInfoTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ProdItmInfoTypCols extends MSUAC_List.ProdItmInfoTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ChdItmInfoTyp:カラム名クラス
	  */
	protected static class ChdItmInfoTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_chd_itm_info_typ = "chd_itm_info_typ";
		/** OUT:名称 */
		public static final String $o_chd_itm_info_typ_nm = "chd_itm_info_typ_nm";
		/** VIEW:値 */
		public static final String $v_chd_itm_info_typ = $o_chd_itm_info_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_chd_itm_info_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_chd_itm_info_typ_nm = $o_chd_itm_info_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_chd_itm_info_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_chd_itm_info_typ = $o_chd_itm_info_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_chd_itm_info_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_chd_itm_info_typ);
					add($o_chd_itm_info_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_chd_itm_info_typ, $v_chd_itm_info_typ);
					put($vn_chd_itm_info_typ_nm, $v_chd_itm_info_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_chd_itm_info_typ, $s_chd_itm_info_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ChdItmInfoTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ChdItmInfoTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ChdItmInfoTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ChdItmInfoTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ChdItmInfoTypCols extends MSUAC_List.ChdItmInfoTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * NumSysTyp:カラム名クラス
	  */
	protected static class NumSysTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_num_sys_typ = "num_sys_typ";
		/** OUT:名称 */
		public static final String $o_num_sys_typ_nm = "num_sys_typ_nm";
		/** VIEW:値 */
		public static final String $v_num_sys_typ = $o_num_sys_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_num_sys_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_num_sys_typ_nm = $o_num_sys_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_num_sys_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_num_sys_typ = $o_num_sys_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_num_sys_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_num_sys_typ);
					add($o_num_sys_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_num_sys_typ, $v_num_sys_typ);
					put($vn_num_sys_typ_nm, $v_num_sys_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_num_sys_typ, $s_num_sys_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.NumSysTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.NumSysTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.NumSysTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.NumSysTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class NumSysTypCols extends MSUAC_List.NumSysTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloStsTyp:カラム名クラス
	  */
	protected static class SloStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_slo_sts_typ = "slo_sts_typ";
		/** OUT:名称 */
		public static final String $o_slo_sts_typ_nm = "slo_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_slo_sts_typ = $o_slo_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_slo_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_slo_sts_typ_nm = $o_slo_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_slo_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_slo_sts_typ = $o_slo_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_slo_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_sts_typ);
					add($o_slo_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_sts_typ, $v_slo_sts_typ);
					put($vn_slo_sts_typ_nm, $v_slo_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_sts_typ, $s_slo_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloStsTypCols extends MSUAC_List.SloStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * QtnStsTyp:カラム名クラス
	  */
	protected static class QtnStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_qtn_sts_typ = "qtn_sts_typ";
		/** OUT:名称 */
		public static final String $o_qtn_sts_typ_nm = "qtn_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_qtn_sts_typ = $o_qtn_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_qtn_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_qtn_sts_typ_nm = $o_qtn_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_qtn_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_qtn_sts_typ = $o_qtn_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_qtn_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_qtn_sts_typ);
					add($o_qtn_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_qtn_sts_typ, $v_qtn_sts_typ);
					put($vn_qtn_sts_typ_nm, $v_qtn_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_qtn_sts_typ, $s_qtn_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.QtnStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.QtnStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.QtnStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.QtnStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class QtnStsTypCols extends MSUAC_List.QtnStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ArOpeTyp:カラム名クラス
	  */
	protected static class ArOpeTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ar_ope_typ = "ar_ope_typ";
		/** OUT:名称 */
		public static final String $o_ar_ope_typ_nm = "ar_ope_typ_nm";
		/** VIEW:値 */
		public static final String $v_ar_ope_typ = $o_ar_ope_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ar_ope_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ar_ope_typ_nm = $o_ar_ope_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ar_ope_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ar_ope_typ = $o_ar_ope_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ar_ope_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ar_ope_typ);
					add($o_ar_ope_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ar_ope_typ, $v_ar_ope_typ);
					put($vn_ar_ope_typ_nm, $v_ar_ope_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ar_ope_typ, $s_ar_ope_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ArOpeTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ArOpeTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ArOpeTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ArOpeTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ArOpeTypCols extends MSUAC_List.ArOpeTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * BillClStsTyp:カラム名クラス
	  */
	protected static class BillClStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_bill_cl_sts_typ = "bill_cl_sts_typ";
		/** OUT:名称 */
		public static final String $o_bill_cl_sts_typ_nm = "bill_cl_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_bill_cl_sts_typ = $o_bill_cl_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_bill_cl_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_bill_cl_sts_typ_nm = $o_bill_cl_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_bill_cl_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_bill_cl_sts_typ = $o_bill_cl_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_bill_cl_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_cl_sts_typ);
					add($o_bill_cl_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_cl_sts_typ, $v_bill_cl_sts_typ);
					put($vn_bill_cl_sts_typ_nm, $v_bill_cl_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bill_cl_sts_typ, $s_bill_cl_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.BillClStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.BillClStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.BillClStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.BillClStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BillClStsTypCols extends MSUAC_List.BillClStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * BillTaxCalcTyp:カラム名クラス
	  */
	protected static class BillTaxCalcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_bill_tax_calc_typ = "bill_tax_calc_typ";
		/** OUT:名称 */
		public static final String $o_bill_tax_calc_typ_nm = "bill_tax_calc_typ_nm";
		/** VIEW:値 */
		public static final String $v_bill_tax_calc_typ = $o_bill_tax_calc_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_bill_tax_calc_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_bill_tax_calc_typ_nm = $o_bill_tax_calc_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_bill_tax_calc_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_bill_tax_calc_typ = $o_bill_tax_calc_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_bill_tax_calc_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_tax_calc_typ);
					add($o_bill_tax_calc_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_tax_calc_typ, $v_bill_tax_calc_typ);
					put($vn_bill_tax_calc_typ_nm, $v_bill_tax_calc_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bill_tax_calc_typ, $s_bill_tax_calc_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.BillTaxCalcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.BillTaxCalcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.BillTaxCalcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.BillTaxCalcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BillTaxCalcTypCols extends MSUAC_List.BillTaxCalcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * BillDTyp:カラム名クラス
	  */
	protected static class BillDTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_bill_d_typ = "bill_d_typ";
		/** OUT:名称 */
		public static final String $o_bill_d_typ_nm = "bill_d_typ_nm";
		/** VIEW:値 */
		public static final String $v_bill_d_typ = $o_bill_d_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_bill_d_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_bill_d_typ_nm = $o_bill_d_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_bill_d_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_bill_d_typ = $o_bill_d_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_bill_d_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_d_typ);
					add($o_bill_d_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_d_typ, $v_bill_d_typ);
					put($vn_bill_d_typ_nm, $v_bill_d_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bill_d_typ, $s_bill_d_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.BillDTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.BillDTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.BillDTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.BillDTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BillDTypCols extends MSUAC_List.BillDTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * RcvDatTyp:カラム名クラス
	  */
	protected static class RcvDatTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_rcv_dat_typ = "rcv_dat_typ";
		/** OUT:名称 */
		public static final String $o_rcv_dat_typ_nm = "rcv_dat_typ_nm";
		/** VIEW:値 */
		public static final String $v_rcv_dat_typ = $o_rcv_dat_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_rcv_dat_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_rcv_dat_typ_nm = $o_rcv_dat_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_rcv_dat_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_rcv_dat_typ = $o_rcv_dat_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_rcv_dat_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_rcv_dat_typ);
					add($o_rcv_dat_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_rcv_dat_typ, $v_rcv_dat_typ);
					put($vn_rcv_dat_typ_nm, $v_rcv_dat_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_rcv_dat_typ, $s_rcv_dat_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.RcvDatTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.RcvDatTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.RcvDatTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.RcvDatTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class RcvDatTypCols extends MSUAC_List.RcvDatTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SloTyp:カラム名クラス
	  */
	protected static class SloTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_slo_typ = "slo_typ";
		/** OUT:名称 */
		public static final String $o_slo_typ_nm = "slo_typ_nm";
		/** VIEW:値 */
		public static final String $v_slo_typ = $o_slo_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_slo_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_slo_typ_nm = $o_slo_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_slo_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_slo_typ = $o_slo_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_slo_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slo_typ);
					add($o_slo_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slo_typ, $v_slo_typ);
					put($vn_slo_typ_nm, $v_slo_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slo_typ, $s_slo_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SloTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SloTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SloTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SloTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SloTypCols extends MSUAC_List.SloTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WrkOpeTyp:カラム名クラス
	  */
	protected static class WrkOpeTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wrk_ope_typ = "wrk_ope_typ";
		/** OUT:名称 */
		public static final String $o_wrk_ope_typ_nm = "wrk_ope_typ_nm";
		/** VIEW:値 */
		public static final String $v_wrk_ope_typ = $o_wrk_ope_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wrk_ope_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wrk_ope_typ_nm = $o_wrk_ope_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wrk_ope_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wrk_ope_typ = $o_wrk_ope_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wrk_ope_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wrk_ope_typ);
					add($o_wrk_ope_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wrk_ope_typ, $v_wrk_ope_typ);
					put($vn_wrk_ope_typ_nm, $v_wrk_ope_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wrk_ope_typ, $s_wrk_ope_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WrkOpeTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WrkOpeTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WrkOpeTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WrkOpeTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WrkOpeTypCols extends MSUAC_List.WrkOpeTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ApWrkOpeTyp:カラム名クラス
	  */
	protected static class ApWrkOpeTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ap_wrk_ope_typ = "ap_wrk_ope_typ";
		/** OUT:名称 */
		public static final String $o_ap_wrk_ope_typ_nm = "ap_wrk_ope_typ_nm";
		/** VIEW:値 */
		public static final String $v_ap_wrk_ope_typ = $o_ap_wrk_ope_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ap_wrk_ope_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ap_wrk_ope_typ_nm = $o_ap_wrk_ope_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ap_wrk_ope_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ap_wrk_ope_typ = $o_ap_wrk_ope_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ap_wrk_ope_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ap_wrk_ope_typ);
					add($o_ap_wrk_ope_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ap_wrk_ope_typ, $v_ap_wrk_ope_typ);
					put($vn_ap_wrk_ope_typ_nm, $v_ap_wrk_ope_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ap_wrk_ope_typ, $s_ap_wrk_ope_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ApWrkOpeTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ApWrkOpeTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ApWrkOpeTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ApWrkOpeTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ApWrkOpeTypCols extends MSUAC_List.ApWrkOpeTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgStsTyp:カラム名クラス
	  */
	protected static class MfgStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mfg_sts_typ = "mfg_sts_typ";
		/** OUT:名称 */
		public static final String $o_mfg_sts_typ_nm = "mfg_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_mfg_sts_typ = $o_mfg_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mfg_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mfg_sts_typ_nm = $o_mfg_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mfg_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mfg_sts_typ = $o_mfg_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mfg_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_sts_typ);
					add($o_mfg_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_sts_typ, $v_mfg_sts_typ);
					put($vn_mfg_sts_typ_nm, $v_mfg_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_sts_typ, $s_mfg_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgStsTypCols extends MSUAC_List.MfgStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgMtdTyp:カラム名クラス
	  */
	protected static class MfgMtdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mfg_mtd_typ = "mfg_mtd_typ";
		/** OUT:名称 */
		public static final String $o_mfg_mtd_typ_nm = "mfg_mtd_typ_nm";
		/** VIEW:値 */
		public static final String $v_mfg_mtd_typ = $o_mfg_mtd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mfg_mtd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mfg_mtd_typ_nm = $o_mfg_mtd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mfg_mtd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mfg_mtd_typ = $o_mfg_mtd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mfg_mtd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_mtd_typ);
					add($o_mfg_mtd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_mtd_typ, $v_mfg_mtd_typ);
					put($vn_mfg_mtd_typ_nm, $v_mfg_mtd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_mtd_typ, $s_mfg_mtd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgMtdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgMtdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgMtdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgMtdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgMtdTypCols extends MSUAC_List.MfgMtdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MiPrntStr:カラム名クラス
	  */
	protected static class MiPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mi_prnt_str = "mi_prnt_str";
		/** OUT:名称 */
		public static final String $o_mi_prnt_str_nm = "mi_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_mi_prnt_str = $o_mi_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mi_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mi_prnt_str_nm = $o_mi_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mi_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mi_prnt_str = $o_mi_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mi_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mi_prnt_str);
					add($o_mi_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mi_prnt_str, $v_mi_prnt_str);
					put($vn_mi_prnt_str_nm, $v_mi_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mi_prnt_str, $s_mi_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MiPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MiPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MiPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MiPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MiPrntStrCols extends MSUAC_List.MiPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrPrntStr:カラム名クラス
	  */
	protected static class MrPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mr_prnt_str = "mr_prnt_str";
		/** OUT:名称 */
		public static final String $o_mr_prnt_str_nm = "mr_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_mr_prnt_str = $o_mr_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mr_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mr_prnt_str_nm = $o_mr_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mr_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mr_prnt_str = $o_mr_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mr_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mr_prnt_str);
					add($o_mr_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mr_prnt_str, $v_mr_prnt_str);
					put($vn_mr_prnt_str_nm, $v_mr_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mr_prnt_str, $s_mr_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrPrntStrCols extends MSUAC_List.MrPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * VerChgStsTyp:カラム名クラス
	  */
	protected static class VerChgStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ver_chg_sts_typ = "ver_chg_sts_typ";
		/** OUT:名称 */
		public static final String $o_ver_chg_sts_typ_nm = "ver_chg_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_ver_chg_sts_typ = $o_ver_chg_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ver_chg_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ver_chg_sts_typ_nm = $o_ver_chg_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ver_chg_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ver_chg_sts_typ = $o_ver_chg_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ver_chg_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ver_chg_sts_typ);
					add($o_ver_chg_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ver_chg_sts_typ, $v_ver_chg_sts_typ);
					put($vn_ver_chg_sts_typ_nm, $v_ver_chg_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ver_chg_sts_typ, $s_ver_chg_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.VerChgStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.VerChgStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.VerChgStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.VerChgStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class VerChgStsTypCols extends MSUAC_List.VerChgStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ReExtTyp:カラム名クラス
	  */
	protected static class ReExtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_re_ext_typ = "re_ext_typ";
		/** OUT:名称 */
		public static final String $o_re_ext_typ_nm = "re_ext_typ_nm";
		/** VIEW:値 */
		public static final String $v_re_ext_typ = $o_re_ext_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_re_ext_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_re_ext_typ_nm = $o_re_ext_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_re_ext_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_re_ext_typ = $o_re_ext_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_re_ext_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_re_ext_typ);
					add($o_re_ext_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_re_ext_typ, $v_re_ext_typ);
					put($vn_re_ext_typ_nm, $v_re_ext_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_re_ext_typ, $s_re_ext_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ReExtTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ReExtTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ReExtTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ReExtTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ReExtTypCols extends MSUAC_List.ReExtTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlipSplitTyp:カラム名クラス
	  */
	protected static class SlipSplitTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_slip_split_typ = "slip_split_typ";
		/** OUT:名称 */
		public static final String $o_slip_split_typ_nm = "slip_split_typ_nm";
		/** VIEW:値 */
		public static final String $v_slip_split_typ = $o_slip_split_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_slip_split_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_slip_split_typ_nm = $o_slip_split_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_slip_split_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_slip_split_typ = $o_slip_split_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_slip_split_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_slip_split_typ);
					add($o_slip_split_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_slip_split_typ, $v_slip_split_typ);
					put($vn_slip_split_typ_nm, $v_slip_split_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_slip_split_typ, $s_slip_split_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlipSplitTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlipSplitTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlipSplitTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlipSplitTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlipSplitTypCols extends MSUAC_List.SlipSplitTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgAprvStsTyp:カラム名クラス
	  */
	protected static class MfgAprvStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
		/** OUT:名称 */
		public static final String $o_mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_mfg_aprv_sts_typ = $o_mfg_aprv_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mfg_aprv_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mfg_aprv_sts_typ_nm = $o_mfg_aprv_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mfg_aprv_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mfg_aprv_sts_typ = $o_mfg_aprv_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mfg_aprv_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_aprv_sts_typ);
					add($o_mfg_aprv_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_aprv_sts_typ, $v_mfg_aprv_sts_typ);
					put($vn_mfg_aprv_sts_typ_nm, $v_mfg_aprv_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_aprv_sts_typ, $s_mfg_aprv_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgAprvStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgAprvStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgAprvStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgAprvStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgAprvStsTypCols extends MSUAC_List.MfgAprvStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WgRqstTyp:カラム名クラス
	  */
	protected static class WgRqstTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wg_rqst_typ = "wg_rqst_typ";
		/** OUT:名称 */
		public static final String $o_wg_rqst_typ_nm = "wg_rqst_typ_nm";
		/** VIEW:値 */
		public static final String $v_wg_rqst_typ = $o_wg_rqst_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wg_rqst_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wg_rqst_typ_nm = $o_wg_rqst_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wg_rqst_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wg_rqst_typ = $o_wg_rqst_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wg_rqst_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wg_rqst_typ);
					add($o_wg_rqst_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wg_rqst_typ, $v_wg_rqst_typ);
					put($vn_wg_rqst_typ_nm, $v_wg_rqst_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wg_rqst_typ, $s_wg_rqst_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WgRqstTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WgRqstTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WgRqstTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WgRqstTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WgRqstTypCols extends MSUAC_List.WgRqstTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WgRqstStsTyp:カラム名クラス
	  */
	protected static class WgRqstStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wg_rqst_sts_typ = "wg_rqst_sts_typ";
		/** OUT:名称 */
		public static final String $o_wg_rqst_sts_typ_nm = "wg_rqst_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_wg_rqst_sts_typ = $o_wg_rqst_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wg_rqst_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wg_rqst_sts_typ_nm = $o_wg_rqst_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wg_rqst_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wg_rqst_sts_typ = $o_wg_rqst_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wg_rqst_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wg_rqst_sts_typ);
					add($o_wg_rqst_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wg_rqst_sts_typ, $v_wg_rqst_sts_typ);
					put($vn_wg_rqst_sts_typ_nm, $v_wg_rqst_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wg_rqst_sts_typ, $s_wg_rqst_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WgRqstStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WgRqstStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WgRqstStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WgRqstStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WgRqstStsTypCols extends MSUAC_List.WgRqstStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WgRqstSrcTyp:カラム名クラス
	  */
	protected static class WgRqstSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wg_rqst_src_typ = "wg_rqst_src_typ";
		/** OUT:名称 */
		public static final String $o_wg_rqst_src_typ_nm = "wg_rqst_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_wg_rqst_src_typ = $o_wg_rqst_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wg_rqst_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wg_rqst_src_typ_nm = $o_wg_rqst_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wg_rqst_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wg_rqst_src_typ = $o_wg_rqst_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wg_rqst_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wg_rqst_src_typ);
					add($o_wg_rqst_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wg_rqst_src_typ, $v_wg_rqst_src_typ);
					put($vn_wg_rqst_src_typ_nm, $v_wg_rqst_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wg_rqst_src_typ, $s_wg_rqst_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WgRqstSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WgRqstSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WgRqstSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WgRqstSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WgRqstSrcTypCols extends MSUAC_List.WgRqstSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * WgRqstNtcDayTyp:カラム名クラス
	  */
	protected static class WgRqstNtcDayTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_wg_rqst_ntc_day_typ = "wg_rqst_ntc_day_typ";
		/** OUT:名称 */
		public static final String $o_wg_rqst_ntc_day_typ_nm = "wg_rqst_ntc_day_typ_nm";
		/** VIEW:値 */
		public static final String $v_wg_rqst_ntc_day_typ = $o_wg_rqst_ntc_day_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_wg_rqst_ntc_day_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_wg_rqst_ntc_day_typ_nm = $o_wg_rqst_ntc_day_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_wg_rqst_ntc_day_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_wg_rqst_ntc_day_typ = $o_wg_rqst_ntc_day_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_wg_rqst_ntc_day_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_wg_rqst_ntc_day_typ);
					add($o_wg_rqst_ntc_day_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_wg_rqst_ntc_day_typ, $v_wg_rqst_ntc_day_typ);
					put($vn_wg_rqst_ntc_day_typ_nm, $v_wg_rqst_ntc_day_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_wg_rqst_ntc_day_typ, $s_wg_rqst_ntc_day_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.WgRqstNtcDayTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.WgRqstNtcDayTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.WgRqstNtcDayTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.WgRqstNtcDayTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class WgRqstNtcDayTypCols extends MSUAC_List.WgRqstNtcDayTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ProvSrcSchdTyp:カラム名クラス
	  */
	protected static class ProvSrcSchdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_prov_src_schd_typ = "prov_src_schd_typ";
		/** OUT:名称 */
		public static final String $o_prov_src_schd_typ_nm = "prov_src_schd_typ_nm";
		/** VIEW:値 */
		public static final String $v_prov_src_schd_typ = $o_prov_src_schd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_prov_src_schd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_prov_src_schd_typ_nm = $o_prov_src_schd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prov_src_schd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_prov_src_schd_typ = $o_prov_src_schd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prov_src_schd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prov_src_schd_typ);
					add($o_prov_src_schd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prov_src_schd_typ, $v_prov_src_schd_typ);
					put($vn_prov_src_schd_typ_nm, $v_prov_src_schd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prov_src_schd_typ, $s_prov_src_schd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ProvSrcSchdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ProvSrcSchdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ProvSrcSchdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ProvSrcSchdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ProvSrcSchdTypCols extends MSUAC_List.ProvSrcSchdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ProvSrcActTyp:カラム名クラス
	  */
	protected static class ProvSrcActTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_prov_src_act_typ = "prov_src_act_typ";
		/** OUT:名称 */
		public static final String $o_prov_src_act_typ_nm = "prov_src_act_typ_nm";
		/** VIEW:値 */
		public static final String $v_prov_src_act_typ = $o_prov_src_act_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_prov_src_act_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_prov_src_act_typ_nm = $o_prov_src_act_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prov_src_act_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_prov_src_act_typ = $o_prov_src_act_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prov_src_act_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prov_src_act_typ);
					add($o_prov_src_act_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prov_src_act_typ, $v_prov_src_act_typ);
					put($vn_prov_src_act_typ_nm, $v_prov_src_act_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prov_src_act_typ, $s_prov_src_act_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ProvSrcActTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ProvSrcActTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ProvSrcActTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ProvSrcActTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ProvSrcActTypCols extends MSUAC_List.ProvSrcActTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * XfrSrcTyp:カラム名クラス
	  */
	protected static class XfrSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_xfr_src_typ = "xfr_src_typ";
		/** OUT:名称 */
		public static final String $o_xfr_src_typ_nm = "xfr_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_xfr_src_typ = $o_xfr_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_xfr_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_xfr_src_typ_nm = $o_xfr_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_xfr_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_xfr_src_typ = $o_xfr_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_xfr_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_xfr_src_typ);
					add($o_xfr_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_xfr_src_typ, $v_xfr_src_typ);
					put($vn_xfr_src_typ_nm, $v_xfr_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_xfr_src_typ, $s_xfr_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.XfrSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.XfrSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.XfrSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.XfrSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class XfrSrcTypCols extends MSUAC_List.XfrSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StktkTyp:カラム名クラス
	  */
	protected static class StktkTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_stktk_typ = "stktk_typ";
		/** OUT:名称 */
		public static final String $o_stktk_typ_nm = "stktk_typ_nm";
		/** VIEW:値 */
		public static final String $v_stktk_typ = $o_stktk_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_stktk_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_stktk_typ_nm = $o_stktk_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stktk_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_stktk_typ = $o_stktk_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stktk_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stktk_typ);
					add($o_stktk_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stktk_typ, $v_stktk_typ);
					put($vn_stktk_typ_nm, $v_stktk_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stktk_typ, $s_stktk_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StktkTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StktkTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StktkTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StktkTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StktkTypCols extends MSUAC_List.StktkTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SplnDtlTyp:カラム名クラス
	  */
	protected static class SplnDtlTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_spln_dtl_typ = "spln_dtl_typ";
		/** OUT:名称 */
		public static final String $o_spln_dtl_typ_nm = "spln_dtl_typ_nm";
		/** VIEW:値 */
		public static final String $v_spln_dtl_typ = $o_spln_dtl_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_spln_dtl_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_spln_dtl_typ_nm = $o_spln_dtl_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_spln_dtl_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_spln_dtl_typ = $o_spln_dtl_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_spln_dtl_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_spln_dtl_typ);
					add($o_spln_dtl_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_spln_dtl_typ, $v_spln_dtl_typ);
					put($vn_spln_dtl_typ_nm, $v_spln_dtl_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_spln_dtl_typ, $s_spln_dtl_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SplnDtlTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SplnDtlTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SplnDtlTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SplnDtlTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SplnDtlTypCols extends MSUAC_List.SplnDtlTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PfDtlTyp:カラム名クラス
	  */
	protected static class PfDtlTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pf_dtl_typ = "pf_dtl_typ";
		/** OUT:名称 */
		public static final String $o_pf_dtl_typ_nm = "pf_dtl_typ_nm";
		/** VIEW:値 */
		public static final String $v_pf_dtl_typ = $o_pf_dtl_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pf_dtl_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pf_dtl_typ_nm = $o_pf_dtl_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pf_dtl_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pf_dtl_typ = $o_pf_dtl_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pf_dtl_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pf_dtl_typ);
					add($o_pf_dtl_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pf_dtl_typ, $v_pf_dtl_typ);
					put($vn_pf_dtl_typ_nm, $v_pf_dtl_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pf_dtl_typ, $s_pf_dtl_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PfDtlTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PfDtlTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PfDtlTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PfDtlTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PfDtlTypCols extends MSUAC_List.PfDtlTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InspPrntStr:カラム名クラス
	  */
	protected static class InspPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_insp_prnt_str = "insp_prnt_str";
		/** OUT:名称 */
		public static final String $o_insp_prnt_str_nm = "insp_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_insp_prnt_str = $o_insp_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_insp_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_insp_prnt_str_nm = $o_insp_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_insp_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_insp_prnt_str = $o_insp_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_insp_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_insp_prnt_str);
					add($o_insp_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_insp_prnt_str, $v_insp_prnt_str);
					put($vn_insp_prnt_str_nm, $v_insp_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_insp_prnt_str, $s_insp_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InspPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InspPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InspPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InspPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InspPrntStrCols extends MSUAC_List.InspPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * InspTyp:カラム名クラス
	  */
	protected static class InspTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_insp_typ = "insp_typ";
		/** OUT:名称 */
		public static final String $o_insp_typ_nm = "insp_typ_nm";
		/** VIEW:値 */
		public static final String $v_insp_typ = $o_insp_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_insp_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_insp_typ_nm = $o_insp_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_insp_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_insp_typ = $o_insp_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_insp_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_insp_typ);
					add($o_insp_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_insp_typ, $v_insp_typ);
					put($vn_insp_typ_nm, $v_insp_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_insp_typ, $s_insp_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InspTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InspTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InspTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InspTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InspTypCols extends MSUAC_List.InspTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InspStsTyp:カラム名クラス
	  */
	protected static class InspStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_insp_sts_typ = "insp_sts_typ";
		/** OUT:名称 */
		public static final String $o_insp_sts_typ_nm = "insp_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_insp_sts_typ = $o_insp_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_insp_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_insp_sts_typ_nm = $o_insp_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_insp_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_insp_sts_typ = $o_insp_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_insp_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_insp_sts_typ);
					add($o_insp_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_insp_sts_typ, $v_insp_sts_typ);
					put($vn_insp_sts_typ_nm, $v_insp_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_insp_sts_typ, $s_insp_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InspStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InspStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InspStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InspStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InspStsTypCols extends MSUAC_List.InspStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InspAprvStsTyp:カラム名クラス
	  */
	protected static class InspAprvStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_insp_aprv_sts_typ = "insp_aprv_sts_typ";
		/** OUT:名称 */
		public static final String $o_insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_insp_aprv_sts_typ = $o_insp_aprv_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_insp_aprv_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_insp_aprv_sts_typ_nm = $o_insp_aprv_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_insp_aprv_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_insp_aprv_sts_typ = $o_insp_aprv_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_insp_aprv_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_insp_aprv_sts_typ);
					add($o_insp_aprv_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_insp_aprv_sts_typ, $v_insp_aprv_sts_typ);
					put($vn_insp_aprv_sts_typ_nm, $v_insp_aprv_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_insp_aprv_sts_typ, $s_insp_aprv_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InspAprvStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InspAprvStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InspAprvStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InspAprvStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InspAprvStsTypCols extends MSUAC_List.InspAprvStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StdInspRsltTyp:カラム名クラス
	  */
	protected static class StdInspRsltTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_std_insp_rslt_typ = "std_insp_rslt_typ";
		/** OUT:名称 */
		public static final String $o_std_insp_rslt_typ_nm = "std_insp_rslt_typ_nm";
		/** VIEW:値 */
		public static final String $v_std_insp_rslt_typ = $o_std_insp_rslt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_std_insp_rslt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_std_insp_rslt_typ_nm = $o_std_insp_rslt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_std_insp_rslt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_std_insp_rslt_typ = $o_std_insp_rslt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_std_insp_rslt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_std_insp_rslt_typ);
					add($o_std_insp_rslt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_std_insp_rslt_typ, $v_std_insp_rslt_typ);
					put($vn_std_insp_rslt_typ_nm, $v_std_insp_rslt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_std_insp_rslt_typ, $s_std_insp_rslt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StdInspRsltTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StdInspRsltTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StdInspRsltTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StdInspRsltTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StdInspRsltTypCols extends MSUAC_List.StdInspRsltTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InspJudgRsltTyp:カラム名クラス
	  */
	protected static class InspJudgRsltTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_insp_judg_rslt_typ = "insp_judg_rslt_typ";
		/** OUT:名称 */
		public static final String $o_insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
		/** VIEW:値 */
		public static final String $v_insp_judg_rslt_typ = $o_insp_judg_rslt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_insp_judg_rslt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_insp_judg_rslt_typ_nm = $o_insp_judg_rslt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_insp_judg_rslt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_insp_judg_rslt_typ = $o_insp_judg_rslt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_insp_judg_rslt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_insp_judg_rslt_typ);
					add($o_insp_judg_rslt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_insp_judg_rslt_typ, $v_insp_judg_rslt_typ);
					put($vn_insp_judg_rslt_typ_nm, $v_insp_judg_rslt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_insp_judg_rslt_typ, $s_insp_judg_rslt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InspJudgRsltTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InspJudgRsltTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InspJudgRsltTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InspJudgRsltTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InspJudgRsltTypCols extends MSUAC_List.InspJudgRsltTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PlntAprvStsTyp:カラム名クラス
	  */
	protected static class PlntAprvStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
		/** OUT:名称 */
		public static final String $o_plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_plnt_aprv_sts_typ = $o_plnt_aprv_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_plnt_aprv_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_plnt_aprv_sts_typ_nm = $o_plnt_aprv_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_plnt_aprv_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_plnt_aprv_sts_typ = $o_plnt_aprv_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_plnt_aprv_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_plnt_aprv_sts_typ);
					add($o_plnt_aprv_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_plnt_aprv_sts_typ, $v_plnt_aprv_sts_typ);
					put($vn_plnt_aprv_sts_typ_nm, $v_plnt_aprv_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_plnt_aprv_sts_typ, $s_plnt_aprv_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PlntAprvStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PlntAprvStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PlntAprvStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PlntAprvStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PlntAprvStsTypCols extends MSUAC_List.PlntAprvStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrktJudgStsTyp:カラム名クラス
	  */
	protected static class MrktJudgStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
		/** OUT:名称 */
		public static final String $o_mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrkt_judg_sts_typ = $o_mrkt_judg_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrkt_judg_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrkt_judg_sts_typ_nm = $o_mrkt_judg_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrkt_judg_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrkt_judg_sts_typ = $o_mrkt_judg_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrkt_judg_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrkt_judg_sts_typ);
					add($o_mrkt_judg_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrkt_judg_sts_typ, $v_mrkt_judg_sts_typ);
					put($vn_mrkt_judg_sts_typ_nm, $v_mrkt_judg_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrkt_judg_sts_typ, $s_mrkt_judg_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrktJudgStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrktJudgStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrktJudgStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrktJudgStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrktJudgStsTypCols extends MSUAC_List.MrktJudgStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * MrktJudgSrcTyp:カラム名クラス
	  */
	protected static class MrktJudgSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_mrkt_judg_src_typ = "mrkt_judg_src_typ";
		/** OUT:名称 */
		public static final String $o_mrkt_judg_src_typ_nm = "mrkt_judg_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_mrkt_judg_src_typ = $o_mrkt_judg_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_mrkt_judg_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_mrkt_judg_src_typ_nm = $o_mrkt_judg_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_mrkt_judg_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_mrkt_judg_src_typ = $o_mrkt_judg_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_mrkt_judg_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mrkt_judg_src_typ);
					add($o_mrkt_judg_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mrkt_judg_src_typ, $v_mrkt_judg_src_typ);
					put($vn_mrkt_judg_src_typ_nm, $v_mrkt_judg_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mrkt_judg_src_typ, $s_mrkt_judg_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MrktJudgSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MrktJudgSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MrktJudgSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MrktJudgSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MrktJudgSrcTypCols extends MSUAC_List.MrktJudgSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SchdActTyp:カラム名クラス
	  */
	protected static class SchdActTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_schd_act_typ = "schd_act_typ";
		/** OUT:名称 */
		public static final String $o_schd_act_typ_nm = "schd_act_typ_nm";
		/** VIEW:値 */
		public static final String $v_schd_act_typ = $o_schd_act_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_schd_act_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_schd_act_typ_nm = $o_schd_act_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_schd_act_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_schd_act_typ = $o_schd_act_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_schd_act_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_schd_act_typ);
					add($o_schd_act_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_schd_act_typ, $v_schd_act_typ);
					put($vn_schd_act_typ_nm, $v_schd_act_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_schd_act_typ, $s_schd_act_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SchdActTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SchdActTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SchdActTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SchdActTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SchdActTypCols extends MSUAC_List.SchdActTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CompItmInspTyp:カラム名クラス
	  */
	protected static class CompItmInspTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_comp_itm_insp_typ = "comp_itm_insp_typ";
		/** OUT:名称 */
		public static final String $o_comp_itm_insp_typ_nm = "comp_itm_insp_typ_nm";
		/** VIEW:値 */
		public static final String $v_comp_itm_insp_typ = $o_comp_itm_insp_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_comp_itm_insp_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_comp_itm_insp_typ_nm = $o_comp_itm_insp_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_comp_itm_insp_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_comp_itm_insp_typ = $o_comp_itm_insp_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_comp_itm_insp_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_comp_itm_insp_typ);
					add($o_comp_itm_insp_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_comp_itm_insp_typ, $v_comp_itm_insp_typ);
					put($vn_comp_itm_insp_typ_nm, $v_comp_itm_insp_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_comp_itm_insp_typ, $s_comp_itm_insp_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CompItmInspTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CompItmInspTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CompItmInspTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CompItmInspTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CompItmInspTypCols extends MSUAC_List.CompItmInspTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CompItmQualityTyp:カラム名クラス
	  */
	protected static class CompItmQualityTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_comp_itm_quality_typ = "comp_itm_quality_typ";
		/** OUT:名称 */
		public static final String $o_comp_itm_quality_typ_nm = "comp_itm_quality_typ_nm";
		/** VIEW:値 */
		public static final String $v_comp_itm_quality_typ = $o_comp_itm_quality_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_comp_itm_quality_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_comp_itm_quality_typ_nm = $o_comp_itm_quality_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_comp_itm_quality_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_comp_itm_quality_typ = $o_comp_itm_quality_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_comp_itm_quality_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_comp_itm_quality_typ);
					add($o_comp_itm_quality_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_comp_itm_quality_typ, $v_comp_itm_quality_typ);
					put($vn_comp_itm_quality_typ_nm, $v_comp_itm_quality_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_comp_itm_quality_typ, $s_comp_itm_quality_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CompItmQualityTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CompItmQualityTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CompItmQualityTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CompItmQualityTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CompItmQualityTypCols extends MSUAC_List.CompItmQualityTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CompItmMfgAprvTyp:カラム名クラス
	  */
	protected static class CompItmMfgAprvTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_comp_itm_mfg_aprv_typ = "comp_itm_mfg_aprv_typ";
		/** OUT:名称 */
		public static final String $o_comp_itm_mfg_aprv_typ_nm = "comp_itm_mfg_aprv_typ_nm";
		/** VIEW:値 */
		public static final String $v_comp_itm_mfg_aprv_typ = $o_comp_itm_mfg_aprv_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_comp_itm_mfg_aprv_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_comp_itm_mfg_aprv_typ_nm = $o_comp_itm_mfg_aprv_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_comp_itm_mfg_aprv_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_comp_itm_mfg_aprv_typ = $o_comp_itm_mfg_aprv_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_comp_itm_mfg_aprv_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_comp_itm_mfg_aprv_typ);
					add($o_comp_itm_mfg_aprv_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_comp_itm_mfg_aprv_typ, $v_comp_itm_mfg_aprv_typ);
					put($vn_comp_itm_mfg_aprv_typ_nm, $v_comp_itm_mfg_aprv_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_comp_itm_mfg_aprv_typ, $s_comp_itm_mfg_aprv_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CompItmMfgAprvTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CompItmMfgAprvTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CompItmMfgAprvTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CompItmMfgAprvTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CompItmMfgAprvTypCols extends MSUAC_List.CompItmMfgAprvTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcPrntTyp:カラム名クラス
	  */
	protected static class PurcPrntTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_prnt_typ = "purc_prnt_typ";
		/** OUT:名称 */
		public static final String $o_purc_prnt_typ_nm = "purc_prnt_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_prnt_typ = $o_purc_prnt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_prnt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_prnt_typ_nm = $o_purc_prnt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_prnt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_prnt_typ = $o_purc_prnt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_prnt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_prnt_typ);
					add($o_purc_prnt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_prnt_typ, $v_purc_prnt_typ);
					put($vn_purc_prnt_typ_nm, $v_purc_prnt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_prnt_typ, $s_purc_prnt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcPrntTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcPrntTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcPrntTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcPrntTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcPrntTypCols extends MSUAC_List.PurcPrntTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * BillMtdTyp:カラム名クラス
	  */
	protected static class BillMtdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_bill_mtd_typ = "bill_mtd_typ";
		/** OUT:名称 */
		public static final String $o_bill_mtd_typ_nm = "bill_mtd_typ_nm";
		/** VIEW:値 */
		public static final String $v_bill_mtd_typ = $o_bill_mtd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_bill_mtd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_bill_mtd_typ_nm = $o_bill_mtd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_bill_mtd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_bill_mtd_typ = $o_bill_mtd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_bill_mtd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_mtd_typ);
					add($o_bill_mtd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_mtd_typ, $v_bill_mtd_typ);
					put($vn_bill_mtd_typ_nm, $v_bill_mtd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bill_mtd_typ, $s_bill_mtd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.BillMtdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.BillMtdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.BillMtdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.BillMtdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BillMtdTypCols extends MSUAC_List.BillMtdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ArSlipPrntTyp:カラム名クラス
	  */
	protected static class ArSlipPrntTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ar_slip_prnt_typ = "ar_slip_prnt_typ";
		/** OUT:名称 */
		public static final String $o_ar_slip_prnt_typ_nm = "ar_slip_prnt_typ_nm";
		/** VIEW:値 */
		public static final String $v_ar_slip_prnt_typ = $o_ar_slip_prnt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ar_slip_prnt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ar_slip_prnt_typ_nm = $o_ar_slip_prnt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ar_slip_prnt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ar_slip_prnt_typ = $o_ar_slip_prnt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ar_slip_prnt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ar_slip_prnt_typ);
					add($o_ar_slip_prnt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ar_slip_prnt_typ, $v_ar_slip_prnt_typ);
					put($vn_ar_slip_prnt_typ_nm, $v_ar_slip_prnt_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ar_slip_prnt_typ, $s_ar_slip_prnt_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ArSlipPrntTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ArSlipPrntTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ArSlipPrntTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ArSlipPrntTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ArSlipPrntTypCols extends MSUAC_List.ArSlipPrntTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CredUpdTyp:カラム名クラス
	  */
	protected static class CredUpdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_cred_upd_typ = "cred_upd_typ";
		/** OUT:名称 */
		public static final String $o_cred_upd_typ_nm = "cred_upd_typ_nm";
		/** VIEW:値 */
		public static final String $v_cred_upd_typ = $o_cred_upd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_cred_upd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_cred_upd_typ_nm = $o_cred_upd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_cred_upd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_cred_upd_typ = $o_cred_upd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_cred_upd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cred_upd_typ);
					add($o_cred_upd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cred_upd_typ, $v_cred_upd_typ);
					put($vn_cred_upd_typ_nm, $v_cred_upd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cred_upd_typ, $s_cred_upd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CredUpdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CredUpdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CredUpdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CredUpdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CredUpdTypCols extends MSUAC_List.CredUpdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * InstTyp:カラム名クラス
	  */
	protected static class InstTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_inst_typ = "inst_typ";
		/** OUT:名称 */
		public static final String $o_inst_typ_nm = "inst_typ_nm";
		/** VIEW:値 */
		public static final String $v_inst_typ = $o_inst_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_inst_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_inst_typ_nm = $o_inst_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_inst_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_inst_typ = $o_inst_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_inst_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_inst_typ);
					add($o_inst_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_inst_typ, $v_inst_typ);
					put($vn_inst_typ_nm, $v_inst_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_inst_typ, $s_inst_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InstTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InstTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InstTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InstTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InstTypCols extends MSUAC_List.InstTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AutoApplStsTyp:カラム名クラス
	  */
	protected static class AutoApplStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_auto_appl_sts_typ = "auto_appl_sts_typ";
		/** OUT:名称 */
		public static final String $o_auto_appl_sts_typ_nm = "auto_appl_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_auto_appl_sts_typ = $o_auto_appl_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_auto_appl_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_auto_appl_sts_typ_nm = $o_auto_appl_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_auto_appl_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_auto_appl_sts_typ = $o_auto_appl_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_auto_appl_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_auto_appl_sts_typ);
					add($o_auto_appl_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_auto_appl_sts_typ, $v_auto_appl_sts_typ);
					put($vn_auto_appl_sts_typ_nm, $v_auto_appl_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_auto_appl_sts_typ, $s_auto_appl_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AutoApplStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AutoApplStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AutoApplStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AutoApplStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AutoApplStsTypCols extends MSUAC_List.AutoApplStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * StktkStsTyp:カラム名クラス
	  */
	protected static class StktkStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_stktk_sts_typ = "stktk_sts_typ";
		/** OUT:名称 */
		public static final String $o_stktk_sts_typ_nm = "stktk_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_stktk_sts_typ = $o_stktk_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_stktk_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_stktk_sts_typ_nm = $o_stktk_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stktk_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_stktk_sts_typ = $o_stktk_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stktk_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stktk_sts_typ);
					add($o_stktk_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stktk_sts_typ, $v_stktk_sts_typ);
					put($vn_stktk_sts_typ_nm, $v_stktk_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stktk_sts_typ, $s_stktk_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StktkStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StktkStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StktkStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StktkStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StktkStsTypCols extends MSUAC_List.StktkStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ArrPtnTyp:カラム名クラス
	  */
	protected static class ArrPtnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_arr_ptn_typ = "arr_ptn_typ";
		/** OUT:名称 */
		public static final String $o_arr_ptn_typ_nm = "arr_ptn_typ_nm";
		/** VIEW:値 */
		public static final String $v_arr_ptn_typ = $o_arr_ptn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_arr_ptn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_arr_ptn_typ_nm = $o_arr_ptn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_arr_ptn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_arr_ptn_typ = $o_arr_ptn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_arr_ptn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_arr_ptn_typ);
					add($o_arr_ptn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_arr_ptn_typ, $v_arr_ptn_typ);
					put($vn_arr_ptn_typ_nm, $v_arr_ptn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_arr_ptn_typ, $s_arr_ptn_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ArrPtnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ArrPtnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ArrPtnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ArrPtnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ArrPtnTypCols extends MSUAC_List.ArrPtnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsAdjstTyp:カラム名クラス
	  */
	protected static class SlsAdjstTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sls_adjst_typ = "sls_adjst_typ";
		/** OUT:名称 */
		public static final String $o_sls_adjst_typ_nm = "sls_adjst_typ_nm";
		/** VIEW:値 */
		public static final String $v_sls_adjst_typ = $o_sls_adjst_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sls_adjst_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sls_adjst_typ_nm = $o_sls_adjst_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_adjst_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sls_adjst_typ = $o_sls_adjst_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_adjst_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_adjst_typ);
					add($o_sls_adjst_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_adjst_typ, $v_sls_adjst_typ);
					put($vn_sls_adjst_typ_nm, $v_sls_adjst_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_adjst_typ, $s_sls_adjst_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsAdjstTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsAdjstTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsAdjstTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsAdjstTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsAdjstTypCols extends MSUAC_List.SlsAdjstTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * AdjstMtdTyp:カラム名クラス
	  */
	protected static class AdjstMtdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_adjst_mtd_typ = "adjst_mtd_typ";
		/** OUT:名称 */
		public static final String $o_adjst_mtd_typ_nm = "adjst_mtd_typ_nm";
		/** VIEW:値 */
		public static final String $v_adjst_mtd_typ = $o_adjst_mtd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_adjst_mtd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_adjst_mtd_typ_nm = $o_adjst_mtd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_adjst_mtd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_adjst_mtd_typ = $o_adjst_mtd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_adjst_mtd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_adjst_mtd_typ);
					add($o_adjst_mtd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_adjst_mtd_typ, $v_adjst_mtd_typ);
					put($vn_adjst_mtd_typ_nm, $v_adjst_mtd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_adjst_mtd_typ, $s_adjst_mtd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AdjstMtdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AdjstMtdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AdjstMtdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AdjstMtdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AdjstMtdTypCols extends MSUAC_List.AdjstMtdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CstSlctTyp:カラム名クラス
	  */
	protected static class CstSlctTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_cst_slct_typ = "cst_slct_typ";
		/** OUT:名称 */
		public static final String $o_cst_slct_typ_nm = "cst_slct_typ_nm";
		/** VIEW:値 */
		public static final String $v_cst_slct_typ = $o_cst_slct_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_cst_slct_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_cst_slct_typ_nm = $o_cst_slct_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_cst_slct_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_cst_slct_typ = $o_cst_slct_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_cst_slct_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_cst_slct_typ);
					add($o_cst_slct_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_cst_slct_typ, $v_cst_slct_typ);
					put($vn_cst_slct_typ_nm, $v_cst_slct_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_cst_slct_typ, $s_cst_slct_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CstSlctTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CstSlctTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CstSlctTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CstSlctTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CstSlctTypCols extends MSUAC_List.CstSlctTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * EiajDlvSlipStr:カラム名クラス
	  */
	protected static class EiajDlvSlipStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_eiaj_dlv_slip_str = "eiaj_dlv_slip_str";
		/** OUT:名称 */
		public static final String $o_eiaj_dlv_slip_str_nm = "eiaj_dlv_slip_str_nm";
		/** VIEW:値 */
		public static final String $v_eiaj_dlv_slip_str = $o_eiaj_dlv_slip_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_eiaj_dlv_slip_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_eiaj_dlv_slip_str_nm = $o_eiaj_dlv_slip_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_eiaj_dlv_slip_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_eiaj_dlv_slip_str = $o_eiaj_dlv_slip_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_eiaj_dlv_slip_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_eiaj_dlv_slip_str);
					add($o_eiaj_dlv_slip_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_eiaj_dlv_slip_str, $v_eiaj_dlv_slip_str);
					put($vn_eiaj_dlv_slip_str_nm, $v_eiaj_dlv_slip_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_eiaj_dlv_slip_str, $s_eiaj_dlv_slip_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.EiajDlvSlipStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.EiajDlvSlipStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.EiajDlvSlipStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.EiajDlvSlipStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class EiajDlvSlipStrCols extends MSUAC_List.EiajDlvSlipStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PoStr:カラム名クラス
	  */
	protected static class PoStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_po_star = "po_star";
		/** OUT:名称 */
		public static final String $o_po_star_nm = "po_star_nm";
		/** VIEW:値 */
		public static final String $v_po_star = $o_po_star;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_po_star = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_po_star_nm = $o_po_star_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_po_star_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_po_star = $o_po_star;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_po_star = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_po_star);
					add($o_po_star_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_po_star, $v_po_star);
					put($vn_po_star_nm, $v_po_star_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_po_star, $s_po_star, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PoStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PoStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PoStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PoStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PoStrCols extends MSUAC_List.PoStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcAdjstTyp:カラム名クラス
	  */
	protected static class PurcAdjstTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_adjst_typ = "purc_adjst_typ";
		/** OUT:名称 */
		public static final String $o_purc_adjst_typ_nm = "purc_adjst_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_adjst_typ = $o_purc_adjst_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_adjst_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_adjst_typ_nm = $o_purc_adjst_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_adjst_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_adjst_typ = $o_purc_adjst_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_adjst_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_adjst_typ);
					add($o_purc_adjst_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_adjst_typ, $v_purc_adjst_typ);
					put($vn_purc_adjst_typ_nm, $v_purc_adjst_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_adjst_typ, $s_purc_adjst_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcAdjstTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcAdjstTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcAdjstTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcAdjstTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcAdjstTypCols extends MSUAC_List.PurcAdjstTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PlPrntStr:カラム名クラス
	  */
	protected static class PlPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pl_prnt_str = "pl_prnt_str";
		/** OUT:名称 */
		public static final String $o_pl_prnt_str_nm = "pl_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_pl_prnt_str = $o_pl_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pl_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pl_prnt_str_nm = $o_pl_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pl_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pl_prnt_str = $o_pl_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pl_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pl_prnt_str);
					add($o_pl_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pl_prnt_str, $v_pl_prnt_str);
					put($vn_pl_prnt_str_nm, $v_pl_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pl_prnt_str, $s_pl_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PlPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PlPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PlPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PlPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PlPrntStrCols extends MSUAC_List.PlPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * IvPrntStr:カラム名クラス
	  */
	protected static class IvPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_iv_prnt_str = "iv_prnt_str";
		/** OUT:名称 */
		public static final String $o_iv_prnt_str_nm = "iv_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_iv_prnt_str = $o_iv_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_iv_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_iv_prnt_str_nm = $o_iv_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_iv_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_iv_prnt_str = $o_iv_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_iv_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_iv_prnt_str);
					add($o_iv_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_iv_prnt_str, $v_iv_prnt_str);
					put($vn_iv_prnt_str_nm, $v_iv_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_iv_prnt_str, $s_iv_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IvPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IvPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IvPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IvPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IvPrntStrCols extends MSUAC_List.IvPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PretSchdStsTyp:カラム名クラス
	  */
	protected static class PretSchdStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pret_schd_sts_typ = "pret_schd_sts_typ";
		/** OUT:名称 */
		public static final String $o_pret_schd_sts_typ_nm = "pret_schd_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_pret_schd_sts_typ = $o_pret_schd_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pret_schd_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pret_schd_sts_typ_nm = $o_pret_schd_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pret_schd_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pret_schd_sts_typ = $o_pret_schd_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pret_schd_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pret_schd_sts_typ);
					add($o_pret_schd_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pret_schd_sts_typ, $v_pret_schd_sts_typ);
					put($vn_pret_schd_sts_typ_nm, $v_pret_schd_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pret_schd_sts_typ, $s_pret_schd_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PretSchdStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PretSchdStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PretSchdStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PretSchdStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PretSchdStsTypCols extends MSUAC_List.PretSchdStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipInstStr:カラム名クラス
	  */
	protected static class ShipInstStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_ship_inst_str = "ship_inst_str";
		/** OUT:名称 */
		public static final String $o_ship_inst_str_nm = "ship_inst_str_nm";
		/** VIEW:値 */
		public static final String $v_ship_inst_str = $o_ship_inst_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_ship_inst_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_ship_inst_str_nm = $o_ship_inst_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_ship_inst_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_ship_inst_str = $o_ship_inst_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_ship_inst_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_inst_str);
					add($o_ship_inst_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_inst_str, $v_ship_inst_str);
					put($vn_ship_inst_str_nm, $v_ship_inst_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_inst_str, $s_ship_inst_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipInstStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipInstStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipInstStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipInstStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipInstStrCols extends MSUAC_List.ShipInstStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PickListStr:カラム名クラス
	  */
	protected static class PickListStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pick_list_str = "pick_list_str";
		/** OUT:名称 */
		public static final String $o_pick_list_str_nm = "pick_list_str_nm";
		/** VIEW:値 */
		public static final String $v_pick_list_str = $o_pick_list_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pick_list_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pick_list_str_nm = $o_pick_list_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pick_list_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pick_list_str = $o_pick_list_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pick_list_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pick_list_str);
					add($o_pick_list_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pick_list_str, $v_pick_list_str);
					put($vn_pick_list_str_nm, $v_pick_list_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pick_list_str, $s_pick_list_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PickListStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PickListStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PickListStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PickListStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PickListStrCols extends MSUAC_List.PickListStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * BillPrntStr:カラム名クラス
	  */
	protected static class BillPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_bill_prnt_str = "bill_prnt_str";
		/** OUT:名称 */
		public static final String $o_bill_prnt_str_nm = "bill_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_bill_prnt_str = $o_bill_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_bill_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_bill_prnt_str_nm = $o_bill_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_bill_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_bill_prnt_str = $o_bill_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_bill_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_prnt_str);
					add($o_bill_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_prnt_str, $v_bill_prnt_str);
					put($vn_bill_prnt_str_nm, $v_bill_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bill_prnt_str, $s_bill_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.BillPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.BillPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.BillPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.BillPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class BillPrntStrCols extends MSUAC_List.BillPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PrntNum:カラム名クラス
	  */
	protected static class PrntNumCols_MC_A  {
		/** OUT:値 */
		public static final String $o_prnt_num = "prnt_num";
		/** OUT:名称 */
		public static final String $o_prnt_num_nm = "prnt_num_nm";
		/** VIEW:値 */
		public static final String $v_prnt_num = $o_prnt_num;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_prnt_num = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_prnt_num_nm = $o_prnt_num_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prnt_num_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_prnt_num = $o_prnt_num;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prnt_num = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prnt_num);
					add($o_prnt_num_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prnt_num, $v_prnt_num);
					put($vn_prnt_num_nm, $v_prnt_num_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prnt_num, $s_prnt_num, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PrntNumCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PrntNumCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PrntNumCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PrntNumCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PrntNumCols extends MSUAC_List.PrntNumCols_MC_A {
		//EIクラス
	}


	/** 
	  * DlyMrk:カラム名クラス
	  */
	protected static class DlyMrkCols_MC_A  {
		/** OUT:値 */
		public static final String $o_dly_mrk = "dly_mrk";
		/** OUT:名称 */
		public static final String $o_dly_mrk_nm = "dly_mrk_nm";
		/** VIEW:値 */
		public static final String $v_dly_mrk = $o_dly_mrk;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_dly_mrk = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_dly_mrk_nm = $o_dly_mrk_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_dly_mrk_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_dly_mrk = $o_dly_mrk;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_dly_mrk = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dly_mrk);
					add($o_dly_mrk_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dly_mrk, $v_dly_mrk);
					put($vn_dly_mrk_nm, $v_dly_mrk_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dly_mrk, $s_dly_mrk, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DlyMrkCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DlyMrkCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DlyMrkCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DlyMrkCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DlyMrkCols extends MSUAC_List.DlyMrkCols_MC_A {
		//EIクラス
	}


	/** 
	  * StktkListStr:カラム名クラス
	  */
	protected static class StktkListStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_stktk_list_str = "stktk_list_str";
		/** OUT:名称 */
		public static final String $o_stktk_list_str_nm = "stktk_list_str_nm";
		/** VIEW:値 */
		public static final String $v_stktk_list_str = $o_stktk_list_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_stktk_list_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_stktk_list_str_nm = $o_stktk_list_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_stktk_list_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_stktk_list_str = $o_stktk_list_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_stktk_list_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stktk_list_str);
					add($o_stktk_list_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stktk_list_str, $v_stktk_list_str);
					put($vn_stktk_list_str_nm, $v_stktk_list_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stktk_list_str, $s_stktk_list_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StktkListStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StktkListStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StktkListStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StktkListStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StktkListStrCols extends MSUAC_List.StktkListStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * DlvSlipStr:カラム名クラス
	  */
	protected static class DlvSlipStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_dlv_slip_str = "dlv_slip_str";
		/** OUT:名称 */
		public static final String $o_dlv_slip_str_nm = "dlv_slip_str_nm";
		/** VIEW:値 */
		public static final String $v_dlv_slip_str = $o_dlv_slip_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_dlv_slip_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_dlv_slip_str_nm = $o_dlv_slip_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_dlv_slip_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_dlv_slip_str = $o_dlv_slip_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_dlv_slip_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dlv_slip_str);
					add($o_dlv_slip_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dlv_slip_str, $v_dlv_slip_str);
					put($vn_dlv_slip_str_nm, $v_dlv_slip_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dlv_slip_str, $s_dlv_slip_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DlvSlipStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DlvSlipStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DlvSlipStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DlvSlipStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DlvSlipStrCols extends MSUAC_List.DlvSlipStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * PayMtdTyp:カラム名クラス
	  */
	protected static class PayMtdTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pay_mtd_typ = "pay_mtd_typ";
		/** OUT:名称 */
		public static final String $o_pay_mtd_typ_nm = "pay_mtd_typ_nm";
		/** VIEW:値 */
		public static final String $v_pay_mtd_typ = $o_pay_mtd_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pay_mtd_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pay_mtd_typ_nm = $o_pay_mtd_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pay_mtd_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pay_mtd_typ = $o_pay_mtd_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pay_mtd_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pay_mtd_typ);
					add($o_pay_mtd_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pay_mtd_typ, $v_pay_mtd_typ);
					put($vn_pay_mtd_typ_nm, $v_pay_mtd_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pay_mtd_typ, $s_pay_mtd_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PayMtdTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PayMtdTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PayMtdTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PayMtdTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PayMtdTypCols extends MSUAC_List.PayMtdTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PayStsTyp:カラム名クラス
	  */
	protected static class PayStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pay_sts_typ = "pay_sts_typ";
		/** OUT:名称 */
		public static final String $o_pay_sts_typ_nm = "pay_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_pay_sts_typ = $o_pay_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pay_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pay_sts_typ_nm = $o_pay_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pay_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pay_sts_typ = $o_pay_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pay_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pay_sts_typ);
					add($o_pay_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pay_sts_typ, $v_pay_sts_typ);
					put($vn_pay_sts_typ_nm, $v_pay_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pay_sts_typ, $s_pay_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PayStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PayStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PayStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PayStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PayStsTypCols extends MSUAC_List.PayStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * PayNtcPrntStr:カラム名クラス
	  */
	protected static class PayNtcPrntStrCols_MC_A  {
		/** OUT:値 */
		public static final String $o_pay_ntc_prnt_str = "pay_ntc_prnt_str";
		/** OUT:名称 */
		public static final String $o_pay_ntc_prnt_str_nm = "pay_ntc_prnt_str_nm";
		/** VIEW:値 */
		public static final String $v_pay_ntc_prnt_str = $o_pay_ntc_prnt_str;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_pay_ntc_prnt_str = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_pay_ntc_prnt_str_nm = $o_pay_ntc_prnt_str_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_pay_ntc_prnt_str_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_pay_ntc_prnt_str = $o_pay_ntc_prnt_str;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_pay_ntc_prnt_str = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_pay_ntc_prnt_str);
					add($o_pay_ntc_prnt_str_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_pay_ntc_prnt_str, $v_pay_ntc_prnt_str);
					put($vn_pay_ntc_prnt_str_nm, $v_pay_ntc_prnt_str_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_pay_ntc_prnt_str, $s_pay_ntc_prnt_str, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PayNtcPrntStrCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PayNtcPrntStrCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PayNtcPrntStrCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PayNtcPrntStrCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PayNtcPrntStrCols extends MSUAC_List.PayNtcPrntStrCols_MC_A {
		//EIクラス
	}


	/** 
	  * IvPrStsTyp:カラム名クラス
	  */
	protected static class IvPrStsTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_iv_pr_sts_typ = "iv_pr_sts_typ";
		/** OUT:名称 */
		public static final String $o_iv_pr_sts_typ_nm = "iv_pr_sts_typ_nm";
		/** VIEW:値 */
		public static final String $v_iv_pr_sts_typ = $o_iv_pr_sts_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_iv_pr_sts_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_iv_pr_sts_typ_nm = $o_iv_pr_sts_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_iv_pr_sts_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_iv_pr_sts_typ = $o_iv_pr_sts_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_iv_pr_sts_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_iv_pr_sts_typ);
					add($o_iv_pr_sts_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_iv_pr_sts_typ, $v_iv_pr_sts_typ);
					put($vn_iv_pr_sts_typ_nm, $v_iv_pr_sts_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_iv_pr_sts_typ, $s_iv_pr_sts_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.IvPrStsTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.IvPrStsTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.IvPrStsTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.IvPrStsTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class IvPrStsTypCols extends MSUAC_List.IvPrStsTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * SlsCondTyp:カラム名クラス
	  */
	protected static class SlsCondTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_sls_cond_typ = "sls_cond_typ";
		/** OUT:名称 */
		public static final String $o_sls_cond_typ_nm = "sls_cond_typ_nm";
		/** VIEW:値 */
		public static final String $v_sls_cond_typ = $o_sls_cond_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_sls_cond_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_sls_cond_typ_nm = $o_sls_cond_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_sls_cond_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_sls_cond_typ = $o_sls_cond_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_sls_cond_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sls_cond_typ);
					add($o_sls_cond_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sls_cond_typ, $v_sls_cond_typ);
					put($vn_sls_cond_typ_nm, $v_sls_cond_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sls_cond_typ, $s_sls_cond_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SlsCondTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SlsCondTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SlsCondTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SlsCondTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SlsCondTypCols extends MSUAC_List.SlsCondTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * FreeRsnTyp:カラム名クラス
	  */
	protected static class FreeRsnTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_free_rsn_typ = "free_rsn_typ";
		/** OUT:名称 */
		public static final String $o_free_rsn_typ_nm = "free_rsn_typ_nm";
		/** VIEW:値 */
		public static final String $v_free_rsn_typ = $o_free_rsn_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_free_rsn_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_free_rsn_typ_nm = $o_free_rsn_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_free_rsn_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_free_rsn_typ = $o_free_rsn_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_free_rsn_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_free_rsn_typ);
					add($o_free_rsn_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_free_rsn_typ, $v_free_rsn_typ);
					put($vn_free_rsn_typ_nm, $v_free_rsn_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_free_rsn_typ, $s_free_rsn_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.FreeRsnTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.FreeRsnTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.FreeRsnTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.FreeRsnTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class FreeRsnTypCols extends MSUAC_List.FreeRsnTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * CstItm:カラム名クラス
	  */
	protected static class CstItmCols_MC_A  {
		/** IN:取引先ＣＤ */
		public static final String $i_bp_cd = "bp_cd";
		/** IN:取引先名 */
		public static final String $i_bp_nm = "bp_nm";
		/** IN:取引先品目ＣＤ */
		public static final String $i_bp_itm_cd = "bp_itm_cd";
		/** IN:取引先品名 */
		public static final String $i_bp_itm_nm = "bp_itm_nm";
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
		/** IN:品目区分 */
		public static final String $i_itm_typ = "itm_typ";
		/** IN:品目区分詳細ＣＤ */
		public static final String $i_itm_typ_d_cd = "itm_typ_d_cd";
		/** IN:品目区分詳細名 */
		public static final String $i_itm_typ_d_nm = "itm_typ_d_nm";
		/** IN:諸口品ＦＬＧ.オン */
		public static final String $i_sundry_itm_flg_on = "sundry_itm_flg_on";
		/** IN:諸口品ＦＬＧ.オフ */
		public static final String $i_sundry_itm_flg_off = "sundry_itm_flg_off";
		/** IN:在庫管理区分 */
		public static final String $i_stk_mng_typ = "stk_mng_typ";
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** IN:適用日 */
		public static final String $i_dt = "dt";
		/** IN:得意先品目入力補助検索区分 */
		public static final String $i_cst_itm_is_srch_typ = "cst_itm_is_srch_typ";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:取引先品目ＣＤ */
		public static final String $o_bp_itm_cd = "bp_itm_cd";
		/** OUT:取引先ＣＤ */
		public static final String $o_bp_cd = "bp_cd";
		/** OUT:取引先品名 */
		public static final String $o_bp_itm_nm = "bp_itm_nm";
		/** OUT:デフォルトＦＬＧ */
		public static final String $o_def_flg = "def_flg";
		/** OUT:品目ＣＤ */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１ */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:購買内示グループＣＤ */
		public static final String $o_pf_grp_cd = "pf_grp_cd";
		/** OUT:購買内示確定ＦＬＧ */
		public static final String $o_pf_fix_flg = "pf_fix_flg";
		/** OUT:引取責任ＦＬＧ */
		public static final String $o_purc_commit_flg = "purc_commit_flg";
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
		/** OUT:取引先名 */
		public static final String $o_bp_nm = "bp_nm";
		/** OUT:品名 */
		public static final String $o_itm_nm = "itm_nm";
		/** OUT:品目区分 */
		public static final String $o_itm_typ = "itm_typ";
		/** OUT:品目区分名 */
		public static final String $o_itm_typ_nm = "itm_typ_nm";
		/** OUT:品目区分詳細ＣＤ */
		public static final String $o_itm_typ_d_cd = "itm_typ_d_cd";
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
		/** OUT:品目区分詳細名 */
		public static final String $o_itm_typ_d_nm = "itm_typ_d_nm";
		/** OUT:購買内示グループ名 */
		public static final String $o_pf_grp_nm = "pf_grp_nm";
		/** VIEW:取引先ＣＤ */
		public static final String $v_bp_cd = $o_bp_cd;
		/** VIEW_NO:取引先ＣＤ */
		protected static final MCNumber $vn_bp_cd = new MCNumber(10);
		/** SORT:取引先品目ＣＤ */
		public static final String $s_bp_itm_cd = $o_bp_itm_cd;
		/** SORT_NO:取引先品目ＣＤ */
		protected static final MCNumber $sn_bp_itm_cd = new MCNumber(20);
		/** SORT:取引先ＣＤ */
		public static final String $s_bp_cd = $o_bp_cd;
		/** SORT_NO:取引先ＣＤ */
		protected static final MCNumber $sn_bp_cd = new MCNumber(10);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1140";
		/** OTHER:諸口品ＦＬＧ.オンのモード ※頭は「mode_」で固定 */
		public static final String $m_sundry_itm_flg_on = "mode_sundry_itm_flg_on";
		/** OTHER:諸口品ＦＬＧ.オフのモード ※頭は「mode_」で固定 */
		public static final String $m_sundry_itm_flg_off = "mode_sundry_itm_flg_off";
		/** OTHER:在庫管理区分のモード ※頭は「mode_」で固定 */
		public static final String $m_stk_mng_typ = "mode_stk_mng_typ";
		/** OTHER:資産管理区分のモード ※頭は「mode_」で固定 */
		public static final String $m_asset_mng_typ = "mode_asset_mng_typ";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bp_itm_cd);
					add($o_bp_cd);
					add($o_bp_itm_nm);
					add($o_def_flg);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_pf_grp_cd);
					add($o_pf_fix_flg);
					add($o_purc_commit_flg);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_bp_nm);
					add($o_itm_nm);
					add($o_itm_typ);
					add($o_itm_typ_nm);
					add($o_itm_typ_d_cd);
					add($o_stk_mng_typ);
					add($o_stk_mng_typ_nm);
					add($o_asset_mng_typ);
					add($o_asset_mng_typ_nm);
					add($o_sundry_itm_flg);
					add($o_itm_typ_d_nm);
					add($o_pf_grp_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bp_cd, $v_bp_cd);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_bp_itm_cd, $s_bp_itm_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.CstItmCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.CstItmCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.CstItmCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.CstItmCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class CstItmCols extends MSUAC_List.CstItmCols_MC_A {
		//EIクラス
	}

}
