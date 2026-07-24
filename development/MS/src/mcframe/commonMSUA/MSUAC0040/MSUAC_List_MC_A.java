package mcframe.commonMSUA.MSUAC0040;
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
	  * ItmDtlMfgLoc:カラム名クラス
	  */
	protected static class ItmDtlMfgLocCols_MC_A  {
		/** IN:マスタ適用日 */
		public static final String $i_master_dt = "master_dt";
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
		/** IN:更新可能ＦＬＧ */
		public static final String $i_wr_flg = "wr_flg";
		/** IN:製造ＦＬＧ */
		public static final String $i_mfg_flg = "mfg_flg";
		/** IN:外注ＦＬＧ */
		public static final String $i_outsrc_flg = "outsrc_flg";
		/** IN:NULL文字使用フラグ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:製造場所棚・ライン対象 */
		public static final String $o_mfg_str_ln_tgt_flg = "mfg_str_ln_tgt_flg";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_mfg_loc_wg_cd = "mfg_loc_wg_cd";
		/** OUT:ワーキンググループ名 */
		public static final String $o_mfg_loc_wg_nm = "mfg_loc_wg_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_mfg_loc_site_cd = "mfg_loc_site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_mfg_loc_site_nm = "mfg_loc_site_nm";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:購買識別区分 */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** VIEW:製造場所ＣＤ */
		public static final String $v_mfg_loc_cd = $o_mfg_loc_cd;
		/** VIEW_NO:製造場所ＣＤ */
		protected static final MCNumber $vn_mfg_loc_cd = new MCNumber(10);
		/** VIEW:製造場所名 */
		public static final String $v_mfg_loc_nm = $o_mfg_loc_nm;
		/** VIEW_NO:製造場所名 */
		protected static final MCNumber $vn_mfg_loc_nm = new MCNumber(20);
		/** SORT:製造場所ＣＤ */
		public static final String $s_mfg_loc_cd = $o_mfg_loc_cd;
		/** SORT_NO:製造場所ＣＤ */
		protected static final MCNumber $sn_mfg_loc_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_mfg_str_ln_tgt_flg);
					add($o_mfg_loc_wg_cd);
					add($o_mfg_loc_wg_nm);
					add($o_mfg_loc_site_cd);
					add($o_mfg_loc_site_nm);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_mfg_inst_unit_typ);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_purc_id_typ);
					add($o_purc_basis_typ);
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_loc_cd, $v_mfg_loc_cd);
					put($vn_mfg_loc_nm, $v_mfg_loc_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_loc_cd, $s_mfg_loc_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlMfgLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlMfgLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlMfgLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlMfgLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlMfgLocCols extends MSUAC_List.ItmDtlMfgLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlBomPtn:カラム名クラス
	  */
	protected static class ItmDtlBomPtnCols_MC_A  {
		/** IN:マスタ適用日（必須） */
		public static final String $i_dt = "dt";
		/** IN:品目ＣＤ（必須） */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１（必須） */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２（必須） */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３（必須） */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:ワーキンググループＣＤ（必須） */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:製造場所ＣＤ（必須） */
		public static final String $i_mfg_loc_cd = "mfg_loc_cd";
		/** IN:発注先ＣＤ（必須） */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:メーカＣＤ（必須） */
		public static final String $i_maker_cd = "maker_cd";
		/** IN:依頼先場所ＣＤ（必須） */
		public static final String $i_rqst_loc_cd = "rqst_loc_cd";
		/** IN:マスタ適用日任意ＦＬＧ
オンの場合、マスタ適用日を任意項目として扱う。任意にすると適用日違いで同じ構成パタンが取得されることになるが、その重複分については呼び出し元で対応すること。 */
		public static final String $i_dt_opt_flg = "dt_opt_flg";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:依頼先ワーキンググループ名 */
		public static final String $o_rqst_wg_nm = "rqst_wg_nm";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:製造リードタイム */
		public static final String $o_mfg_lt = "mfg_lt";
		/** OUT:購入リードタイム */
		public static final String $o_purc_lt = "purc_lt";
		/** OUT:検収リードタイム */
		public static final String $o_accpt_insp_lt = "accpt_insp_lt";
		/** OUT:安全リードタイム */
		public static final String $o_buf_lt = "buf_lt";
		/** OUT:出来高予定数量 */
		public static final String $o_yield_schd_qty = "yield_schd_qty";
		/** OUT:製造指図数量 */
		public static final String $o_mfg_inst_qty = "mfg_inst_qty";
		/** OUT:固定必要数量 */
		public static final String $o_fxd_rqmt_qty = "fxd_rqmt_qty";
		/** OUT:ロット発番タイミング区分 */
		public static final String $o_lot_issue_typ = "lot_issue_typ";
		/** OUT:棚・ライン格納 */
		public static final String $o_ln_stk_flg = "ln_stk_flg";
		/** OUT:製造指図時記録書発行 */
		public static final String $o_inst_rec_issue_flg = "inst_rec_issue_flg";
		/** OUT:製造承認対象外 */
		public static final String $o_no_mfg_aprv_flg = "no_mfg_aprv_flg";
		/** OUT:品目下限収率 */
		public static final String $o_itm_lower_yield = "itm_lower_yield";
		/** OUT:品目標準収率 */
		public static final String $o_itm_std_yield = "itm_std_yield";
		/** OUT:品目上限収率 */
		public static final String $o_itm_upper_yield = "itm_upper_yield";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:投入品追加許可ＦＬＧ */
		public static final String $o_inpt_itm_add_flg = "inpt_itm_add_flg";
		/** OUT:投入品削除許可ＦＬＧ */
		public static final String $o_inpt_itm_del_flg = "inpt_itm_del_flg";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:製造場所ＣＤ（存在チェック用） */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:発注先ＣＤ（存在チェック用） */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:メーカＣＤ（存在チェック用） */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:依頼先場所ＣＤ（存在チェック用） */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:適用開始日（存在チェック用） */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日（存在チェック用） */
		public static final String $o_end_dt = "end_dt";
		/** OUT:購買識別区分 */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** VIEW:構成パタン */
		public static final String $v_bom_ptn = $o_bom_ptn;
		/** VIEW_NO:構成パタン */
		protected static final MCNumber $vn_bom_ptn = new MCNumber(10);
		/** SORT:構成パタン */
		public static final String $s_bom_ptn = $o_bom_ptn;
		/** SORT_NO:構成パタン */
		protected static final MCNumber $sn_bom_ptn = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSUAL0006";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "dt,itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd,mfg_loc_cd,sppl_cd,maker_cd,rqst_loc_cd";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bom_ptn);
					add($o_rqst_wg_cd);
					add($o_rqst_wg_nm);
					add($o_oper_ptn);
					add($o_mfg_lt);
					add($o_purc_lt);
					add($o_accpt_insp_lt);
					add($o_buf_lt);
					add($o_yield_schd_qty);
					add($o_mfg_inst_qty);
					add($o_fxd_rqmt_qty);
					add($o_lot_issue_typ);
					add($o_ln_stk_flg);
					add($o_inst_rec_issue_flg);
					add($o_no_mfg_aprv_flg);
					add($o_itm_lower_yield);
					add($o_itm_std_yield);
					add($o_itm_upper_yield);
					add($o_mfg_inst_unit_typ);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_wg_cd);
					add($o_mfg_loc_cd);
					add($o_sppl_cd);
					add($o_maker_cd);
					add($o_rqst_loc_cd);
					add($o_st_dt);
					add($o_end_dt);
					add($o_purc_id_typ);
					add($o_purc_basis_typ);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlBomPtnCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlBomPtnCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlBomPtnCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlBomPtnCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlBomPtnCols extends MSUAC_List.ItmDtlBomPtnCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlRqstLoc:カラム名クラス
	  */
	protected static class ItmDtlRqstLocCols_MC_A  {
		/** IN:マスタ適用日 */
		public static final String $i_master_dt = "master_dt";
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
		/** IN:格納場所ＣＤ */
		public static final String $i_strg_loc_cd = "strg_loc_cd";
		/** IN:オーダ区分 */
		public static final String $i_itm_ord_typ = "itm_ord_typ";
		/** IN:NULL文字使用フラグ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:依頼先ワーキンググループ名 */
		public static final String $o_rqst_wg_nm = "rqst_wg_nm";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
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
		/** VIEW:依頼先場所ＣＤ */
		public static final String $v_rqst_loc_cd = $o_rqst_loc_cd;
		/** VIEW_NO:依頼先場所ＣＤ */
		protected static final MCNumber $vn_rqst_loc_cd = new MCNumber(10);
		/** VIEW:依頼先場所名 */
		public static final String $v_rqst_loc_nm = $o_rqst_loc_nm;
		/** VIEW_NO:依頼先場所名 */
		protected static final MCNumber $vn_rqst_loc_nm = new MCNumber(20);
		/** SORT:依頼先場所ＣＤ */
		public static final String $s_rqst_loc_cd = $o_rqst_loc_cd;
		/** SORT_NO:依頼先場所ＣＤ */
		protected static final MCNumber $sn_rqst_loc_cd = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_rqst_wg_cd);
					add($o_rqst_wg_nm);
					add($o_str_ln_tgt_flg);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_rqst_loc_cd, $v_rqst_loc_cd);
					put($vn_rqst_loc_nm, $v_rqst_loc_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_rqst_loc_cd, $s_rqst_loc_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlRqstLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlRqstLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlRqstLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlRqstLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlRqstLocCols extends MSUAC_List.ItmDtlRqstLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * DivSeq:カラム名クラス
	  */
	protected static class DivSeqCols_MC_A  {
		/** IN:製造指図ＮＯ */
		public static final String $i_mfg_inst_no = "mfg_inst_no";
		/** OUT:分割連番 */
		public static final String $o_div_seq = "div_seq";
		/** OUT:納入希望日時 */
		public static final String $o_mi_rqst_dlv_rqst_tm = "mi_rqst_dlv_rqst_tm";
		/** OUT:品目コード */
		public static final String $o_imi_itm_cd = "imi_itm_cd";
		/** OUT:枝番１ */
		public static final String $o_imi_itm_sub1 = "imi_itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_imi_itm_sub2 = "imi_itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_imi_itm_sub3 = "imi_itm_sub3";
		/** OUT:品名 */
		public static final String $o_imi_itm_nm = "imi_itm_nm";
		/** OUT:ロットＮＯ */
		public static final String $o_imi_lot_no = "imi_lot_no";
		/** OUT:サブロットＮＯ */
		public static final String $o_imi_sublot_no = "imi_sublot_no";
		/** OUT:手配ＮＯ１ */
		public static final String $o_imi_sno1 = "imi_sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_imi_sno2 = "imi_sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_imi_sno3 = "imi_sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_imi_sno4 = "imi_sno4";
		/** OUT:案件ＮＯ */
		public static final String $o_imi_wrk_no = "imi_wrk_no";
		/** OUT:案件名 */
		public static final String $o_imi_wrk_nm = "imi_wrk_nm";
		/** OUT:基準単位ＣＤ */
		public static final String $o_imi_base_unit_cd = "imi_base_unit_cd";
		/** OUT:基準単位名 */
		public static final String $o_imi_base_unit_nm = "imi_base_unit_nm";
		/** OUT:製造場所ＣＤ */
		public static final String $o_imi_mfg_loc_cd = "imi_mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_imi_mfg_loc_nm = "imi_mfg_loc_nm";
		/** OUT:製造棚・ラインＣＤ */
		public static final String $o_imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
		/** OUT:製造棚・ライン名 */
		public static final String $o_imi_mfg_str_ln_nm = "imi_mfg_str_ln_nm";
		/** OUT:外注先ＣＤ */
		public static final String $o_imi_sppl_cd = "imi_sppl_cd";
		/** OUT:外注先名 */
		public static final String $o_imi_sppl_nm = "imi_sppl_nm";
		/** OUT:発注明細ＮＯ */
		public static final String $o_mi_po_d_no = "mi_po_d_no";
		/** OUT:製造着手予定日時 */
		public static final String $o_mi_st_schd_tm = "mi_st_schd_tm";
		/** OUT:製造終了予定日時 */
		public static final String $o_mi_end_schd_tm = "mi_end_schd_tm";
		/** OUT:製造着手実績日時 */
		public static final String $o_ma_st_act_tm = "ma_st_act_tm";
		/** OUT:製造終了実績日時 */
		public static final String $o_ma_end_act_tm = "ma_end_act_tm";
		/** OUT:指図数量 */
		public static final String $o_mi_base_unit_inst_qty = "mi_base_unit_inst_qty";
		/** OUT:良品数量 */
		public static final String $o_ma_base_unit_yield_qty = "ma_base_unit_yield_qty";
		/** OUT:不良品数量 */
		public static final String $o_ma_base_unit_dfct_qty = "ma_base_unit_dfct_qty";
		/** VIEW:分割連番 */
		public static final String $v_div_seq = $o_div_seq;
		/** VIEW_NO:分割連番 */
		protected static final MCNumber $vn_div_seq = new MCNumber(10);
		/** SORT:分割連番 */
		public static final String $s_div_seq = $o_div_seq;
		/** SORT_NO:分割連番 */
		protected static final MCNumber $sn_div_seq = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_div_seq);
					add($o_mi_rqst_dlv_rqst_tm);
					add($o_imi_itm_cd);
					add($o_imi_itm_sub1);
					add($o_imi_itm_sub2);
					add($o_imi_itm_sub3);
					add($o_imi_itm_nm);
					add($o_imi_lot_no);
					add($o_imi_sublot_no);
					add($o_imi_sno1);
					add($o_imi_sno2);
					add($o_imi_sno3);
					add($o_imi_sno4);
					add($o_imi_wrk_no);
					add($o_imi_wrk_nm);
					add($o_imi_base_unit_cd);
					add($o_imi_base_unit_nm);
					add($o_imi_mfg_loc_cd);
					add($o_imi_mfg_loc_nm);
					add($o_imi_mfg_str_ln_cd);
					add($o_imi_mfg_str_ln_nm);
					add($o_imi_sppl_cd);
					add($o_imi_sppl_nm);
					add($o_mi_po_d_no);
					add($o_mi_st_schd_tm);
					add($o_mi_end_schd_tm);
					add($o_ma_st_act_tm);
					add($o_ma_end_act_tm);
					add($o_mi_base_unit_inst_qty);
					add($o_ma_base_unit_yield_qty);
					add($o_ma_base_unit_dfct_qty);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_div_seq, $v_div_seq);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_div_seq, $s_div_seq, ASC);
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
		public static final String[] outAll(){return MSUAC_List.DivSeqCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.DivSeqCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.DivSeqCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.DivSeqCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class DivSeqCols extends MSUAC_List.DivSeqCols_MC_A {
		//EIクラス
	}


	/** 
	  * MpsItmGrp:カラム名クラス
	  */
	protected static class MpsItmGrpCols_MC_A  {
		/** IN:品目ＣＤ（必須） */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１（必須） */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２（必須） */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３（必須） */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:ワーキンググループＣＤ（必須） */
		public static final String $i_wg_cd = "wg_cd";
		/** OUT:ＭＰＳグループＣＤ */
		public static final String $o_mps_grp_cd = "mps_grp_cd";
		/** OUT:ＭＰＳグループ名 */
		public static final String $o_mps_grp_nm = "mps_grp_nm";
		/** OUT:格納場所ＣＤ */
		public static final String $o_strg_loc_cd = "strg_loc_cd";
		/** OUT:格納場所名 */
		public static final String $o_strg_loc_nm = "strg_loc_nm";
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:ワーキンググループＣＤ（存在チェック用） */
		public static final String $o_wg_cd = "wg_cd";
		/** VIEW:ＭＰＳグループＣＤ */
		public static final String $v_mps_grp_cd = $o_mps_grp_cd;
		/** VIEW_NO:ＭＰＳグループＣＤ */
		protected static final MCNumber $vn_mps_grp_cd = new MCNumber(10);
		/** VIEW:ＭＰＳグループ名 */
		public static final String $v_mps_grp_nm = $o_mps_grp_nm;
		/** VIEW_NO:ＭＰＳグループ名 */
		protected static final MCNumber $vn_mps_grp_nm = new MCNumber(20);
		/** SORT:ＭＰＳグループＣＤ */
		public static final String $s_mps_grp_cd = $o_mps_grp_cd;
		/** SORT_NO:ＭＰＳグループＣＤ */
		protected static final MCNumber $sn_mps_grp_cd = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBCL0084";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "itm_cd,itm_sub1,itm_sub2,itm_sub3,wg_cd";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mps_grp_cd);
					add($o_mps_grp_nm);
					add($o_strg_loc_cd);
					add($o_strg_loc_nm);
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_wg_cd);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mps_grp_cd, $v_mps_grp_cd);
					put($vn_mps_grp_nm, $v_mps_grp_nm);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mps_grp_cd, $s_mps_grp_cd, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MpsItmGrpCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MpsItmGrpCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MpsItmGrpCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MpsItmGrpCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MpsItmGrpCols extends MSUAC_List.MpsItmGrpCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmOperLoc:カラム名クラス
	  */
	protected static class ItmOperLocCols_MC_A  {
		/** IN:品目ＣＤ（必須） */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１（必須） */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２（必須） */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３（必須） */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:工程パタン（必須） */
		public static final String $i_oper_ptn = "oper_ptn";
		/** IN:工程ＣＤ（必須） */
		public static final String $i_oper_cd = "oper_cd";
		/** IN:工程連番（必須） */
		public static final String $i_oper_seq = "oper_seq";
		/** IN:適用日（必須） */
		public static final String $i_dt = "dt";
		/** OUT:場所ＣＤ */
		public static final String $o_loc_cd = "loc_cd";
		/** OUT:工順 */
		public static final String $o_disp_seq = "disp_seq";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:品目ＣＤ（存在チェック用） */
		public static final String $o_itm_cd = "itm_cd";
		/** OUT:枝番１（存在チェック用） */
		public static final String $o_itm_sub1 = "itm_sub1";
		/** OUT:枝番２（存在チェック用） */
		public static final String $o_itm_sub2 = "itm_sub2";
		/** OUT:枝番３（存在チェック用） */
		public static final String $o_itm_sub3 = "itm_sub3";
		/** OUT:工程パタン（存在チェック用） */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:工程ＣＤ（存在チェック用） */
		public static final String $o_oper_cd = "oper_cd";
		/** OUT:工程連番（存在チェック用） */
		public static final String $o_oper_seq = "oper_seq";
		/** OUT:適用開始日（存在チェック用） */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日（存在チェック用） */
		public static final String $o_end_dt = "end_dt";
		/** VIEW:場所ＣＤ */
		public static final String $v_loc_cd = $o_loc_cd;
		/** VIEW_NO:場所ＣＤ */
		protected static final MCNumber $vn_loc_cd = new MCNumber(10);
		/** VIEW:工順 */
		public static final String $v_disp_seq = $o_disp_seq;
		/** VIEW_NO:工順 */
		protected static final MCNumber $vn_disp_seq = new MCNumber(20);
		/** VIEW:ワーキンググループＣＤ */
		public static final String $v_wg_cd = $o_wg_cd;
		/** VIEW_NO:ワーキンググループＣＤ */
		protected static final MCNumber $vn_wg_cd = new MCNumber(30);
		/** SORT:場所ＣＤ */
		public static final String $s_loc_cd = $o_loc_cd;
		/** SORT_NO:場所ＣＤ */
		protected static final MCNumber $sn_loc_cd = new MCNumber(10);
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り */
		public static final String $k_oth_key = "itm_cd,itm_sub1,itm_sub2,itm_sub3,oper_ptn,oper_cd,oper_seq,dt";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_loc_cd);
					add($o_disp_seq);
					add($o_wg_cd);
					add($o_itm_cd);
					add($o_itm_sub1);
					add($o_itm_sub2);
					add($o_itm_sub3);
					add($o_oper_ptn);
					add($o_oper_cd);
					add($o_oper_seq);
					add($o_st_dt);
					add($o_end_dt);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_loc_cd, $v_loc_cd);
					put($vn_disp_seq, $v_disp_seq);
					put($vn_wg_cd, $v_wg_cd);
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
		public static final String[] outAll(){return MSUAC_List.ItmOperLocCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmOperLocCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmOperLocCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmOperLocCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmOperLocCols extends MSUAC_List.ItmOperLocCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlSub1WithSpplMaker:カラム名クラス
	  */
	protected static class ItmDtlSub1WithSpplMakerCols_MC_A  {
		/** IN:製造ＦＬＧ */
		public static final String $i_mfg_flg = "mfg_flg";
		/** IN:購買ＦＬＧ */
		public static final String $i_purc_flg = "purc_flg";
		/** IN:外注ＦＬＧ */
		public static final String $i_outsrc_flg = "outsrc_flg";
		/** IN:ＷＧ間移送ＦＬＧ */
		public static final String $i_wg_xfr_flg = "wg_xfr_flg";
		/** IN:適用日（必須） */
		public static final String $i_dt = "dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:製造場所ＣＤ */
		public static final String $i_mfg_loc_cd = "mfg_loc_cd";
		/** IN:依頼先場所ＣＤ */
		public static final String $i_rqst_loc_cd = "rqst_loc_cd";
		/** IN:発注先ＣＤ */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:ワーキンググループＣＤ */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:発注先取得ＦＬＧ */
		public static final String $i_get_sppl_flg = "get_sppl_flg";
		/** IN:メーカ取得ＦＬＧ */
		public static final String $i_get_maker_flg = "get_maker_flg";
		/** IN:マスタ適用日２
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_dt2 = "dt2";
		/** IN:外注先含む
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
		/** IN:マニュアル発注ＦＬＧ
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
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
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
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
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
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
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
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
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
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
		/** OUT:購買納品書対象ＦＬＧ */
		public static final String $o_purc_dlv_slip_flg = "purc_dlv_slip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:サムネイル画像 */
		public static final String $o_th_image = "th_image";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:ワーキンググループ名 */
		public static final String $o_wg_nm = "wg_nm";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
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
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:製造ＬＴ */
		public static final String $o_mfg_lt = "mfg_lt";
		/** OUT:製造ＬＴ加算基準数量 */
		public static final String $o_mfg_lt_add_qty = "mfg_lt_add_qty";
		/** OUT:購入ＬＴ */
		public static final String $o_purc_lt = "purc_lt";
		/** OUT:購入ＬＴ加算基準数量 */
		public static final String $o_purc_lt_add_qty = "purc_lt_add_qty";
		/** OUT:検収ＬＴ */
		public static final String $o_accpt_insp_lt = "accpt_insp_lt";
		/** OUT:安全ＬＴ */
		public static final String $o_buf_lt = "buf_lt";
		/** OUT:オーダ自動確定期間（日） */
		public static final String $o_ord_fix_pd = "ord_fix_pd";
		/** OUT:曜日まとめ区分 */
		public static final String $o_sz_day_week_typ = "sz_day_week_typ";
		/** OUT:曜日まとめ期間（週） */
		public static final String $o_sz_week = "sz_week";
		/** OUT:ロットまとめ期間（日） */
		public static final String $o_lot_sz_pd = "lot_sz_pd";
		/** OUT:最小ロット数量 */
		public static final String $o_min_lot_qty = "min_lot_qty";
		/** OUT:刻みロット数量 */
		public static final String $o_batch_lot_qty = "batch_lot_qty";
		/** OUT:最大ロット数量 */
		public static final String $o_max_lot_qty = "max_lot_qty";
		/** OUT:最大オーダ数量 */
		public static final String $o_max_order = "max_order";
		/** OUT:優先順 */
		public static final String $o_prio = "prio";
		/** OUT:オーダ比率 */
		public static final String $o_order_ratio = "order_ratio";
		/** OUT:出来高予定数量 */
		public static final String $o_yield_schd_qty = "yield_schd_qty";
		/** OUT:製造指図数量 */
		public static final String $o_mfg_inst_qty = "mfg_inst_qty";
		/** OUT:固定必要数量 */
		public static final String $o_fxd_rqmt_qty = "fxd_rqmt_qty";
		/** OUT:ロット発番タイミング区分 */
		public static final String $o_lot_issue_typ = "lot_issue_typ";
		/** OUT:バックフラッシュ許可ＦＬＧ */
		public static final String $o_bkf_flg = "bkf_flg";
		/** OUT:棚・ライン格納ＦＬＧ */
		public static final String $o_ln_stk_flg = "ln_stk_flg";
		/** OUT:先行手配対象ＦＬＧ */
		public static final String $o_pre_po_tgt_flg = "pre_po_tgt_flg";
		/** OUT:製造指図時記録書発行ＦＬＧ */
		public static final String $o_inst_rec_issue_flg = "inst_rec_issue_flg";
		/** OUT:製造承認対象外ＦＬＧ */
		public static final String $o_no_mfg_aprv_flg = "no_mfg_aprv_flg";
		/** OUT:品目下限収率 */
		public static final String $o_itm_lower_yield = "itm_lower_yield";
		/** OUT:品目標準収率 */
		public static final String $o_itm_std_yield = "itm_std_yield";
		/** OUT:品目上限収率 */
		public static final String $o_itm_upper_yield = "itm_upper_yield";
		/** OUT:購買識別区分
メーカ取得フラグがオンの場合、メーカ（品目詳細）で取得した値が設定される */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:資源標準値１ */
		public static final String $o_rsrc_std_qty1 = "rsrc_std_qty1";
		/** OUT:資源単位数量１ */
		public static final String $o_rsrc_unit_qty1 = "rsrc_unit_qty1";
		/** OUT:資源標準値２ */
		public static final String $o_rsrc_std_qty2 = "rsrc_std_qty2";
		/** OUT:資源単位数量２ */
		public static final String $o_rsrc_unit_qty2 = "rsrc_unit_qty2";
		/** OUT:手配ＮＯ１ */
		public static final String $o_sno1 = "sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_sno2 = "sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_sno3 = "sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_sno4 = "sno4";
		/** OUT:ＭＲＰ対象外ＦＬＧ */
		public static final String $o_not_mrp_flg = "not_mrp_flg";
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
		/** OUT:仕入税ＣＤ */
		public static final String $o_purc_tax_cd = "purc_tax_cd";
		/** OUT:支給税ＣＤ */
		public static final String $o_prov_tax_cd = "prov_tax_cd";
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
		/** OUT:通貨ＣＤ */
		public static final String $o_cur_cd = "cur_cd";
		/** OUT:通貨名 */
		public static final String $o_cur_nm = "cur_nm";
		/** OUT:国 */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:国外 */
		public static final String $o_foreign_flg = "foreign_flg";
		/** OUT:地域 */
		public static final String $o_area_cd = "area_cd";
		/** OUT:地域名 */
		public static final String $o_area_nm = "area_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
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
		/** OUT:管轄区分 */
		public static final String $o_loc_mng_typ = "loc_mng_typ";
		/** OUT:管轄区分名 */
		public static final String $o_loc_mng_typ_nm = "loc_mng_typ_nm";
		/** OUT:資産管理部門ＣＤ */
		public static final String $o_asst_dpt_cd = "asst_dpt_cd";
		/** OUT:売上部門ＣＤ */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:物流標準場所ＦＬＧ */
		public static final String $o_lg_def_flg = "lg_def_flg";
		/** OUT:外注実績先行ＦＬＧ */
		public static final String $o_pre_outsrc_act_flg = "pre_outsrc_act_flg";
		/** OUT:直送支給検査ＦＬＧ */
		public static final String $o_ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
		/** OUT:場所カレンダＣＤ */
		public static final String $o_loc_cal_cd = "loc_cal_cd";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:引当限定ＦＬＧ */
		public static final String $o_alloc_lmt_flg = "alloc_lmt_flg";
		/** OUT:出庫時荷姿振替ＦＬＧ */
		public static final String $o_gi_pack_xfer_flg = "gi_pack_xfer_flg";
		/** OUT:出庫時ＶＭＩ計上ＦＬＧ */
		public static final String $o_gi_vmi_flg = "gi_vmi_flg";
		/** OUT:資源ＣＤ１ */
		public static final String $o_rsrc_cd1 = "rsrc_cd1";
		/** OUT:資源ＣＤ２ */
		public static final String $o_rsrc_cd2 = "rsrc_cd2";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:買掛先ＣＤ */
		public static final String $o_asppl_cd = "asppl_cd";
		/** OUT:ＶＭＩ購買部門ＣＤ */
		public static final String $o_vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
		/** OUT:下請対象ＦＬＧ */
		public static final String $o_subcon_flg = "subcon_flg";
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:発注先担当者敬称 */
		public static final String $o_sppl_cntct_psn_title = "sppl_cntct_psn_title";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税額端数処理区分 */
		public static final String $o_purc_tax_rnd_typ = "purc_tax_rnd_typ";
		/** OUT:仕入税計算区分 */
		public static final String $o_purc_tax_calc_typ = "purc_tax_calc_typ";
		/** OUT:案件別注文書ＦＬＧ */
		public static final String $o_wrk_po_flg = "wrk_po_flg";
		/** OUT:案件別債務管理ＦＬＧ */
		public static final String $o_wrk_ap_flg = "wrk_ap_flg";
		/** OUT:支給積送管理区分 */
		public static final String $o_prov_rcv_typ = "prov_rcv_typ";
		/** OUT:有償支給先ＦＬＧ */
		public static final String $o_onr_prsppl_flg = "onr_prsppl_flg";
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税額端数処理区分 */
		public static final String $o_prov_tax_rnd_typ = "prov_tax_rnd_typ";
		/** OUT:支給税計算区分 */
		public static final String $o_prov_tax_calc_typ = "prov_tax_calc_typ";
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
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:金額小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_amt_dec_place = "amt_dec_place";
		/** OUT:単価小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_upri_dec_place = "upri_dec_place";
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:購買単価変更許可ＦＬＧ（発注先） */
		public static final String $o_sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** VIEW:枝番１ */
		public static final String $v_itm_sub1 = $o_itm_sub1;
		/** VIEW_NO:枝番１ */
		protected static final MCNumber $vn_itm_sub1 = new MCNumber(10);
		/** SORT:枝番１ */
		public static final String $s_itm_sub1 = $o_itm_sub1;
		/** SORT_NO:枝番１ */
		protected static final MCNumber $sn_itm_sub1 = new MCNumber(10);
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
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_wtax_rate);
					add($o_ship_unit_cd);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_no_typ);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_no_typ);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_flg);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_ptn_cd);
					add($o_cntry_org_cd);
					add($o_comp_spec_typ);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_purc_dlv_slip_flg);
					add($o_ship_term_cd);
					add($o_exim_xpns_typ);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_th_image);
					add($o_mrp_opn_xfr_days);
					add($o_wg_cd);
					add($o_wg_nm);
					add($o_mfg_inst_unit_typ);
					add($o_mrp_proc_typ);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_bom_ptn);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_st_dt);
					add($o_end_dt);
					add($o_oper_ptn);
					add($o_mfg_lt);
					add($o_mfg_lt_add_qty);
					add($o_purc_lt);
					add($o_purc_lt_add_qty);
					add($o_accpt_insp_lt);
					add($o_buf_lt);
					add($o_ord_fix_pd);
					add($o_sz_day_week_typ);
					add($o_sz_week);
					add($o_lot_sz_pd);
					add($o_min_lot_qty);
					add($o_batch_lot_qty);
					add($o_max_lot_qty);
					add($o_max_order);
					add($o_prio);
					add($o_order_ratio);
					add($o_yield_schd_qty);
					add($o_mfg_inst_qty);
					add($o_fxd_rqmt_qty);
					add($o_lot_issue_typ);
					add($o_bkf_flg);
					add($o_ln_stk_flg);
					add($o_pre_po_tgt_flg);
					add($o_inst_rec_issue_flg);
					add($o_no_mfg_aprv_flg);
					add($o_itm_lower_yield);
					add($o_itm_std_yield);
					add($o_itm_upper_yield);
					add($o_purc_id_typ);
					add($o_rqst_wg_cd);
					add($o_rsrc_std_qty1);
					add($o_rsrc_unit_qty1);
					add($o_rsrc_std_qty2);
					add($o_rsrc_unit_qty2);
					add($o_sno1);
					add($o_sno2);
					add($o_sno3);
					add($o_sno4);
					add($o_not_mrp_flg);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_purc_tax_cd);
					add($o_prov_tax_cd);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_cur_cd);
					add($o_cur_nm);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_foreign_flg);
					add($o_area_cd);
					add($o_area_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
					add($o_loc_mng_typ);
					add($o_loc_mng_typ_nm);
					add($o_asst_dpt_cd);
					add($o_sls_dpt_cd);
					add($o_lg_def_flg);
					add($o_pre_outsrc_act_flg);
					add($o_ddlv_prov_insp_flg);
					add($o_loc_cal_cd);
					add($o_str_ln_tgt_flg);
					add($o_alloc_lmt_flg);
					add($o_gi_pack_xfer_flg);
					add($o_gi_vmi_flg);
					add($o_rsrc_cd1);
					add($o_rsrc_cd2);
					add($o_prnt_lcl_cd);
					add($o_asppl_cd);
					add($o_vmi_purc_dpt_cd);
					add($o_subcon_flg);
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_sppl_cntct_psn_title);
					add($o_purc_upri_req_typ);
					add($o_purc_amt_rnd_typ);
					add($o_purc_tax_rnd_typ);
					add($o_purc_tax_calc_typ);
					add($o_wrk_po_flg);
					add($o_wrk_ap_flg);
					add($o_prov_rcv_typ);
					add($o_onr_prsppl_flg);
					add($o_prov_basis_typ);
					add($o_prov_amt_rnd_typ);
					add($o_prov_tax_rnd_typ);
					add($o_prov_tax_calc_typ);
					add($o_sppl_cal_cd);
					add($o_sppl_iv_flg);
					add($o_prms_recv_flg);
					add($o_sppl_tterm_cd1);
					add($o_sppl_tterm_cd2);
					add($o_sppl_tterm_cd3);
					add($o_purc_basis_typ);
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_amt_dec_place);
					add($o_upri_dec_place);
					add($o_ap_dpt_cd);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_sppl_purc_upri_cng_flg);
					add($o_edi_po_send_tgt_flg);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlSub1WithSpplMakerCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlSub1WithSpplMakerCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlSub1WithSpplMakerCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlSub1WithSpplMakerCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlSub1WithSpplMakerCols extends MSUAC_List.ItmDtlSub1WithSpplMakerCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlSub2WithSpplMaker:カラム名クラス
	  */
	protected static class ItmDtlSub2WithSpplMakerCols_MC_A  {
		/** IN:製造ＦＬＧ */
		public static final String $i_mfg_flg = "mfg_flg";
		/** IN:購買ＦＬＧ */
		public static final String $i_purc_flg = "purc_flg";
		/** IN:外注ＦＬＧ */
		public static final String $i_outsrc_flg = "outsrc_flg";
		/** IN:ＷＧ間移送ＦＬＧ */
		public static final String $i_wg_xfr_flg = "wg_xfr_flg";
		/** IN:適用日（必須） */
		public static final String $i_dt = "dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:製造場所ＣＤ */
		public static final String $i_mfg_loc_cd = "mfg_loc_cd";
		/** IN:依頼先場所ＣＤ */
		public static final String $i_rqst_loc_cd = "rqst_loc_cd";
		/** IN:発注先ＣＤ */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:ワーキンググループＣＤ */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:発注先取得ＦＬＧ */
		public static final String $i_get_sppl_flg = "get_sppl_flg";
		/** IN:メーカ取得ＦＬＧ */
		public static final String $i_get_maker_flg = "get_maker_flg";
		/** IN:マスタ適用日２
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_dt2 = "dt2";
		/** IN:外注先含む
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
		/** IN:マニュアル発注ＦＬＧ
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
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
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
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
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
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
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
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
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
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
		/** OUT:購買納品書対象ＦＬＧ */
		public static final String $o_purc_dlv_slip_flg = "purc_dlv_slip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:サムネイル画像 */
		public static final String $o_th_image = "th_image";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:ワーキンググループ名 */
		public static final String $o_wg_nm = "wg_nm";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
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
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:製造ＬＴ */
		public static final String $o_mfg_lt = "mfg_lt";
		/** OUT:製造ＬＴ加算基準数量 */
		public static final String $o_mfg_lt_add_qty = "mfg_lt_add_qty";
		/** OUT:購入ＬＴ */
		public static final String $o_purc_lt = "purc_lt";
		/** OUT:購入ＬＴ加算基準数量 */
		public static final String $o_purc_lt_add_qty = "purc_lt_add_qty";
		/** OUT:検収ＬＴ */
		public static final String $o_accpt_insp_lt = "accpt_insp_lt";
		/** OUT:安全ＬＴ */
		public static final String $o_buf_lt = "buf_lt";
		/** OUT:オーダ自動確定期間（日） */
		public static final String $o_ord_fix_pd = "ord_fix_pd";
		/** OUT:曜日まとめ区分 */
		public static final String $o_sz_day_week_typ = "sz_day_week_typ";
		/** OUT:曜日まとめ期間（週） */
		public static final String $o_sz_week = "sz_week";
		/** OUT:ロットまとめ期間（日） */
		public static final String $o_lot_sz_pd = "lot_sz_pd";
		/** OUT:最小ロット数量 */
		public static final String $o_min_lot_qty = "min_lot_qty";
		/** OUT:刻みロット数量 */
		public static final String $o_batch_lot_qty = "batch_lot_qty";
		/** OUT:最大ロット数量 */
		public static final String $o_max_lot_qty = "max_lot_qty";
		/** OUT:最大オーダ数量 */
		public static final String $o_max_order = "max_order";
		/** OUT:優先順 */
		public static final String $o_prio = "prio";
		/** OUT:オーダ比率 */
		public static final String $o_order_ratio = "order_ratio";
		/** OUT:出来高予定数量 */
		public static final String $o_yield_schd_qty = "yield_schd_qty";
		/** OUT:製造指図数量 */
		public static final String $o_mfg_inst_qty = "mfg_inst_qty";
		/** OUT:固定必要数量 */
		public static final String $o_fxd_rqmt_qty = "fxd_rqmt_qty";
		/** OUT:ロット発番タイミング区分 */
		public static final String $o_lot_issue_typ = "lot_issue_typ";
		/** OUT:バックフラッシュ許可ＦＬＧ */
		public static final String $o_bkf_flg = "bkf_flg";
		/** OUT:棚・ライン格納ＦＬＧ */
		public static final String $o_ln_stk_flg = "ln_stk_flg";
		/** OUT:先行手配対象ＦＬＧ */
		public static final String $o_pre_po_tgt_flg = "pre_po_tgt_flg";
		/** OUT:製造指図時記録書発行ＦＬＧ */
		public static final String $o_inst_rec_issue_flg = "inst_rec_issue_flg";
		/** OUT:製造承認対象外ＦＬＧ */
		public static final String $o_no_mfg_aprv_flg = "no_mfg_aprv_flg";
		/** OUT:品目下限収率 */
		public static final String $o_itm_lower_yield = "itm_lower_yield";
		/** OUT:品目標準収率 */
		public static final String $o_itm_std_yield = "itm_std_yield";
		/** OUT:品目上限収率 */
		public static final String $o_itm_upper_yield = "itm_upper_yield";
		/** OUT:購買識別区分
メーカ取得フラグがオンの場合、メーカ（品目詳細）で取得した値が設定される */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:資源標準値１ */
		public static final String $o_rsrc_std_qty1 = "rsrc_std_qty1";
		/** OUT:資源単位数量１ */
		public static final String $o_rsrc_unit_qty1 = "rsrc_unit_qty1";
		/** OUT:資源標準値２ */
		public static final String $o_rsrc_std_qty2 = "rsrc_std_qty2";
		/** OUT:資源単位数量２ */
		public static final String $o_rsrc_unit_qty2 = "rsrc_unit_qty2";
		/** OUT:手配ＮＯ１ */
		public static final String $o_sno1 = "sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_sno2 = "sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_sno3 = "sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_sno4 = "sno4";
		/** OUT:ＭＲＰ対象外ＦＬＧ */
		public static final String $o_not_mrp_flg = "not_mrp_flg";
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
		/** OUT:仕入税ＣＤ */
		public static final String $o_purc_tax_cd = "purc_tax_cd";
		/** OUT:支給税ＣＤ */
		public static final String $o_prov_tax_cd = "prov_tax_cd";
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
		/** OUT:通貨ＣＤ */
		public static final String $o_cur_cd = "cur_cd";
		/** OUT:通貨名 */
		public static final String $o_cur_nm = "cur_nm";
		/** OUT:国 */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:国外 */
		public static final String $o_foreign_flg = "foreign_flg";
		/** OUT:地域 */
		public static final String $o_area_cd = "area_cd";
		/** OUT:地域名 */
		public static final String $o_area_nm = "area_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
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
		/** OUT:管轄区分 */
		public static final String $o_loc_mng_typ = "loc_mng_typ";
		/** OUT:管轄区分名 */
		public static final String $o_loc_mng_typ_nm = "loc_mng_typ_nm";
		/** OUT:資産管理部門ＣＤ */
		public static final String $o_asst_dpt_cd = "asst_dpt_cd";
		/** OUT:売上部門ＣＤ */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:物流標準場所ＦＬＧ */
		public static final String $o_lg_def_flg = "lg_def_flg";
		/** OUT:外注実績先行ＦＬＧ */
		public static final String $o_pre_outsrc_act_flg = "pre_outsrc_act_flg";
		/** OUT:直送支給検査ＦＬＧ */
		public static final String $o_ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
		/** OUT:場所カレンダＣＤ */
		public static final String $o_loc_cal_cd = "loc_cal_cd";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:引当限定ＦＬＧ */
		public static final String $o_alloc_lmt_flg = "alloc_lmt_flg";
		/** OUT:出庫時荷姿振替ＦＬＧ */
		public static final String $o_gi_pack_xfer_flg = "gi_pack_xfer_flg";
		/** OUT:出庫時ＶＭＩ計上ＦＬＧ */
		public static final String $o_gi_vmi_flg = "gi_vmi_flg";
		/** OUT:資源ＣＤ１ */
		public static final String $o_rsrc_cd1 = "rsrc_cd1";
		/** OUT:資源ＣＤ２ */
		public static final String $o_rsrc_cd2 = "rsrc_cd2";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:買掛先ＣＤ */
		public static final String $o_asppl_cd = "asppl_cd";
		/** OUT:ＶＭＩ購買部門ＣＤ */
		public static final String $o_vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
		/** OUT:下請対象ＦＬＧ */
		public static final String $o_subcon_flg = "subcon_flg";
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:発注先担当者敬称 */
		public static final String $o_sppl_cntct_psn_title = "sppl_cntct_psn_title";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税額端数処理区分 */
		public static final String $o_purc_tax_rnd_typ = "purc_tax_rnd_typ";
		/** OUT:仕入税計算区分 */
		public static final String $o_purc_tax_calc_typ = "purc_tax_calc_typ";
		/** OUT:案件別注文書ＦＬＧ */
		public static final String $o_wrk_po_flg = "wrk_po_flg";
		/** OUT:案件別債務管理ＦＬＧ */
		public static final String $o_wrk_ap_flg = "wrk_ap_flg";
		/** OUT:支給積送管理区分 */
		public static final String $o_prov_rcv_typ = "prov_rcv_typ";
		/** OUT:有償支給先ＦＬＧ */
		public static final String $o_onr_prsppl_flg = "onr_prsppl_flg";
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税額端数処理区分 */
		public static final String $o_prov_tax_rnd_typ = "prov_tax_rnd_typ";
		/** OUT:支給税計算区分 */
		public static final String $o_prov_tax_calc_typ = "prov_tax_calc_typ";
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
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:金額小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_amt_dec_place = "amt_dec_place";
		/** OUT:単価小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_upri_dec_place = "upri_dec_place";
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:購買単価変更許可ＦＬＧ（発注先） */
		public static final String $o_sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** VIEW:枝番２ */
		public static final String $v_itm_sub2 = $o_itm_sub2;
		/** VIEW_NO:枝番２ */
		protected static final MCNumber $vn_itm_sub2 = new MCNumber(10);
		/** SORT:枝番２ */
		public static final String $s_itm_sub2 = $o_itm_sub2;
		/** SORT_NO:枝番２ */
		protected static final MCNumber $sn_itm_sub2 = new MCNumber(10);
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
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_wtax_rate);
					add($o_ship_unit_cd);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_no_typ);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_no_typ);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_flg);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_ptn_cd);
					add($o_cntry_org_cd);
					add($o_comp_spec_typ);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_purc_dlv_slip_flg);
					add($o_ship_term_cd);
					add($o_exim_xpns_typ);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_th_image);
					add($o_mrp_opn_xfr_days);
					add($o_wg_cd);
					add($o_wg_nm);
					add($o_mfg_inst_unit_typ);
					add($o_mrp_proc_typ);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_bom_ptn);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_st_dt);
					add($o_end_dt);
					add($o_oper_ptn);
					add($o_mfg_lt);
					add($o_mfg_lt_add_qty);
					add($o_purc_lt);
					add($o_purc_lt_add_qty);
					add($o_accpt_insp_lt);
					add($o_buf_lt);
					add($o_ord_fix_pd);
					add($o_sz_day_week_typ);
					add($o_sz_week);
					add($o_lot_sz_pd);
					add($o_min_lot_qty);
					add($o_batch_lot_qty);
					add($o_max_lot_qty);
					add($o_max_order);
					add($o_prio);
					add($o_order_ratio);
					add($o_yield_schd_qty);
					add($o_mfg_inst_qty);
					add($o_fxd_rqmt_qty);
					add($o_lot_issue_typ);
					add($o_bkf_flg);
					add($o_ln_stk_flg);
					add($o_pre_po_tgt_flg);
					add($o_inst_rec_issue_flg);
					add($o_no_mfg_aprv_flg);
					add($o_itm_lower_yield);
					add($o_itm_std_yield);
					add($o_itm_upper_yield);
					add($o_purc_id_typ);
					add($o_rqst_wg_cd);
					add($o_rsrc_std_qty1);
					add($o_rsrc_unit_qty1);
					add($o_rsrc_std_qty2);
					add($o_rsrc_unit_qty2);
					add($o_sno1);
					add($o_sno2);
					add($o_sno3);
					add($o_sno4);
					add($o_not_mrp_flg);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_purc_tax_cd);
					add($o_prov_tax_cd);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_cur_cd);
					add($o_cur_nm);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_foreign_flg);
					add($o_area_cd);
					add($o_area_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
					add($o_loc_mng_typ);
					add($o_loc_mng_typ_nm);
					add($o_asst_dpt_cd);
					add($o_sls_dpt_cd);
					add($o_lg_def_flg);
					add($o_pre_outsrc_act_flg);
					add($o_ddlv_prov_insp_flg);
					add($o_loc_cal_cd);
					add($o_str_ln_tgt_flg);
					add($o_alloc_lmt_flg);
					add($o_gi_pack_xfer_flg);
					add($o_gi_vmi_flg);
					add($o_rsrc_cd1);
					add($o_rsrc_cd2);
					add($o_prnt_lcl_cd);
					add($o_asppl_cd);
					add($o_vmi_purc_dpt_cd);
					add($o_subcon_flg);
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_sppl_cntct_psn_title);
					add($o_purc_upri_req_typ);
					add($o_purc_amt_rnd_typ);
					add($o_purc_tax_rnd_typ);
					add($o_purc_tax_calc_typ);
					add($o_wrk_po_flg);
					add($o_wrk_ap_flg);
					add($o_prov_rcv_typ);
					add($o_onr_prsppl_flg);
					add($o_prov_basis_typ);
					add($o_prov_amt_rnd_typ);
					add($o_prov_tax_rnd_typ);
					add($o_prov_tax_calc_typ);
					add($o_sppl_cal_cd);
					add($o_sppl_iv_flg);
					add($o_prms_recv_flg);
					add($o_sppl_tterm_cd1);
					add($o_sppl_tterm_cd2);
					add($o_sppl_tterm_cd3);
					add($o_purc_basis_typ);
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_amt_dec_place);
					add($o_upri_dec_place);
					add($o_ap_dpt_cd);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_sppl_purc_upri_cng_flg);
					add($o_edi_po_send_tgt_flg);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlSub2WithSpplMakerCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlSub2WithSpplMakerCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlSub2WithSpplMakerCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlSub2WithSpplMakerCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlSub2WithSpplMakerCols extends MSUAC_List.ItmDtlSub2WithSpplMakerCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlSub3WithSpplMaker:カラム名クラス
	  */
	protected static class ItmDtlSub3WithSpplMakerCols_MC_A  {
		/** IN:製造ＦＬＧ */
		public static final String $i_mfg_flg = "mfg_flg";
		/** IN:購買ＦＬＧ */
		public static final String $i_purc_flg = "purc_flg";
		/** IN:外注ＦＬＧ */
		public static final String $i_outsrc_flg = "outsrc_flg";
		/** IN:ＷＧ間移送ＦＬＧ */
		public static final String $i_wg_xfr_flg = "wg_xfr_flg";
		/** IN:適用日（必須） */
		public static final String $i_dt = "dt";
		/** IN:品目ＣＤ */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１ */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２ */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:製造場所ＣＤ */
		public static final String $i_mfg_loc_cd = "mfg_loc_cd";
		/** IN:依頼先場所ＣＤ */
		public static final String $i_rqst_loc_cd = "rqst_loc_cd";
		/** IN:発注先ＣＤ */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:ワーキンググループＣＤ */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:発注先取得ＦＬＧ */
		public static final String $i_get_sppl_flg = "get_sppl_flg";
		/** IN:メーカ取得ＦＬＧ */
		public static final String $i_get_maker_flg = "get_maker_flg";
		/** IN:マスタ適用日２
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_dt2 = "dt2";
		/** IN:外注先含む
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
		/** IN:マニュアル発注ＦＬＧ
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
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
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
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
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
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
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
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
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
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
		/** OUT:購買納品書対象ＦＬＧ */
		public static final String $o_purc_dlv_slip_flg = "purc_dlv_slip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:サムネイル画像 */
		public static final String $o_th_image = "th_image";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:ワーキンググループ名 */
		public static final String $o_wg_nm = "wg_nm";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
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
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:製造ＬＴ */
		public static final String $o_mfg_lt = "mfg_lt";
		/** OUT:製造ＬＴ加算基準数量 */
		public static final String $o_mfg_lt_add_qty = "mfg_lt_add_qty";
		/** OUT:購入ＬＴ */
		public static final String $o_purc_lt = "purc_lt";
		/** OUT:購入ＬＴ加算基準数量 */
		public static final String $o_purc_lt_add_qty = "purc_lt_add_qty";
		/** OUT:検収ＬＴ */
		public static final String $o_accpt_insp_lt = "accpt_insp_lt";
		/** OUT:安全ＬＴ */
		public static final String $o_buf_lt = "buf_lt";
		/** OUT:オーダ自動確定期間（日） */
		public static final String $o_ord_fix_pd = "ord_fix_pd";
		/** OUT:曜日まとめ区分 */
		public static final String $o_sz_day_week_typ = "sz_day_week_typ";
		/** OUT:曜日まとめ期間（週） */
		public static final String $o_sz_week = "sz_week";
		/** OUT:ロットまとめ期間（日） */
		public static final String $o_lot_sz_pd = "lot_sz_pd";
		/** OUT:最小ロット数量 */
		public static final String $o_min_lot_qty = "min_lot_qty";
		/** OUT:刻みロット数量 */
		public static final String $o_batch_lot_qty = "batch_lot_qty";
		/** OUT:最大ロット数量 */
		public static final String $o_max_lot_qty = "max_lot_qty";
		/** OUT:最大オーダ数量 */
		public static final String $o_max_order = "max_order";
		/** OUT:優先順 */
		public static final String $o_prio = "prio";
		/** OUT:オーダ比率 */
		public static final String $o_order_ratio = "order_ratio";
		/** OUT:出来高予定数量 */
		public static final String $o_yield_schd_qty = "yield_schd_qty";
		/** OUT:製造指図数量 */
		public static final String $o_mfg_inst_qty = "mfg_inst_qty";
		/** OUT:固定必要数量 */
		public static final String $o_fxd_rqmt_qty = "fxd_rqmt_qty";
		/** OUT:ロット発番タイミング区分 */
		public static final String $o_lot_issue_typ = "lot_issue_typ";
		/** OUT:バックフラッシュ許可ＦＬＧ */
		public static final String $o_bkf_flg = "bkf_flg";
		/** OUT:棚・ライン格納ＦＬＧ */
		public static final String $o_ln_stk_flg = "ln_stk_flg";
		/** OUT:先行手配対象ＦＬＧ */
		public static final String $o_pre_po_tgt_flg = "pre_po_tgt_flg";
		/** OUT:製造指図時記録書発行ＦＬＧ */
		public static final String $o_inst_rec_issue_flg = "inst_rec_issue_flg";
		/** OUT:製造承認対象外ＦＬＧ */
		public static final String $o_no_mfg_aprv_flg = "no_mfg_aprv_flg";
		/** OUT:品目下限収率 */
		public static final String $o_itm_lower_yield = "itm_lower_yield";
		/** OUT:品目標準収率 */
		public static final String $o_itm_std_yield = "itm_std_yield";
		/** OUT:品目上限収率 */
		public static final String $o_itm_upper_yield = "itm_upper_yield";
		/** OUT:購買識別区分
メーカ取得フラグがオンの場合、メーカ（品目詳細）で取得した値が設定される */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:資源標準値１ */
		public static final String $o_rsrc_std_qty1 = "rsrc_std_qty1";
		/** OUT:資源単位数量１ */
		public static final String $o_rsrc_unit_qty1 = "rsrc_unit_qty1";
		/** OUT:資源標準値２ */
		public static final String $o_rsrc_std_qty2 = "rsrc_std_qty2";
		/** OUT:資源単位数量２ */
		public static final String $o_rsrc_unit_qty2 = "rsrc_unit_qty2";
		/** OUT:手配ＮＯ１ */
		public static final String $o_sno1 = "sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_sno2 = "sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_sno3 = "sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_sno4 = "sno4";
		/** OUT:ＭＲＰ対象外ＦＬＧ */
		public static final String $o_not_mrp_flg = "not_mrp_flg";
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
		/** OUT:仕入税ＣＤ */
		public static final String $o_purc_tax_cd = "purc_tax_cd";
		/** OUT:支給税ＣＤ */
		public static final String $o_prov_tax_cd = "prov_tax_cd";
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
		/** OUT:通貨ＣＤ */
		public static final String $o_cur_cd = "cur_cd";
		/** OUT:通貨名 */
		public static final String $o_cur_nm = "cur_nm";
		/** OUT:国 */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:国外 */
		public static final String $o_foreign_flg = "foreign_flg";
		/** OUT:地域 */
		public static final String $o_area_cd = "area_cd";
		/** OUT:地域名 */
		public static final String $o_area_nm = "area_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
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
		/** OUT:管轄区分 */
		public static final String $o_loc_mng_typ = "loc_mng_typ";
		/** OUT:管轄区分名 */
		public static final String $o_loc_mng_typ_nm = "loc_mng_typ_nm";
		/** OUT:資産管理部門ＣＤ */
		public static final String $o_asst_dpt_cd = "asst_dpt_cd";
		/** OUT:売上部門ＣＤ */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:物流標準場所ＦＬＧ */
		public static final String $o_lg_def_flg = "lg_def_flg";
		/** OUT:外注実績先行ＦＬＧ */
		public static final String $o_pre_outsrc_act_flg = "pre_outsrc_act_flg";
		/** OUT:直送支給検査ＦＬＧ */
		public static final String $o_ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
		/** OUT:場所カレンダＣＤ */
		public static final String $o_loc_cal_cd = "loc_cal_cd";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:引当限定ＦＬＧ */
		public static final String $o_alloc_lmt_flg = "alloc_lmt_flg";
		/** OUT:出庫時荷姿振替ＦＬＧ */
		public static final String $o_gi_pack_xfer_flg = "gi_pack_xfer_flg";
		/** OUT:出庫時ＶＭＩ計上ＦＬＧ */
		public static final String $o_gi_vmi_flg = "gi_vmi_flg";
		/** OUT:資源ＣＤ１ */
		public static final String $o_rsrc_cd1 = "rsrc_cd1";
		/** OUT:資源ＣＤ２ */
		public static final String $o_rsrc_cd2 = "rsrc_cd2";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:買掛先ＣＤ */
		public static final String $o_asppl_cd = "asppl_cd";
		/** OUT:ＶＭＩ購買部門ＣＤ */
		public static final String $o_vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
		/** OUT:下請対象ＦＬＧ */
		public static final String $o_subcon_flg = "subcon_flg";
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:発注先担当者敬称 */
		public static final String $o_sppl_cntct_psn_title = "sppl_cntct_psn_title";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税額端数処理区分 */
		public static final String $o_purc_tax_rnd_typ = "purc_tax_rnd_typ";
		/** OUT:仕入税計算区分 */
		public static final String $o_purc_tax_calc_typ = "purc_tax_calc_typ";
		/** OUT:案件別注文書ＦＬＧ */
		public static final String $o_wrk_po_flg = "wrk_po_flg";
		/** OUT:案件別債務管理ＦＬＧ */
		public static final String $o_wrk_ap_flg = "wrk_ap_flg";
		/** OUT:支給積送管理区分 */
		public static final String $o_prov_rcv_typ = "prov_rcv_typ";
		/** OUT:有償支給先ＦＬＧ */
		public static final String $o_onr_prsppl_flg = "onr_prsppl_flg";
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税額端数処理区分 */
		public static final String $o_prov_tax_rnd_typ = "prov_tax_rnd_typ";
		/** OUT:支給税計算区分 */
		public static final String $o_prov_tax_calc_typ = "prov_tax_calc_typ";
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
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:金額小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_amt_dec_place = "amt_dec_place";
		/** OUT:単価小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_upri_dec_place = "upri_dec_place";
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:購買単価変更許可ＦＬＧ（発注先） */
		public static final String $o_sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** VIEW:枝番３ */
		public static final String $v_itm_sub3 = $o_itm_sub3;
		/** VIEW_NO:枝番３ */
		protected static final MCNumber $vn_itm_sub3 = new MCNumber(10);
		/** SORT:枝番３ */
		public static final String $s_itm_sub3 = $o_itm_sub3;
		/** SORT_NO:枝番３ */
		protected static final MCNumber $sn_itm_sub3 = new MCNumber(10);
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
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_wtax_rate);
					add($o_ship_unit_cd);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_no_typ);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_no_typ);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_flg);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_ptn_cd);
					add($o_cntry_org_cd);
					add($o_comp_spec_typ);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_purc_dlv_slip_flg);
					add($o_ship_term_cd);
					add($o_exim_xpns_typ);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_th_image);
					add($o_mrp_opn_xfr_days);
					add($o_wg_cd);
					add($o_wg_nm);
					add($o_mfg_inst_unit_typ);
					add($o_mrp_proc_typ);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_bom_ptn);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_st_dt);
					add($o_end_dt);
					add($o_oper_ptn);
					add($o_mfg_lt);
					add($o_mfg_lt_add_qty);
					add($o_purc_lt);
					add($o_purc_lt_add_qty);
					add($o_accpt_insp_lt);
					add($o_buf_lt);
					add($o_ord_fix_pd);
					add($o_sz_day_week_typ);
					add($o_sz_week);
					add($o_lot_sz_pd);
					add($o_min_lot_qty);
					add($o_batch_lot_qty);
					add($o_max_lot_qty);
					add($o_max_order);
					add($o_prio);
					add($o_order_ratio);
					add($o_yield_schd_qty);
					add($o_mfg_inst_qty);
					add($o_fxd_rqmt_qty);
					add($o_lot_issue_typ);
					add($o_bkf_flg);
					add($o_ln_stk_flg);
					add($o_pre_po_tgt_flg);
					add($o_inst_rec_issue_flg);
					add($o_no_mfg_aprv_flg);
					add($o_itm_lower_yield);
					add($o_itm_std_yield);
					add($o_itm_upper_yield);
					add($o_purc_id_typ);
					add($o_rqst_wg_cd);
					add($o_rsrc_std_qty1);
					add($o_rsrc_unit_qty1);
					add($o_rsrc_std_qty2);
					add($o_rsrc_unit_qty2);
					add($o_sno1);
					add($o_sno2);
					add($o_sno3);
					add($o_sno4);
					add($o_not_mrp_flg);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_purc_tax_cd);
					add($o_prov_tax_cd);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_cur_cd);
					add($o_cur_nm);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_foreign_flg);
					add($o_area_cd);
					add($o_area_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
					add($o_loc_mng_typ);
					add($o_loc_mng_typ_nm);
					add($o_asst_dpt_cd);
					add($o_sls_dpt_cd);
					add($o_lg_def_flg);
					add($o_pre_outsrc_act_flg);
					add($o_ddlv_prov_insp_flg);
					add($o_loc_cal_cd);
					add($o_str_ln_tgt_flg);
					add($o_alloc_lmt_flg);
					add($o_gi_pack_xfer_flg);
					add($o_gi_vmi_flg);
					add($o_rsrc_cd1);
					add($o_rsrc_cd2);
					add($o_prnt_lcl_cd);
					add($o_asppl_cd);
					add($o_vmi_purc_dpt_cd);
					add($o_subcon_flg);
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_sppl_cntct_psn_title);
					add($o_purc_upri_req_typ);
					add($o_purc_amt_rnd_typ);
					add($o_purc_tax_rnd_typ);
					add($o_purc_tax_calc_typ);
					add($o_wrk_po_flg);
					add($o_wrk_ap_flg);
					add($o_prov_rcv_typ);
					add($o_onr_prsppl_flg);
					add($o_prov_basis_typ);
					add($o_prov_amt_rnd_typ);
					add($o_prov_tax_rnd_typ);
					add($o_prov_tax_calc_typ);
					add($o_sppl_cal_cd);
					add($o_sppl_iv_flg);
					add($o_prms_recv_flg);
					add($o_sppl_tterm_cd1);
					add($o_sppl_tterm_cd2);
					add($o_sppl_tterm_cd3);
					add($o_purc_basis_typ);
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_amt_dec_place);
					add($o_upri_dec_place);
					add($o_ap_dpt_cd);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_sppl_purc_upri_cng_flg);
					add($o_edi_po_send_tgt_flg);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlSub3WithSpplMakerCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlSub3WithSpplMakerCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlSub3WithSpplMakerCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlSub3WithSpplMakerCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlSub3WithSpplMakerCols extends MSUAC_List.ItmDtlSub3WithSpplMakerCols_MC_A {
		//EIクラス
	}


	/** 
	  * MfgInstNo:カラム名クラス
	  */
	protected static class MfgInstNoCols_MC_A  {
		/** IN:生産方法区分 */
		public static final String $i_imi_mfg_mtd_typ = "imi_mfg_mtd_typ";
		/** IN:指図保存 */
		public static final String $i_sav_flg = "sav_flg";
		/** IN:指図済 */
		public static final String $i_ord_flg = "ord_flg";
		/** IN:着手中 */
		public static final String $i_stt_flg = "stt_flg";
		/** IN:完了 */
		public static final String $i_cmpl_flg = "cmpl_flg";
		/** IN:製造状況区分 */
		public static final String $i_mpr_mfg_sts_typ = "mpr_mfg_sts_typ";
		/** IN:製造着手予定日時ＦＲＯＭ */
		public static final String $i_mi_st_schd_dt_fr = "mi_st_schd_dt_fr";
		/** IN:製造着手予定日時ＴＯ */
		public static final String $i_mi_st_schd_dt_to = "mi_st_schd_dt_to";
		/** IN:製造終了予定日時ＦＲＯＭ */
		public static final String $i_mi_end_schd_dt_fr = "mi_end_schd_dt_fr";
		/** IN:製造終了予定日時ＴＯ */
		public static final String $i_mi_end_schd_dt_to = "mi_end_schd_dt_to";
		/** IN:製造着手実績日時ＦＲＯＭ */
		public static final String $i_ma_st_act_dt_fr = "ma_st_act_dt_fr";
		/** IN:製造着手実績日時ＴＯ */
		public static final String $i_ma_st_act_dt_to = "ma_st_act_dt_to";
		/** IN:製造終了実績日時ＦＲＯＭ */
		public static final String $i_ma_end_act_dt_fr = "ma_end_act_dt_fr";
		/** IN:製造終了実績日時ＴＯ */
		public static final String $i_ma_end_act_dt_to = "ma_end_act_dt_to";
		/** IN:納入希望日時ＦＲＯＭ */
		public static final String $i_mi_rqst_dlv_rqst_dt_fr = "mi_rqst_dlv_rqst_dt_fr";
		/** IN:納入希望日時ＴＯ */
		public static final String $i_mi_rqst_dlv_rqst_dt_to = "mi_rqst_dlv_rqst_dt_to";
		/** IN:品目区分 */
		public static final String $i_itm_typ = "itm_typ";
		/** IN:品目区分詳細 */
		public static final String $i_itm_typ_d_cd = "itm_typ_d_cd";
		/** IN:品目区分詳細名 */
		public static final String $i_itm_typ_d_nm = "itm_typ_d_nm";
		/** IN:品目コード */
		public static final String $i_imi_itm_cd = "imi_itm_cd";
		/** IN:枝番１ */
		public static final String $i_imi_itm_sub1 = "imi_itm_sub1";
		/** IN:枝番２ */
		public static final String $i_imi_itm_sub2 = "imi_itm_sub2";
		/** IN:枝番３ */
		public static final String $i_imi_itm_sub3 = "imi_itm_sub3";
		/** IN:品名 */
		public static final String $i_imi_itm_nm = "imi_itm_nm";
		/** IN:ロットＮＯ */
		public static final String $i_imi_lot_no = "imi_lot_no";
		/** IN:サブロットＮＯ */
		public static final String $i_imi_sublot_no = "imi_sublot_no";
		/** IN:手配ＮＯ１ */
		public static final String $i_imi_sno1 = "imi_sno1";
		/** IN:手配ＮＯ２ */
		public static final String $i_imi_sno2 = "imi_sno2";
		/** IN:手配ＮＯ３ */
		public static final String $i_imi_sno3 = "imi_sno3";
		/** IN:手配ＮＯ４ */
		public static final String $i_imi_sno4 = "imi_sno4";
		/** IN:案件ＮＯ */
		public static final String $i_imi_wrk_no = "imi_wrk_no";
		/** IN:案件名 */
		public static final String $i_imi_wrk_nm = "imi_wrk_nm";
		/** IN:製造場所ＣＤ */
		public static final String $i_imi_mfg_loc_cd = "imi_mfg_loc_cd";
		/** IN:製造場所名 */
		public static final String $i_imi_mfg_loc_nm = "imi_mfg_loc_nm";
		/** IN:製造棚・ラインＣＤ */
		public static final String $i_imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
		/** IN:製造棚・ライン名 */
		public static final String $i_imi_mfg_str_ln_nm = "imi_mfg_str_ln_nm";
		/** IN:製造指図ＮＯ */
		public static final String $i_mfg_inst_no = "mfg_inst_no";
		/** IN:分割連番 */
		public static final String $i_div_seq = "div_seq";
		/** IN:外注先ＣＤ */
		public static final String $i_imi_sppl_cd = "imi_sppl_cd";
		/** IN:外注先名 */
		public static final String $i_imi_sppl_nm = "imi_sppl_nm";
		/** IN:発注明細ＮＯ */
		public static final String $i_mi_po_d_no = "mi_po_d_no";
		/** IN:発注明細ＮＯ必須ＦＬＧ */
		public static final String $i_mi_po_d_no_req_flg = "mi_po_d_no_req_flg";
		/** IN:品目分類ＣＤ１ */
		public static final String $i_itm_grp_cd1 = "itm_grp_cd1";
		/** IN:品目分類名１ */
		public static final String $i_itm_grp_nm1 = "itm_grp_nm1";
		/** IN:品目分類ＣＤ２ */
		public static final String $i_itm_grp_cd2 = "itm_grp_cd2";
		/** IN:品目分類名２ */
		public static final String $i_itm_grp_nm2 = "itm_grp_nm2";
		/** IN:品目分類ＣＤ３ */
		public static final String $i_itm_grp_cd3 = "itm_grp_cd3";
		/** IN:品目分類名３ */
		public static final String $i_itm_grp_nm3 = "itm_grp_nm3";
		/** IN:品目分類ＣＤ４ */
		public static final String $i_itm_grp_cd4 = "itm_grp_cd4";
		/** IN:品目分類名４ */
		public static final String $i_itm_grp_nm4 = "itm_grp_nm4";
		/** IN:品目分類ＣＤ５ */
		public static final String $i_itm_grp_cd5 = "itm_grp_cd5";
		/** IN:品目分類名５ */
		public static final String $i_itm_grp_nm5 = "itm_grp_nm5";
		/** IN:品目分類ＣＤ６ */
		public static final String $i_itm_grp_cd6 = "itm_grp_cd6";
		/** IN:品目分類名６ */
		public static final String $i_itm_grp_nm6 = "itm_grp_nm6";
		/** IN:品目分類ＣＤ７ */
		public static final String $i_itm_grp_cd7 = "itm_grp_cd7";
		/** IN:品目分類名７ */
		public static final String $i_itm_grp_nm7 = "itm_grp_nm7";
		/** IN:品目分類ＣＤ８ */
		public static final String $i_itm_grp_cd8 = "itm_grp_cd8";
		/** IN:品目分類名８ */
		public static final String $i_itm_grp_nm8 = "itm_grp_nm8";
		/** IN:品目分類ＣＤ９ */
		public static final String $i_itm_grp_cd9 = "itm_grp_cd9";
		/** IN:品目分類名９ */
		public static final String $i_itm_grp_nm9 = "itm_grp_nm9";
		/** IN:品目分類ＣＤ１０ */
		public static final String $i_itm_grp_cd10 = "itm_grp_cd10";
		/** IN:品目分類名１０ */
		public static final String $i_itm_grp_nm10 = "itm_grp_nm10";
		/** OUT:製造指図ＮＯ */
		public static final String $o_mfg_inst_no = "mfg_inst_no";
		/** OUT:分割連番 */
		public static final String $o_div_seq = "div_seq";
		/** OUT:納入希望日時 */
		public static final String $o_mi_rqst_dlv_rqst_tm = "mi_rqst_dlv_rqst_tm";
		/** OUT:納入希望日 */
		public static final String $o_mi_rqst_dlv_rqst_dt = "mi_rqst_dlv_rqst_dt";
		/** OUT:納入希望時刻 */
		public static final String $o_mi_rqst_dlv_rqst_hm = "mi_rqst_dlv_rqst_hm";
		/** OUT:納入希望日（発注） */
		public static final String $o_po_dlv_rqst_dt = "po_dlv_rqst_dt";
		/** OUT:納入希望時刻（発注） */
		public static final String $o_po_dlv_rqst_hm = "po_dlv_rqst_hm";
		/** OUT:製造状況区分 */
		public static final String $o_mpr_mfg_sts_typ = "mpr_mfg_sts_typ";
		/** OUT:製造状況区分 */
		public static final String $o_mpr_mfg_sts_typ_nm = "mpr_mfg_sts_typ_nm";
		/** OUT:品目コード */
		public static final String $o_imi_itm_cd = "imi_itm_cd";
		/** OUT:枝番１ */
		public static final String $o_imi_itm_sub1 = "imi_itm_sub1";
		/** OUT:枝番２ */
		public static final String $o_imi_itm_sub2 = "imi_itm_sub2";
		/** OUT:枝番３ */
		public static final String $o_imi_itm_sub3 = "imi_itm_sub3";
		/** OUT:品名 */
		public static final String $o_imi_itm_nm = "imi_itm_nm";
		/** OUT:ロットＮＯ */
		public static final String $o_imi_lot_no = "imi_lot_no";
		/** OUT:サブロットＮＯ */
		public static final String $o_imi_sublot_no = "imi_sublot_no";
		/** OUT:手配ＮＯ１ */
		public static final String $o_imi_sno1 = "imi_sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_imi_sno2 = "imi_sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_imi_sno3 = "imi_sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_imi_sno4 = "imi_sno4";
		/** OUT:案件ＮＯ */
		public static final String $o_imi_wrk_no = "imi_wrk_no";
		/** OUT:案件名 */
		public static final String $o_imi_wrk_nm = "imi_wrk_nm";
		/** OUT:基準単位ＣＤ */
		public static final String $o_imi_base_unit_cd = "imi_base_unit_cd";
		/** OUT:基準単位名 */
		public static final String $o_imi_base_unit_nm = "imi_base_unit_nm";
		/** OUT:製造場所ＣＤ */
		public static final String $o_imi_mfg_loc_cd = "imi_mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_imi_mfg_loc_nm = "imi_mfg_loc_nm";
		/** OUT:製造棚・ラインＣＤ */
		public static final String $o_imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
		/** OUT:製造棚・ライン名 */
		public static final String $o_imi_mfg_str_ln_nm = "imi_mfg_str_ln_nm";
		/** OUT:外注先ＣＤ */
		public static final String $o_imi_sppl_cd = "imi_sppl_cd";
		/** OUT:外注先名 */
		public static final String $o_imi_sppl_nm = "imi_sppl_nm";
		/** OUT:発注明細ＮＯ */
		public static final String $o_mi_po_d_no = "mi_po_d_no";
		/** OUT:製造着手予定日 */
		public static final String $o_mi_st_schd_dt = "mi_st_schd_dt";
		/** OUT:製造着手予定時刻 */
		public static final String $o_mi_st_schd_hm = "mi_st_schd_hm";
		/** OUT:製造終了予定日 */
		public static final String $o_mi_end_schd_dt = "mi_end_schd_dt";
		/** OUT:製造終了予定時刻 */
		public static final String $o_mi_end_schd_hm = "mi_end_schd_hm";
		/** OUT:製造着手実績日 */
		public static final String $o_ma_st_act_dt = "ma_st_act_dt";
		/** OUT:製造着手実績時刻 */
		public static final String $o_ma_st_act_hm = "ma_st_act_hm";
		/** OUT:製造終了実績日 */
		public static final String $o_ma_end_act_dt = "ma_end_act_dt";
		/** OUT:製造終了実績時刻 */
		public static final String $o_ma_end_act_hm = "ma_end_act_hm";
		/** OUT:指図数量 */
		public static final String $o_mi_base_unit_inst_qty = "mi_base_unit_inst_qty";
		/** OUT:良品数量 */
		public static final String $o_ma_base_unit_yield_qty = "ma_base_unit_yield_qty";
		/** OUT:不良品数量 */
		public static final String $o_ma_base_unit_dfct_qty = "ma_base_unit_dfct_qty";
		/** VIEW:製造指図ＮＯ */
		public static final String $v_mfg_inst_no = $o_mfg_inst_no;
		/** VIEW_NO:製造指図ＮＯ */
		protected static final MCNumber $vn_mfg_inst_no = new MCNumber(10);
		/** VIEW:納入希望日時 */
		public static final String $v_mi_rqst_dlv_rqst_tm = $o_mi_rqst_dlv_rqst_tm;
		/** VIEW_NO:納入希望日時 */
		protected static final MCNumber $vn_mi_rqst_dlv_rqst_tm = new MCNumber(20);
		/** VIEW:ロットＮＯ */
		public static final String $v_imi_lot_no = $o_imi_lot_no;
		/** VIEW_NO:ロットＮＯ */
		protected static final MCNumber $vn_imi_lot_no = new MCNumber(40);
		/** VIEW:サブロットＮＯ */
		public static final String $v_imi_sublot_no = $o_imi_sublot_no;
		/** VIEW_NO:サブロットＮＯ */
		protected static final MCNumber $vn_imi_sublot_no = new MCNumber(50);
		/** VIEW:指図数量 */
		public static final String $v_mi_base_unit_inst_qty = $o_mi_base_unit_inst_qty;
		/** VIEW_NO:指図数量 */
		protected static final MCNumber $vn_mi_base_unit_inst_qty = new MCNumber(30);
		/** SORT:製造指図ＮＯ */
		public static final String $s_mfg_inst_no = $o_mfg_inst_no;
		/** SORT_NO:製造指図ＮＯ */
		protected static final MCNumber $sn_mfg_inst_no = new MCNumber(10);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1020";
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBCL1130";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_mfg_inst_no);
					add($o_div_seq);
					add($o_mi_rqst_dlv_rqst_tm);
					add($o_mi_rqst_dlv_rqst_dt);
					add($o_mi_rqst_dlv_rqst_hm);
					add($o_po_dlv_rqst_dt);
					add($o_po_dlv_rqst_hm);
					add($o_mpr_mfg_sts_typ);
					add($o_mpr_mfg_sts_typ_nm);
					add($o_imi_itm_cd);
					add($o_imi_itm_sub1);
					add($o_imi_itm_sub2);
					add($o_imi_itm_sub3);
					add($o_imi_itm_nm);
					add($o_imi_lot_no);
					add($o_imi_sublot_no);
					add($o_imi_sno1);
					add($o_imi_sno2);
					add($o_imi_sno3);
					add($o_imi_sno4);
					add($o_imi_wrk_no);
					add($o_imi_wrk_nm);
					add($o_imi_base_unit_cd);
					add($o_imi_base_unit_nm);
					add($o_imi_mfg_loc_cd);
					add($o_imi_mfg_loc_nm);
					add($o_imi_mfg_str_ln_cd);
					add($o_imi_mfg_str_ln_nm);
					add($o_imi_sppl_cd);
					add($o_imi_sppl_nm);
					add($o_mi_po_d_no);
					add($o_mi_st_schd_dt);
					add($o_mi_st_schd_hm);
					add($o_mi_end_schd_dt);
					add($o_mi_end_schd_hm);
					add($o_ma_st_act_dt);
					add($o_ma_st_act_hm);
					add($o_ma_end_act_dt);
					add($o_ma_end_act_hm);
					add($o_mi_base_unit_inst_qty);
					add($o_ma_base_unit_yield_qty);
					add($o_ma_base_unit_dfct_qty);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_mfg_inst_no, $v_mfg_inst_no);
					put($vn_mi_rqst_dlv_rqst_tm, $v_mi_rqst_dlv_rqst_tm);
					put($vn_imi_lot_no, $v_imi_lot_no);
					put($vn_imi_sublot_no, $v_imi_sublot_no);
					put($vn_mi_base_unit_inst_qty, $v_mi_base_unit_inst_qty);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_mfg_inst_no, $s_mfg_inst_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.MfgInstNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.MfgInstNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.MfgInstNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.MfgInstNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class MfgInstNoCols extends MSUAC_List.MfgInstNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlSppl:カラム名クラス
	  */
	protected static class ItmDtlSpplCols_MC_A  {
		/** IN:マスタ適用日 */
		public static final String $i_master_dt = "master_dt";
		/** IN:マスタ適用日２ */
		public static final String $i_master_dt2 = "master_dt2";
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
		/** IN:外注先含む */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
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
		/** IN:メモ１ */
		public static final String $i_memo1 = "memo1";
		/** IN:メモ２ */
		public static final String $i_memo2 = "memo2";
		/** IN:メモ３ */
		public static final String $i_memo3 = "memo3";
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
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** IN:マニュアル発注ＦＬＧ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:名称不要ＦＬＧ */
		public static final String $i_sundry_bp_nm_rem_flg = "sundry_bp_nm_rem_flg";
		/** IN:仕入計上区分取得ＦＬＧ */
		public static final String $i_purc_basis_typ_flg = "purc_basis_typ_flg";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** OUT:発注先ＣＤ */
		public static final String $o_bp_cd = "bp_cd";
		/** OUT:発注先名 */
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
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
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
		/** OUT:売上税端数処理区分 */
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
		/** OUT:得意先取引条件ＣＤ２ */
		public static final String $o_cst_tterm_cd2 = "cst_tterm_cd2";
		/** OUT:得意先取引条件ＣＤ３ */
		public static final String $o_cst_tterm_cd3 = "cst_tterm_cd3";
		/** OUT:得意先取引条件名１ */
		public static final String $o_cst_tterm_nm1 = "cst_tterm_nm1";
		/** OUT:得意先取引条件名２ */
		public static final String $o_cst_tterm_nm2 = "cst_tterm_nm2";
		/** OUT:得意先取引条件名３ */
		public static final String $o_cst_tterm_nm3 = "cst_tterm_nm3";
		/** OUT:売掛先ＣＤ */
		public static final String $o_acst_cd = "acst_cd";
		/** OUT:売掛先名 */
		public static final String $o_acst_nm = "acst_nm";
		/** OUT:請求先ＣＤ */
		public static final String $o_bcst_cd = "bcst_cd";
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
		/** OUT:請求税端数処理区分 */
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
		/** OUT:請求書明細入金予定表示ＦＬＧ */
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
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税端数処理区分 */
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
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税端数処理区分 */
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
		/** OUT:債務相殺グループＣＤ */
		public static final String $o_ap_setoff_grp_cd = "ap_setoff_grp_cd";
		/** OUT:支払先口座ＣＤ */
		public static final String $o_pay_bank_ac_cd = "pay_bank_ac_cd";
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
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:購買依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:購買識別区分 */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:購買依頼先ワーキンググループ名 */
		public static final String $o_rqst_wg_nm = "rqst_wg_nm";
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
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** OUT:ＥＤＩ検収送信対象 */
		public static final String $o_edi_accpt_send_tgt_flg = "edi_accpt_send_tgt_flg";
		/** VIEW:発注先ＣＤ */
		public static final String $v_bp_cd = $o_bp_cd;
		/** VIEW_NO:発注先ＣＤ */
		protected static final MCNumber $vn_bp_cd = new MCNumber(10);
		/** VIEW:発注先名 */
		public static final String $v_bp_nm = $o_bp_nm;
		/** VIEW_NO:発注先名 */
		protected static final MCNumber $vn_bp_nm = new MCNumber(20);
		/** SORT:発注先ＣＤ */
		public static final String $s_bp_cd = $o_bp_cd;
		/** SORT_NO:発注先ＣＤ */
		protected static final MCNumber $sn_bp_cd = new MCNumber(10);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1120";
		/** OTHER:マスタ適用日のモード ※頭は「mode_」で固定 */
		public static final String $m_master_dt = "mode_master_dt";
		/** OTHER:品目ＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_itm_cd = "mode_itm_cd";
		/** OTHER:枝番１のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub1 = "mode_itm_sub1";
		/** OTHER:枝番２のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub2 = "mode_itm_sub2";
		/** OTHER:枝番３のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub3 = "mode_itm_sub3";
		/** OTHER:ワーキンググループＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_wg_cd = "mode_wg_cd";
		/** OTHER:発注先ＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_sppl_cd = "mode_sppl_cd";
		/** OTHER:発注先ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_sppl_flg = "mode_sppl_flg";
		/** OTHER:マニュアル発注ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_manual_sppl_flg = "mode_manual_sppl_flg";
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
					add($o_ins_ts);
					add($o_upd_ts);
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
					add($o_cst_tterm_cd2);
					add($o_cst_tterm_cd3);
					add($o_cst_tterm_nm1);
					add($o_cst_tterm_nm2);
					add($o_cst_tterm_nm3);
					add($o_acst_cd);
					add($o_acst_nm);
					add($o_bcst_cd);
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
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
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
					add($o_ap_setoff_grp_cd);
					add($o_pay_bank_ac_cd);
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
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_rqst_wg_cd);
					add($o_purc_id_typ);
					add($o_purc_basis_typ);
					add($o_rqst_wg_nm);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_ap_dpt_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_st_dt);
					add($o_end_dt);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlSpplCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlSpplCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlSpplCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlSpplCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlSpplCols extends MSUAC_List.ItmDtlSpplCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlMaker:カラム名クラス
	  */
	protected static class ItmDtlMakerCols_MC_A  {
		/** IN:マスタ適用日 */
		public static final String $i_master_dt = "master_dt";
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
		/** IN:発注先ＣＤ */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:外注先含む */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
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
		/** IN:メモ１ */
		public static final String $i_memo1 = "memo1";
		/** IN:メモ２ */
		public static final String $i_memo2 = "memo2";
		/** IN:メモ３ */
		public static final String $i_memo3 = "memo3";
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
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** IN:マニュアル発注ＦＬＧ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
		/** IN:NULL文字使用ＦＬＧ */
		public static final String $i_mode_nullval_flg = "mode_nullval_flg";
		/** IN:名称不要ＦＬＧ */
		public static final String $i_sundry_bp_nm_rem_flg = "sundry_bp_nm_rem_flg";
		/** IN:仕入計上区分取得ＦＬＧ */
		public static final String $i_purc_basis_typ_flg = "purc_basis_typ_flg";
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
		/** OUT:登録日時 */
		public static final String $o_ins_ts = "ins_ts";
		/** OUT:更新日時 */
		public static final String $o_upd_ts = "upd_ts";
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
		/** OUT:売上税端数処理区分 */
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
		/** OUT:得意先取引条件ＣＤ２ */
		public static final String $o_cst_tterm_cd2 = "cst_tterm_cd2";
		/** OUT:得意先取引条件ＣＤ３ */
		public static final String $o_cst_tterm_cd3 = "cst_tterm_cd3";
		/** OUT:得意先取引条件名１ */
		public static final String $o_cst_tterm_nm1 = "cst_tterm_nm1";
		/** OUT:得意先取引条件名２ */
		public static final String $o_cst_tterm_nm2 = "cst_tterm_nm2";
		/** OUT:得意先取引条件名３ */
		public static final String $o_cst_tterm_nm3 = "cst_tterm_nm3";
		/** OUT:売掛先ＣＤ */
		public static final String $o_acst_cd = "acst_cd";
		/** OUT:売掛先名 */
		public static final String $o_acst_nm = "acst_nm";
		/** OUT:請求先ＣＤ */
		public static final String $o_bcst_cd = "bcst_cd";
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
		/** OUT:請求税端数処理区分 */
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
		/** OUT:請求書明細入金予定表示ＦＬＧ */
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
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税端数処理区分 */
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
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税端数処理区分 */
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
		/** OUT:債務相殺グループＣＤ */
		public static final String $o_ap_setoff_grp_cd = "ap_setoff_grp_cd";
		/** OUT:支払先口座ＣＤ */
		public static final String $o_pay_bank_ac_cd = "pay_bank_ac_cd";
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
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:購買依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:購買識別区分 */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:購買依頼先ワーキンググループ名 */
		public static final String $o_rqst_wg_nm = "rqst_wg_nm";
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
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
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
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1120";
		/** OTHER:マスタ適用日のモード ※頭は「mode_」で固定 */
		public static final String $m_master_dt = "mode_master_dt";
		/** OTHER:品目ＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_itm_cd = "mode_itm_cd";
		/** OTHER:枝番１のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub1 = "mode_itm_sub1";
		/** OTHER:枝番２のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub2 = "mode_itm_sub2";
		/** OTHER:枝番３のモード ※頭は「mode_」で固定 */
		public static final String $m_itm_sub3 = "mode_itm_sub3";
		/** OTHER:ワーキンググループＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_wg_cd = "mode_wg_cd";
		/** OTHER:発注先ＣＤのモード ※頭は「mode_」で固定 */
		public static final String $m_sppl_cd = "mode_sppl_cd";
		/** OTHER:メーカＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_maker_flg = "mode_maker_flg";
		/** OTHER:マニュアル発注ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_manual_sppl_flg = "mode_manual_sppl_flg";
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
					add($o_ins_ts);
					add($o_upd_ts);
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
					add($o_cst_tterm_cd2);
					add($o_cst_tterm_cd3);
					add($o_cst_tterm_nm1);
					add($o_cst_tterm_nm2);
					add($o_cst_tterm_nm3);
					add($o_acst_cd);
					add($o_acst_nm);
					add($o_bcst_cd);
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
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
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
					add($o_ap_setoff_grp_cd);
					add($o_pay_bank_ac_cd);
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
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_rqst_wg_cd);
					add($o_purc_id_typ);
					add($o_purc_basis_typ);
					add($o_rqst_wg_nm);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_ap_dpt_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_st_dt);
					add($o_end_dt);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlMakerCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlMakerCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlMakerCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlMakerCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlMakerCols extends MSUAC_List.ItmDtlMakerCols_MC_A {
		//EIクラス
	}


	/** 
	  * ItmDtlWithSpplMaker:カラム名クラス
	  */
	protected static class ItmDtlWithSpplMakerCols_MC_A  {
		/** IN:製造ＦＬＧ */
		public static final String $i_mfg_flg = "mfg_flg";
		/** IN:購買ＦＬＧ */
		public static final String $i_purc_flg = "purc_flg";
		/** IN:外注ＦＬＧ */
		public static final String $i_outsrc_flg = "outsrc_flg";
		/** IN:ＷＧ間移送ＦＬＧ */
		public static final String $i_wg_xfr_flg = "wg_xfr_flg";
		/** IN:適用日（必須・直接入力時PG連携可能） */
		public static final String $i_dt = "dt";
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
		/** IN:品目区分詳細名 */
		public static final String $i_itm_typ_d_nm = "itm_typ_d_nm";
		/** IN:在庫管理区分 */
		public static final String $i_stk_mng_typ = "stk_mng_typ";
		/** IN:資産管理区分 */
		public static final String $i_asset_mng_typ = "asset_mng_typ";
		/** IN:諸口品ＦＬＧ.オン */
		public static final String $i_sundry_itm_flg_on = "sundry_itm_flg_on";
		/** IN:諸口品ＦＬＧ.オフ */
		public static final String $i_sundry_itm_flg_off = "sundry_itm_flg_off";
		/** IN:製造場所ＣＤ（直接入力時PG連携可能） */
		public static final String $i_mfg_loc_cd = "mfg_loc_cd";
		/** IN:製造場所名 */
		public static final String $i_mfg_loc_nm = "mfg_loc_nm";
		/** IN:依頼先場所ＣＤ（直接入力時PG連携可能） */
		public static final String $i_rqst_loc_cd = "rqst_loc_cd";
		/** IN:依頼先場所名 */
		public static final String $i_rqst_loc_nm = "rqst_loc_nm";
		/** IN:工場・物流倉庫ＣＤ（直接入力時PG連携可能） */
		public static final String $i_site_cd = "site_cd";
		/** IN:工場・物流倉庫名 */
		public static final String $i_site_nm = "site_nm";
		/** IN:物流グループＣＤ */
		public static final String $i_lg_grp_cd = "lg_grp_cd";
		/** IN:物流グループ名 */
		public static final String $i_lg_grp_nm = "lg_grp_nm";
		/** IN:総量引当場所グループＣＤ */
		public static final String $i_alloc_grp_cd = "alloc_grp_cd";
		/** IN:総量引当場所グループ名 */
		public static final String $i_alloc_grp_nm = "alloc_grp_nm";
		/** IN:製造場所グループＣＤ */
		public static final String $i_loc_grp_cd = "loc_grp_cd";
		/** IN:製造場所グループ名 */
		public static final String $i_loc_grp_nm = "loc_grp_nm";
		/** IN:管轄区分 */
		public static final String $i_loc_mng_typ = "loc_mng_typ";
		/** IN:発注先ＣＤ（直接入力時PG連携可能） */
		public static final String $i_sppl_cd = "sppl_cd";
		/** IN:発注先名 */
		public static final String $i_sppl_nm = "sppl_nm";
		/** IN:法人番号 */
		public static final String $i_ein = "ein";
		/** IN:発注先別名１ */
		public static final String $i_sppl_alt_nm1 = "sppl_alt_nm1";
		/** IN:発注先別名２ */
		public static final String $i_sppl_alt_nm2 = "sppl_alt_nm2";
		/** IN:発注先別名３ */
		public static final String $i_sppl_alt_nm3 = "sppl_alt_nm3";
		/** IN:発注先別名４ */
		public static final String $i_sppl_alt_nm4 = "sppl_alt_nm4";
		/** IN:ワーキンググループＣＤ（直接入力時PG連携可能） */
		public static final String $i_wg_cd = "wg_cd";
		/** IN:ワーキンググループ名 */
		public static final String $i_wg_nm = "wg_nm";
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
		/** IN:品目分類ＣＤ１ */
		public static final String $i_itm_grp_cd1 = "itm_grp_cd1";
		/** IN:品目分類名１ */
		public static final String $i_itm_grp_nm1 = "itm_grp_nm1";
		/** IN:品目分類ＣＤ２ */
		public static final String $i_itm_grp_cd2 = "itm_grp_cd2";
		/** IN:品目分類名２ */
		public static final String $i_itm_grp_nm2 = "itm_grp_nm2";
		/** IN:品目分類ＣＤ３ */
		public static final String $i_itm_grp_cd3 = "itm_grp_cd3";
		/** IN:品目分類名３ */
		public static final String $i_itm_grp_nm3 = "itm_grp_nm3";
		/** IN:品目分類ＣＤ４ */
		public static final String $i_itm_grp_cd4 = "itm_grp_cd4";
		/** IN:品目分類名４ */
		public static final String $i_itm_grp_nm4 = "itm_grp_nm4";
		/** IN:品目分類ＣＤ５ */
		public static final String $i_itm_grp_cd5 = "itm_grp_cd5";
		/** IN:品目分類名５ */
		public static final String $i_itm_grp_nm5 = "itm_grp_nm5";
		/** IN:品目分類ＣＤ６ */
		public static final String $i_itm_grp_cd6 = "itm_grp_cd6";
		/** IN:品目分類名６ */
		public static final String $i_itm_grp_nm6 = "itm_grp_nm6";
		/** IN:品目分類ＣＤ７ */
		public static final String $i_itm_grp_cd7 = "itm_grp_cd7";
		/** IN:品目分類名７ */
		public static final String $i_itm_grp_nm7 = "itm_grp_nm7";
		/** IN:品目分類ＣＤ８ */
		public static final String $i_itm_grp_cd8 = "itm_grp_cd8";
		/** IN:品目分類名８ */
		public static final String $i_itm_grp_nm8 = "itm_grp_nm8";
		/** IN:品目分類ＣＤ９ */
		public static final String $i_itm_grp_cd9 = "itm_grp_cd9";
		/** IN:品目分類名９ */
		public static final String $i_itm_grp_nm9 = "itm_grp_nm9";
		/** IN:品目分類ＣＤ１０ */
		public static final String $i_itm_grp_cd10 = "itm_grp_cd10";
		/** IN:品目分類名１０ */
		public static final String $i_itm_grp_nm10 = "itm_grp_nm10";
		/** IN:発注先分類１ */
		public static final String $i_sppl_grp_cd1 = "sppl_grp_cd1";
		/** IN:発注先分類名１ */
		public static final String $i_sppl_grp_nm1 = "sppl_grp_nm1";
		/** IN:発注先分類２ */
		public static final String $i_sppl_grp_cd2 = "sppl_grp_cd2";
		/** IN:発注先分類名２ */
		public static final String $i_sppl_grp_nm2 = "sppl_grp_nm2";
		/** IN:発注先分類３ */
		public static final String $i_sppl_grp_cd3 = "sppl_grp_cd3";
		/** IN:発注先分類名３ */
		public static final String $i_sppl_grp_nm3 = "sppl_grp_nm3";
		/** IN:発注先分類４ */
		public static final String $i_sppl_grp_cd4 = "sppl_grp_cd4";
		/** IN:発注先分類名４ */
		public static final String $i_sppl_grp_nm4 = "sppl_grp_nm4";
		/** IN:発注先分類５ */
		public static final String $i_sppl_grp_cd5 = "sppl_grp_cd5";
		/** IN:発注先分類名５ */
		public static final String $i_sppl_grp_nm5 = "sppl_grp_nm5";
		/** IN:発注先分類６ */
		public static final String $i_sppl_grp_cd6 = "sppl_grp_cd6";
		/** IN:発注先分類名６ */
		public static final String $i_sppl_grp_nm6 = "sppl_grp_nm6";
		/** IN:発注先分類７ */
		public static final String $i_sppl_grp_cd7 = "sppl_grp_cd7";
		/** IN:発注先分類名７ */
		public static final String $i_sppl_grp_nm7 = "sppl_grp_nm7";
		/** IN:発注先分類８ */
		public static final String $i_sppl_grp_cd8 = "sppl_grp_cd8";
		/** IN:発注先分類名８ */
		public static final String $i_sppl_grp_nm8 = "sppl_grp_nm8";
		/** IN:発注先分類９ */
		public static final String $i_sppl_grp_cd9 = "sppl_grp_cd9";
		/** IN:発注先分類名９ */
		public static final String $i_sppl_grp_nm9 = "sppl_grp_nm9";
		/** IN:発注先分類１０ */
		public static final String $i_sppl_grp_cd10 = "sppl_grp_cd10";
		/** IN:発注先分類名１０ */
		public static final String $i_sppl_grp_nm10 = "sppl_grp_nm10";
		/** IN:メモ１ */
		public static final String $i_memo1 = "memo1";
		/** IN:メモ２ */
		public static final String $i_memo2 = "memo2";
		/** IN:メモ３ */
		public static final String $i_memo3 = "memo3";
		/** IN:検索条件のマッチタイプ：0,部分一致;1,前方一致;2,後方一致;3,完全一致 */
		public static final String $i_match_typ = "match_typ";
		/** IN:発注先取得ＦＬＧ */
		public static final String $i_get_sppl_flg = "get_sppl_flg";
		/** IN:メーカ取得ＦＬＧ */
		public static final String $i_get_maker_flg = "get_maker_flg";
		/** IN:マスタ適用日２
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_dt2 = "dt2";
		/** IN:外注先含む
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_inc_outsrc_flg = "inc_outsrc_flg";
		/** IN:マニュアル発注ＦＬＧ
発注先取得フラグがオンの場合、発注先（品目詳細）リストロジックに引き継ぐ */
		public static final String $i_manual_sppl_flg = "manual_sppl_flg";
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
		/** OUT:購買単価変更許可ＦＬＧ */
		public static final String $o_purc_upri_cng_flg = "purc_upri_cng_flg";
		/** OUT:支給単価変更許可ＦＬＧ */
		public static final String $o_prov_upri_cng_flg = "prov_upri_cng_flg";
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
		/** OUT:源泉税率 */
		public static final String $o_wtax_rate = "wtax_rate";
		/** OUT:出荷単位ＣＤ */
		public static final String $o_ship_unit_cd = "ship_unit_cd";
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
		/** OUT:ロットＮＯ発番区分 */
		public static final String $o_lot_no_typ = "lot_no_typ";
		/** OUT:ロットＮＯ発番パタンＣＤ */
		public static final String $o_lot_no_ptn_cd = "lot_no_ptn_cd";
		/** OUT:サブロット管理区分 */
		public static final String $o_sublot_mng_typ = "sublot_mng_typ";
		/** OUT:サブロットＮＯ発番区分 */
		public static final String $o_sublot_no_typ = "sublot_no_typ";
		/** OUT:サブロットＮＯ発番パタンＣＤ */
		public static final String $o_sublot_no_ptn_cd = "sublot_no_ptn_cd";
		/** OUT:業者ロットＮＯ必須ＦＬＧ */
		public static final String $o_bp_lot_flg = "bp_lot_flg";
		/** OUT:検査実施単位区分 */
		public static final String $o_insp_bind_typ = "insp_bind_typ";
		/** OUT:出荷時構成チェック不要ＦＬＧ */
		public static final String $o_skip_chk_ship_flg = "skip_chk_ship_flg";
		/** OUT:市場出荷判定対象ＦＬＧ */
		public static final String $o_mrkt_judg_flg = "mrkt_judg_flg";
		/** OUT:市場出荷判定承認役割ＣＤ */
		public static final String $o_mrkt_judg_role_cd = "mrkt_judg_role_cd";
		/** OUT:期限管理対象ＦＬＧ */
		public static final String $o_lmt_ctl_flg = "lmt_ctl_flg";
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
		/** OUT:有効成分小数部有効桁数 */
		public static final String $o_cont_fctr_dec_place = "cont_fctr_dec_place";
		/** OUT:手配ＮＯ１管理区分 */
		public static final String $o_sno1_mng_typ = "sno1_mng_typ";
		/** OUT:受注手配ＮＯ１必須ＦＬＧ */
		public static final String $o_slo_sno1_flg = "slo_sno1_flg";
		/** OUT:所要手配ＮＯ１必須ＦＬＧ */
		public static final String $o_rqmt_sno1_flg = "rqmt_sno1_flg";
		/** OUT:手配ＮＯ１発番区分 */
		public static final String $o_sno1_num_typ = "sno1_num_typ";
		/** OUT:手配ＮＯ１発番パタンＣＤ */
		public static final String $o_sno1_ptn_cd = "sno1_ptn_cd";
		/** OUT:手配ＮＯ２管理区分 */
		public static final String $o_sno2_mng_typ = "sno2_mng_typ";
		/** OUT:受注手配ＮＯ２必須ＦＬＧ */
		public static final String $o_slo_sno2_flg = "slo_sno2_flg";
		/** OUT:所要手配ＮＯ２必須ＦＬＧ */
		public static final String $o_rqmt_sno2_flg = "rqmt_sno2_flg";
		/** OUT:手配ＮＯ２発番区分 */
		public static final String $o_sno2_num_typ = "sno2_num_typ";
		/** OUT:手配ＮＯ２発番パタンＣＤ */
		public static final String $o_sno2_ptn_cd = "sno2_ptn_cd";
		/** OUT:手配ＮＯ３管理区分 */
		public static final String $o_sno3_mng_typ = "sno3_mng_typ";
		/** OUT:受注手配ＮＯ３必須ＦＬＧ */
		public static final String $o_slo_sno3_flg = "slo_sno3_flg";
		/** OUT:所要手配ＮＯ３必須ＦＬＧ */
		public static final String $o_rqmt_sno3_flg = "rqmt_sno3_flg";
		/** OUT:手配ＮＯ３発番区分 */
		public static final String $o_sno3_num_typ = "sno3_num_typ";
		/** OUT:手配ＮＯ３発番パタンＣＤ */
		public static final String $o_sno3_ptn_cd = "sno3_ptn_cd";
		/** OUT:手配ＮＯ４管理区分 */
		public static final String $o_sno4_mng_typ = "sno4_mng_typ";
		/** OUT:受注手配ＮＯ４必須ＦＬＧ */
		public static final String $o_slo_sno4_flg = "slo_sno4_flg";
		/** OUT:所要手配ＮＯ４必須ＦＬＧ */
		public static final String $o_rqmt_sno4_flg = "rqmt_sno4_flg";
		/** OUT:手配ＮＯ４発番区分 */
		public static final String $o_sno4_num_typ = "sno4_num_typ";
		/** OUT:手配ＮＯ４発番パタンＣＤ */
		public static final String $o_sno4_ptn_cd = "sno4_ptn_cd";
		/** OUT:原産地ＣＤ */
		public static final String $o_cntry_org_cd = "cntry_org_cd";
		/** OUT:構成・仕様管理区分 */
		public static final String $o_comp_spec_typ = "comp_spec_typ";
		/** OUT:受注時構成改訂許可ＦＬＧ */
		public static final String $o_comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
		/** OUT:構成主品目ＦＬＧ */
		public static final String $o_comp_core_itm_flg = "comp_core_itm_flg";
		/** OUT:品目仕様分類ＣＤ */
		public static final String $o_itm_spec_grp_cd = "itm_spec_grp_cd";
		/** OUT:支払繰越回数 */
		public static final String $o_pay_crryovr_times = "pay_crryovr_times";
		/** OUT:受注手配品ＦＬＧ */
		public static final String $o_slo_proc_flg = "slo_proc_flg";
		/** OUT:受注手配区分 */
		public static final String $o_slo_proc_typ = "slo_proc_typ";
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
		/** OUT:購買納品書対象ＦＬＧ */
		public static final String $o_purc_dlv_slip_flg = "purc_dlv_slip_flg";
		/** OUT:出荷条件ＣＤ */
		public static final String $o_ship_term_cd = "ship_term_cd";
		/** OUT:輸出入諸掛区分 */
		public static final String $o_exim_xpns_typ = "exim_xpns_typ";
		/** OUT:現品票出力対象ＦＬＧ */
		public static final String $o_stk_lst_flg = "stk_lst_flg";
		/** OUT:版管理対象ＦＬＧ */
		public static final String $o_ver_flg = "ver_flg";
		/** OUT:サムネイル画像 */
		public static final String $o_th_image = "th_image";
		/** OUT:ＭＲＰ未確定移送依頼考慮日数 */
		public static final String $o_mrp_opn_xfr_days = "mrp_opn_xfr_days";
		/** OUT:ワーキンググループＣＤ */
		public static final String $o_wg_cd = "wg_cd";
		/** OUT:ワーキンググループ名 */
		public static final String $o_wg_nm = "wg_nm";
		/** OUT:製造指図単位区分 */
		public static final String $o_mfg_inst_unit_typ = "mfg_inst_unit_typ";
		/** OUT:ＭＲＰ処理区分 */
		public static final String $o_mrp_proc_typ = "mrp_proc_typ";
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
		/** OUT:製造場所ＣＤ */
		public static final String $o_mfg_loc_cd = "mfg_loc_cd";
		/** OUT:製造場所名 */
		public static final String $o_mfg_loc_nm = "mfg_loc_nm";
		/** OUT:構成パタン */
		public static final String $o_bom_ptn = "bom_ptn";
		/** OUT:発注先ＣＤ */
		public static final String $o_sppl_cd = "sppl_cd";
		/** OUT:発注先名 */
		public static final String $o_sppl_nm = "sppl_nm";
		/** OUT:メーカＣＤ */
		public static final String $o_maker_cd = "maker_cd";
		/** OUT:メーカ名 */
		public static final String $o_maker_nm = "maker_nm";
		/** OUT:依頼先場所ＣＤ */
		public static final String $o_rqst_loc_cd = "rqst_loc_cd";
		/** OUT:依頼先場所名 */
		public static final String $o_rqst_loc_nm = "rqst_loc_nm";
		/** OUT:適用開始日 */
		public static final String $o_st_dt = "st_dt";
		/** OUT:適用終了日 */
		public static final String $o_end_dt = "end_dt";
		/** OUT:工程パタン */
		public static final String $o_oper_ptn = "oper_ptn";
		/** OUT:製造ＬＴ */
		public static final String $o_mfg_lt = "mfg_lt";
		/** OUT:製造ＬＴ加算基準数量 */
		public static final String $o_mfg_lt_add_qty = "mfg_lt_add_qty";
		/** OUT:購入ＬＴ */
		public static final String $o_purc_lt = "purc_lt";
		/** OUT:購入ＬＴ加算基準数量 */
		public static final String $o_purc_lt_add_qty = "purc_lt_add_qty";
		/** OUT:検収ＬＴ */
		public static final String $o_accpt_insp_lt = "accpt_insp_lt";
		/** OUT:安全ＬＴ */
		public static final String $o_buf_lt = "buf_lt";
		/** OUT:オーダ自動確定期間（日） */
		public static final String $o_ord_fix_pd = "ord_fix_pd";
		/** OUT:曜日まとめ区分 */
		public static final String $o_sz_day_week_typ = "sz_day_week_typ";
		/** OUT:曜日まとめ期間（週） */
		public static final String $o_sz_week = "sz_week";
		/** OUT:ロットまとめ期間（日） */
		public static final String $o_lot_sz_pd = "lot_sz_pd";
		/** OUT:最小ロット数量 */
		public static final String $o_min_lot_qty = "min_lot_qty";
		/** OUT:刻みロット数量 */
		public static final String $o_batch_lot_qty = "batch_lot_qty";
		/** OUT:最大ロット数量 */
		public static final String $o_max_lot_qty = "max_lot_qty";
		/** OUT:最大オーダ数量 */
		public static final String $o_max_order = "max_order";
		/** OUT:優先順 */
		public static final String $o_prio = "prio";
		/** OUT:オーダ比率 */
		public static final String $o_order_ratio = "order_ratio";
		/** OUT:出来高予定数量 */
		public static final String $o_yield_schd_qty = "yield_schd_qty";
		/** OUT:製造指図数量 */
		public static final String $o_mfg_inst_qty = "mfg_inst_qty";
		/** OUT:固定必要数量 */
		public static final String $o_fxd_rqmt_qty = "fxd_rqmt_qty";
		/** OUT:ロット発番タイミング区分 */
		public static final String $o_lot_issue_typ = "lot_issue_typ";
		/** OUT:バックフラッシュ許可ＦＬＧ */
		public static final String $o_bkf_flg = "bkf_flg";
		/** OUT:棚・ライン格納ＦＬＧ */
		public static final String $o_ln_stk_flg = "ln_stk_flg";
		/** OUT:先行手配対象ＦＬＧ */
		public static final String $o_pre_po_tgt_flg = "pre_po_tgt_flg";
		/** OUT:製造指図時記録書発行ＦＬＧ */
		public static final String $o_inst_rec_issue_flg = "inst_rec_issue_flg";
		/** OUT:製造承認対象外ＦＬＧ */
		public static final String $o_no_mfg_aprv_flg = "no_mfg_aprv_flg";
		/** OUT:品目下限収率 */
		public static final String $o_itm_lower_yield = "itm_lower_yield";
		/** OUT:品目標準収率 */
		public static final String $o_itm_std_yield = "itm_std_yield";
		/** OUT:品目上限収率 */
		public static final String $o_itm_upper_yield = "itm_upper_yield";
		/** OUT:購買識別区分
メーカ取得フラグがオンの場合、メーカ（品目詳細）で取得した値が設定される */
		public static final String $o_purc_id_typ = "purc_id_typ";
		/** OUT:依頼先ワーキンググループＣＤ */
		public static final String $o_rqst_wg_cd = "rqst_wg_cd";
		/** OUT:資源標準値１ */
		public static final String $o_rsrc_std_qty1 = "rsrc_std_qty1";
		/** OUT:資源単位数量１ */
		public static final String $o_rsrc_unit_qty1 = "rsrc_unit_qty1";
		/** OUT:資源標準値２ */
		public static final String $o_rsrc_std_qty2 = "rsrc_std_qty2";
		/** OUT:資源単位数量２ */
		public static final String $o_rsrc_unit_qty2 = "rsrc_unit_qty2";
		/** OUT:手配ＮＯ１ */
		public static final String $o_sno1 = "sno1";
		/** OUT:手配ＮＯ２ */
		public static final String $o_sno2 = "sno2";
		/** OUT:手配ＮＯ３ */
		public static final String $o_sno3 = "sno3";
		/** OUT:手配ＮＯ４ */
		public static final String $o_sno4 = "sno4";
		/** OUT:ＭＲＰ対象外ＦＬＧ */
		public static final String $o_not_mrp_flg = "not_mrp_flg";
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
		/** OUT:仕入税ＣＤ */
		public static final String $o_purc_tax_cd = "purc_tax_cd";
		/** OUT:支給税ＣＤ */
		public static final String $o_prov_tax_cd = "prov_tax_cd";
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
		/** OUT:通貨ＣＤ */
		public static final String $o_cur_cd = "cur_cd";
		/** OUT:通貨名 */
		public static final String $o_cur_nm = "cur_nm";
		/** OUT:国 */
		public static final String $o_cntry_cd = "cntry_cd";
		/** OUT:国名 */
		public static final String $o_cntry_nm = "cntry_nm";
		/** OUT:国外 */
		public static final String $o_foreign_flg = "foreign_flg";
		/** OUT:地域 */
		public static final String $o_area_cd = "area_cd";
		/** OUT:地域名 */
		public static final String $o_area_nm = "area_nm";
		/** OUT:工場・物流倉庫ＣＤ */
		public static final String $o_site_cd = "site_cd";
		/** OUT:工場・物流倉庫名 */
		public static final String $o_site_nm = "site_nm";
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
		/** OUT:管轄区分 */
		public static final String $o_loc_mng_typ = "loc_mng_typ";
		/** OUT:管轄区分名 */
		public static final String $o_loc_mng_typ_nm = "loc_mng_typ_nm";
		/** OUT:資産管理部門ＣＤ */
		public static final String $o_asst_dpt_cd = "asst_dpt_cd";
		/** OUT:売上部門ＣＤ */
		public static final String $o_sls_dpt_cd = "sls_dpt_cd";
		/** OUT:物流標準場所ＦＬＧ */
		public static final String $o_lg_def_flg = "lg_def_flg";
		/** OUT:外注実績先行ＦＬＧ */
		public static final String $o_pre_outsrc_act_flg = "pre_outsrc_act_flg";
		/** OUT:直送支給検査ＦＬＧ */
		public static final String $o_ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
		/** OUT:場所カレンダＣＤ */
		public static final String $o_loc_cal_cd = "loc_cal_cd";
		/** OUT:棚・ライン対象ＦＬＧ */
		public static final String $o_str_ln_tgt_flg = "str_ln_tgt_flg";
		/** OUT:引当限定ＦＬＧ */
		public static final String $o_alloc_lmt_flg = "alloc_lmt_flg";
		/** OUT:出庫時荷姿振替ＦＬＧ */
		public static final String $o_gi_pack_xfer_flg = "gi_pack_xfer_flg";
		/** OUT:出庫時ＶＭＩ計上ＦＬＧ */
		public static final String $o_gi_vmi_flg = "gi_vmi_flg";
		/** OUT:資源ＣＤ１ */
		public static final String $o_rsrc_cd1 = "rsrc_cd1";
		/** OUT:資源ＣＤ２ */
		public static final String $o_rsrc_cd2 = "rsrc_cd2";
		/** OUT:帳票出力ロケールＣＤ */
		public static final String $o_prnt_lcl_cd = "prnt_lcl_cd";
		/** OUT:買掛先ＣＤ */
		public static final String $o_asppl_cd = "asppl_cd";
		/** OUT:ＶＭＩ購買部門ＣＤ */
		public static final String $o_vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
		/** OUT:下請対象ＦＬＧ */
		public static final String $o_subcon_flg = "subcon_flg";
		/** OUT:注文書表示ＣＤ */
		public static final String $o_po_print_cd = "po_print_cd";
		/** OUT:発注先納品書ＣＤ */
		public static final String $o_sppl_ship_form_cd = "sppl_ship_form_cd";
		/** OUT:発注先部署 */
		public static final String $o_sppl_cntct_dpt = "sppl_cntct_dpt";
		/** OUT:発注先担当者 */
		public static final String $o_sppl_cntct_psn = "sppl_cntct_psn";
		/** OUT:発注先担当者敬称 */
		public static final String $o_sppl_cntct_psn_title = "sppl_cntct_psn_title";
		/** OUT:購買単価取得区分 */
		public static final String $o_purc_upri_req_typ = "purc_upri_req_typ";
		/** OUT:仕入金額端数処理区分 */
		public static final String $o_purc_amt_rnd_typ = "purc_amt_rnd_typ";
		/** OUT:仕入税額端数処理区分 */
		public static final String $o_purc_tax_rnd_typ = "purc_tax_rnd_typ";
		/** OUT:仕入税計算区分 */
		public static final String $o_purc_tax_calc_typ = "purc_tax_calc_typ";
		/** OUT:案件別注文書ＦＬＧ */
		public static final String $o_wrk_po_flg = "wrk_po_flg";
		/** OUT:案件別債務管理ＦＬＧ */
		public static final String $o_wrk_ap_flg = "wrk_ap_flg";
		/** OUT:支給積送管理区分 */
		public static final String $o_prov_rcv_typ = "prov_rcv_typ";
		/** OUT:有償支給先ＦＬＧ */
		public static final String $o_onr_prsppl_flg = "onr_prsppl_flg";
		/** OUT:支給計上区分 */
		public static final String $o_prov_basis_typ = "prov_basis_typ";
		/** OUT:支給金額端数処理区分 */
		public static final String $o_prov_amt_rnd_typ = "prov_amt_rnd_typ";
		/** OUT:支給税額端数処理区分 */
		public static final String $o_prov_tax_rnd_typ = "prov_tax_rnd_typ";
		/** OUT:支給税計算区分 */
		public static final String $o_prov_tax_calc_typ = "prov_tax_calc_typ";
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
		/** OUT:仕入計上区分 */
		public static final String $o_purc_basis_typ = "purc_basis_typ";
		/** OUT:買戻義務ＦＬＧ */
		public static final String $o_repurc_obli_flg = "repurc_obli_flg";
		/** OUT:外注単価区分 */
		public static final String $o_outsrc_upri_typ = "outsrc_upri_typ";
		/** OUT:金額小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_amt_dec_place = "amt_dec_place";
		/** OUT:単価小数部有効桁数（通貨ＣＤの有効桁数） */
		public static final String $o_upri_dec_place = "upri_dec_place";
		/** OUT:債務部門ＣＤ */
		public static final String $o_ap_dpt_cd = "ap_dpt_cd";
		/** OUT:購買担当者ＣＤ */
		public static final String $o_purc_usr_cd = "purc_usr_cd";
		/** OUT:購買部門ＣＤ */
		public static final String $o_purc_dpt_cd = "purc_dpt_cd";
		/** OUT:購買単価変更許可ＦＬＧ（発注先） */
		public static final String $o_sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
		/** OUT:ＥＤＩ発注送信対象 */
		public static final String $o_edi_po_send_tgt_flg = "edi_po_send_tgt_flg";
		/** SORT:品目ＣＤ */
		public static final String $s_itm_cd = $o_itm_cd;
		/** SORT_NO:品目ＣＤ */
		protected static final MCNumber $sn_itm_cd = new MCNumber(20);
		/** SORT:枝番１ */
		public static final String $s_itm_sub1 = $o_itm_sub1;
		/** SORT_NO:枝番１ */
		protected static final MCNumber $sn_itm_sub1 = new MCNumber(30);
		/** SORT:枝番２ */
		public static final String $s_itm_sub2 = $o_itm_sub2;
		/** SORT_NO:枝番２ */
		protected static final MCNumber $sn_itm_sub2 = new MCNumber(40);
		/** SORT:枝番３ */
		public static final String $s_itm_sub3 = $o_itm_sub3;
		/** SORT_NO:枝番３ */
		protected static final MCNumber $sn_itm_sub3 = new MCNumber(50);
		/** SORT:ワーキンググループＣＤ */
		public static final String $s_wg_cd = $o_wg_cd;
		/** SORT_NO:ワーキンググループＣＤ */
		protected static final MCNumber $sn_wg_cd = new MCNumber(10);
		/** SORT:製造場所ＣＤ */
		public static final String $s_mfg_loc_cd = $o_mfg_loc_cd;
		/** SORT_NO:製造場所ＣＤ */
		protected static final MCNumber $sn_mfg_loc_cd = new MCNumber(60);
		/** SORT:構成パタン */
		public static final String $s_bom_ptn = $o_bom_ptn;
		/** SORT_NO:構成パタン */
		protected static final MCNumber $sn_bom_ptn = new MCNumber(70);
		/** SORT:発注先ＣＤ */
		public static final String $s_sppl_cd = $o_sppl_cd;
		/** SORT_NO:発注先ＣＤ */
		protected static final MCNumber $sn_sppl_cd = new MCNumber(80);
		/** SORT:メーカＣＤ */
		public static final String $s_maker_cd = $o_maker_cd;
		/** SORT_NO:メーカＣＤ */
		protected static final MCNumber $sn_maker_cd = new MCNumber(90);
		/** SORT:依頼先場所ＣＤ */
		public static final String $s_rqst_loc_cd = $o_rqst_loc_cd;
		/** SORT_NO:依頼先場所ＣＤ */
		protected static final MCNumber $sn_rqst_loc_cd = new MCNumber(100);
		/** SORT:適用開始日 */
		public static final String $s_st_dt = $o_st_dt;
		/** SORT_NO:適用開始日 */
		protected static final MCNumber $sn_st_dt = new MCNumber(110);
		/** SORT:適用終了日 */
		public static final String $s_end_dt = $o_end_dt;
		/** SORT_NO:適用終了日 */
		protected static final MCNumber $sn_end_dt = new MCNumber(120);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MA";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MAUAP1090";
		/** OTHER:製造ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_mfg_flg = "mode_mfg_flg";
		/** OTHER:購買ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_purc_flg = "mode_purc_flg";
		/** OTHER:外注ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_outsrc_flg = "mode_outsrc_flg";
		/** OTHER:ＷＧ間移送ＦＬＧのモード ※頭は「mode_」で固定 */
		public static final String $m_wg_xfr_flg = "mode_wg_xfr_flg";
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
					add($o_purc_upri_cng_flg);
					add($o_prov_upri_cng_flg);
					add($o_dscnt_itm_flg);
					add($o_unit_cd);
					add($o_unit_nm);
					add($o_dec_place);
					add($o_rnd_typ);
					add($o_dim_unit_cd);
					add($o_dim);
					add($o_wt_unit_cd);
					add($o_wt);
					add($o_conts_unit_cd);
					add($o_conts_qty);
					add($o_hs_cd);
					add($o_itm_jnl_cd);
					add($o_ac_itm_grp_cd);
					add($o_minus_stk_flg);
					add($o_not_new_lot_flg);
					add($o_gi_alloc_flg);
					add($o_wtax_rate);
					add($o_ship_unit_cd);
					add($o_mfg_unit_cd);
					add($o_purc_unit_cd);
					add($o_pckg_unit_cd);
					add($o_pack_alloc_flg);
					add($o_lot_mng_typ);
					add($o_lot_no_typ);
					add($o_lot_no_ptn_cd);
					add($o_sublot_mng_typ);
					add($o_sublot_no_typ);
					add($o_sublot_no_ptn_cd);
					add($o_bp_lot_flg);
					add($o_insp_bind_typ);
					add($o_skip_chk_ship_flg);
					add($o_mrkt_judg_flg);
					add($o_mrkt_judg_role_cd);
					add($o_lmt_ctl_flg);
					add($o_lmt_ctl_categ);
					add($o_cont_fctr_flg);
					add($o_std_cont_fctr);
					add($o_cont_fctr_unit_cd);
					add($o_cont_fctr_unit_nm);
					add($o_cont_fctr_rnd_typ);
					add($o_cont_fctr_dec_place);
					add($o_sno1_mng_typ);
					add($o_slo_sno1_flg);
					add($o_rqmt_sno1_flg);
					add($o_sno1_num_typ);
					add($o_sno1_ptn_cd);
					add($o_sno2_mng_typ);
					add($o_slo_sno2_flg);
					add($o_rqmt_sno2_flg);
					add($o_sno2_num_typ);
					add($o_sno2_ptn_cd);
					add($o_sno3_mng_typ);
					add($o_slo_sno3_flg);
					add($o_rqmt_sno3_flg);
					add($o_sno3_num_typ);
					add($o_sno3_ptn_cd);
					add($o_sno4_mng_typ);
					add($o_slo_sno4_flg);
					add($o_rqmt_sno4_flg);
					add($o_sno4_num_typ);
					add($o_sno4_ptn_cd);
					add($o_cntry_org_cd);
					add($o_comp_spec_typ);
					add($o_comp_rev_at_slo_flg);
					add($o_comp_core_itm_flg);
					add($o_itm_spec_grp_cd);
					add($o_pay_crryovr_times);
					add($o_slo_proc_flg);
					add($o_slo_proc_typ);
					add($o_ship_inst_typ);
					add($o_ship_lot_back_stop_flg);
					add($o_itm_ship_grp_cd);
					add($o_ship_valid_grp_cd);
					add($o_arr_skip_flg);
					add($o_purc_dlv_slip_flg);
					add($o_ship_term_cd);
					add($o_exim_xpns_typ);
					add($o_stk_lst_flg);
					add($o_ver_flg);
					add($o_th_image);
					add($o_mrp_opn_xfr_days);
					add($o_wg_cd);
					add($o_wg_nm);
					add($o_mfg_inst_unit_typ);
					add($o_mrp_proc_typ);
					add($o_alloc_margin_days);
					add($o_mrp_alloc_margin_days);
					add($o_rqmt_rstr_qty);
					add($o_inpt_itm_add_flg);
					add($o_inpt_itm_del_flg);
					add($o_sch_flg);
					add($o_mfg_loc_cd);
					add($o_mfg_loc_nm);
					add($o_bom_ptn);
					add($o_sppl_cd);
					add($o_sppl_nm);
					add($o_maker_cd);
					add($o_maker_nm);
					add($o_rqst_loc_cd);
					add($o_rqst_loc_nm);
					add($o_st_dt);
					add($o_end_dt);
					add($o_oper_ptn);
					add($o_mfg_lt);
					add($o_mfg_lt_add_qty);
					add($o_purc_lt);
					add($o_purc_lt_add_qty);
					add($o_accpt_insp_lt);
					add($o_buf_lt);
					add($o_ord_fix_pd);
					add($o_sz_day_week_typ);
					add($o_sz_week);
					add($o_lot_sz_pd);
					add($o_min_lot_qty);
					add($o_batch_lot_qty);
					add($o_max_lot_qty);
					add($o_max_order);
					add($o_prio);
					add($o_order_ratio);
					add($o_yield_schd_qty);
					add($o_mfg_inst_qty);
					add($o_fxd_rqmt_qty);
					add($o_lot_issue_typ);
					add($o_bkf_flg);
					add($o_ln_stk_flg);
					add($o_pre_po_tgt_flg);
					add($o_inst_rec_issue_flg);
					add($o_no_mfg_aprv_flg);
					add($o_itm_lower_yield);
					add($o_itm_std_yield);
					add($o_itm_upper_yield);
					add($o_purc_id_typ);
					add($o_rqst_wg_cd);
					add($o_rsrc_std_qty1);
					add($o_rsrc_unit_qty1);
					add($o_rsrc_std_qty2);
					add($o_rsrc_unit_qty2);
					add($o_sno1);
					add($o_sno2);
					add($o_sno3);
					add($o_sno4);
					add($o_not_mrp_flg);
					add($o_memo1);
					add($o_memo2);
					add($o_memo3);
					add($o_ins_ts);
					add($o_upd_ts);
					add($o_purc_tax_cd);
					add($o_prov_tax_cd);
					add($o_zip_cd);
					add($o_addr1);
					add($o_addr2);
					add($o_addr3);
					add($o_addr4);
					add($o_tel);
					add($o_fax);
					add($o_cur_cd);
					add($o_cur_nm);
					add($o_cntry_cd);
					add($o_cntry_nm);
					add($o_foreign_flg);
					add($o_area_cd);
					add($o_area_nm);
					add($o_site_cd);
					add($o_site_nm);
					add($o_lg_grp_cd);
					add($o_lg_grp_nm);
					add($o_alloc_grp_cd);
					add($o_alloc_grp_nm);
					add($o_loc_grp_cd);
					add($o_loc_grp_nm);
					add($o_loc_mng_typ);
					add($o_loc_mng_typ_nm);
					add($o_asst_dpt_cd);
					add($o_sls_dpt_cd);
					add($o_lg_def_flg);
					add($o_pre_outsrc_act_flg);
					add($o_ddlv_prov_insp_flg);
					add($o_loc_cal_cd);
					add($o_str_ln_tgt_flg);
					add($o_alloc_lmt_flg);
					add($o_gi_pack_xfer_flg);
					add($o_gi_vmi_flg);
					add($o_rsrc_cd1);
					add($o_rsrc_cd2);
					add($o_prnt_lcl_cd);
					add($o_asppl_cd);
					add($o_vmi_purc_dpt_cd);
					add($o_subcon_flg);
					add($o_po_print_cd);
					add($o_sppl_ship_form_cd);
					add($o_sppl_cntct_dpt);
					add($o_sppl_cntct_psn);
					add($o_sppl_cntct_psn_title);
					add($o_purc_upri_req_typ);
					add($o_purc_amt_rnd_typ);
					add($o_purc_tax_rnd_typ);
					add($o_purc_tax_calc_typ);
					add($o_wrk_po_flg);
					add($o_wrk_ap_flg);
					add($o_prov_rcv_typ);
					add($o_onr_prsppl_flg);
					add($o_prov_basis_typ);
					add($o_prov_amt_rnd_typ);
					add($o_prov_tax_rnd_typ);
					add($o_prov_tax_calc_typ);
					add($o_sppl_cal_cd);
					add($o_sppl_iv_flg);
					add($o_prms_recv_flg);
					add($o_sppl_tterm_cd1);
					add($o_sppl_tterm_cd2);
					add($o_sppl_tterm_cd3);
					add($o_purc_basis_typ);
					add($o_repurc_obli_flg);
					add($o_outsrc_upri_typ);
					add($o_amt_dec_place);
					add($o_upri_dec_place);
					add($o_ap_dpt_cd);
					add($o_purc_usr_cd);
					add($o_purc_dpt_cd);
					add($o_sppl_purc_upri_cng_flg);
					add($o_edi_po_send_tgt_flg);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_itm_cd, $s_itm_cd, ASC);
					put($sn_itm_sub1, $s_itm_sub1, ASC);
					put($sn_itm_sub2, $s_itm_sub2, ASC);
					put($sn_itm_sub3, $s_itm_sub3, ASC);
					put($sn_wg_cd, $s_wg_cd, ASC);
					put($sn_mfg_loc_cd, $s_mfg_loc_cd, ASC);
					put($sn_bom_ptn, $s_bom_ptn, ASC);
					put($sn_sppl_cd, $s_sppl_cd, ASC);
					put($sn_maker_cd, $s_maker_cd, ASC);
					put($sn_rqst_loc_cd, $s_rqst_loc_cd, ASC);
					put($sn_st_dt, $s_st_dt, ASC);
					put($sn_end_dt, $s_end_dt, ASC);
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
		public static final String[] outAll(){return MSUAC_List.ItmDtlWithSpplMakerCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.ItmDtlWithSpplMakerCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.ItmDtlWithSpplMakerCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.ItmDtlWithSpplMakerCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class ItmDtlWithSpplMakerCols extends MSUAC_List.ItmDtlWithSpplMakerCols_MC_A {
		//EIクラス
	}

}
