package mcframe.serverMBBA.MBBAL5020;

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
 * ブロック"AprvAfter_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AprvAfter_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type before change 変更前承認状況区分.<p>
	 *
	 */
	public static final String $old_aprv_sts_typ = "old_aprv_sts_typ";
	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public static final String $last_aprv_usr_cd = "last_aprv_usr_cd";
	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public static final String $last_aprv_tm = "last_aprv_tm";
	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public static final String $src_itm_cd = "src_itm_cd";
	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public static final String $src_itm_sub1 = "src_itm_sub1";
	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public static final String $src_itm_sub2 = "src_itm_sub2";
	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public static final String $src_itm_sub3 = "src_itm_sub3";
	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public static final String $src_bp_cd = "src_bp_cd";
	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public static final String $src_cur_cd1 = "src_cur_cd1";
	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public static final String $src_amt1 = "src_amt1";
	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public static final String $src_cur_cd2 = "src_cur_cd2";
	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public static final String $src_amt2 = "src_amt2";
	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public static final String $src_cur_cd3 = "src_cur_cd3";
	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public static final String $src_amt3 = "src_amt3";
	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public static final String $src_ext_key1 = "src_ext_key1";
	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public static final String $src_ext_key2 = "src_ext_key2";
	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public static final String $src_ext_key3 = "src_ext_key3";
	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public static final String $aprv_src_no1 = "aprv_src_no1";
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public static final String $aprv_src_no2 = "aprv_src_no2";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta old_aprv_sts_typ_META = createCommonMeta($old_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta last_aprv_usr_cd_META = createCommonMeta($last_aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta last_aprv_tm_META = createCommonMeta($last_aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta src_itm_cd_META = createCommonMeta($src_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta src_itm_sub1_META = createCommonMeta($src_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta src_itm_sub2_META = createCommonMeta($src_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta src_itm_sub3_META = createCommonMeta($src_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta src_bp_cd_META = createCommonMeta($src_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta src_cur_cd1_META = createCommonMeta($src_cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt1_META = createCommonMeta($src_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd2_META = createCommonMeta($src_cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt2_META = createCommonMeta($src_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd3_META = createCommonMeta($src_cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_amt3_META = createCommonMeta($src_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_ext_key1_META = createCommonMeta($src_ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta src_ext_key2_META = createCommonMeta($src_ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta src_ext_key3_META = createCommonMeta($src_ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
	public static final MCMeta aprv_src_no1_META = createCommonMeta($aprv_src_no1, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_src_no2_META = createCommonMeta($aprv_src_no2, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AprvAfter_Upd01_CndR> constMetas = new ConstMetaList<AprvAfter_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_no_META,
			aprv_sts_typ_META,
			old_aprv_sts_typ_META,
			last_aprv_usr_cd_META,
			last_aprv_tm_META,
			src_itm_cd_META,
			src_itm_sub1_META,
			src_itm_sub2_META,
			src_itm_sub3_META,
			src_dpt_cd_META,
			src_bp_cd_META,
			src_cur_cd1_META,
			src_amt1_META,
			src_cur_cd2_META,
			src_amt2_META,
			src_cur_cd3_META,
			src_amt3_META,
			src_ext_key1_META,
			src_ext_key2_META,
			src_ext_key3_META,
			aprv_src_no1_META,
			aprv_src_no2_META,
			peg_no_META,
			err_flg_META
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
	protected AprvAfter_Upd01_CndR_MC_A(ConstMetaList<? extends AprvAfter_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AprvAfter_Upd01_CndR clone() {
		return (AprvAfter_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AprvAfter_Upd01_CndR createInstance() {
		return (AprvAfter_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AprvAfter_Upd01_CndR getValues(String... names) {
		return (AprvAfter_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 0, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 0, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 1, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 1, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type before change 変更前承認状況区分.<p>
	 *
	 */
	public String old_aprv_sts_typ() {
		return getConstString(offset + 2, $old_aprv_sts_typ);
	}

	/**
	 * Approval status type before change 変更前承認状況区分.<p>
	 *
	 */
	public void old_aprv_sts_typ(String value) {
		setConstString(offset + 2, $old_aprv_sts_typ, value);
	}


	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public String last_aprv_usr_cd() {
		return getConstString(offset + 3, $last_aprv_usr_cd);
	}

	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public void last_aprv_usr_cd(String value) {
		setConstString(offset + 3, $last_aprv_usr_cd, value);
	}


	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public MCDate last_aprv_tm() {
		return getConstDate(offset + 4, $last_aprv_tm);
	}

	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public void last_aprv_tm(MCDate value) {
		setConstDate(offset + 4, $last_aprv_tm, value);
	}


	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public String src_itm_cd() {
		return getConstString(offset + 5, $src_itm_cd);
	}

	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public void src_itm_cd(String value) {
		setConstString(offset + 5, $src_itm_cd, value);
	}


	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public String src_itm_sub1() {
		return getConstString(offset + 6, $src_itm_sub1);
	}

	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public void src_itm_sub1(String value) {
		setConstString(offset + 6, $src_itm_sub1, value);
	}


	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public String src_itm_sub2() {
		return getConstString(offset + 7, $src_itm_sub2);
	}

	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public void src_itm_sub2(String value) {
		setConstString(offset + 7, $src_itm_sub2, value);
	}


	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public String src_itm_sub3() {
		return getConstString(offset + 8, $src_itm_sub3);
	}

	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public void src_itm_sub3(String value) {
		setConstString(offset + 8, $src_itm_sub3, value);
	}


	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 9, $src_dpt_cd);
	}

	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 9, $src_dpt_cd, value);
	}


	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public String src_bp_cd() {
		return getConstString(offset + 10, $src_bp_cd);
	}

	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public void src_bp_cd(String value) {
		setConstString(offset + 10, $src_bp_cd, value);
	}


	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public String src_cur_cd1() {
		return getConstString(offset + 11, $src_cur_cd1);
	}

	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public void src_cur_cd1(String value) {
		setConstString(offset + 11, $src_cur_cd1, value);
	}


	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public MCNumber src_amt1() {
		return getConstNumber(offset + 12, $src_amt1);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(MCNumber value) {
		setConstNumber(offset + 12, $src_amt1, value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(int value) {
		setConstNumber(offset + 12, $src_amt1, value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(long value) {
		setConstNumber(offset + 12, $src_amt1, value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(float value) {
		setConstNumber(offset + 12, $src_amt1, value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(double value) {
		setConstNumber(offset + 12, $src_amt1, value);
	}


	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public String src_cur_cd2() {
		return getConstString(offset + 13, $src_cur_cd2);
	}

	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public void src_cur_cd2(String value) {
		setConstString(offset + 13, $src_cur_cd2, value);
	}


	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public MCNumber src_amt2() {
		return getConstNumber(offset + 14, $src_amt2);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(MCNumber value) {
		setConstNumber(offset + 14, $src_amt2, value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(int value) {
		setConstNumber(offset + 14, $src_amt2, value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(long value) {
		setConstNumber(offset + 14, $src_amt2, value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(float value) {
		setConstNumber(offset + 14, $src_amt2, value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(double value) {
		setConstNumber(offset + 14, $src_amt2, value);
	}


	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public String src_cur_cd3() {
		return getConstString(offset + 15, $src_cur_cd3);
	}

	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public void src_cur_cd3(String value) {
		setConstString(offset + 15, $src_cur_cd3, value);
	}


	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public MCNumber src_amt3() {
		return getConstNumber(offset + 16, $src_amt3);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(MCNumber value) {
		setConstNumber(offset + 16, $src_amt3, value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(int value) {
		setConstNumber(offset + 16, $src_amt3, value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(long value) {
		setConstNumber(offset + 16, $src_amt3, value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(float value) {
		setConstNumber(offset + 16, $src_amt3, value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(double value) {
		setConstNumber(offset + 16, $src_amt3, value);
	}


	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public String src_ext_key1() {
		return getConstString(offset + 17, $src_ext_key1);
	}

	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public void src_ext_key1(String value) {
		setConstString(offset + 17, $src_ext_key1, value);
	}


	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public String src_ext_key2() {
		return getConstString(offset + 18, $src_ext_key2);
	}

	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public void src_ext_key2(String value) {
		setConstString(offset + 18, $src_ext_key2, value);
	}


	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public String src_ext_key3() {
		return getConstString(offset + 19, $src_ext_key3);
	}

	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public void src_ext_key3(String value) {
		setConstString(offset + 19, $src_ext_key3, value);
	}


	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public String aprv_src_no1() {
		return getConstString(offset + 20, $aprv_src_no1);
	}

	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public void aprv_src_no1(String value) {
		setConstString(offset + 20, $aprv_src_no1, value);
	}


	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public String aprv_src_no2() {
		return getConstString(offset + 21, $aprv_src_no2);
	}

	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public void aprv_src_no2(String value) {
		setConstString(offset + 21, $aprv_src_no2, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 22, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 22, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 22, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 22, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 22, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 22, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 23, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 23, $err_flg, value);
	}


	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
			return;
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
			return;
		}
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

