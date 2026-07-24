package mcframe.commonMSUA.MSUAC0020;
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

}
