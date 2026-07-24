package mcframe.serverMGBE.MGBEL0210;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_parent_flg = "dummy_parent_flg";
	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_child_flg = "dummy_child_flg";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public static final String $unit_qty = "unit_qty";
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
	public static final String $dec_place = "dec_place";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public static final String $unit_upri = "unit_upri";
	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public static final String $unit_diff = "unit_diff";
	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public static final String $base_upri = "base_upri";
	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public static final String $base_diff = "base_diff";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $inc_per = "inc_per";


	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_parent_flg_META = createCommonMeta($dummy_parent_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_child_flg_META = createCommonMeta($dummy_child_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_qty_META = createCommonMeta($unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_upri_META = createCommonMeta($unit_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_diff_META = createCommonMeta($unit_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_upri_META = createCommonMeta($base_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_diff_META = createCommonMeta($base_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_per_META = createCommonMeta($inc_per, mcframe.commonMA.meta.MA_META.RATE);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_parent_flg_META,
			dummy_child_flg_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			base_qty_META,
			unit_qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			term_META,
			std_qty_META,
			std_upri_META,
			unit_upri_META,
			unit_diff_META,
			base_upri_META,
			base_diff_META,
			inc_per_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 0, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 0, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 1, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 1, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 2, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 2, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 3, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 3, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 4, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 4, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 5, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 5, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 6, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 6, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 7, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 7, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 8, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 8, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 9, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 9, $dummy_itm_grp10, value);
	}


	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_parent_flg() {
		return getConstBoolean(offset + 10, $dummy_parent_flg);
	}

	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_parent_flg(boolean value) {
		setConstBoolean(offset + 10, $dummy_parent_flg, value);
	}


	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_child_flg() {
		return getConstBoolean(offset + 11, $dummy_child_flg);
	}

	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_child_flg(boolean value) {
		setConstBoolean(offset + 11, $dummy_child_flg, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 12, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 12, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 13, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 13, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 16, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 16, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 17, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 17, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 18, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 18, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 19, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 19, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 20, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 20, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 21, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 21, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 22, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 22, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 23, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 23, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 24, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 24, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 25, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 25, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 26, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 26, $itm_jnl_nm, value);
	}


	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 27, $base_qty);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 27, $base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 27, $base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 27, $base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 27, $base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 27, $base_qty, value);
	}


	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public MCNumber unit_qty() {
		return getConstNumber(offset + 28, $unit_qty);
	}

	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public void unit_qty(MCNumber value) {
		setConstNumber(offset + 28, $unit_qty, value);
	}

	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public void unit_qty(int value) {
		setConstNumber(offset + 28, $unit_qty, value);
	}

	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public void unit_qty(long value) {
		setConstNumber(offset + 28, $unit_qty, value);
	}

	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public void unit_qty(float value) {
		setConstNumber(offset + 28, $unit_qty, value);
	}

	/**
	 * 1 unit qty. １単位数量.<p>
	 *
	 */
	public void unit_qty(double value) {
		setConstNumber(offset + 28, $unit_qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 29, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 29, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 30, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 30, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 31, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 31, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 31, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 31, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 31, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 31, $dec_place, value);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 32, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 32, $term, value);
	}


	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 33, $std_qty);
	}

	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 33, $std_qty, value);
	}

	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 33, $std_qty, value);
	}

	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 33, $std_qty, value);
	}

	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 33, $std_qty, value);
	}

	/**
	 * Quantity per term 期別数量.<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 33, $std_qty, value);
	}


	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 34, $std_upri);
	}

	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 34, $std_upri, value);
	}

	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 34, $std_upri, value);
	}

	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 34, $std_upri, value);
	}

	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 34, $std_upri, value);
	}

	/**
	 * Standard unit cost by period 期別標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 34, $std_upri, value);
	}


	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public MCNumber unit_upri() {
		return getConstNumber(offset + 35, $unit_upri);
	}

	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public void unit_upri(MCNumber value) {
		setConstNumber(offset + 35, $unit_upri, value);
	}

	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public void unit_upri(int value) {
		setConstNumber(offset + 35, $unit_upri, value);
	}

	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public void unit_upri(long value) {
		setConstNumber(offset + 35, $unit_upri, value);
	}

	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public void unit_upri(float value) {
		setConstNumber(offset + 35, $unit_upri, value);
	}

	/**
	 * 1 unit standard unit cost １単位標準単価.<p>
	 *
	 */
	public void unit_upri(double value) {
		setConstNumber(offset + 35, $unit_upri, value);
	}


	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public MCNumber unit_diff() {
		return getConstNumber(offset + 36, $unit_diff);
	}

	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public void unit_diff(MCNumber value) {
		setConstNumber(offset + 36, $unit_diff, value);
	}

	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public void unit_diff(int value) {
		setConstNumber(offset + 36, $unit_diff, value);
	}

	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public void unit_diff(long value) {
		setConstNumber(offset + 36, $unit_diff, value);
	}

	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public void unit_diff(float value) {
		setConstNumber(offset + 36, $unit_diff, value);
	}

	/**
	 * 1 unit per unit difference １単位単価差.<p>
	 *
	 */
	public void unit_diff(double value) {
		setConstNumber(offset + 36, $unit_diff, value);
	}


	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public MCNumber base_upri() {
		return getConstNumber(offset + 37, $base_upri);
	}

	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public void base_upri(MCNumber value) {
		setConstNumber(offset + 37, $base_upri, value);
	}

	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public void base_upri(int value) {
		setConstNumber(offset + 37, $base_upri, value);
	}

	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public void base_upri(long value) {
		setConstNumber(offset + 37, $base_upri, value);
	}

	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public void base_upri(float value) {
		setConstNumber(offset + 37, $base_upri, value);
	}

	/**
	 * Base unit cost per base qty. 基準数単位標準単価.<p>
	 *
	 */
	public void base_upri(double value) {
		setConstNumber(offset + 37, $base_upri, value);
	}


	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public MCNumber base_diff() {
		return getConstNumber(offset + 38, $base_diff);
	}

	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public void base_diff(MCNumber value) {
		setConstNumber(offset + 38, $base_diff, value);
	}

	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public void base_diff(int value) {
		setConstNumber(offset + 38, $base_diff, value);
	}

	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public void base_diff(long value) {
		setConstNumber(offset + 38, $base_diff, value);
	}

	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public void base_diff(float value) {
		setConstNumber(offset + 38, $base_diff, value);
	}

	/**
	 * Price variance per base qty. 基準数単位単価差.<p>
	 *
	 */
	public void base_diff(double value) {
		setConstNumber(offset + 38, $base_diff, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber inc_per() {
		return getConstNumber(offset + 39, $inc_per);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void inc_per(MCNumber value) {
		setConstNumber(offset + 39, $inc_per, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void inc_per(int value) {
		setConstNumber(offset + 39, $inc_per, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void inc_per(long value) {
		setConstNumber(offset + 39, $inc_per, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void inc_per(float value) {
		setConstNumber(offset + 39, $inc_per, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void inc_per(double value) {
		setConstNumber(offset + 39, $inc_per, value);
	}


	public String getString(String name) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			return unit_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			return unit_upri();
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			return unit_diff();
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			return base_upri();
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			return base_diff();
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			return inc_per();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			return unit_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			return unit_upri();
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			return unit_diff();
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			return base_upri();
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			return base_diff();
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			return inc_per();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($unit_qty.equalsIgnoreCase(name)) {
			unit_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($unit_upri.equalsIgnoreCase(name)) {
			unit_upri(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($base_upri.equalsIgnoreCase(name)) {
			base_upri(value);
			return;
		}
		if ($base_diff.equalsIgnoreCase(name)) {
			base_diff(value);
			return;
		}
		if ($inc_per.equalsIgnoreCase(name)) {
			inc_per(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

