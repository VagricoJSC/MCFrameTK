package mcframe.clientMSBE.MSBEP0110;

import mcframe.commonCore.lang.MCNumber;

/**
 * 画面遷移 T6 用のインターフェース（明細）<p>
 *
 * <br>
 */
public interface IfMSBEP0110_T6_DtlR_MC {

	/** 場所ＣＤ */
	public String loc_cd();
	/** 棚・ラインＣＤ */
	public String str_ln_cd();
	/** 品目ＣＤ */
	public String itm_cd();
	/** 枝番１ */
	public String itm_sub1();
	/** 枝番２ */
	public String itm_sub2();
	/** 枝番３ */
	public String itm_sub3();
	/** ロットＮＯ */
	public String lot_no();
	/** サブロットＮＯ */
	public String sublot_no();
	/** 版ＮＯ */
	public String ver_no();
	/** 手配ＮＯ１ */
	public String sno1();
	/** 手配ＮＯ２ */
	public String sno2();
	/** 手配ＮＯ３ */
	public String sno3();
	/** 手配ＮＯ４ */
	public String sno4();
	/** 良品区分 */
	public String quality_typ();
	/** 在庫検査区分 */
	public String stk_insp_typ();
	/** 在庫識別区分 */
	public String stk_id_typ();
	/** 在庫取引先 */
	public String stk_bp_cd();
	/** 在庫着荷先 */
	public String stk_arrv_bp_cd();
	/** 確定ＮＯ区分 */
	public String fix_no_typ();
	/** 確定ＮＯ */
	public String fix_no();
	/** 積送品区分*/
	public String in_xfr_typ();
	/** 資産区分*/
	public String asst_typ();
	/** 格付ＣＤ */
	public String gd_cd();
	/** 荷姿単位ＣＤ */
	public String pack_unit_cd();
	/** 基準単位ＣＤ */
	public String base_unit_cd();

}
