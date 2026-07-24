package mcframe.commonMSUA.MSUAC0070;
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
	  * SublotNo:カラム名クラス
	  */
	protected static class SublotNoCols_MC_A  {
		/** IN:品目ＣＤ（必須） */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１（必須） */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２（必須） */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３（必須） */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:ロットＮＯ（必須） */
		public static final String $i_lot_no = "lot_no";
		/** OUT:サブロットＮＯ */
		public static final String $o_sublot_no = "sublot_no";
		/** OUT:版ＮＯ */
		public static final String $o_ver_no = "ver_no";
		/** OUT:業者ロットＮＯ */
		public static final String $o_bp_lot_no = "bp_lot_no";
		/** OUT:最古入庫日 */
		public static final String $o_first_gr_dt = "first_gr_dt";
		/** OUT:有効期限 */
		public static final String $o_vld_dt = "vld_dt";
		/** OUT:使用期限 */
		public static final String $o_lmt_dt = "lmt_dt";
		/** OUT:起算日 */
		public static final String $o_lmt_dt_frm = "lmt_dt_frm";
		/** OUT:ロット備考 */
		public static final String $o_lot_rmrks = "lot_rmrks";
		/** OUT:在庫検査区分 */
		public static final String $o_stk_insp_typ = "stk_insp_typ";
		/** OUT:在庫検査区分名 */
		public static final String $o_stk_insp_typ_nm = "stk_insp_typ_nm";
		/** OUT:良品区分 */
		public static final String $o_quality_typ = "quality_typ";
		/** OUT:良品区分名 */
		public static final String $o_quality_typ_nm = "quality_typ_nm";
		/** OUT:製造承認状況区分 */
		public static final String $o_mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
		/** OUT:製造承認状況区分名 */
		public static final String $o_mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
		/** OUT:検査承認状況区分 */
		public static final String $o_insp_aprv_sts_typ = "insp_aprv_sts_typ";
		/** OUT:検査承認状況区分名 */
		public static final String $o_insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
		/** OUT:工場出荷承認状況区分 */
		public static final String $o_plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
		/** OUT:工場出荷承認状況区分名 */
		public static final String $o_plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
		/** OUT:市場出荷判定状況区分 */
		public static final String $o_mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
		/** OUT:市場出荷判定状況区分名 */
		public static final String $o_mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
		/** OUT:実際有効成分係数 */
		public static final String $o_act_cont_fctr = "act_cont_fctr";
		/** OUT:期限起算日区分 */
		public static final String $o_lmt_dt_frm_typ = "lmt_dt_frm_typ";
		/** OUT:期限起算日区分名 */
		public static final String $o_lmt_dt_frm_typ_nm = "lmt_dt_frm_typ_nm";
		/** OUT:ロットシーケンス */
		public static final String $o_lot_seq = "lot_seq";
		/** VIEW:サブロットＮＯ */
		public static final String $v_sublot_no = $o_sublot_no;
		/** VIEW_NO:サブロットＮＯ */
		protected static final MCNumber $vn_sublot_no = new MCNumber(10);
		/** SORT:サブロットＮＯ */
		public static final String $s_sublot_no = $o_sublot_no;
		/** SORT_NO:サブロットＮＯ */
		protected static final MCNumber $sn_sublot_no = new MCNumber(10);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBFL0105";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り。 */
		public static final String $k_oth_key = "itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_sublot_no);
					add($o_ver_no);
					add($o_bp_lot_no);
					add($o_first_gr_dt);
					add($o_vld_dt);
					add($o_lmt_dt);
					add($o_lmt_dt_frm);
					add($o_lot_rmrks);
					add($o_stk_insp_typ);
					add($o_stk_insp_typ_nm);
					add($o_quality_typ);
					add($o_quality_typ_nm);
					add($o_mfg_aprv_sts_typ);
					add($o_mfg_aprv_sts_typ_nm);
					add($o_insp_aprv_sts_typ);
					add($o_insp_aprv_sts_typ_nm);
					add($o_plnt_aprv_sts_typ);
					add($o_plnt_aprv_sts_typ_nm);
					add($o_mrkt_judg_sts_typ);
					add($o_mrkt_judg_sts_typ_nm);
					add($o_act_cont_fctr);
					add($o_lmt_dt_frm_typ);
					add($o_lmt_dt_frm_typ_nm);
					add($o_lot_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_sublot_no, $v_sublot_no);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_sublot_no, $s_sublot_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.SublotNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.SublotNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.SublotNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.SublotNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class SublotNoCols extends MSUAC_List.SublotNoCols_MC_A {
		//EIクラス
	}


	/** 
	  * LotNo:カラム名クラス
	  */
	protected static class LotNoCols_MC_A  {
		/** IN:品目ＣＤ（必須） */
		public static final String $i_itm_cd = "itm_cd";
		/** IN:枝番１（必須） */
		public static final String $i_itm_sub1 = "itm_sub1";
		/** IN:枝番２（必須） */
		public static final String $i_itm_sub2 = "itm_sub2";
		/** IN:枝番３（必須） */
		public static final String $i_itm_sub3 = "itm_sub3";
		/** IN:品名 */
		public static final String $i_itm_nm = "itm_nm";
		/** IN:ロットＮＯ */
		public static final String $i_lot_no = "lot_no";
		/** IN:版ＮＯ */
		public static final String $i_ver_no = "ver_no";
		/** IN:有効期限ＦＲＯＭ */
		public static final String $i_vld_dt_fr = "vld_dt_fr";
		/** IN:有効期限ＴＯ */
		public static final String $i_vld_dt_to = "vld_dt_to";
		/** IN:使用期限ＦＲＯＭ */
		public static final String $i_lmt_dt_fr = "lmt_dt_fr";
		/** IN:使用期限ＴＯ */
		public static final String $i_lmt_dt_to = "lmt_dt_to";
		/** IN:最古入庫日ＦＲＯＭ */
		public static final String $i_first_gr_dt_fr = "first_gr_dt_fr";
		/** IN:最古入庫日ＴＯ */
		public static final String $i_first_gr_dt_to = "first_gr_dt_to";
		/** IN:製造承認状況区分 */
		public static final String $i_mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
		/** IN:在庫検査区分 */
		public static final String $i_stk_insp_typ = "stk_insp_typ";
		/** IN:良品区分 */
		public static final String $i_quality_typ = "quality_typ";
		/** IN:検査承認状況区分 */
		public static final String $i_insp_aprv_sts_typ = "insp_aprv_sts_typ";
		/** IN:工場出荷承認状況区分 */
		public static final String $i_plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
		/** IN:市場出荷判定状況区分 */
		public static final String $i_mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
		/** IN:ロット備考 */
		public static final String $i_lot_rmrks = "lot_rmrks";
		/** IN:品目編集不可ＦＬＧ */
		public static final String $i_itm_ro_flg = "itm_ro_flg";
		/** IN:在庫・入庫予定がないロットも含む */
		public static final String $i_srch_no_stk_and_io_flg = "srch_no_stk_and_io_flg";
		/** OUT:ロットＮＯ */
		public static final String $o_lot_no = "lot_no";
		/** OUT:サブロットＮＯ */
		public static final String $o_sublot_no = "sublot_no";
		/** OUT:版ＮＯ */
		public static final String $o_ver_no = "ver_no";
		/** OUT:業者ロットＮＯ */
		public static final String $o_bp_lot_no = "bp_lot_no";
		/** OUT:最古入庫日 */
		public static final String $o_first_gr_dt = "first_gr_dt";
		/** OUT:有効期限 */
		public static final String $o_vld_dt = "vld_dt";
		/** OUT:使用期限 */
		public static final String $o_lmt_dt = "lmt_dt";
		/** OUT:起算日 */
		public static final String $o_lmt_dt_frm = "lmt_dt_frm";
		/** OUT:ロット備考 */
		public static final String $o_lot_rmrks = "lot_rmrks";
		/** OUT:在庫検査区分 */
		public static final String $o_stk_insp_typ = "stk_insp_typ";
		/** OUT:在庫検査区分名 */
		public static final String $o_stk_insp_typ_nm = "stk_insp_typ_nm";
		/** OUT:良品区分 */
		public static final String $o_quality_typ = "quality_typ";
		/** OUT:良品区分名 */
		public static final String $o_quality_typ_nm = "quality_typ_nm";
		/** OUT:製造承認状況区分 */
		public static final String $o_mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
		/** OUT:製造承認状況区分名 */
		public static final String $o_mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
		/** OUT:検査承認状況区分 */
		public static final String $o_insp_aprv_sts_typ = "insp_aprv_sts_typ";
		/** OUT:検査承認状況区分名 */
		public static final String $o_insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
		/** OUT:工場出荷承認状況区分 */
		public static final String $o_plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
		/** OUT:工場出荷承認状況区分名 */
		public static final String $o_plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
		/** OUT:市場出荷判定状況区分 */
		public static final String $o_mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
		/** OUT:市場出荷判定状況区分名 */
		public static final String $o_mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
		/** OUT:実際有効成分係数 */
		public static final String $o_act_cont_fctr = "act_cont_fctr";
		/** OUT:期限起算日区分 */
		public static final String $o_lmt_dt_frm_typ = "lmt_dt_frm_typ";
		/** OUT:期限起算日区分名 */
		public static final String $o_lmt_dt_frm_typ_nm = "lmt_dt_frm_typ_nm";
		/** OUT:ロットシーケンス */
		public static final String $o_lot_seq = "lot_seq";
		/** VIEW:ロットＮＯ */
		public static final String $v_lot_no = $o_lot_no;
		/** VIEW_NO:ロットＮＯ */
		protected static final MCNumber $vn_lot_no = new MCNumber(10);
		/** VIEW:サブロットＮＯ */
		public static final String $v_sublot_no = $o_sublot_no;
		/** VIEW_NO:サブロットＮＯ */
		protected static final MCNumber $vn_sublot_no = new MCNumber(20);
		/** SORT:ロットＮＯ */
		public static final String $s_lot_no = $o_lot_no;
		/** SORT_NO:ロットＮＯ */
		protected static final MCNumber $sn_lot_no = new MCNumber(10);
		/** SORT:サブロットＮＯ */
		public static final String $s_sublot_no = $o_sublot_no;
		/** SORT_NO:サブロットＮＯ */
		protected static final MCNumber $sn_sublot_no = new MCNumber(20);
		/** OTHER:リストロジック存在チェックエラー時のメッセージＩＤ */
		public static final String $p_chk_msg = "MSBFL0104";
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1010";
		/** OTHER:out先頭項目以外のキー項目。存在チェック複数キー用。カンマ区切り。 */
		public static final String $k_oth_key = "itm_cd,itm_sub1,itm_sub2,itm_sub3";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_lot_no);
					add($o_sublot_no);
					add($o_ver_no);
					add($o_bp_lot_no);
					add($o_first_gr_dt);
					add($o_vld_dt);
					add($o_lmt_dt);
					add($o_lmt_dt_frm);
					add($o_lot_rmrks);
					add($o_stk_insp_typ);
					add($o_stk_insp_typ_nm);
					add($o_quality_typ);
					add($o_quality_typ_nm);
					add($o_mfg_aprv_sts_typ);
					add($o_mfg_aprv_sts_typ_nm);
					add($o_insp_aprv_sts_typ);
					add($o_insp_aprv_sts_typ_nm);
					add($o_plnt_aprv_sts_typ);
					add($o_plnt_aprv_sts_typ_nm);
					add($o_mrkt_judg_sts_typ);
					add($o_mrkt_judg_sts_typ_nm);
					add($o_act_cont_fctr);
					add($o_lmt_dt_frm_typ);
					add($o_lmt_dt_frm_typ_nm);
					add($o_lot_seq);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_lot_no, $v_lot_no);
					put($vn_sublot_no, $v_sublot_no);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_lot_no, $s_lot_no, ASC);
					put($sn_sublot_no, $s_sublot_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.LotNoCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.LotNoCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.LotNoCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.LotNoCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class LotNoCols extends MSUAC_List.LotNoCols_MC_A {
		//EIクラス
	}

}
