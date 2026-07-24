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
 * ブロック"ReExp_Sprt01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ReExp_Sprt01_HdrR_MC_A extends MCConstRow {

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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public static final String $oper_inst_qty = "oper_inst_qty";
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
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


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_inst_qty_META = createCommonMeta($oper_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_str_ln_cd_none_flg_META = createCommonMeta($oper_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_str_ln_cd_none_flg_META = createCommonMeta($strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ReExp_Sprt01_HdrR> constMetas = new ConstMetaList<ReExp_Sprt01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			oper_cd_META,
			oper_seq_META,
			oper_loc_cd_META,
			oper_inst_qty_META,
			mfg_st_schd_dt_META,
			st_schd_dt_META,
			end_schd_dt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			cur_cd_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_str_ln_cd_none_flg_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			strg_str_ln_cd_none_flg_META
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
	protected ReExp_Sprt01_HdrR_MC_A(ConstMetaList<? extends ReExp_Sprt01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_HdrR clone() {
		return (ReExp_Sprt01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_HdrR createInstance() {
		return (ReExp_Sprt01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt01_HdrR getValues(String... names) {
		return (ReExp_Sprt01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 2, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 2, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 3, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 3, $oper_inst_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 8, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 8, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 9, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 9, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 10, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 10, $oper_cd, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 11, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 12, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 12, $oper_loc_cd, value);
	}


	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public MCNumber oper_inst_qty() {
		return getConstNumber(offset + 13, $oper_inst_qty);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_inst_qty(MCNumber value) {
		setConstNumber(offset + 13, $oper_inst_qty, value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_inst_qty(int value) {
		setConstNumber(offset + 13, $oper_inst_qty, value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_inst_qty(long value) {
		setConstNumber(offset + 13, $oper_inst_qty, value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_inst_qty(float value) {
		setConstNumber(offset + 13, $oper_inst_qty, value);
	}

	/**
	 * Operation order qty. 工程指図数量.<p>
	 *
	 */
	public void oper_inst_qty(double value) {
		setConstNumber(offset + 13, $oper_inst_qty, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 14, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 14, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 15, $st_schd_dt);
	}

	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 15, $st_schd_dt, value);
	}


	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 16, $end_schd_dt);
	}

	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 16, $end_schd_dt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 17, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 17, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 18, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 18, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 19, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 19, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 20, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 20, $sno4, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 21, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 21, $cur_cd, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 22, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 22, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 23, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 23, $oper_str_ln_nm, value);
	}


	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 24, $oper_str_ln_cd_none_flg);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 24, $oper_str_ln_cd_none_flg, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 25, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 25, $strg_loc_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 26, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 26, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 27, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 27, $strg_str_ln_nm, value);
	}


	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 28, $strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 28, $strg_str_ln_cd_none_flg, value);
	}


	public String getString(String name) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			return oper_inst_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			return oper_inst_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_inst_qty.equalsIgnoreCase(name)) {
			oper_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

