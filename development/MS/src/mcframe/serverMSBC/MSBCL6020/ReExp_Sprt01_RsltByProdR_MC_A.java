package mcframe.serverMSBC.MSBCL6020;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"ReExp_Sprt01_RsltByProd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ReExp_Sprt01_RsltByProdR_MC_A extends MCConstRow {

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_dec_place = "trd_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_conv_rnd_typ = "trd_unit_conv_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納先場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * For storage rack/line 格納棚・ライン対象.<p>
	 *
	 */
	public static final String $strg_str_ln_tgt_flg = "strg_str_ln_tgt_flg";
	/**
	 * Scheduled output date 出来高予定日.<p>
	 *
	 */
	public static final String $yield_schd_dt = "yield_schd_dt";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public static final String $par_inst_qty = "par_inst_qty";
	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public static final String $chd_inpt_qty = "chd_inpt_qty";
	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public static final String $strg_str_ln_cd_none_flg = "strg_str_ln_cd_none_flg";
	/**
	 * Execute Re-explosion 再展開実施.<p>
	 *
	 */
	public static final String $re_exp_flg = "re_exp_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_dec_place_META = createCommonMeta($trd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_rnd_typ_META = createCommonMeta($trd_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_schd_dt_META = createCommonMeta($yield_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_str_ln_cd_none_flg_META = createCommonMeta($strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_exp_flg_META = createCommonMeta($re_exp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ReExp_Sprt01_RsltByProdR> constMetas = new ConstMetaList<ReExp_Sprt01_RsltByProdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			yield_schd_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			disp_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			th_image_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sublot_no_ptn_cd_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_dec_place_META,
			trd_unit_conv_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			base_unit_conv_rnd_typ_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_tgt_flg_META,
			yield_schd_dt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bkf_typ_META,
			par_inst_qty_META,
			chd_inpt_qty_META,
			chd_rqmt_qty_META,
			fxd_chd_rqmt_qty_META,
			oper_cd_META,
			oper_seq_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			strg_str_ln_cd_none_flg_META,
			re_exp_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected ReExp_Sprt01_RsltByProdR_MC_A(ConstMetaList<? extends ReExp_Sprt01_RsltByProdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_RsltByProdR clone() {
		return (ReExp_Sprt01_RsltByProdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_RsltByProdR createInstance() {
		return (ReExp_Sprt01_RsltByProdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_RsltByProdR getValues(String... names) {
		return (ReExp_Sprt01_RsltByProdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * By-product pegging No. 副産品紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 3, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 3, $yield_schd_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 6, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 11, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 11, $itm_nm, value);
	}


	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 12, $th_image);
	}

	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 12, $th_image, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 14, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 14, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 15, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 15, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 16, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 16, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 17, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 17, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 18, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 18, $sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 19, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 19, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 20, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 20, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 21, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 21, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 22, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 22, $sno4_mng_typ, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 23, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 23, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 23, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 23, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 23, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 23, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 24, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 24, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 25, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 25, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_dec_place() {
		return getConstNumber(offset + 26, $trd_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(int value) {
		setConstNumber(offset + 26, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(long value) {
		setConstNumber(offset + 26, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(float value) {
		setConstNumber(offset + 26, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(double value) {
		setConstNumber(offset + 26, $trd_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_conv_rnd_typ() {
		return getConstString(offset + 27, $trd_unit_conv_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_conv_rnd_typ(String value) {
		setConstString(offset + 27, $trd_unit_conv_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 28, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 28, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 28, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 28, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 28, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 28, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 29, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 29, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 29, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 29, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 29, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 29, $conv_qty, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 30, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 30, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 30, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 30, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 30, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 30, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 31, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 31, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 32, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 32, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 33, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 33, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 33, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 33, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 33, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 33, $base_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 34, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 34, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 35, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 35, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納先場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 36, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納先場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 36, $strg_loc_nm, value);
	}


	/**
	 * For storage rack/line 格納棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 37, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage rack/line 格納棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 37, $strg_str_ln_tgt_flg, value);
	}


	/**
	 * Scheduled output date 出来高予定日.<p>
	 *
	 */
	public MCDate yield_schd_dt() {
		return getConstDate(offset + 38, $yield_schd_dt);
	}

	/**
	 * Scheduled output date 出来高予定日.<p>
	 *
	 */
	public void yield_schd_dt(MCDate value) {
		setConstDate(offset + 38, $yield_schd_dt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 39, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 39, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 40, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 40, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 41, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 41, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 42, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 42, $sno4, value);
	}


	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 43, $bkf_typ);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 43, $bkf_typ, value);
	}


	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 44, $par_inst_qty);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 44, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 44, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 44, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 44, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 44, $par_inst_qty, value);
	}


	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 45, $chd_inpt_qty);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 45, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 45, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 45, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 45, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 45, $chd_inpt_qty, value);
	}


	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 46, $chd_rqmt_qty);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 46, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 46, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 46, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 46, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 46, $chd_rqmt_qty, value);
	}


	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 47, $fxd_chd_rqmt_qty);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 47, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 47, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 47, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 47, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 47, $fxd_chd_rqmt_qty, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 48, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 48, $oper_cd, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 49, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 50, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 50, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 51, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 51, $strg_str_ln_nm, value);
	}


	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 52, $strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 52, $strg_str_ln_cd_none_flg, value);
	}


	/**
	 * Execute Re-explosion 再展開実施.<p>
	 *
	 */
	public boolean re_exp_flg() {
		return getConstBoolean(offset + 53, $re_exp_flg);
	}

	/**
	 * Execute Re-explosion 再展開実施.<p>
	 *
	 */
	public void re_exp_flg(boolean value) {
		setConstBoolean(offset + 53, $re_exp_flg, value);
	}


	public String getString(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_conv_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($yield_schd_dt.equalsIgnoreCase(name)) {
			return yield_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		if ($re_exp_flg.equalsIgnoreCase(name)) {
			return re_exp_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_conv_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($yield_schd_dt.equalsIgnoreCase(name)) {
			return yield_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		if ($re_exp_flg.equalsIgnoreCase(name)) {
			return re_exp_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($yield_schd_dt.equalsIgnoreCase(name)) {
			yield_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($re_exp_flg.equalsIgnoreCase(name)) {
			re_exp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($yield_schd_dt.equalsIgnoreCase(name)) {
			yield_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($re_exp_flg.equalsIgnoreCase(name)) {
			re_exp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

