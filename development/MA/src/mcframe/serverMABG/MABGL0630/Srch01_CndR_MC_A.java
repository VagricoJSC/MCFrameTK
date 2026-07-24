package mcframe.serverMABG.MABGL0630;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_dt_fr = "st_dt_fr";
	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public static final String $st_dt_to = "st_dt_to";
	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_dt_fr = "end_dt_fr";
	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public static final String $end_dt_to = "end_dt_to";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $xpns_itm_cd = "xpns_itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $xpns_itm_sub1 = "xpns_itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $xpns_itm_sub2 = "xpns_itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $xpns_itm_sub3 = "xpns_itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $xpns_itm_nm = "xpns_itm_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Allocation account group 1 配賦科目グループ１.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	/**
	 * Allocation account group 2 配賦科目グループ２.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	/**
	 * Allocation account group 3 配賦科目グループ３.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	/**
	 * Logical delete flg. (Off) 論理削除ＦＬＧ（オフ）.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete flg. (On) 論理削除ＦＬＧ（オン）.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";


	public static final MCMeta st_dt_fr_META = createCommonMeta($st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_dt_to_META = createCommonMeta($st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_fr_META = createCommonMeta($end_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_to_META = createCommonMeta($end_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta xpns_itm_cd_META = createCommonMeta($xpns_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta xpns_itm_sub1_META = createCommonMeta($xpns_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta xpns_itm_sub2_META = createCommonMeta($xpns_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta xpns_itm_sub3_META = createCommonMeta($xpns_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta xpns_itm_nm_META = createCommonMeta($xpns_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_fr_META,
			st_dt_to_META,
			end_dt_fr_META,
			end_dt_to_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			xpns_itm_cd_META,
			xpns_itm_sub1_META,
			xpns_itm_sub2_META,
			xpns_itm_sub3_META,
			xpns_itm_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_cd3_META,
			off_del_flg_META,
			on_del_flg_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_dt_fr() {
		return getConstDate(offset + 0, $st_dt_fr);
	}

	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public void st_dt_fr(MCDate value) {
		setConstDate(offset + 0, $st_dt_fr, value);
	}


	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public MCDate st_dt_to() {
		return getConstDate(offset + 1, $st_dt_to);
	}

	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public void st_dt_to(MCDate value) {
		setConstDate(offset + 1, $st_dt_to, value);
	}


	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_dt_fr() {
		return getConstDate(offset + 2, $end_dt_fr);
	}

	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public void end_dt_fr(MCDate value) {
		setConstDate(offset + 2, $end_dt_fr, value);
	}


	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public MCDate end_dt_to() {
		return getConstDate(offset + 3, $end_dt_to);
	}

	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public void end_dt_to(MCDate value) {
		setConstDate(offset + 3, $end_dt_to, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 4, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 4, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 5, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 5, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 8, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 8, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String xpns_itm_cd() {
		return getConstString(offset + 11, $xpns_itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void xpns_itm_cd(String value) {
		setConstString(offset + 11, $xpns_itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String xpns_itm_sub1() {
		return getConstString(offset + 12, $xpns_itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void xpns_itm_sub1(String value) {
		setConstString(offset + 12, $xpns_itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String xpns_itm_sub2() {
		return getConstString(offset + 13, $xpns_itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void xpns_itm_sub2(String value) {
		setConstString(offset + 13, $xpns_itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String xpns_itm_sub3() {
		return getConstString(offset + 14, $xpns_itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void xpns_itm_sub3(String value) {
		setConstString(offset + 14, $xpns_itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String xpns_itm_nm() {
		return getConstString(offset + 15, $xpns_itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void xpns_itm_nm(String value) {
		setConstString(offset + 15, $xpns_itm_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 16, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 16, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 17, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 17, $ac_rsn_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 18, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 18, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 19, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 19, $alc_ac_nm, value);
	}


	/**
	 * Allocation account group 1 配賦科目グループ１.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 20, $alc_ac_grp_cd1);
	}

	/**
	 * Allocation account group 1 配賦科目グループ１.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 20, $alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation account group 2 配賦科目グループ２.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 21, $alc_ac_grp_cd2);
	}

	/**
	 * Allocation account group 2 配賦科目グループ２.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 21, $alc_ac_grp_cd2, value);
	}


	/**
	 * Allocation account group 3 配賦科目グループ３.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 22, $alc_ac_grp_cd3);
	}

	/**
	 * Allocation account group 3 配賦科目グループ３.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 22, $alc_ac_grp_cd3, value);
	}


	/**
	 * Logical delete flg. (Off) 論理削除ＦＬＧ（オフ）.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 23, $off_del_flg);
	}

	/**
	 * Logical delete flg. (Off) 論理削除ＦＬＧ（オフ）.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 23, $off_del_flg, value);
	}


	/**
	 * Logical delete flg. (On) 論理削除ＦＬＧ（オン）.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 24, $on_del_flg);
	}

	/**
	 * Logical delete flg. (On) 論理削除ＦＬＧ（オン）.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 24, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}


	public String getString(String name) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

