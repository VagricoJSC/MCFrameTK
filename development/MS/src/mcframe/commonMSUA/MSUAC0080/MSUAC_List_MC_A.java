package mcframe.commonMSUA.MSUAC0080;
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
	  * SttlRcv:カラム名クラス
	  */
	protected static class SttlRcvCols_MC_A  {
		/** IN:入金登録区分１ */
		public static final String $i_rcv_reg_typ1 = "rcv_reg_typ1";
		/** IN:入金登録区分２ */
		public static final String $i_rcv_reg_typ2 = "rcv_reg_typ2";
		/** IN:入金登録区分３ */
		public static final String $i_rcv_reg_typ3 = "rcv_reg_typ3";
		/** IN:入金先ＣＤ */
		public static final String $i_rcst_cd = "rcst_cd";
		/** IN:債権決済区分 */
		public static final String $i_ar_sttl_typ = "ar_sttl_typ";
		/** IN:手形除くＦＬＧ */
		public static final String $i_except_note_flg = "except_note_flg";
		/** OUT:決済方法ＣＤ */
		public static final String $o_sttl_cd = "sttl_cd";
		/** OUT:決済方法名 */
		public static final String $o_sttl_nm = "sttl_nm";
		/** OUT:債権決済区分 */
		public static final String $o_ar_sttl_typ = "ar_sttl_typ";
		/** OUT:入金登録区分 */
		public static final String $o_rcv_reg_typ = "rcv_reg_typ";
		/** OUT:相殺方法ＣＤ */
		public static final String $o_ar_setoff_cd = "ar_setoff_cd";
		/** OUT:振込人名 */
		public static final String $o_xfr_psn = "xfr_psn";
		/** VIEW:決済方法ＣＤ */
		public static final String $v_sttl_cd = $o_sttl_cd;
		/** VIEW_NO:決済方法ＣＤ */
		protected static final MCNumber $vn_sttl_cd = new MCNumber(10);
		/** VIEW:決済方法名 */
		public static final String $v_sttl_nm = $o_sttl_nm;
		/** VIEW_NO:決済方法名 */
		protected static final MCNumber $vn_sttl_nm = new MCNumber(20);
		/** SORT:決済方法ＣＤ */
		public static final String $s_sttl_cd = $o_sttl_cd;
		/** SORT_NO:決済方法ＣＤ */
		protected static final MCNumber $sn_sttl_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBGL0071";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sttl_cd);
					add($o_sttl_nm);
					add($o_ar_sttl_typ);
					add($o_rcv_reg_typ);
					add($o_ar_setoff_cd);
					add($o_xfr_psn);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sttl_cd, $v_sttl_cd);
					put($vn_sttl_nm, $v_sttl_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sttl_cd, $s_sttl_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SttlRcvCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SttlRcvCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SttlRcvCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SttlRcvCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SttlRcvCols extends MSUAC_List.SttlRcvCols_MC_A {
		//EIクラス
	}


	/** 
	  * Bcst_BillClDay:カラム名クラス
	  */
	protected static class Bcst_BillClDayCols_MC_A  {
		/** IN:請求先ＣＤ */
		public static final String $i_bcst_cd = "bcst_cd";
		/** OUT:請求締日 */
		public static final String $o_bill_cl_day = "bill_cl_day";
		/** VIEW:請求締日 */
		public static final String $v_bill_cl_day = $o_bill_cl_day;
		/** VIEW_NO:請求締日 */
		protected static final MCNumber $vn_bill_cl_day = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bill_cl_day);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bill_cl_day, $v_bill_cl_day);
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
		public static final String[] outAll(){return MSUAC_List.Bcst_BillClDayCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.Bcst_BillClDayCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.Bcst_BillClDayCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.Bcst_BillClDayCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class Bcst_BillClDayCols extends MSUAC_List.Bcst_BillClDayCols_MC_A {
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

}
