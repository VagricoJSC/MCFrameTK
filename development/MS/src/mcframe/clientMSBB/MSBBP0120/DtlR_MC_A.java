package mcframe.clientMSBB.MSBBP0120;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Firm (At search) 確定（検索時）.<p>
	 *
	 */
	public static final String $old_fix_flg = "old_fix_flg";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public static final String $spln_set_typ = "spln_set_typ";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";


	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_fix_flg_META = createCommonMeta($old_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta spln_set_typ_META = createCommonMeta($spln_set_typ, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMS.meta.MS_META.SPLN_DISP_SEQ);
	public static final MCMeta spln_ym_META = createCommonMeta($spln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			fix_flg_META,
			old_fix_flg_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			cur_cd_META,
			cur_nm_META,
			unit_cd_META,
			unit_nm_META,
			amt_dec_place_META,
			spln_set_typ_META,
			disp_seq_META,
			spln_ym_META,
			spln_qty_META,
			spln_amt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$grp_peg_no, "HKEY"},	// grp_peg_no
				{$old_fix_flg, "HKEY"},	// old_fix_flg
				{$spln_itm_cd, "HKEY"},	// spln_itm_cd
				{$spln_itm_nm, "HKEY"},	// spln_itm_nm
				{$itm_cd, "HKEY"},	// itm_cd
				{$itm_sub1, "HKEY"},	// itm_sub1
				{$itm_sub2, "HKEY"},	// itm_sub2
				{$itm_sub3, "HKEY"},	// itm_sub3
				{$itm_nm, "HKEY"},	// itm_nm
				{$cur_cd, "HKEY"},	// cur_cd
				{$cur_nm, "HKEY"},	// cur_nm
				{$unit_cd, "HKEY"},	// unit_cd
				{$unit_nm, "HKEY"},	// unit_nm
				{$amt_dec_place, "HKEY"},	// amt_dec_place
				{$spln_set_typ, "HKEY"},	// spln_set_typ
				{$disp_seq, "HKEY"},	// disp_seq
				{$spln_ym, "ELM"},	// spln_ym
				{$spln_qty, "HVAL"},	// spln_qty
				{$spln_amt, "HVAL"}	// spln_amt
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 1, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 1, $fix_flg, value);
	}


	/**
	 * Firm (At search) 確定（検索時）.<p>
	 *
	 */
	public boolean old_fix_flg() {
		return getConstBoolean(offset + 2, $old_fix_flg);
	}

	/**
	 * Firm (At search) 確定（検索時）.<p>
	 *
	 */
	public void old_fix_flg(boolean value) {
		setConstBoolean(offset + 2, $old_fix_flg, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 3, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 3, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 4, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 4, $spln_itm_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 10, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 10, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 11, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 11, $cur_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 12, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 12, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 13, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 13, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 14, $amt_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}


	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public String spln_set_typ() {
		return getConstString(offset + 15, $spln_set_typ);
	}

	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public void spln_set_typ(String value) {
		setConstString(offset + 15, $spln_set_typ, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 16, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 16, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 16, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 16, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 16, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 16, $disp_seq, value);
	}


	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public MCDate spln_ym() {
		return getConstDate(offset + 17, $spln_ym);
	}

	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public void spln_ym(MCDate value) {
		setConstDate(offset + 17, $spln_ym, value);
	}


	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 18, $spln_qty);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 18, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 18, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 18, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 18, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 18, $spln_qty, value);
	}


	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 19, $spln_amt);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 19, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 19, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 19, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 19, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 19, $spln_amt, value);
	}


	public String getString(String name) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			return old_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			return old_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			old_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			old_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

