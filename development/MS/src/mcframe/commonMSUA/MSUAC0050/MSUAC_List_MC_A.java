package mcframe.commonMSUA.MSUAC0050;
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
	  * PoCrctRsn:カラム名クラス
	  */
	protected static class PoCrctRsnCols_MC_A  {
		/** OUT: */
		public static final String $o_po_crct_rsn_cd = "po_crct_rsn_cd";
		/** OUT: */
		public static final String $o_po_crct_rsn_nm = "po_crct_rsn_nm";
		/** OUT: */
		public static final String $o_po_crct_rsn_rmrks = "po_crct_rsn_rmrks";
		/** VIEW: */
		public static final String $v_po_crct_rsn_cd = $o_po_crct_rsn_cd;
		/** VIEW_NO: */
		protected static final MCNumber $vn_po_crct_rsn_cd = new MCNumber(10);
		/** VIEW: */
		public static final String $v_po_crct_rsn_nm = $o_po_crct_rsn_nm;
		/** VIEW_NO: */
		protected static final MCNumber $vn_po_crct_rsn_nm = new MCNumber(20);
		/** SORT: */
		public static final String $s_po_crct_rsn_cd = $o_po_crct_rsn_cd;
		/** SORT_NO: */
		protected static final MCNumber $sn_po_crct_rsn_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBDL0003";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_po_crct_rsn_cd);
					add($o_po_crct_rsn_nm);
					add($o_po_crct_rsn_rmrks);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_po_crct_rsn_cd, $v_po_crct_rsn_cd);
					put($vn_po_crct_rsn_nm, $v_po_crct_rsn_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_po_crct_rsn_cd, $s_po_crct_rsn_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PoCrctRsnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PoCrctRsnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PoCrctRsnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PoCrctRsnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PoCrctRsnCols extends MSUAC_List.PoCrctRsnCols_MC_A {
		//EIクラス
	}


	/** 
	  * PurcSrchTgtTyp:カラム名クラス
	  */
	protected static class PurcSrchTgtTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_srch_tgt_typ = "purc_srch_tgt_typ";
		/** OUT:名称 */
		public static final String $o_purc_srch_tgt_typ_nm = "purc_srch_tgt_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_srch_tgt_typ = $o_purc_srch_tgt_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_srch_tgt_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_srch_tgt_typ_nm = $o_purc_srch_tgt_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_srch_tgt_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_srch_tgt_typ = $o_purc_srch_tgt_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_srch_tgt_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_srch_tgt_typ);
					add($o_purc_srch_tgt_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_srch_tgt_typ, $v_purc_srch_tgt_typ);
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
	  * PurcDlvSlipSrcTyp:カラム名クラス
	  */
	protected static class PurcDlvSlipSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_purc_dlv_slip_src_typ = "purc_dlv_slip_src_typ";
		/** OUT:名称 */
		public static final String $o_purc_dlv_slip_src_typ_nm = "purc_dlv_slip_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_purc_dlv_slip_src_typ = $o_purc_dlv_slip_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_purc_dlv_slip_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_purc_dlv_slip_src_typ_nm = $o_purc_dlv_slip_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_purc_dlv_slip_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_purc_dlv_slip_src_typ = $o_purc_dlv_slip_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_purc_dlv_slip_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_purc_dlv_slip_src_typ);
					add($o_purc_dlv_slip_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_purc_dlv_slip_src_typ, $v_purc_dlv_slip_src_typ);
					put($vn_purc_dlv_slip_src_typ_nm, $v_purc_dlv_slip_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_purc_dlv_slip_src_typ, $s_purc_dlv_slip_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.PurcDlvSlipSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.PurcDlvSlipSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.PurcDlvSlipSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.PurcDlvSlipSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class PurcDlvSlipSrcTypCols extends MSUAC_List.PurcDlvSlipSrcTypCols_MC_A {
		//EIクラス
	}

}
