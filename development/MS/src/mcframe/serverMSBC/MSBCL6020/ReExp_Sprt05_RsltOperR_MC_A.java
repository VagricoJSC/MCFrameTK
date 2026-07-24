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
 * ブロック"ReExp_Sprt05_RsltOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ReExp_Sprt05_RsltOperR_MC_A extends MCConstRow {

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
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
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public static final String $oper_unit_qty = "oper_unit_qty";
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public static final String $oper_str_ln_tgt_flg = "oper_str_ln_tgt_flg";
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public static final String $oper_str_ln_cd_none_flg = "oper_str_ln_cd_none_flg";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public static final String $oper_lt_add_qty = "oper_lt_add_qty";
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public static final String $oper_offst_add_qty = "oper_offst_add_qty";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Operation unit rounding type 工程単位端数処理区分.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ = "unit_conv_rnd_typ";
	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public static final String $yield_oper_ratio = "yield_oper_ratio";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
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
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public static final String $lmt_fr_dt_flg = "lmt_fr_dt_flg";
	/**
	 * Updated with explosion result 展開結果で更新済.<p>
	 *
	 */
	public static final String $upd_flg = "upd_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_qty_META = createCommonMeta($oper_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_tgt_flg_META = createCommonMeta($oper_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_str_ln_cd_none_flg_META = createCommonMeta($oper_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_lt_add_qty_META = createCommonMeta($oper_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_offst_add_qty_META = createCommonMeta($oper_offst_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta yield_oper_ratio_META = createCommonMeta($yield_oper_ratio, mcframe.commonMA.meta.MA_META.YIELD_OPER_RATIO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta lmt_fr_dt_flg_META = createCommonMeta($lmt_fr_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_flg_META = createCommonMeta($upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ReExp_Sprt05_RsltOperR> constMetas = new ConstMetaList<ReExp_Sprt05_RsltOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			oper_unit_qty_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			yield_oper_flg_META,
			st_schd_tm_META,
			end_schd_tm_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_tgt_flg_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_str_ln_cd_none_flg_META,
			oper_ptn_META,
			bkf_flg_META,
			wk_cost_calc_flg_META,
			oper_inst_grp_META,
			wip_rate_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			oper_lt_META,
			oper_lt_add_qty_META,
			oper_offst_typ_META,
			oper_offst_META,
			oper_offst_add_qty_META,
			dec_place_META,
			unit_conv_rnd_typ_META,
			yield_oper_ratio_META,
			oper_ord_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			lmt_fr_dt_flg_META,
			upd_flg_META
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
	protected ReExp_Sprt05_RsltOperR_MC_A(ConstMetaList<? extends ReExp_Sprt05_RsltOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt05_RsltOperR clone() {
		return (ReExp_Sprt05_RsltOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt05_RsltOperR createInstance() {
		return (ReExp_Sprt05_RsltOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt05_RsltOperR getValues(String... names) {
		return (ReExp_Sprt05_RsltOperR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
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
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 2, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 2, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 3, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 3, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 4, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 5, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 5, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 5, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 5, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 5, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 5, $disp_seq, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 6, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 7, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 7, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 8, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 8, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 9, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}


	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public MCNumber oper_unit_qty() {
		return getConstNumber(offset + 10, $oper_unit_qty);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $oper_unit_qty, value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(int value) {
		setConstNumber(offset + 10, $oper_unit_qty, value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(long value) {
		setConstNumber(offset + 10, $oper_unit_qty, value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(float value) {
		setConstNumber(offset + 10, $oper_unit_qty, value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(double value) {
		setConstNumber(offset + 10, $oper_unit_qty, value);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 11, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 11, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 12, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 12, $oper_unit_nm, value);
	}


	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 13, $yield_oper_flg);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 13, $yield_oper_flg, value);
	}


	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 14, $st_schd_tm);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 14, $st_schd_tm, value);
	}


	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 15, $end_schd_tm);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 15, $end_schd_tm, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 16, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 16, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 17, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 17, $oper_loc_nm, value);
	}


	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public boolean oper_str_ln_tgt_flg() {
		return getConstBoolean(offset + 18, $oper_str_ln_tgt_flg);
	}

	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public void oper_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 18, $oper_str_ln_tgt_flg, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 19, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 19, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 20, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 20, $oper_str_ln_nm, value);
	}


	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 21, $oper_str_ln_cd_none_flg);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 21, $oper_str_ln_cd_none_flg, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 22, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 22, $oper_ptn, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 23, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 23, $bkf_flg, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 24, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 24, $wk_cost_calc_flg, value);
	}


	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 25, $oper_inst_grp);
	}

	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 25, $oper_inst_grp, value);
	}


	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 26, $wip_rate);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 26, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 26, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 26, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 26, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 26, $wip_rate, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 27, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 28, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 29, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 29, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 29, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 29, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 29, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 29, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 30, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 30, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 30, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 30, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 30, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 30, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 31, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}


	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 32, $oper_lt);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 32, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 32, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 32, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 32, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 32, $oper_lt, value);
	}


	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return getConstNumber(offset + 33, $oper_lt_add_qty);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 33, $oper_lt_add_qty, value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		setConstNumber(offset + 33, $oper_lt_add_qty, value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		setConstNumber(offset + 33, $oper_lt_add_qty, value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		setConstNumber(offset + 33, $oper_lt_add_qty, value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		setConstNumber(offset + 33, $oper_lt_add_qty, value);
	}


	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 34, $oper_offst_typ);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 34, $oper_offst_typ, value);
	}


	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 35, $oper_offst);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 35, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 35, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 35, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 35, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 35, $oper_offst, value);
	}


	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return getConstNumber(offset + 36, $oper_offst_add_qty);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		setConstNumber(offset + 36, $oper_offst_add_qty, value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		setConstNumber(offset + 36, $oper_offst_add_qty, value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		setConstNumber(offset + 36, $oper_offst_add_qty, value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		setConstNumber(offset + 36, $oper_offst_add_qty, value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		setConstNumber(offset + 36, $oper_offst_add_qty, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 37, $dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 37, $dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 37, $dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 37, $dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 37, $dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 37, $dec_place, value);
	}


	/**
	 * Operation unit rounding type 工程単位端数処理区分.<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 38, $unit_conv_rnd_typ);
	}

	/**
	 * Operation unit rounding type 工程単位端数処理区分.<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 38, $unit_conv_rnd_typ, value);
	}


	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return getConstNumber(offset + 39, $yield_oper_ratio);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		setConstNumber(offset + 39, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		setConstNumber(offset + 39, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		setConstNumber(offset + 39, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		setConstNumber(offset + 39, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		setConstNumber(offset + 39, $yield_oper_ratio, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 40, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 40, $oper_ord_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 41, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 41, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 42, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 42, $oper_inst_no, value);
	}


	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public boolean lmt_fr_dt_flg() {
		return getConstBoolean(offset + 43, $lmt_fr_dt_flg);
	}

	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public void lmt_fr_dt_flg(boolean value) {
		setConstBoolean(offset + 43, $lmt_fr_dt_flg, value);
	}


	/**
	 * Updated with explosion result 展開結果で更新済.<p>
	 *
	 */
	public boolean upd_flg() {
		return getConstBoolean(offset + 44, $upd_flg);
	}

	/**
	 * Updated with explosion result 展開結果で更新済.<p>
	 *
	 */
	public void upd_flg(boolean value) {
		setConstBoolean(offset + 44, $upd_flg, value);
	}


	public String getString(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

