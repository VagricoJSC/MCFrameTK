package mcframe.commonMSUA.MSUAC0060;
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
	  * InToId:カラム名クラス
	  */
	protected static class InToIdCols_MC_A  {
		/** IN:納入先識別区分 */
		public static final String $i_in_to_id_typ = "in_to_id_typ";
		/** IN:納入先識別ＣＤ */
		public static final String $i_in_to_id_cd = "in_to_id_cd";
		/** IN:納入先識別名 */
		public static final String $i_in_to_id_nm = "in_to_id_nm";
		/** IN:納入先識別別名１ */
		public static final String $i_in_to_id_alt_nm1 = "in_to_id_alt_nm1";
		/** IN:納入先識別別名２ */
		public static final String $i_in_to_id_alt_nm2 = "in_to_id_alt_nm2";
		/** IN:納入先識別別名３ */
		public static final String $i_in_to_id_alt_nm3 = "in_to_id_alt_nm3";
		/** IN:納入先識別別名４ */
		public static final String $i_in_to_id_alt_nm4 = "in_to_id_alt_nm4";
		/** IN:基準日（郵便番号、住所１～４、ＴＥＬ、ＦＡＸを取得する場合は必須） */
		public static final String $i_base_dt = "base_dt";
		/** OUT:納入先識別ＣＤ */
		public static final String $o_in_to_id_cd = "in_to_id_cd";
		/** OUT:納入先識別名 */
		public static final String $o_in_to_id_nm = "in_to_id_nm";
		/** OUT:納入先識別別名１ */
		public static final String $o_in_to_id_alt_nm1 = "in_to_id_alt_nm1";
		/** OUT:納入先識別別名２ */
		public static final String $o_in_to_id_alt_nm2 = "in_to_id_alt_nm2";
		/** OUT:納入先識別別名３ */
		public static final String $o_in_to_id_alt_nm3 = "in_to_id_alt_nm3";
		/** OUT:納入先識別別名４ */
		public static final String $o_in_to_id_alt_nm4 = "in_to_id_alt_nm4";
		/** OUT:納入先識別区分 */
		public static final String $o_in_to_id_typ = "in_to_id_typ";
		/** OUT:納入先諸口ＦＬＧ */
		public static final String $o_in_to_sundry_flg = "in_to_sundry_flg";
		/** OUT:国ＣＤ */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
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
		/** OUT:納入先部署 */
		public static final String $o_in_to_cntct_dpt = "in_to_cntct_dpt";
		/** OUT:納入先担当者 */
		public static final String $o_in_to_cntct_psn = "in_to_cntct_psn";
		/** VIEW:納入先識別ＣＤ */
		public static final String $v_in_to_id_cd = $o_in_to_id_cd;
		/** VIEW_NO:納入先識別ＣＤ */
		protected static final MCNumber $vn_in_to_id_cd = new MCNumber(10);
		/** VIEW:納入先識別名 */
		public static final String $v_in_to_id_nm = $o_in_to_id_nm;
		/** VIEW_NO:納入先識別名 */
		protected static final MCNumber $vn_in_to_id_nm = new MCNumber(20);
		/** SORT:納入先識別ＣＤ */
		public static final String $s_in_to_id_cd = $o_in_to_id_cd;
		/** SORT_NO:納入先識別ＣＤ */
		protected static final MCNumber $sn_in_to_id_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_in_to_id_cd);
					add($o_in_to_id_nm);
					add($o_in_to_id_alt_nm1);
					add($o_in_to_id_alt_nm2);
					add($o_in_to_id_alt_nm3);
					add($o_in_to_id_alt_nm4);
					add($o_in_to_id_typ);
					add($o_in_to_sundry_flg);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_in_to_cntct_dpt);
					add($o_in_to_cntct_psn);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_in_to_id_cd, $v_in_to_id_cd);
					put($vn_in_to_id_nm, $v_in_to_id_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_in_to_id_cd, $s_in_to_id_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.InToIdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.InToIdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.InToIdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.InToIdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class InToIdCols extends MSUAC_List.InToIdCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkBp:カラム名クラス
	  */
	protected static class StkBpCols_MC_A  {
		/** IN:在庫識別区分 */
		public static final String $i_stk_id_typ = "stk_id_typ";
		/** OUT:在庫取引先ＣＤ */
		public static final String $o_stk_bp_cd = "stk_bp_cd";
		/** OUT:在庫取引先名 */
		public static final String $o_stk_bp_nm = "stk_bp_nm";
		/** OUT:得意先ＦＬＧ（存在チェック用） */
		public static final String $o_cst_flg = "cst_flg";
		/** OUT:発注先ＦＬＧ（存在チェック用） */
		public static final String $o_sppl_flg = "sppl_flg";
		/** VIEW:在庫取引先ＣＤ */
		public static final String $v_stk_bp_cd = $o_stk_bp_cd;
		/** VIEW_NO:在庫取引先ＣＤ */
		protected static final MCNumber $vn_stk_bp_cd = new MCNumber(10);
		/** VIEW:在庫取引先名 */
		public static final String $v_stk_bp_nm = $o_stk_bp_nm;
		/** VIEW_NO:在庫取引先名 */
		protected static final MCNumber $vn_stk_bp_nm = new MCNumber(20);
		/** SORT:在庫取引先ＣＤ */
		public static final String $s_stk_bp_cd = $o_stk_bp_cd;
		/** SORT_NO:在庫取引先ＣＤ */
		protected static final MCNumber $sn_stk_bp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSUALxxxx";
		/** OTHER:別名対応 */
		public static final String $k_first_key_db = "bp_cd";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_stk_bp_cd);
					add($o_stk_bp_nm);
					add($o_cst_flg);
					add($o_sppl_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_stk_bp_cd, $v_stk_bp_cd);
					put($vn_stk_bp_nm, $v_stk_bp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_stk_bp_cd, $s_stk_bp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.StkBpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.StkBpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.StkBpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.StkBpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class StkBpCols extends MSUAC_List.StkBpCols_MC_A {
		//EIクラス
	}


	/** 
	  * StkIdTyp:カラム名クラス
	  */
	protected static class StkIdTypCols_MC_A  {
		/** IN:出庫発注先 */
		public static final String $i_gi_sppl_cd = "gi_sppl_cd";
		/** IN:入庫発注先 */
		public static final String $i_gr_sppl_cd = "gr_sppl_cd";
		/** IN:インボイス取引 */
		public static final String $i_iv_trd_flg = "iv_trd_flg";
		/** IN:移動実績はtrue */
		public static final String $i_xfr_flg = "xfr_flg";
		/** IN:出荷実績はtrue */
		public static final String $i_ship_flg = "ship_flg";
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
	  * ProvTyp:カラム名クラス
	  */
	protected static class ProvTypCols_MC_A  {
		/** IN:有償支給先ＦＬＧ */
		public static final String $i_onr_prsppl_flg = "onr_prsppl_flg";
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** OUT:値 */
		public static final String $o_prov_typ = "prov_typ";
		/** OUT:名称 */
		public static final String $o_prov_typ_nm = "prov_typ_nm";
		/** VIEW:値 */
		public static final String $v_prov_typ = $o_prov_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_prov_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_prov_typ_nm = $o_prov_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_prov_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_prov_typ = $o_prov_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_prov_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_prov_typ);
					add($o_prov_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_prov_typ, $v_prov_typ);
					put($vn_prov_typ_nm, $v_prov_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_prov_typ, $s_prov_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ProvTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ProvTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ProvTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ProvTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ProvTypCols extends MSUAC_List.ProvTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * RcptIvSrcTyp:カラム名クラス
	  */
	protected static class RcptIvSrcTypCols_MC_A  {
		/** OUT:値 */
		public static final String $o_rcpt_iv_src_typ = "rcpt_iv_src_typ";
		/** OUT:名称 */
		public static final String $o_rcpt_iv_src_typ_nm = "rcpt_iv_src_typ_nm";
		/** VIEW:値 */
		public static final String $v_rcpt_iv_src_typ = $o_rcpt_iv_src_typ;
		/** VIEW_NO:値 */
		protected static final MCNumber $vn_rcpt_iv_src_typ = new MCNumber(10);
		/** VIEW:名称 */
		public static final String $v_rcpt_iv_src_typ_nm = $o_rcpt_iv_src_typ_nm;
		/** VIEW_NO:名称 */
		protected static final MCNumber $vn_rcpt_iv_src_typ_nm = new MCNumber(20);
		/** SORT:値 */
		public static final String $s_rcpt_iv_src_typ = $o_rcpt_iv_src_typ;
		/** SORT_NO:値 */
		protected static final MCNumber $sn_rcpt_iv_src_typ = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_rcpt_iv_src_typ);
					add($o_rcpt_iv_src_typ_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_rcpt_iv_src_typ, $v_rcpt_iv_src_typ);
					put($vn_rcpt_iv_src_typ_nm, $v_rcpt_iv_src_typ_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_rcpt_iv_src_typ, $s_rcpt_iv_src_typ, ASC);
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
		public static final String[] outAll(){return MSUAC_List.RcptIvSrcTypCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.RcptIvSrcTypCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.RcptIvSrcTypCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.RcptIvSrcTypCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class RcptIvSrcTypCols extends MSUAC_List.RcptIvSrcTypCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipToId:カラム名クラス
	  */
	protected static class ShipToIdCols_MC_A  {
		/** IN:送付先識別区分（必須） */
		public static final String $i_ship_to_id_typ = "ship_to_id_typ";
		/** IN:送付先識別区分名 */
		public static final String $i_ship_to_id_typ_nm = "ship_to_id_typ_nm";
		/** IN:基準日（必須） */
		public static final String $i_base_dt = "base_dt";
		/** IN:送付先識別ＣＤ */
		public static final String $i_ship_to_id_cd = "ship_to_id_cd";
		/** IN:送付先識別名 */
		public static final String $i_ship_to_id_nm = "ship_to_id_nm";
		/** IN:送付先識別別名１ */
		public static final String $i_ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
		/** IN:送付先識別別名２ */
		public static final String $i_ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
		/** IN:送付先識別別名３ */
		public static final String $i_ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
		/** IN:送付先識別別名４ */
		public static final String $i_ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
		/** IN:社内のみ（送付先識別区分「場所」のみ有効） */
		public static final String $i_house_flg = "house_flg";
		/** IN:社外のみ（送付先識別区分「場所」のみ有効） */
		public static final String $i_outside_flg = "outside_flg";
		/** OUT:送付先識別ＣＤ */
		public static final String $o_ship_to_id_cd = "ship_to_id_cd";
		/** OUT:送付先識別名 */
		public static final String $o_ship_to_id_nm = "ship_to_id_nm";
		/** OUT:送付先識別別名１ */
		public static final String $o_ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
		/** OUT:送付先識別別名２ */
		public static final String $o_ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
		/** OUT:送付先識別別名３ */
		public static final String $o_ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
		/** OUT:送付先識別別名４ */
		public static final String $o_ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
		/** OUT:送付先識別区分 */
		public static final String $o_ship_to_id_typ = "ship_to_id_typ";
		/** OUT:送付先識別区分名 */
		public static final String $o_ship_to_id_typ_nm = "ship_to_id_typ_nm";
		/** OUT:送付先諸口ＦＬＧ */
		public static final String $o_ship_to_sundry_flg = "ship_to_sundry_flg";
		/** OUT:配送先経由区分 */
		public static final String $o_via_dlv_typ = "via_dlv_typ";
		/** OUT:国ＣＤ */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
		/** OUT:物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:物流グループ名 */
		public static final String $o_lg_grp_nm = "lg_grp_nm";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
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
		/** OUT:送付先部署 */
		public static final String $o_ship_to_cntct_dpt = "ship_to_cntct_dpt";
		/** OUT:送付先担当者 */
		public static final String $o_ship_to_cntct_psn = "ship_to_cntct_psn";
		/** OUT:価格印字ＦＬＧ */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** VIEW:送付先識別ＣＤ */
		public static final String $v_ship_to_id_cd = $o_ship_to_id_cd;
		/** VIEW_NO:送付先識別ＣＤ */
		protected static final MCNumber $vn_ship_to_id_cd = new MCNumber(10);
		/** VIEW:送付先識別名 */
		public static final String $v_ship_to_id_nm = $o_ship_to_id_nm;
		/** VIEW_NO:送付先識別名 */
		protected static final MCNumber $vn_ship_to_id_nm = new MCNumber(20);
		/** SORT:送付先識別ＣＤ */
		public static final String $s_ship_to_id_cd = $o_ship_to_id_cd;
		/** SORT_NO:送付先識別ＣＤ */
		protected static final MCNumber $sn_ship_to_id_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBEL0080";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1060";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_to_id_cd);
					add($o_ship_to_id_nm);
					add($o_ship_to_id_alt_nm1);
					add($o_ship_to_id_alt_nm2);
					add($o_ship_to_id_alt_nm3);
					add($o_ship_to_id_alt_nm4);
					add($o_ship_to_id_typ);
					add($o_ship_to_id_typ_nm);
					add($o_ship_to_sundry_flg);
					add($o_via_dlv_typ);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_str_ln_tgt_flg);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_ship_to_cntct_dpt);
					add($o_ship_to_cntct_psn);
					add($o_pri_prnt_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_to_id_cd, $v_ship_to_id_cd);
					put($vn_ship_to_id_nm, $v_ship_to_id_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_to_id_cd, $s_ship_to_id_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipToIdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipToIdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipToIdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipToIdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipToIdCols extends MSUAC_List.ShipToIdCols_MC_A {
		//EIクラス
	}


	/** 
	  * DlvId:カラム名クラス
	  */
	protected static class DlvIdCols_MC_A  {
		/** IN:納品先識別区分 */
		public static final String $i_dlv_id_typ = "dlv_id_typ";
		/** IN:納品先識別区分名 */
		public static final String $i_dlv_id_typ_nm = "dlv_id_typ_nm";
		/** IN:基準日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:納品先識別ＣＤ */
		public static final String $i_dlv_id_cd = "dlv_id_cd";
		/** IN:納品先識別名 */
		public static final String $i_dlv_id_nm = "dlv_id_nm";
		/** IN:納品先識別別名１ */
		public static final String $i_dlv_id_alt_nm1 = "dlv_id_alt_nm1";
		/** IN:納品先識別別名２ */
		public static final String $i_dlv_id_alt_nm2 = "dlv_id_alt_nm2";
		/** IN:納品先識別別名３ */
		public static final String $i_dlv_id_alt_nm3 = "dlv_id_alt_nm3";
		/** IN:納品先識別別名４ */
		public static final String $i_dlv_id_alt_nm4 = "dlv_id_alt_nm4";
		/** IN:社内のみ（納入先識別区分「場所」のみ有効） */
		public static final String $i_house_flg = "house_flg";
		/** IN:社外のみ（納入先識別区分「場所」のみ有効） */
		public static final String $i_outside_flg = "outside_flg";
		/** OUT:納品先識別ＣＤ */
		public static final String $o_dlv_id_cd = "dlv_id_cd";
		/** OUT:納品先識別名 */
		public static final String $o_dlv_id_nm = "dlv_id_nm";
		/** OUT:納品先識別別名１ */
		public static final String $o_dlv_id_alt_nm1 = "dlv_id_alt_nm1";
		/** OUT:納品先識別別名２ */
		public static final String $o_dlv_id_alt_nm2 = "dlv_id_alt_nm2";
		/** OUT:納品先識別別名３ */
		public static final String $o_dlv_id_alt_nm3 = "dlv_id_alt_nm3";
		/** OUT:納品先識別別名４ */
		public static final String $o_dlv_id_alt_nm4 = "dlv_id_alt_nm4";
		/** OUT:納品先識別区分 */
		public static final String $o_dlv_id_typ = "dlv_id_typ";
		/** OUT:納品先識別区分名 */
		public static final String $o_dlv_id_typ_nm = "dlv_id_typ_nm";
		/** OUT:納品先諸口ＦＬＧ */
		public static final String $o_dlv_sundry_flg = "dlv_sundry_flg";
		/** OUT:国ＣＤ */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
		/** OUT:物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:物流グループ名 */
		public static final String $o_lg_grp_nm = "lg_grp_nm";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
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
		/** OUT:納品先部署 */
		public static final String $o_dlv_cntct_dpt = "dlv_cntct_dpt";
		/** OUT:納品先担当者 */
		public static final String $o_dlv_cntct_psn = "dlv_cntct_psn";
		/** OUT:価格印字ＦＬＧ */
		public static final String $o_pri_prnt_flg = "pri_prnt_flg";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** VIEW:納品先識別ＣＤ */
		public static final String $v_dlv_id_cd = $o_dlv_id_cd;
		/** VIEW_NO:納品先識別ＣＤ */
		protected static final MCNumber $vn_dlv_id_cd = new MCNumber(10);
		/** VIEW:納品先識別名 */
		public static final String $v_dlv_id_nm = $o_dlv_id_nm;
		/** VIEW_NO:納品先識別名 */
		protected static final MCNumber $vn_dlv_id_nm = new MCNumber(20);
		/** SORT:納品先識別ＣＤ */
		public static final String $s_dlv_id_cd = $o_dlv_id_cd;
		/** SORT_NO:納品先識別ＣＤ */
		protected static final MCNumber $sn_dlv_id_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBEL0081";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1070";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_dlv_id_cd);
					add($o_dlv_id_nm);
					add($o_dlv_id_alt_nm1);
					add($o_dlv_id_alt_nm2);
					add($o_dlv_id_alt_nm3);
					add($o_dlv_id_alt_nm4);
					add($o_dlv_id_typ);
					add($o_dlv_id_typ_nm);
					add($o_dlv_sundry_flg);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_str_ln_tgt_flg);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_dlv_cntct_dpt);
					add($o_dlv_cntct_psn);
					add($o_pri_prnt_flg);
					add($o_prnt_lcl_cd);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_dlv_id_cd, $v_dlv_id_cd);
					put($vn_dlv_id_nm, $v_dlv_id_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_dlv_id_cd, $s_dlv_id_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DlvIdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DlvIdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DlvIdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DlvIdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DlvIdCols extends MSUAC_List.DlvIdCols_MC_A {
		//EIクラス
	}


	/** 
	  * ShipRqstId:カラム名クラス
	  */
	protected static class ShipRqstIdCols_MC_A  {
		/** IN:出荷依頼先識別区分 */
		public static final String $i_ship_rqst_id_typ = "ship_rqst_id_typ";
		/** IN:出荷依頼先識別区分名 */
		public static final String $i_ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
		/** IN:基準日 */
		public static final String $i_base_dt = "base_dt";
		/** IN:出荷依頼先識別ＣＤ */
		public static final String $i_ship_rqst_id_cd = "ship_rqst_id_cd";
		/** IN:出荷依頼先識別名 */
		public static final String $i_ship_rqst_id_nm = "ship_rqst_id_nm";
		/** IN:出荷依頼先識別別名１ */
		public static final String $i_ship_rqst_id_alt_nm1 = "ship_rqst_id_alt_nm1";
		/** IN:出荷依頼先識別別名２ */
		public static final String $i_ship_rqst_id_alt_nm2 = "ship_rqst_id_alt_nm2";
		/** IN:出荷依頼先識別別名３ */
		public static final String $i_ship_rqst_id_alt_nm3 = "ship_rqst_id_alt_nm3";
		/** IN:出荷依頼先識別別名４ */
		public static final String $i_ship_rqst_id_alt_nm4 = "ship_rqst_id_alt_nm4";
		/** OUT:出荷依頼先識別ＣＤ */
		public static final String $o_ship_rqst_id_cd = "ship_rqst_id_cd";
		/** OUT:出荷依頼先識別名 */
		public static final String $o_ship_rqst_id_nm = "ship_rqst_id_nm";
		/** OUT:出荷依頼先識別別名１ */
		public static final String $o_ship_rqst_id_alt_nm1 = "ship_rqst_id_alt_nm1";
		/** OUT:出荷依頼先識別別名２ */
		public static final String $o_ship_rqst_id_alt_nm2 = "ship_rqst_id_alt_nm2";
		/** OUT:出荷依頼先識別別名３ */
		public static final String $o_ship_rqst_id_alt_nm3 = "ship_rqst_id_alt_nm3";
		/** OUT:出荷依頼先識別別名４ */
		public static final String $o_ship_rqst_id_alt_nm4 = "ship_rqst_id_alt_nm4";
		/** OUT:出荷依頼先識別区分 */
		public static final String $o_ship_rqst_id_typ = "ship_rqst_id_typ";
		/** OUT:出荷依頼先識別区分名 */
		public static final String $o_ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
		/** OUT:国ＣＤ */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
		/** OUT:物流グループＣＤ */
		public static final String $o_lg_grp_cd = "lg_grp_cd";
		/** OUT:物流グループ名 */
		public static final String $o_lg_grp_nm = "lg_grp_nm";
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
		/** OUT:出荷依頼先部署 */
		public static final String $o_ship_rqst_cntct_dpt = "ship_rqst_cntct_dpt";
		/** OUT:出荷依頼先担当者 */
		public static final String $o_ship_rqst_cntct_psn = "ship_rqst_cntct_psn";
		/** VIEW:出荷依頼先識別ＣＤ */
		public static final String $v_ship_rqst_id_cd = $o_ship_rqst_id_cd;
		/** VIEW_NO:出荷依頼先識別ＣＤ */
		protected static final MCNumber $vn_ship_rqst_id_cd = new MCNumber(10);
		/** VIEW:出荷依頼先識別名 */
		public static final String $v_ship_rqst_id_nm = $o_ship_rqst_id_nm;
		/** VIEW_NO:出荷依頼先識別名 */
		protected static final MCNumber $vn_ship_rqst_id_nm = new MCNumber(20);
		/** SORT:出荷依頼先識別ＣＤ */
		public static final String $s_ship_rqst_id_cd = $o_ship_rqst_id_cd;
		/** SORT_NO:出荷依頼先識別ＣＤ */
		protected static final MCNumber $sn_ship_rqst_id_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBEL0109";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1080";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_ship_rqst_id_cd);
					add($o_ship_rqst_id_nm);
					add($o_ship_rqst_id_alt_nm1);
					add($o_ship_rqst_id_alt_nm2);
					add($o_ship_rqst_id_alt_nm3);
					add($o_ship_rqst_id_alt_nm4);
					add($o_ship_rqst_id_typ);
					add($o_ship_rqst_id_typ_nm);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_ship_rqst_cntct_dpt);
					add($o_ship_rqst_cntct_psn);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_ship_rqst_id_cd, $v_ship_rqst_id_cd);
					put($vn_ship_rqst_id_nm, $v_ship_rqst_id_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_ship_rqst_id_cd, $s_ship_rqst_id_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ShipRqstIdCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ShipRqstIdCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ShipRqstIdCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ShipRqstIdCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ShipRqstIdCols extends MSUAC_List.ShipRqstIdCols_MC_A {
		//EIクラス
	}

}
