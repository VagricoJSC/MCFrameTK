package mcframe.commonMSUA.MSUAC0090;
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
	  * Bsppl_PaySchdClDay:カラム名クラス
	  */
	protected static class Bsppl_PaySchdClDayCols_MC_A  {
		/** IN:支払予定管理先ＣＤ */
		public static final String $i_bsppl_cd = "bsppl_cd";
		/** OUT:支払締日 */
		public static final String $o_bsppl_cl_day = "bsppl_cl_day";
		/** VIEW:支払締日 */
		public static final String $v_bsppl_cl_day = $o_bsppl_cl_day;
		/** VIEW_NO:支払締日 */
		protected static final MCNumber $vn_bsppl_cl_day = new MCNumber(10);
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_bsppl_cl_day);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_bsppl_cl_day, $v_bsppl_cl_day);
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
		public static final String[] outAll(){return MSUAC_List.Bsppl_PaySchdClDayCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.Bsppl_PaySchdClDayCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.Bsppl_PaySchdClDayCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.Bsppl_PaySchdClDayCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class Bsppl_PaySchdClDayCols extends MSUAC_List.Bsppl_PaySchdClDayCols_MC_A {
		//EIクラス
	}


	/** 
	  * AdvPay:カラム名クラス
	  */
	protected static class AdvPayCols_MC_A  {
		/** IN:支払予定管理先ＣＤ */
		public static final String $i_bsppl_cd = "bsppl_cd";
		/** IN:支払予定管理先名 */
		public static final String $i_bsppl_nm = "bsppl_nm";
		/** IN:支払予定管理先部門ＣＤ */
		public static final String $i_bsppl_dpt_cd = "bsppl_dpt_cd";
		/** IN:支払予定管理先部門名 */
		public static final String $i_bsppl_dpt_nm = "bsppl_dpt_nm";
		/** IN:支払予定管理先ＷＧＣＤ */
		public static final String $i_bsppl_wg_cd = "bsppl_wg_cd";
		/** IN:支払予定管理先ＷＧ名 */
		public static final String $i_bsppl_wg_nm = "bsppl_wg_nm";
		/** IN:取引通貨ＣＤ */
		public static final String $i_trd_cur_cd = "trd_cur_cd";
		/** IN:取引通貨名 */
		public static final String $i_trd_cur_nm = "trd_cur_nm";
		/** IN:支払部門ＣＤ */
		public static final String $i_pay_dpt_cd = "pay_dpt_cd";
		/** IN:支払部門名 */
		public static final String $i_pay_dpt_nm = "pay_dpt_nm";
		/** IN:支払担当者ＣＤ */
		public static final String $i_pay_usr_cd = "pay_usr_cd";
		/** IN:支払担当者名 */
		public static final String $i_pay_usr_nm = "pay_usr_nm";
		/** IN:支払部門ＷＧＣＤ */
		public static final String $i_pay_dpt_wg_cd = "pay_dpt_wg_cd";
		/** IN:支払部門ＷＧ名 */
		public static final String $i_pay_dpt_wg_nm = "pay_dpt_wg_nm";
		/** IN:負担部門ＣＤ */
		public static final String $i_bd_dpt_cd = "bd_dpt_cd";
		/** IN:負担部門名 */
		public static final String $i_bd_dpt_nm = "bd_dpt_nm";
		/** IN:支払実績日ＦＲＯＭ */
		public static final String $i_pay_act_dt_fr = "pay_act_dt_fr";
		/** IN:支払実績日ＴＯ */
		public static final String $i_pay_act_dt_to = "pay_act_dt_to";
		/** IN:計上日ＦＲＯＭ */
		public static final String $i_ac_dt_fr = "ac_dt_fr";
		/** IN:計上日ＴＯ */
		public static final String $i_ac_dt_to = "ac_dt_to";
		/** IN:前渡金実績ＮＯ */
		public static final String $i_adv_pay_act_no = "adv_pay_act_no";
		/** IN:手形番号 */
		public static final String $i_note_no = "note_no";
		/** IN:債務決済方法ＣＤ */
		public static final String $i_ap_sttl_cd = "ap_sttl_cd";
		/** IN:債務決済方法名 */
		public static final String $i_ap_sttl_nm = "ap_sttl_nm";
		/** OUT:前渡金支払実績ＮＯ */
		public static final String $o_adv_pay_act_no = "adv_pay_act_no";
		/** OUT:取引相殺対象額 */
		public static final String $o_trd_cur_setoff_tgt_amt = "trd_cur_setoff_tgt_amt";
		/** OUT:取引通貨相殺予定額 */
		public static final String $o_trd_cur_setoff_schd_amt = "trd_cur_setoff_schd_amt";
		/** OUT:取引通貨相殺実績額 */
		public static final String $o_trd_cur_setoff_act_amt = "trd_cur_setoff_act_amt";
		/** OUT:取引通貨未処理残高 */
		public static final String $o_trd_cur_not_proc_bal = "trd_cur_not_proc_bal";
		/** OUT:計上日 */
		public static final String $o_ac_dt = "ac_dt";
		/** OUT:支払実績日 */
		public static final String $o_pay_act_dt = "pay_act_dt";
		/** OUT:債務決済方法ＣＤ */
		public static final String $o_ap_sttl_cd = "ap_sttl_cd";
		/** OUT:債務決済方法名 */
		public static final String $o_ap_sttl_nm = "ap_sttl_nm";
		/** OUT:債務決済区分 */
		public static final String $o_ap_sttl_typ = "ap_sttl_typ";
		/** OUT:債務決済区分名 */
		public static final String $o_ap_sttl_typ_nm = "ap_sttl_typ_nm";
		/** OUT:支払部門ＣＤ */
		public static final String $o_pay_dpt_cd = "pay_dpt_cd";
		/** OUT:支払部門名 */
		public static final String $o_pay_dpt_nm = "pay_dpt_nm";
		/** OUT:支払担当者ＣＤ */
		public static final String $o_pay_usr_cd = "pay_usr_cd";
		/** OUT:支払担当者名 */
		public static final String $o_pay_usr_nm = "pay_usr_nm";
		/** OUT:負担部門ＣＤ */
		public static final String $o_bd_dpt_cd = "bd_dpt_cd";
		/** OUT:負担部門名 */
		public static final String $o_bd_dpt_nm = "bd_dpt_nm";
		/** OUT:源泉税率 */
		public static final String $o_xrate = "xrate";
		/** OUT:取引備考 */
		public static final String $o_trd_rmrks = "trd_rmrks";
		/** OUT:手形番号 */
		public static final String $o_note_no = "note_no";
		/** OUT:手形区分 */
		public static final String $o_note_typ = "note_typ";
		/** OUT:手形区分名 */
		public static final String $o_note_typ_nm = "note_typ_nm";
		/** OUT:手形理由ＣＤ */
		public static final String $o_note_rsn_cd = "note_rsn_cd";
		/** OUT:手形理由名 */
		public static final String $o_note_rsn_nm = "note_rsn_nm";
		/** OUT:振出日 */
		public static final String $o_draw_dt = "draw_dt";
		/** OUT:支払期日 */
		public static final String $o_due_dt = "due_dt";
		/** OUT:手形サイト */
		public static final String $o_note_days = "note_days";
		/** OUT:振出人名 */
		public static final String $o_drawer_nm = "drawer_nm";
		/** OUT:振出銀行ＣＤ */
		public static final String $o_draw_bank_cd = "draw_bank_cd";
		/** OUT:振出銀行名 */
		public static final String $o_draw_bank_nm = "draw_bank_nm";
		/** OUT:振出支店ＣＤ */
		public static final String $o_draw_branch_cd = "draw_branch_cd";
		/** OUT:振出支店名 */
		public static final String $o_draw_branch_nm = "draw_branch_nm";
		/** OUT:裏書人 */
		public static final String $o_endrsr = "endrsr";
		/** OUT:引受人 */
		public static final String $o_accptr = "accptr";
		/** VIEW:前渡金支払実績ＮＯ */
		public static final String $v_adv_pay_act_no = $o_adv_pay_act_no;
		/** VIEW_NO:前渡金支払実績ＮＯ */
		protected static final MCNumber $vn_adv_pay_act_no = new MCNumber(10);
		/** SORT:前渡金支払実績ＮＯ */
		public static final String $s_adv_pay_act_no = $o_adv_pay_act_no;
		/** SORT_NO:前渡金支払実績ＮＯ */
		protected static final MCNumber $sn_adv_pay_act_no = new MCNumber(10);
		/** OTHER:入力補助画面モジュールＩＤ */
		public static final String $p_ispnl_mod_id = "MS";
		/** OTHER:入力補助画面画面ＩＤ */
		public static final String $p_ispnl_scr_id = "MSUAP1130";
		@SuppressWarnings("serial")
		protected static final List<String> $out_cols_MC = 
				new ArrayList<String>(){{
					add($o_adv_pay_act_no);
					add($o_trd_cur_setoff_tgt_amt);
					add($o_trd_cur_setoff_schd_amt);
					add($o_trd_cur_setoff_act_amt);
					add($o_trd_cur_not_proc_bal);
					add($o_ac_dt);
					add($o_pay_act_dt);
					add($o_ap_sttl_cd);
					add($o_ap_sttl_nm);
					add($o_ap_sttl_typ);
					add($o_ap_sttl_typ_nm);
					add($o_pay_dpt_cd);
					add($o_pay_dpt_nm);
					add($o_pay_usr_cd);
					add($o_pay_usr_nm);
					add($o_bd_dpt_cd);
					add($o_bd_dpt_nm);
					add($o_xrate);
					add($o_trd_rmrks);
					add($o_note_no);
					add($o_note_typ);
					add($o_note_typ_nm);
					add($o_note_rsn_cd);
					add($o_note_rsn_nm);
					add($o_draw_dt);
					add($o_due_dt);
					add($o_note_days);
					add($o_drawer_nm);
					add($o_draw_bank_cd);
					add($o_draw_bank_nm);
					add($o_draw_branch_cd);
					add($o_draw_branch_nm);
					add($o_endrsr);
					add($o_accptr);
				}};;
		@SuppressWarnings("serial")
		protected static final SortedMap<MCNumber, String> $view_cols_MC = 
				new TreeMap<MCNumber, String>(){{
					put($vn_adv_pay_act_no, $v_adv_pay_act_no);
				}};;
		protected static final FXBAC_ListSortInfo $sort_cols_MC = 
				new FXBAC_ListSortInfo(){{
					put($sn_adv_pay_act_no, $s_adv_pay_act_no, ASC);
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
		public static final String[] outAll(){return MSUAC_List.AdvPayCols.getOutCols().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final String[] viewCols(){return MSUAC_List.AdvPayCols.getViewCols().values().toArray(FXBAC_ListLogicBase.$DUMMY_ARRAY); }
		public static final MCSortPolicy sortPolicy(){return MSUAC_List.AdvPayCols.getSortInfo().createSortPolicy(); }
		public static final String[] sortCols(){return MSUAC_List.AdvPayCols.getSortInfo().createSortPolicy().nameArray(); }
	}
	public static class AdvPayCols extends MSUAC_List.AdvPayCols_MC_A {
		//EIクラス
	}

}
